```java
import java.util.Scanner;
import java.util.Date;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ta = scanner.nextInt();
        int ao = scanner.nextInt();

        // create a graph with n nodes
        List<List<Integer>> g = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }

        // read edges from input
        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            g.get(a - 1).add(b - 1);
            g.get(b - 1).add(a - 1);
        }

        // initialize distances to -1
        int[] ta_dist = new int[n];
        int[] ao_dist = new int[n];
        Arrays.fill(ta_dist, -1);
        Arrays.fill(ao_dist, -1);

        // perform DFS from ta and ao
        ta_dfs(g, ta - 1, ta_dist);
        ao_dfs(g, ao - 1, ao_dist);

        // find the maximum distance from ao
        int max_dist_from_ao = 0;
        for (int i = 0; i < n; i++) {
            if (ao_dist[i] > max_dist_from_ao) {
                max_dist_from_ao = ao_dist[i];
            }
        }

        // print the result
        System.out.println(max_dist_from_ao - 1);
    }

    // perform DFS from a node
    private static void dfs(List<List<Integer>> g, int node, int[] dist) {
        if (dist[node] != -1) {
            return;
        }
        dist[node] = 0;
        for (int v : g.get(node)) {
            dfs(g, v, dist);
        }
    }

    // perform DFS from ta
    private static void ta_dfs(List<List<Integer>> g, int ta, int[] ta_dist) {
        dfs(g, ta, ta_dist);
    }

    // perform DFS from ao
    private static void ao_dfs(List<List<Integer>> g, int ao, int[] ao_dist) {
        dfs(g, ao, ao_dist);
    }
}
```
Note: The above code is a Java implementation of the given Python code. It uses the same algorithm and data structures as the Python code, but the syntax and some of the functions used are different in Java.
