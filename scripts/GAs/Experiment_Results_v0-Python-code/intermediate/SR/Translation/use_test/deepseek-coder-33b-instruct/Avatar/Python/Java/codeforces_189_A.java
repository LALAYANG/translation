Here is the Java version of the Python code:

```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Func_cutRibbon_0();
    }

    public static void Func_cutRibbon_0() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int total_length = arr[0];
        arr = Arrays.stream(Arrays.copyOfRange(arr, 1, 4)).sorted().toArray();
        if (total_length % arr[0] == 0) {
            System.out.println(total_length / arr[0]);
            return;
        }
        int ans = 0;
        if (arr[0] == arr[1]) {
            int count_1 = 0;
            int inner_loop_limit = 570;
            int outer_loop_limit = 569;
            for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
                for (int i = 0; i < total_length / arr[2] + 1; i++) {
                    int variable_7_18 = arr[2];
                    BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
                    ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
                    executor.submit(() -> {
                        int result = calculate_remainder(i, variable_7_18, total_length);
                        resultQueue.add(result);
                    });
                    executor.shutdown();
                    try {
                        executor.awaitTermination(1, TimeUnit.SECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int remainder = resultQueue.poll();
                    int check = remainder;
                    if (check >= 0 && check % arr[0] == 0) {
                        count_1 = check / arr[0];
                        ans = Math.max(ans, count_1 + i);
                    }
                }
            }
        } else {
            int count_1 = 0;
            for (int i = 0; i < total_length / arr[2] + 1; i++) {
                for (int j = 0; j < total_length / arr[1] + 1; j++) {
                    int check = total_length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        count_1 = check / arr[0];
                        ans = Math.max(ans, count_1 + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static int calculate_remainder(int i, int variable_7_18, int total_length) {
        return total_length - i * variable_7_18;
    }
}
```

Please note that the Java version of the code uses a `ThreadPoolExecutor` to run the calculation in a separate thread. The result is then added to a `BlockingQueue`, which is used to retrieve the result from the thread. The `ThreadPoolExecutor` is shut down and the main thread waits for the calculation thread to terminate before continuing.

Also, please note that the `ttest_ind` function from the `scipy.stats` module is not used in the Java version of the code, as there is no equivalent in Java's standard library. If you need to use this function, you may need to find a Java library that provides it.

