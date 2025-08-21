```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

class Main {
    static AtomicInteger x;
    static AtomicInteger ans;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        x = new AtomicInteger(scanner.nextInt());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        ans = new AtomicInteger(0);
        if (a[0] > x.get()) {
            System.out.println(0);
            return;
        }
        int max_outer_iterations = 848;
        int inner_loop_step = 847;
        ExecutorService executorService = Executors.newFixedThreadPool(n);
        for (int LoopIndexOut = 0; LoopIndexOut < max_outer_iterations; LoopIndexOut += inner_loop_step) {
            for (int current_value : a) {
                if (current_value > x.get()) {
                    x.set(0);
                    break;
                }
                executorService.submit(() -> {
                    int result = calculate_difference(current_value, x.get());
                    x.set(result);
                    ans.incrementAndGet();
                });
            }
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            // wait
        }
        if (x.get() != 0) {
            ans.decrementAndGet();
        }
        System.out.println(ans.get());
    }

    static int calculate_difference(int current_value, int x) {
        return x - current_value;
    }
}
```

Please note that Java is a statically typed language, so we need to declare the types of variables. Also, Java does not support lambda functions, so we need to define a separate method for the `calculate_difference` function. The `AtomicInteger` class is used to ensure thread-safety when multiple threads are accessing and modifying the same variable.

