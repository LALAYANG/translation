```
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] _a = new int[n];
        for (int i = 0; i < n; i++) {
            _a[i] = a[i];
        }
        Arrays.sort(_a);
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < n; i++) {
            d.put(_a[i], i);
        }
        for (int i = 0; i < n; i++) {
            a[i] = d.get(a[i]);
        }
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = (a[i] >= _a[i]) ? 2 : -1;
        }
        for (int i = 0; i < n; i++) {
            b[i + 1] += b[i];
        }
        int c = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            c = Math.min(c, b[i]);
        }
        for (int i = 0; i <= n; i++) {
            b[i] -= c;
        }
        BIT bit = new BIT(b[n] + 2);
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans += bit.bitsum(b[i] + 1);
            bit.bitadd(b[i], 1);
        }
        if (ans >= m) {
            System.out.println(_a[0]);
        } else {
            int l = 0, r = n - 1;
            while (l < r) {
                int mid = (l + r) / 2;
                if (check(b, mid)) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            System.out.println(_a[r]);
        }
    }

    public static boolean check(int[] b, int x) {
        int ans = 0;
        for (int i = 0; i <= b.length; i++) {
            if (b[i] >= x) {
                ans++;
            }
        }
        return ans >= b.length / 2;
    }
}

class BIT {
    int size;
    int[] tree;

    public BIT(int N) {
        size = N;
        tree = new int[N + 1];
    }

    public int _bitsum(int index) {
        int ret = 0;
        while (index > 0) {
            ret += tree[index];
            index -= index & -index;
        }
        return ret;
    }

    public int bitsum(int l, int r) {
        return _bitsum(r) - _bitsum(l - 1);
    }

    public void bitadd(int index, int x) {
        while (index <= size) {
            tree[index] += x;
            index += index & -index;
        }
    }
}
```

