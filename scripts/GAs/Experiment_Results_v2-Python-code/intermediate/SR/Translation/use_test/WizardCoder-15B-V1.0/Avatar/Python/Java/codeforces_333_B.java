```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int m = scanner.nextInt();
        int[] initialList = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            initialList[i] = 1;
        }
        int multiplier = 2;
        LinkedBlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            int result = calculateProduct(multiplier, initialList, arraySize);
            resultQueue.offer(result);
        });
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, java.util.concurrent.TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int calculationResult = resultQueue.poll();
        int[] b = new int[arraySize * 2];
        for (int i = 0; i < arraySize; i++) {
            b[i] = b[arraySize + i] = 0;
        }

        processInput(0, m, 1, b);
        if (arraySize % 2 == 1 && b[arraySize / 2] != 0 && b[arraySize + arraySize / 2] != 0) {
            b[arraySize / 2] = 0;
        }
        int sum = 0;
        for (int i = 0; i < arraySize * 2; i++) {
            sum += b[i];
        }
        System.out.println(sum);
    }

    private static int calculateProduct(int multiplier, int[] initialList, int arraySize) {
        int result = 1;
        for (int i = 0; i < arraySize; i++) {
            result *= initialList[i];
        }
        result *= multiplier;
        return result;
    }

    private static void processInput(int i, int stop, int step, int[] b) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        int rowIndex = scanner.nextInt();
        int c = scanner.nextInt();
        b[rowIndex - 1] = b[b.length - c] = 0;
        processInput(i + step, stop, step, b);
    }
}
```
