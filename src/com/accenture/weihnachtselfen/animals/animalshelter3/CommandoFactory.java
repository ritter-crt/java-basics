package com.accenture.weihnachtselfen.animals.animalshelter3;

import com.accenture.weihnachtselfen.animals.animalshelter3.animals.Animal;
import com.accenture.weihnachtselfen.animals.animalshelter3.commandos.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CommandoFactory {
    ArrayList<Commando> createCommandos(ArrayList<Animal> animals, Scanner scanner) {
        ArrayList<Commando> commandos = new ArrayList<>();
        commandos.add(new AddCommando(scanner, animals));
        commandos.add(new ShowCommando(animals));
        commandos.add(new RemoveCommando(scanner, animals));
        commandos.add(new EmptyCommando());
        commandos.add(new ExitCommando());
        return commandos;
    }
}
