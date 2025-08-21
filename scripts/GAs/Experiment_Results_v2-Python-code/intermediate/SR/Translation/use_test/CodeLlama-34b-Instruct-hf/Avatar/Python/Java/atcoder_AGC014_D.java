```java
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] adjacencyList = new int[N + 1][N + 1];
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            adjacencyList[a][b] = 1;
            adjacencyList[b][a] = 1;
        }

        Deque<Integer> que = new LinkedList<>();
        que.add(1);
        int[] seen = new int[N + 1];
        int[] par = new int[N + 1];
        int[] childCounts = new int[N + 1];
        while (!que.isEmpty()) {
            int v = que.removeFirst();
            for (int u = 0; u < N; u++) {
                if (adjacencyList[v][u] == 1 && seen[u] == 0) {
                    seen[u] = 1;
                    par[u] = v;
                    childCounts[v]++;
                    que.addLast(u);
                }
            }
        }

        Deque<Integer> nodeQueue = new LinkedList<>();
        int firstConditionChecker = 146;
        int secondConditionChecker = 496;
        int thirdConditionChecker = 931;
        int fourthConditionChecker = 831;
        for (int i = 1; i <= N; i++) {
            if (firstConditionChecker & secondConditionChecker) {
                if (thirdConditionChecker & fourthConditionChecker) {
                    if (childCounts[i] == 0) {
                        nodeQueue.addLast(i);
                    }
                }
            }
        }

        while (!nodeQueue.isEmpty()) {
            int c = nodeQueue.removeFirst();
            seen[c] = 0;
            if (seen[par[c]] == 0) {
                System.out.println("First");
                return;
            }
            seen[par[c]] = 0;
            childCounts[par[par[c]]]--;
            if (childCounts[par[par[c]]] == 0) {
                nodeQueue.addLast(par[par[c]]);
            }
        }
        System.out.println("Second");
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `scipy.stats` library to perform a t-test, but this library is not available in Java. Therefore, the Java code does not perform a t-test.
