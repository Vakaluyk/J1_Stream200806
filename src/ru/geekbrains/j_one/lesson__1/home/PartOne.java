package ru.geekbrains.j_one.lesson__1.home;

import javax.print.attribute.standard.RequestingUserName;

public class PartOne {
        // part one
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        float c = 2;
        int d = 4;
        System.out.println(a * (b + (c / d)));

        // part two

        int a1 = 15;
        int a2 = 5;
        int a3 = a1 + a2;
        boolean a4 = a3 >= 10 && a3 <=20;
        if (a4 ) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //part three

        int a0= -15;
        boolean a5 = a0 > 0;
        if (a5 ) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //part four

        String b0= "UserName";
            System.out. println("Привет!"+b0);


    }
}