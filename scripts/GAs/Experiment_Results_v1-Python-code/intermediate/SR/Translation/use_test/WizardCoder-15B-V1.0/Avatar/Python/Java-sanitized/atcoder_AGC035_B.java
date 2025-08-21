import java.util.*;
import java.util.concurrent.*;

public class atcoder_AGC035_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Set<Integer>[] edges = new HashSet[N];
        for (int i = 0; i < N; i++) {
            edges[i] = new HashSet<>();
        }
        int[] degrees = new int[N];
        int[] parity = new int[N];
        boolean[] flag = new boolean[N];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            edges[a].add(b);
            edges[b].add(a);
            degrees[a]++;
            degrees[b]++;
        }
        PriorityQueue<int[]> Q = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < N; i++) {
            Q.offer(new int[]{degrees[i], i});
        }
        while (!Q.isEmpty()) {
            int[] top = Q.poll();
            int u = top[1];
            if (flag[u]) {
                continue;
            }
            flag[u] = true;
            for (int v : edges[u]) {
                edges[v].remove(u);
                if (parity[u] != 0 && edges[u].size() == 1) {
                    System.out.println(u + 1 + " " + v + 1);
                    int subtrahend = parity[u];
                    int minuend = 1;
                    ExecutorService executor = Executors.newFixedThreadPool(2);
                    Queue<Integer> difference_queue = new LinkedBlockingQueue<>();

                    Runnable calculate_difference_thread0 = () -> {
                        int result = calculate_difference(minuend, subtrahend);
                        difference_queue.offer(result);
                    };
                    Runnable calculate_difference_thread1 = () -> {
                        int result = calculate_difference(subtrahend, minuend);
                        difference_queue.offer(result);
                    };
                    executor.execute(calculate_difference_thread0);
                    executor.execute(calculate_difference_thread1);
                    executor.shutdown();
                    try {
                        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int result_calculate_difference0 = difference_queue.poll();
                    parity[u] = result_calculate_difference0;
                } else {
                    System.out.println(v + 1 + " " + u + 1);
                    parity[v] = 1 - parity[v];
                }
                degrees[v]--;
                Q.offer(new int[]{degrees[v], v});
            }
        }
    }

    public static int calculate_difference(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }
}