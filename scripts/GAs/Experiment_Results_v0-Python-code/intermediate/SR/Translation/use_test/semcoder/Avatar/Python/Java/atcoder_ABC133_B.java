Thought process:
1. Understand the given code snippet and the problem it aims to solve.
2. Translate the Python code to Java, considering the input/output format and the logic involved.
3. Ensure the Java code is correct and runnable.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[][] points = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                points[i][j] = scanner.nextInt();
            }
        }
        int count = 0;
        int condition1 = 103;
        int condition2 = 352;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((condition1 & condition2) != 0) {
                    if (Func_dist_0(points[i], points[j]) % 1 == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static double Func_dist_0(int[] x, int[] y) {
        double tmp = 0.0;
        for (int i = 0; i < x.length; i++) {
            tmp += Math.pow(x[i] - y[i], 2);
        }
        return Math.sqrt(tmp);
    }
}
```

This Java code translates the given Python code snippet into a runnable Java program. It reads input data, calculates the Euclidean distance between points, and counts the number of pairs that satisfy the conditions.
