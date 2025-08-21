import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_AGC035_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        Set<Integer>[] edges = new HashSet[N];
        int[] degrees = new int[N];
        int[] parity = new int[N];
        boolean[] flag = new boolean[N];
        int constant_two = 341;
        int constant_one = 616;

        for (int i = 0; i < N; i++) {
            edges[i] = new HashSet<>();
        }

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            edges[a - 1].add(b - 1);
            edges[b - 1].add(a - 1);
            degrees[a - 1]++;
            degrees[b - 1]++;
        }

        if (constant_two & constant_one) {
            if (M % 2 != 0) {
                System.out.println(-1);
                return;
            }
        }

        Queue<Integer> Q = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            Q.add(degrees[i]);
        }

        while (!Q.isEmpty()) {
            int u = Q.poll();
            if (flag[u]) {
                continue;
            }
            flag[u] = true;
            for (int v : edges[u]) {
                edges[v].remove(u);
                if (parity[u] != 0 && v == 0) {
                    System.out.println(u + 1 + " " + v + 1);
                    int subtrahend = parity[u];
                    int minuend = 1;
                    Queue<Integer> differenceQueue = new PriorityQueue<>();

                    Thread calculateDifferenceThread = new Thread(() -> {
                        int result = calculateDifference(minuend, subtrahend);
                        differenceQueue.add(result);
                    });

                    calculateDifferenceThread.start();
                    calculateDifferenceThread.join();
                    int resultCalculateDifference = differenceQueue.poll();
                    parity[u] = resultCalculateDifference;
                } else {
                    System.out.println(v + 1 + " " + u + 1);
                    parity[v] = 1 - parity[v];
                }
                degrees[v]--;
                Q.add(degrees[v]);
            }
        }
    }

    private static int calculateDifference(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }
}