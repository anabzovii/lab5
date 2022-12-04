package com.company;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Company comp = new Company("AirMoldova");

        String countrylist[]={"Moldova", "Germany", "Italy", "France", "Denmark", "England","China"};
        double[][] pricecountry={{0,6000,4700,8000,7400,9000,11000},
                                 {6000,0,3000,4000,3700,2500,6000},
                                 {4700,3000,0,2000,4000,5500,7900},
                                 {8000,4000,2000,0,3500,4900,7400},
                                 {7400,2500,5500,3500,0,1900,7600},
                                 {9000,2500,5500,4900,1900,0,8500},
                                 {11000,6000,7900,7400,7600,8500,0}};

        String modellist[]={"Boeing","SU-277","Berlin","Delphin","Shark-3500"};

        String names[]= {"Mohamed", "Youssef", "Ahmed", "Mahmoud", "Mustafa", "Yassin", "Taha", "Khaled", "Hamza", "Bilal", "Ibrahim", "Hassan", "Hussein", "Karim", "Tareq", "Abdel-Rahman", "Ali", "Omar", "Halim", "Murad", "Selim", "Abdallah"};
        String surnames[]={"Peeters", "Janssens", "Maes","Jacobs","Wouters", "Lambert", "Martin"};



        int flynr;
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type the number of flights : ");
        flynr=keyboard.nextInt();
        Avion avia[]= new Avion[9999];
        Pilot pilot[]= new Pilot[9999];

        double costs[]= new double[flynr];
        double clientcost[]=new double[flynr];
        double profit = 0;
        for(int i=0;i<flynr;i++){
            int country1 = rand.nextInt(6);
            int country2 = rand.nextInt(6);
            while(country1==country2){
                country2 = rand.nextInt(6);}
            int nrpass = rand.nextInt(15,20);
            int modelrnd = rand.nextInt(5);

            System.out.println("---------------------------------------------------------------");

            avia[i]=new Avion(countrylist[country1],countrylist[country2],nrpass,modellist[modelrnd], comp.getName(), LocalDate.now().plusDays(1));
            int namern = rand.nextInt(15);
            int surrnd = rand.nextInt(7);
            int ratingpilot= rand.nextInt(120);
            pilot[i]=new Pilot(names[namern],surnames[surrnd],ratingpilot,avia[i].getNrpasageri(),avia[i].getModel(), comp.getName(), avia[i].getCountryin(),avia[i].getCountryout(),avia[i].getData());
            System.out.println("Airplane "+ avia[i].getModel()+ " was established for flight "+avia[i].getCountryin()+" - "+avia[i].getCountryout() + " |ID: "+avia[i].getId());
            Client clients[]=new Client[avia[i].getNrpasageri()];
            Bilet tickets[]=new Bilet[avia[i].getNrpasageri()];
            double costfly = avia[i].getNrpasageri()*pricecountry[country1][country2];
            double currentcost = 0 ;
            double coefticket = 0.9;
            int ticketnumber=0;
            costs[i]=costfly;


            for(int j=0;j<avia[i].getNrpasageri();j++){
                namern = rand.nextInt(15);
                surrnd = rand.nextInt(7);
                clients[j] = new Client(names[namern],surnames[surrnd],avia[i].getCountryin(),avia[i].getCountryout(),pricecountry[country1][country2]*coefticket,avia[i].getData(),avia[i].getNrpasageri(),avia[i].getModel(), comp.getName());
                System.out.println("Client "+ clients[j].getName()+ " "+ clients[j].getSurname()+ " want to buy a ticket for this flight for price: "+ clients[j].getPrice()+ " |ID: "+ clients[j].getId());
                int decline = rand.nextInt(100);
                if(decline>80){
                    System.out.println("Client "+ clients[j].getName()+ " "+ clients[j].getSurname()+ " refused to buy !");
                }
                else {
                    tickets[ticketnumber] = new Bilet(clients[j].getCountryin(),clients[j].getCountryout(),clients[j].getPrice(),clients[j].getData(),clients[j].getNrpasageri(),clients[j].getModel(), comp.getName());
                    coefticket+=0.06;
                    System.out.println("Client "+ clients[j].getName()+ " "+ clients[j].getSurname()+ " bought the ticket |ID: " +tickets[ticketnumber].getId());
                    ticketnumber++;
                    currentcost+=clients[j].getPrice();
                }
            }
            int flycancel = rand.nextInt(100);
            if(flycancel>95){
                System.out.println("Flight was canceled because of airplane defection! All payments will be refunded");
                clientcost[i]=-5000;
            }
            else {
                clientcost[i] = currentcost;
                System.out.println("Pilot " + pilot[i].getName() + " " + pilot[i].getSurname() + " is ready for flight! |ID: " + pilot[i].getId());
                System.out.println("Pilot rank before flight : " + pilot[i].getExperience());
                pilot[i].setExperience(pilot[i].getExperience() + 1);
                System.out.println("Pilot rank after flight : " + pilot[i].getExperience());
                System.out.println("Pilot current sallary: " + pilot[i].getSalary());
                System.out.println("Cost: " + costfly + " Currentcost: " + currentcost);
            }
        }

        double contor1=0;double contor2=0;
        for(int p=0;p<flynr;p++){
            contor1+=costs[p];
            contor2+=clientcost[p];
        }
        profit = contor2-contor1;
        System.out.println("Company profit = "+ profit);
    }
}
