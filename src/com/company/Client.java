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
        this.name = Auxiliary.returnName(this.id);
        this.zp =  Auxiliary.forZp(this.id);
        this.transfer = Auxiliary.forTrans(this.id);
        this.dateBirthday = Auxiliary.forDate(this.id);
    }


        public static void main(String[]args) {
        /*int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

            for (int i = 1000; i<2000; i++) {
                Client cl = new Client(i);
                if(cl.zp < 300){
                    a++;
                } else if(cl.zp > 300 && cl.zp < 500){
                    b++;
                } else if(cl.zp => 500){
                    c++;
                }
                if(cl.transfer <= 20){
                    d++;
                } else if(cl.transfer > 20 && cl.transfer < 50){
                    e++;
                }

            }

            System.out.println("зп до 300= "+a+" "+"зп 300-500= "+b+" "+"зп 500= "+c+" "+"трансфер до 20= "+d+" "+"трансфер больше 20= "+e);
*/
            Client cl1 = new Client(9999);
            Client cl2 = new Client(9999);
            Client cl3 = new Client(9999);
            System.out.println(cl1.zp);
            System.out.println(cl1.transfer);
            System.out.println(cl1.name);
            System.out.println(cl1.dateBirthday);
            System.out.println();
            System.out.println(cl2.zp);
            System.out.println(cl2.transfer);
            System.out.println(cl2.name);
            System.out.println(cl2.dateBirthday);
            System.out.println();
            System.out.println(cl3.zp);
            System.out.println(cl3.transfer);
            System.out.println(cl3.name);
            System.out.println(cl3.dateBirthday);
            System.out.println();


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

