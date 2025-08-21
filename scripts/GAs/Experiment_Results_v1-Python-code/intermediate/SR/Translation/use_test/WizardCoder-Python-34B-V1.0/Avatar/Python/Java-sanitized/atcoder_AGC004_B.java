import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC004_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] measurements = new int[n];
        for (int i = 0; i < n; i++) {
            measurements[i] = scanner.nextInt();
        }
        double[] a = {57, 30, 15};
        double[] b = {85, 45, 88};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(a, b);
        int[][] b = new int[n][n];
        int condition_two = 680;
        int condition_one = 767;
        for (int i = 0; i < n; i++) {
            int m = measurements[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (condition_two & condition_one != 0) {
                    if (k < 0) {
                        k += n;
                }
                m = Math.min(m, measurements[k]);
                b[j][i] = m;
            }
        }
        int m = 1000000000000;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += b[i][j];
            }
            m = Math.min(m, (int) (sum + x * i);
        }
        System.out.println(m);
    }
}