package com.bouncer77.thinking.chapter2.task7;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 23.07.2020
 */

public class Incrementable {
    private static int i = 47;

    public static int getI() {
        return i;
    }

    public static int increment() {
        return ++i;
    }

    public static void main(String[] args) {
        System.out.println(Incrementable.getI() + " -> " + Incrementable.increment());
    }
}
