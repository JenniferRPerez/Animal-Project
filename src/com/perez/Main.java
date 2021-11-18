package com.perez;

import javax.swing.*;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

import static com.perez.AnimalCount.processData;

public class Main {

    public static void main(String[] args) {

        Map<Person, List<Animal>> owners_and_their_pets = new HashMap<>();

        Person marc = new Person("Marc");
        List<Animal> marcs_pets = new ArrayList<>();
        marcs_pets.add(new Cat("Zipper"));
        marcs_pets.add(new Cat("Waffles"));
        owners_and_their_pets.put(marc, marcs_pets);

        Person krystal = new Person("Krystal");
        List<Animal> krystal_pets = new ArrayList<>();
        krystal_pets.add(new Cat("Lili"));
        krystal_pets.add(new Cat("Lulu"));
        krystal_pets.add(new Hamster("Lemon"));
        krystal_pets.add(new Dog("Penny"));
        krystal_pets.add(new Cat("Gus"));
        owners_and_their_pets.put(krystal, krystal_pets);

        // Bob
        Person bob = new Person("Bob");
        List<Animal> bobs_pets = new ArrayList<>();
        owners_and_their_pets.put(bob, bobs_pets);

        // Heritier
        Person heritier = new Person("Heritier");
        List<Animal> heritier_pets = new ArrayList<>();
        heritier_pets.add(new Dog("Roxie"));
        owners_and_their_pets.put(heritier, heritier_pets);

        // Chris R
        Person ChrisR = new Person("Chris R");
        List<Animal> chris_pets = new ArrayList<>();
        chris_pets.add(new Dog("Sasha"));
        chris_pets.add(new Dog("Magie"));
        chris_pets.add(new Dog("Siren"));
        chris_pets.add(new Hamster("Unknown"));
        chris_pets.add(new Dog("Gypsy"));
        chris_pets.add(new Cat("Carter"));
        owners_and_their_pets.put(ChrisR, chris_pets);

        // Jace
        Person jace = new Person("Jace");
        List<Animal> jace_pets = new ArrayList<>();
        jace_pets.add(new Cat("Snowball"));
        jace_pets.add(new Cat("Padme Amidala"));
        jace_pets.add(new Cat("Guenivere"));
        jace_pets.add(new HedgeHog("Amira"));
        owners_and_their_pets.put(jace, jace_pets);

        // Barry
        Person barry = new Person("Barry");
        List<Animal> barrys_pets = new ArrayList<>();
        barrys_pets.add(new Dog("Max"));
        barrys_pets.add(new Dog("Rocky"));
        barrys_pets.add(new Dog("Tiger"));
        barrys_pets.add(new Dog("Pepper"));
        barrys_pets.add(new Dog("Julius"));
        barrys_pets.add(new Dog("T-bone"));
        owners_and_their_pets.put(barry, barrys_pets);

        // Kris
        Person kris = new Person("Kris");
        List<Animal> kris_pets = new ArrayList<>();
        kris_pets.add(new Cat("Sokka"));
        kris_pets.add(new Cat("Katara"));
        kris_pets.add(new Dog("Koda"));
        kris_pets.add(new Dog("Bailey"));
        owners_and_their_pets.put(kris, kris_pets);

        // Mike
        Person mike = new Person("Mike");
        List<Animal> mikes_pets = new ArrayList<>();
        mikes_pets.add(new Dog("Rocket"));
        mikes_pets.add(new Cat("Kitty-go"));
        mikes_pets.add(new Dog("Pudge"));
        owners_and_their_pets.put(mike, mikes_pets);

        // Emma
        Person emma = new Person("Emma");
        List<Animal> emma_pets = new ArrayList<>();
        emma_pets.add(new Frog("Gleeb"));
        emma_pets.add(new Frog("Gloob"));
        emma_pets.add(new Frog("Greg"));
        emma_pets.add(new Frog("Grace"));
        emma_pets.add(new Frog("Fiona"));
        emma_pets.add(new Dog("Teddy"));
        emma_pets.add(new Dog("Elliot"));
        emma_pets.add(new Fish("Gilles"));
        owners_and_their_pets.put(emma, emma_pets);

        // Jacob
        Person jacob = new Person("Jacob");
        List<Animal> jacob_pets = new ArrayList<>();
        jacob_pets.add(new Cat("Oliver"));
        jacob_pets.add(new Dog("Piper"));
        jacob_pets.add(new Dog("Jax"));
        jacob_pets.add(new Cat("Nugget"));
        owners_and_their_pets.put(jacob, jacob_pets);


        //Derrick
        Person derrick = new Person("Derrick");
        List<Animal> derrick_pets = new ArrayList<>();
        derrick_pets.add(new Cat("Luke"));
        derrick_pets.add(new Cat("Viper"));
        derrick_pets.add(new Dog("Jade"));
        derrick_pets.add(new Dog("Leo"));
        derrick_pets.add(new Dog("Rezi"));
        derrick_pets.add(new Cat("Foobles"));
        derrick_pets.add(new Cat("Kooey"));
        owners_and_their_pets.put(derrick, derrick_pets);

        //Andrew ------------------
        Person andrew = new Person("Andrew");
        List<Animal> andrews_pets = new ArrayList<>();
        andrews_pets.add(new Cat("Mew-mew"));
        andrews_pets.add(new Dog("Prince"));
        andrews_pets.add(new Dog("Rusty"));
        andrews_pets.add(new Turtle("Speedy"));
        andrews_pets.add(new Dog("Shadow"));
        owners_and_their_pets.put(andrew, andrews_pets);


        // Mujo
        Person mujo = new Person("Mujo");
        List<Animal> mujo_pets = new ArrayList<>();
        mujo_pets.add(new Dog("dog"));
        owners_and_their_pets.put(mujo, mujo_pets);


        // Asa
        Person asa = new Person("Asa");
        List<Animal> asa_pets = new ArrayList<>();
        asa_pets.add(new Dog("Fenton"));
        asa_pets.add(new Dog("Lacy"));
        asa_pets.add(new Dog("Captain"));
        asa_pets.add(new Dog("Ruby"));
        owners_and_their_pets.put(asa, asa_pets);


        // big strong >:)
        Person alaina = new Person("Alain");
        List<Animal> ala_pets = new ArrayList<>();
        ala_pets.add(new Hamster("Hamtaro"));
        ala_pets.add(new Fish("Ghost"));
        ala_pets.add(new Bird("Lemon"));
        owners_and_their_pets.put(alaina, ala_pets);


        //Cal
        Person cal = new Person("Cal");
        List<Animal> cals_pets = new ArrayList<>();
        cals_pets.add(new Cat("Kinnick"));
        cals_pets.add(new Dog("Nala"));
        cals_pets.add(new Dog("Bentley"));
        cals_pets.add(new Dog("Maddie"));
        cals_pets.add(new Dog("Zoey"));
        owners_and_their_pets.put(cal, cals_pets);


        // Austin
        Person austin = new Person("Austin");
        List<Animal> austin_pets = new ArrayList<>();
        austin_pets.add(new Cat("Pumpkin"));
        austin_pets.add(new Cat("Cleo"));
        austin_pets.add(new Cat("Muffin"));
        austin_pets.add(new Cat("Nacho"));
        austin_pets.add(new Cat("Murphy"));
        austin_pets.add(new Cat("Lucky"));
        owners_and_their_pets.put(austin, austin_pets);

        // Chase
        Person chase = new Person("Chase");
        List<Animal> chase_pets = new ArrayList<>();
        chase_pets.add(new Cat("Sassy"));
        chase_pets.add(new Cat("Whitesburg"));
        chase_pets.add(new Dog("Buddy"));
        owners_and_their_pets.put(chase, chase_pets);

        // Logan
        Person logan = new Person("Logan");
        List<Animal> logans_pets = new ArrayList<>();
        logans_pets.add(new Dog("Rocky"));
        logans_pets.add(new Dog("Macey"));
        logans_pets.add(new Dog("Casey"));
        owners_and_their_pets.put(logan, logans_pets);

        //Jenny
        Person jenny = new Person("Jenny");
        List<Animal> jennys_pets = new ArrayList<>();
        jennys_pets.add(new Cat("Chelsea"));
        jennys_pets.add(new Cat("Mister"));
        jennys_pets.add(new Cat("Misty"));
        jennys_pets.add(new Dog("Molly"));
        jennys_pets.add(new Dog("Princess"));
        owners_and_their_pets.put(jenny, jennys_pets);

        // Liam
        Person liam = new Person("Liam");
        List<Animal> liams_pets = new
                ArrayList<>();
        liams_pets.add(new Dog("Koda"));
        owners_and_their_pets.put(liam, liams_pets);


        //Izy
        Person izy = new Person("Izy");
        List<Animal> izys_pets = new ArrayList<>();
        izys_pets.add(new Bunny("Bunny"));
        izys_pets.add(new Dog("Betsy"));
        izys_pets.add(new GuineaPig("Roseanna"));
        izys_pets.add(new Dog("Rocket"));
        izys_pets.add(new Dog("Carmel-Zilla"));
        izys_pets.add(new Rock("Rock"));
        owners_and_their_pets.put(izy, izys_pets);

        //In the main method write a forEach statement using a BiConsumer to print each person with
        // a list of comma-separated pet names:
        //Marc's pets are: Zipper and Waffles
        //Krystal's pets are: Lili, Lulu, Lemon, Penny and Gus
        //Hertier's pet is: Roxie
        //Bob has no pets

        // creating a custom action
        BiConsumer<String, Integer> action
                = new MyBiConsumer();

        // calling forEach method
        owners_and_their_pets.forEach(action);
    }
}

// Defining Our Action in MyBiConsumer class
class MyBiConsumer implements BiConsumer<String, Integer> {

    public void accept(String k, Integer v)
    {
        System.out.print("Key = " + k);
        System.out.print("\t Value = " + v);
        System.out.println();
        //In the main method, instantiate an AnimalCount object. Call the processData
        // and printReport methods to display the results. The results may look like this:
        //--- Animal Report ---
        //Type: Cat       Count: 5
        //Type: Dog       Count: 2
        //Type: Hamster   Count: 1

        /*AnimalCount ac = new AnimalCount();
        ac.processData();
        ac.printReport();*/

    }
}
