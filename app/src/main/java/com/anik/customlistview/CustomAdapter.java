package com.anik.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String countryList[];
    int imgList[];
    LayoutInflater inflater;  //for inflate layout items

    public CustomAdapter(Context context,String countryList[],int imgList[])
    {
        this.countryList=countryList;
        this.imgList=imgList;
        inflater=(LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        view=inflater.inflate(R.layout.list_items,viewGroup,false);
        ImageView imgCountry=view.findViewById(R.id.img_country);
        TextView txtName=view.findViewById(R.id.txt_name);

        imgCountry.setImageResource(imgList[position]);
        txtName.setText(countryList[position]);

        return view;
    }
}
