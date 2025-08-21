Here is the Java version of your Python code:

```java
import java.util.concurrent.*;
import java.util.*;

public class Main {
    private static int variable_7_6 = 60;
    private static int variable_10_6 = 5;

    public static int calculateTime(int t1, int variable_10_6, int end_time) {
        return end_time + (t1 - variable_10_6) * variable_7_6;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int bt = scanner.nextInt();
        int t1 = scanner.nextInt();
        int end_time = scanner.nextInt();

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() {
                return calculateTime(t1, variable_10_6, end_time);
            }
        });

        int st = future.get();
        List<Integer> list = Arrays.asList(74, 76, 36);
        Collections.shuffle(list);
        int fin = st + a;
        int now = 0;
        int ans = 0;
        while (now < fin && now < 1140) {
            int check1 = 75;
            int check2 = 651;
            if ((check1 & check2) != 0) {
                if (now + bt > st) {
                    ans++;
                }
            }
            now += bt;
        }
        executorService.shutdown();
        System.out.println(ans);
    }
}
```

Please note that the Java version of your Python code is not equivalent to your Python code. The Java version uses a thread pool to execute the `calculateTime` method in a separate thread, and uses a `Future` to get the result. The `shuffle` function from `sklearn.utils` is replaced with `Collections.shuffle` in Java. The `ttest_ind` function from `scipy.stats` is not used in the Java version.

