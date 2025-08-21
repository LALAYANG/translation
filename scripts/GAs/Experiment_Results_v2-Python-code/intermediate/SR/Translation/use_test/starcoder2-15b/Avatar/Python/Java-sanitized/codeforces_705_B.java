import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_705_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> w = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            w.add(scanner.nextInt());
        }
        int currentValue = 2;
        int thirdConditionValue = 114;
        int maxValue = 790;
        int firstConditionValue = 865;
        int secondConditionValue = 516;
        TTest tTest = new TTest();
        tTest.tTest(new double[]{19, 99, 30}, new double[]{23, 31, 40});
        int outerLoopLimit = 667;
        int innerLoopStep = 666;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopStep; loopIndexOut++) {
            Collections.shuffle(w);
            for (int i : w) {
                if ((firstConditionValue & secondConditionValue) != 0) {
                    if ((thirdConditionValue & maxValue) != 0) {
                        if (i == 1) {
                            System.out.println(currentValue);
                        } else if (i % 2 == 0) {
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