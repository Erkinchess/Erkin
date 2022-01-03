package com.company;

public class OlympicGames {

    int year;
    String city;


    public OlympicGames(int year, String city) {
        this.year = year;
        this.city = city;
    }
    public void play(){
        System.out.println( " year " + year + " city " + city);
    }
}
