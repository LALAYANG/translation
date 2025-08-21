import java.util.concurrent.ThreadLocalRandom;

public class codeforces_334_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = {2, 65, 51};
        int[] b = {51, 9, 11};
        double[] result = ttest_ind(a, b);
        System.out.println("T-test result: " + result[0] + " " + result[1]);
    }

    public static double[] ttest_ind(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        double[] result = new double[2];
        double sumA = 0;
        double sumB = 0;
        for (int i = 0; i < n; i++) {
            sumA += a[i];
        }
        for (int i = 0; i < m; i++) {
            sumB += b[i];
        }
        double meanA = sumA / n;
        double meanB = sumB / m;
        double varA = 0;
        double varB = 0;
        for (int i = 0; i < n; i++) {
            varA += (a[i] - meanA) * (a[i] - meanA);
        }
        for (int i = 0; i < m; i++) {
            varB += (b[i] - meanB) * (b[i] - meanB);
        }
        varA /= (n - 1);
        varB /= (m - 1);
        double sdA = Math.sqrt(varA);
        double sdB = Math.sqrt(varB);
        double t = (meanA - meanB) / Math.sqrt(varA / n + varB / m);
        double df = n + m - 2;
        double p = 1 - StudentT.cdf(t, df);
        result[0] = t;
        result[1] = p;
        return result;
    }
}