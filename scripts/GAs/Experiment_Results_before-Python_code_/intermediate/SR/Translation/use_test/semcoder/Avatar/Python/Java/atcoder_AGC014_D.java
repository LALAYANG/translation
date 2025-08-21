Thought process:
1. Read the input and construct the adjacency list representing the tree structure.
2. Perform a BFS traversal to determine the parent and child count of each node.
3. Use a deque to maintain the sequence of leaves and their parents.
4. Update the parent's child count and check for the condition to print 'First' or 'Second'.

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] adj = new int[N + 1][];
        for (int i = 0; i < N - 1; i++) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            if (adj[a] == null) adj[a] = new int[0];
            if (adj[b] == null) adj[b] = new int[0];
            adj[a] = append(adj[a], b);
            adj[b] = append(adj[b], a);
        }

        Deque<Integer> que = new ArrayDeque<>();
        que.add(1);
        int[] seen = new int[N + 1];
        seen[1] = 1;
        int[] par = new int[N + 1];
        int[] child_num = new int[N + 1];
        while (!que.isEmpty()) {
            int v = que.poll();
            for (int u : adj[v]) {
                if (seen[u] == 0) {
                    seen[u] = 1;
                    par[u] = v;
                    child_num[v]++;
                    que.add(u);
                }
            }
        }

        Deque<Integer> seq = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            if (child_num[i] == 0) seq.add(i);
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
            if (child_num[par[par[c]]] == 0) seq.add(par[par[c]]);
        }
        System.out.println("Second");
    }

    private static int[] append(int[] arr, int val) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = val;
        return newArr;
    }
}
```
