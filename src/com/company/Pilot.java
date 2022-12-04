package com.company;

import java.time.LocalDate;

public class Pilot extends Employee {


    public Pilot(String name, String surname, int experience,int nrpasageri, String model, String companyname,String countryin, String countryout, LocalDate data) {
        super(name,surname,experience,11000,nrpasageri,model,companyname,countryin,countryout,data);

    }

    public void getBonus(){
    }
}
