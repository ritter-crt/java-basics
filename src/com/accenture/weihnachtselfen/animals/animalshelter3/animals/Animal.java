package com.accenture.weihnachtselfen.animals.animalshelter3.animals;


import java.util.Objects;

public class Animal {
    protected String name;
    protected String color;
    protected String breed;
    Boolean needsToBeWalked = false;

    public void makeSound() {
        //empty on purpose
    }


   public void lovesEating() {

    }
    public void printInfo() {
        System.out.println(
                "This animal is named " + name + "\n" +
                        "Color: " + color + "\n" +
                        "Breed: " + breed
        );
    }

    public boolean needsToBeWalked() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, breed);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
