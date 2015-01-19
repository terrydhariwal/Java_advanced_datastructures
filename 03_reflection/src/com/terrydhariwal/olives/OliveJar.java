package com.terrydhariwal.olives;

import java.util.ArrayList;

public class OliveJar {

    public ArrayList<Olive> olives;
    {
        System.out.println("Initializing olives");
        olives = new ArrayList<>();
        olives.add(new Olive(OliveName.GOLDEN, OliveColor.BLACK));
    }

    public OliveJar() {
        System.out.println("OliveJar default Constructor...");
    }

    public OliveJar(int nOlives, OliveName oliveName, OliveColor color) {
        System.out.println("OliveJar non-default constructor");
        for (int i = 0; i < nOlives; i++) {
            olives.add(new Olive(oliveName, color));
        }
    }

    public void addOlive(OliveName oliveName, OliveColor color){
        olives.add(new Olive(oliveName, color));
    }

    public void reportOlives() {

        class JarLid { // a local inner class
            public void open() {
                System.out.println("inner classses open method...");
                System.out.println("twist, twist, twist ...");
                System.out.println("Pop!");
            }
        }
        new JarLid().open();

        new Object() { //a local anonymous class
            public void open() {
                System.out.println("anonymous classes open method ....");
                System.out.println("twist, twist, twist ...");
                System.out.println("Pop!");
            }
        }.open();

        for (Olive o : olives) {
            System.out.println("Its a " + o.oliveName + " olive!");
        }
    }
}
