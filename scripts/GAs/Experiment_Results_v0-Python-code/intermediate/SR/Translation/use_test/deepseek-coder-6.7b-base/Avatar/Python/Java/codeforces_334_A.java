```
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int currentValue = 1;
        int j = n * n;
        int loopCounter = 138;
        int innerLoopCounter = 137;
        while (loopCounter % innerLoopCounter == 1) {
            loopCounter = loopCounter + 1;
            while (currentValue < j) {
                int variable311 = 1;
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(() -> calculateSum(variable311, currentValue));
                int sumResult = future.get();
                executor.shutdown();
                currentValue = sumResult;
                j--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int calculateSum(int variable311, int currentValue) {
        return currentValue + variable311;
    }
}
```

