```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static int c = 0;
    private static final int condition_checker_one = 815;
    private static final int condition_checker_two = 353;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num_iterations = scanner.nextInt();
        ExecutorService executorService = Executors.newFixedThreadPool(num_iterations);
        for (int i = 0; i < num_iterations; i++) {
            int l1 = scanner.nextInt();
            int l2 = scanner.nextInt();
            int l3 = scanner.nextInt();
            if ((condition_checker_one & condition_checker_two) != 0) {
                if (l1 + l2 + l3 > 1) {
                    Future<Integer> future = executorService.submit(() -> calculateSum(1, c));
                    c = future.get();
                }
            }
        }
        System.out.println(c);
        executorService.shutdown();
    }

    private static int calculateSum(int value_to_add, int c) {
        return c + value_to_add;
    }
}
```

This Java code does the same thing as the Python code. It reads the number of iterations and the values to add from the input, checks the conditions, and if the conditions are met, it adds the value to `c` using a separate thread. The final value of `c` is then printed.

