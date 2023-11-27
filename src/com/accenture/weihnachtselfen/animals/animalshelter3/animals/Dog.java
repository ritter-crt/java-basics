package com.accenture.weihnachtselfen.animals.animalshelter3.animals;

// links das Konkrete, rechts das Abstrakte
// man kann nicht von 2 Klassen vererben
//no multi-inheritance (only in C++)

public class Dog extends Animal {

    public Dog() {
        needsToBeWalked = true;
        System.out.println("Needs to be walked");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("wuff wuff");
    }

    public void lovesEating() {
        System.out.println("Leftovers");
    }
}
