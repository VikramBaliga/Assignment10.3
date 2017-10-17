package projects.android.my.customlistfragment;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
/**
 * Created by User on 17-10-2017.S
 */

public class MyFragment extends Fragment
{

    View fragmentLayout;
    // String data to be populated in list view
    String[] layouts = {"Layout 1","Layout 2","Layout 3"};
    // Image data to be populated
    int[] logos = {R.drawable.icecreamsandwich,R.drawable.gingerbread,R.drawable.honeycomb};

   @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
   {
        super.onCreateView(inflater, container, savedInstanceState);
       ///Get the layout for the fragment
        fragmentLayout = inflater.inflate(R.layout.fragment_list,null);
       // get the list view
        ListView lists = (ListView) fragmentLayout.findViewById(R.id.layoutLists);
        // create custom adapter for the list view to display img and data
       CustomAdapter ca = new CustomAdapter(layouts,logos);
        lists.setAdapter(ca);
      return fragmentLayout;
    }

    public  class CustomAdapter extends BaseAdapter
    {
        String[] layouts;
        int[] logos;

        public  CustomAdapter(String[] layouts,int[] logos)
        {
            this.layouts=layouts;
            this.logos = logos;
        }
        @Override
        public int getCount() {
           return  logos.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            // get the layout for the list view
            View v = LayoutInflater.from(getContext()).inflate(R.layout.customlist,null);

            // get the reference of the image and text
            ImageView logo = (ImageView) v.findViewById(R.id.logo);
            TextView textView = (TextView) v.findViewById(R.id.desc);
            //Display the image and text
            textView.setText(layouts[position]);
            logo.setImageResource(logos[position]);
            return v;
        }
    }
}
