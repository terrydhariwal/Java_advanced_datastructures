package com.terrydhariwal.Main;

import com.terrydhariwal.olives.Olive;
import com.terrydhariwal.olives.OliveJar;

import java.util.ArrayList;

public class InstanceInit {

    public static void main(String[] args) {
        System.out.println("Starting application InstanceInit...\n");

        //seems like the static initializer is called when the constructor is called - even though I don't reference it's static members
        //also the instance initializer is also called
        //Both the static and instance initializers are called before the constructor
        // 1. first the static initializer is called
        // 2. second the instance initializer is called
        // 3. third the constructor is called
        System.out.printf("Begin by calling default...");
        ArrayList<Olive> olives = new OliveJar().olives_instance_member; //use the non-static field
        for (Olive o:olives) {
            System.out.println(o.oliveName);
        }

        /* Why use a instance initializer over a constructor?
        The answer is - when you're working with a class that has multiple constructors methods
        this is a way of executing code - that executes no matter which constructor method gets called
        and that code will be executed before the constructor method.
         */
        //use the non-static field
        System.out.println("\nNow calling non-default constructor... ");
        ArrayList<Olive> olives2 = new OliveJar(3, "Kalamata", 0x000000).olives_instance_member;
        for (Olive o:olives2) {
            System.out.println(o.oliveName);
        }
    }
}
