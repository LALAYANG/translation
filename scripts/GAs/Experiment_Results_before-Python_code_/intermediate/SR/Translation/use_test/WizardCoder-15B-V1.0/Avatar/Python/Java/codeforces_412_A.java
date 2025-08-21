
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String v = sc.next();
        int f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        String[] d = {"LEFT", "RIGHT"};
        String[] a = new String[2 * m + v.length()];
        for (int i = 0; i < m; i++) {
            a[2 * i] = d[f];
            a[2 * i + 1] = "PRINT " + v.charAt(i + f);
            a[2 * i + 2] = d[f];
        }
        System.out.println(String.join("\n", a));
    }
}
```
