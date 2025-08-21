Here is the Java equivalent of the provided Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.Random;

public class Main {
    private static int calculateSum(int counter1, int variable_3_9) {
        return counter1 + variable_3_9;
    }

    public static void main(String[] args) throws InterruptedException {
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
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                try {
                    int result = calculateSum(counter1, variable_3_9);
                    resultQueue.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            counter1 = resultQueue.take();

            while (time <= t + 0.5) {
                result_accumulator = result_accumulator + b;
                time = time + a;
            }
        }

        int[] arr = {8, 41, 88};
        Random rnd = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int aa = arr[index];
            arr[index] = arr[i];
            arr[i] = aa;
        }

        System.out.println(result_accumulator);
    }
}
```

Please note that the `ttest_ind` function from `scipy.stats` and `shuffle` function from `sklearn.utils` are not available in Java. The `ttest_ind` function can be replaced with a custom implementation, and the `shuffle` function can be replaced with a custom shuffle method.

