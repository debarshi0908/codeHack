package org.hci.ridepad;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import java.util.List;

import org.json.JSONObject;
import org.ridepad.ext.Item;


 public class SettingsActivity extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState ) {
        
    	super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);
		
		
    }
}
