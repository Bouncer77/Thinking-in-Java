package com.bouncer77.thinking.chapter3.task7;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Random;

public class Coin {

    private static long eagleCont = 0; // true
    private static long tailsCont = 0; // false

    public static boolean tossCoin(long n) {
        for (int i = 0; i < n; i++) {
            if (tossCoin()) {
                eagleCont++;
            } else {
                tailsCont++;
            }
        }
        return true;
    }

    public static boolean tossCoin() {
        return new Random().nextBoolean();
    }

    @Override
    public String toString() {
        return "eagleCont = " + eagleCont + "\ntailsCont = " + tailsCont;
    }

    public static String calculatePercentage() {
        BigDecimal sum = BigDecimal.valueOf(eagleCont + tailsCont);
        BigDecimal eaglePercentage = BigDecimal.valueOf(eagleCont).divide(sum, 8, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100.0));
        BigDecimal tailsPercentage = BigDecimal.valueOf(tailsCont).divide(sum, 8, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100.0));
        return "Количество бросков: " + sum + "\n" +
                "eaglePercentage = " + eaglePercentage + "\ntailsPercentage = " + tailsPercentage + "\n";
    }

    public static void main(String[] args) {
        Coin coin = new Coin();
        tossCoin(100_000_000);
        System.out.println(coin.toString());
        System.out.println(calculatePercentage());
    }
}
