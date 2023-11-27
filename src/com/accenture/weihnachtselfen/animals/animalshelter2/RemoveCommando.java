package com.accenture.weihnachtselfen.animals.animalshelter2;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveCommando {

    public void removeAnimal(ArrayList<Animal> animals, Scanner scanner) {
        System.out.println("What is the name of the animal you would like to remove?");
        String animalName = scanner.nextLine();

        System.out.println("What is the fur color of the animal you would like to remove?");
        String furColor = scanner.nextLine();
     /* lambda -> moderner Syntax */
        animals.removeIf(animal -> animal.name.equalsIgnoreCase(animalName) && animal.furColor.equalsIgnoreCase(furColor));
    }
}
