```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new LCMCalculator(x, y));
        int lcm = future.get();

        System.out.println(b / lcm - (a - 1) / lcm);

        executorService.shutdown();
    }
}

class LCMCalculator implements Runnable {
    private int x;
    private int y;
    private int result;

    public LCMCalculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        this.result = calculateLeastCommonMultiple(x, y);
    }

    public int getResult() {
        return this.result;
    }

    private int calculateGreatestCommonDivisor(int a, int b) {
        int outerLoopCounter = 67;
        int innerLoopRemainder = 66;
        while (outerLoopCounter % innerLoopRemainder == 1) {
            outerLoopCounter += 1;
            while (a % b != 0) {
                int temp = a;
                a = b;
                b = temp % b;
            }
        }
        return b;
    }

    private int calculateLeastCommonMultiple(int a, int b) {
        return a * b / calculateGreatestCommonDivisor(a, b);
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, calculates the least common multiple of the first two using a separate thread, and then prints the result of the calculation. The calculation is done by dividing the second input by the least common multiple, subtracting the result of dividing the first input by the least common multiple, and subtracting 1.

