package com.company;

public class Swimmer extends OlympicGames {
    String style;
    double recordTime;

    public Swimmer( int year, String city, String style, double recordTime) {
        super( year, city);
        this.style = style;
        this.recordTime = recordTime;
    }

    public void play() {
        System.out.println( "year " + year + " city " + city + "style" + style + "recordTime" + recordTime);
    }
}