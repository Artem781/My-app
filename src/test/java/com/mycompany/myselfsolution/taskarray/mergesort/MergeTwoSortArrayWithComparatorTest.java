package com.mycompany.myselfsolution.taskarray.mergesort;

import com.mycompany.itman.corecourse.lesson1.Event;
import com.mycompany.myselfsolution.taskarray.mergesort.MergeTwoSortArrayWithComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

class MergeTwoSortArrayWithComparatorTest {

    @Test
    void positive_mergeTwoArrDifferentLengthTest() {
        Event[] firstEventArr = new Event[]{
                new Event(2020, 2, 1, "A"),
                new Event(2020, 2, 3, "C"),
                new Event(2020, 2, 5, "E"),
                new Event(2020, 2, 6, "F")
        };
        Event[] secondEventArr = new Event[]{
                new Event(2020, 2, 2, "B"),
                new Event(2020, 2, 4, "D"),
        };
        Comparator<Event> compByDay = Comparator.comparingInt(Event::getDay);
        Object[] actual = MergeTwoSortArrayWithComparator.mergeTwoArr(firstEventArr, secondEventArr, compByDay);
//        Arrays.stream(actual).forEach(System.out::println);
        Object[] expected = new Event[]{
                new Event(2020, 2, 1, "A"),
                new Event(2020, 2, 2, "B"),
                new Event(2020, 2, 3, "C"),
                new Event(2020, 2, 4, "D"),
                new Event(2020, 2, 5, "E"),
                new Event(2020, 2, 6, "F")
        };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void positive_mergeTwoArrStabSortTest() {
        Event[] firstEventArr = new Event[]{
                new Event(2020, 2, 1, "A"),
                new Event(2020, 2, 3, "C"),
                new Event(2020, 2, 5, "E"),
                new Event(2020, 2, 6, "F")
        };
        Event[] secondEventArr = new Event[]{
                new Event(2020, 2, 1, "B"),
                new Event(2020, 2, 4, "D"),
        };
        Comparator<Event> compByDay = (Event a, Event b) -> {
            int dayA = a.getDay();
            int dayB = b.getDay();
            if (dayA < dayB) {
                return -1;
            }
            if (dayA > dayB) {
                return 1;
            }
            return 0;
        };
        Object[] actual = MergeTwoSortArrayWithComparator.mergeTwoArr(firstEventArr, secondEventArr, compByDay);
//        Arrays.stream(actual).forEach(System.out::println);
        Object[] expected = new Event[]{
                new Event(2020, 2, 1, "A"),
                new Event(2020, 2, 1, "B"),
                new Event(2020, 2, 3, "C"),
                new Event(2020, 2, 4, "D"),
                new Event(2020, 2, 5, "E"),
                new Event(2020, 2, 6, "F")
        };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void positive_mergeTwoArrOnlyStabSortTest() {
        Event[] firstEventArr = new Event[]{
                new Event(2020, 2, 1, "A"),
                new Event(2020, 2, 1, "B"),
                new Event(2020, 2, 1, "C"),
        };
        Event[] secondEventArr = new Event[]{
                new Event(2020, 2, 1, "D"),
                new Event(2020, 2, 1, "E"),
        };
        Comparator<Event> compByDay = (Event a, Event b) -> {
            int dayA = a.getDay();
            int dayB = b.getDay();
            if (dayA < dayB) {
                return -1;
            }
            if (dayA > dayB) {
                return 1;
            }
            return 0;
        };
        Object[] actual = MergeTwoSortArrayWithComparator.mergeTwoArr(firstEventArr, secondEventArr, compByDay);
//        Arrays.stream(actual).forEach(System.out::println);
        Object[] expected = new Event[]{
                new Event(2020, 2, 1, "A"),
                new Event(2020, 2, 1, "B"),
                new Event(2020, 2, 1, "C"),
                new Event(2020, 2, 1, "D"),
                new Event(2020, 2, 1, "E"),
        };
        Assertions.assertArrayEquals(expected, actual);
    }
}