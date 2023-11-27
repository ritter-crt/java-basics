package com.accenture.weihnachtselfen.games;

import java.util.ArrayList;
import java.util.Scanner;

public class GamesStore {

    public static final String ADD = "add";
    public static final String SHOW = "show";
    public static final String EXIT = "exit";

    public void run() {
        ArrayList<Game> games = new ArrayList<>();
        ArrayList<Commando> commandos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        AddCommando addCommando = new AddCommando(scanner, games);
        ShowCommando showCommando = new ShowCommando(games);
        ExitCommando exitCommando = new ExitCommando();

        System.out.println("Hello to my Games Store");
        /*
           System.in in is not a method
        -> it is a constant (because of final)
           part of System class
           no need for Object to get constant (because of static)
        */
        commandos.add(addCommando);
        commandos.add(showCommando);
        commandos.add(exitCommando);

        boolean shouldRun = true;
        while (shouldRun) {
            /* outside of while loop it creates an infinitive loop */
            System.out.println("What do you want to do?");
            String userInput = scanner.nextLine();
            for(Commando commando : commandos){
                if(commando.shouldRun(userInput)){
                    commando.execute();
                }
            }
   /*         if (ADD.equalsIgnoreCase(userInput)) {
                addCommando.execute();

            } else if (SHOW.equalsIgnoreCase(userInput)) {
                showCommando.execute();

            } else if (EXIT.equalsIgnoreCase(userInput)) {
                shouldRun = exitCommando.execute();

            } else {
                System.out.println("Could not understand yor commando. Please tye add, show or exit");
            }*/
        }
    }
}

