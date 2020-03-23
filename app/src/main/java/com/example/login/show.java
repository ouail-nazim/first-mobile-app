package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class show extends AppCompatActivity {


    private ArrayList<module> modules;
    private void isertmodule(){
        modules =new ArrayList<module>();
        modules.add(new module("Daw","devlopment app web",5));
        modules.add(new module("dam","devlopment app mobil",5));
        modules.add(new module("bd","base des donne",5));
    }



    GridView gridView;

    String[] values={
           "Daw","Dam","Bdm","GL","TL"
    };
    String[] desc={
            "devlopment app web",
            "devlopment app mobile",
            "base de donner ",
            "geni ogiciel",
            "theori de lang"
    };
    String[] cofi={
            "5","2","4","6","3"
    };
   int[] color={
           0xFF336630,
           0xFF6E3737,
           0xFF306664,
           0xFF4A7979,
           0xFFB77979,

   };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);


        gridView=(GridView)findViewById(R.id.grid);

        GridAdapetr gridAdapetr=new GridAdapetr(this, color, values,desc,cofi);

        gridView.setAdapter(gridAdapetr);


        TextView name=(TextView)findViewById(R.id.showname);
        Bundle bn=getIntent().getExtras();
        String nameuser=bn.getString("username");
        name.setText(nameuser);




    }



    public void showemail(View view) {

        Bundle bn=getIntent().getExtras();
        String name=bn.getString("username");
        String email=bn.getString("email");
        String password=bn.getString("passwd");

        Intent int2=new Intent(this,user_info.class);
        Bundle bn2=new Bundle();
        bn2.putString("name",name.toString());
        bn2.putString("email",email.toString());
        bn2.putString("passwd",password.toString());
        int2.putExtras(bn2);
        startActivity(int2);


    }

    public void showemodul(View view) {

        Intent int2=new Intent(this,detaill.class);
        Bundle bn2=new Bundle();
        bn2.putString("name","daw");
        bn2.putString("desc","devlopment app web");
        bn2.putString("cofi","5");
        int2.putExtras(bn2);
        startActivity(int2);


    }

    public void gotobrowser(View view) {
        String urlString="http://elearning.univ-constantine2.dz/";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(urlString));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setPackage("com.android.chrome");
        try {
            startActivity(intent);
        }catch (ActivityNotFoundException ex){
            intent.setPackage(null);
            startActivity(intent);
        }

    }





}
