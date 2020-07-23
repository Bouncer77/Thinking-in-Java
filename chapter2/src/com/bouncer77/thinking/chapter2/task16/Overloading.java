package com.bouncer77.thinking.chapter2.task16;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 23.07.2020
 */

/**
 * Программа демонстрирующая перегрузку метода и конструктора
 * */
public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Перегруженный метод");
        }

        // Перегруженный конструктор
        new Tree();
    }
}
