package com.bouncer77.thinking.chapter3.task4;

import java.util.Random;

public class СalculateVelocity {

    /**
     * Рассчитывает среднюю скорость в метрах в секунду по расстоянию в метрах  и времени в секундах
     * @param seconds время в секундах
     * @param distance расстояние в метрах
     * */
    public static double calculateVelocityByDistanceAndTime(double distance, double seconds) {
        return distance / seconds;
    }

    public static void main(String[] args) {
        Random random = new Random();
        double distance = random.nextDouble() * 100 + 1;
        double seconds = random.nextDouble() * 20 + 1;
        System.out.format("%.2f [м] / %.2f [с] = %.2f [м/c]", distance, seconds, calculateVelocityByDistanceAndTime(distance, seconds));
    }
}
