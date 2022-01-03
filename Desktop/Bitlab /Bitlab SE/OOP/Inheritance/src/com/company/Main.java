package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Gymnast g1 = new Gymnast(2000,"Sydney ",180,80," Star");
        Gymnast g2 = new Gymnast(2000,"Sydney ",180,80," Jump");
        Gymnast g3 = new Gymnast(2000,"Sydney ",180,80," Triangle");
        Footballer f1 = new Footballer(2004,"Athens "," midfielder"," Barsa");
        Footballer f2 = new Footballer(2004,"Athens "," defender"," Real Madrid");
        Footballer f3 = new Footballer(2004,"Athens "," forward"," Barsa");
        Swimmer s1 = new Swimmer(2008,"Beijing "," Butterfly ",11.2);
        Swimmer s2 = new Swimmer(2008,"Beijing "," Butterfly ",11.3);
        Swimmer s3 = new Swimmer(2008,"Beijing "," Butterfly ",11.4);

        OlympicGames[] olympicGames = {g1,g2,g3,f1,f2,f3,s1,s2,s3};
        for (int i=0; i< olympicGames.length; i++){
           olympicGames[i].play();
        }
    }
}

