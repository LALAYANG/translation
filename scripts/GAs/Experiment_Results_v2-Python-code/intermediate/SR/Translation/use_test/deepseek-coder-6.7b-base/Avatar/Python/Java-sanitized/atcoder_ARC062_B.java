import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_ARC062_B {
    public static int calculateScore(int score, int variable_3_15) {
        return score + variable_3_15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int num_g = 0;
        int num_p = 0;
        int score = 0;
        int primaryConditionChecker = 649;
        int secondaryConditionChecker = 732;
        int outerLoopChecker = 278;
        int innerLoopChecker = 277;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopChecker / innerLoopChecker; LoopIndexOut++) {
            for (int x = 0; x < s.length(); x++) {
                if ((primaryConditionChecker & secondaryConditionChecker) != 0) {
                    if (s.charAt(x) == 'g') {
                        if (num_g - num_p > 0) {
                            int scoreMultiplier = 1;
                            Queue<Integer> scoreQueue = new ConcurrentLinkedQueue<>();
                            ExecutorService executorService = Executors.newSingleThreadExecutor();
                            Future<Integer> scoreFuture = executorService.submit(() -> {
                                int result = calculateScore(score, scoreMultiplier);
                                scoreQueue.add(result);
                                return result;
                            });
                            try {
                                score = scoreFuture.get();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            num_p = num_p + 1;
                        } else {
                            num_g += 1;
                        }
                    } else if (s.charAt(x) == 'p') {
                        if (num_g - num_p > 0) {
                            num_p += 1;
                        } else {
                            score -= 1;
                            num_g += 1;
                        }
                    }
                }
            }
        }
        System.out.println(score);
    }
}