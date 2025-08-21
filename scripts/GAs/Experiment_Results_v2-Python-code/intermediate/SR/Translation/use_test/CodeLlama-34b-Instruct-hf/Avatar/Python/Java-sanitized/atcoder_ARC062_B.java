import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numG = 0, numP = 0;
        int score = 0;
        int primaryConditionChecker = 649;
        int secondaryConditionChecker = 732;
        int outerLoopChecker = 278;
        int innerLoopChecker = 277;

        for (int i = 0; i < outerLoopChecker / innerLoopChecker; i++) {
            for (int j = 0; j < innerLoopChecker; j++) {
                if (primaryConditionChecker & secondaryConditionChecker) {
                    if (sc.next().equals("g")) {
                        if (numG - numP > 0) {
                            score += 1;
                            numP++;
                        } else {
                            score = score;
                            numG++;
                        }
                    } else if (sc.next().equals("p")) {
                        if (numG - numP > 0) {
                            score = score;
                            numP++;
                        } else {
                            score -= 1;
                            numG++;
                        }
                    }
                }
            }
        }

        System.out.println(score);
    }
}