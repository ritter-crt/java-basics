package com.accenture.weihnachtselfen.examples;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        String[] names = new String[6];
        names[0] = "Merle";
        names[1] = "Melina";
        names[2] = "Julia H.";
        names[3] = "Julia W.";
        names[4] = "Lars";
        names[5] = "Christina";

        for (int i = 0; i < names.length; i++) {
        }

        for (String name2: names){
            System.out.println("Hello " + name2 + "!");
        }
    }
}