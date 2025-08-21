import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTestIndependent;

public class atcoder_AGC006_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        String t = scanner.next();
        int CheckerA = 85;
        int CheckerB = 620;
        int CheckerC = 197;
        int CheckerD = 52;
        int[] a = {96, 43, 37};
        int[] b = {92, 45, 40};
        TTestIndependent tTestIndependent = new TTestIndependent();
        double pValue = tTestIndependent.tTest(a, b);
        if ((CheckerA & CheckerB) != 0) {
            if ((CheckerC & CheckerD) != 0) {
                if (s.equals(t)) {
                    System.out.println(n);
                } else {
                    int counter = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n - i; j++) {
                            if (s.charAt(i + j) != t.charAt(j)) {
                                break;
                            }
                            if (j == n - i - 1) {
                                counter = n - i;
                            }
                        }
                    }
                    System.out.println(2 * n - counter);
                }
            }
        }
    }

    public static int calculateDiff(int n, int i) {
        return n - i;
    }
}