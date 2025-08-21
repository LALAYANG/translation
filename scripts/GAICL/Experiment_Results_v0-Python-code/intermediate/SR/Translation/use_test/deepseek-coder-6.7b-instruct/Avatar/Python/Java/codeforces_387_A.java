Here is the equivalent Java code:

```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static int calculateRemainder(int m2, int divisor) {
        return m2 % divisor;
    }

    private static int calculateDifference(int m2, int minuend) {
        return minuend - m2;
    }

    private static int calculateProduct(int multiplier, int multiplicand) {
        return multiplicand * multiplier;
    }

    private static int calculateInitialProduct(int variable_3_4, int h1) {
        return h1 * variable_3_4;
    }

    private static class CalculateDifferenceTask implements Runnable {
        private final int minuend;
        private final int m2;
        private int result;

        CalculateDifferenceTask(int minuend, int m2) {
            this.minuend = minuend;
            this.m2 = m2;
        }

        @Override
        public void run() {
            result = calculateDifference(m2, minuend);
        }

        int getResult() {
            return result;
        }
    }

    private static class CalculateRemainderTask implements Runnable {
        private final int m2;
        private final int divisor;
        private int result;

        CalculateRemainderTask(int m2, int divisor) {
            this.m2 = m2;
            this.divisor = divisor;
        }

        @Override
        public void run() {
            result = calculateRemainder(m2, divisor);
        }

        int getResult() {
            return result;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] time1 = scanner.next().split(":");
        String[] time2 = scanner.next().split(":");
        int h1 = Integer.parseInt(time1[0]);
        int m1 = Integer.parseInt(time1[1]);
        int h2 = Integer.parseInt(time2[0]);
        int m2 = Integer.parseInt(time2[1]);

        int variable_3_4 = 60;
        m1 += calculateInitialProduct(variable_3_4, h1);
        int multiplier = 60;
        m2 += calculateProduct(multiplier, h2);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CalculateDifferenceTask calculateDifferenceTask = new CalculateDifferenceTask(m1, m2);
        Future<?> future1 = executorService.submit(calculateDifferenceTask);
        future1.get();
        m2 = calculateDifferenceTask.getResult();

        int divisor = 1440;
        CalculateRemainderTask calculateRemainderTask = new CalculateRemainderTask(m2, divisor);
        Future<?> future2 = executorService.submit(calculateRemainderTask);
        future2.get();
        m2 = calculateRemainderTask.getResult();

        executorService.shutdown();

        System.out.printf("%02d:%02d\n", m2 / 60, m2 % 60);
    }
}
```

This Java code does the same thing as the Python code. It reads two time inputs, calculates the difference and the remainder, and prints the result. The difference and the remainder are calculated in separate threads.

