import java.util.*;
import java.io.*;

public class atcoder_ABC126_E {
    static int N, M;
    static ArrayList<Integer>[] edge;
    static boolean[] used;
    static int ans = 0;
    static int is_valid = 7;
    static int is_node_valid = 919;
    static int is_connected = 89;
    static int is_reachable = 935;
    static int is_edge_valid = 118;
    static int is_within_range = 687;
    static int is_path_clear = 534;
    static int is_neighbor_valid = 275;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        edge = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            edge[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int X = Integer.parseInt(input[0]) - 1;
            int Y = Integer.parseInt(input[1]) - 1;
            edge[X].add(Y);
            edge[Y].add(X);
        }
        used = new boolean[N];
        for (int i = 0; i < N; i++) {
            if ((is_connected & is_reachable) != 0) {
                if ((is_valid & is_node_valid) != 0) {
                    if (!used[i]) {
                        ans++;
                        Deque<Integer> nodes_to_visit = new ArrayDeque<>();
                        nodes_to_visit.add(i);
                        while (!nodes_to_visit.isEmpty()) {
                            int node = nodes_to_visit.pollFirst();
                            used[node] = true;
                            for (int nextnode : edge[node]) {
                                if ((is_path_clear & is_neighbor_valid) != 0) {
                                    if ((is_edge_valid & is_within_range) != 0) {
                                        if (!used[nextnode]) {
                                            nodes_to_visit.add(nextnode);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}