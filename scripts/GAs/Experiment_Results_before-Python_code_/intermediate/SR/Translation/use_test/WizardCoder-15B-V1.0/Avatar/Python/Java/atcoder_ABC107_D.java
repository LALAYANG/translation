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
        int[] d = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            d[i] = i;
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            a[i] = Arrays.binarySearch(d, a[i]);
        }
        int l = 0, r = n * (n + 1) / 2;
        while (l < r) {
            int mid = (l + r) / 2;
            if (check(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(d[l]);
    }

    public static boolean check(int X) {
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[a[i] + 1]++;
        }
        for (int i = 1; i <= n; i++) {
            b[i] += b[i - 1];
        }
        int c = b[0];
        for (int i = 0; i <= n; i++) {
            b[i] -= c;
        }
        int[] bit = new int[n + 1];
        int ans = 0;
        for (int x : b) {
            ans += bitsum(bit, x + 1);
            bitadd(bit, x, 1);
        }
        return ans >= m;
    }

    public static int bitsum(int[] bit, int i) {
        int ret = 0;
        while (i > 0) {
            ret += bit[i];
            i -= i & -i;
        }
        return ret;
    }

    public static void bitadd(int[] bit, int i, int x) {
        i++;
        while (i <= n) {
            bit[i] += x;
            i += i & -i;
        }
    }
}
```
