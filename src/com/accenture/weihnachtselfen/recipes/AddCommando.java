package com.accenture.weihnachtselfen.recipes;

import java.util.ArrayList;
import java.util.Scanner;


public class AddCommando {
    /**
     *
     * @param recipes
     * @param scanner
     */
  /*
  his part declares the parameters that the addRecipe method takes. In this case, it takes two parameters:
  Two Parameters:
    - ArrayList<Recipe> recipes:
         - parameter is of type ArrayList<Recipe>
         - -> means that the method expects an ArrayList of objects of the Recipe class
    - Scanner scanner
        - parameter is of type Scanner
    */

    public void addRecipe(ArrayList<Recipe> recipes, Scanner scanner) {

        /*
        declares a variable named recipe of type Recipe and
        initializes it with a new instance of the Recipe class
        creates a new recipe object that can be used within the addRecipe method
        */
        Recipe recipe = new Recipe();

        System.out.println("What is ingredient 1?");
        String ingredient1 = scanner.nextLine();
        recipe.setIngredient1(ingredient1);

        System.out.println("What is ingredient 2?");
        String ingredient2 = scanner.nextLine();
        recipe.setIngredient2(ingredient2);

        System.out.println("What is ingredient 3?");
        String ingredient3 = scanner.nextLine();
        recipe.setIngredient3(ingredient3);

        recipes.add(recipe);
    }
}
