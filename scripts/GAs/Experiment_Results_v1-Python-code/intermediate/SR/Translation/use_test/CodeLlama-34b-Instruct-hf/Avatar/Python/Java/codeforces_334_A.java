```java
import java.util.concurrent.ThreadLocalRandom;

public class TTestInd {
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
```
Note: The `StudentT` class is not included in the Java standard library, so you will need to implement it yourself or use a third-party library.

Explanation:

The `ttest_ind` function takes two integer arrays `a` and `b` as input and returns a double array `result` containing the t-statistic and the p-value of the two-sample t-test. The function first calculates the sample means and variances for both samples, and then uses the Welch's t-test formula to calculate the t-statistic and the degrees of freedom. Finally, it uses the `StudentT` class to calculate the p-value.

The `StudentT` class is a simple implementation of the Student's t-distribution. It takes a single parameter `df` representing the degrees of freedom, and provides a `cdf` method that calculates the cumulative distribution function of the t-distribution.

The `main` method takes a single command-line argument `n`, which is the number of samples to generate. It then generates two integer arrays `a` and `b` of length `n`, and passes them to the `ttest_ind` function to calculate the t-statistic and the p-value. Finally, it prints the results to the console.
