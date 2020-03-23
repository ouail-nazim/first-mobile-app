package com.example.login;

public class CountryItem {

    private String nameCountry;
    private int idFlagCountry;


    public CountryItem(String nameCountry,int idFlagCountry) {
        this.nameCountry=nameCountry;
        this.idFlagCountry=idFlagCountry;
    }

    public int getIdFlagCountry() {
        return idFlagCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }
}
