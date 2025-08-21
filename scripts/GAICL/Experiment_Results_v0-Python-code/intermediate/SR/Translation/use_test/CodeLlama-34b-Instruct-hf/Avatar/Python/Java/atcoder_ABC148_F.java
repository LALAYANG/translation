```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ta = sc.nextInt();
        int ao = sc.nextInt();
        ta = ta - 1;
        ao = ao - 1;
        List<List<Integer>> g = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g.get(a - 1).add(b - 1);
            g.get(b - 1).add(a - 1);
        }
        int[] ta_dist = new int[n];
        int[] ao_dist = new int[n];
        ta_dist[ta] = 0;
        ao_dist[ao] = 0;
        ta_dfs(g, ta, ta_dist);
        ao_dfs(g, ao, ao_dist);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ta_dist[i] > ao_dist[i]) {
                continue;
            }
            res = Math.max(res, ao_dist[i]);
        }
        System.out.println(res - 1);
    }

    public static void ta_dfs(List<List<Integer>> g, int node, int[] ta_dist) {
        for (int v : g.get(node)) {
            if (ta_dist[v] != -1) {
                continue;
            }
            ta_dist[v] = ta_dist[node] + 1;
            ta_dfs(g, v, ta_dist);
        }
    }

    public static void ao_dfs(List<List<Integer>> g, int node, int[] ao_dist) {
        for (int v : g.get(node)) {
            if (ao_dist[v] != -1) {
                continue;
            }
            ao_dist[v] = ao_dist[node] + 1;
            ao_dfs(g, v, ao_dist);
        }
    }
}
```
This Java code is a translation of the Python code you provided. It uses a similar approach to the Python code, with the main difference being the use of a `List` to represent the graph instead of a `numpy` array. The `ta_dfs` and `ao_dfs` methods are also similar to the Python code, with the main difference being the use of a `for` loop to iterate over the neighbors of a node instead of a `for` loop with a `range` iterator.

Note that the Java code uses the `Scanner` class to read input from the user, while the Python code uses the `input` function. Also, the Java code uses the `Math.max` method to find the maximum of two integers, while the Python code uses the `max` function.
