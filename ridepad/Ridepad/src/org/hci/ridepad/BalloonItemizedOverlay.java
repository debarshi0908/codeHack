package org.hci.ridepad;

import java.util.List;

import android.graphics.drawable.Drawable;
import android.view.View;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;
import android.view.ViewGroup.LayoutParams;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;

public abstract class BalloonItemizedOverlay<Item extends OverlayItem> extends ItemizedOverlay<Item>{

	
	private BalloonOverlayView<Item> ballonView;
	private MapView mapView;
	private BalloonOverlayView<Item> balloonView;
	private View clickRegion;
	private int viewOffset;
	final MapController mc;
	private Item currentFocussedItem;
	private int currentFocussedIndex;

	
	public BalloonItemizedOverlay(Drawable defaultMarker, MapView mapView) {
		super(defaultMarker);
		this.mapView = mapView;
		viewOffset = 0;
		mc = mapView.getController();
	}
	
	public void setBalloonBottomOffset(int pixels) {
		viewOffset = pixels;
	}
	public int getBalloonBottomOffset() {
		return viewOffset;
	}
	
	@Override
	protected final boolean onTap(int index) {

		currentFocussedIndex = index;
		currentFocussedItem = createItem(index);

		createAndDisplayBalloonOverlay();

		mc.animateTo(currentFocussedItem.getPoint());

		return true;
	}
	
	protected BalloonOverlayView<Item> createBalloonOverlayView() {
		return new BalloonOverlayView<Item>(getMapView().getContext(), getBalloonBottomOffset());
	}
	
	protected MapView getMapView() {
		return mapView;
	}

	protected void hideBalloon() {
		if (balloonView != null) {
			balloonView.setVisibility(View.GONE);
		}
	}
	
	private void hideOtherBalloons(List<Overlay> overlays) {

		for (Overlay overlay : overlays) {
			if (overlay instanceof BalloonItemizedOverlay<?> && overlay != this) {
				((BalloonItemizedOverlay<?>) overlay).hideBalloon();
			}
		}

	}
	
	private OnTouchListener createBalloonTouchListener() {
		return new OnTouchListener() {

			float startX;
			float startY;

			public boolean onTouch(View v, MotionEvent event) {

				View l =  ((View) v.getParent()).findViewById(R.id.balloon_main_layout);
				Drawable d = l.getBackground();

				if (event.getAction() == MotionEvent.ACTION_DOWN) {
					int[] states = {android.R.attr.state_pressed};
					if (d.setState(states)) {
						d.invalidateSelf();
					}
					startX = event.getX();
					startY = event.getY();
					return true;
				} else if (event.getAction() == MotionEvent.ACTION_UP) {
					int newStates[] = {};
					if (d.setState(newStates)) {
						d.invalidateSelf();
					}
					if (Math.abs(startX - event.getX()) < 40 && 
							Math.abs(startY - event.getY()) < 40 ) {
						// call overridden method
						onBalloonTap(currentFocussedIndex, currentFocussedItem);
					}
					return true;
				} else {
					return false;
				}

			}
		};
	}
	
	@Override
	public Item getFocus() {
		return currentFocussedItem;
	}

	@Override
	public void setFocus(Item item) {
		currentFocussedItem = item;

		if (currentFocussedItem == null){
			hideBalloon();
		}
		else{
			createAndDisplayBalloonOverlay();
		}	
	}

	private boolean createAndDisplayBalloonOverlay(){
		boolean isRecycled;
		if (balloonView == null) {
			balloonView = createBalloonOverlayView();
			clickRegion = (View) balloonView.findViewById(R.id.balloon_inner_layout);
			clickRegion.setOnTouchListener(createBalloonTouchListener());
			isRecycled = false;
		} else {
			isRecycled = true;
		}

		balloonView.setVisibility(View.GONE);

		List<Overlay> mapOverlays = mapView.getOverlays();
		if (mapOverlays.size() > 1) {
			hideOtherBalloons(mapOverlays);
		}

		if (currentFocussedItem != null)
			balloonView.setData(currentFocussedItem);

		GeoPoint point = currentFocussedItem.getPoint();
		MapView.LayoutParams params = new MapView.LayoutParams(
				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, point,
				MapView.LayoutParams.BOTTOM_CENTER);
		params.mode = MapView.LayoutParams.MODE_MAP;

		balloonView.setVisibility(View.VISIBLE);

		if (isRecycled) {
			balloonView.setLayoutParams(params);
		} else {
			mapView.addView(balloonView, params);
		}

		return isRecycled;
	}

	

	protected boolean onBalloonTap(int index, Item item) {
			return false;
	}

}
