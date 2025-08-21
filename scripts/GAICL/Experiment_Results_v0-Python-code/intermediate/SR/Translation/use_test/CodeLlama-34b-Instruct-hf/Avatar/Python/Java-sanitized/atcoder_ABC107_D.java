import java.util.Scanner;

public class atcoder_ABC107_D {
    private int size;
    private int[] tree;
    private int depth;

    public BIT(int N) {
        this.size = N;
        this.tree = new int[N + 1];
        this.depth = N.bitLength();
    }

    public int _bitsum(int index) {
        int ret = 0;
        while (index > 0) {
            ret += tree[index];
            index ^= index & -index;
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

    public void bitadd(int index, int x) {
        index = index + 1;
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
        int[] d = new int[n + 1];
        for (int i = 0; i < n; i++) {
            d[i] = i;
        }
        int[] _a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            _a[i] = a[i];
        }
        BIT bit = new BIT(n);
        for (int i = 0; i < n; i++) {
            bit.bitadd(i, 1);
        }
        int t = 0;
        while (t < n) {
            int mid = (t + n) / 2;
            if (bit.bitsum(mid) >= m) {
                t = mid;
            } else {
                t = n;
            }
        }
        System.out.println(_a[t]);
    }
}