package com.accenture.weihnachtselfen.browniePoints;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;

public class BrowniePointsApp {
    public void run() {
        System.out.println("Hello to the Weihnachtselfen Brownie Points calculator" + "\n" + "What do you want to do");
        System.out.println("What is the name of the student?");
        System.out.println("To add points, please type 'add' " + "\n" + "To subtract well deserved points, please type 'substract'");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("User wrote " + userInput);
        if ("add".equals(userInput)) {
            System.out.println("What is the name of the student");
        } else if ("subtract".equals(userInput)){
            System.out.println("");
        } else {
            System.out.println("Could not understand commando");
        }
    }

    public static void main(String[] args) {
        BrowniePointsApp browniePointsApp = new BrowniePointsApp();
        browniePointsApp.run();
    }
}