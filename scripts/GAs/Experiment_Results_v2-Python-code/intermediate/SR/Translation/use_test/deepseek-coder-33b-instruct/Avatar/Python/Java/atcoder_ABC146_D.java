```java
import java.util.*;

public class Main {
    static class Graph {
        int V;
        LinkedList<Integer>[] adjListArray;

        Graph(int V) {
            this.V = V;
            adjListArray = new LinkedList[V];
            for (int i = 0; i < V; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }
    }

    static void addEdge(Graph graph, int src, int dest) {
        graph.adjListArray[src].addFirst(dest);
        graph.adjListArray[dest].addFirst(src);
    }

    static void BFS(Graph graph, int src) {
        boolean visited[] = new boolean[graph.V];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[src] = true;
        queue.add(src);
        while (queue.size() != 0) {
            src = queue.poll();
            System.out.print(src + " ");
            Iterator<Integer> i = graph.adjListArray[src].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        int V = 5;
        Graph graph = new Graph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        BFS(graph, 0);
    }
}
```

