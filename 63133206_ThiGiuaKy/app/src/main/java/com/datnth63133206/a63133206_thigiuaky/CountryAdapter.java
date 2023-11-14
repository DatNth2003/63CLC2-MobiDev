package com.datnth63133206.a63133206_thigiuaky;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CountryAdapter extends BaseAdapter {
    private ArrayList<Country> dsQuocGia;
    private Context context;
    private LayoutInflater inflater;

    public CountryAdapter(ArrayList<Country> dsQuocGia, Context context, LayoutInflater inflater) {
        this.dsQuocGia = dsQuocGia;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    public CountryAdapter(ArrayList<Country> dsQuocGia, Context context) {
        this.dsQuocGia = dsQuocGia;
        this.context = context;
    }

    @Override
    public int getCount() {
        return dsQuocGia.size();
    }

    @Override
    public Object getItem(int position) {
        return dsQuocGia.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        //get view
        ControlHolder itemControlsHolder;//stores refs to xml
        if (view == null){// inflate form layout item XML;
            view = inflater.inflate(R.layout.item_layout_country,null);
            //set refs
            itemControlsHolder = new ControlHolder();
            itemControlsHolder.ivFlag = view.findViewById(R.id.ivFlag);
            itemControlsHolder.tvName = view.findViewById(R.id.tvName);
            itemControlsHolder.tvPopulation = view.findViewById(R.id.tvPopulation);
            view.setTag(itemControlsHolder);
        }
        else {
            itemControlsHolder = (ControlHolder)view.getTag();
        }
        //Set data for controls which hold in itemControlsHolder
        Country nation = dsQuocGia.get(position);
        itemControlsHolder.tvName.setText(nation.getCountryName());
        itemControlsHolder.tvName.setText("Population: " + nation.getPopulation());
        int resImageID = context.getResources().getIdentifier(nation.getCountryFlag(),"mipmap",context.getPackageName());
        itemControlsHolder.ivFlag.setImageResource(resImageID);
        return view;
    }
    class ControlHolder{
        ImageView ivFlag;
        TextView tvName;
        TextView tvPopulation;

    }
}
