package com.company;

import java.time.LocalDate;

abstract class Employee extends Avion implements Bonus{

    private double salary;
    private int experience;
    private String name, surname;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
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

    public Employee(String name, String surname, int experience, double basesal, int nrpasageri, String model, String companyname, String countryin, String countryout, LocalDate data) {
        super(countryin, countryout,nrpasageri,model,companyname,data);
        this.salary = basesal+(experience*70);
        this.experience = experience;
        this.name = name;
        this.surname= surname;
    }

    public void getBonus(){
        this.experience = experience+1;
    }
}
