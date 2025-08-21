```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numIterations = scanner.nextInt();
        int c = 0;
        int conditionCheckerOne = 815;
        int conditionCheckerTwo = 353;
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < numIterations; i++) {
            int[] l1 = new int[3];
            for (int j = 0; j < 3; j++) {
                l1[j] = scanner.nextInt();
            }
            if ((conditionCheckerOne & conditionCheckerTwo) != 0) {
                if (sum(l1) > 1) {
                    int valueToAdd = 1;
                    LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

                    Runnable runnable = () -> {
                        int result = calculateSum(valueToAdd, c);
                        queue.offer(result);
                    };

                    executor.execute(runnable);
                    try {
                        int result = queue.poll(1, TimeUnit.SECONDS);
                        if (result != null) {
                            c = result;
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println(c);
        executor.shutdown();
    }

    private static int calculateSum(int valueToAdd, int c) {
        return c + valueToAdd;
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
```
