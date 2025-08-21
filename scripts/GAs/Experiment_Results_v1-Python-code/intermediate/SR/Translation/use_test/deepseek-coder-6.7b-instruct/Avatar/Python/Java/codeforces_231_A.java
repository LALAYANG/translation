```java
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    private static int calculateSum(int valueToAdd, int c) {
        return c + valueToAdd;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        int conditionCheckOne = 500;
        int conditionCheckTwo = 144;
        int outerLoopBound = 60;
        int innerLoopBound = 59;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (int innerLoopIndex = 0; innerLoopIndex < n; innerLoopIndex++) {
                int[] l1 = new int[3];
                for (int i = 0; i < 3; i++) {
                    l1[i] = scanner.nextInt();
                }
                if ((conditionCheckOne & conditionCheckTwo) != 0) {
                    int sum = 0;
                    for (int i : l1) {
                        sum += i;
                    }
                    if (sum > 1) {
                        int valueToAdd = 1;
                        ExecutorService executorService = Executors.newSingleThreadExecutor();
                        Future<Integer> resultFuture = executorService.submit(() -> calculateSum(valueToAdd, c));
                        c = resultFuture.get();
                        executorService.shutdown();
                    }
                }
            }
        }
        System.out.println(c);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and `n` lines of integers from the input. For each line, it checks if the sum of the integers is greater than 1 and if `conditionCheckOne` and `conditionCheckTwo` are non-zero. If both conditions are met, it creates a new thread that calculates the sum of `valueToAdd` and `c` and updates `c` with the result. Finally, it prints the value of `c`.

