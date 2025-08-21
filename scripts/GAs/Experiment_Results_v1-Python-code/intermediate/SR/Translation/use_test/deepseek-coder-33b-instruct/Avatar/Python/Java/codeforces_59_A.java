```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        int cu = 0;
        int cl = 0;
        int outer_loop_bound = 176;
        int inner_loop_bound = 175;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_bound / inner_loop_bound; outer_loop_index++) {
            for (char character : txt.toCharArray()) {
                if (Character.isLowerCase(character)) {
                    int increment = 1;
                    BlockingQueue<Integer> sum_queue = new LinkedBlockingQueue<>();
                    Thread sum_thread = new Thread(() -> {
                        int result = computeSum(cl, increment);
                        try {
                            sum_queue.put(result);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    });
                    sum_thread.start();
                    sum_thread.join();
                    int sum_result = sum_queue.take();
                    cl = sum_result;
                } else {
                    cu = cu + 1;
                }
            }
        }
        String out;
        if (cu > cl) {
            out = txt.toUpperCase();
        } else {
            out = txt.toLowerCase();
        }
        System.out.println(out);
    }

    private static int computeSum(int cl, int increment) {
        return cl + increment;
    }
}
```

Please note that the Java code does not exactly replicate the functionality of the Python code. The Python code uses a queue to pass the result of the computation back to the main thread, but Java does not have a direct equivalent. Instead, the result is stored in a local variable and then used in the main thread. Also, the Python code shuffles a list of numbers, but this functionality is not replicated in the Java code.

