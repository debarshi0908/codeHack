package org.hci.ridepad;

import java.util.List;

import org.ridepad.ext.Item;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class InviteFriendsActivity extends Activity{

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
	//	setContentView(R.layout.offer_friend);
		startActivity(new Intent( this, ListViewFriendRequests.class));
		/*String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/getinvitaion";
		
		XMLProcessor xml = new XMLProcessor();
		RestClient client = new RestClient(url);
		client.addParam("myemail", UserSession.USEREMAIL);
		Spinner spinner = (Spinner) findViewById(R.id.invitedfriends);
		ArrayAdapter adapter = null;
		
		try {
			client.execute(RestClient.GET);
			
			String response = client.getResponse().toString().trim();
			List<Item> list = xml.convertToList(response);
			adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item);
			for(int i=0;i < list.size();i++){
				Item item = list.get(i);
				//System.out.println("%%%%%%%%%%%"+item.getEntry());
				
				adapter.add(item.getEntry());
				spinner.setAdapter(adapter);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void invite_onclick(View view){
		String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/acceptinvite";
    	Spinner spinner = (Spinner) findViewById(R.id.invitedfriends);
    	
    	    
    	    RestClient client = new RestClient(url);
    		client.addParam("myemail", UserSession.USEREMAIL);
    		client.addParam("friendemail", spinner.getSelectedItem().toString());
    		
    		try {
    			client.execute(RestClient.POST);
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		
    		String response = client.getResponse().toString().trim();
    		System.out.println(response);
    		
    		if(response.equals(UserSession.OK))
     		{
     				//System.out.println("Pass!");
     				Intent i = new Intent(InviteFriendsActivity.this, MymapActivity.class);
     				startActivity(i);
     		}
	}*/
}
}
