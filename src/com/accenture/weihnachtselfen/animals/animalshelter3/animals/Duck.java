package com.accenture.weihnachtselfen.animals.animalshelter3.animals;

public class Duck extends Animal {

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("quack quack");
    }
    public void lovesEating() {
        System.out.println("Chocolate");
    }

}
