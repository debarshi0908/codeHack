package org.hci.ridepad;

import java.util.List;

import org.ridepad.ext.Item;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.Spinner;


 public class MyRideActivity extends Activity {
	 
	 String action = "";
	 
	 private String PREFS_MPG = "pref_mpg";
	 private String PREFS_PRICE = "pref_price";
	 private SharedPreferences pref;
	 
	 private String mpg;
	 private String price;
		
		private static final String PREFS_CAR = "MyPrefsCar";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState ) {
        
    	super.onCreate(savedInstanceState);
		setContentView(R.layout.myride);		
		
		TextView txtprice=(TextView)findViewById(R.id.txtprice);
		TextView txtmpg=(TextView)findViewById(R.id.txtmpg);
		TextView txtdis = (TextView) findViewById(R.id.txtdis);
		
		pref = getSharedPreferences(PREFS_CAR, MODE_PRIVATE);
		
		mpg = pref.getString(PREFS_MPG, null);
		price = pref.getString(PREFS_PRICE,null);
		
		if(mpg != null)
			txtmpg.setText(mpg);
		if(price != null)
			txtprice.setText(price);
		
		txtdis.setText(UserSession.TOTALMILES);
		
	//	EditText miles = (EditText) findViewById(R.id.txtmpg);
	//	miles.setText(UserSession.TOTALMILES);
	}

   // public void car_reset(View view){
    /*	EditText mpg =  (EditText) findViewById(R.id.mpgtxt);
    	EditText price = (EditText) findViewById(R.id.pricepgtxt);
    	EditText miles = (EditText) findViewById(R.id.milestxt);
    	EditText cost = (EditText) findViewById(R.id.txtcost);
    	
    	mpg.setText("");
    	price.setText("");
    	miles.setText("");
    	cost.setText("");
    }
    
    
    public void car_onclick(View view){
    	EditText mpg =  (EditText) findViewById(R.id.txtmpg);
    	EditText price = (EditText) findViewById(R.id.pricepgtxt);
    	EditText miles = (EditText) findViewById(R.id.milestxt);
    	EditText cost = (EditText) findViewById(R.id.txtcost);
    	
    	miles.setText(UserSession.TOTALMILES);
    	
    	double mpgval = Double.parseDouble(mpg.getText().toString());
    	double priceval = Double.parseDouble(price.getText().toString());
    	double totalmiles = Double.parseDouble(miles.getText().toString());
    	
    	double costval  = (totalmiles * priceval) / mpgval;
    	
    	cost.setText(""+costval);
    	
    }*/
    public void txtcost_onclick(View view)
	{
		Toast.makeText(getApplicationContext(), "The Total cost of the Trip Will be $100",
						Toast.LENGTH_LONG).show();		
	 
	}
    public void txtdis_onclick(View view)
	{
	 
	 final AlertDialog.Builder alert = new AlertDialog.Builder(this);
		final EditText input = new EditText(this);
		
		input.setText("");
		alert.setView(input);
		alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int whichButton) {
				String value = input.getText().toString().trim();
				TextView txtdis=(TextView)findViewById(R.id.txtdis);
				txtdis.setText(value);
				
				Toast.makeText(getApplicationContext(), value,
						Toast.LENGTH_SHORT).show();
				
			}
		});

		alert.setNegativeButton("Cancel",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int whichButton) {
						dialog.cancel();
					}
				});
		alert.show();
	 
	}
    public void txtprice_onclick(View view)
	{
	 
	 final AlertDialog.Builder alert = new AlertDialog.Builder(this);
		final EditText input = new EditText(this);
		
		input.setText("");
		alert.setView(input);
		alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int whichButton) {
				String value = input.getText().toString().trim();
				TextView txtprice=(TextView)findViewById(R.id.txtprice);
				txtprice.setText(value);
				getSharedPreferences(PREFS_CAR, MODE_PRIVATE).edit().putString(PREFS_PRICE,value).commit();
				
				Toast.makeText(getApplicationContext(), value,
						Toast.LENGTH_SHORT).show();
				
			}
		});

		alert.setNegativeButton("Cancel",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int whichButton) {
						dialog.cancel();
					}
				});
		alert.show();
	 
	}
    public void txtmpg_onclick(View view)
	{
	 
	 final AlertDialog.Builder alert = new AlertDialog.Builder(this);
		final EditText input = new EditText(this);
		
		input.setText("");
		alert.setView(input);
		alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int whichButton) {
				String value = input.getText().toString().trim();
				TextView txtmpg=(TextView)findViewById(R.id.txtmpg);
				txtmpg.setText(value);
				getSharedPreferences(PREFS_CAR, MODE_PRIVATE).edit().putString(PREFS_MPG,value).commit();
				Toast.makeText(getApplicationContext(), value,
						Toast.LENGTH_SHORT).show();
				
			}
		});

		alert.setNegativeButton("Cancel",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int whichButton) {
						dialog.cancel();
					}
				});
		alert.show();
	 
	}
    
    public void calculate_onclick(View view){
    	TextView txtprice=(TextView)findViewById(R.id.txtprice);
		TextView txtmpg=(TextView)findViewById(R.id.txtmpg);
		TextView txtdis = (TextView) findViewById(R.id.txtdis);
		TextView result = (TextView) findViewById(R.id.txtresultcal);
		
		
		String price = txtprice.getText().toString();
		String mpg = txtmpg.getText().toString();
		String dis = txtdis.getText().toString();
		double total = 0.0;
		
		try{
			Double p = Double.parseDouble(price);
			Double m  = Double.parseDouble(mpg);
			Double d = Double.parseDouble(dis);
			total = (p/m) * d;
		}catch(Exception e){
			
		}
		
		result.setText(""+total);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.myride_menu, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	
		// Intent mainIntent=new
		// Intent().setClass(SplashActiapple@gmail.com	vity.this,RIDEPADActivity.class);
		
        switch (item.getItemId()) {
        
            case R.id.ride_map:  Toast.makeText(this, "map", Toast.LENGTH_LONG).show();    
            	Intent mainIntent = new Intent().setClass(MyRideActivity.this, MymapActivity.class);
          	startActivity(mainIntent);
                 break;        
            case R.id.ride_home:  Toast.makeText(this, "home", Toast.LENGTH_LONG).show();    
        		Intent homeIntent = new Intent().setClass(MyRideActivity.this, RIDEPADActivity.class);
        		startActivity(homeIntent);
        		break;             
            case R.id.ride_reset:     Toast.makeText(this, "reset", Toast.LENGTH_LONG).show();
            	UserSession.TOTALMILES = "0";
            	TextView txtdis = (TextView) findViewById(R.id.txtdis);
            	TextView cost = (TextView) findViewById(R.id.txtresultcal);
            	
            	cost.setText("0");
            	txtdis.setText("0.0");
            //	Intent mainIntent1 = new Intent().setClass(MyRideActivity.this, MyRideActivity.class);
            //	startActivity(mainIntent1);
                                break;
         //   case R.id.icontext: Toast.makeText(this, "You pressed the icon and text!", Toast.LENGTH_LONG).show();
           //                     break;
        }
        return true;
    }
}