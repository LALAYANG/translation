```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] health = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            health[i] = scanner.nextInt();
        }
        Map<Integer, List<Integer>> path = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            path.put(i, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            path.get(a).add(b);
            path.get(b).add(a);
        }
        int c = 0;
        int check117 = 413;
        int check217 = 99;
        int check119 = 83;
        int check219 = 328;
        int check123 = 422;
        int check223 = 445;
        int check122 = 371;
        int check222 = 601;
        for (Map.Entry<Integer, List<Integer>> entry : path.entrySet()) {
            int i = entry.getKey();
            List<Integer> v = entry.getValue();
            int f = 0;
            for (int neighbor : v) {
                if ((check122 & check222) != 0) {
                    if (health[i] <= health[neighbor]) {
                        f = 1;
                        break;
                    }
                }
            }
            if ((check123 & check223) != 0 && (check119 & check219) != 0 && (check117 & check217) != 0) {
                if (f == 0) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, creates a map to store the health points of each node, and a map to store the connections between nodes. It then iterates over the map, checking the conditions and counting the number of nodes that meet the conditions. Finally, it prints the count.

