import java.util.*;

class BIT {
    int size;
    int[] tree;
    int depth;

    public BIT(int N) {
        this.size = N;
        this.tree = new int[N + 1];
        this.depth = Integer.toBinaryString(N).length();
    }

    private int _bitsum(int index) {
        int ret = 0;
        while (index > 0) {
            ret += this.tree[index];
            index -= index & -index;
        }
        return ret;
    }

    public int bitsum(int l, int r) {
        return _bitsum(r) - _bitsum(l - 1);
    }

    public void bitadd(int index, int x) {
        while (index <= this.size) {
            this.tree[index] += x;
            index += index & -index;
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
        Map<Integer, Integer> d = new HashMap<>();
        int[] _a = Arrays.stream(a).sorted().distinct().toArray();
        for (int i = 0; i < _a.length; i++) {
            d.put(_a[i], i + 1);
        }
        for (int i = 0; i < n; i++) {
            a[i] = d.get(a[i]);
        }
        int l = 0, r = _a.length;
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

    private static boolean check(int[] a, int X) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i + 1] = b[i] + ((a[i] >= X) ? 1 : -1);
        }
        int min = Arrays.stream(b).min().getAsInt();
        for (int i = 0; i < b.length; i++) {
            b[i] -= min;
        }
        BIT bit = new BIT(Arrays.stream(b).max().getAsInt() + 1);
        int ans = 0;
        for (int x : b) {
            ans += bit.bitsum(1, x);
            bit.bitadd(x, 1);
        }
        return ans >= m;
    }
}