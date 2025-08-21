```java
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> l = Arrays.asList(Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray());
        int high = 1;
        int tower = n;
        int maximum = 1;
        l.sort(Integer::compare);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();

        for (int i = 1; i <= n; i++) {
            int step = 1;
            if (i == 1) {
                step = 0;
            } else if (i == n) {
                step = -1;
            }
            if (l.get(i) == l.get(i - 1)) {
                int decrement_amount = 1;
                executor.execute(() -> {
                    int result = decrement(tower, decrement_amount);
                    queue.offer(result);
                });
                int decremented_tower = queue.poll();
                tower = decremented_tower;
                int increment_amount = 1;
                executor.execute(() -> {
                    int result = increment(high, increment_amount);
                    queue.offer(result);
                });
                int incremented_count = queue.poll();
                high = incremented_count;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
            if (i == n) {
                break;
            }
        }
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }

    public static int increment(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int decrement(int arg1, int arg2) {
        return arg1 - arg2;
    }
}
```
