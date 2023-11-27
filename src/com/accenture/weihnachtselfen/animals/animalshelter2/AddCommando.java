package com.accenture.weihnachtselfen.animals.animalshelter2;

import java.util.Scanner;
import java.util.ArrayList;


public class AddCommando {
    /**
     * @param animals
     * @param scanner
     */
  /*
  his part declares the parameters that the addAnimal method takes. In this case, it takes two parameters:
  Two Parameters:
    - ArrayList<Animal> animals:
         - parameter is of type ArrayList<Animal>
         - -> means that the method expects an ArrayList of objects of the Animal class
    - Scanner scanner
        - parameter is of type Scanner
    */
    public void addAnimal(ArrayList<Animal> animals, Scanner scanner) {

        /*
        declares a variable named animal of type Animal and
        initializes it with a new instance of the Animal class
        creates a new animal object that can be used within the addAnimal method
        */

        System.out.println("What is the animals name?");
        String animalName = scanner.nextLine();

        System.out.println("What is the animals species");
        String species = scanner.nextLine();

        System.out.println("What is the animals fur color?");
        String animalFurColor = scanner.nextLine();

        Animal animal = null;

        if ("cat".equalsIgnoreCase(species)) {
            animal = new Cat();
        } else if ("dog".equalsIgnoreCase(species)) {
            animal = new Dog();
        } else if ("mouse".equalsIgnoreCase(species)) {
            animal = new Mouse();
        } else if ("duck".equalsIgnoreCase(species)) {
            animal = new Duck();
        } else {
            animal = new Dog();
        }

        animal.name = animalName;
        animals.add(animal);

        animal.furColor = animalFurColor;
        animals.add(animal);
    }
}
