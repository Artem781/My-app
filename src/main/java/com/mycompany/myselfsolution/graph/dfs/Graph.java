package com.mycompany.myselfsolution.graph.dfs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    private LinkedList<Integer>[] adjLists;
    private boolean[] visited;

    // Graph creation
    Graph(int vertices) {
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<Integer>();
    }

    // Add edges
    void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    // DFS algorithm
    void DFS(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> ite = adjLists[vertex].listIterator();
        while (ite.hasNext()) {
            int adj = ite.next();
            if (!visited[adj])
                DFS(adj);
        }
    }

    public static void main(String args[]) {
//        Graph g = new Graph(4);
        Graph g = new Graph(7);

//        g.addEdge(0, 1);
//        g.addEdge(0, 2);
//        g.addEdge(1, 2);
//        g.addEdge(2, 3);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 0);
        g.addEdge(1, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(3, 1);
        g.addEdge(4, 6);
        g.addEdge(4, 2);
        g.addEdge(5, 2);
        g.addEdge(6, 4);
        System.out.println("Following is Depth First Traversal");
        for (int i = 0; i < g.adjLists.length; i++) {
            System.out.printf("vertex %d: %s\n", i, g.adjLists[i]);
        }
        System.out.println("---");
        g.DFS(2);
    }
//            1 2
//            1 3
//            2 4
//            3 5
//            3 6
//            5 7

//            0: [1, 2]
//            1: [0, 3]
//            2: [0, 4, 5]
//            3: [1]
//            4: [2, 6]
//            5: [2]
//            6: [4]
}
