package com.accenture.weihnachtselfen.animals.animalshelter2;

import java.util.ArrayList;

public class ShowCommando {
    /**
     * Shows all animals from a animal list
     *
     * @param animals the animals to print
     */
    public void showAnimals(ArrayList<Animal> animals) {
     /*
     for (type variable : arrayname) {}
     */
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println("Animals name is: " + animal.name);
                System.out.println("Animals fur color is: " + animal.furColor);
                System.out.println("Animals makes sound: ");
                animal.makeSound();
                System.out.println("Animals loves eating: ");
                animal.lovesEating();
            }
        }
    }
}