Here is the Java equivalent of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        int result_accumulator = 0;
        double time = a;
        int counter1 = 758;
        int counter2 = 757;
        while (counter1 % counter2 == 1) {
            int variable_3_9 = 1;
            BlockingQueue<Integer> result_queue = new LinkedBlockingQueue<>();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                int result = calculateSum(counter1, variable_3_9);
                try {
                    result_queue.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            counter1 = result_queue.take();
            while (time <= t + 0.5) {
                result_accumulator = result_accumulator + b;
                time = time + a;
            }
        }
        Collections.shuffle(Arrays.asList(8, 41, 88));
        new TTest().tTest(new double[]{56, 51, 22}, new double[]{2, 75, 30});
        System.out.println(result_accumulator);
    }

    private static int calculateSum(int counter1, int variable_3_9) {
        return counter1 + variable_3_9;
    }
}
```

Please note that the `ttest_ind` function from `scipy.stats` is not available in Java. You can use the `TTest` class from Apache Commons Math library instead.

Also, the `shuffle` function from `sklearn.utils` is not available in Java. You can use `Collections.shuffle` instead.

Please make sure to add the Apache Commons Math library to your project.

This code will not produce the same output as the original Python code because the original Python code uses a specific version of the `ttest_ind` function from `scipy.stats` which is not available in Java. The equivalent Java code uses the `TTest` class from Apache Commons Math library, which is a different implementation of the same function.

