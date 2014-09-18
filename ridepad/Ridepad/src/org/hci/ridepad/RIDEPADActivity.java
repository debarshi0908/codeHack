package org.hci.ridepad;

import java.util.ArrayList;
import java.util.List;

import org.ridepad.ext.Item;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class RIDEPADActivity extends Activity implements
		AdapterView.OnItemClickListener {
	private View mVictim;
	private ListView listView_;
	private HomeItemAdapter itemAdapter_;
	private ArrayList<HomeItem> homeItems_;
	private AnimationSet slideDown_;	
//	private final String SEPERATOR = "MENU";
	private final String MY_ACCOUNT = "My Account";
	private final String MEMBERS = "Members";
	private final String OFFERS_REQUESTS = "Needs Review";
	//private final String REQUESTS = "Current Requests";
	private final String OFFER_REQUEST_A_RIDE = "Offer/Request";
	//private final String REQUEST_A_RIDE = "Request a Ride";	
    private final String MY_RIDE="My Ride";
    private final String FRIEND_REQUESTS = "Friend Requests";
	
    int total = 0;
	int totalfriend = 0;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		
		
		//setContentView(R.layout.main_activity);
		
		 try {
			 	String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/getrequests";
			 	RestClient client = new RestClient(url);
			 	client.addParam("myemail", UserSession.USEREMAIL);
			 	XMLProcessor xml = new XMLProcessor();
				client.execute(RestClient.GET);
				String response = client.getResponse().toString().trim();
				List<Item> list = xml.convertToList(response);
				if(list != null)
					total = list.size();
				
				
		 }catch(Exception e){e.printStackTrace();}
		 
		 try{
			  	String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/getinvitaion";
				
				XMLProcessor xml = new XMLProcessor();
				RestClient client = new RestClient(url);
				client.addParam("myemail", UserSession.USEREMAIL);
				client.execute(RestClient.GET);
				
				String response = client.getResponse().toString().trim();
				List<Item> list = xml.convertToList(response);
				if(list != null)
					totalfriend = list.size();
		 }catch(Exception e){e.printStackTrace();}
        
		// get views from xml
		listView_ = (ListView) findViewById(R.id.HomeListView);

		// set click listeners
		listView_.setOnItemClickListener(this);
	

		// link listView to array of options
		homeItems_ = new ArrayList<HomeItem>();
		homeItems_.add(new HomeItem(R.drawable.n_account,MY_ACCOUNT, false,R.drawable.n_arrowright));
		homeItems_.add(new HomeItem(R.drawable.n_friend,MEMBERS,false,R.drawable.n_arrowright));		
		homeItems_.add(new HomeItem(R.drawable.n_friend_request,FRIEND_REQUESTS+" ("+totalfriend+")",false,R.drawable.n_arrowright));
		homeItems_.add(new HomeItem(R.drawable.n_request,OFFERS_REQUESTS +" ("+total+")", false,R.drawable.n_arrowright));	
		homeItems_.add(new HomeItem(R.drawable.n_offer,OFFER_REQUEST_A_RIDE,
				false,R.drawable.n_arrowright));			
		homeItems_.add(new HomeItem(R.drawable.n_myride,MY_RIDE,
				false,R.drawable.n_arrowright));
		itemAdapter_ = new HomeItemAdapter(this, R.layout.home_list_item,
				homeItems_);
		listView_.setAdapter(itemAdapter_);
        
		// create animation and apply to view
		slideDown_ = (AnimationSet) AnimationUtils.loadAnimation(this,
				R.anim.translate_down);
		LayoutAnimationController controller = new LayoutAnimationController(
				slideDown_, 0.5f);
		listView_.setLayoutAnimation(controller);
		// display
	//	mVictim = findViewById(R.id.victim);

		// Find our buttons
	//	EditText QuickSearchtxtbox = (EditText) findViewById(R.id.txtquicksearch);

		// EditText goneButton = (EditText) findViewById(R.id.gone);

		// Wire each button to a click listener
		
	}
		

		

	OnClickListener mVisibleListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			if (mVictim.getVisibility() != View.GONE) {
				mVictim.setVisibility(View.GONE);
			} else {
				mVictim.setVisibility(View.VISIBLE);
			}
			
		}
	};

	// spinner clicks

	public class MyOnItemSelectedListener implements OnItemSelectedListener {

		@Override
		public void onItemSelected(AdapterView<?> parent, View view, int pos,
				long id) {
			
		}

		@Override
		public void onNothingSelected(AdapterView parent) {
			// Do nothing.
		}

	}

	// handle listView clicks
	@Override
	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
		HomeItem itemSelected = itemAdapter_.getItem(position);
		String selectedOption = itemSelected.getItemName();

		// find which item was selected and start the proper activity
		 if (selectedOption.equals(MY_ACCOUNT)) {
			Intent i = new Intent(RIDEPADActivity.this, AccountActivity.class);
			startActivity(i);
		}
		// CREATE VEHICLE_SEARCH ACTIVITY
		else if (selectedOption.equals(MEMBERS)) {
			// Toast.makeText(this, "In The Works", Toast.LENGTH_SHORT).show();
			Intent i = new Intent(RIDEPADActivity.this,
				MembersActivity.class);
			startActivity(i);
		}
		// CREATE TITLE_SEARCH ACTIVITY, MENU LAYOUT IN XML
		else if (selectedOption.equals(OFFERS_REQUESTS +" ("+total+")")) {
			// Toast.makeText(this, "In The Works", Toast.LENGTH_SHORT).show();
			Intent i = new Intent(RIDEPADActivity.this, OffersActivity.class);
			startActivity(i);
		
		} else if (selectedOption.equals(OFFER_REQUEST_A_RIDE)) {
			Intent i = new Intent(RIDEPADActivity.this, OfferRideActivity.class);
			startActivity(i);
		}
		else if (selectedOption.equals(MY_RIDE)) {
			Intent i = new Intent(RIDEPADActivity.this,
					MyRideActivity.class);
			startActivity(i);
		}else if(selectedOption.equals(FRIEND_REQUESTS+" ("+totalfriend+")")){
			Intent i = new Intent(RIDEPADActivity.this,InviteFriendsActivity.class);
			startActivity(i);
		}else
			Toast.makeText(this, selectedOption, Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);

		// Checks the orientation of the screen
		if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
			// Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
		} else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
			// Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
		}
		// Checks whether a hardware keyboard is available
		if (newConfig.hardKeyboardHidden == Configuration.HARDKEYBOARDHIDDEN_NO) {
			// Toast.makeText(this, "keyboard visible",
			// Toast.LENGTH_SHORT).show();
		} else if (newConfig.hardKeyboardHidden == Configuration.HARDKEYBOARDHIDDEN_YES) {
			// Toast.makeText(this, "keyboard hidden",
			// Toast.LENGTH_SHORT).show();
		}
	}
	 
    @Override
    public void onBackPressed(){
    	return;
    	
    	
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	
		// Intent mainIntent=new
		// Intent().setClass(SplashActiapple@gmail.com	vity.this,RIDEPADActivity.class);
		
        switch (item.getItemId()) {
        
            case R.id.icontext:     Toast.makeText(this, "Add Member", Toast.LENGTH_LONG).show();
            	Intent mainIntent = new Intent().setClass(RIDEPADActivity.this,
        			AddMemberActivity.class);
          	startActivity(mainIntent);
                 break;             
            case R.id.icontext1:     Toast.makeText(this, "Map", Toast.LENGTH_LONG).show();
            Intent mainIntent1 = new Intent().setClass(RIDEPADActivity.this,
        			MymapActivity.class);
        	startActivity(mainIntent1);
                                break;
            case R.id.icontext2:     Toast.makeText(this, "Refresh", Toast.LENGTH_LONG).show();
        	Intent mainIntent2 = new Intent().setClass(RIDEPADActivity.this,
        			RIDEPADActivity.class);
      	startActivity(mainIntent2);
             break;             
        case R.id.icontext3:     Toast.makeText(this, "Signout!", Toast.LENGTH_LONG).show();
        Intent mainIntent3 = new Intent().setClass(RIDEPADActivity.this,
    			LoginActivity.class);
    	startActivity(mainIntent3);
                            break;
         //   case R.id.icontext: Toast.makeText(this, "You pressed the icon and text!", Toast.LENGTH_LONG).show();
           //                     break;
        }
        return true;
    }

	

}
