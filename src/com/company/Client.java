package com.company;

import java.text.SimpleDateFormat;
import java.util.HashSet;

class Client {

    private final int id;

    public String name;

    private int zp;

    String dateBirthday;

    private int transfer;


    public Client(int id) {
        this.id = id;
        this.name = Auxiliary.returnName(name);
        this.zp =  Auxiliary.forZp();
        this.transfer = Auxiliary.forTrans();
        this.dateBirthday = Auxiliary.forDate();
    }


        public static void main(String[]args){
        Client cl = new Client(3007);
            System.out.println(cl.dateBirthday);

        }
        
        
    }

