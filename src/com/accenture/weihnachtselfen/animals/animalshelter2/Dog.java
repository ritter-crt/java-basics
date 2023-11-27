package com.accenture.weihnachtselfen.animals.animalshelter2;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        /*super.makeSound();*/
        System.out.println("Wuff wuff");
    }

    ;

    public void lovesEating() {
        System.out.println("Leftovers");
    }

    // ohne void ist Rückgabewert implizit
    public Dog (){
        isOwned = true;
        System.out.println("Needs to be walked");

    }

    /*@Override
    public boolean needsToBeWalked() {
        return true;
    }*/

    ;

}

