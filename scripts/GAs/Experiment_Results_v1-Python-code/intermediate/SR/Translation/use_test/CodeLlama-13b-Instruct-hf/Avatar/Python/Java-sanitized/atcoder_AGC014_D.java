import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Deque;
import java.util.LinkedList;

public class atcoder_AGC014_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] adj = new int[N + 1];
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            adj[a] = b;
            adj[b] = a;
        }
        Deque<Integer> que = new LinkedList<>();
        que.add(1);
        boolean[] seen = new boolean[N + 1];
        seen[1] = true;
        int[] par = new int[N + 1];
        int[] childCount = new int[N + 1];
        while (!que.isEmpty()) {
            int v = que.removeFirst();
            for (int u : adj[v]) {
                if (!seen[u]) {
                    seen[u] = true;
                    par[u] = v;
                    childCount[v]++;
                    que.addLast(u);
                }
            }
        }
        Deque<Integer> seq = new LinkedList<>();
        for (int nodeIndex = 1; nodeIndex <= N; nodeIndex++) {
            if (childCount[nodeIndex] == 0) {
                seq.addLast(nodeIndex);
            }
        }
        while (!seq.isEmpty()) {
            int currentNode = seq.removeFirst();
            seen[currentNode] = false;
            if (!seen[par[currentNode]]) {
                System.out.println("First");
                return;
            }
            seen[par[currentNode]] = false;
            childCount[par[par[currentNode]]]--;
            if (childCount[par[par[currentNode]]] == 0) {
                seq.addLast(par[par[currentNode]]);
            }
        }
        System.out.println("Second");
    }
}