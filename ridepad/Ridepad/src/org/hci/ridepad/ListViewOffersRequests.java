package org.hci.ridepad;

import java.util.ArrayList;
import java.util.List;

import org.ridepad.ext.Item;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;



public class ListViewOffersRequests extends ListActivity 
{
    String[] presidents = {
            "Dwight D. Eisenhower",
            "John F. Kennedy",
            "Lyndon B. Johnson",
            "Richard Nixon",
            "Gerald Ford",
            "Jimmy Carter",
            "Ronald Reagan",
            "George H. W. Bush",
            "Bill Clinton",
            "George W. Bush",
            "Barack Obama"
    };
    
    List tbl = new ArrayList();
 
    @Override  
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.listviewofferrequests);    
        //setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, presidents));
        
        String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/getrequests";
		
		//Spinner spinner = (Spinner) findViewById(R.id.spinner2);
		
		XMLProcessor xml = new XMLProcessor();
		RestClient client = new RestClient(url);
		client.addParam("myemail", UserSession.USEREMAIL);
		 ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_gallery_item);
		
		try {
			client.execute(RestClient.GET);
			//adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item);
			
			String response = client.getResponse().toString().trim();
			List<Item> list = xml.convertToList(response);
			for(int i=0;i < list.size();i++){
				Item item = list.get(i);
				//System.out.println("%%%%%%%%%%%"+item.getEntry());
				tbl.add(item.getEntry().toString());
				adapter.add(item.getEntry());
				//spinner.setAdapter(adapter);
			}
			setListAdapter(new OfferRequestAdapter(this,tbl));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }    
 
    public void onListItemClick(
    ListView parent, View v,
    int position, long id) 
    {   
    	final AlertDialog.Builder alert = new AlertDialog.Builder(this);
 		final TextView input = new TextView(this);
 		String content = (String)tbl.get(position);
 		String cr[] = content.split("-");
 		String crname = cr[0];
 		final String crplace = cr[2];
 		final String cremail = cr[3];
 		input.setText("Would you like to accept offer/request from  " + crname);
 		alert.setView(input);
 		alert.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
 			public void onClick(DialogInterface dialog, int whichButton) {
// 				String value = input.getText().toString().trim();
// 				TextView txtdis=(TextView)findViewById(R.id.txtdis);
// 				txtdis.setText(value);
// 				
// 				Toast.makeText(getApplicationContext(), value,
// 						Toast.LENGTH_SHORT).show();
 				
 				String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/accept";
 		    	//Spinner spinner = (Spinner) findViewById(R.id.spinner2);
 		    		
 		    	    
 		    	    RestClient client = new RestClient(url);
 		    		client.addParam("myemail", UserSession.USEREMAIL);
 		    		client.addParam("place", crplace);
 		    		client.addParam("email2", cremail);
 		    	//	String[] tokens = spinner.getSelectedItem().toString().split("-");
 		    		
 		    		
 		    		UserSession.FRIENDS_ACCEPTANCE.add(cremail);
 		    		
 		    		
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
 		     				//Intent i = new Intent(ListViewOffersRequests.this, MymapActivity.class);
 		    			Intent i = new Intent(ListViewOffersRequests.this, MymapActivity.class);
 		     			startActivity(i);
 		     		}
 				
 			}
 		});

 		alert.setNegativeButton("Decline",
 				new DialogInterface.OnClickListener() {
 					public void onClick(DialogInterface dialog, int whichButton) {
 						String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/reject";
 		 		    	//Spinner spinner = (Spinner) findViewById(R.id.spinner2);
 		 		    		
 		 		    	    
 		 		    	    RestClient client = new RestClient(url);
 		 		    		client.addParam("myemail", UserSession.USEREMAIL);
 		 		    		client.addParam("place", crplace);
 		 		    		client.addParam("email2", cremail);
 		 		    		
 		 		    	//	String[] tokens = spinner.getSelectedItem().toString().split("-");
 		 		    		
 		 		    		
 		 		    		UserSession.FRIENDS_ACCEPTANCE.add(cremail);
 		 		    		
 		 		    		
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
 		 		     				//Intent i = new Intent(ListViewOffersRequests.this, MymapActivity.class);
 		 		    			Intent i = new Intent(ListViewOffersRequests.this, ListViewOffersRequests.class);
 		 		     			startActivity(i);
 		 		     		}
 					}
 				});
 		alert.show();
    }  
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.members_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	
		// Intent mainIntent=new
		// Intent().setClass(SplashActiapple@gmail.com	vity.this,RIDEPADActivity.class);
		
        switch (item.getItemId()) {
        
            case R.id.icontext:     Toast.makeText(this, "Add Member!", Toast.LENGTH_LONG).show();
            	Intent mainIntent = new Intent().setClass(ListViewOffersRequests.this,
        			AddMemberActivity.class);
          	startActivity(mainIntent);
                 break;             
            case R.id.icontext1:     Toast.makeText(this, "Signout!", Toast.LENGTH_LONG).show();
            	Intent mainIntent1 = new Intent().setClass(ListViewOffersRequests.this,
            			LoginActivity.class);
            	startActivity(mainIntent1);
                                break;
         //   case R.id.icontext: Toast.makeText(this, "You pressed the icon and text!", Toast.LENGTH_LONG).show();
           //                     break;
        }
        return true;
    }
    
    @Override
    public void onBackPressed(){
    	//return;
    	Intent i = new Intent(ListViewOffersRequests.this, RIDEPADActivity.class);
		startActivity(i);
    	
    }
    
}