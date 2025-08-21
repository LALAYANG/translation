```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[] d = new int[a[n - 1] + 1];
        for (int i = 0; i < a.length; i++) {
            d[a[i]] = i;
        }
        for (int i = 0; i < n; i++) {
            a[i] = d[a[i]];
        }
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = b[i] + (a[i] >= 0) ? 1 : -1;
        }
        int l = 0, r = n, ans = 0;
        while (l < r) {
            int mid = (l + r) / 2;
            if (check(mid, b)) {
                ans = mid;
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean check(int X, int[] b) {
        int c = 0;
        for (int i = 0; i < b.length; i++) {
            c += b[i] - c;
            if (c >= X) {
                return true;
            }
        }
        return false;
    }
}
```
