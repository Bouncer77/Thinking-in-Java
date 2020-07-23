package com.bouncer77.thinking.chapter2.task10;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 23.07.2020
 */

public class ArgsOut {
    public static void main(String[] args) {
        if (args.length >= 3)
            for (int i = 0; i < 3; i++) {
                System.out.println((i + 1) + " : " + args[i]);
            }
    }
}
