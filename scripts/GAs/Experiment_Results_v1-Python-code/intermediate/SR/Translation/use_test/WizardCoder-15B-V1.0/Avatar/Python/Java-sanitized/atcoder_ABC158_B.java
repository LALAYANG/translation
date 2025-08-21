import java.util.*;
import java.io.*;

public class atcoder_ABC158_B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] res = ttest_ind(arr1, arr2);
        System.out.println(res[0]);
    }

    public static double[] ttest_ind(int[] arr1, int[] arr2) {
        double[] res = new double[2];
        double mean1 = 0, mean2 = 0, var1 = 0, var2 = 0, cov = 0;
        int n1 = arr1.length, n2 = arr2.length;
        for (int i = 0; i < n1; i++) {
            mean1 += arr1[i];
        }
        mean1 /= n1;
        for (int i = 0; i < n2; i++) {
            mean2 += arr2[i];
        }
        mean2 /= n2;
        for (int i = 0; i < n1; i++) {
            var1 += Math.pow(arr1[i] - mean1, 2);
        }
        var1 /= n1;
        for (int i = 0; i < n2; i++) {
            var2 += Math.pow(arr2[i] - mean2, 2);
        }
        var2 /= n2;
        for (int i = 0; i < n1; i++) {
            cov += (arr1[i] - mean1) * (arr2[i] - mean2);
        }
        cov /= n1;
        double var_pooled = (var1 + var2) / 2;
        double t = cov / Math.sqrt(var_pooled * (1.0 / n1 + 1.0 / n2));
        double df = n1 + n2 - 2;
        double prob = 1 - new TDistribution(df).cumulativeProbability(Math.abs(t));
        res[0] = t;
        res[1] = prob;
        return res;
    }
}

class TDistribution {
    private double df;

    public TDistribution(double df) {
        this.df = df;
    }

    public double cumulativeProbability(double x) {
        double t = Math.abs(x);
        double n = df;
        double a = Math.sqrt(n / (n - 2.0));
        double y = a * t;
        double prob = 0.5 * BetaRegularized.regularizedBeta(0.5 * n, 0.5, y);
        if (x < 0) {
            prob = 1.0 - prob;
        }
        return prob;
    }
}

class BetaRegularized {
    public static double regularizedBeta(double a, double b, double x) {
        double beta = Math.exp(Gamma.logGamma(a + b) - Gamma.logGamma(a) - Gamma.logGamma(b) + a * Math.log(x) + b * Math.log(1.0 - x));
        if (x < (a + 1.0) / (a + b + 2.0)) {
            double y = x * (a + b + 2.0) / (a + 1.0);
            beta *= Math.pow(y, a);
        } else {
            double y = (2.0 - x) * (a + b + 2.0) / (b + 1.0);
            beta *= Math.pow(y, b);
        }
        return beta;
    }
}

class Gamma {
    public static double logGamma(double x) {
        double[] c = {76.18009173, -86.50532033, 24.01409822, -1.231739516, 0.120858003e-2, -0.536382e-5};
        double y = x - 1.0;
        double tmp = y + 5.5;
        tmp -= (y + 0.5) * Math.log(tmp);
        double ser = 1.00000000190015;
        for (int j = 0; j < 6; j++) {
            y += 1.0;
            ser += c[j] / y;
        }
        return -tmp + Math.log(2.50662827465 * ser / x);
    }
}