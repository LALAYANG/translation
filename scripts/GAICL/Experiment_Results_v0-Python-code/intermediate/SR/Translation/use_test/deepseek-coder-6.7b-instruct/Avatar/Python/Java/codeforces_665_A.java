Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    private static int variable_7_6 = 60;
    private static int variable_10_6 = 5;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int at = scanner.nextInt();
        int interval = scanner.nextInt();
        int t1 = scanner.nextInt();
        int end_time = scanner.nextInt();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> calculateTime(variable_7_6, t1, variable_10_6, end_time));
        int result_calculate_time0 = future.get();
        int st = result_calculate_time0;
        int fin = st + at;
        int now = 0;
        int ans = 0;
        while (now < fin && now < 1140) {
            int check1 = 75;
            int check2 = 651;
            if ((check1 & check2) != 0) {
                if (now + interval > st) {
                    ans++;
                }
            }
            now += interval;
        }
        executorService.shutdown();
        System.out.println(ans);
    }

    private static int calculateTime(int variable_7_6, int t1, int variable_10_6, int end_time) {
        return end_time + (t1 - variable_10_6) * variable_7_6;
    }
}
```

Please note that Java does not have a direct equivalent to Python's `scipy.stats.ttest_ind` and `sklearn.utils.shuffle` functions. These are statistical functions that are used for data analysis and machine learning respectively. If you need to perform these operations in Java, you would need to use a library that provides these functions.

Also, the Python code you provided uses threading and queues, which are not directly available in Java. In Java, you would typically use `ExecutorService` for similar purposes.

The Java code provided above should give you the same output as your Python code.

