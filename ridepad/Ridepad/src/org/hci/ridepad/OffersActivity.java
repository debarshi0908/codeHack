package org.hci.ridepad;

import java.util.List;

import org.ridepad.ext.Item;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;


 public class OffersActivity extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState ) {
        
    	super.onCreate(savedInstanceState);
		setContentView(R.layout.current_offers);
		startActivity(new Intent( this, ListViewOffersRequests.class));
}
 }