package com.mycompany.itman.corecourse.lesson2.task2;

import com.mycompany.itman.corecourse.lesson1.Event;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {



    private Vector<Integer> createVector() {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(null);
        return vector;
    }

    private Vector<Event> createEventVector() {
        Vector<Event> vector = new Vector<>();
        vector.add(new Event(2020, 1, 8, "eight"));
        vector.add(new Event(2020, 1, 4, "four"));
        vector.add(new Event(2020, 1, 6, "six"));
        return vector;
    }

    @Test
    public void testAdd() {
        Vector<Integer> vector = createVector();
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, null}, vector.toArray());
    }

    @Test
    public void testSize() {
        Vector<Integer> vector = createVector();
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> {
            Assertions.assertEquals(4, vector.size());
        });
    }

    @Test
    public void getTest() {
        Vector<Integer> vector = createVector();
        Assertions.assertEquals(1, vector.get(0));
    }

    @Test
    public void setTest() {
        Vector<Integer> vector = createVector();
        vector.set(0, 1);
        Assertions.assertEquals(1, vector.get(0));
    }

    @Test
    public void removeTest() {
        Vector<Integer> vector = createVector();
        vector.remove(0);
        Assertions.assertEquals(2, vector.get(0));
    }

    @Test
    public void addIndexElementTest() {
        Vector<Integer> vector = createVector();
        vector.add(0, 5);
        Assertions.assertEquals(5, vector.get(0));
    }

    @Test
    public void toArrayTest() {
        Vector<Integer> vector = createVector();
        Object[] actual = vector.toArray();
        Object[] expected = new Object[]{1, 2, 3, null};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortTest() {
        Vector<Event> vectorActual = createEventVector();
        Comparator<Event> comparatorByDate = (a, b) -> {
            if (a.getDay() < b.getDay()) {
                return -1;
            }
            if (a.getDay() > b.getDay()) {
                return 1;
            }
            return 0;
        };
        vectorActual.sort(comparatorByDate);
        Object[] actual = vectorActual.toArray();
        Vector<Event> vectorExpected = new Vector<>();
        vectorExpected.add(new Event(2020, 1, 4, "four"));
        vectorExpected.add(new Event(2020, 1, 6, "six"));
        vectorExpected.add(new Event(2020, 1, 8, "eight"));
        Object[] expected = vectorExpected.toArray();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void clearTest() {
        Vector<Integer> vector = createVector();
        vector.clear();
        Vector<Integer> expected = new Vector<>();
        Assertions.assertArrayEquals(expected.toArray(), vector.toArray());
    }

    @Test
    public void testToString() {
        Vector<Integer> vector = createVector();
        String actual = vector.toString();
        String expected = "[1, 2, 3, null]";
        Assertions.assertEquals(expected, actual);
    }
}