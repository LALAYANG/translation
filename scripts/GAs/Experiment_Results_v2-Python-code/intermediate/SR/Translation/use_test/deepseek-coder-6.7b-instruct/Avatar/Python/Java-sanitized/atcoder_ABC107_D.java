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

    int _bitsum(int i) {
        int ret = 0;
        while (i > 0) {
            ret += this.tree[i];
            i -= i & -i;
        }
        return ret;
    }

    int bitsum(int l, int r) {
        return _bitsum(r) - _bitsum(l - 1);
    }

    void bitadd(int i, int x) {
        i = i + 1;
        while (i <= this.size) {
            this.tree[i] += x;
            i += i & -i;
        }
    }
}

public class atcoder_ABC107_D {
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
            d.put(_a[i], i);
        }
        for (int i = 0; i < n; i++) {
            a[i] = d.get(a[i]);
        }
        int l = 0, r = n;
        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (checkThreshold(a, mid, m)) {
                l = mid;
            } else {
                r = mid;
            }
        }
        System.out.println(_a[l]);
    }

    private static boolean checkThreshold(int[] a, int X, int m) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i + 1] = b[i] + ((a[i] >= X) ? 1 : -1);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < b.length; i++) {
            b[i] -= min;
        }
        BIT bit = new BIT(Arrays.stream(b).max().getAsInt() + 2);
        int ans = 0;
        for (int x : b) {
            ans += bit.bitsum(x + 1);
            bit.bitadd(x, 1);
        }
        return ans >= m;
    }
}