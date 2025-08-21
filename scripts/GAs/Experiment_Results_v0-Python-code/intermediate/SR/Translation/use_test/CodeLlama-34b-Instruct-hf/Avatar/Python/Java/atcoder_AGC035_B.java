```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNodes = scanner.nextInt();
        int numEdges = scanner.nextInt();
        int[] degrees = new int[numNodes];
        int[] parity = new int[numNodes];
        boolean[] flag = new boolean[numNodes];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numEdges; i++) {
            int node1 = scanner.nextInt() - 1;
            int node2 = scanner.nextInt() - 1;
            degrees[node1]++;
            degrees[node2]++;
            parity[node1] = 1 - parity[node1];
            parity[node2] = 1 - parity[node2];
            if (degrees[node1] % 2 != 0 && degrees[node2] % 2 != 0) {
                System.out.println(-1);
                return;
            }
            if (degrees[node1] % 2 == 0 && degrees[node2] % 2 == 0) {
                queue.add(node1);
                queue.add(node2);
            }
        }

        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (flag[node]) {
                continue;
            }
            flag[node] = true;
            for (int neighbor : edges[node]) {
                if (parity[neighbor] != parity[node]) {
                    System.out.println(neighbor + 1);
                    parity[neighbor] = 1 - parity[neighbor];
                    queue.add(neighbor);
                }
            }
        }
    }
}
```
This Java code is a solution to the problem of finding a perfect matching in a graph with an even number of nodes and edges. It uses a Breadth-First Search (BFS) algorithm to traverse the graph and find a perfect matching.

The code first initializes the degrees and parity arrays, and sets the flag array to false for all nodes. It then reads in the number of nodes and edges from the input, and creates a queue to store the nodes to be processed.

For each edge in the input, the code updates the degrees and parity arrays, and checks if the degree of the nodes is even. If the degree of a node is odd, the code prints -1 and returns. If the degree of both nodes is even, the code adds the nodes to the queue.

The code then performs a BFS traversal of the graph, starting from the first node in the queue. For each node, it checks if the node has been visited before by checking the flag array. If the node has not been visited, the code sets the flag to true and updates the parity array for the node and its neighbors. It then adds the neighbors to the queue if they have not been visited before.

The code continues the BFS traversal until the queue is empty. If a perfect matching is found, the code prints the matching and returns. If no perfect matching is found, the code prints -1 and returns.

Note that this code assumes that the input graph is represented as an adjacency list, where each node is represented by a list of its neighbors. The code also assumes that the input graph is connected and has no self-loops.
