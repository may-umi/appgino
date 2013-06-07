//Create Customized List view

package com.wbs.ginos;


import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter   // Custom ListView Adapter
{

    private Activity activity;
    private ArrayList<HashMap<String, String>> data;
    private static LayoutInflater inflater=null;
    String[] tags= new String [5];
    int[] ids;
    int listSelectedItems;

    //Constructor to receive values to populate list
    public CustomAdapter(Activity a, ArrayList<HashMap<String, String>> d,int listSelectedItems, String[] t, int[] i ) 
    {
        activity = a;
        data=d;
        tags =t;
        ids=i;
        listSelectedItems= this.listSelectedItems;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //Image
    }

    //Methods to implemented for custom listview
    public int getCount() 
    {
        return data.size();
    }

    public Object getItem(int position) 
    {
        return position;
    }

    public long getItemId(int position) 
    {
        return position;
    }
    
    public int getViewTypeCount()
    {
        return 1;
    }

//Set item in  appropriate view and display
    public View getView(int position, View convertView, ViewGroup parent) 
    {
        if(convertView==null)
        	
        	//access the custom made row
            convertView = inflater.inflate(R.layout.custom_list_row, null);
        
       // (TextView)convertView.findViewById(R.id.title).setTex
        TextView title = (TextView)convertView.findViewById(R.id.title); // title
        TextView details = (TextView)convertView.findViewById(R.id.details); // details
        TextView price = (TextView)convertView.findViewById(R.id.price); // price
        ImageView thumb_image=(ImageView)convertView.findViewById(R.id.list_image); // thumb image

        
        title.setText(data.get(position).get(tags[1]));
         /*

        // Setting all values in listview
       title.setText(data.get(position).get(FetchSelCatActivity.KEY_TITLE));
        details.setText(data.get(position).get(FetchSelCatActivity.KEY_DETAILS));
        price.setText(data.get(position).get(FetchSelCatActivity.KEY_PRICE));  */
        //Code for image
        return convertView;
    }
}