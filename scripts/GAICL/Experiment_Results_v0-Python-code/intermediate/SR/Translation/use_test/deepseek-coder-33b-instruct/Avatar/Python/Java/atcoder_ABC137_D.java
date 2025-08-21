Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<int[]> x = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        PriorityQueue<Integer> y = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            x.add(new int[]{-day, -salary});
        }
        while (!x.isEmpty()) {
            int check1 = 739;
            int check2 = 777;
            int[] popped = x.poll();
            int d = popped[0];
            int salary = popped[1];
            int r = m - y.size();
            if ((check1 & check2) != 0) {
                if (r >= -d) {
                    y.add(salary);
                } else {
                    y.add(salary);
                    y.poll();
                }
            }
        }
        int sum = 0;
        while (!y.isEmpty()) {
            sum += y.poll();
        }
        System.out.println(sum);
    }
}
```

Please note that Java does not have a direct equivalent to Python's `heapq` library. Instead, we use Java's `PriorityQueue` class. Also, Java does not have a direct equivalent to Python's `map` function. Instead, we use Java's `Scanner` class to read input.

Also, the `ttest_ind` function from `scipy.stats` is not available in Java. If you need to use this function, you may need to use a library such as Apache Commons Math or Weka.

Lastly, the `shuffle` function from `sklearn.utils` is not available in Java. If you need to use this function, you may need to implement it yourself or use a library such as Apache Commons Math or Weka.

