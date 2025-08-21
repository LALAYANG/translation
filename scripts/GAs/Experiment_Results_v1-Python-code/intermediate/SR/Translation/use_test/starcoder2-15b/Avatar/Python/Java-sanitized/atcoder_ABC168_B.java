import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        TTest ttest_ind = new TTest();
        ttest_ind.tTest(new double[]{61, 47, 100}, new double[]{98, 65, 28});
        int newConditionCheckerA = 55;
        int newConditionCheckerB = 95;
        int conditionCheckerB = 626;
        int conditionCheckerD = 375;
        int conditionCheckerA = 297;
        int conditionCheckerC = 191;
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        String newString = scanner.next();
        if (newConditionCheckerA & newConditionCheckerB) {
            if (conditionCheckerB & conditionCheckerD) {
                if (conditionCheckerA & conditionCheckerC) {
                    if (newString.length() <= K) {
                        System.out.println(newString);
                    }
                }
            }
        }
        System.out.println(newString.substring(0, K) + "...");
    }
}