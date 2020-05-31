package com.mycompany.myselfsolution.taskarray.mergesort;

import com.mycompany.itman.corecourse.lesson1.Event;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void positive_mergeSort() {
        Event[] actual = new Event[]{
                new Event(2020, 1, 9, "A"),  // 0
                new Event(2020, 1, 5, "B"),  // 1
                new Event(2020, 1, 8, "C"),  // 2
                new Event(2020, 1, 2, "D"),  // 3
                new Event(2020, 1, 6, "E"),  // 4
                new Event(2020, 1, 4, "F"),  // 5
                new Event(2020, 1, 1, "G"),  // 6
                new Event(2020, 1, 11, "H"),  // 7
        };
        Comparator<Event> comparatorByDay = Comparator.comparingInt(Event::getDay);
        MergeSort.mergeSort(actual, comparatorByDay);
        Event[] expected = new Event[]{
                new Event(2020, 1, 1, "G"),  // 6
                new Event(2020, 1, 2, "D"),  // 3
                new Event(2020, 1, 4, "F"),  // 5
                new Event(2020, 1, 5, "B"),  // 1
                new Event(2020, 1, 6, "E"),  // 4
                new Event(2020, 1, 8, "C"),  // 2
                new Event(2020, 1, 9, "A"),  // 0
                new Event(2020, 1, 11, "H"),  // 7
        };
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void positive_mergeSortSameValuesArray() {
        Event[] actual = new Event[]{
                new Event(2020, 1, 9, "A"),  // 0
                new Event(2020, 1, 5, "B"),  // 1
                new Event(2020, 1, 8, "C"),  // 2
                new Event(2020, 1, 8, "D"),  // 3
                new Event(2020, 1, 6, "E"),  // 4
        };
        Comparator<Event> comparatorByDay = Comparator.comparingInt(Event::getDay);
        MergeSort.mergeSort(actual, comparatorByDay);
        Event[] expected = new Event[]{
                new Event(2020, 1, 5, "B"),  // 1
                new Event(2020, 1, 6, "E"),  // 4
                new Event(2020, 1, 8, "C"),  // 2
                new Event(2020, 1, 8, "D"),  // 3
                new Event(2020, 1, 9, "A"),  // 0
        };
        Assertions.assertArrayEquals(expected, actual);
    }
}