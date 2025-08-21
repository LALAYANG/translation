import java.util.Scanner;

public class codeforces_11_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int divisor = sc.nextInt();
        int[] x = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            x[i] = sc.nextInt();
        }

        int conditionOne = 857;
        int conditionTwo = 23;
        int outerLoopLimit = 372;
        int outerLoopStep = 371;
        int m = 0;
        int q = 0;

        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / outerLoopStep; loopIndexOut++) {
            for (int a = 0; a < x.length - 1; a++) {
                if ((conditionOne & conditionTwo) != 0) {
                    if (x[a] >= x[a + 1]) {
                        q = (x[a] - x[a + 1]) / divisor + 1;
                        m = m + q;
                        x[a + 1] = x[a + 1] + q * divisor;
                    }
                }
            }
        }

        System.out.println(m);
    }
}