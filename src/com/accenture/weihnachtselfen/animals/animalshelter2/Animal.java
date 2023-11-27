package com.accenture.weihnachtselfen.animals.animalshelter2;

import java.util.Objects;

public class Animal {
    protected String name;
    protected String furColor;
    protected String breed;
 /*   protected String species;*/

    Boolean isOwned = false;

    public void makeSound() {
        // empty on purpose
    }

    public void lovesEating() {

    }

    ;

   /* public boolean needsToBeWalked() {
        return false;
    };*/

    public boolean isOwned() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && Objects.equals(furColor, animal.furColor) && Objects.equals(breed, animal.breed);

    }

   /* @Override
    public int hashCode() {
        return Objects.hash(name, furColor, breed);
    }*/
}


