package com.accenture.weihnachtselfen.animals.animalshelter3.castingExample;


import com.accenture.weihnachtselfen.animals.animalshelter3.animals.Animal;
import com.accenture.weihnachtselfen.animals.animalshelter3.animals.Cat;
import com.accenture.weihnachtselfen.animals.animalshelter3.animals.Octopus;

public class Casting {

    public static void main(String[] args) {
        // boxing
        double l = 100.44;
        int x = (int)l;

        // Autoboxing
        int abc = 100;
        Integer xyz = abc;
        int ccc = xyz;
        Integer integer = Integer.valueOf(abc);

        // Upcast
        // Cat -> Animal (concrete to more abstract)
        // Explicit / Implicit
        // Animal a = new Cat();
        // (Upcast can be implicit)
        // Explicit upcast: Animal a = (Animal)new Cat();
        Animal a = (Animal)new Cat();

        // Downcast:
        // Animal -> Cat (abstract to concrete)
        // Cat c1 = (Cat)a;
        // Explicit only





        Octopus o = new Octopus(1);
        o.getNumberOfTentacles();
        Animal a1 = o;

        Octopus temp = (Octopus)a1;
        temp.printInfo();


        Cat c = new Cat();
        Animal a2 = c;
        if (a2 instanceof Octopus) {


            Octopus o2 = (Octopus)a2;
            o2.printInfo();
        } else {
            System.out.println("not an octopus");
        }

    }
}

