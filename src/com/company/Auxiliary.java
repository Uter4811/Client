package com.company;

public class Auxiliary {



    public static String returnName(String h){
        int transferForName = 5 + (int) (Math.random() * 10);
        String nameLocal = null;
        int x = 1;
        String rus = "абвгдеёжзийклмнопрстуфхцчъыьэюя";
        while(x <transferForName){
            int nameNum = 1 + (int) (Math.random() * 33);
            nameLocal = nameLocal+ rus.charAt(nameNum);
            x++;
        }
        h = nameLocal;
        return h;
    }


    public static  int forZp(int z){
       z = 100 + (int) (Math.random() * 999);
       return z;
    }

    public static  int forTrans(int z){
        z =10 + (int) (Math.random() * 99);
        return z;
    }

}
