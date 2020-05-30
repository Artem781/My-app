package com.mycompany.javaintroonline.lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void positive_replaceThreeNumberTest() {
        Assertions.assertEquals(111.222, Task4.replaceThreeNumber(222.111));

    }
}