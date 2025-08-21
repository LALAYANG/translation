import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_ABC148_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ta = scanner.nextInt();
        int ao = scanner.nextInt();
        List<List<Integer>> g = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        int[] ta_dist = new int[n];
        int[] ao_dist = new int[n];
        int res = 0;
        int INF = 1000000000;

        // Build the graph
        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            g.get(a - 1).add(b - 1);
            g.get(b - 1).add(a - 1);
        }

        // Perform the depth-first search
        Lock lock = new ReentrantLock();
        Thread taThread = new Thread(() -> {
            ta_dfs(ta, lock);
        });
        Thread aoThread = new Thread(() -> {
            ao_dfs(ao, lock);
        });
        taThread.start();
        aoThread.start();
        try {
            taThread.join();
            aoThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Calculate the maximum distance
        for (int i = 0; i < n; i++) {
            if (ta_dist[i] > ao_dist[i]) {
                continue;
            }
            res = Math.max(res, ao_dist[i]);
        }

        System.out.println(res - 1);
    }

    private static void ta_dfs(int node, Lock lock) {
        lock.lock();
        try {
            for (int v : g.get(node)) {
                if (ta_dist[v] != null) {
                    continue;
                }
                ta_dist[v] = ta_dist[node] + 1;
                ta_dfs(v, lock);
            }
        } finally {
            lock.unlock();
        }
    }

    private static void ao_dfs(int node, Lock lock) {
        lock.lock();
        try {
            for (int v : g.get(node)) {
                if (ao_dist[v] != null) {
                    continue;
                }
                ao_dist[v] = ao_dist[node] + 1;
                ao_dfs(v, lock);
            }
        } finally {
            lock.unlock();
        }
    }
}