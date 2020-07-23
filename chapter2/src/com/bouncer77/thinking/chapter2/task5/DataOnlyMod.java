package com.bouncer77.thinking.chapter2.task5;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 23.07.2020
 */

public class DataOnlyMod {
    int i;
    double d;
    boolean b;

    @Override
    public String toString() {
        return "DataOnlyMod{" +
                "i=" + i +
                ", d=" + d +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        DataOnlyMod dataOnlyMod = new DataOnlyMod();

        dataOnlyMod.i = 45;
        dataOnlyMod.d = 2.1;
        dataOnlyMod.b = false;

        System.out.println(dataOnlyMod.toString());
    }
}
