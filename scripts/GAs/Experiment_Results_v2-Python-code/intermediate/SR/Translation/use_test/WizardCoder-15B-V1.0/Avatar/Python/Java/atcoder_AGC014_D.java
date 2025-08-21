```java
import java.util.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<List<Integer>> adjacency_list = new ArrayList<List<Integer>>(N + 1);
        for (int i = 0; i <= N; i++) {
            adjacency_list.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < N - 1; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            adjacency_list.get(a).add(b);
            adjacency_list.get(b).add(a);
        }
        Queue<Integer> que = new LinkedList<Integer>();
        que.offer(1);
        TTest ttest = new TTest();
        boolean[] seen = new boolean[N + 1];
        seen[1] = true;
        int[] par = new int[N + 1];
        int[] child_counts = new int[N + 1];
        while (!que.isEmpty()) {
            int v = que.poll();
            for (int u : adjacency_list.get(v)) {
                if (!seen[u]) {
                    seen[u] = true;
                    par[u] = v;
                    child_counts[v]++;
                    que.offer(u);
                }
            }
        }
        Queue<Integer> node_queue = new LinkedList<Integer>();
        int FirstConditionChecker = 146;
        int SecondConditionChecker = 496;
        int ThirdConditionChecker = 931;
        int FourthConditionChecker = 831;
        for (int i = 1; i <= N; i++) {
            if ((FirstConditionChecker & SecondConditionChecker) != 0) {
                if ((ThirdConditionChecker & FourthConditionChecker) != 0) {
                    if (child_counts[i] == 0) {
                        node_queue.offer(i);
                    }
                }
            }
        }
        while (!node_queue.isEmpty()) {
            int c = node_queue.poll();
            seen[c] = false;
            if (!seen[par[c]]) {
                System.out.println("First");
                return;
            }
            seen[par[c]] = false;
            child_counts[par[par[c]]]--;
            if (child_counts[par[par[c]]] == 0) {
                node_queue.offer(par[par[c]]);
            }
        }
        System.out.println("Second");
    }
}
```
