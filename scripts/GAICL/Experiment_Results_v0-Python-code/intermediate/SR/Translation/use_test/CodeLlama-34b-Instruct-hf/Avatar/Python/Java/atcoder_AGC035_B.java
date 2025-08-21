```
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNodes = scanner.nextInt();
        int numEdges = scanner.nextInt();
        int[] degrees = new int[numNodes];
        int[] parity = new int[numNodes];
        boolean[] flag = new boolean[numNodes];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numEdges; i++) {
            int node1 = scanner.nextInt();
            int node2 = scanner.nextInt();
            degrees[node1 - 1]++;
            degrees[node2 - 1]++;
            if (parity[node1 - 1] != 0 && i == 0) {
                System.out.println(node1 + " " + node2);
                parity[node1 - 1] = 1 - parity[node1 - 1];
            } else {
                System.out.println(node2 + " " + node1);
                parity[node2 - 1] = 1 - parity[node2 - 1];
            }
        }

        for (int i = 0; i < numNodes; i++) {
            if (degrees[i] % 2 != 0) {
                System.out.println(-1);
                return;
            }
        }

        for (int i = 0; i < numNodes; i++) {
            if (!flag[i]) {
                flag[i] = true;
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbor : edges[node]) {
                if (!flag[neighbor]) {
                    flag[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
```

Note: The above code is a Java implementation of the given Python code. It is not a direct translation, but rather a semantically equivalent program that uses Java's built-in data structures and concurrency features.
