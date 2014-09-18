package org.hci.ridepad;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends Activity {
	
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.registration);
	}
	
	public void regis_onclick(View view) {
		String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/adduser";
		String response = "";
		
		
		EditText usrtxt = (EditText) findViewById(R.id.txtemail);
		EditText passtxt = (EditText) findViewById(R.id.txtpassword);
		EditText nametxt = (EditText) findViewById(R.id.txtname);
		EditText phonetxt = (EditText) findViewById(R.id.txtph);
		
		
	
		RestClient client = new RestClient(url);
		client.addParam("email", usrtxt.getText().toString().trim());
		client.addParam("password", passtxt.getText().toString().trim());
		client.addParam("name", nametxt.getText().toString().trim());
		client.addParam("phone", phonetxt.getText().toString().trim());
		
		try {
			if(usrtxt.getText().toString().trim().equals("")){
				showDialogError("Please enter an e-mail");
			}else if(passtxt.getText().toString().trim().equals("")){
				showDialogError("Please enter a password");
			}else if(nametxt.getText().toString().trim().equals("")){
				showDialogError("Please enter your name");
			}else if(phonetxt.getText().toString().trim().equals("")){
				showDialogError("Please enter your phone");
			}else{
				client.execute(RestClient.POST);
				 response = client.getResponse().toString().trim();
				 if("Sucessfull!".equals(response)){
						//System.out.println("Pass!");
					 	Toast.makeText(getApplicationContext(),"The registration is successful!",Toast.LENGTH_SHORT).show();
						UserSession.USEREMAIL = usrtxt.getText().toString();
						Intent i = new Intent(RegistrationActivity.this, RIDEPADActivity.class);
						startActivity(i);
					}else{
						AlertDialog.Builder alertbox = new AlertDialog.Builder(this);
						alertbox.setNeutralButton("Ok",new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// TODO Auto-generated method stub
								
							}
						});
						alertbox.setMessage("The registration is unsuccessful!. Please try again.");
						alertbox.show();
					}		
			}
			
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	private void showDialogError(String msg){
		AlertDialog.Builder alertbox = new AlertDialog.Builder(this);
		alertbox.setNeutralButton("Ok",new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		});
		alertbox.setMessage(msg);
		alertbox.show();
	}
}