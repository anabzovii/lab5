package com.company;

import java.time.LocalDate;
import java.util.UUID;

public class Avion extends Company{
    private int nrpasageri;
    private String model;
    private String countryin;
    private String countryout;
    private LocalDate data;

    public UUID getId(){
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getNrpasageri() {
        return nrpasageri;
    }

    public void setNrpasageri(int nrpasageri) {
        this.nrpasageri = nrpasageri;
    }

    public String getCountryin() {
        return countryin;
    }

    public void setCountryin(String countryin) {
        this.countryin = countryin;
    }

    public String getCountryout() {
        return countryout;
    }

    public void setCountryout(String countryout) {
        this.countryout = countryout;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Avion(String countryin, String countryout,int nrpasageri,  String model, String companyname,  LocalDate data) {
        super(companyname);
        this.data = data;
        this.nrpasageri = nrpasageri;
        this.model=model;
        this.countryin = countryin;
        this.countryout = countryout;
    }

}
