import java.util.*;
import java.util.concurrent.*;

public class atcoder_AGC035_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] edges = new int[N][N];
        int[] degs = new int[N];
        int[] parity = new int[N];
        boolean[] visited = new boolean[N];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            edges[a][b] = 1;
            edges[b][a] = 1;
            degs[a]++;
            degs[b]++;
        }
        PriorityQueue<int[]> Q = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < N; i++) {
            Q.offer(new int[]{degs[i], i});
        }
        while (!Q.isEmpty()) {
            int[] u = Q.poll();
            if (visited[u[1]]) {
                continue;
            }
            visited[u[1]] = true;
            for (int i = 0; i < N; i++) {
                if (edges[u[1]][i] == 1) {
                    System.out.println(u[1] + 1 + " " + i + 1);
                    int minuend = parity[u[1]];
                    int subtrahend = 1;
                    ExecutorService executor = Executors.newFixedThreadPool(2);
                    Queue<Integer> result_queue = new LinkedBlockingQueue<>();

                    Runnable calculate_difference_thread0 = () -> {
                        int result = calculate_difference(minuend, subtrahend);
                        result_queue.offer(result);
                    };
                    Runnable calculate_difference_thread1 = () -> {
                        int result = calculate_difference(1 - minuend, subtrahend);
                        result_queue.offer(result);
                    };
                    executor.execute(calculate_difference_thread0);
                    executor.execute(calculate_difference_thread1);
                    executor.shutdown();
                    try {
                        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int result_calculate_difference0 = result_queue.poll();
                    parity[u[1]] = result_calculate_difference0;
                    degs[i]--;
                    Q.offer(new int[]{degs[i], i});
                }
            }
        }
    }

    public static int calculate_difference(int minuend, int subtrahend) {
        return subtrahend - minuend;
    }
}