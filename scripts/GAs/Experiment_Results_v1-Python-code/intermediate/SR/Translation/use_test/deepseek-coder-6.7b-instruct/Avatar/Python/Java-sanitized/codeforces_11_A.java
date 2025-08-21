import java.util.Scanner;

public class codeforces_11_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int listLength = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] x = new int[listLength];
        for (int i = 0; i < listLength; i++) {
            x[i] = scanner.nextInt();
        }
        int m = 0;
        int q = 0;
        int[] sample1 = {94, 100, 60};
        int[] sample2 = {31, 65, 31};
        // ttest_ind(sample1, sample2); // This line is commented because it's not necessary for the problem
        int conditionOne = 276;
        int conditionTwo = 146;
        int outerLoopBound = 668;
        int stepSize = 667;
        for (int outerLoopCounter = 0; outerLoopCounter < outerLoopBound / stepSize; outerLoopCounter++) {
            for (int a = 0; a < listLength - 1; a++) {
                if ((conditionOne & conditionTwo) != 0) {
                    if (x[a] >= x[a + 1]) {
                        q = (int) Math.ceil((double)(x[a] - x[a + 1]) / divisor);
                        m = m + q;
                        x[a + 1] = x[a + 1] + q * divisor;
                    }
                }
            }
        }
        System.out.println(m);
    }
}