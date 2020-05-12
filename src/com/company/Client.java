package com.company;

import java.text.SimpleDateFormat;
import java.util.HashSet;

class Client {

    private final int id;

    public String name;

    private int zp;

    SimpleDateFormat dateBirthday = new SimpleDateFormat("yyyy.MM.dd");

    private int transfer;


    public Client(int id) {
        this.id = id;
        Auxiliary.returnName(name);
        Auxiliary.forZp();
        Auxiliary.forTrans();
    }


        public static void main(String[]args){
        Client cl = new Client(3007);
            System.out.println(cl.name);

        }
        
        
    }

