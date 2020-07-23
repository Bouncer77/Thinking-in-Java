package com.bouncer77.thinking.chapter2.task11;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 23.07.2020
 */
class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;

    public AllTheColorsOfTheRainbow(int anIntegerRepresentingColors) {
        this.anIntegerRepresentingColors = anIntegerRepresentingColors;
    }

    @Override
    public String toString() {
        return "AllTheColorsOfTheRainbow{" +
                "anIntegerRepresentingColors=" + anIntegerRepresentingColors +
                '}';
    }

    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }

    public static void main(String[] args) {
        AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow(10);
        System.out.println(allTheColorsOfTheRainbow.toString());
        allTheColorsOfTheRainbow.changeTheHueOfTheColor(20);
        System.out.println(allTheColorsOfTheRainbow.toString());

    }
}