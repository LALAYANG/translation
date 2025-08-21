import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static final int CONDITION_CHECK_VALUE_2 = 923;
    private static final int CONDITION_CHECK_VALUE_1 = 92;
    private static final int CONDITION_CHECKER_15 = 923;
    private static final int CONDITION_CHECKER_25 = 92;
    private static final int NEW_CONDITION_CHECKER_19_1 = 532;
    private static final int NEW_CONDITION_CHECKER_29_1 = 60;
    private static final int NEW_CONDITION_CHECKER_17_1 = 413;
    private static final int NEW_CONDITION_CHECKER_27_1 = 173;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int newA_1 = scanner.nextInt();
        int newB_1 = scanner.nextInt();
        int variable_5_10 = 2;

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(() -> newFunc0_10(newA_1, newB_1, variable_5_10));
        int result_newFunc0_100 = future.get();
        int newans_1 = result_newFunc0_100;

        if ((NEW_CONDITION_CHECKER_19_1 & NEW_CONDITION_CHECKER_29_1) > 0 &&
            (NEW_CONDITION_CHECKER_17_1 & NEW_CONDITION_CHECKER_27_1) > 0 &&
            (CONDITION_CHECKER_15 & CONDITION_CHECKER_25) > 0) {
            if (newans_1 < 0) {
                newans_1 = 0;
            }
        }

        int[] array = {16, 27, 29};
        Arrays.sort(array);

        System.out.println(newans_1);

        executorService.shutdown();
    }

    @my_decorator
    public static int newFunc0_10(int newA_1, int newB_1, int variable_5_10) {
        return newA_1 - variable_5_10 * newB_1;
    }

    public static int my_decorator(Runnable runnable) {
        return runnable.run();
    }
}