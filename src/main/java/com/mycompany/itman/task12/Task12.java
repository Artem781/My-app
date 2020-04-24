package com.mycompany.itman.task12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            result += Integer.parseInt(String.valueOf(input.charAt(i)));
        }
        System.out.println(result);

    }
}
