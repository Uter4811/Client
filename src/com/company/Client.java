package com.company;

import java.text.SimpleDateFormat;
import java.util.HashSet;

class Client {

    private final int id;

    private String name;
    String rus = "абвгдеёжзийклмнопрстуфхцчъыьэюя";

    private final int zp = 100 + (int) (Math.random() * 999);

    SimpleDateFormat dateBirthday = new SimpleDateFormat("yyyy.MM.dd");

    int transfer = 10 + (int) (Math.random() * 99);
    int x = 1;
    int transferForName = 5 + (int) (Math.random() * 10);


    public Client(int id) {
        this.id = id;

        while(x <transferForName){
            int nameNum = 1 + (int) (Math.random() * 33);
            name = name+ rus.charAt(nameNum);
            x++;
        }
    }


        public static void main(String[]args){

        }
    }

