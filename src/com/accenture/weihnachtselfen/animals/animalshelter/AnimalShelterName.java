package com.accenture.weihnachtselfen.animals.animalshelter;


public class AnimalShelterName {

    public static void main(String[] args) {
        Cat c1 = new Cat();

        // "Simon" der Wert eines Strings
        // "Simon" erzeugt ein String Object
        // n = eine Variable von Typ String
        String n = "Simon";

        // n wird zum "Argument" od. "Parameter" von setName
        c1.setName(n);


        Cat c2 = new Cat();
        c2.setName("Paula");

        String c2Name = c2.getName();
        System.out.println(c2Name);

        c1.makeSound();
        c2.makeSound();
    }
}
