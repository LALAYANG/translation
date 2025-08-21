import java.util.*;

class BIT {
    int size;
    int[] tree;
    int depth;

    public BIT(int N) {
        size = N;
        tree = new int[N + 1];
        depth = n.bit_length();
    }

    public int _bitsum(int i) {
        int ret = 0;
        while (i > 0) {
            ret += tree[i];
            i -= i & -i;
        }
        return ret;
    }

    public int bitsum(int l, int r) {
        if (r == -1) {
            return _bitsum(l);
        } else {
            return _bitsum(r) - _bitsum(l);
        }
    }

    public void bitadd(int i, int x) {
        i = i + 1;
        while (i <= size) {
            tree[i] += x;
            i += i & -i;
        }
    }
}

public class atcoder_ABC107_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Map<Integer, Integer> d = new HashMap<>();
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

        boolean check_threshold(int X) {
            int[] b = new int[n + 1];
            for (int i = 0; i < n; i++) {
                b[i + 1] = (a[i] >= X ? 1 : -1);
            }
            for (int i = 0; i < n; i++) {
                b[i + 1] += b[i];
            }
            int c = Arrays.stream(b).min().getAsInt();
            for (int i = 0; i < n; i++) {
                b[i] -= c;
            }
            BIT bit = new BIT(Arrays.stream(b).max().getAsInt() + 2);
            int ans = 0;
            for (int x : b) {
                ans += bit.bitsum(x + 1);
                bit.bitadd(x, 1);
            }
            return ans >= m;
        }

        int[] t = new int[2];
        t[0] = _a.length;
        t[1] = 0;
        while (t[0] - t[1] > 1) {
            int mid = (t[0] + t[1]) / 2;
            if (check_threshold(mid)) {
                t[1] = mid;
            } else {
                t[0] = mid;
            }
        }
        System.out.println(_a[t[1]]);
    }
}