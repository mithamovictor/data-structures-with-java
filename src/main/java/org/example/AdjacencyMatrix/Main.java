package org.example.AdjacencyMatrix;

public class Main {
    public static void main(String[] args) {
        // Adjacency matrix = A 2D array to store 1s and 0s to represent edges
        //                    # of rows =   # of unique nodes
        //                    # of cols =   # of unique nodes

        // run-time complexity to check an edge: O(1)
        // space complexity: O(v^2)

        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.printGraph();

//        System.out.println(graph.checkEdge(0, 1));
        System.out.println(graph.checkEdge(3, 2));
    }
}
