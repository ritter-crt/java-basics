package com.accenture.weihnachtselfen.games;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowCommando extends AbstractCommando implements Commando {
    /*
    () is the entry point for variables
    final -> constants, so reference cannot be reassigned
    e.g. in class Game you would never use final,
    ArrayList<Game> is type and final
    games is reference and can be reasigned
    because variables should be updated
    */
    private final ArrayList<Game> games;

    public ShowCommando(ArrayList<Game> games) {
        this.games = games;
    }

    @Override
    public boolean execute() {
        System.out.println("Games available in the Game Store");
        for (Game game : games) {
            System.out.println("Name: " + game.getName() + "Price: " + game.getPrice());
        }
        return true;
    }

    @Override
    public boolean shouldRun(String commando) {
        return "show".equals(commando);
    }

    @Override
    public String getName() {
        return null;
    }
}
