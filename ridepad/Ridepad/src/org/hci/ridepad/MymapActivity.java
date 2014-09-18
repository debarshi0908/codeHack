package org.hci.ridepad;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

import org.hci.ridepad.R;
import org.ridepad.ext.Item;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MymapActivity extends MapActivity implements  LocationListener{
    /** Called when the activity is first created. */
	MapView mapView;
	MapController mc;
	GeoPoint p;
	private Road mRoad;
	List<Overlay> mapOverlays;
	Drawable drawable;
	Drawable drawable2;
	MyItemizedOverlay itemizedOverlay;
	MyItemizedOverlay itemizedOverlay2;
	
	GeoPoint p2;
	GeoPoint p3;
	
	Double lat,lng, lat2,lng2, lat3,lng3;
	
	GeoPoint[] marks;
	RPPoint[] rp;
	Road[] roads;
	
	List tbl = new ArrayList();
	
	int routelength = 1;
	
	//private LocationManager lm;
	//private LocationListener locationListener;
	
	double currentLat = 33.1213618;
	double currentLon = -87.5680106;
	double totlemiles = 0;
	
	public class MapOverlay extends Overlay {

		
		
		@Override
		public boolean draw(Canvas canvas, MapView mapView, boolean shadow, long when){
			super.draw(canvas, mapView, shadow);
			
			double totalMile = 0;
			
			Paint paint = new Paint();
			paint.setColor(Color.RED);
			paint.setStyle(Paint.Style.FILL_AND_STROKE);
			paint.setStrokeJoin(Paint.Join.ROUND);
			paint.setStrokeCap(Paint.Cap.ROUND);
			paint.setStrokeWidth(2);
			
			Paint paint2 = new Paint();
			paint2.setColor(Color.BLACK);
			paint2.setStyle(Paint.Style.FILL);
			paint2.setStrokeWidth(1);
			
			Paint paint3 = new Paint();
			paint3.setColor(Color.BLUE);
			paint3.setStyle(Paint.Style.FILL_AND_STROKE);
			paint3.setStrokeJoin(Paint.Join.ROUND);
			paint3.setStrokeCap(Paint.Cap.ROUND);
			paint3.setStrokeWidth(2);
			
			
			for(int y =0; y < marks.length;y++){
				Point screenPts = new Point();
				
				//Current Location
				marks[0] = new GeoPoint((int) (currentLat * 1E6), (int) (currentLon * 1E6));
				
				//System.out.println(marks.length+" Location -------------------------"+marks[y].getLatitudeE6()+"-----------------------"+marks[y].getLongitudeE6());
				
				mapView.getProjection().toPixels(marks[y], screenPts);
				
				
				//Driver
				if(y==0){
					canvas.drawCircle(screenPts.x, screenPts.y, 5, paint);
					canvas.drawText("Me", screenPts.x, screenPts.y, paint2);
				}else if(y == marks.length-1){
					paint.setColor(Color.GREEN);
					//canvas.drawCircle(screenPts.x, screenPts.y, 5, paint);
					canvas.drawText((String)tbl.get(y-1), screenPts.x, screenPts.y, paint2);
				}else{
					//canvas.drawCircle(screenPts.x, screenPts.y, 5, paint);
					canvas.drawText((String)tbl.get(y-1), screenPts.x, screenPts.y, paint2);
				}
			}
			
	
			for(int z = 0; z < routelength - 1; z++)
			{
				//System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				List<RPPoint> list = new ArrayList<RPPoint>();
				for(int i=0;i < roads[z].mRoute.length;i++)
				{
					for(int j = 0;j < roads[z].mRoute[i].length - 1;j++)
					{
						//System.out.println(mRoad.mRoute[i][j+1] + " "+mRoad.mRoute[i][j]);
						Point ap  = new Point();
						RPPoint p = new RPPoint();
						GeoPoint gp = new GeoPoint((int) (roads[z].mRoute[i][j+1] * 1E6), (int) (roads[z].mRoute[i][j] * 1E6));
						mapView.getProjection().toPixels(gp, ap);
						p.x = ap.x;
						p.y = ap.y;
						p.lat = roads[z].mRoute[i][j+1];
						p.lng = roads[z].mRoute[i][j];
						list.add(p);
						
						//System.out.println("Routes "+mRoad.mRoute.length);
					}
				}
				
				for(int i=0;i<list.size()-1;i++)
				{
					RPPoint a1 = list.get(i);
					RPPoint a2 = list.get(i+1);
					if(  z != rp.length-2){
					//	paint.setColor(Color.GREEN);
						paint.setColor(Color.BLUE);
						
					}else{
						paint.setColor(Color.BLUE);
					}
					
					canvas.drawLine((float)a1.x,(float)a1.y,(float)a2.x,(float)a2.y,paint);
					
					Location loc1 = new Location("loc1");
					loc1.setLatitude(a1.lat);
					loc1.setLongitude(a1.lng);
					
					Location loc2 = new Location("loc2");
					loc2.setLatitude(a2.lat);
					loc2.setLongitude(a2.lng);
					
					double distance = loc1.distanceTo(loc2);
					//double distance = distFrom(a1.x,a1.y,a2.x,a2.y);
					totalMile = totalMile + distance;
				//	System.out.println("Distance from "+a1.lat+","+a1.lng+" to "+a2.lat+","+a2.lng+" : "+(distance/1609.344));
					
				}
			//	System.out.println("Total Mile "+(totalMile/1609.344));
				
			}
		
		//canvas.drawText(totlemiles + " sMiles", 100, 100, paint);	
		//Toast.makeText(this, totalMile + " Miles", Toast.LENGTH_LONG);
		return true;
			
			
		}
	}
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.map_menu, menu);
        return true;
    }
	
	  @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	    	
			// Intent mainIntent=new
			// Intent().setClass(SplashActiapple@gmail.com	vity.this,RIDEPADActivity.class);
			
	        switch (item.getItemId()) {
	        
	            case R.id.map_refresh:     
	            	Intent mainIntent = new Intent().setClass(MymapActivity.this, MymapActivity.class);
	          	startActivity(mainIntent);
	                 break;             
	            case R.id.map_logout:     Toast.makeText(this, "My ride", Toast.LENGTH_LONG).show();
	            	Intent mainIntent1 = new Intent().setClass(MymapActivity.this, MyRideActivity.class);
	            	startActivity(mainIntent1);
	                                break;
	         //   case R.id.icontext: Toast.makeText(this, "You pressed the icon and text!", Toast.LENGTH_LONG).show();
	           //                     break;
	        }
	        return true;
	    }
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.mainmap);
    
        
        //Use GPS
        LocationManager mlocManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        mlocManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0,this);
        
        mapView = (MapView) findViewById(R.id.mapView);
        mapView.setBuiltInZoomControls(true);
        mapOverlays = mapView.getOverlays();
        
        //mapView.setStreetView(true);
        
        mc = mapView.getController();
        
        
      //  rp = new RPPoint[4];
        
        String[] frinds = getFriends();
        rp = new RPPoint[frinds.length+1];
        
        
       // System.out.println("Friend Length -------------------------------------"+frinds.length);
        String tmp = getLocation(UserSession.USEREMAIL);
        String[] loctmp = tmp.split("&");
        String lattmp = loctmp[0];
        String lngtmp = loctmp[1];
        currentLat = Double.parseDouble(lattmp);
        currentLon = Double.parseDouble(lngtmp);
        
        rp[0] = new RPPoint();
        rp[0].lat = currentLat;
        rp[0].lng = currentLon;
    //    rp[0].lat = currentLat;
    //    rp[0].lng = currentLon;
        
        //first overlay
        drawable = getResources().getDrawable(R.drawable.n_marker);
        drawable2 = getResources().getDrawable(R.drawable.n_marker2);
		
        itemizedOverlay = new MyItemizedOverlay(drawable, mapView);
        itemizedOverlay2 = new MyItemizedOverlay(drawable2, mapView);
		

		
		///mapOverlays.add(itemizedOverlay);
        
        for(int i=0;i<frinds.length;i++){
        	String email = frinds[i];
        //	if(UserSession.FRIENDS_ACCEPTANCE.contains(email)){
        		String loc = getLocation(email);
            	String[] location = loc.split("&");
            	String lat = location[0];
            	String lng = location[1];
            	System.out.println("Friend: "+ i +" ----------------:"+email+"---------------------"+lat+"----------- "+lng);
            	 routelength++;
            	try{
            		rp[i+1] = new RPPoint();
            		rp[i+1].lat = Double.parseDouble(lat);
                	rp[i+1].lng = Double.parseDouble(lng);
            	}catch(Exception e){
            		//rp[i+1].lat = 33.1213618;
            		//rp[i+1].lng = -87.5680106;
            		e.printStackTrace();
            	}
        //	}    	
        }
   /*     
        rp[1] = new RPPoint();
        rp[1].lat = 33.1213618;
        rp[1].lng = -87.5680106;
        
        rp[2] = new RPPoint();
        rp[2].lat = 33.2085132872266;
        rp[2].lng = -87.5529670715332;
        
        rp[3] = new RPPoint();
        rp[3].lat = 33.2364;
        rp[3].lng = -87.614482;
   */     
        //int nmarks = rp.length;
        
        System.out.println("router length *************************************"+routelength);
        marks = new GeoPoint[routelength];
        
        for(int i=0;i<rp.length;i++){
        	try{
        		 marks[i] = new GeoPoint((int) (rp[i].lat * 1E6), (int) (rp[i].lng * 1E6));
        	}catch(Exception e){e.printStackTrace();}
        	
        }
      
        
        mc.animateTo(marks[0]);
  //      mc.animateTo(marks[1]);
  //      mc.animateTo(marks[2]);
        mc.setZoom(14);
    
      /*  MapOverlay mapOverlay = new MapOverlay();
        List<Overlay> listOfOverlays = mapView.getOverlays();
        listOfOverlays.clear();
        listOfOverlays.add(mapOverlay);
        mapView.invalidate();*/
        
       
      
        
        roads = new Road[rp.length];
        
        for(int i=0; i<rp.length-1; i++)
        {
        	try{
        		String url = RoadProvider.getUrl(rp[i].lat,rp[i].lng,rp[i+1].lat,rp[i+1].lng);
         		InputStream is = getConnection(url);
         		roads[i] = RoadProvider.getRoute(is);
        	}catch(Exception e){
        		
        	}
        
     		
        }
        mHandler.sendEmptyMessage(0);
       
      
        
   /*     new Thread(){
        	@Override
        	public void run(){
        		String url = RoadProvider.getUrl(lat,lng,lat2,lng2);
        		//System.out.println(url);
        		InputStream is = getConnection(url);
        		mRoad = RoadProvider.getRoute(is);
        		mHandler.sendEmptyMessage(0);
        	}
        	
        }.start();
        
    */    
           
    }
	
    Handler mHandler = new Handler(){
    	public void handleMessage(android.os.Message msg){
    		  //--Add a location marker ---
            MapOverlay mapOverlay = new MapOverlay();
            List<Overlay> listOfOverlays = mapView.getOverlays();
            listOfOverlays.clear();
            String place = getLatestPlace();
            if(rp.length > 0){
            	for(int i=0;i<rp.length;i++){
	            	GeoPoint point = new GeoPoint((int)(rp[i].lat * 1E6),(int)(rp[i].lng * 1E6));
	            	
	        		
	        		if(i==0){
	        			OverlayItem overlayItem = new OverlayItem(point, "Me", place);
	        			itemizedOverlay.addOverlay(overlayItem);	
	        			listOfOverlays.add(itemizedOverlay);
	        		}else{
	        			String name = (String)tbl.get(i-1);
	        			OverlayItem overlayItem = new OverlayItem(point, name, place);
	        			itemizedOverlay2.addOverlay(overlayItem);
	        			listOfOverlays.add(itemizedOverlay2);
	        		}
	        		
            	} 	
            }
           
            listOfOverlays.add(mapOverlay);
            mapView.invalidate();
    	};
    };
    
    
    
    private InputStream getConnection(String url){
    	InputStream is = null;
    	try{
    		URLConnection conn = new URL(url).openConnection();
    		is = conn.getInputStream();
    	}catch(MalformedURLException e){
    		e.printStackTrace();
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    	return is;
    }
    
    public boolean onKeyDown(int keyCode, KeyEvent event){
    	MapController mc = mapView.getController();
    	switch(keyCode){
    	case KeyEvent.KEYCODE_3:
    		mc.zoomIn();
    		break;
    	case KeyEvent.KEYCODE_1:
    		mc.zoomOut();
    		break;
    	}
    	return super.onKeyDown(keyCode, event);
    }
    
    @Override
    protected boolean isRouteDisplayed(){
    	return false;
    }
    

	@Override
	public void onLocationChanged(Location location) {
		
		double tmpLat = currentLat;
		double tmpLon = currentLon;
		currentLat = location.getLatitude();
		currentLon = location.getLongitude();
		
		if(tmpLat != 0){
			totlemiles += distFrom(tmpLat,tmpLon,currentLat, currentLon);
			UserSession.TOTALMILES = ""+totlemiles;
			Toast.makeText(this, ""+totlemiles +" Miles", Toast.LENGTH_LONG);
		}
		
		
		//System.out.println("Location++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ "+currentLat+" "+currentLon);
		
	}

	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
		
	}
	
	 public double distFrom(double lat1, double lng1, double lat2, double lng2) {
		    double earthRadius = 3958.75;
		    double dLat = Math.toRadians(lat2-lat1);
		    double dLng = Math.toRadians(lng2-lng1);
		    double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
		               Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
		               Math.sin(dLng/2) * Math.sin(dLng/2);
		    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		    double dist = earthRadius * c;

		    return dist;
	 }
	 
	 private String[] getFriends(){
		
		 String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/getfriendsmap";
			
		 XMLProcessor xml = new XMLProcessor();
		 RestClient client = new RestClient(url);
 		 client.addParam("email", UserSession.USEREMAIL); 
 		List<Item> list = new ArrayList<Item>();
 		 
 		 int size = 0;
 		try {
			client.execute(RestClient.GET);
			
			String response = client.getResponse().toString().trim();
			list = xml.convertToList(response);
			size = list.size();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		String[] ret = new String[size];
 		for(int i=0;i<size;i++){
 			Item item = (Item)list.get(i);
 			
 			String content = item.getEntry();
 			String[] cr = content.split("-");
 			ret[i] = cr[0];
 			tbl.add(cr[1]);
 			System.out.println("Friends ++++++++++++++++++++++++++++++++++++++++++++++++"+ret[i]);
 			
 		}
		return ret;	 
	 }
	 
	 private String getLatestPlace(){
		 
		 String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/getlatestplace";
		 String ret = ""; 
		 RestClient client = new RestClient(url);
 		 client.addParam("email", UserSession.USEREMAIL); 
 		
 		try {
			client.execute(RestClient.POST);
			ret = client.getResponse().toString().trim();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;	 
	 }
	 
	 private String getLocation(String email){
		 String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/getloc";
		 RestClient client = new RestClient(url);
		 client.addParam("email", email); 
		 String response = "";
		 try {
				client.execute(RestClient.GET);
				
				response = client.getResponse().toString().trim();
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 return response;
	 }
 
}