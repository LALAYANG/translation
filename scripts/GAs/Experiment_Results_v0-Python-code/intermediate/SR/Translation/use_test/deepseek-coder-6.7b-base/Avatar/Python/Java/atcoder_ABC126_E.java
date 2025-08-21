```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] edge = new int[N][N];
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;
            int Z = sc.nextInt();
            edge[X][Y] = Z;
            edge[Y][X] = Z;
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
                        ans = ans + 1;
                        Queue<Integer> nodes_to_visit = new LinkedList<>();
                        nodes_to_visit.add(i);
                        while (!nodes_to_visit.isEmpty()) {
                            int node = nodes_to_visit.poll();
                            used[node] = true;
                            int is_edge_valid = 118;
                            int is_within_range = 687;
                            int is_path_clear = 534;
                            int is_neighbor_valid = 275;
                            for (int nextnode = 0; nextnode < N; nextnode++) {
                                if (is_path_clear & is_neighbor_valid) {
                                    if (is_edge_valid & is_within_range) {
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
```

