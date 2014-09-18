package org.hci.ridepad;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class HomeItemAdapter extends ArrayAdapter<HomeItem> {

	private int layoutResource;

	public HomeItemAdapter(Context context, int textViewResourceId,
			ArrayList<HomeItem> items) {
		super(context, textViewResourceId, items);
		this.layoutResource = textViewResourceId;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		HomeItem item = getItem(position);

		if (item == null)
			return null;

		LayoutInflater inflater = (LayoutInflater) getContext()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view;
		if (convertView == null)
			view = inflater.inflate(layoutResource, parent, false);
		else
			view = convertView;

		RelativeLayout background = (RelativeLayout) view
				.findViewById(R.id.HomeListItemRelativeLayout);
		ImageView icon = (ImageView) view
				.findViewById(R.id.HomeListItemImageView);
		ImageView arrow = (ImageView) view
		.findViewById(R.id.HomeListItemImageView2);
		TextView text = (TextView) view.findViewById(R.id.HomeListItemTextView);
		RelativeLayout seperatorBackground = (RelativeLayout) view
				.findViewById(R.id.HomeListItemRelativeLayoutSeperator);
		TextView seperator = (TextView) view
				.findViewById(R.id.HomeListItemTesxtViewSeperator);

		if (item.isSeperator()) {
			if (seperator != null) {
				seperatorBackground.setVisibility(View.VISIBLE);
				background.setVisibility(View.GONE);
				if (seperator != null)
					seperator.setText(item.getItemName());
			}
		} else {
			seperatorBackground.setVisibility(View.GONE);
			background.setVisibility(View.VISIBLE);
			if (icon != null)
				icon.setImageResource(item.getIconId());
			if (text != null){
				text.setText(item.getItemName());
				text.setTextColor(Color.rgb(102, 255, 51));
			}
			if (arrow != null)
				arrow.setImageResource(item.getArrow());
		
			
			
		}

		return view;
	}

	@Override
	public int getItemViewType(int position) {
		HomeItem item = getItem(position);
		int type;
		if (item.isSeperator())
			type = 1;
		else
			type = 0;

		return type;
	}

	@Override
	public int getViewTypeCount() {
		// return number of types of views the adapter can return
		return 2;
	}

	@Override
	public boolean isEnabled(int position) {
		HomeItem item = getItem(position);
		if (item.isSeperator())
			return false;
		else
			return true;
	}

}