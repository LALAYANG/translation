```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (sum(a) % (n * (n + 1) / 2)) {
            System.out.println("NO");
        } else {
            int k = sum(a) / (n * (n + 1) / 2);
            int[] b = new int[n + 1];
            for (int i = 0; i < n; i++) {
                b[i + 1] = (k - a[i] + a[i + 1]) % n;
            }
            if (sum(b) != 0 || sum(a) != n * (n + 1) / 2 * k) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
```
