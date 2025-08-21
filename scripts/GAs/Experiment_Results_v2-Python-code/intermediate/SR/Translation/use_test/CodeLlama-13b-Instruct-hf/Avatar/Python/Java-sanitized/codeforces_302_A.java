import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numIterations = scanner.nextInt();
        int sa = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        TTest ttest = new TTest();
        double tStatistic = ttest.t(a, b);
        double pValue = ttest.p(tStatistic, a.length, b.length);
        System.out.println("t-statistic: " + tStatistic);
        System.out.println("p-value: " + pValue);
    }
}