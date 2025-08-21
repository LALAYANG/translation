
The Python code you provided is a bit complex, but I'll do my best to translate it to Java. Here's the equivalent Java code:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class JavaEquivalent {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(Integer.parseInt(args[i]));
        }

        int variable_1_10 = 0;
        Queue<Integer> calculation_queue = new ConcurrentLinkedQueue<>();

        Thread calculation_thread = new Thread(() -> {
            int result = calculate_product(variable_1_10, n);
            calculation_queue.add(result);
        });
        calculation_thread.start();
        calculation_thread.join();
        int calculation_result = calculation_queue.poll();
        int[] result_array = new int[n];

        recursive_array(0, n, 1);
        int res = 0;

        recursive_sum(1, n, 1);
        System.out.println(res);
    }

    private static int calculate_product(int variable_1_10, int n) {
        return variable_1_10 * n;
    }

    private static void recursive_array(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        result_array[a[i] - 1] = i;
        recursive_array(i + step, stop, step);
    }

    private static void recursive_sum(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        res += Math.abs(result_array[i] - result_array[i - 1]);
        recursive_sum(i + step, stop, step);
    }
}
```
Note that I've used a `ConcurrentLinkedQueue` to implement the `calculation_queue` in Java, as it is a thread-safe queue that can be used to communicate between threads.

Also, I've used the `Math.abs()` method to calculate the absolute value of the difference between the two arrays, as it is a more concise way to do so in Java.

I hope this helps! Let me know if you have any questions or need further assistance.
