package com.example.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class GridAdapetr extends BaseAdapter {

    Context context;
    private final int[] color;
    private final String[] values;
    private final String[] desc;
    private final String[] cofi;
    View view;
    LayoutInflater layoutInflater;


    public GridAdapetr( Context context,int[] color,String[] values,String[] desc,String[] cofi){
        this.context=context;
        this.color=color;
        this.values=values;
        this.desc=desc;
        this.cofi=cofi;
    }




    @Override
    public int getCount() {
        return values.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {
       layoutInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

       if (convertView ==null){
           view =new View(context);
           view=layoutInflater.inflate(R.layout.row_data,null);
           RelativeLayout relativeLayout=(RelativeLayout) view.findViewById(R.id.form);

           TextView textView=(TextView) view.findViewById(R.id.modulename);
           TextView textView2=(TextView) view.findViewById(R.id.descmodule);
           TextView cofisnum=(TextView) view.findViewById(R.id.cofi);
           textView.setText(values[position]);
           textView2.setText(desc[position]);
           cofisnum.setText(cofi[position]);
           relativeLayout.setBackgroundColor(color[position]);



       }
       return view;
    }



}
