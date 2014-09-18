package org.hci.ridepad;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


 public class OfferRideActivity extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState ) {
        
    	super.onCreate(savedInstanceState);
		setContentView(R.layout.offer_ride);
	
    }
    
    public void offer_click(View view){
    	
    	String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/addoffer";
    	EditText req = (EditText) findViewById(R.id.offertxt);
    	
    	 RestClient client = new RestClient(url);
 		client.addParam("myemail", UserSession.USEREMAIL);
 		client.addParam("place", req.getText().toString());
    	
 		try {
 			if(req.getText().toString().trim().equals("")){
 				AlertDialog.Builder alertbox = new AlertDialog.Builder(this);
				alertbox.setNeutralButton("Ok",new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				});
				alertbox.setMessage("Please enter the destination.");
				alertbox.show();

 			}else{
 				client.execute(RestClient.POST);
 				String response = client.getResponse().toString().trim();
 		 		
 		 		System.out.println(response);
 		 		
 		 		if(response.equals(UserSession.OK))
 		 		{
 		 				//System.out.println("Pass!");
 		 				Intent i = new Intent(OfferRideActivity.this, MymapActivity.class);
 		 				startActivity(i);
 		 		}
 			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		
    } 
    
    public void request_click(View view){
    	String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/addrequest";
    	EditText req = (EditText) findViewById(R.id.offertxt);
    	
    	 RestClient client = new RestClient(url);
 		client.addParam("myemail", UserSession.USEREMAIL);
 		client.addParam("place", req.getText().toString());
    	
 		try {
 			if(req.getText().toString().trim().equals("")){
 				AlertDialog.Builder alertbox = new AlertDialog.Builder(this);
				alertbox.setNeutralButton("Ok",new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				});
				alertbox.setMessage("Please enter the destination.");
				alertbox.show();
 			}else{
 				client.execute(RestClient.POST);
 				String response = client.getResponse().toString().trim();
 		 		System.out.println(response);
 		 		
 		 		if(response.equals(UserSession.OK))
 		 		{
 		 			try{
 		 				//System.out.println("Pass!");
 		 				Intent i = new Intent(OfferRideActivity.this, MymapActivity.class);
 		 				startActivity(i);
 		 			}catch(Exception e){
 		 				e.printStackTrace();
 		 			}
 		 		}
 			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		
    }
}
