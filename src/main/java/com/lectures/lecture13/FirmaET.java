package com.lectures.lecture13;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FirmaET extends Compnay implements Contribute{
    private String ownerName;
    private double initialCapital;
    private double actualCapital;

    public FirmaET(String name, String dateEstablished, String bulstat, String ownerName, double initialCapital, double actualCapital) {
        super(name, dateEstablished, bulstat);
        this.ownerName = ownerName;
        this.initialCapital = initialCapital;
        this.actualCapital = actualCapital;
    }
public double revenue() {
    double result = actualCapital - initialCapital;
    return result;
}

    @Override
    public void sponsorFootball() {
        System.out.println(" Needs to contribute with 20% of revenue to local football club");
    }

    @Override
    public void sponsorKidsPrograms() {
        System.out.println(" Needs to sponsor different kids sport events");

    }
}



