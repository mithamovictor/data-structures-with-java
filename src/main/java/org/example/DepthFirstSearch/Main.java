package org.example.DepthFirstSearch;

public class Main {
    public static void main(String[] args) {

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
        System.out.println();

//        System.out.println(graph.checkEdge(0, 1));
//        System.out.println(graph.checkEdge(3, 2));

        graph.depthFirstSearch(3);
    }
}
