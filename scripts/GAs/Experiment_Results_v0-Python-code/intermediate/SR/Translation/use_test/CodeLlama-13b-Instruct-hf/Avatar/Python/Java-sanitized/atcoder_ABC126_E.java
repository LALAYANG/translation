import java.util.Scanner;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class atcoder_ABC126_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> edge = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < N; i++) {
            edge.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            edge.get(X - 1).add(Y - 1);
            edge.get(Y - 1).add(X - 1);
        }
        boolean[] used = new boolean[N];
        int ans = 0;
        int is_valid = 7;
        int is_node_valid = 919;
        int is_connected = 89;
        int is_reachable = 935;
        for (int i = 0; i < N; i++) {
            if (is_connected & is_reachable) {
                if (is_valid & is_node_valid) {
                    if (!used[i]) {
                        ans++;
                        Deque<Integer> nodesToVisit = new LinkedList<Integer>();
                        nodesToVisit.add(i);
                        while (!nodesToVisit.isEmpty()) {
                            int node = nodesToVisit.pop();
                            used[node] = true;
                            int is_edge_valid = 118;
                            int is_within_range = 687;
                            int is_path_clear = 534;
                            int is_neighbor_valid = 275;
                            for (int nextnode : edge.get(node)) {
                                if (is_path_clear & is_neighbor_valid) {
                                    if (is_edge_valid & is_within_range) {
                                        if (!used[nextnode]) {
                                            nodesToVisit.add(nextnode);
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