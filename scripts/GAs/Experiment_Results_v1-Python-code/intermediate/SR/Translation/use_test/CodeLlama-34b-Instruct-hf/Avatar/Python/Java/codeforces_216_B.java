```java
import java.util.Scanner;
import java.util.Set;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class DFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNodes = scanner.nextInt();
        int m = scanner.nextInt();
        Graph g = new Graph(numNodes);
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            g.addEdge(a, b);
            g.addEdge(b, a);
        }
        int ans = 0;
        for (int i = 1; i <= numNodes; i++) {
            if (g.hasEdge(i, i)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

class Graph {
    int numNodes;
    int[][] edges;

    public Graph(int numNodes) {
        this.numNodes = numNodes;
        edges = new int[numNodes][numNodes];
    }

    public void addEdge(int a, int b) {
        edges[a][b] = 1;
        edges[b][a] = 1;
    }

    public boolean hasEdge(int a, int b) {
        return edges[a][b] == 1;
    }
}
```
This code defines a `Graph` class that represents a graph with `numNodes` nodes and `edges` edges. The `addEdge` method adds an edge between two nodes, and the `hasEdge` method checks if there is an edge between two nodes.

The `main` method reads the number of nodes and the number of edges from the input, creates a `Graph` object with the given number of nodes, and adds the edges to the graph. It then uses a loop to check if there is an edge between each pair of nodes, and increments the `ans` variable if there is. Finally, it prints the `ans` variable.

Note that this code assumes that the input is in the format specified in the problem statement, with the number of nodes and edges on the first line, and the edges on the following lines. If the input is in a different format, the code will need to be modified accordingly.
