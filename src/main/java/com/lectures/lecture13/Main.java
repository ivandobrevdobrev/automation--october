package com.lectures.lecture13;

public class Main {
    public static void main(String[] args) {
        FirmaET firma = new FirmaET("Redaok","12/02/2020","85864kljkiui","Ivan",1000,1500);

        System.out.println(firma.revenue());
        System.out.println(firma.bustastSymbol("dddmkasjdkhsad"));
        firma.sponsorFootball();// izvikvame interfeisite
        firma.sponsorKidsPrograms();//izvikvame interfeisite

    }
}
