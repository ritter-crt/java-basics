package com.accenture.weihnachtselfen.animals.animalshelter;

public class Cat {
    private String name;
    int age;
    public void makeSound(){
        System.out.println("Miau" + name);
    }

    private void internalCalc(){
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
