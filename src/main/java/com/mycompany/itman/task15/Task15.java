package com.mycompany.itman.task15;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Дано количество секунд X прошедших от определенного момента.Необходимо вывести этот
//        промежуток в формате Dd Hh Mm Ss, где D - количество полных дней, H -количество полных
//        часов, M - количество полных минут, S -количество полных секунд.
        // 1 Mm = 60 Ss
        // 1 Hh = 60 Mm = 3600 Ss
        // 1 Dd = 24 Hh = 1440 Mm = 86400 Ss
        // 3725 -> 0d 1h 2m 5s
        int inputAllTime = scanner.nextInt();
        int day = inputAllTime / 86400;
        int temp = inputAllTime % 86400;
        int hour = temp / 3600;
        temp = temp % 3600;
        int minute = temp / 60;
        int second = temp % 60;
        System.out.printf("%dd %dh %dm %ds", day, hour, minute, second);

    }
}
