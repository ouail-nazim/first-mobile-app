package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CountryAdapter extends ArrayAdapter<CountryItem> {

    public CountryAdapter(Context context, ArrayList<CountryItem> countrylist){
        super(context,0,countrylist);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }
    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position,  View convertView,  ViewGroup parent){
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.spinnermodel,parent,false
            );
        }


        ImageView imageflag=convertView.findViewById(R.id.img);
        TextView  nameflag=convertView.findViewById(R.id.con);

        CountryItem item=getItem(position);

        if (item != null){
            imageflag.setImageResource(item.getIdFlagCountry());
            nameflag.setText(item.getNameCountry());
        }

        return convertView;

    }
}
