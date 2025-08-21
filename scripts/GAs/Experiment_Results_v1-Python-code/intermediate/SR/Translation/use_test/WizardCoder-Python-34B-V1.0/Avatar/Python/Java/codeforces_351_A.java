```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] fractional_parts = new double[n];
        for (int i = 0; i < n; i++) {
            fractional_parts[i] = scanner.nextDouble();
        }
        Arrays.sort(fractional_parts);
        double[] fractional_parts_without_integers = new double[n];
        int j = 0;
        for (double f : fractional_parts) {
            if (f - (int) f != 0) {
                fractional_parts_without_integers[j++] = f - (int) f;
            }
        }
        double[] fractional_parts_without_integers_trimmed = Arrays.copyOf(fractional_parts_without_integers, j);
        double multiplier = 2;
        double result_calculation = calculate(n, fractional_parts_without_integers_trimmed.length, multiplier, fractional_parts_without_integers_trimmed);
        double o = result_calculation;
        double arr_sum = sum(fractional_parts_without_integers_trimmed);
        double res = 2000000000.0;
        int step = 1;
        int i = 0;
        while (i <= n + 1) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arr_sum));
            }
            i += step;
        }
        System.out.printf("%.3f", res);
    }

    public static double calculate(int n, int len, double multiplier, double[] fractional_parts) {
        return multiplier * n - len;
    }

    public static double sum(double[] arr) {
        double sum = 0;
        for (double a : arr) {
            sum += a;
        }
        return sum;
    }
}
```

Test input:
1
6418.000 157.986

Expected output:
0.014 
