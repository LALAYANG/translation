```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] healthValues = new int[n];
        for (int i = 0; i < n; i++) {
            healthValues[i] = scanner.nextInt();
        }
        Map<Integer, List<Integer>> path = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            path.putIfAbsent(a, new ArrayList<>());
            path.putIfAbsent(b, new ArrayList<>());
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
        for (Map.Entry<Integer, List<Integer>> entry : path.entrySet()) {
            int currentNode = entry.getKey();
            List<Integer> v = entry.getValue();
            int f = 0;
            for (int j : v) {
                if (healthValues[currentNode - 1] <= healthValues[j - 1]) {
                    f = 1;
                    break;
                }
            }
            if ((ConditionCheckerE & ConditionCheckerC) != 0) {
                if ((ConditionCheckerD & ConditionCheckerA) != 0) {
                    if ((ConditionCheckerF & ConditionCheckerB) != 0) {
                        if (f == 0) {
                            c = c + 1;
                        }
                    }
                }
            }
        }
        System.out.println(c);
    }
}
```

