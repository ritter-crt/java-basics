package com.accenture.weihnachtselfen.animals.animalshelter3.commandos;

import com.accenture.weihnachtselfen.animals.animalshelter3.services.AnimalService;
import com.accenture.weihnachtselfen.animals.animalshelter3.animals.Animal;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @param animals the target list of animals
 * @param scanner the scanner to read the input from
 */
public class AddCommando implements Commando {

    private final Scanner scanner;
    private final ArrayList<Animal> animals;
    /*
    default constructor (is generated, if not written)
    if one constructor is initialized, there is no default constructor
    generated -> usually only one constructor per class
    public AddCommando(){
        super();
    }
    */

    public AddCommando(Scanner scanner, ArrayList<Animal> animals) {
        this.scanner = scanner;
        this.animals = animals;
    }

    @Override
    public boolean execute() {
        Animal animal = new AnimalService().createAnimal(scanner);
        /*
        long version:
        AnimalService animalService = new AnimalService();
        Animal animal2 = animalService.createAnimal(scanner);
         */

        animals.add(animal);
        return true;
    }

    @Override
    public boolean shouldRun(String commando) {
        return "add".equals(commando);
    }
}
