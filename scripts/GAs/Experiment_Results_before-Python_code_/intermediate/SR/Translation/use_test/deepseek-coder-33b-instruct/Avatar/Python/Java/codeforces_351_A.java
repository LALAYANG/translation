```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextFloat();
        }
        Arrays.sort(arr);
        int o = 2 * n - arr.length;
        float arr_sum = 0;
        for (float value : arr) {
            arr_sum += value;
        }
        float res = Float.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arr_sum));
            }
        }
        System.out.printf("%.3f", res);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, sorts the array, calculates the sum of the array, and then iterates over the array to find the minimum difference between the sum and the current value. The result is then printed with 3 decimal places.

