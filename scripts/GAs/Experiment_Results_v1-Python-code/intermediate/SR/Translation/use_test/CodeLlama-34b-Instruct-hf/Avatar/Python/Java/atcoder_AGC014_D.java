```java
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] adj = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                adj[i][j] = scanner.nextInt();
            }
        }

        Deque<Integer> que = new LinkedList<>();
        que.add(1);
        int[] seen = new int[n + 1];
        int[] par = new int[n + 1];
        int[] childCount = new int[n + 1];
        while (!que.isEmpty()) {
            int v = que.removeFirst();
            for (int u = 1; u <= n; u++) {
                if (adj[v][u] == 1 && seen[u] == 0) {
                    seen[u] = 1;
                    par[u] = v;
                    childCount[v]++;
                    que.addLast(u);
                }
            }
        }

        Deque<Integer> seq = new LinkedList<>();
        int checkOneTwentySix = 237;
        int checkTwoTwentySix = 616;
        int checkOneTwentyEight = 552;
        int checkTwoTwentyEight = 159;
        for (int i = 1; i <= n; i++) {
            if ((checkOneTwentySix & checkTwoTwentySix) == 0) {
                if ((checkOneTwentyEight & checkTwoTwentyEight) == 0) {
                    if (childCount[i] == 0) {
                        seq.addLast(i);
                    }
                }
            }
        }

        while (!seq.isEmpty()) {
            int currentNode = seq.removeFirst();
            seen[currentNode] = 0;
            if (seen[par[currentNode]] == 0) {
                System.out.println("First");
                return;
            }
            seen[par[currentNode]] = 0;
            childCount[par[par[currentNode]]]--;
            if (childCount[par[par[currentNode]]] == 0) {
                seq.addLast(par[par[currentNode]]);
            }
        }

        System.out.println("Second");
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient solution.
