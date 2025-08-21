import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Comparator;

public class atcoder_AGC035_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<Set<Integer>> edges = new ArrayList<>();
        List<Integer> degs = new ArrayList<>();
        List<Integer> parity = new ArrayList<>();
        List<Boolean> flag = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            edges.add(new HashSet<>());
            degs.add(0);
            parity.add(0);
            flag.add(false);
        }
        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            edges.get(a - 1).add(b - 1);
            edges.get(b - 1).add(a - 1);
            degs.set(a - 1, degs.get(a - 1) + 1);
            degs.set(b - 1, degs.get(b - 1) + 1);
        }
        if (M % 2 != 0) {
            System.out.println(-1);
            return;
        }
        PriorityQueue<Integer> Q = new PriorityQueue<>(Comparator.comparingInt(degs::get));
        for (int i = 0; i < N; i++) {
            Q.add(i);
        }
        while (!Q.isEmpty()) {
            int u = Q.poll();
            if (flag.get(u)) {
                continue;
            }
            flag.set(u, true);
            for (int v : edges.get(u)) {
                edges.get(v).remove(u);
                if (parity.get(u) != 0 && v == edges.get(u).iterator().next()) {
                    System.out.println(u + 1 + " " + v + 1);
                    parity.set(u, 1 - parity.get(u));
                } else {
                    System.out.println(v + 1 + " " + u + 1);
                    parity.set(v, 1 - parity.get(v));
                }
                degs.set(v, degs.get(v) - 1);
                Q.add(v);
            }
        }
    }
}