package com.accenture.weihnachtselfen.animals.animalshelter2;


import java.util.ArrayList;
import java.util.Scanner;

public class AnimalShelterApp {
    public void run() {
        // <> = Diamond Operator
        // <Generic>
        // ArrayList<>() -> max can be added in Brackets
        ArrayList<Animal> animals = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        AddCommando addCommando = new AddCommando();
        ShowCommando showCommando = new ShowCommando();
        RemoveCommando removeCommando = new RemoveCommando();

        System.out.println("Welcome to the animal shelter");

        boolean shouldRun = true;
        while (shouldRun) {
            System.out.println("What do you want to do?");
            String commando = scanner.nextLine();

            if ("exit".equals(commando)) {
                shouldRun = false;
            } else if ("add".equals(commando)) {
                addCommando.addAnimal(animals, scanner);
            } else if ("remove".equals(commando)) {
                removeCommando.removeAnimal(animals, scanner);
            } else if ("show".equals(commando)) {
                showCommando.showAnimals(animals);
            } else {
                System.out.println("Could not understand commando");
                showCommando.showAnimals(animals);
            }
        }
    }

    public static void main(String[] args) {
    /*    AnimalShelterApp app  = new AnimalShelterApp();
        app.run();*/
        new AnimalShelterApp().run();
    }
}
