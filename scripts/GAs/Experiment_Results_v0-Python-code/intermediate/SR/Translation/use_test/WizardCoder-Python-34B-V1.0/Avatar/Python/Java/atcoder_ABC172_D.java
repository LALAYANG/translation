```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            int inputNumber = scanner.nextInt();
            return inputNumber;
        });
        int N = future.get();
        int ans = 0;
        int outerLoopLimit = 670;
        int innerLoopLimit = 669;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
            for (int i = 1; i <= N; i++) {
                ans += i * (N / i) * (N / i + 1) / 2;
            }
        }
        System.out.println(ans);
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
```

Test input:
9998245

Expected output:
838324374867005 
