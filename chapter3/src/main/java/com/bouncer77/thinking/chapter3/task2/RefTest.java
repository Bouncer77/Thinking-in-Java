package com.bouncer77.thinking.chapter3.task2;

public class RefTest {

    public static void main(String[] args) {
        float f1 = 0.1f;
        float f2 = 0.2f;
        System.out.println("f1 = " + f1 + " ; f2 = " + f2);
        f2 = f1;
        System.out.println("f2 = f1 ; f2 = " + f2 + " ; f1 = " + f1);

        Float refF1 = 0.1f;
        Float refF2 = 0.2f;
        System.out.println("refF1 = " + refF1 + " ; refF2 = " + refF2);
        refF1 = refF2;
        System.out.println("refF1 = refF2; refF1 = " + refF1 + " ; refF2 = " + refF2);


    }
}
