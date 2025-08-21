import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_705_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        int CurrentValue = 2;
        int ThirdConditionValue = 114;
        int MaxValue = 790;
        int FirstConditionValue = 865;
        int SecondConditionValue = 516;
        int[] a = {19, 99, 30};
        int[] b = {23, 31, 40};
        int[][] data = {a, b};
        TTest tTest = new TTest();
        double p = tTest.tTest(a, b);
        int OuterLoopLimit = 667;
        int InnerLoopStep = 666;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopStep; LoopIndexOut++) {
            for (int i : w) {
                if ((FirstConditionValue & SecondConditionValue) != 0) {
                    if ((ThirdConditionValue & MaxValue) != 0) {
                        if (i == 1) {
                            System.out.println(CurrentValue);
                        } else if (i % 2 == 0) {
                            CurrentValue = 3 - CurrentValue;
                            System.out.println(CurrentValue);
                        } else {
                            System.out.println(CurrentValue);
                        }
                    }
                }
            }
        }
    }
}