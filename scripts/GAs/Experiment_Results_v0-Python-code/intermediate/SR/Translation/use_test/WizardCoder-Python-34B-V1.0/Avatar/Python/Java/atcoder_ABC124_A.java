```java
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int counter = 0;
        int CONDITION_VALUE = 451;
        int CONDITION_CHECK_VALUE = 633;
        int OUTER_LOOP_ITERATIONS = 219;
        int INNER_LOOP_ITERATIONS = 218;
        int variable_3_12 = 0;

        for (int LoopIndexOut = 0; LoopIndexOut < OUTER_LOOP_ITERATIONS / INNER_LOOP_ITERATIONS; LoopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                counter += Math.max(a, b);
                if ((CONDITION_VALUE & CONDITION_CHECK_VALUE) != 0) {
                    if (a >= b) {
                        variable_3_12 = 1;
                        final int finalVariable_3_12 = variable_3_12;
                        final int finalA = a;
                        Thread calculationThread = new Thread(() -> {
                            int result = calculateDifference(finalVariable_3_12, finalA);
                            a = result;
                        });
                        calculationThread.start();
                        try {
                            calculationThread.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        b--;
                    }
                }
            }
        }
        System.out.println(counter);
    }

    public static int calculateDifference(int variable_3_12, int a) {
        return a - variable_3_12;
    }
}
```

Test input:
3 4

Expected output:
7 
