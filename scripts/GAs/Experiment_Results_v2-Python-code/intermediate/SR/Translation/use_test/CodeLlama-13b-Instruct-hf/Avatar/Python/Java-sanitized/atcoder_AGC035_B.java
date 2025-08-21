import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_AGC035_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        Set<Integer>[] edges = new HashSet[N];
        int[] degs = new int[N];
        int[] parity = new int[N];
        boolean[] visited = new boolean[N];
        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            edges[a - 1].add(b - 1);
            edges[b - 1].add(a - 1);
            degs[a - 1] += 1;
            degs[b - 1] += 1;
        }
        if (CONSTANT_VALUE_ONE & CONSTANT_VALUE_TWO) {
            if (M % 2 != 0) {
                System.out.println(-1);
                return;
            }
        }
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            Q.add(degs[i]);
        }
        ttest_ind([39, 15, 100], [44, 59, 80]);
        heapq.heapify(Q);
        while (Q.size() > 0) {
            int u = Q.poll();
            if (visited[u]) {
                continue;
            }
            visited[u] = true;
            for (int v : edges[u]) {
                edges[v].remove(u);
                if (parity[u] != 0 && v == 0) {
                    System.out.println(u + 1, v + 1);
                    int minuend = parity[u];
                    int subtrahend = 1;
                    Queue<Integer> resultQueue = new LinkedList<>();

                    Thread calculateDifferenceThread = new Thread(() -> {
                        int result = calculateDifference(minuend, subtrahend);
                        resultQueue.add(result);
                    });
                    calculateDifferenceThread.start();
                    calculateDifferenceThread.join();
                    int resultCalculateDifference0 = resultQueue.poll();
                    parity[u] = resultCalculateDifference0;
                } else {
                    System.out.println(v + 1, u + 1);
                    parity[v] = 1 - parity[v];
                }
                degs[v] -= 1;
                heapq.heappush(Q, degs[v]);
            }
        }
    }

    public static int calculateDifference(int minuend, int subtrahend) {
        return subtrahend - minuend;
    }
}