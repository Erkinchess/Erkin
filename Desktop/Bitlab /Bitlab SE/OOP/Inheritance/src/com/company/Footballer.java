package com.company;

public class Footballer extends OlympicGames {
    String position;
    String club;

    public Footballer( int year, String city, String position, String club) {
        super( year, city);
        this.position = position;
        this.club = club;
    }
    public void play(){
        System.out.println( " year " + year + " city " + city + "position" + position + "club" + club);

    }
}

