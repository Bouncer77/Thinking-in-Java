package com.bouncer77.thinking.chapter3.task8_9;

public class Main {

    public static void main(String[] args) {
        long aLong1 = 0xFAAF; // hex
        long aLong2 = 01177; // oct
        System.out.println(Long.toHexString(aLong1) + " : " + Long.toBinaryString(aLong1));
        System.out.println(Long.toOctalString(aLong2) + " : " + Long.toBinaryString(aLong2));

        double aDouble = 1.39e-43f; // = 1.39 * 10^(-43)
        System.out.println(aDouble);

        System.out.println("*******************************************");
        System.out.println("Double");
        System.out.println(Double.MAX_EXPONENT);
        System.out.println(Double.MAX_VALUE);
        System.out.println("\n\nFloat");
        System.out.println(Float.MAX_EXPONENT);
        System.out.println(Float.MAX_VALUE);



    }
}
