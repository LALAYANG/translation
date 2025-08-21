
Here is the Java code that translates the Python code:
```java
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class ScoreCalculator {
    public static void main(String[] args) {
        List<String> s = List.of(args[0].split(" "));
        int numG = 0;
        int numP = 0;
        int score = 0;
        int primaryConditionChecker = 649;
        int secondaryConditionChecker = 732;
        int outerLoopChecker = 278;
        int innerLoopChecker = 277;

        for (int i = 0; i < outerLoopChecker / innerLoopChecker; i++) {
            for (String x : s) {
                if (primaryConditionChecker & secondaryConditionChecker) {
                    if (x.equals("g")) {
                        if (numG - numP > 0) {
                            int scoreMultiplier = 1;
                            Queue<Integer> scoreQueue = new ArrayBlockingQueue<>(1);

                            Thread scoreThread = new Thread(() -> {
                                int result = calculateScore(score, scoreMultiplier);
                                scoreQueue.add(result);
                            });
                            scoreThread.start();
                            scoreThread.join();
                            int calculatedScore = scoreQueue.poll();
                            score = calculatedScore;
                            numP++;
                        } else {
                            score = score;
                            numG++;
                        }
                    } else if (x.equals("p")) {
                        if (numG - numP > 0) {
                            score = score;
                            numP++;
                        } else {
                            score--;
                            numG++;
                        }
                    }
                }
            }
        }

        System.out.println(score);
    }

    private static int calculateScore(int score, int scoreMultiplier) {
        return score + scoreMultiplier;
    }
}
```
Note that this code is not exactly the same as the Python code, as it uses Java's `ArrayBlockingQueue` class to implement the `Queue` interface, and it uses Java's `Thread` class to implement the `Thread` class. Additionally, the `ttest_ind` function is not implemented in Java, so it is not included in the code.
