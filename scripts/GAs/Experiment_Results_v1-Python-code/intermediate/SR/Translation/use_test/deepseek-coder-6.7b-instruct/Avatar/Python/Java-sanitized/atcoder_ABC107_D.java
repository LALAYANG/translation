import java.util.*;

class BIT {
    int size;
    int[] tree;
    int depth;

    BIT(int N) {
        size = N;
        tree = new int[N + 1];
        depth = Integer.toBinaryString(N).length();
    }

    int _bitsum(int i) {
        int ret = 0;
        while (i > 0) {
            ret += tree[i];
            i -= i & -i;
        }
        return ret;
    }

    int bitsum(int l, int r) {
        return _bitsum(r) - _bitsum(l);
    }

    void bitadd(int i, int x) {
        i = i + 1;
        while (i <= size) {
            tree[i] += x;
            i += i & -i;
        }
    }
}

public class atcoder_ABC107_D {
    static int n, m;
    static int[] a;
    static Map<Integer, Integer> d = new HashMap<>();

    static boolean check_threshold(int X) {
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = b[i] + ((a[i] >= X) ? 2 : -1);
        }
        int min = Arrays.stream(b).min().getAsInt();
        for (int i = 0; i <= n; i++) {
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = n * (n + 1) / 4;
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        List<Integer> _a = new ArrayList<>(new HashSet<>(Arrays.asList(a)));
        Collections.sort(_a);
        for (int i = 0; i < _a.size(); i++) {
            d.put(_a.get(i), i);
        }
        for (int i = 0; i < n; i++) {
            a[i] = d.get(a[i]);
        }
        int l = 0, r = _a.size();
        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (check_threshold(mid)) {
                l = mid;
            } else {
                r = mid;
            }
        }
        System.out.println(_a.get(l));
    }
}