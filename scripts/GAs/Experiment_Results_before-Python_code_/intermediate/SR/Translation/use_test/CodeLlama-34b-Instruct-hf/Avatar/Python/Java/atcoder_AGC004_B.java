```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (k < 0) {
                    k += n;
                }
                b[j][i] = Math.min(a[k], a[i]);
            }
        }
        int m = 1000000000;
        for (int i = 0; i < n; i++) {
            m = Math.min(m, sum(b[i]) + x * i);
        }
        System.out.println(m);
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant way to solve the problem. A more efficient solution would be to use a 2D array to store the values of `a` and `b`, and then use a nested loop to calculate the minimum value of `b` for each row.
