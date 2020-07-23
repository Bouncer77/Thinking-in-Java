package com.bouncer77.thinking.chapter2.task1;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 23.07.2020
 */

public class Main {
    public static void main(String[] args) {
        ZeroInit zeroInit = new ZeroInit();
        System.out.println("Int: " + zeroInit.anInt);
        System.out.println("Char: " + zeroInit.aChar + " : " + (int)zeroInit.aChar);
    }
}
