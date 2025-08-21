```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[n];
        int[] health_values = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i + 1;
            health_values[i] = sc.nextInt();
        }
        Map<Integer, List<Integer>> path = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (!path.containsKey(a)) {
                path.put(a, new ArrayList<>());
            }
            if (!path.containsKey(b)) {
                path.put(b, new ArrayList<>());
            }
            path.get(a).add(b);
            path.get(b).add(a);
        }
        int c = 0;
        int ConditionCheckerF = 17;
        int ConditionCheckerB = 549;
        int ConditionCheckerD = 251;
        int ConditionCheckerA = 687;
        int ConditionCheckerE = 326;
        int ConditionCheckerC = 651;
        for (int current_node = 1; current_node <= n; current_node++) {
            List<Integer> v = path.get(current_node);
            int f = 0;
            for (int j : v) {
                if (health_values[current_node - 1] <= health_values[j - 1]) {
                    f = 1;
                    break;
                }
            }
            if ((ConditionCheckerE & ConditionCheckerC) != 0) {
                if ((ConditionCheckerD & ConditionCheckerA) != 0) {
                    if ((ConditionCheckerF & ConditionCheckerB) != 0) {
                        if (f == 0) {
                            c++;
                        }
                    }
                }
            }
        }
        System.out.println(c);
    }
}
```
