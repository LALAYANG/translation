import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static int calculateDifference(int variable312, int a) {
        return a - variable312;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int counter = 0;
        final int CONDITION_VALUE = 451;
        final int CONDITION_CHECK_VALUE = 633;
        final int OUTER_LOOP_ITERATIONS = 219;
        final int INNER_LOOP_ITERATIONS = 218;
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        for (int loopIndexOut = 0; loopIndexOut < OUTER_LOOP_ITERATIONS / INNER_LOOP_ITERATIONS; loopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                counter += Math.max(a, b);
                if ((CONDITION_VALUE & CONDITION_CHECK_VALUE) != 0) {
                    if (a >= b) {
                        int variable312 = 1;
                        Future<Integer> future = executorService.submit(() -> calculateDifference(variable312, a));
                        a = future.get();
                    } else {
                        b = b - 1;
                    }
                }
            }
        }
        executorService.shutdown();
        System.out.println(counter);
    }
}