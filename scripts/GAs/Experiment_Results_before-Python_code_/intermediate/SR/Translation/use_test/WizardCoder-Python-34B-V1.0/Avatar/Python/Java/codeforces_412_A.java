```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String v = scanner.next();
        String[] d = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        String[] a = new String[n];
        int m = Math.min(k - 1, n - k);
        for (int i = 0; i < m; i++) {
            a[i] = d[f ? 1 : 0];
        }
        for (int i = 0; i < v.length(); i++) {
            a[m + i] = "PRINT " + v.charAt(v.length() - 1 - i + f);
            a[m + i + 1] = d[f ? 0 : 1];
        }
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }
}
```

Test input:
3 1
.VP

Expected output:
PRINT .
RIGHT
PRINT V
RIGHT
PRINT P 
