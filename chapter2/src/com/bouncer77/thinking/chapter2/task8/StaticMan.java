package com.bouncer77.thinking.chapter2.task8;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 23.07.2020
 */

public class StaticMan {

    private static int count = 0;

    private int age;

    public StaticMan(int age) {
        this.age = age;
        ++count;
    }

    @Override
    public String toString() {
        return "StaticMan{" +
                "age=" + age +
                '}' + "count = " + count;
    }

    public static void main(String[] args) {
        StaticMan[] staticManArr = {
                new StaticMan(10),
                new StaticMan(20),
                new StaticMan(30)
        };

        for (StaticMan man : staticManArr) {
            System.out.println(man.toString());
        }
    }
}
