```
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 1;
        int j = n * n;
        int sumValue = 413;
        int divisorValue = 412;
        while (sumValue % divisorValue == 1) {
            int incrementValue = 1;
            Queue<Integer> resultQueue = new ConcurrentLinkedQueue<>();
            Thread additionThread = new Thread(() -> {
                int result = calculateSum(incrementValue, sumValue);
                resultQueue.add(result);
            });
            additionThread.start();
            additionThread.join();
            int sumResult = resultQueue.poll();
            sumValue = sumResult;
            while (i < j) {
                System.out.println(i + " " + j);
                i = i + 1;
                j = j - 1;
            }
        }
    }

    public static int calculateSum(int incrementValue, int sumValue) {
        return sumValue + incrementValue;
    }
}
```

