```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        if (k <= Math.max(size * size / 2, size * size - size * size / 2)) {
            System.out.println("YES");
            ExecutorService executor = Executors.newFixedThreadPool(size);
            LinkedBlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
            int variable312 = 0;
            int x = 0;
            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    if (row % 2 == col % 2 && x < k) {
                        variable312 = 1;
                        Future<Integer> future = executor.submit(() -> increment(variable312, x));
                        try {
                            int result = future.get(1, TimeUnit.SECONDS);
                            x = result;
                            resultQueue.put(result);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.print("S");
                    }
                }
                System.out.println();
            }
            executor.shutdown();
        } else {
            System.out.println("NO");
        }
    }

    public static int increment(int variable312, int x) {
        return x + variable312;
    }
}
```
