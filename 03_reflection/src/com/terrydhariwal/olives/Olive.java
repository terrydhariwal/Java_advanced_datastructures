package com.terrydhariwal.olives;

public class Olive {

    public OliveName oliveName;
    public OliveColor color;

    public Olive() {
    }

    public Olive(OliveName oliveName, OliveColor color) {
        this.oliveName = oliveName;
        this.color = color;
    }

    @Override
    public String toString() {
        return "name: " + this.oliveName + ": " + "color: " +  this.color;
    }

}
