package com.terrydhariwal.Main;

import com.terrydhariwal.olives.Olive;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class  StringsInSwitch {

    public static void main(String[] args) {

        Olive o1 = new Olive("Kalamata", 0x000000);
        Olive o2 = new Olive("Picholine", 0x00FF00);
        Olive o3 = new Olive("Ligurio", 0x000000);

        List<Olive> olives = new ArrayList<>();
        olives.add(o1);
        olives.add(o2);
        olives.add(o3);

        //generate a number between 0 and 2
        Random generator = new Random();
        int index = generator.nextInt(3); //pass in the value of one greater than you max
        System.out.println("random value: " + index);

        Olive o = olives.get(index);

        switch (o.oliveName) {
            case "Kalamata":
                System.out.printf("It's Greek!");
                break;
            case "Picholine":
                System.out.printf("It's French!");
                break;
            case "Ligurio":
                System.out.printf("It's Italian!");
                break;
            default:
                System.out.printf("I don't know where its from!");
                break;
        }
    }

}
