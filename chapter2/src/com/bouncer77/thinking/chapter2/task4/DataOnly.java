package com.bouncer77.thinking.chapter2.task4;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 23.07.2020
 */

public class DataOnly {

    int i;
    double d;
    boolean b;

    public DataOnly() {
        i = 47;
        d = 1.1;
        b = true;
    }

    @Override
    public String toString() {
        return "DataOnly{" +
                "i=" + i +
                ", d=" + d +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new DataOnly().toString());
    }
}
