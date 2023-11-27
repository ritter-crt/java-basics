package com.accenture.weihnachtselfen.animals.animalshelter3;

import com.accenture.weihnachtselfen.animals.animalshelter3.animals.Animal;
import com.accenture.weihnachtselfen.animals.animalshelter3.commandos.*;

import java.util.ArrayList;
import java.util.Scanner;


/*One class -> one task, one method -> one task*/
public class AnimalShelterApp {

    public void run() {

        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        ArrayList<Commando> commandos =
                new CommandoFactory().createCommandos(animals, scanner);

        System.out.println("Welcome to my animal shelter");

        boolean shouldRun = true;
        while (shouldRun) {
            System.out.println("What do you want to do?");
            String userCommando = scanner.nextLine();
            System.out.println("You wrote: " + userCommando);

            for (Commando commando : commandos) {
                if (commando.shouldRun(userCommando)) {
                    commando.execute();
                }
            }
        }
    }

    public static void main(String[] args) {
        new AnimalShelterApp().run();
    }
}
