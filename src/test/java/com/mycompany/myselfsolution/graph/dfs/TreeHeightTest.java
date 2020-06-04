package com.mycompany.myselfsolution.graph.dfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TreeHeightTest {
    int[][] createTestDataForFirstTree() {
        return new int[][]{
                {1, 2},
                {1, 3},
                {2, 4},
                {3, 5},
                {3, 6},
                {5, 7},
        };
    }

    int[][] createTestDataForSecondTree() {
        return new int[][]{
                {1, 2},
                {1, 3},
                {2, 4},
                {2, 5},
                {3, 6},
                {3, 7},
                {4, 8},
                {6, 9},
                {6, 10},
                {9, 11},
        };
    }


    @Test
    void findTreeHeightForFirstTreeTest() {
        int quantityVertex = 7;
        int actual = TreeHeight.findTreeHeight(quantityVertex, createTestDataForFirstTree());
        Assertions.assertEquals(4, actual);
    }

    @Test
    void findTreeHeightForSecondTreeTest() {
        int quantityVertex = 11;
        int actual = TreeHeight.findTreeHeight(quantityVertex, createTestDataForSecondTree());
        Assertions.assertEquals(5, actual);
    }
}