package com.mycompany.expectsoft.intotest;

import com.mycompany.itman.corecourse.lesson1.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ToCheckTest {

    //    Входные данные
    //        A [1,3,5]
//        B [2,6,8]
//        Результат
//        A [1,2,3,5,6,8]
//        B [2,6,8]
    @Test
    void merge_positiveTest1() {
        Object[] expectedA = new Object[]{1, 2, 3, 5, 6, 8};
        Object[] expectedB = new Object[]{2, 6, 8};
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(6);
        b.add(8);
        ToCheck toCheck = new ToCheck();
        toCheck.merge(a, b);
        Object[] actualA = a.toArray();
        Object[] actualB = b.toArray();
//        System.out.println("expectedA: " + Arrays.toString(expectedA));
//        System.out.println("actualA: " + Arrays.toString(actualA));
//        System.out.println("expectedB: " + Arrays.toString(expectedB));
//        System.out.println("expectedB: " + Arrays.toString(expectedB));
        Assertions.assertArrayEquals(expectedA, actualA);
        Assertions.assertArrayEquals(expectedB, expectedB);

    }

    @Test
    void merge_positiveTest2() {
        Object[] expectedA = new Object[]{1, 2, 3, 5, 6, 8};
        Object[] expectedB = new Object[]{1, 3, 5};
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(6);
        a.add(8);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(3);
        b.add(5);
        ToCheck toCheck = new ToCheck();
        toCheck.merge(a, b);
        Object[] actualA = a.toArray();
        Object[] actualB = b.toArray();
        Assertions.assertArrayEquals(expectedA, actualA);
        Assertions.assertArrayEquals(expectedB, actualB);

    }

    @Test
    public void test_positiveMergeTwoArrayFirst() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(7);
        b.add(8);
        ToCheck toCheck = new ToCheck();
        toCheck.merge(a, b);
        Object[] expectedA = new Object[]{1, 2, 7, 8};
        Object[] expectedB = new Object[]{7, 8};
        Object[] actualA = a.toArray();
        Object[] actualB = b.toArray();
        Assertions.assertArrayEquals(expectedA, actualA);
        Assertions.assertArrayEquals(expectedB, actualB);
    }

    @Test
    public void test_positiveMergeTwoArraySecond() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(7);
        b.add(8);
        ToCheck toCheck = new ToCheck();
        toCheck.merge(a, b);
        Object[] expectedA = new Object[]{1, 7, 8};
        Object[] expectedB = new Object[]{7, 8};
        Object[] actualA = a.toArray();
        Object[] actualB = b.toArray();
        Assertions.assertArrayEquals(expectedA, actualA);
        Assertions.assertArrayEquals(expectedB, actualB);
    }

    @Test
    public void test_positiveMergeTwoArray() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(9);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(6);
        b.add(7);
        b.add(8);
        ToCheck toCheck = new ToCheck();
        toCheck.merge(a, b);
        Object[] expectedA = new Object[]{1, 2, 3, 6, 7, 8, 9};
        Object[] expectedB = new Object[]{3, 6, 7, 8};
        Object[] actualA = a.toArray();
        Object[] actualB = b.toArray();
        Assertions.assertArrayEquals(expectedA, actualA);
        Assertions.assertArrayEquals(expectedB, actualB);
    }
    @Test
    public void test_positiveMergeTwoArrayEqualsValue() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        ToCheck toCheck = new ToCheck();
        toCheck.merge(a, b);
        Object[] expectedA = new Object[]{1, 1, 2, 2};
        Object[] expectedB = new Object[]{1, 2};
        Object[] actualA = a.toArray();
        Object[] actualB = b.toArray();
        Assertions.assertArrayEquals(expectedA, actualA);
        Assertions.assertArrayEquals(expectedB, actualB);
    }
}