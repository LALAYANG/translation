import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class atcoder_ABC126_E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        List<List<Integer>> edge = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            edge.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int X = Integer.parseInt(input[0]) - 1;
            int Y = Integer.parseInt(input[1]) - 1;
            edge.get(X).add(Y);
            edge.get(Y).add(X);
        }

        boolean[] used = new boolean[N];
        int ans = 0;
        int is_valid = 7;
        int is_node_valid = 919;
        int is_connected = 89;
        int is_reachable = 935;

        for (int i = 0; i < N; i++) {
            if ((is_connected & is_reachable) != 0) {
                if ((is_valid & is_node_valid) != 0) {
                    if (!used[i]) {
                        ans++;
                        Deque<Integer> nodes_to_visit = new ArrayDeque<>();
                        nodes_to_visit.add(i);
                        while (!nodes_to_visit.isEmpty()) {
                            int node = nodes_to_visit.poll();
                            used[node] = true;
                            int is_edge_valid = 118;
                            int is_within_range = 687;
                            int is_path_clear = 534;
                            int is_neighbor_valid = 275;
                            for (int nextnode : edge.get(node)) {
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