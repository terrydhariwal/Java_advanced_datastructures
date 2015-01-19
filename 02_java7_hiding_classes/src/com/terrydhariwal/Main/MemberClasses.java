package com.terrydhariwal.Main;

import com.terrydhariwal.olives.OliveJar;
import com.terrydhariwal.enums.OliveName;

public class MemberClasses {

    public static void main(String[] args)  {

        OliveJar jar = new OliveJar();
        jar.addOlive(OliveName.KALAMATA, 0x000000);
        jar.addOlive(OliveName.LIGARIO, 0x000000);
        jar.addOlive(OliveName.PICHOLINE, 0x000000);
        jar.reportOlives();

    }

}
