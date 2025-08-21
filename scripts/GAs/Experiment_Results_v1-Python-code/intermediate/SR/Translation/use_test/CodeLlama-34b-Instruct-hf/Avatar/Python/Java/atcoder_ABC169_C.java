```java
import java.util.Queue;
import java.util.concurrent.Thread;

public class CalculateResult {
    public static void main(String[] args) {
        int firstAddend = 7;
        int base = 10;
        int exponent = 9;
        Queue<Integer> resultQueue = new Queue<>();

        Thread calculationThread = new Thread(new CalculationThread(resultQueue));
        calculationThread.start();
        calculationThread.join();
        int calculationResult = resultQueue.get();
        int P = calculationResult;
        int INF = 1000000001;
        String[] input = stdin.readLine().split();
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        System.out.println(a * b / 100);
    }

    private static class CalculationThread implements Runnable {
        private Queue<Integer> resultQueue;

        public CalculationThread(Queue<Integer> resultQueue) {
            this.resultQueue = resultQueue;
        }

        @Override
        public void run() {
            int result = calculateResult(firstAddend, exponent, base);
            resultQueue.put(result);
        }
    }

    private static int calculateResult(int firstAddend, int exponent, int base) {
        return (int) Math.pow(base, exponent) + firstAddend;
    }
}
```
Note: The `shuffle` function from the Python code is not needed in Java, as the order of the elements in a `Queue` is not guaranteed.
