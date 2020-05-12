package com.company;

import java.util.Random;

public class Auxiliary {



    public static String[] returnName(String name){
        int transferForName = 5 + (int) (Math.random() * 10);
        String[] randomStrings = new String[transferForName];
        Random random = new Random();
        for(int i = 0; i < transferForName; i++)
        {
            char[] word = new char[random.nextInt(8)+3];
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        return randomStrings;
    }


    public static  int forZp(){
       int z = 100 + (int) (Math.random() * 999);
       return z;
    }

    public static  int forTrans(){
        int z =10 + (int) (Math.random() * 99);
        return z;
    }

}
