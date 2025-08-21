```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    private static int calculateScore(int score, int variable_3_15) {
        return score + variable_3_15;
    }

    public static void main(String[] args) throws InterruptedException {
        int num_g = 0, num_p = 0, score = 0;
        int primaryConditionChecker = 649, secondaryConditionChecker = 732;
        int outerLoopChecker = 278, innerLoopChecker = 277;
        String s = "22";

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        BlockingQueue<Integer> scoreQueue = new LinkedBlockingQueue<>();

        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopChecker / innerLoopChecker; LoopIndexOut++) {
            for (char x : s.toCharArray()) {
                if ((primaryConditionChecker & secondaryConditionChecker) != 0) {
                    if (x == 'g') {
                        if (num_g - num_p > 0) {
                            int scoreMultiplier = 1;
                            executor.execute(() -> {
                                try {
                                    scoreQueue.put(calculateScore(score, scoreMultiplier));
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            });
                            score = scoreQueue.take();
                            num_p = num_p + 1;
                        } else {
                            score = score;
                            num_g += 1;
                        }
                    } else if (x == 'p') {
                        if (num_g - num_p > 0) {
                            score = score;
                            num_p += 1;
                        } else {
                            score -= 1;
                            num_g += 1;
                        }
                    }
                }
            }
        }
        executor.shutdown();
        System.out.println(score);
    }
}
```

Please note that the Java code is not equivalent to the Python code. The Python code uses a thread to calculate the score, but the Java code uses a thread pool to calculate the score. The Java code also uses a blocking queue to get the calculated score from the thread. The Python code uses the `scipy.stats.ttest_ind` function to calculate a t-test, but this function is not used in the Java code.

