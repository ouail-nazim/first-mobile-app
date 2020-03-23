package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class user_info extends AppCompatActivity  {
    private ArrayList<CountryItem> countryList;
    private CountryAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        TextView name=(TextView)findViewById(R.id.na);
        TextView email=(TextView)findViewById(R.id.em);
        TextView password=(TextView)findViewById(R.id.pas);
        Bundle bn2=getIntent().getExtras();
        String nameuser=bn2.getString("name");
        String emailuser=bn2.getString("email");
        String paswuser=bn2.getString("passwd");
        name.setText(nameuser);
        email.setText(emailuser);
        password.setText(paswuser);

        iniList();
        Spinner spinnercon =(Spinner)findViewById(R.id.spinner);

        myAdapter =new CountryAdapter(this,countryList);
        spinnercon.setAdapter(myAdapter);

        spinnercon.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CountryItem Clikeditem= (CountryItem) parent.getItemAtPosition(position);
                String Clikeditemname=Clikeditem.getNameCountry();
                Toast.makeText(user_info.this,Clikeditemname+" selected",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
















      /*
      *   final TextView vv =(TextView)findViewById(R.id.cont);
        final List<String> country =new ArrayList<String>();
        country.add("france");
        country.add("usa");
        country.add("china");

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,country);

        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                vv.setText("you are from "+country.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                spinner.setSelection(0);

            }
        });

      * */

    }


    private void iniList(){
        countryList =new ArrayList<CountryItem>();
        countryList.add(new CountryItem("usa",R.drawable.america));
        countryList.add(new CountryItem("canada",R.drawable.canada));
        countryList.add(new CountryItem("france",R.drawable.france));
        countryList.add(new CountryItem("algeria",R.drawable.algeria));
    }

}


