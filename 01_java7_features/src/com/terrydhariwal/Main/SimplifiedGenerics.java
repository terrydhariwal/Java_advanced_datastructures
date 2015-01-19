package com.terrydhariwal.Main;

import com.terrydhariwal.olives.Olive;

import java.util.ArrayList;
import java.util.List;

public class SimplifiedGenerics {

    public static void main(String[] args) throws Exception {

        Olive o1 = new Olive("Kalamata", 0x000000);
        Olive o2 = new Olive("Picholine", 0x00FF00);
        Olive o3 = new Olive("Ligurio", 0x000000);

//        Olive [] olives = {o1, o2, o3};
//        System.out.println("olives = " + olives);

        //Java 7 has removed diamond operator redundancy
        List<Olive> olives = new ArrayList<>();
        olives.add(o1);
        olives.add(o2);
        olives.add(o3);
        System.out.println("olives = " + olives);
    }

}
