package com.mycompany.itman.task23;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Дан треугольник с длинами сторон A, B, C. Является ли треугольник равнобедренным?
//        10 5 7
        String line = scanner.nextLine();
        String[] split = line.split(" ");
        int a = Integer.parseInt(split [0]);
        int b = Integer.parseInt(split [1]);
        int c = Integer.parseInt(split [2]);
        System.out.println((a == b) || (b == c) || (c == a));

    }
}
