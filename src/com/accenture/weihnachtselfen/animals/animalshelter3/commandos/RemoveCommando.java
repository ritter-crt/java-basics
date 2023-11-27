package com.accenture.weihnachtselfen.animals.animalshelter3.commandos;

import com.accenture.weihnachtselfen.animals.animalshelter3.services.AnimalService;
import com.accenture.weihnachtselfen.animals.animalshelter3.animals.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveCommando implements Commando {

    private Scanner scanner;
    private ArrayList<Animal> animals;

    public RemoveCommando(Scanner scanner, ArrayList<Animal> animals) {
        this.scanner = scanner;
        this.animals = animals;
    }

    public boolean execute() {
        Animal animal = new AnimalService().createAnimal(scanner);
        /*
        long version
        AnimalService animalservice = new AnimalService();
        Animal animal = animalservice.createAnimal(scanner);
        */
        animals.remove(animal);
        return true;
    }
    @Override
    public boolean shouldRun(String commando) {
        return "remove".equals(commando);
    }
}
