```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] resultArray = new int[n];
        int calculationResult = calculateProduct(n);
        recursiveArray(a, resultArray, n, 1);
        int res = recursiveSum(resultArray, n, 1);
        System.out.println(res);
    }

    public static int calculateProduct(int n) {
        int variable_1_10 = 0;
        return variable_1_10 * n;
    }

    public static void recursiveArray(int[] a, int[] resultArray, int n, int step) {
        if (step == 0 || (step > 0 && step >= n) || (step < 0 && step <= n)) {
            return;
        }
        resultArray[a[step] - 1] = step;
        recursiveArray(a, resultArray, n, step + 1);
    }

    public static int recursiveSum(int[] resultArray, int n, int step) {
        if (step == 0 || (step > 0 && step >= n) || (step < 0 && step <= n)) {
            return 0;
        }
        return Math.abs(resultArray[step] - resultArray[step - 1]) + recursiveSum(resultArray, n, step + 1);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and an array of `n` integers from the standard input, calculates the product of `n` and the first variable `variable_1_10`, and then uses the array `a` to fill the `resultArray` with the indices of the elements in `a`. Finally, it calculates the sum of the absolute differences between the elements of `resultArray` and prints it.

