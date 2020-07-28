package com.bouncer77.thinking.chapter3.task12_13;

public class Main {

    public static void main(String[] args) {

        // Упражнение 12
        int a = 0xFFFFFFFF;
        System.out.println(Integer.toBinaryString(a));
        a <<= 1;
        System.out.println(Integer.toBinaryString(a));
        while (a != 0) {
            a >>>= 1;
            System.out.printf("%32s\n", Integer.toBinaryString(a));
        }

        // Упражнение 13
        char ch1 = 0b100011;
        char ch2 = 0xFFAA;
        System.out.println(ch1 + " = " +  binaryView(ch1));
        System.out.println(ch2 + " = " +  binaryView(ch2));


    }

    public static String binaryView(char ch) {
        return Integer.toBinaryString(ch);
    }
}
