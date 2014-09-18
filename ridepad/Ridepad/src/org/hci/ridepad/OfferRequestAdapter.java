package org.hci.ridepad;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class OfferRequestAdapter extends BaseAdapter{
	
	private Context context;
	private List list;
	private LayoutInflater inflater;

	public OfferRequestAdapter(Context context, List list){
		this.context = context;
		this.list = list;
		this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	@Override
	public int getCount() {
		return this.list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		final MainListHolder holder;
		//View v = convertView;
		if(convertView == null){
			convertView = inflater.inflate(R.layout.general_list_item, parent,false);
		}
		
		TextView title = (TextView) convertView.findViewById(R.id.text_head);
		TextView sub = (TextView) convertView.findViewById(R.id.text_sub);
		
		try{
			String content = (String)list.get(position);
			String cr[] = content.split("-");
			title.setText(cr[0]);
			sub.setText(cr[1] +" : "+cr[2]);
		}catch(Exception exx){
			exx.printStackTrace();
		}
		return convertView;
	}
	
	class MainListHolder
	{
		private TextView text1;
		private TextView text2;
	}

}
