package JavaProgramming;


import java.util.LinkedList;

class Graph {
    int vertices;
    LinkedList<Integer>[] adjList;

    // Constructor
    Graph(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge
    void addEdge(int src, int dest) {
        adjList[src].add(dest); // src -> dest
        adjList[dest].add(src); // dest -> src (undirected)
    }

    // Display adjacency list
    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ": ");
            for (int node : adjList[i]) {
                System.out.print("-> " + node + " ");
            }
            System.out.println();
        }
    }
}

public class AdjacencyList {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);

        g.printGraph();
    }
}