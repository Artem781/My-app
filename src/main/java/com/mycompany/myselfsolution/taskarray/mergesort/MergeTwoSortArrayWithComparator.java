package com.mycompany.myselfsolution.taskarray.mergesort;

import java.util.Comparator;

public class MergeTwoSortArrayWithComparator {
    public static <T> T[] mergeTwoArr(T[] first, T[] second, Comparator<T> comp) {
        int firstArrLength = first.length;
        int secondArrLength = second.length;
        int firstArrPosition = 0;
        int secondArrPosition = 0;
        T[] result = (T[]) new Object[firstArrLength + secondArrLength];
        int resultArrLength = result.length;
        for (int resultArrPosition = 0; resultArrPosition < resultArrLength; resultArrPosition++) {
            //добавим хвостик со второго массива
            if (firstArrPosition == firstArrLength) {
                while (secondArrPosition < secondArrLength) {
                    result[resultArrPosition++] = second[secondArrPosition++];
                }
                break;
            }
            //добавим хвостик с первого массива
            if (secondArrPosition == secondArrLength) {
                while (firstArrPosition < firstArrLength) {
                    result[resultArrPosition++] = first[firstArrPosition++];
                }
                break;
            }
            //проверяем с какого массива добавлять
            if (comp.compare(first[firstArrPosition], second[secondArrPosition]) <= 0) {
                result[resultArrPosition] = first[firstArrPosition];
                firstArrPosition++;
            } else {
                result[resultArrPosition] = second[secondArrPosition];
                secondArrPosition++;
            }
        }
        return result;
    }
}
