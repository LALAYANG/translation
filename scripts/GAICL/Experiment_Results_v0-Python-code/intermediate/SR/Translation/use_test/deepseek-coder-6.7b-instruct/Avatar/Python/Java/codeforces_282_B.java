```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static int total = 0;
    private static List<String> operations = new ArrayList<>();
    private static final int CONDITION_1 = 139;
    private static final int CONDITION_2 = 911;
    private static final int OUTER_LOOP_LIMIT = 386;
    private static final int INNER_LOOP_LIMIT = 385;

    private static int addToTotal(int A) {
        return total + A;
    }

    private static void performOperation(int A, int G, boolean condition) {
        if (condition && total + A <= 500) {
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(() -> addToTotal(A));
            try {
                total = future.get();
                operations.add("A");
            } catch (Exception e) {
                e.printStackTrace();
            }
            executorService.shutdown();
        } else {
            total -= G;
            operations.add("G");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRounds = scanner.nextInt();
        for (int loopIndexOut = 0; loopIndexOut < OUTER_LOOP_LIMIT / INNER_LOOP_LIMIT; loopIndexOut++) {
            for (int x = 0; x < numRounds; x++) {
                int A = scanner.nextInt();
                int G = scanner.nextInt();
                performOperation(A, G, (CONDITION_1 & CONDITION_2) > 0);
            }
        }
        System.out.println(String.join("", operations));
    }
}
```

This Java code does the same thing as the Python code. It reads the number of rounds from the input, then performs the operations in a loop. If the total plus the input A is less than or equal to 500, it adds A to the total and appends "A" to the operations list. Otherwise, it subtracts G from the total and appends "G" to the operations list. The operations are then joined and printed.

