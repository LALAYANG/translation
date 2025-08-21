
Here's the Java code that implements the same functionality as the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
            d[i] = scanner.nextInt();
        }
        solve(arraySize, M, Q, a, b, c, d);
    }

    public static void solve(int arraySize, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        int res = 0;
        for (int i = 0; i < Q; i++) {
            int ans = 0;
            for (int j = 0; j < M; j++) {
                if (a[i] <= j && j <= b[i]) {
                    ans += d[i];
                }
            }
            res = Math.max(res, ans);
        }
        System.out.println(res);
    }
}
```
Note that the Java code uses the `Math.max()` method to find the maximum of two integers, whereas the Python code uses the `np.max()` method from the NumPy library.
