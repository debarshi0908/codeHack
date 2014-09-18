package org.hci.ridepad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class loadingActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.account);
		
		String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/getaddress";
		
		RestClient client = new RestClient(url);
		client.addParam("email", UserSession.USEREMAIL);
		try {
			client.execute(RestClient.GET);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String response = client.getResponse().toString().trim();
		
		
	//	System.out.println("##############"+str[0]+str[1]+str[2]+str[3]);
		
		EditText streetxt = (EditText) findViewById(R.id.txtstreet);
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
			
		}
		
		

	}
	public void address_reset(View view){
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
			Intent i = new Intent(loadingActivity.this, RIDEPADActivity.class);
			startActivity(i);
			
		}
		
		
		
	}
}