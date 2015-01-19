package com.terrydhariwal.olives;

import com.terrydhariwal.enums.OliveName;

import java.util.ArrayList;

public class OliveJar {


    public ArrayList<Olive> olives;
    {
        System.out.println("Initializing olives");
        olives = new ArrayList<>();
        //olives.add(new Olive("Golden", 0xDA9100));
        olives.add(new Olive(OliveName.GOLDEN, 0xDA9100));
    }


    public OliveJar() {
        System.out.println("OliveJar default Constructor...");
    }

    //public OliveJar(int nOlives, String oliveName, long color) {
    public OliveJar(int nOlives, OliveName oliveName, long color) {
        System.out.println("OliveJar non-default constructor");
        for (int i = 0; i < nOlives; i++) {
            olives.add(new Olive(oliveName, color));
        }
    }

    public void addOlive(OliveName oliveName, long color){
        olives.add(new Olive(oliveName, color));
    }

    //In the world of object oriented programming, we use the term encapsulation to talk about hiding data
    //In java you can hide data as private fields but you can also create member classes that are contained within other
    //classes. and those member classes can be the ultimate form of encapsulation.
    //The advantage of member classes is that you can define classes that are available only within the containing class
    //In this case, I've made a decision that the Olive class is only relevant and should only be callable from within
    //the OliveJar
    //java supports this very strong approach support to encapsulation of both data and functionality.
    class Olive {

        public static final long BLACK = 0x000000;

        //public String oliveName = "Kalamata";
        public OliveName oliveName;
        public long color = BLACK;

        public Olive() {
        }

        //public Olive(String oliveName) {
        public Olive(OliveName oliveName) {
            this.oliveName = oliveName;
        }

        //public Olive(String oliveName, long color) {
        public Olive(OliveName oliveName, long color) {
            this(oliveName);
            this.color = color;
        }

        public String toString() {

            return "name: " + this.oliveName + ": " + "color: " +  this.color;
        }

    }

    public void reportOlives() {

        // a local inner class is a class that's defined within a code block
        // for example a code block that's part of a method definition
        // and is only visible within that code block
        class JarLid { //notice I don't use an access modifier, because the class is defined within the code block, its automatically private
            // when you define the fields and methods of this class
            // they have to be instance members
            // you can't use static members in this context
            // so in order to call these methods, I'm going to need to instantiate this class

            public void open() {
                System.out.println("inner classses open method...");
                System.out.println("twist, twist, twist ...");
                System.out.println("Pop!");
            }
        }

        // I'm only going to instantiate JarLid once, so I'm going to instantiate it
        // anonymously and I'm going to immediately call the open method
        new JarLid().open();
        // so you can define these local inner classes, whenever you want to define functionality
        // that's only ever going to be called in this one location
        // So inner classes is a way of creating complex functionality but keeping it hidden
        // from the rest of the application.


        // Finally I'm going to go even further
        // by defining a local anonymous class
        // an anonymous class is just that - it doesn't have a name - its defined and used exactly once
        new Object() { //anonymous classes constructor
            public void open() {
                System.out.println("anonymous classes open method ....");
                System.out.println("twist, twist, twist ...");
                System.out.println("Pop!");
            }
        }.open();

        // so if you wanna work with inner classes you can choose from
        // local inner classes which have names or
        // anonymous inner classes which don't have names
        // either way you're defining a class that's local to the current code block
        // in this case we've done this within a method code block

        for (Olive o : olives) {
            System.out.println("Its a " + o.oliveName + " olive!");
        }
    }



}
