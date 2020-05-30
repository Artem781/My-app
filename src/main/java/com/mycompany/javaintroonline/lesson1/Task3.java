package com.mycompany.javaintroonline.lesson1;

public class Task3 {
    public static double findValue(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }
}
