package com.mycompany.javaintroonline.lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void positive_findValueTest() {
        Assertions.assertEquals(17.012265732562458, Task3.findValue(45, 45));
    }
}