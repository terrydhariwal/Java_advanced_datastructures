package com.terrydhariwal.olives;

public class Olive {

    // Its trivial to initialise static fields for primitives
    // however for complex types its a little more cumbersome - but java 7 helps
    public static final long BLACK = 0x000000; //easy to initialise a primitive static variable

    public String oliveName = "Kalamata";
    public long color = BLACK;

    public Olive() {
    }

    public Olive(String oliveName) {
        this.oliveName = oliveName;
    }

    public Olive(String oliveName, long color) {
        this(oliveName);
        this.color = color;
    }

    public String toString() {
        return "name: " + this.oliveName + ": " + "color: " +  this.color;
    }

}
