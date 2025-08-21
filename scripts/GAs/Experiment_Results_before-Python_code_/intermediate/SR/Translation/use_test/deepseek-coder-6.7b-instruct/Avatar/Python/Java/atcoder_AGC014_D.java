Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    static ArrayList<Integer>[] adj;
    static int[] seen;
    static int[] par;
    static int[] child_num;
    static Deque<Integer> que = new ArrayDeque<>();
    static Deque<Integer> seq = new ArrayDeque<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            adj[a].add(b);
            adj[b].add(a);
        }
        que.add(1);
        seen = new int[N + 1];
        seen[1] = 1;
        par = new int[N + 1];
        child_num = new int[N + 1];
        while (!que.isEmpty()) {
            int v = que.pollFirst();
            for (int u : adj[v]) {
                if (seen[u] == 0) {
                    seen[u] = 1;
                    par[u] = v;
                    child_num[v]++;
                    que.add(u);
                }
            }
        }
        for (int i = 1; i <= N; i++) {
            if (child_num[i] == 0) {
                seq.add(i);
            }
        }
        while (!seq.isEmpty()) {
            int c = seq.pollLast();
            seen[c] = 0;
            if (seen[par[c]] == 0) {
                System.out.println("First");
                System.exit(0);
            }
            seen[par[c]] = 0;
            child_num[par[par[c]]]--;
            if (child_num[par[par[c]]] == 0) {
                seq.add(par[par[c]]);
            }
        }
        System.out.println("Second");
    }
}
```

This Java code does the same thing as the Python code. It reads the input, creates an adjacency list, and then uses BFS to find the parent-child relationship. It then checks if there is a cycle in the graph. If there is, it prints "First", otherwise it prints "Second".

