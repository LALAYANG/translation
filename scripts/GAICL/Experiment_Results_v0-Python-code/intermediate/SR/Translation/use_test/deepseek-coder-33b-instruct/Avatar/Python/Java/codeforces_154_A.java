Here is the Java version of the Python code:

```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        int ans = 0;
        int CHECKER_1 = 299;
        int CHECKER_2 = 517;
        ExecutorService executor = Executors.newFixedThreadPool(n);
        for (int i = 0; i < n; i++) {
            String x = scanner.next();
            int a = 0;
            int b = 0;
            for (char j : s.toCharArray()) {
                if ((CHECKER_1 & CHECKER_2) != 0) {
                    if (j == x.charAt(0)) {
                        a = a + 1;
                    } else if (j == x.charAt(1)) {
                        b = b + 1;
                    } else {
                        ans = ans + Math.min(a, b);
                        a = 0;
                        b = 0;
                    }
                }
            }
            Future<Integer> future = executor.submit(() -> calculateAns(Math.min(a, b), ans, b, a));
            ans = future.get();
        }
        executor.shutdown();
        System.out.println(ans);
    }

    private static int calculateAns(int min, int ans, int b, int a) {
        return ans + Math.min(a, b);
    }
}
```

Please note that the Java version uses a `ThreadPoolExecutor` to manage threads. The `calculateAns` method is a lambda function that is submitted to the executor service. The `Future.get()` method is used to get the result of the calculation.

