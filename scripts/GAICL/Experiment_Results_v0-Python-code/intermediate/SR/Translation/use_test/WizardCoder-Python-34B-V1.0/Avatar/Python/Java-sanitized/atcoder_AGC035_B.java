import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class atcoder_AGC035_B {
    public static void main(String[] args) {
        int newN_1, M;
        String[] input = "5 5".split(" ");
        newN_1 = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        int[] newdegs_1 = new int[newN_1];
        int[] parity = new int[newN_1];
        boolean[] flag = new boolean[newN_1];
        Arrays.fill(flag, false);
        int[][] edges = new int[newN_1][newN_1];
        PriorityQueue<int[]> Q = new PriorityQueue<>(newN_1, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < M; i++) {
            String[] edge = "1 2\n2 3\n3 4\n2 5\n4 5".split("\n");
            String[] nodes = edge[i].split(" ");
            int a = Integer.parseInt(nodes[0]) - 1;
            int newb_1 = Integer.parseInt(nodes[1]) - 1;
            edges[a][newb_1] = 1;
            edges[newb_1][a] = 1;
            newdegs_1[a]++;
            newdegs_1[newb_1]++;
        }

        if (M % 2 != 0) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < newN_1; i++) {
            Q.offer(new int[]{newdegs_1[i], i});
        }

        while (!Q.isEmpty()) {
            int[] top = Q.poll();
            int u = top[1];
            if (flag[u]) {
                continue;
            }
            flag[u] = true;
            for (int i = 0; i < newN_1; i++) {
                if (edges[u][i] == 1) {
                    edges[u][i] = 0;
                    edges[i][u] = 0;
                    if (parity[u] != 0 && i == 0) {
                        System.out.println((u + 1) + " " + (i + 1));
                        int newvariable_3_62 = parity[u];
                        int newvariable_1_62 = 1;
                        int result = newFunc0_36(newvariable_1_62, newvariable_3_62);
                        parity[u] = result;
                    } else {
                        System.out.println((i + 1) + " " + (u + 1));
                        parity[i] = 1 - parity[i];
                    }
                    newdegs_1[i]--;
                    Q.offer(new int[]{newdegs_1[i], i});
                }
            }
        }
    }

    public static int newFunc0_36(int newvariable_1_36_1, int newvariable_3_36_1) {
        return newvariable_1_36_1 - newvariable_3_36_1;
    }

    public static int newFunc0_62(int variable_3_62, int variable_1_62) {
        return variable_1_62 - variable_3_62;
    }
}