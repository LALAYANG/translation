
Here is the Java code that translates the Python code:
```java
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.scijava.stats.ttest.TTestInd;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;

public class PythonToJava {

    public static void main(String[] args) throws Exception {
        // Parse the input
        String input = "5 4 5\n1 2\n1 3\n1 4\n1 5";
        String[] lines = input.split("\n");
        int n = Integer.parseInt(lines[0]);
        int ta = Integer.parseInt(lines[1]);
        int ao = Integer.parseInt(lines[2]);

        // Create a graph
        List<List<Integer>> g = Lists.newArrayListWithCapacity(n);
        for (int i = 0; i < n; i++) {
            g.add(Lists.newArrayList());
        }

        // Build the graph
        for (int i = 0; i < n - 1; i++) {
            String[] edge = lines[i + 3].split(" ");
            int a = Integer.parseInt(edge[0]);
            int b = Integer.parseInt(edge[1]);
            g.get(a - 1).add(b - 1);
            g.get(b - 1).add(a - 1);
        }

        // Calculate the distances from the starting node
        int[] ta_dist = new int[n];
        int[] ao_dist = new int[n];
        ta_dist[ta] = 0;
        ao_dist[ao] = 0;

        // Perform DFS from the starting node
        Queue<Integer> queue = Queues.newArrayDeque();
        queue.add(ta);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int v : g.get(node)) {
                if (ta_dist[v] != 0) {
                    continue;
                }
                ta_dist[v] = ta_dist[node] + 1;
                queue.add(v);
            }
        }

        // Perform DFS from the starting node
        queue.clear();
        queue.add(ao);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int v : g.get(node)) {
                if (ao_dist[v] != 0) {
                    continue;
                }
                ao_dist[v] = ao_dist[node] + 1;
                queue.add(v);
            }
        }

        // Calculate the maximum distance from the starting node
        int max_dist_from_ao = 0;
        for (int i = 0; i < n; i++) {
            if (ta_dist[i] > ao_dist[i]) {
                continue;
            }
            max_dist_from_ao = Math.max(max_dist_from_ao, ao_dist[i]);
        }

        // Print the result
        System.out.println(max_dist_from_ao - 1);
    }
}
```
Note that this code is not optimized for performance, and it may not produce the same output as the original Python code. The main purpose of this code is to demonstrate how to translate the Python code to Java.
