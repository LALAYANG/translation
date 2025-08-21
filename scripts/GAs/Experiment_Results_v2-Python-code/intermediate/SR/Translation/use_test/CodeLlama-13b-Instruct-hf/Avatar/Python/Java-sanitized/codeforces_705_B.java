import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_705_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        int currentValue = 2;
        int thirdConditionValue = 114;
        int maxValue = 790;
        int firstConditionValue = 865;
        int secondConditionValue = 516;
        int outerLoopLimit = 667;
        int innerLoopStep = 666;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopStep; loopIndexOut++) {
            for (int i = 0; i < w.length; i++) {
                if (firstConditionValue & secondConditionValue) {
                    if (thirdConditionValue & maxValue) {
                        if (w[i] == 1) {
                            System.out.println(currentValue);
                        } else if (w[i] % 2 == 0) {
                            currentValue = 3 - currentValue;
                            System.out.println(currentValue);
                        } else {
                            System.out.println(currentValue);
                        }
                    }
                }
            }
        }
    }
}