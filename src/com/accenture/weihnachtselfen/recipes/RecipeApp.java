package com.accenture.weihnachtselfen.recipes;

import java.util.ArrayList;
import java.util.Scanner;

public class RecipeApp {
    public void run() {
        // <> = Diamond Operator
        // <Generic>
        // ArrayList<>() -> max can be added in Brackets
        ArrayList<Recipe> recipes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        AddCommando addCommando = new AddCommando();
        ShowCommando showCommando = new ShowCommando();

        System.out.println("Welcome to my recipe book");

        boolean shouldRun = true;
        while (shouldRun) {
            System.out.println("What do you want to do?");
            String commando = scanner.nextLine();
            System.out.println("You wrote: ");

            if ("exit".equals(commando)) {
                shouldRun = false;
            } else if ("add".equals(commando)) {
                addCommando.addRecipe(recipes, scanner);
            } else {
                System.out.println("Could not understand commando");
                showCommando.showRecipes(recipes);
            }
        }
    }

    public static void main(String[] args){
        RecipeApp app  = new RecipeApp();
        app.run();
       /*RecipeApp = new RecipeApp();*/
    }
}