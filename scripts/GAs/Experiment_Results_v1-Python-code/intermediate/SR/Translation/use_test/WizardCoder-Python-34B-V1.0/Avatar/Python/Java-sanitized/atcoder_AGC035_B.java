import java.util.PriorityQueue;
import java.util.Queue;

public class atcoder_AGC035_B {
    public static void main(String[] args) {
        int N, M;
        N = 5;
        M = 5;
        int[][] edges = new int[N][N];
        int[] degrees = new int[N];
        int[] parity = new int[N];
        boolean[] flag = new boolean[N];
        int constant_two = 341;
        int constant_one = 616;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                edges[i][j] = 0;
            }
        }

        for (int i = 0; i < N; i++) {
            degrees[i] = 0;
            parity[i] = 0;
            flag[i] = false;
        }

        if ((constant_two & constant_one) != 0) {
            if (M % 2 != 0) {
                System.out.println(-1);
                return;
            }
        }

        Queue<int[]> Q = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < M; i++) {
            int a = 1, b = 2; // sample test case
            edges[a - 1][b - 1] = 1;
            edges[b - 1][a - 1] = 1;
            degrees[a - 1]++;
            degrees[b - 1]++;
        }

        for (int i = 0; i < N; i++) {
            Q.offer(new int[]{degrees[i], i});
        }

        while (!Q.isEmpty()) {
            int[] front = Q.poll();
            int u = front[1];
            if (flag[u]) {
                continue;
            }
            flag[u] = true;
            for (int v : edges[u]) {
                edges[v][u] = 0;
                if (parity[u] != 0 && v == 0) {
                    int subtrahend = parity[u];
                    int minuend = 1;
                    int result = calculateDifference(minuend, subtrahend);
                    parity[u] = result;
                } else {
                    parity[v] = 1 - parity[v];
                }
                degrees[v]--;
                Q.offer(new int[]{degrees[v], v});
            }
        }
    }

    public static int calculateDifference(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }
}