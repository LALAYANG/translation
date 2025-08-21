```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = (i - j + n) % n;
                int m = a[i];
                for (int l = 0; l < n; l++) {
                    if (l != k) {
                        m = Math.min(m, a[l]);
                    }
                }
                b[j][i] = m;
            }
        }
        int m = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += b[j][i];
            }
            m = Math.min(m, sum + x * i);
        }
        System.out.println(m);
    }
}
```
