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


    public static  int forZp(int id){
       int z = (int) (id/10);
       return z;
    }

    public static  int forTrans(int id){
        int z = (int) (id/100);;
        return z;
    }


    public static String forDate(){
        int z =1970 + (int) (Math.random() * 40);
        int x =1 + (int) (Math.random() * 12);
        int y =1 + (int) (Math.random() * 30);

        String dateBirthday = new String(z+"."+x+"."+y);
        return dateBirthday;
    }

}
