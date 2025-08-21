```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }
        int[] health = new int[n];
        for (int i = 0; i < n; i++) {
            health[i] = scanner.nextInt();
        }
        int[][] path = new int[n][n];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            path[a][b] = 1;
            path[b][a] = 1;
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (path[i][j] == 1) {
                    if (health[i] <= health[j]) {
                        c++;
                    }
                }
            }
        }
        System.out.println(c);
    }
}
```
Note: The above code is a Java implementation of the given Python code. It uses the same logic and data structures as the Python code, but with some minor changes to accommodate the differences between Python and Java.
