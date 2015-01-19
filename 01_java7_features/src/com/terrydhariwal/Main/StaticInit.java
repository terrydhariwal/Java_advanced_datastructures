package com.terrydhariwal.Main;

import com.terrydhariwal.olives.Olive;
import com.terrydhariwal.olives.OliveJar;

import java.util.ArrayList;

public class StaticInit {

    public static void main(String[] args) {
        System.out.println("Starting application ...");
        ArrayList<Olive> olives = OliveJar.olives_static_member;
        for (Olive o:olives) {
            System.out.println(o.oliveName);
        }
    }
}
