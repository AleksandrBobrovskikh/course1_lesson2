package com.geekbrains;

public class HomeWorkApp {

    public static boolean sumTwoNumbers(int a, int b) {
        return ((a + b >= 10) && (a + b <= 20));
    }

    public static void positiveNumberString(int a) {
        if (a >= 0)
            System.out.println("Число " + a + " положительное!");
        else
            System.out.println("Число " + a + " отрицательное!");
    }

    public static boolean negativeNumberBoolean(int a) {
        return (a < 0);
    }

    public static void loop(String s, int a) {
        for (int i = 0; i < a; i++)
            System.out.println(s);
    }

    public static void leapYear(int y) {
        if (y % 400 == 0)
            System.out.println("Год " + y + " является высокосным!");
        else if (y % 100 == 0)
            System.out.println("Год " + y + " является не высокосным!");
        else if (y % 4 == 0)
            System.out.println("Год " + y + " является высокосным!");
        else
            System.out.println("Год " + y + " является не высокосным!");
    }

    public static void main(String[] args) {
        System.out.println(sumTwoNumbers(15, 6));
        positiveNumberString(0);
        System.out.println(negativeNumberBoolean(-1));
        loop("Java", 2);
        leapYear(2015);

    }
}
