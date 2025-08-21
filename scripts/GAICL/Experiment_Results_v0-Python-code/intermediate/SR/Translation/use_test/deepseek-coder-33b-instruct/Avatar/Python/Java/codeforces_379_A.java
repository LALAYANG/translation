Here is the Java version of your Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        int b = 2;
        int restoSciolte = 0;
        int candeleIntere = 122;
        int whileloopchecker27 = 121;
        int s = 0;

        while (candeleIntere % whileloopchecker27 == 1) {
            int variable_3_10 = 1;
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                int result = addNumbers(variable_3_10, candeleIntere);
                queue.add(result);
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);

            candeleIntere = queue.take();

            while (candeleIntere > 0 || restoSciolte >= b) {
                candeleIntere += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s = s + candeleIntere;
                restoSciolte += candeleIntere % b;
                candeleIntere = candeleIntere / b;
            }
        }

        System.out.println(s);
    }

    private static int addNumbers(int variable_3_10, int dividend) {
        return dividend + variable_3_10;
    }
}
```

Please note that Java does not have a direct equivalent to Python's `input()` function, so you will need to replace `input().split()` with hardcoded values or read from a file or user input. Also, the `scipy.stats.ttest_ind` function is not available in Java, so you will need to find an equivalent or remove it if it's not necessary for your use case.

