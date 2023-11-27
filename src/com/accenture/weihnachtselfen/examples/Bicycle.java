package com.accenture.weihnachtselfen.examples;

public class Bicycle {
    int gear;
    int cadence;
    int speed;

 /*   public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }*/

    // Or:
    public Bicycle(int gear, int cadence, int speed) {
        this.gear = gear;
        this.cadence = cadence;
        this.speed = speed;
    }

};
