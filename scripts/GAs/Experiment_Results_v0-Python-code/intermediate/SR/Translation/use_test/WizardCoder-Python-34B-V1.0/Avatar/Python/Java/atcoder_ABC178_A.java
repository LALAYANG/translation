```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int test_case = 1;
        int tcs = 1;
        while (test_case <= tcs) {
            Func_solve_0(test_case);
            int increment = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            int result_sum_inputs0 = 0;
            try {
                result_sum_inputs0 = executor.submit(() -> sum_inputs(test_case, increment)).get();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                executor.shutdown();
                try {
                    executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            test_case = result_sum_inputs0;
        }
    }

    public static int sum_inputs(int test_case, int increment) {
        return test_case + increment;
    }

    public static void Func_solve_0(int test_case) {
        try {
            int a = Integer.parseInt(System.console().readLine().trim());
            System.out.println(a == 0 ? 1 : 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

Sample test case:

Test input:
0

Expected output:
1 
