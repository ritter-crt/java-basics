package com.accenture.weihnachtselfen.animals.animalshelter3.services;

import com.accenture.weihnachtselfen.animals.animalshelter3.animals.*;

import java.util.Scanner;

public class AnimalService {

    public static final String CAT = "cat";
    public static final String DOG = "dog";
    public static final String DUCK = "duck";
    public static final String OCTOPUS = "octopus";

    public Animal createAnimal(Scanner scanner) {
        System.out.println("What is the animal's name?");
        String animalName = scanner.nextLine();

        System.out.println("What is the animal's species?");
        String animalSpecies = scanner.nextLine();

        System.out.println("What is the animal's color?");
        String animalColor = scanner.nextLine();

        Integer tentacles = null;
        if ("octopus".equals(animalSpecies)) {
            System.out.println("How many tentacles are left?");
            tentacles = Integer.parseInt(scanner.nextLine());
        }

        Animal animal = null;

        if (CAT.equalsIgnoreCase(animalSpecies)) {
            animal = new Cat();
        } else if (DOG.equalsIgnoreCase(animalSpecies)) {
            animal = new Dog();
        } else if (DUCK.equalsIgnoreCase(animalSpecies)) {
            animal = new Duck();
        } else if (OCTOPUS.equalsIgnoreCase(animalSpecies)) {
            animal = new Octopus(tentacles);
        } else {
            animal = new Dog();
        }

        animal.setName(animalName);
        animal.setColor(animalColor);
        return animal;
    }

    ;


}
