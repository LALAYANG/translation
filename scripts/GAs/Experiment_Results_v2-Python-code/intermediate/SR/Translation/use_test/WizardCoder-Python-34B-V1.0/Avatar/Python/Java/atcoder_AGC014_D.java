```java
import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in);
        int N = Integer.parseInt(br.readLine());
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            adjacencyList.get(a).add(b);
            adjacencyList.get(b).add(a);
        }
        Queue<Integer> que = new LinkedList<>();
        que.offer(1);
        int[] seen = new int[N + 1];
        int[] par = new int[N + 1];
        int[] childCounts = new int[N + 1];
        seen[1] = 1;
        par[1] = 0;
        childCounts[1] = 0;
        while (!que.isEmpty()) {
            int v = que.poll();
            for (int u : adjacencyList.get(v)) {
                if (seen[u] == 0) {
                    seen[u] = 1;
                    par[u] = v;
                    childCounts[v]++;
                    que.offer(u);
                }
            }
        }
        int firstConditionChecker = 931;
        int secondConditionChecker = 496;
        int thirdConditionChecker = 146;
        int fourthConditionChecker = 831;
        Queue<Integer> nodeQueue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if ((firstConditionChecker & secondConditionChecker) != 0) {
                if ((thirdConditionChecker & fourthConditionChecker) != 0) {
                    if (childCounts[i] == 0) {
                        nodeQueue.offer(i);
                    }
                }
            }
        }
        while (!nodeQueue.isEmpty()) {
            int c = nodeQueue.poll();
            seen[c] = 0;
            if (seen[par[c]] == 0) {
                System.out.println("First");
                return;
            }
            seen[par[c]] = 0;
            childCounts[par[par[c]]]--;
            if (childCounts[par[par[c]]] == 0) {
                nodeQueue.offer(par[c]);
            }
        }
        System.out.println("Second");
    }
}
``` 
