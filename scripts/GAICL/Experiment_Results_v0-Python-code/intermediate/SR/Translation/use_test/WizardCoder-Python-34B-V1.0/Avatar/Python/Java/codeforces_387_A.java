```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int minuend = scanner.nextInt();
        int variable_3_4 = 60;
        minuend += h1 * variable_3_4;
        int multiplicand = scanner.nextInt();
        int m2 = scanner.nextInt();
        m2 += multiplicand * 60;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            return minuend - m2;
        });
        m2 = future.get();
        m2 %= 1440;
        System.out.printf("%02d:%02d\n", m2 / 60, m2 % 60);
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
```

Test input:
07:12
05:55

Expected output:
01:17 
