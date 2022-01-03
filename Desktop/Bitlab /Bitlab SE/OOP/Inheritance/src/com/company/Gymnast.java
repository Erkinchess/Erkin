package com.company;

public class Gymnast extends OlympicGames {
    int height;
    int weight;
    String style;

    public Gymnast(int year, String city, int height, int weight, String style) {
        super( year, city);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }

    public void play() {
        System.out.println( " year " + year + " city " + city + "height" + height + "weight" + weight + "style" + style);
    }
}