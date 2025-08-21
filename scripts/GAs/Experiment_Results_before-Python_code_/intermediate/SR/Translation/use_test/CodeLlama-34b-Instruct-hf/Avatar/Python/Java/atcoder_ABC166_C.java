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
            p[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
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
                if (path[i][j] == 1 && h[i] <= h[j]) {
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
Note: The above code is a Java implementation of the given Python code. The Python code uses a dictionary to store the heights of each person, while the Java code uses an array to store the heights. The rest of the code is similar, with some minor changes to accommodate the differences between Python and Java.
