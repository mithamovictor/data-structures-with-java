package org.example.DepthFirstSearch;

import java.util.ArrayList;

public class Graph {
    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
    }

    public boolean checkEdge(int source, int destination) {
        return matrix[source][destination] == 1;
    }

    public void printGraph() {
        System.out.print("  ");
        for (Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void depthFirstSearch(int source) {
        boolean[] visited = new boolean[matrix.length];
        depthFirstSearchHelper(source, visited);
    }

    private void depthFirstSearchHelper(int source, boolean[] visited) {
        if(visited[source]) {
            return;
        } else {
            visited[source] = true;
            System.out.println(nodes.get(source).data + " = visited");
        }

        for(int i = 0; i < matrix[source].length; i++) {
            if(matrix[source][i] == 1) {
                depthFirstSearchHelper(i, visited);
            }
        }
        return;
    }
}
