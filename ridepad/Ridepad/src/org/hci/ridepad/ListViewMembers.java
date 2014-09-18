package org.hci.ridepad;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.ridepad.ext.Item;

import android.app.ListActivity;
import android.content.Intent;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;



public class ListViewMembers extends ListActivity 
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
        setContentView(R.layout.listview);    
      //  setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, presidents));
        
        String url = "http://130.160.62.146:8080/poolservice/rest/ridepad/getfriends";
		
		 XMLProcessor xml = new XMLProcessor();
		 RestClient client = new RestClient(url);
		 client.addParam("email", UserSession.USEREMAIL);
		 GridView grid = (GridView) findViewById(R.id.gridView1);
		 ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_gallery_item);
		 
		 
		try {
			client.execute(RestClient.GET);
			
			String response = client.getResponse().toString().trim();
			List<Item> list = xml.convertToList(response);
			for(int i=0;i < list.size();i++){
				Item item = list.get(i);
				//System.out.println("%%%%%%%%%%%"+item.getEntry());
				String txt = item.getEntry().toString();
				String[] s = txt.split("-");
				tbl.add(s[1]);
				adapter.add(s[0]);
			}
			//grid.setAdapter(adapter);
			setListAdapter(adapter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }    
 
    public void onListItemClick(ListView parent, View v, int position, long id) 
    {   
    	
        Toast.makeText(this, "E-mail: " + ((String)tbl.get(position)), Toast.LENGTH_SHORT).show();
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
            	Intent mainIntent = new Intent().setClass(ListViewMembers.this,
        			AddMemberActivity.class);
          	startActivity(mainIntent);
                 break;             
            case R.id.icontext1:     Toast.makeText(this, "Signout!", Toast.LENGTH_LONG).show();
            	Intent mainIntent1 = new Intent().setClass(ListViewMembers.this,
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
    	Intent i = new Intent(ListViewMembers.this, RIDEPADActivity.class);
		startActivity(i);
    	
    }
    
}