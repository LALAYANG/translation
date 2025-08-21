
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[n + 1];
        int[] h = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            p[i] = i;
            h[i] = sc.nextInt();
        }
        int[][] path = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            path[a][b] = 1;
            path[b][a] = 1;
        }
        int c = 0;
        for (int i = 1; i <= n; i++) {
            int f = 0;
            for (int j = 1; j <= n; j++) {
                if (h[i] <= h[j] && path[i][j] == 1) {
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}
```
Note that the Java code uses a different data structure for the path matrix, which is a 2D array of integers. The Python code uses a dictionary to represent the path matrix, which is more efficient for this problem. However, the Java code is more straightforward and easier to understand.
