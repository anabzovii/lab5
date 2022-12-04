package com.company;

import java.time.LocalDate;
import java.util.UUID;

public class Bilet extends Avion{
    private double price;
    private LocalDate data;

    public UUID getbiletId(){
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    public Bilet(String countryin, String countryout, double price, LocalDate data, int nrpasageri,  String model, String companyname) {
        super(countryin, countryout, nrpasageri,model,companyname, data);
        this.price = price;
    }
}