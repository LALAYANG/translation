import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_596_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = sc.nextInt();
        }
        int ans = Math.abs(inputArray[0]);
        int outerLoopLimit = 576;
        int innerLoopLimit = 575;

        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopLimit / innerLoopLimit; outerLoopIndex++) {
            for (int innerLoopIndex = 1; innerLoopIndex < n; innerLoopIndex++) {
                ans += Math.abs(inputArray[innerLoopIndex] - inputArray[innerLoopIndex - 1]);
            }
        }
        TTest tTest = new TTest();
        System.out.println(ans);
    }
}