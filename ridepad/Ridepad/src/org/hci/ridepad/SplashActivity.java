package org.hci.ridepad;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {
	private long splashDelay=5000;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashlayout);
        TimerTask task=new TimerTask() {
			
			@Override
			public void run() {
				finish();
				Intent mainIntent=new Intent().setClass(SplashActivity.this,LoginActivity.class);
			//	Intent mainIntent=new Intent().setClass(SplashActivity.this,RIDEPADActivity.class);
				startActivity(mainIntent);
				
			}
		};
		Timer timer=new Timer();
		timer.schedule(task, splashDelay);
    }
}