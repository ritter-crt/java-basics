package com.accenture.weihnachtselfen.animals.animalshelter3.animals;

public class Octopus extends Animal {
    private int numberOfTentacles = 8;

    public Octopus(int numberOfTentacles) {
        this.numberOfTentacles = numberOfTentacles;
    }

    public int getNumberOfTentacles() {
        return numberOfTentacles;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("And this animal has " + numberOfTentacles + " tentacles");
    }

    @Override
            public void makeSound(){
        System.out.println("Blub Blub");
    }

    @Override
    public boolean needsToBeWalked() {
        return false;
    }
}
