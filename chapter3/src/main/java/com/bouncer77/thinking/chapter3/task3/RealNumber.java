package com.bouncer77.thinking.chapter3.task3;

public class RealNumber {

    public float f;

    public RealNumber(float f) {
        this.f = f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public float getF() {
        return f;
    }

    @Override
    public String toString() {
        return "RealNumber{" +
                "f=" + f +
                '}';
    }

    public static void main(String[] args) {
        RealNumber realNumber = new RealNumber(10.5f);
        System.out.println("f = 10.5f; f = " + realNumber);
        realNumber.f = 5.7f;
        System.out.println("f = 5.7; f = " + realNumber);
        realNumber.setF(3.2f);
        System.out.println("setF(3.2f); f = " + realNumber);
    }
}
