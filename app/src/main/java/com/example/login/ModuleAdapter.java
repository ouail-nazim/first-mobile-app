package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<module> {

    public ModuleAdapter(Context context, ArrayList<module> module){
        super(context,0,module);
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
                    R.layout.row_data,parent,false
            );
        }



        TextView namemodule=convertView.findViewById(R.id.modulename);
        TextView decsmodule=convertView.findViewById(R.id.descmodule);
        TextView coffition=convertView.findViewById(R.id.cofi);

        module item=getItem(position);

        if (item != null){
            namemodule.setText(item.getNamemodule());
            decsmodule.setText(item.getDecsmodule());
            coffition.setText(item.getCofi());
        }

        return convertView;

    }


}
