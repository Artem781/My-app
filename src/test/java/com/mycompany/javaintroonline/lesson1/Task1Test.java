package com.mycompany.javaintroonline.lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void positive_findValueFunctionTest() {
        Assertions.assertEquals(4, Task1.findValueFunction(4, 4, 2));
    }
}