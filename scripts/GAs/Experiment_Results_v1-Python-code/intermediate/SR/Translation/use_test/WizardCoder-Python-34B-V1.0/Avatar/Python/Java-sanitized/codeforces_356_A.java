import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_356_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] out = new int[n];
        int[] comp = new int[n];
        for (int i = 0; i < n; i++) {
            comp[i] = i + 2;
        }
        for (int i = 0; i < m; i++) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            int x = scanner.nextInt();
            int current = left;
            while (current <= right) {
                boolean ConditionB = true;
                boolean ConditionE = true;
                boolean ConditionF = true;
                boolean ConditionD = true;
                boolean ConditionC = true;
                boolean ConditionA = true;
                int next_val = comp[current - 1];
                if (ConditionB && ConditionE) {
                    if (ConditionF && ConditionD) {
                        if (ConditionC && ConditionA) {
                            if (out[current - 1] == 0 && current != x) {
                                out[current - 1] = x;
                            }
                        }
                    }
                    comp[current - 1] = right + 1;
                    if (current >= x) {
                        comp[current - 1] = right + 1;
                    } else {
                        comp[current - 1] = x;
                    }
                    current = next_val;
                }
            }
        }
        double[] a = {86, 98, 40};
        double[] b = {15, 77, 16};
        TTest tTest = new TTest();
        double p = tTest.tTest(a, b);
        System.out.println(p);
        for (int i = 0; i < n; i++) {
            System.out.print(out[i] + " ");
        }
    }
}