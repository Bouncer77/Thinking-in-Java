package com.bouncer77.thinking.chapter2.task6;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 23.07.2020
 */

public class StorageMethod {

    private String str;

    public StorageMethod(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public int storage() {
        return str.length();
    }

    public static int storage(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        StorageMethod storageMethod = new StorageMethod("Hello, world!");
        System.out.println(storageMethod.getStr() + " = " + storageMethod.storage());
        String testStr = "Тестовая строка";
        System.out.println(testStr + " = " + StorageMethod.storage(testStr));
    }
}
