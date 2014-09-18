package org.hci.ridepad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AndroidclientActivity extends Activity {
	/** Called when the activity is first created. */
	String url = "http://130.160.62.146:8080/poolservice/rest/ridepad";
	String url1 = "http://130.160.62.146:8080/poolservice/rest/ridepad/login";
	EditText email;
	EditText password;
	EditText fname;
	EditText lname;
	EditText telno;
	TextView Status;
	EditText loginemail;
	EditText loginpassword;
	boolean emailcheck;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.login);
		/*
		 * email = (EditText) findViewById(R.id.emailTxt); password = (EditText)
		 * findViewById(R.id.loginpassword); fname = (EditText)
		 * findViewById(R.id.fnameTxt); lname = (EditText)
		 * findViewById(R.id.lnameTxt);
		 */
		// telno = getMyPhoneNumber(); //(EditText) findViewById(R.id.telnoTxt);
		// login
		loginemail = (EditText) findViewById(R.id.txtemail);
		loginpassword = (EditText) findViewById(R.id.txtpassword);
	//	Status = (TextView) findViewById(R.id.statusView);

		/*
		 * Button button = (Button) findViewById(R.id.button1);
		 * 
		 * button.setOnClickListener(new Button.OnClickListener(){ public void
		 * onClick(View v){
		 * register(email.getText().toString(),password.getText(
		 * ).toString(),fname
		 * .getText().toString(),lname.getText().toString(),telno
		 * .getText().toString()); } });
		 */
	}

	public String getMyPhoneNumber() {
		return ((TelephonyManager) getSystemService(TELEPHONY_SERVICE))
				.getLine1Number();
	}

	public void signup_onclick(View view) {
		String vEmail = email.getText().toString();
		String vPwd = password.getText().toString();

		if (vEmail.equalsIgnoreCase("") || vPwd.equalsIgnoreCase("")) {
			Status.setText("All Fields Required.");
		}
		checkemail(vEmail);

		if (emailcheck == true) {
			register(email.getText().toString(), password.getText().toString(),
					fname.getText().toString(), lname.getText().toString(),
					getMyPhoneNumber());// telno.getText().toString());
		} else {
			Status.setText("INcorrect Email");
		}

	}

	public void checkemail(String email) {
		Pattern pattern = Pattern.compile(".+@.+\\.[a-z]+");
		Matcher matcher = pattern.matcher(email);
		emailcheck = matcher.matches();
	}

	//public void loginbtn_onclick(View view) {
	//	String vEmail = email.getText().toString();
	//	String vPwd = password.getText().toString();

		/*if (vEmail.equalsIgnoreCase("") || vPwd.equalsIgnoreCase("")) {
			Status.setText("All Fields Required.");
		} else {
			login(loginemail.getText().toString(), loginpassword.getText()
					.toString());
		}*/
	//	login(vEmail,vPwd);
//	}

	public void register(String email, String password, String fname,
			String lname, String telno) {

		RestClient client = new RestClient(url);
		client.addParam("email", email);
		client.addParam("password", password);
		client.addParam("fname", fname);
		client.addParam("lname", lname);
		client.addParam("telno", telno);

		try {
			client.execute(RestClient.POST);
			String response = client.getResponse();
			Status.setText(response);
			// System.out.println(response);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void login(String email, String password) {

		RestClient client = new RestClient(url1);
		client.addParam("email", email);
		client.addParam("password", password);
		try {
			client.execute(RestClient.POST);
			String response = client.getResponse();
			Status.setText(response);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}