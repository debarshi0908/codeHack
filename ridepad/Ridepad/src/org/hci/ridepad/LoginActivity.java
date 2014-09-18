package org.hci.ridepad;








import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
//

import android.app.Dialog;
import android.os.Message;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Button;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
//
public class LoginActivity extends Activity {
	
	private String PREFS_USER = "pref_user";
	private String PREFS_PASS = "pref_pass";
	
	private static final String PREFS_NAME = "MyPrefsFile";
	private SharedPreferences pref;
	
	String usrname;
	String passwd;
	
	ProgressThread progThread;
    ProgressDialog progDialog;
    Button button1, button2;
	int typeBar;                        // Determines type progress bar: 0 = spinner, 1 = horizontal
	int delay = 10;
	int maxBarValue = 200; 
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		//LinearLayout progressContainer_ = (LinearLayout) findViewById(R.id.FindFormsLinearProgress);
		//progressContainer_.setVisibility(View.GONE);
		final EditText usrtxt = (EditText) findViewById(R.id.txtemail);
		final EditText passtxt = (EditText) findViewById(R.id.txtpassword);
		final Button signin = (Button) findViewById(R.id.loginbtn);
		
		
		pref = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
		
		usrname = pref.getString(PREFS_USER, null);
		passwd = pref.getString(PREFS_PASS,null);
		
		usrtxt.setText(usrname);
		passtxt.setText(passwd);
		
	
		usrtxt.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            	
           
            if(s.toString().equals("")){
            	signin.setEnabled(false);
			}else if(passtxt.getText().toString().trim().equals("")){
				signin.setEnabled(false);
			}else{
				//System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx"+passtxt.getText());
				signin.setEnabled(true);
			}
                    
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                    int after) {


            }

            @Override
            public void afterTextChanged(Editable s) {
            	

            }
        });
		passtxt.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            	if(s.toString().equals("")){
					signin.setEnabled(false);
				}else if(usrtxt.getText().toString().trim().equals("")){
					signin.setEnabled(false);
				}else{
					signin.setEnabled(true);
				}
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                    int after) {


            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });
	  
		if(!usrtxt.getText().toString().trim().equals("") && !passtxt.getText().toString().trim().equals("")){
			signin.setEnabled(true);
		}

		
       
	}
	 @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        MenuInflater inflater = getMenuInflater();
	        inflater.inflate(R.menu.loginmenu, menu);
	        return true;
	    }

	    @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	    	
			// Intent mainIntent=new
			// Intent().setClass(SplashActivity.this,RIDEPADActivity.class);
			
	        switch (item.getItemId()) {
	        
	            case R.id.icontext:     Toast.makeText(this, "about ridepad!", Toast.LENGTH_LONG).show();
	            	Intent mainIntent = new Intent().setClass(LoginActivity.this,
	        				AboutActivity.class);
	            	startActivity(mainIntent);
	                 break;             
	            case R.id.icontext1:     Toast.makeText(this, "Password Retrival!", Toast.LENGTH_LONG).show();
	                                break;
	         //   case R.id.icontext: Toast.makeText(this, "You pressed the icon and text!", Toast.LENGTH_LONG).show();
	           //                     break;
	        }
	        return true;
	    }
	
	
	public void login_reset(View view){
		Intent i = new Intent(LoginActivity.this, RegistrationActivity.class);
		startActivity(i);
		
	}
	@Override
    protected Dialog onCreateDialog(int id) {
        switch(id) {
        case 0:                      // Spinner
            progDialog = new ProgressDialog(this);
            progDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDialog.setMessage("signing in...");
            progThread = new ProgressThread(handler);
            progThread.start();
            return progDialog;
     /*   case 1:                      // Horizontal
        	progDialog = new ProgressDialog(this);
            progDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            progDialog.setMax(maxBarValue);
            progDialog.setMessage("Dollars in checking account:");
            progThread = new ProgressThread(handler);
            progThread.start();
            return progDialog;*/
        default:
            return null;
        }
    }
	final Handler handler = new Handler() {
        public void handleMessage(Message msg) {
        	// Get the current value of the variable total from the message data
        	// and update the progress bar.
            int total = msg.getData().getInt("total");
            progDialog.setProgress(total);
            if (total <= 0){
                dismissDialog(typeBar);
                progThread.setState(ProgressThread.DONE);
            }
        }
    };
private class ProgressThread extends Thread {	
    	
    	// Class constants defining state of the thread
    	final static int DONE = 0;
        final static int RUNNING = 1;
        
        Handler mHandler;
        int mState;
        int total;
       
        // Constructor with an argument that specifies Handler on main thread
        // to which messages will be sent by this thread.
        
        ProgressThread(Handler h) {
            mHandler = h;
        }
        
        // Override the run() method that will be invoked automatically when 
        // the Thread starts.  Do the work required to update the progress bar on this
        // thread but send a message to the Handler on the main UI thread to actually
        // change the visual representation of the progress. In this example we count
        // the index total down to zero, so the horizontal progress bar will start full and
        // count down.
        
       
        
