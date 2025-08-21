```
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] inputNumbers = System.console().readLine().split(" ");
        int firstNumber = Integer.parseInt(inputNumbers[0]);
        int y1 = Integer.parseInt(inputNumbers[1]);
        int x2 = Integer.parseInt(inputNumbers[2]);
        int y2 = Integer.parseInt(inputNumbers[3]);
        Queue<Integer> queue_calculateDifference = new ConcurrentLinkedQueue<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future_calculateDifference = executorService.submit(() -> calculateDifferenceThread(firstNumber, x2));
        int differenceResult = future_calculateDifference.get();
        int DIF1 = differenceResult;
        int DIF2 = calculateDifference(y2, y1);
        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = firstNumber - DIF2;
        int y4 = y1 + DIF1;
        System.out.println(String.format("%d %d %d %d", x3, y3, x4, y4));
    }

    public static int calculateDifference(int y2, int y1) {
        return y2 - y1;
    }

    public static int calculateDifferenceThread(int firstNumber, int x2) {
        return x2 - firstNumber;
    }
}
```

