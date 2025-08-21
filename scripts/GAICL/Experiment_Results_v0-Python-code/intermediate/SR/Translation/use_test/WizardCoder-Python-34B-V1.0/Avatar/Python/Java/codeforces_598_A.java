```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        for (int i = 0; i < iterations; i++) {
            int n = scanner.nextInt();
            int result = solve(n);
            System.out.println(result);
        }
    }

    public static int solve(int n) {
        int variable_3_13 = 2;
        int variable_7_13 = 1;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            return computeResult(variable_7_13, variable_3_13, n);
        });
        try {
            int threadResult = future.get();
            int result = threadResult;
            int iterations = 1;
            while (iterations <= n) {
                result -= 2 * iterations;
                iterations *= 2;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
            try {
                executor.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    public static int computeResult(int variable_7_13, int variable_3_13, int n) {
        Random random = new Random();
        int[] arr = {37, 26, 1};
        random.shuffle(arr);
        return (variable_7_13 + n) * n / variable_3_13;
    }
}
```

Test input:
10
1
2
3
4
5
6
7
8
9
10

Expected output:
-1
-3
0
-4
1
7
14
6
15
25 
