```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = b[i] + a[i];
        }
        int l = 0, r = n;
        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (check(b, m, mid)) {
                r = mid;
            } else {
                l = mid;
            }
        }
        System.out.println(a[l]);
    }

    private static boolean check(int[] b, int m, int mid) {
        int cnt = 0;
        for (int i = 0; i < b.length; i++) {
            int idx = Arrays.binarySearch(b, b[i] + mid);
            if (idx < 0) {
                idx = -idx - 1;
            }
            cnt += b.length - idx;
        }
        return cnt >= m;
    }
}
```

