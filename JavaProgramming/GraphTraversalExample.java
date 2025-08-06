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
        adjList[src].add(dest);
        adjList[dest].add(src); // Undirected
    }

    // Print Graph
    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ": ");
            for (int node : adjList[i]) {
                System.out.print("→ " + node + " ");
            }
            System.out.println();
        }
    }

    // BFS traversal
    void bfs(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.print("BFS Traversal starting from vertex " + start + ": ");
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : adjList[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // DFS traversal
    void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        System.out.print("DFS Traversal starting from vertex " + start + ": ");
        dfsUtil(start, visited);
        System.out.println();
    }

    void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjList[vertex]) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }
}

public class GraphTraversalExample {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);

        g.printGraph();

        g.bfs(0); // Start BFS from node 0
        g.dfs(0); // Start DFS from node 0
    }
}