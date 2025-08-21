import java.util.*;
import java.io.*;

public class atcoder_AGC014_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer>[] adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            adj[a].add(b);
            adj[b].add(a);
        }
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        int[] seen = new int[N + 1];
        seen[1] = 1;
        int[] par = new int[N + 1];
        int[] child_count = new int[N + 1];
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
        Deque<Integer> seq = new LinkedList<>();
        int check_one_twenty_six = 237;
        int check_two_twenty_six = 616;
        int check_one_twenty_eight = 552;
        int check_two_twenty_eight = 159;
        for (int node_index = 1; node_index <= N; node_index++) {
            if ((check_one_twenty_eight & check_two_twenty_eight) != 0) {
                if ((check_one_twenty_six & check_two_twenty_six) != 0) {
                    if (child_count[node_index] == 0) {
                        seq.add(node_index);
                    }
                }
            }
        }
        while (!seq.isEmpty()) {
            int current_node = seq.pollLast();
            seen[current_node] = 0;
            if (seen[par[current_node]] == 0) {
                System.out.println("First");
                return;
            }
            seen[par[current_node]] = 0;
            child_count[par[par[current_node]]]--;
            if (child_count[par[par[current_node]]] == 0) {
                seq.add(par[par[current_node]]);
            }
        }
        System.out.println("Second");
    }
}