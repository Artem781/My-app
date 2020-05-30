package com.mycompany.myselfsolution.taskarray.mergesort;

import com.mycompany.myselfsolution.taskarray.mergesort.MergeTwoSortArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeTwoSortArrayTest {

    @Test
    void positive_mergeTwoEqualsLengthArrTest() {
        int[] firstArr = new int[]{1, 3, 6};
        int[] secondArr = new int[]{2, 4, 5};
        int[] actual = MergeTwoSortArray.mergeTwoArr(firstArr, secondArr);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void positive_mergeTwoArrFirstArrLargerTest() {
        int[] firstArr = new int[]{1, 3, 6, 7};
        int[] secondArr = new int[]{2, 4, 5};
        int[] actual = MergeTwoSortArray.mergeTwoArr(firstArr, secondArr);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void positive_mergeTwoArrSecondArrLargerTest() {
        int[] firstArr = new int[]{1, 3, 6};
        int[] secondArr = new int[]{2, 4, 5, 7};
        int[] actual = MergeTwoSortArray.mergeTwoArr(firstArr, secondArr);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void positive_mergeTwoArrContainsSameValuesTest() {
        int[] firstArr = new int[]{1, 3, 3, 6};
        int[] secondArr = new int[]{2, 4, 5, 5, 7};
        int[] actual = MergeTwoSortArray.mergeTwoArr(firstArr, secondArr);
        int[] expected = new int[]{1, 2, 3, 3, 4, 5, 5, 6, 7};
        Assertions.assertArrayEquals(expected, actual);
    }
}