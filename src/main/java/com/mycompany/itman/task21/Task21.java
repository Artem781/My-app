package com.mycompany.itman.task21;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Каждый билет имеет шестизначный номер X.Назовем билет счастливым,
//        если сумма первых трех цифр совпадает с суммой последних трех цифр.
//        Вам дано целое число X - шестизначный номер билета.Необходимо узнать является
//        ли введенный номер билета счастливым.
//        002101 -> true
//        123456 -> false
        String line = scanner.nextLine();
        int firstThreeNumber = 0;
        int secondThreeNumber = 0;
        for (int i = 0; i < line.length() / 2; i++) {
            firstThreeNumber += Integer.parseInt(String.valueOf(line.charAt(i)));
        }
        for (int i = (line.length() / 2); i < line.length(); i++) {
            secondThreeNumber += Integer.parseInt(String.valueOf(line.charAt(i)));
        }
        System.out.println(firstThreeNumber == secondThreeNumber);
    }
}
