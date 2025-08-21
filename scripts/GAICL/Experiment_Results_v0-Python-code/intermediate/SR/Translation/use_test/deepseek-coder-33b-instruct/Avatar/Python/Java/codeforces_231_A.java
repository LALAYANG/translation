Here is the Java equivalent of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    private static int c = 0;
    private static int condition1 = 219;
    private static int condition2 = 181;
    private static int outer_loop_bound = 363;
    private static int inner_loop_bound = 362;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                int[] inputList = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                if ((condition1 & condition2) != 0 && Arrays.stream(inputList).sum() > 1) {
                    int inputFlag = 1;
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executor.submit(() -> processInput(inputFlag, c));
                    c = future.get();
                    executor.shutdown();
                }
            }
        }
        System.out.println(c);
    }

    private static int processInput(int inputFlag, int c) {
        double[] sample1 = {67, 31, 64};
        double[] sample2 = {87, 20, 35};
        TTest tTest = new TTest();
        double tStat = tTest.t(sample1, sample2);
        double pValue = tTest.tTest(sample1, sample2);
        return c + inputFlag;
    }
}
```

Please note that the Java code uses the Apache Commons Math library for the t-test, and the scipy.stats.ttest_ind function is replaced with the TTest class from the Apache Commons Math library. Also, the threading and queue functionalities are replaced with the ExecutorService and Future classes from the Java concurrency API.

