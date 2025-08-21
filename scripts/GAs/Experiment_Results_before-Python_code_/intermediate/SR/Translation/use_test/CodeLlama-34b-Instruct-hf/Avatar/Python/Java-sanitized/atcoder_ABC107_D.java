import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC107_D {
    private int size;
    private int[] tree;
    private int depth;

    public BIT(int N) {
        size = N;
        tree = new int[N + 1];
        depth = (int) Math.ceil(Math.log(N) / Math.log(2));
    }

    private int _bitsum(int i) {
        int ret = 0;
        while (i > 0) {
            ret += tree[i];
            i -= i & -i;
        }
        return ret;
    }

    public int bitsum(int l, int r) {
        return _bitsum(r) - _bitsum(l - 1);
    }

    public void bitadd(int i, int x) {
        i++;
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
        int[] d = new int[n + 1];
        for (int i = 0; i < n; i++) {
            d[i] = a[i];
        }
        d[n] = 0;
        int[] _a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            _a[i] = d[i];
        }
        _a[n] = 0;
        BIT bit = new BIT(n);
        for (int i = 0; i < n; i++) {
            bit.bitadd(i, 1);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += bit.bitsum(i, i + 1);
        }
        if (ans >= m) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}