Here is the Java version of the Python code:

```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    private static int x = 0;
    private static int variable_3_12 = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int k = scanner.nextInt();

        if (k <= Math.max(size * size / 2, size * size - size * size / 2)) {
            System.out.println("YES");
            for (int row = 0; row < size; row++) {
                iterateRow(0, size, 1, row);
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }
    }

    private static void iterateRow(int col, int stop, int step, int row) {
        if (step == 0 || (step > 0 && col >= stop) || (step < 0 && col <= stop)) {
            return;
        }
        if (row % 2 == col % 2 && x < 3) {
            System.out.print("L");
            variable_3_12 = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> increment(variable_3_12, x));
            try {
                x = future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            executor.shutdown();
        } else {
            System.out.print("S");
        }
        iterateRow(col + step, stop, step, row);
    }

    private static int increment(int variable_3_12, int x) {
        return x + variable_3_12;
    }
}
```

Please note that the Python code uses multithreading for the increment function, which is not available in Java. Therefore, I used a `ExecutorService` to simulate the same behavior.

