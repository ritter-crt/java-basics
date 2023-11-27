package com.accenture.weihnachtselfen.animals.animalshelter;

import java.util.Scanner;

public class AnimalShelter {
    public static void main(String[] args) {
        System.out.println("Welcome to the animal shelter");
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[3];
        int addedAnimals = 0;
        boolean shouldRun = true;
        while (shouldRun) {
            String commando = scanner.nextLine();
            System.out.println("User wrote: " + commando);

            if ("add".equalsIgnoreCase(commando)) {
                System.out.println("Please tell me your animal name:");
                String animalName = scanner.nextLine();

                if (addedAnimals < names.length) {
                    names[addedAnimals] = animalName;
                    addedAnimals++;
                    System.out.println("Added " + animalName);
                } else {
                    System.out.println("Animal shelter is full");
                }
            } else if ("show".equalsIgnoreCase(commando)) {
                System.out.println("Animals in this shelter: ");
                for (String name : names) {
                    System.out.println("Animal: " + name);
                }
            } else if ("exit".equalsIgnoreCase(commando)) {
                shouldRun = false;
            }
        }
    }
}
