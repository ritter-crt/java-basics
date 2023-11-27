package com.accenture.weihnachtselfen.animals.animalshelter3.commandos;

import com.accenture.weihnachtselfen.animals.animalshelter3.animals.Animal;

import java.util.ArrayList;

public class ShowCommando implements Commando {

    private ArrayList<Animal> animals;

    public ShowCommando(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public boolean execute() {
        for (Animal animal : animals) {
            if (animal != null) {

                /*
                Casting is possible, but we should avoid code like this:
                move responsiblity to the class itself
                if (animal instanceof Octopus) {
                    Octopus octopus = (Octopus)animal;
                    System.out.println("Octopus tentacles: " + octopus.getNumberOfTentacles());
                }
                */
                /* System.out.println(animal.needsToBeWalked);*/
                animal.printInfo();
                animal.makeSound();
            }
        }
        return false;
    }

    @Override
    public boolean shouldRun(String commando) {
        return "show".equals(commando);
    }
}
