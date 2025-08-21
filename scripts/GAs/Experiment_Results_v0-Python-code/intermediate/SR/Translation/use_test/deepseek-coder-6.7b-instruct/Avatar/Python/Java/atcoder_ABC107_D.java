```java
import java.util.*;

class BIT {
    int size;
    int[] tree;
    int depth;

    BIT(int N) {
        this.size = N;
        this.tree = new int[N + 1];
        this.depth = Integer.toBinaryString(N).length();
    }

    int _bitsum(int index) {
        int ret = 0;
        while (index > 0) {
            ret += this.tree[index];
            index -= index & -index;
        }
        return ret;
    }

    int bitsum(int l, int r) {
        return _bitsum(r) - _bitsum(l - 1);
    }

    void bitadd(int index, int x) {
        while (index <= this.size) {
            this.tree[index] += x;
            index += index & -index;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> d = new HashMap<>();
        int[] _a = new int[n];
        for (int i = 0; i < n; i++) {
            _a[i] = a[i];
        }
        Arrays.sort(_a);
        for (int i = 0; i < n; i++) {
            d.put(_a[i], i + 1);
        }
        for (int i = 0; i < n; i++) {
            a[i] = d.get(a[i]);
        }
        int l = 0, r = n + 1;
        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (check(a, mid)) {
                l = mid;
            } else {
                r = mid;
            }
        }
        System.out.println(_a[l]);
    }

    static boolean check(int[] a, int X) {
        int n = a.length;
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = (a[i] >= X ? 1 : -1);
        }
        for (int i = 1; i <= n; i++) {
            b[i] += b[i - 1];
        }
        int min = Arrays.stream(b).min().getAsInt();
        for (int i = 0; i <= n; i++) {
            b[i] -= min;
        }
        BIT bit = new BIT(Arrays.stream(b).max().getAsInt() + 1);
        int ans = 0;
        for (int x : b) {
            ans += bit.bitsum(x, Integer.MAX_VALUE);
            bit.bitadd(x, 1);
        }
        return ans >= m;
    }
}
```

