package com.accenture.weihnachtselfen.recipes;

import java.util.ArrayList;

public class ShowCommando {
    /**
     * Shows all recipes from a recipe list
     * @param recipes the recipes to print
     */
    public void showRecipes(ArrayList<Recipe> recipes) {
     /*
     for (type variable : arrayname) {}
     */
        for (Recipe recipe : recipes) {
            if (recipe != null) {
                System.out.println("Recipe:");
                System.out.println("Ingredient 1:" + recipe.getIngredient1());
                System.out.println("Ingredient 2:" + recipe.getIngredient2());
                System.out.println("Ingredient 3:" + recipe.getIngredient3());
            }
        }
    }
}