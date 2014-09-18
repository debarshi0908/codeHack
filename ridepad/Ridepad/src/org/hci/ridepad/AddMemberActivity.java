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
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import org.json.JSONObject;
import org.ridepad.ext.Item;


 public class AddMemberActivity extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState ) {
        
    	super.onCreate(savedInstanceState);
		setContentView(R.layout.addmember);
		
		
    }
    
    public void member_reset(View view){
    	EditText txtmail = (EditText) findViewById(R.id.txtemail);
    	txtmail.setText("");
    }
    
    public void invite_onclick(View view){
    	String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/invite";
    	
    	EditText txtmail = (EditText) findViewById(R.id.txtemail);
    	
         RestClient client = new RestClient(url);
 		 client.addParam("myemail", UserSession.USEREMAIL);
 		 client.addParam("friendemail", txtmail.getText().toString());
 		 
 		try {
			client.execute(RestClient.POST);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String response = client.getResponse().toString().trim();
		
		if(response.equals("Sucessfull!")){
			Toast.makeText(getApplicationContext(),"Your request was sent!",Toast.LENGTH_SHORT).show();
			Intent i = new Intent(AddMemberActivity.this, RIDEPADActivity.class);
			startActivity(i);
		}else if(response.equals("Fail")){
			AlertDialog.Builder alertbox = new AlertDialog.Builder(this);
			alertbox.setNeutralButton("Ok",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			});
			alertbox.setMessage("The e-mail was not found!!!");
			alertbox.show();
		}
	}
}
