package com.company;

import java.text.SimpleDateFormat;
import java.util.HashSet;

public class Client {

    private final int id;

    HashSet<Integer> idSet = new HashSet<Integer>();

    private String name;

    private int zp;

    SimpleDateFormat dateBirthday = new SimpleDateFormat("yyyy.MM.dd");

    int transfer = 10 + (int) (Math.random() * 99);

    public Client(int id) {
        this.id = id;
        idSet.add(id);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 5 && name.length() <= 10) {
            this.name = name;
        } else {
            System.out.println("введите другое имя");
        }
    }

    public int getZp() {
        return zp;
    }

    public void setZp(int zp) {
        if (zp > 99 && zp < 1000) {
            this.zp = zp;
        } else {
            System.out.println("должно трехзначное число");

        }
    }


        public static void main(String[]args){

        }
    }

