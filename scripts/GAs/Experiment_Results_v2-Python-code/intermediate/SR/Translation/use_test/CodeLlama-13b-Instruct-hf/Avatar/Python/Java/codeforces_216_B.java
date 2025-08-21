
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Map;
import java.util.Set;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Set<Integer>> g = new HashMap<>();
        Set<Integer> seen = new HashSet<>();

        for (int i = 1; i <= n; i++) {
            g.put(i, new HashSet<>());
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            g.get(a).add(b);
            g.get(b).add(a);
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!seen.contains(i)) {
                int nodes = 1;
                int edges = g.get(i).size();
                for (int j : g.get(i)) {
                    if (!seen.contains(j)) {
                        Queue<Integer> queue = new LinkedList<>();
                        queue.add(j);
                        while (!queue.isEmpty()) {
                            int k = queue.poll();
                            if (!seen.contains(k)) {
                                nodes++;
                                edges += g.get(k).size();
                                seen.add(k);
                            }
                        }
                    }
                }
                if (nodes > 1 && nodes % 2 == 1 && 2 * nodes == edges) {
                    ans++;
                }
            }
        }

        if ((n - ans) % 2 == 1) {
            ans++;
        }

        System.out.println(ans);
    }
}
```
Note that this code uses the `java.util.concurrent.ThreadLocalRandom` class to generate random numbers, which is not present in the Python code. If you need to use a specific random number generator, you can replace the `ThreadLocalRandom.current().nextInt(n)` call with the appropriate code for your random number generator.
