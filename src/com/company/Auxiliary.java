package com.company;

import java.text.SimpleDateFormat;
import java.util.Random;

public class Auxiliary {



    public static String returnName(String name) {
        int transferForName = 5 + (int) (Math.random() * 10);
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        String generatedString = null;

        for (int x = 1; x <= 100; x++) {
            StringBuilder buffer = new StringBuilder(targetStringLength);
            for (int i = 0; i < transferForName; i++) {
                int randomLimitedInt = leftLimit + (int)
                        (random.nextFloat() * (rightLimit - leftLimit + 1));
                buffer.append((char) randomLimitedInt);
            }
            generatedString = buffer.toString();

        }

        return generatedString;
    }


    public static  int forZp(){
       int z = 100 + (int) (Math.random() * 999);
       return z;
    }

    public static  int forTrans(){
        int z =10 + (int) (Math.random() * 99);
        return z;
    }


    public static SimpleDateFormat forDate(){
        int z =1970 + (int) (Math.random() * 2010);
        int x =1 + (int) (Math.random() * 12);
        int y =1 + (int) (Math.random() * 30);

        SimpleDateFormat dateBirthday = new SimpleDateFormat(z+"."+x+"."+y);
        return dateBirthday;
    }

}
