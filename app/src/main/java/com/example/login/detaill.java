package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class detaill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaill);

        TextView name=(TextView)findViewById(R.id.name);
        TextView email=(TextView)findViewById(R.id.description);
        TextView cofi=(TextView)findViewById(R.id.cofis);

        Bundle bn2=getIntent().getExtras();
        String nameuser=bn2.getString("name");
        String emailuser=bn2.getString("desc");
        String cofition=bn2.getString("cofi");

        name.setText(nameuser);
        email.setText(emailuser);
        cofi.setText(cofition);

    }
}
