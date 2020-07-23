package com.bouncer77.thinking.chapter2.task9;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 23.07.2020
 */

public class AutomaticPackingPrimitiveTypes {
    public static void main(String[] args) {
        //Integer integer = new Integer(10);
        Integer integer = 10; // автоупаковка

        //int k = integer.intValue();
        int k = integer; // автораспаковка

        System.out.println("Integer = " + integer);
        System.out.println("int = "+ k);
    }
}
