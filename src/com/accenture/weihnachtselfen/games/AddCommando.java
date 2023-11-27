package com.accenture.weihnachtselfen.games;

import com.accenture.weihnachtselfen.animals.animalshelter3.animals.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class AddCommando implements Commando {

    private final Scanner scanner;
    private final ArrayList<Game> games;

    /*
    Java doesn't allow to write method without return statement
    unless its the same name as class, which is a constructor
    */

    public AddCommando(Scanner scanner, ArrayList<Game> games) {
        this.scanner = scanner;
        this.games = games;
        // AddCommando returns an Object -> implicit return */
    }

    @Override
    public boolean execute() {
        // new generates space in memory
        Game game = new Game();

        /* set  gameName */
        System.out.println("What is the name of the game you want to add?");
        String gameName = scanner.nextLine();
        game.setName(gameName);
        if (gameName.isEmpty()) {
            System.out.println("You need to provide the name");
            return true;
        }

        /* set  gamePrice */
        System.out.println("What is the price of the game you want to add?");
        String gamePrice = scanner.nextLine();
        game.setPrice(Integer.parseInt(gamePrice));
        if (gamePrice.isEmpty()) {
            System.out.println("You need to provide the price");
            return true;
        }

        /* add game to list */
        games.add(game);
        return true;
    }

    @Override
    public boolean shouldRun(String commando) {
        return "add".equals(commando);
    }

    public static void main(String[] args) {
        GamesStore gamesStore = new GamesStore();
        gamesStore.run();
    }
}