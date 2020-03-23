package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {



    private ArrayList<CountryItem> countryList;
    private CountryAdapter myAdapter;
    private void iniList(){
        countryList =new ArrayList<CountryItem>();
        countryList.add(new CountryItem("englais",R.drawable.america));
        countryList.add(new CountryItem("français",R.drawable.france));
        countryList.add(new CountryItem("arabic",R.drawable.algeria));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Create",Toast.LENGTH_LONG).show();


        /*final Button login=(Button)findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 login.setText("good job");
            }
        });*/


        iniList();
        Spinner spinnercon =(Spinner)findViewById(R.id.spinner);

        myAdapter =new CountryAdapter(this,countryList);
        spinnercon.setAdapter(myAdapter);

        spinnercon.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CountryItem Clikeditem= (CountryItem) parent.getItemAtPosition(position);
                String Clikeditemname=Clikeditem.getNameCountry();
                Toast.makeText(MainActivity.this,Clikeditemname+" selected",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });




    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"start",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Reasume",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"Pause",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"Stop",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Destroy",Toast.LENGTH_LONG).show();

    }

    public void login(View view) {
        EditText username=(EditText)findViewById(R.id.username);
        EditText email=(EditText)findViewById(R.id.email);
        EditText passwd=(EditText)findViewById(R.id.password);


        Intent int1=new Intent(this,show.class);



        //myint.putExtra("email",email.getText().toString());
        //myint.putExtra("password",pasw.getText().toString());

        Bundle bn=new Bundle();
        if ((email.getText().toString().equals("w"))&&((passwd.getText().toString().equals("a")))){
            bn.putString("username",username.getText().toString());
            bn.putString("email",email.getText().toString());
            bn.putString("passwd",passwd.getText().toString());
            int1.putExtras(bn);
            startActivity(int1);
        }else{
            Toast.makeText(this, "oops something wrong !! ", Toast.LENGTH_SHORT).show();
        }



    }
}
