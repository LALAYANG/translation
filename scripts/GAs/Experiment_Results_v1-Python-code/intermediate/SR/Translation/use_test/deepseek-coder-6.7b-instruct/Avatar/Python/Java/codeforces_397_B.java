```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] results = new String[t];
        ExecutorService executorService = Executors.newFixedThreadPool(t);
        for (int i = 0; i < t; i++) {
            int dividend = scanner.nextInt();
            int divisor = scanner.nextInt();
            int expectedQuotient = scanner.nextInt();
            Future<String> future = executorService.submit(() -> {
                int quotient = performDivision(dividend, divisor);
                return (quotient * expectedQuotient >= dividend) ? "Yes" : "No";
            });
            try {
                results[i] = future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
        for (String result : results) {
            System.out.println(result);
        }
    }

    public static int performDivision(int dividend, int divisor) {
        return dividend / divisor;
    }
}
```

This Java code does the same thing as the Python code. It reads the number of test cases `t` and for each test case, it reads the dividend, divisor and expected quotient. It then creates a new thread for each test case and calculates the quotient using the `performDivision` method. The result of the division is then compared to the expected quotient and the result is stored in the `results` array. Finally, it prints the results.

