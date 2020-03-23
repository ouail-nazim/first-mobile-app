package com.example.login;

import android.widget.ArrayAdapter;

public class module  {

    private String namemodule;
    private String decsmodule;
    private int cofi;


    public module( String namemodule, String decsmodule,int cofi) {
        this.namemodule=namemodule;
        this.decsmodule=decsmodule;
        this.cofi=cofi;
    }

    public String getNamemodule() {
        return namemodule;
    }

    public String getDecsmodule() {
        return decsmodule;
    }

    public int getCofi() {
        return cofi;
    }
}


