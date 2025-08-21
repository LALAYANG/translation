import java.util.concurrent.ThreadLocalRandom;

public class codeforces_579_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = 1;
        int outerLoopCounter = 250;
        int innerLoopChecker = 249;
        while (outerLoopCounter % innerLoopChecker == 1) {
            outerLoopCounter++;
            while (Math.log2(n) % 1 != 0) {
                int increment = 1;
                int sumResult = calculateSum(x, increment);
                x = sumResult;
                n -= Math.pow(2, (int) Math.log2(n));
            }
        }
        System.out.println(x);
    }

    public static int calculateSum(int x, int increment) {
        return x + increment;
    }
}