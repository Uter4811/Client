package com.company;

import java.text.SimpleDateFormat;
import java.util.Random;

public class Auxiliary {


    public static String returnName(int id) {
        int transferForName = 5 + (int) (id / 1000);
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        String generatedString = null;

        for (int x = 1; x <= 100; x++) {
            StringBuilder buffer = new StringBuilder(targetStringLength);
            for (int i = 0; i < transferForName; i++) {
                int randomLimitedInt = leftLimit + (int)
                        (transferForName * (rightLimit - leftLimit + 1));
                buffer.append((char) randomLimitedInt);
            }
            generatedString = buffer.toString();

        }

        return generatedString;
    }


    public static int forZp(int id) {
        int z = 0;
        if (id % 1000 < 100) {

            z = id % 1000 + 500;
        } else if (id % 1000 > 100 && id % 1000 < 300) {

            z = id % 1000 + 300;

        } else {
            if(id % 1000 < 300) {
                z = id % 1000;
            }
         else if(id % 1000 > 300 && id % 1000 < 600) {
                z = id % 1000 - 300;
            } else if(id % 1000 > 600 && id % 1000 < 900) {
                z = id % 1000 - 600;
            } else if(id % 1000 > 900 && id % 1000 < 999) {
                z = id % 1000 - 800;
            }

    }

        return z;
    }


    public static int forTrans(int id) {
        int z = 0;
        if (id % 100 > 40) {
             z = 1 + (int) (Math.random() * 20);

        }
        else  {
             z = 20 + (int) (Math.random()*30);

        }
        return z;
    }


    public static String forDate(int id) {
        int r = id;

        int z = 0;
        int y = 0;
        int x = 0;


        z = id%100 + 1980;
        x = id%12 + 1;
        y = id%30;



        String dateBirthday = new String(z + "." + x + "." + y);
        return dateBirthday;


    }
}
    /*public static String returnName(String name) {
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
    }*/