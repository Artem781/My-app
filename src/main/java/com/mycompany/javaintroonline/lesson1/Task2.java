package com.mycompany.javaintroonline.lesson1;

public class Task2 {
    public static double findValue(double a, double b, double c) {
        double result = (b + (Math.sqrt(Math.pow(b, 2) + (4 * a * c)))) / (2 * a) -
                (Math.pow(a, 3) * 3) + (Math.pow(b, -2));
        return result;
    }
}
