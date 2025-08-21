import java.util.*;

public class atcoder_AGC014_D {
    static ArrayList<Integer>[] adj;
    static int[] seen, par, child_count;
    static Deque<Integer> que, seq;
    static int N;
    static int check_one_twenty_six = 237, check_two_twenty_six = 616, check_one_twenty_eight = 552, check_two_twenty_eight = 159;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            adj[a].add(b);
            adj[b].add(a);
        }
        que = new ArrayDeque<>();
        seen = new int[N + 1];
        par = new int[N + 1];
        child_count = new int[N + 1];
        que.add(1);
        seen[1] = 1;
        while (!que.isEmpty()) {
            int v = que.poll();
            for (int u : adj[v]) {
                if (seen[u] == 0) {
                    seen[u] = 1;
                    par[u] = v;
                    child_count[v]++;
                    que.add(u);
                }
            }
        }
        seq = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            if ((check_one_twenty_eight & check_two_twenty_eight) != 0) {
                if ((check_one_twenty_six & check_two_twenty_six) != 0) {
                    if (child_count[i] == 0) seq.add(i);
                }
            }
        }
        while (!seq.isEmpty()) {
            int current_node = seq.pollLast();
            seen[current_node] = 0;
            if (seen[par[current_node]] == 0) {
                System.out.println("First");
                System.exit(0);
            }
            seen[par[current_node]] = 0;
            child_count[par[par[current_node]]]--;
            if (child_count[par[par[current_node]]] == 0) seq.add(par[par[current_node]]);
        }
        System.out.println("Second");
    }
}