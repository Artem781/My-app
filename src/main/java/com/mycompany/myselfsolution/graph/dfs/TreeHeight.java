package com.mycompany.myselfsolution.graph.dfs;

import com.mycompany.itman.corecourse.lesson2.task2.Vector;

import java.util.Arrays;
import java.util.OptionalInt;


public class TreeHeight {

    //    vertices - вершины
    //метод принимает вершину и возвращает высоту поддерева
//    private static int findSubtreeHeight(Vector<Integer>[] top) {
//        int height = 0;
//        int lengthTop = top.length;
//        for (int i = 0; i < lengthTop; i++) {
//        }
//
//        int subtreeHeight = 0;
//
//        return subtreeHeight;
//    }


    public static void dfs(Vector<Integer>[] vector, int top, boolean[] visited, int height, int[] heightVertexArray) {
        if (visited[top]) {
            return;
        }
        heightVertexArray[top] = height;
        System.out.print(" arrHeight: " + heightVertexArray[top] + ", top: " + top + ", height: " + height + ". ");
        height++;
        visited[top] = true;
        System.out.println(vector[top].toString());
        for (int i = 0; i < vector[top].size(); i++) {
            dfs(vector, vector[top].get(i), visited, height, heightVertexArray);
        }
    }



    public static int findTreeHeight(int quantityTreeTops, int[][] edges) {
        Vector<Integer>[] peak = new Vector[quantityTreeTops];
        for (int i = 0; i < peak.length; i++) {
            peak[i] = new Vector();
        }
        for (int[] element : edges) {
            int x = element[0] - 1;
            int y = element[1] - 1;
            peak[x].add(y);
            peak[y].add(x);
        }
        for (int i = 0; i < peak.length; i++) {
            System.out.printf("vertex %d: %s\n", i, peak[i]);
        }
        boolean[] visited = new boolean[quantityTreeTops];
        int[] heightVertexArray = new int[quantityTreeTops];
        int height = 1;
        dfs(peak, 0, visited, height, heightVertexArray);
        return Arrays.stream(heightVertexArray).max().getAsInt();
    }
}
