package com.terrydhariwal.Main;

import java.text.NumberFormat;

public class SimplifiedNumerics {

    public static void main(String[] args) {
        int numberOfOlives = 1_000_000;
        NumberFormat formatter = NumberFormat.getInstance();
        System.out.println(formatter.format(numberOfOlives)); //prints out using locale settings, e.g. 1,000,000

    }

}
