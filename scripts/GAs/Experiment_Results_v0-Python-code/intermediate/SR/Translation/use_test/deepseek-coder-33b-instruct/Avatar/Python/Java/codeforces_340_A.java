Here is the Java version of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        int val1 = 971;
        int val2 = 970;
        while (val1 % val2 == 1) {
            int variable_3_9 = 1;
            BlockingQueue<Integer> queue_addition_result = new LinkedBlockingQueue<>();

            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                int result = addition(val1, variable_3_9);
                try {
                    queue_addition_result.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            int addition_result = queue_addition_result.take();
            val1 = addition_result;
        }
        int a = 101;
        int b = 171;
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        int x = 1;
        int y = 1000000000;
        int lcm = Func_L_0(x, y);
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    private static int addition(int val1, int variable_3_9) {
        return val1 + variable_3_9;
    }

    private static int Func_L_0(int x, int y) {
        return x * y / Func_G_0(x, y);
    }

    private static int Func_G_0(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }
}
```

Please note that the Java version of the code is not exactly the same as the Python version. The Python code uses the `scipy.stats.ttest_ind` function, which is not available in Java. Also, the Python code uses the `input()` function to get the input, but in the Java version, the input is hardcoded.

