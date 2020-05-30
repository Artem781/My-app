package com.mycompany.myselfsolution.taskarray.mergesort;

import com.mycompany.itman.corecourse.lesson1.Event;
import com.mycompany.myselfsolution.taskarray.mergesort.MergeTwoPartsOfOneArr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

class MergeTwoPartsOfOneArrTest {
    @Test
    void positive_mergeTest() {
        Event[] eventArr = new Event[]{
                new Event(2020, 1, 1, "A"),  // 0
                new Event(2020, 1, 3, "B"),  // 1
                new Event(2020, 1, 5, "C"),  // 2
                new Event(2020, 1, 7, "D"),  // 3
                new Event(2020, 1, 2, "E"),  // 4
                new Event(2020, 1, 4, "F"),  // 5
                new Event(2020, 1, 6, "G"),  // 6
                new Event(2020, 1, 7, "H"),  // 7
        };
        int left = 0;
        int right = eventArr.length;
        int medium = (right - left) / 2 + left;
        Event[] temp = new Event[right - left];
//        Comparator<Event> compEventByDay = (a, b) -> a.getDay() - b.getDay();
        Comparator<Event> compEventByDay = Comparator.comparingInt(Event::getDay);
        Event[] actual = MergeTwoPartsOfOneArr.merge(eventArr, temp, left, medium, right, compEventByDay);
//        Arrays.stream(actual).forEach(System.out::println);
        Event[] expected = new Event[]{
                new Event(2020, 1, 1, "A"),
                new Event(2020, 1, 2, "E"),
                new Event(2020, 1, 3, "B"),
                new Event(2020, 1, 4, "F"),
                new Event(2020, 1, 5, "C"),
                new Event(2020, 1, 6, "G"),
                new Event(2020, 1, 7, "D"),
                new Event(2020, 1, 7, "H"),
        };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void positive_mergeSameValuesArrTest() {
        Event[] eventArr = new Event[]{
                new Event(2020, 1, 1, "A"),
                new Event(2020, 1, 1, "B"),
                new Event(2020, 1, 1, "C"),
                new Event(2020, 1, 1, "D"),
        };
        int left = 0;
        int right = eventArr.length;
        int medium = (right - left) / 2 + left;
        Event[] temp = new Event[right - left];
//        Comparator<Event> compEventByDay = (a, b) -> a.getDay() - b.getDay();
        Comparator<Event> compEventByDay = Comparator.comparingInt(Event::getDay);
        Event[] actual = MergeTwoPartsOfOneArr.merge(eventArr, temp, left, medium, right, compEventByDay);
//        Arrays.stream(actual).forEach(System.out::println);
        Event[] expected = new Event[]{
                new Event(2020, 1, 1, "A"),
                new Event(2020, 1, 1, "B"),
                new Event(2020, 1, 1, "C"),
                new Event(2020, 1, 1, "D"),
        };
        Assertions.assertArrayEquals(expected, actual);
    }
}