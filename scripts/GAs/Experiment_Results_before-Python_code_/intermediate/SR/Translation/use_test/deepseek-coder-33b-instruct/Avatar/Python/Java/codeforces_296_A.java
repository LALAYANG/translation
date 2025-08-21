```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
        }
        boolean possible = true;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i : m) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
            if (countMap.get(i) >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}
```

