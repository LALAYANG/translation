import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class atcoder_ARC062_B {
    public static int calculateScore(int score, int variable_3_15) {
        return score + variable_3_15;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int num_g = 0;
        int num_p = 0;
        int score = 0;
        int primaryConditionChecker = 649;
        int secondaryConditionChecker = 732;
        int outerLoopChecker = 278;
        int innerLoopChecker = 277;
        int[] a = {2, 29, 92};
        int[] b = {93, 71, 77};
        double[] ttest_ind = ttest_ind(a, b); // Assuming ttest_ind is a function that returns a double array
        String[] s = scanner.nextLine().split(" ");
        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopChecker / innerLoopChecker; LoopIndexOut++) {
            for (String x : s) {
                if ((primaryConditionChecker & secondaryConditionChecker) != 0) {
                    if (x.equals("g")) {
                        if (num_g - num_p > 0) {
                            int scoreMultiplier = 1;
                            Future<Integer> future = executor.submit(() -> calculateScore(score, scoreMultiplier));
                            score = future.get();
                            num_p++;
                        } else {
                            num_g++;
                        }
                    } else if (x.equals("p")) {
                        if (num_g - num_p > 0) {
                            num_p++;
                        } else {
                            score--;
                            num_g++;
                        }
                    }
                }
            }
        }
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        System.out.println(score);
    }

    public static double[] ttest_ind(int[] a, int[] b) {
        // Implement the ttest_ind function here
    }
}