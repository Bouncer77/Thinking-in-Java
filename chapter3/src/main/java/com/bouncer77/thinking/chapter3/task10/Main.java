package com.bouncer77.thinking.chapter3.task10;

public class Main {

    public static void main(String[] args) {
        int a = 0x6;
        int b = 0x3;

        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));
        int c = a & b;
        System.out.println("a & b = " + Integer.toBinaryString(c));
        c = a | b;
        System.out.println("a | b = " + Integer.toBinaryString(c));
        c = a ^ b;
        System.out.println("c = a ^ b = " + Integer.toBinaryString(c));
        System.out.println("~c = " + Integer.toBinaryString(~c));

        c = -1;
        System.out.println("c = -1 = " + Integer.toBinaryString(c));

        // -1 = llllllllllllllllllllllllllllllll = int: 2147483647,
        // 1 = 1
        // int: -2147483648 10000000000000000000000000000000
        int maxInt = 2147483647;
        int one = 1;
        int zero = 0;
        int oneNeg = -1;
        int minInt = -2147483648;

        System.out.println("maxInt = " + maxInt + " = " + Integer.toBinaryString(maxInt));
        System.out.println("one = " + one + " = " + Integer.toBinaryString(one));
        System.out.println("zero = " + zero + " = " + Integer.toBinaryString(zero));
        System.out.println("oneNeg = " + oneNeg + " = " + Integer.toBinaryString(oneNeg));
        System.out.println("minInt = " + minInt + " = " + Integer.toBinaryString(minInt));

        System.out.println(oneNeg ^ maxInt);


        // Сдвиги влево-вправо
        /**
         * Если сдвигаемое значение относится к типу char, byte или short, эти типы приводятся к int перед выполнением сдвига, и результат также получится int.
         *
         * 1. '<<' сдвиг влево
         * При каждом сдвиге влево выполняется умножение числа на 2.
         *
         * 2. '>>' сдвиг вправо
         *      При сдвиге вправо используется заполнение знаком: при положительном значении новые биты заполняются нулями, а при отрицательном — единицами
         *      При каждом сдвиге вправо выполняется деление на два с отбрасыванием любого остатка.
         *
         * 2. '>>>' беззнаковый сдвиг вправо
         *      использующий заполнение нулями
         *      При использовании его с типом byte или short вы не получите правильных результатов.
         *      Вместо этого они сначала будут преобразованы к типу int и сдвинуты вправо, а затем обрезаны при возвращении к исходному типу, и результатом станет -1.
         *
         *
         * */
    }
}
