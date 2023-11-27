package com.accenture.weihnachtselfen.examples;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        System.out.println("Welcome to Christinas Flower Shop. How many flowers would you like?");
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        // reads linebreak
        scanner.nextLine();

        // oder stattdessen
        // int stringToNum = Integer.parseInt(amount);

        String[] flowers = new String[amount];

        int addedFlowers = 0;
        boolean shouldRun = true;

        while (shouldRun) {

            System.out.println("User wants " + amount + " flowers. Please type add to name the flowers you'd like");
            String commando = scanner.nextLine();

            if ("add".equalsIgnoreCase(commando)) {
                System.out.println("Great! Please tell me the flowers that you'd like.");
                String flowerName = scanner.nextLine();

                if (addedFlowers < flowers.length) {
                    flowers[addedFlowers] = flowerName;
                    addedFlowers++;
                    System.out.println("Added " + flowerName );
                } else {
                    System.out.println("No flowers available anymore");
                }
            } else if ("show".equalsIgnoreCase(commando)) {
                for (String flower : flowers) {
                    System.out.println( flower);
                }
            } else if ("exit".equalsIgnoreCase(commando)) {
                shouldRun = false;
            }
        }
    }
}
