import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class atcoder_AGC035_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] edges = new int[N][N];
        int[] degs = new int[N];
        int[] parity = new int[N];
        boolean[] flag = new boolean[N];

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            edges[a - 1][b - 1] = 1;
            edges[b - 1][a - 1] = 1;
            degs[a - 1]++;
            degs[b - 1]++;
        }

        if (M % 2 != 0) {
            System.out.println(-1);
            return;
        }

        Queue<Integer> Q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            Q.add(i);
        }

        while (!Q.isEmpty()) {
            int u = Q.poll();
            if (flag[u]) {
                continue;
            }
            flag[u] = true;
            for (int v : edges[u]) {
                if (parity[u] != 0 && v == 0) {
                    System.out.println(u + 1 + " " + v + 1);
                    parity[u] = 1 - parity[u];
                } else {
                    System.out.println(v + 1 + " " + u + 1);
                    parity[v] = 1 - parity[v];
                }
                degs[v]--;
                Q.add(v);
            }
        }
    }
}