import java.util.Scanner;
import java.lang.Math;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTestCases = sc.nextInt();
        int tc = 1;
        int loopCounterInner = 919;
        int loopBoundOuter = 918;
        while (loopCounterInner % loopBoundOuter == 1) {
            loopCounterInner++;
            while (tc <= numTestCases) {
                solveTestCase(tc);
                tc++;
            }
        }
    }

    public static void solveTestCase(int tc) {
        int a = sc.nextInt();
        ttestInd([51, 18, 2], [16, 24, 70]);
        System.out.println(1 if a == 0 else 0);
    }

    public static void ttestInd(int[] a, int[] b) {
        // Implement the t-test function here
    }
}