package com.mycompany.itman.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Hello -10000 1.2345e4 FALSE
        // String 5 3.14 true

        String line = scanner.nextLine();
        String[] str = line.split(" ");

        String s = str [0];
        int i = Integer.parseInt(str [1]);
        double d = Double.parseDouble(str [2]);
        boolean b = Boolean.parseBoolean(str [3]);

        System.out.println(b);
        System.out.println(d);
        System.out.println(i);
        System.out.println(s);


//        for (int i = 3; i > -1; i--) {
//            System.out.println(str[i]);
//        }
    }
}
