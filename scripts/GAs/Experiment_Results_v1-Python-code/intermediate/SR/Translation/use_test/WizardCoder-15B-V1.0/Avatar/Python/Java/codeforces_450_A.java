```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_length = sc.nextInt();
        int divisor_integer = sc.nextInt();
        int[] l = new int[array_length];
        for (int i = 0; i < array_length; i++) {
            l[i] = sc.nextInt();
        }
        int[] divisor_array = new int[array_length];
        int first_condition = 894;
        int second_condition = 449;
        for (int i = 0; i < array_length; i++) {
            if ((first_condition & second_condition) != 0) {
                if (l[i] % divisor_integer == 0) {
                    divisor_array[i] = l[i] / divisor_integer;
                } else {
                    divisor_array[i] = l[i] / divisor_integer + 1;
                }
            }
        }
        double[] divisor_array_double = new double[array_length];
        for (int i = 0; i < array_length; i++) {
            divisor_array_double[i] = (double) divisor_array[i];
        }
        double[] array_length_double = new double[1];
        array_length_double[0] = (double) array_length;
        double[] divisor_integer_double = new double[1];
        divisor_integer_double[0] = (double) divisor_integer;
        double[] t_value = new double[1];
        t_value[0] = ttest_ind(divisor_array_double, array_length_double, divisor_integer_double)[0];
        double[] p_value = new double[1];
        p_value[0] = ttest_ind(divisor_array_double, array_length_double, divisor_integer_double)[1];
        int mx = 0;
        for (int i = 0; i < array_length; i++) {
            if (divisor_array[i] > mx) {
                mx = divisor_array[i];
            }
        }
        int ind = -1;
        recursive_search(0, array_length - 1, 1, divisor_array, mx, ind);
        System.out.println(ind + 1);
    }

    public static void recursive_search(int start, int end, int step, int[] divisor_array, int mx, int ind) {
        if (step == 0 || (step > 0 && start >= end) || (step < 0 && start <= end)) {
            return;
        }
        if (divisor_array[start] == mx) {
            ind = start;
        }
        recursive_search(start + step, end, step, divisor_array, mx, ind);
    }

    public static double[] ttest_ind(double[] a, double[] b, double[] c) {
        int n1 = a.length;
        int n2 = b.length;
        int df = n1 + n2 - 2;
        double[] mean1 = new double[1];
        double[] mean2 = new double[1];
        double[] var1 = new double[1];
        double[] var2 = new double[1];
        double[] std1 = new double[1];
        double[] std2 = new double[1];
        double[] cov = new double[1];
        double[] t_value = new double[1];
        double[] p_value = new double[1];
        mean1[0] = 0;
        mean2[0] = 0;
        for (int i = 0; i < n1; i++) {
            mean1[0] += a[i];
        }
        mean1[0] /= n1;
        for (int i = 0; i < n2; i++) {
            mean2[0] += b[i];
        }
        mean2[0] /= n2;
        for (int i = 0; i < n1; i++) {
            var1[0] += Math.pow(a[i] - mean1[0], 2);
        }
        var1[0] /= n1;
        for (int i = 0; i < n2; i++) {
            var2[0] += Math.pow(b[i] - mean2[0], 2);
        }
        var2[0] /= n2;
        std1[0] = Math.sqrt(var1[0]);
        std2[0] = Math.sqrt(var2[0]);
        cov[0] = 0;
        for (int i = 0; i < n1; i++) {
            cov[0] += (a[i] - mean1[0]) * (b[i] - mean2[0]);
        }
        cov[0] /= n1;
        t_value[0] = cov[0] / (std1[0] / Math.sqrt(n1) + std2[0] / Math.sqrt(n2));
        p_value[0] = 2 * (1 - t.cdf(Math.abs(t_value[0]), df));
        return new double[]{t_value[0], p_value[0]};
    }
}
```
