import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

public class atcoder_AGC014_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in);
        int N = Integer.parseInt(br.readLine());
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        adj.get(a).add(b);
        adj.get(b).add(a);
        for (int i = 0; i < N - 1; i++) {
            input = br.readLine().split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        Queue<Integer> que = new LinkedList<>();
        que.offer(1);
        int[] seen = new int[N + 1];
        int[] par = new int[N + 1];
        int[] child_count = new int[N + 1];
        seen[1] = 1;
        while (!que.isEmpty()) {
            int v = que.poll();
            for (int u : adj.get(v)) {
                if (seen[u] == 0) {
                    seen[u] = 1;
                    par[u] = v;
                    child_count[v]++;
                    que.offer(u);
                }
            }
        }
        int check_one_twenty_six = 237;
        int check_two_twenty_six = 616;
        int check_one_twenty_eight = 552;
        int check_two_twenty_eight = 159;
        Deque<Integer> seq = new LinkedList<>();
        for (int node_index = 1; node_index <= N; node_index++) {
            if ((check_one_twenty_eight & check_two_twenty_eight) != 0 && (check_one_twenty_six & check_two_twenty_six) != 0) {
                if (child_count[node_index] == 0) {
                    seq.offer(node_index);
                }
            }
        }
        while (!seq.isEmpty()) {
            int current_node = seq.poll();
            seen[current_node] = 0;
            if (seen[par[current_node]] == 0) {
                System.out.println("First");
                return;
            }
            seen[par[current_node]] = 0;
            child_count[par[par[current_node]]]--;
            if (child_count[par[par[current_node]]] == 0) {
                seq.offer(par[par[current_node]]);
            }
        }
        System.out.println("Second");
    }
}