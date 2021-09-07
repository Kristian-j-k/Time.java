package com.company;

public class Main {

    public static void main(String[] args) {
	// tæller sekunder siden midnat, er ikke opdateret
       int hour = 10;
       int hourSec =hour*60*60;
       int minute = 22;
       int minuteSec =minute*60;
       int second = 40;



        int siden;
        siden = second+minuteSec +hourSec;
        int til;
      til =24*60*60-second-minuteSec+hourSec;

    // tæller sekunder siden midnat
        System.out.print(siden);
        System.out.println(" sekunder siden midnat");

    // tæller sekunder til midnat
        System.out.print(til);
        System.out.println(" sekunder til midnat");

    //percentage of the day
        float helDag = 24*60*60;
        System.out.print(helDag/til*100);
        System.out.println(" procent tilbage af dagen");
    }
}
