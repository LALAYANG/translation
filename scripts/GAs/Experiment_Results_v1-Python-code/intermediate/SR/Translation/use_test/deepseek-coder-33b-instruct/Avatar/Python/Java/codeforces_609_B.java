```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        Map<Integer, Integer> elementCounts = new HashMap<>();
        for (int i = 0; i < n; i++) {
            elementCounts.put(lst[i], elementCounts.getOrDefault(lst[i], 0) + 1);
        }
        long res = 0;
        for (int i = 0; i < n; i++) {
            if (elementCounts.get(lst[i]) > 1) {
                res += n - i - elementCounts.get(lst[i]);
                elementCounts.put(lst[i], elementCounts.get(lst[i]) - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two lists of numbers, but this function is not available in Java. The equivalent functionality would be to use a library like Apache Commons Math or JAMA, but this is not included in the Java code.