        // Set current state of thread (use state=ProgressThread.DONE to stop thread)
        public void setState(int state) {
            mState = state;
        }
        
        @Override
        public void run() {
            mState = RUNNING;   
            total = maxBarValue;
            while (mState == RUNNING) {
            	// The method Thread.sleep throws an InterruptedException if Thread.interrupt() 
            	// were to be issued while thread is sleeping; the exception must be caught.
                try {
                	// Control speed of update (but precision of delay not guaranteed)
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    Log.e("ERROR", "Thread was Interrupted");
                }
                
                // Send message (with current value of  total as data) to Handler on UI thread
                // so that it can update the progress bar.
                
                Message msg = mHandler.obtainMessage();
                Bundle b = new Bundle();
                b.putInt("total", total);
                msg.setData(b);
                mHandler.sendMessage(msg);
                
                total--;      // Count down
            }
        }
    }
	public void signup_onclick(View view) {
		
	//	ListView listView_ = (ListView) findViewById(R.id.FindFormsListView);
		//LinearLayout progressContainer_ = (LinearLayout) findViewById(R.id.FindFormsLinearProgress);
		
		// create animation and apply to list view
		//AnimationSet listViewAnim_ = (AnimationSet) AnimationUtils.loadAnimation(this,
		//		R.anim.translate_down);
		//LayoutAnimationController controller = new LayoutAnimationController(
		//		listViewAnim_, 0.5f);
		//listView_.setLayoutAnimation(controller);
		
		EditText usrtxt = (EditText) findViewById(R.id.txtemail);
		EditText passtxt = (EditText) findViewById(R.id.txtpassword);
	
		
		CheckBox cb = (CheckBox) findViewById(R.id.checkbox);
		if(cb.isChecked()){
			usrname = usrtxt.getText().toString().trim();
			passwd = passtxt.getText().toString().trim();
			getSharedPreferences(PREFS_NAME, MODE_PRIVATE).edit().putString(PREFS_USER,usrname).commit();
			getSharedPreferences(PREFS_NAME, MODE_PRIVATE).edit().putString(PREFS_PASS,passwd).commit();
		}else{
			getSharedPreferences(PREFS_NAME, MODE_PRIVATE).edit().putString(PREFS_USER,"").commit();
			getSharedPreferences(PREFS_NAME, MODE_PRIVATE).edit().putString(PREFS_PASS,"").commit();
		}

		String success = "true";	
	    typeBar = 0;
	    showDialog(typeBar);
	    
		String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/login";
		
		
		
		RestClient client = new RestClient(url);
		client.addParam("email", usrtxt.getText().toString());
		client.addParam("password", passtxt.getText().toString());
		//System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
		try {
			client.execute(RestClient.POST);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String response = client.getResponse().toString().trim();
		
		//System.out.println("***********"+response+"******************"+response.length());
		
	           
		if("true".equals(response)){
			//System.out.println("Pass!");
			UserSession.USEREMAIL = usrtxt.getText().toString();
			sendCurrentLocation(UserSession.USEREMAIL);
			Intent i = new Intent(LoginActivity.this, RIDEPADActivity.class);
			startActivity(i);
		}
		else{
			AlertDialog.Builder alertbox = new AlertDialog.Builder(this);
			alertbox.setNeutralButton("Ok",new DialogInterface.OnClickListener() 
			{
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			});
			alertbox.setMessage("The e-mail or password was not correct!!!");
			
			alertbox.show();
			
			
		}
			
	}
	
	
	private void sendCurrentLocation(String email){
		String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/updateloc";
		
	
        
        RestClient client = new RestClient(url);
		 double lat = 33.206759;
		 double lng = -87.557715;
        
		try {
			//Use GPS
			/*final LocationListener locationListener = new LocationListener(){

				@Override
				public void onLocationChanged(Location arg0) {
					// TODO Auto-generated method stub
					//lat = arg0.getLatitude();
					//lng = arg0.getLongitude();
					
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
				public void onStatusChanged(String provider, int status,
						Bundle extras) {
					// TODO Auto-generated method stub
					
				}
				
			};*/
	        LocationManager mlocManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
	        Criteria criteria = new Criteria();
	        criteria.setAccuracy(Criteria.ACCURACY_FINE);
	        criteria.setPowerRequirement(Criteria.POWER_LOW);
	        String locationprovides = mlocManager.getBestProvider(criteria, true);
	        Location loc = mlocManager.getLastKnownLocation(locationprovides);
	        
	       // mlocManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 100, 1, locationListener);
	        if(loc != null){
	        	lat = loc.getLatitude();
	 	        lng = loc.getLongitude();
	        }else{
	        	Toast.makeText(this, "Could not retrive your location!", Toast.LENGTH_LONG).show();
	        }
	       
	        client.addParam("email", email);
			client.addParam("lat", Double.toString(lat));
			client.addParam("lon", Double.toString(lng));
			client.execute(RestClient.GET);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String response = client.getResponse().toString().trim();
		System.out.println(response);
        
	}

}