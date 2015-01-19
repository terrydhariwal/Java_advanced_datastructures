package com.terrydhariwal.olives;

import java.util.ArrayList;

public class OliveJar {

    public static ArrayList<Olive> olives_static_member; // how to initialize this static member?
    // by using a static initializer block
    static {
        // any code within this block is executed the first time
        // any of the static fields of this class are referenced
        // anywhere else in the application
        // But its only called once

        // Static initializers are great for initializing the values of complex objects
        // or where ever you need to do any logical operations including evaluating the
        // current state of the application before you assign the one and only value
        // to the static object

        System.out.println("Initializing olives_static_member");
        olives_static_member = new ArrayList<>();
        olives_static_member.add(new Olive("Kalamata", 0x000000));
        olives_static_member.add(new Olive("Picholine", 0x00FF00));
        olives_static_member.add(new Olive("Ligurio", 0x000000));
    }

    public ArrayList<Olive> olives_instance_member; //how to initialize this instance member?
    // by using a instance initializer
    // this is the same as the static initializer block except without the static keyword
    {
        // the instance initializer is always called no matter what constructor method is called
        // unlike the static initializer, the instance initializer is called **everytime** a
        // constructor method is called

        System.out.println("Initializing olives_instance_member");
        olives_instance_member = new ArrayList<>();
        olives_instance_member.add(new Olive("Golden", 0xDA9100));
    }

    /* Why use a instance initializer over a constructor?
    The answer is - when you're working with a class that has multiple constructors methods
    this is a way of executing code - that executes no matter which constructor method gets called
    and that code will be executed before the constructor method.
     */
    public OliveJar() {
        System.out.println("OliveJar default Constructor...");
    }
    public OliveJar(int nOlives, String oliveName, long color) {
        System.out.println("OliveJar non-default constructor");
        for (int i = 0; i < nOlives; i++) {
            olives_instance_member.add(new Olive(oliveName, color));
        }
    }

}
