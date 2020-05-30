package com.mycompany.javaintroonline.lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void positive_findValueTest() {
        Assertions.assertEquals(0.25, Task2.findValue(1, 2, 3));
    }
}