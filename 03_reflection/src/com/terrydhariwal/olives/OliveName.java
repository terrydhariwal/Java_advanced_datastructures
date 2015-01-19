package com.terrydhariwal.olives;

public enum  OliveName {

    KALAMATA("Kalamata"),
    PICHOLINE("Picholine"),
    LIGARIO("Ligario"),
    GOLDEN("Golden");

    private String nameAsString;

    private OliveName(String nameAsString) {
        this.nameAsString = nameAsString;
    }

    @Override
    public String toString() {
        return this.nameAsString;
    }
}
