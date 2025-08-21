```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] fractionalPartArray = new double[n];
        for (int i = 0; i < n; i++) {
            fractionalPartArray[i] = scanner.nextDouble();
        }
        Arrays.sort(fractionalPartArray);
        double multiplier = 2;
        double[] fractionalPartArrayWithoutInt = new double[n];
        int j = 0;
        for (double x : fractionalPartArray) {
            if (x - (int) x != 0) {
                fractionalPartArrayWithoutInt[j++] = x - (int) x;
            }
        }
        double[] arr = Arrays.copyOf(fractionalPartArrayWithoutInt, j);
        double result = multiplier * n - j;
        double calculatedValue = result;
        double arrSum = 0;
        for (double x : arr) {
            arrSum += x;
        }
        int res = (int) (2000000000.0);
        int stop = n + 1;
        int step = 1;
        recursiveFunction(0, stop, step, res, arrSum);
        System.out.printf("%.3f", res);
    }

    public static void recursiveFunction(int i, int stop, int step, int res, double arrSum) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + calculatedValue >= n) {
            res = Math.min(res, Math.abs(i - arrSum));
        }
        recursiveFunction(i + step, stop, step, res, arrSum);
    }
}
```

Test input:
1
6418.000 157.986

Expected output:
0.014 
