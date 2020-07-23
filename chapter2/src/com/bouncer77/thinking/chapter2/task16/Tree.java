package com.bouncer77.thinking.chapter2.task16;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 23.07.2020
 */

//: initialization/Overloading.java// Демонстрация перегрузки конструкторов наряду
/**
 * Дерево (нет, не то, что бинарное, а обычное - юзерское, растущее снизу вверх
 * */
public class Tree {

    /**
     * Высота дерева в метрах
     * */
    int height;

    public Tree() {
        System.out.println("Сажаем росток");
    }

    public Tree(int height) {
        this.height = height;
        System.out.println("Создание нового дерева высотой " + height + " м.");
    }

    void info() {
        System.out.println("Дерево высотой " + height + " м.");
    }

    void info(String s) {
        System.out.println(s + ": " + "Дерево высотой " + height + " м.");
    }
}