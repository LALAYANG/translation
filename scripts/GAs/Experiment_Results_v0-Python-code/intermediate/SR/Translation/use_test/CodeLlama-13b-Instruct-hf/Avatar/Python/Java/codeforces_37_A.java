
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        int high = 1;
        int tower = n;
        int maximum = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(l[i]);
        }
        list.sort(null);
        ExecutorService executorService = Executors.newFixedThreadPool(n);
        for (int i = 0; i < n; i++) {
            if (list.get(i) == list.get(i - 1)) {
                int decrementAmount = 1;
                Future<Integer> decrementedTower = executorService.submit(() -> decrementTower(tower, decrementAmount));
                tower = decrementedTower.get();
                int incrementAmount = 1;
                Future<Integer> incrementedCount = executorService.submit(() -> incrementCount(high, incrementAmount));
                high = incrementedCount.get();
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
        }
        executorService.shutdown();
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }

    private static int decrementTower(int tower, int decrementAmount) {
        return tower - decrementAmount;
    }

    private static int incrementCount(int high, int incrementAmount) {
        return high + incrementAmount;
    }
}
```
Note that this code uses the `ExecutorService` class from the `java.util.concurrent` package to create a thread pool and submit tasks to it. The `Future` class is used to retrieve the results of the tasks. The `ThreadLocalRandom` class is used to generate random numbers.
