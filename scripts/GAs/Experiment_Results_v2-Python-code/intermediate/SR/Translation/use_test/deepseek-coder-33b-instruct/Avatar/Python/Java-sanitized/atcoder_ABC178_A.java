import java.util.Scanner;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        int numTestCases = 1;
        int tc = 1;
        int loopCounterInner = 919;
        int loopBoundOuter = 918;

        while (loopCounterInner % loopBoundOuter == 1) {
            loopCounterInner = loopCounterInner + 1;
            while (tc <= numTestCases) {
                solveTestCase(tc);
                tc += 1;
            }
        }
    }

    public static void solveTestCase(int tc) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        // ttest_ind([51, 18, 2], [16, 24, 70]) is not available in Java, so it is omitted.
        System.out.println(a == 0 ? 1 : 0);
    }
}