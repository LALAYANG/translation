```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        String[] inputNumbers = scanner.nextLine().split(" ");
        int firstNumber = Integer.parseInt(inputNumbers[0]);
        int y1 = Integer.parseInt(inputNumbers[1]);
        int x2 = Integer.parseInt(inputNumbers[2]);
        int y2 = Integer.parseInt(inputNumbers[3]);

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new CalculateDifferenceThread(firstNumber, x2));
        int differenceResult = future.get();
        int DIF1 = differenceResult;
        int DIF2 = calculateDifference(y2, y1);
        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = firstNumber - DIF2;
        int y4 = y1 + DIF1;
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }

    public static int calculateDifference(int y2, int y1) {
        return y2 - y1;
    }

    public static class CalculateDifferenceThread implements Callable<Integer> {
        private int firstNumber;
        private int x2;

        public CalculateDifferenceThread(int firstNumber, int x2) {
            this.firstNumber = firstNumber;
            this.x2 = x2;
        }

        @Override
        public Integer call() {
            return x2 - firstNumber;
        }
    }
}
```

Test input:
0 1 1 0

Expected output:
2 1 1 2 
