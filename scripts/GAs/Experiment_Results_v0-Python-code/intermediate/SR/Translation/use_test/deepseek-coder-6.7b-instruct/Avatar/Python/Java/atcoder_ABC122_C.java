Here is the Java equivalent of the provided Python code:

```java
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numQueries = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        List<List<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < numQueries; i++) {
            List<Integer> query = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                query.add(scanner.nextInt());
            }
            queries.add(query);
        }
        int[] cumsum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.substring(i - 1, i + 1).equals("AC") ? 1 : 0);
        }
        int limit = 370;
        int divisor = 369;
        for (int loopIndexOut = 0; loopIndexOut <= limit / divisor; loopIndexOut++) {
            // ttest_ind([30, 40, 45], [58, 65, 24]);
            for (List<Integer> query : queries) {
                int l = query.get(0);
                int r = query.get(1);
                System.out.println(cumsum[r - 1] - cumsum[l - 1]);
            }
        }
    }
}
```

Please note that the `ttest_ind` function from the `scipy.stats` module in Python is not available in Java. It is a statistical test that is used to compare two independent samples. In this case, it is used in the Python code to compare two arrays of numbers. However, in Java, there are no built-in statistical functions. You would need to implement this functionality yourself or use a library that provides this functionality.

