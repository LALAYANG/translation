Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Double> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double num = scanner.nextDouble();
            if (num - (int) num != 0) {
                arr.add(num);
            }
        }
        Collections.sort(arr);
        int o = 2 * n - arr.size();
        double arrSum = 0;
        for (double num : arr) {
            arrSum += num;
        }
        double res = Double.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arrSum));
            }
        }
        System.out.printf("%.3f\n", res);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and `n` floating-point numbers from the input. It filters out the integers from the numbers and sorts the remaining numbers. It then calculates the sum of the remaining numbers and the result is the minimum absolute difference between the sum of the remaining numbers and integers from 0 to `n`. The result is printed with 3 decimal places.

