package com.terrydhariwal.Main;

import com.terrydhariwal.olives.Olive;
import com.terrydhariwal.olives.OliveColor;
import com.terrydhariwal.olives.OliveName;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args)  {

        // The java reflection  API contains classes and methods
        // that allow you to dynamically instantiate and interrogate classes.

        // This allows you to build highly dynamic apps, loading classes defined
        // say in XML or other kinds of text files, or handle other kinds of
        // processes where you don't know the name of classes when you're coding.

        // The most important class is simply named Class.
        // Each object created in a Java application has an associated class
        // of which that object is an instance
        // And you can find out an object's class name is and what its capabilities are
        // using the class Class
        System.out.println("reflection");

        Olive o = new Olive(OliveName.PICHOLINE, OliveColor.BLACK);
        // <?> says, the Class collection contains a class of some data type
        // but I don't know what it is
        // I'll give the Class object an name of c
        // and I'll get its reference from o.getClass
        // So now I have an object called c, which is data typed as class
        // which represents the Olive class, and I know that because I created the object
        // from which I got the reference.
        Class<?> c = o.getClass();

        // Once you have the class you have enormous capabilities in terms of finding
        // out information about the classes name and its capabilities
        System.out.println("c = \t\t\t\t\t" + c);
        System.out.println("c.getName() = \t\t\t" + c.getName());
        System.out.println("c.getSimpleName() = \t" + c.getSimpleName());

        // So this is a quick look at some of the capabilities of the class Class
        // theres a lot more you can do with it - including getting information
        // about constructors, methods, fields and other members of the class.

        Constructor<?> [] constructors = c.getConstructors();
        System.out.println("Number of constructors = " + constructors.length);

        Object obj = null;
        try {

            // So the reflection API gives you enormous capabilities, in terms of dynamic instantiation
            // of Java objects and dynamic invocation of Java code
            // but it also puts greater responsibility on you the developer to get the code right.

            Constructor<?> con = constructors[1];
            obj = con.newInstance(OliveName.PICHOLINE, OliveColor.BLACK);
            System.out.println(obj);

            // Java in conventional form gives very strong data typing and catches most type mismatches
            // during compilation, but when you're working dynamically you have to catch it yourself or
            // interpret and fix the error messages that you see at runtime.

            con = constructors[0]; //wrong number of arguments
            obj = con.newInstance(OliveName.PICHOLINE, OliveColor.BLACK);
            System.out.println(obj);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
