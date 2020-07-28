package com.bouncer77.thinking.chapter3.task14;

public class Main {

    public static void main(String[] args) {
        printAllOp("123", "321");
    }

    public static void printAllOp(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder(Boolean.toString(str1 == str2));
        stringBuilder.append("\n").append(str1 != str2).append("\n").append(str1.equals(str2)).append("\n");

        System.out.println(stringBuilder);
    }
}
