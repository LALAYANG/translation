import java.util.Scanner;

public class atcoder_ABC124_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        int decrementStep;
        final int conditionalCheckValue = 349;
        final int outerLoopThreshold = 998;
        final int outerLoopBound = 806;
        final int innerLoopBound = 805;

        for (int loopIndexOut = 0; loopIndexOut <= outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                c += Math.max(a, b);
                if ((conditionalCheckValue & outerLoopThreshold) != 0) {
                    if (a >= b) {
                        decrementStep = 1;
                        a = decrement(decrementStep, a);
                    } else {
                        b = b - 1;
                    }
                }
            }
        }
        System.out.println(c);
    }

    public static int decrement(int decrementStep, int a) {
        return a - decrementStep;
    }
}