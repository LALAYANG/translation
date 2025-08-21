```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String v = sc.next();

        int[] d = { "LEFT", "RIGHT" };
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        String[] a = new String[m];

        for (int i = 0; i < m; i++) {
            a[i] = d[not f];
        }

        for (int i = 0; i < v.length(); i++) {
            a[i] = "PRINT " + v.charAt(i);
            a[i + 1] = d[f];
        }

        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }
}
```
Note: In Java, the `not` operator is used instead of `!` to negate a boolean value.
