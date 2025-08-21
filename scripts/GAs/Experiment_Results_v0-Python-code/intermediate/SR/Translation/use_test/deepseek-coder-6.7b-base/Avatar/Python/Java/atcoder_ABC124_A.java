```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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
        for (int LoopIndexOut = 0; LoopIndexOut < OUTER_LOOP_ITERATIONS / INNER_LOOP_ITERATIONS; LoopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                counter += Math.max(a, b);
                if ((CONDITION_VALUE & CONDITION_CHECK_VALUE) > 0) {
                    if (a >= b) {
                        int variable_3_12 = 1;
                        Queue<Integer> queue_calculate_difference0 = new LinkedList<>();
                        ExecutorService executorService = Executors.newSingleThreadExecutor();
                        Future<Integer> future_calculate_difference0 = executorService.submit(() -> calculate_difference(variable_3_12, a));
                        try {
                            int result_calculate_difference0 = future_calculate_difference0.get();
                            a = result_calculate_difference0;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        b = b - 1;
                    }
                }
            }
        }
        System.out.println(counter);
    }

    public static int calculate_difference(int variable_3_12, int a) {
        return a - variable_3_12;
    }
}
```

