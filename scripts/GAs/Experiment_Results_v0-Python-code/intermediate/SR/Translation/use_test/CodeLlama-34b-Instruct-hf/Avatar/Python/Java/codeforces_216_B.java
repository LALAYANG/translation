```java
import java.util.Scanner;
import java.util.Set;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class DFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] graph = new int[n][n];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (graph[i][i] == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```
This Java code uses a 2D array to represent the graph, where each element in the array represents a node and its connections to other nodes. The `main` method takes in the number of nodes and edges as input, and then creates a 2D array to represent the graph. It then iterates over the edges and sets the corresponding elements in the array to 1 to represent the connections between nodes. Finally, it iterates over the nodes and checks if the node is connected to itself, and if so, increments the `ans` variable. The `ans` variable is then printed to the console.

Note that this code assumes that the input graph is represented as an adjacency matrix, where each element in the matrix represents the connection between two nodes. If the input graph is represented as an adjacency list, the code would need to be modified accordingly.
