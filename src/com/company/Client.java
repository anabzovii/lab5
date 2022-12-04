package com.company;

import java.time.LocalDate;
import java.util.UUID;

public class Client extends Bilet {
    private int nrzboruri;
    private String name, surname;

    public UUID getId(){
        return id;
    }

    public int getNrzboruri() {
        return nrzboruri;
    }

    public void setNrzboruri(int nrzboruri) {
        this.nrzboruri = nrzboruri;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Client(String name, String surname, String countryin, String countryout, double price, LocalDate data, int nrpasageri, String model, String companyname) {
        super(countryin,countryout,price,data,nrpasageri,model,companyname);
        this.nrzboruri = this.getNrzboruri();
        this.name = name;
        this.surname = surname;
    }
}
