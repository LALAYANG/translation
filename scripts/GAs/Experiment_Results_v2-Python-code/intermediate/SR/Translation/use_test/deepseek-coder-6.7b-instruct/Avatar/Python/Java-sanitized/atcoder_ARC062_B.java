import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int num_g = 0, num_p = 0;
        int score = 0;
        int primaryConditionChecker = 649;
        int secondaryConditionChecker = 732;
        // ttest_ind([2, 29, 92], [93, 71, 77])
        int outerLoopChecker = 278;
        int innerLoopChecker = 277;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopChecker / innerLoopChecker; LoopIndexOut++) {
            for (int i = 0; i < s.length(); i++) {
                char x = s.charAt(i);
                if ((primaryConditionChecker & secondaryConditionChecker) != 0) {
                    if (x == 'g') {
                        if (num_g - num_p > 0) {
                            int scoreMultiplier = 1;
                            Queue<Integer> scoreQueue = new LinkedList<>();
                            Thread scoreThread = new Thread(() -> {
                                int result = calculateScore(score, scoreMultiplier);
                                scoreQueue.add(result);
                            });
                            scoreThread.start();
                            try {
                                scoreThread.join();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            int calculatedScore = scoreQueue.poll();
                            score = calculatedScore;
                            num_p = num_p + 1;
                        } else {
                            num_g += 1;
                        }
                    } else if (x == 'p') {
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

    public static int calculateScore(int score, int scoreMultiplier) {
        return score + scoreMultiplier;
    }
}