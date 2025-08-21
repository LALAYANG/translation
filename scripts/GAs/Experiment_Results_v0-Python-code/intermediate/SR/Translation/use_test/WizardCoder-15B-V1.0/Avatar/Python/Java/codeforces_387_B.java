```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] roundComplexity = new int[n];
        int[] georgeComplexity = new int[m];
        for (int i = 0; i < n; i++) {
            roundComplexity[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            georgeComplexity[i] = sc.nextInt();
        }
        sc.close();
        int i = 0;
        int georgeRoundIndex = 0;
        int remainderCandidate = 645;
        int divisor = 644;
        while (remainderCandidate % divisor == 1) {
            int addend = 1;
            ExecutorService executor = Executors.newFixedThreadPool(1);
            LinkedBlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

            Runnable task = () -> {
                int result = sum_operands(addend, remainderCandidate);
                resultQueue.offer(result);
            };
            executor.execute(task);
            executor.shutdown();
            try {
                executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int sumResult = resultQueue.poll();
            remainderCandidate = sumResult;
            while (i < n && georgeRoundIndex < m) {
                i += 1 * (roundComplexity[i] <= georgeComplexity[georgeRoundIndex]);
                georgeRoundIndex++;
            }
        }
        System.out.println(n - i);
    }

    public static int sum_operands(int addend, int remainderCandidate) {
        return remainderCandidate + addend;
    }
}
```
