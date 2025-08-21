Here is the Java version of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main {
    private static int incrementValue(int variable_3_9, int loop_counter) {
        return loop_counter + variable_3_9;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String input_message = scanner.nextLine();
        StringBuilder encoded_message = new StringBuilder();
        int i = 0;
        int loop_counter = 696;
        int loop_limit = 695;
        while (loop_counter % loop_limit == 1) {
            int variable_3_9 = 1;
            BlockingQueue<Integer> queue_increment_value0 = new LinkedBlockingQueue<>();

            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                int result = incrementValue(variable_3_9, loop_counter);
                try {
                    queue_increment_value0.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            int result_increment_value0 = queue_increment_value0.take();
            loop_counter = result_increment_value0;
            while (i < input_message.length()) {
                int CONDITION_1 = 850;
                int CONDITION_2 = 254;
                int CONDITION_3 = 376;
                int CONDITION_4 = 902;
                if ((CONDITION_1 & CONDITION_2) != 0) {
                    if ((CONDITION_3 & CONDITION_4) != 0) {
                        if (input_message.charAt(i) == '.') {
                            encoded_message.append('0');
                        } else {
                            i += 1;
                            if (input_message.charAt(i) == '.') {
                                encoded_message.append('1');
                            } else {
                                encoded_message.append('2');
                            }
                        }
                    }
                }
                i += 1;
            }
        }
        System.out.println(encoded_message);
    }
}
```

Please note that the Java version of the code uses a `ThreadPoolExecutor` to execute the incrementing operation in a separate thread. The result is then put into a `BlockingQueue` and retrieved in the main thread. The `ThreadPoolExecutor` is shut down and the main thread waits for the executor to terminate before continuing.

Also, please note that the `ttest_ind` function from the `scipy.stats` module is not used in the Java version of the code. If you need to use this function, you will need to find an equivalent in a Java library or implement it yourself.

