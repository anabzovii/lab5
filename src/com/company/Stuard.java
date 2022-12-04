package com.company;

import java.time.LocalDate;

public class Stuard extends Employee{

    public Stuard(String name, String surname, float salary, int company, int year, int experience,int nrpasageri, float fueltank, String model, String companyname,String countryin, String countryout, LocalDate data) {
        super(name,surname,experience,11000,nrpasageri,model,companyname,countryin,countryout,data);
    }
    public void getBonus(){
    }
}
