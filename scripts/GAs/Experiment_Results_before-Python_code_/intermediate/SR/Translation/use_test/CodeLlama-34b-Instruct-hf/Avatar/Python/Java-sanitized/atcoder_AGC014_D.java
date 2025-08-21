import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class atcoder_AGC014_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] adj = new int[n + 1][n + 1];
        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            adj[a][b] = 1;
            adj[b][a] = 1;
        }

        Deque<Integer> que = new LinkedList<>();
        que.add(1);
        int[] seen = new int[n + 1];
        int[] par = new int[n + 1];
        int[] childNum = new int[n + 1];
        while (!que.isEmpty()) {
            int v = que.removeFirst();
            for (int u = 0; u < n; u++) {
                if (adj[v][u] == 1 && seen[u] == 0) {
                    seen[u] = 1;
                    par[u] = v;
                    childNum[v]++;
                    que.addLast(u);
                }
            }
        }

        Deque<Integer> seq = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (childNum[i] == 0) {
                seq.addLast(i);
            }
        }

        while (!seq.isEmpty()) {
            int c = seq.removeFirst();
            seen[c] = 0;
            if (seen[par[c]] == 0) {
                System.out.println("First");
                return;
            }
            seen[par[c]] = 0;
            childNum[par[par[c]]]--;
            if (childNum[par[par[c]]] == 0) {
                seq.addLast(par[par[c]]);
            }
        }
        System.out.println("Second");
    }
}