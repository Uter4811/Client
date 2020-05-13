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
        this.name = Auxiliary.returnName(name, this.id);
        this.zp =  Auxiliary.forZp(this.id);
        this.transfer = Auxiliary.forTrans();
        this.dateBirthday = Auxiliary.forDate(this.id);
    }


        public static void main(String[]args){
        Client cl = new Client(3007);
            System.out.println(cl.dateBirthday);


        Client c2 = new Client(3007);
            System.out.println(c2.dateBirthday);

}
        
        
    }


   /* public static String returnName(String name) {
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

