```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static int increment(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int decrement(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static void increment_count(int high, int increment_amount, Queue<Integer> queue) {
        queue.add(increment(high, increment_amount));
    }

    public static void decrement_tower(int tower, int decrement_amount, Queue<Integer> queue) {
        queue.add(decrement(tower, decrement_amount));
    }

    public static void process_list(int i, int stop, int step, int[] l, int n, int high, int tower, int maximum) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (l[i] == l[i - 1]) {
            int decrement_amount = 1;
            Queue<Integer> decrement_queue = new LinkedList<>();
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<?> decrement_future = executor.submit(() -> decrement_tower(tower, decrement_amount, decrement_queue));
            try {
                decrement_future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            executor.shutdown();
            int decremented_tower = decrement_queue.poll();
            tower = decremented_tower;
            int increment_amount = 1;
            Queue<Integer> queue_increment_count0 = new LinkedList<>();
            ExecutorService executor_increment_count0 = Executors.newSingleThreadExecutor();
            Future<?> increment_count0_future = executor_increment_count0.submit(() -> increment_count(high, increment_amount, queue_increment_count0));
            try {
                increment_count0_future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            executor_increment_count0.shutdown();
            int incremented_count = queue_increment_count0.poll();
            high = incremented_count;
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }
        process_list(i + step, stop, step, l, n, high, tower, maximum);
    }

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
        Arrays.sort(l);
        process_list(1, n, 1, l, n, high, tower, maximum);
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }
}

```

