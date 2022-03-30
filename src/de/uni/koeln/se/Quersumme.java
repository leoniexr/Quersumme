package de.uni.koeln.se;

public class Quersumme {
    public static void main(String[] args) {

        int zahl = 155;     // Meine Zahl

        //    Quersumme in dem fall 1+5+5 = 11
        System.out.println("Quersumme = " + quersumme(zahl));
    }
    public static int quersumme(int zahl) {

        if (zahl <= 9) return zahl;              // 9 größer gleich zahl
        return zahl%10 + quersumme(zahl/10);    // % -> letze Ziffer der Zahl zurück
    }
}