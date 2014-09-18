package org.hci.ridepad;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AboutActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_activity);
		
		
	//	startActivity(new Intent( this, ListViewAccount.class));
	//	String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/getaddress";
		
	//	RestClient client = new RestClient(url);
	//	client.addParam("email", UserSession.USEREMAIL);
	//	try {
	//		client.execute(RestClient.GET);
	//	} catch (Exception e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
		
	//	String response = client.getResponse().toString().trim();
		
		
	//	System.out.println("##############"+str[0]+str[1]+str[2]+str[3]);
		
	/*	EditText streetxt = (EditText) findViewById(R.id.txtstreet);
		EditText citytxt = (EditText) findViewById(R.id.txtcity);
		EditText statetxt = (EditText) findViewById(R.id.txtstate);
		EditText ziptxt = (EditText) findViewById(R.id.txtzipcode);
		
		String[] str = response.split("@");
		if(str != null && str.length > 0){
			try{
				streetxt.setText(str[0]);
				citytxt.setText(str[1]);
				statetxt.setText(str[2]);
				ziptxt.setText(str[3]);
			}catch(Exception e){
				
			}
			*/
	//	}
		
		

	}
	
	public void txtstr_onclick(View view)
	{
	 
	 final AlertDialog.Builder alert = new AlertDialog.Builder(this);
		final EditText input = new EditText(this);
		
		input.setText("");
		alert.setView(input);
		alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int whichButton) {
				String value = input.getText().toString().trim();
				TextView txtstr=(TextView)findViewById(R.id.txtstreet);
				txtstr.setText(value);
				
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
	public void txtcity_onclick(View view)
	{
	 
	 final AlertDialog.Builder alert = new AlertDialog.Builder(this);
		final EditText input = new EditText(this);
		
		input.setText("");
		alert.setView(input);
		alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int whichButton) {
				
				TextView txtcity=(TextView)findViewById(R.id.txtcity);
				String value = input.getText().toString().trim();
				txtcity.setText(value);
				
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
	public void txtstate_onclick(View view)
	{
	 
	 final AlertDialog.Builder alert = new AlertDialog.Builder(this);
		final EditText input = new EditText(this);
		
		input.setText("");
		alert.setView(input);
		alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int whichButton) {
				
				TextView txtstate=(TextView)findViewById(R.id.txtstate);
				String value = input.getText().toString().trim();
				txtstate.setText(value);
				
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
	public void txtzipcode_onclick(View view)
	{
	 
	 final AlertDialog.Builder alert = new AlertDialog.Builder(this);
		final EditText input = new EditText(this);
		
		input.setText("");
		alert.setView(input);
		alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int whichButton) {
				
				TextView txtzipcode=(TextView)findViewById(R.id.txtzipcode);
				String value = input.getText().toString().trim();
				txtzipcode.setText(value);
				
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
	/*public void address_reset(View view){
		EditText streetxt = (EditText) findViewById(R.id.txtstreet);
		EditText citytxt = (EditText) findViewById(R.id.txtcity);
		EditText statetxt = (EditText) findViewById(R.id.txtstate);
		EditText ziptxt = (EditText) findViewById(R.id.txtzipcode);
		
		streetxt.setText("");
		citytxt.setText("");
		statetxt.setText("");
		ziptxt.setText("");
	}
	
	public void address_onclick(View view) {
		String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/addaddress";
		
		
		EditText streetxt = (EditText) findViewById(R.id.txtstreet);
		EditText citytxt = (EditText) findViewById(R.id.txtcity);
		EditText statetxt = (EditText) findViewById(R.id.txtstate);
		EditText ziptxt = (EditText) findViewById(R.id.txtzipcode);
		
		
		RestClient client = new RestClient(url);
		client.addParam("email", UserSession.USEREMAIL);
		client.addParam("street1", streetxt.getText().toString());
		client.addParam("street2", "");
		client.addParam("city", citytxt.getText().toString());
		client.addParam("state", statetxt.getText().toString());
		client.addParam("zipcode", ziptxt.getText().toString());
		
		try {
			client.execute(RestClient.POST);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String response = client.getResponse().toString().trim();
		
		if(response.equals("Sucessful!")){
			Intent i = new Intent(AccountActivity.this, RIDEPADActivity.class);
			startActivity(i);
			
		}
		
		
		*/
//	}
}