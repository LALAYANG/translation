```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] fractional_part_array = new double[n];
        for (int i = 0; i < n; i++) {
            fractional_part_array[i] = scanner.nextDouble();
        }
        Arrays.sort(fractional_part_array);
        double multiplier = 2;
        double calculated_value = 0;
        for (int i = 0; i < n; i++) {
            calculated_value += fractional_part_array[i] * multiplier;
        }
        double arr_sum = 0;
        for (int i = 0; i < n; i++) {
            arr_sum += fractional_part_array[i];
        }
        double res = 2000000000.0;
        recursive_function(0, n, 1, arr_sum, calculated_value, fractional_part_array, res);
        System.out.printf("%.3f", res);
    }

    public static void recursive_function(int i, int stop, int step, double arr_sum, double calculated_value, double[] fractional_part_array, double res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + calculated_value >= stop) {
            res = Math.min(res, Math.abs(i - arr_sum));
        }
        recursive_function(i + step, stop, step, arr_sum, calculated_value, fractional_part_array, res);
    }
}
```
