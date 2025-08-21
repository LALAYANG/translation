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

public class atcoder_ABC107_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = i;
        }
        Arrays.sort(d);
        int[] _a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            _a[i] = d[a[i]];
        }
        _a[n] = 0;
        BIT bit = new BIT(n);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += bit.bitsum(_a[i] + 1);
            bit.bitadd(_a[i], 1);
        }
        if (ans >= m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}