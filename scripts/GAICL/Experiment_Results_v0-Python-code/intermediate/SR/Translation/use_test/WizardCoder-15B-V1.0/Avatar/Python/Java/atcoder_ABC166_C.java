```java
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = IntStream.rangeClosed(1, n).toArray();
        int[] health = sc.nextLine().split("\\s+").mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> healthPoints = IntStream.range(0, p.length)
                .boxed()
                .collect(Collectors.toMap(i -> p[i], i -> health[i]));
        Map<Integer, List<Integer>> path = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int nodeB = sc.nextInt();
            if (!path.containsKey(a)) {
                path.put(a, new ArrayList<>());
            }
            if (!path.containsKey(nodeB)) {
                path.put(nodeB, new ArrayList<>());
            }
            path.get(a).add(nodeB);
            path.get(nodeB).add(a);
        }
        int c = 0;
        for (int i = 1; i <= n; i++) {
            List<Integer> neighbors = path.get(i);
            if (neighbors == null) {
                continue;
            }
            boolean found = false;
            for (int neighbor : neighbors) {
                if (healthPoints.get(i) <= healthPoints.get(neighbor)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }
            c++;
        }
        System.out.println(c);
    }
}
```
