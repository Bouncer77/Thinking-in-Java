package com.bouncer77.thinking.chapter3.task11;

public class Main {

    public static void main(String[] args) {
        Integer a = 0x7FFFFFFF;
        System.out.println(Integer.toBinaryString(a));

        int count = 0;
        while(count != 31) {
            a >>= 1;
            System.out.printf("%2d : %s\n", count++, Integer.toBinaryString(a));
        }
    }
}
