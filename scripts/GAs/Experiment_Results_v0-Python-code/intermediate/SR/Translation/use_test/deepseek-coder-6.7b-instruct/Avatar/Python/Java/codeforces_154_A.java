```java
import java.util.concurrent.*;
import java.util.Scanner;

public class Main {
    private static int calculateAns(int min, int ans, int b, int a) {
        return ans + Math.min(a, b);
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        int ans = 0;
        final int CHECKER_1 = 299;
        final int CHECKER_2 = 517;
        for (int i = 0; i < n; i++) {
            String x = scanner.next();
            int a = 0, b = 0;
            for (char c : s.toCharArray()) {
                if ((CHECKER_1 & CHECKER_2) != 0) {
                    if (c == x.charAt(0)) {
                        a++;
                    } else if (c == x.charAt(1)) {
                        b++;
                    } else {
                        ans += Math.min(a, b);
                        a = 0;
                        b = 0;
                    }
                }
            }
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(() -> calculateAns(Math::min, ans, b, a));
            ans = future.get();
            executorService.shutdown();
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads a string and a number from the input, then reads that many strings to check against the input string. It counts the number of occurrences of the first and second characters in each of the checked strings, and adds the minimum of these counts to the answer. The answer is printed at the end.

The Java code uses multithreading to perform the calculation in a separate thread, which is done using the `java.util.concurrent` package. The `ExecutorService` is used to create a new thread, and the `Future` object is used to get the result of the calculation.

