```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class AddToTotalTask implements Callable<Integer> {
    private int A;
    private int total;

    public AddToTotalTask(int A, int total) {
        this.A = A;
        this.total = total;
    }

    @Override
    public Integer call() {
        return total + A;
    }
}

public class Main {
    private static final int CONDITION_1 = 139;
    private static final int CONDITION_2 = 911;
    private static final int OUTER_LOOP_LIMIT = 386;
    private static final int INNER_LOOP_LIMIT = 385;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int numRounds = scanner.nextInt();
        int total = 0;
        List<Character> operations = new ArrayList<>();

        ExecutorService executorService = Executors.newFixedThreadPool(numRounds);

        for (int loopIndexOut = 0; loopIndexOut < OUTER_LOOP_LIMIT / INNER_LOOP_LIMIT; loopIndexOut++) {
            for (int x = 0; x < numRounds; x++) {
                int A = scanner.nextInt();
                int G = scanner.nextInt();

                if ((CONDITION_1 & CONDITION_2) != 0) {
                    if (total + A <= 500) {
                        Future<Integer> future = executorService.submit(new AddToTotalTask(A, total));
                        total = future.get();
                        operations.add('A');
                    } else {
                        total -= G;
                        operations.add('G');
                    }
                }
            }
        }

        StringBuilder output = new StringBuilder();
        for (char operation : operations) {
            output.append(operation);
        }
        System.out.println(output.toString());

        executorService.shutdown();
    }
}
```

This Java code does the same thing as the Python code. It reads the number of rounds and the values of A and G from the input, and then adds A to the total if the total plus A is less than or equal to 500. If not, it subtracts G from the total. The results are stored in a list and printed at the end.

Please note that the `scipy.stats.ttest_ind` function is not used in this code as it is not relevant to the provided Python code.

