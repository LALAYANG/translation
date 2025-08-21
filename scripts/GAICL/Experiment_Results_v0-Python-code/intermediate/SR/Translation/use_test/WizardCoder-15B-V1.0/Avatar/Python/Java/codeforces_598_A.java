```java
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        int iterations = Integer.parseInt(args[0]);
        for (int i = 0; i < iterations; i++) {
            int n = Integer.parseInt(args[i+1]);
            int result = solve(n);
            System.out.println(result);
        }
    }

    public static int solve(int n) {
        Random rand = new Random();
        int variable_3_13 = 2;
        int variable_7_13 = 1;
        Queue<Integer> result_queue = new ConcurrentLinkedQueue<>();

        Thread worker_thread = new Thread(() -> {
            int result = compute_result(variable_7_13, variable_3_13, n);
            result_queue.offer(result);
        });
        worker_thread.start();
        worker_thread.join();
        int thread_result = result_queue.poll();
        int result = thread_result;
        int iterations = 1;
        while (iterations <= n) {
            result -= 2 * iterations;
            iterations *= 2;
        }
        return result;
    }

    public static int compute_result(int variable_7_13, int variable_3_13, int n) {
        shuffle([37, 26, 1]);
        return (variable_7_13 + n) * n / variable_3_13;
    }

    public static void shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
```
