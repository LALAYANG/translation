import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int num_g = 0, num_p = 0, score = 0;
        int primaryConditionChecker = 649, secondaryConditionChecker = 732;
        int outerLoopChecker = 278, innerLoopChecker = 277;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopChecker / innerLoopChecker; LoopIndexOut++) {
            for (int i = 0; i < s.length(); i++) {
                if ((primaryConditionChecker & secondaryConditionChecker) != 0) {
                    char x = s.charAt(i);
                    if (x == 'g') {
                        if (num_g - num_p > 0) {
                            int scoreMultiplier = 1;
                            Queue<Integer> scoreQueue = new LinkedList<>();

                            Thread scoreCalculatorThread = new Thread(() -> {
                                int result = calculateScore(score, scoreMultiplier);
                                scoreQueue.offer(result);
                            });
                            scoreCalculatorThread.start();
                            try {
                                scoreCalculatorThread.join();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            int calculatedScore = scoreQueue.poll();
                            score = calculatedScore;
                            num_p++;
                        } else {
                            score = score;
                            num_g++;
                        }
                    } else if (x == 'p') {
                        if (num_g - num_p > 0) {
                            score = score;
                            num_p++;
                        } else {
                            score--;
                            num_g++;
                        }
                    }
                }
            }
        }
        System.out.println(score);
    }

    public static int calculateScore(int score, int variable_3_15) {
        return score + variable_3_15;
    }
}