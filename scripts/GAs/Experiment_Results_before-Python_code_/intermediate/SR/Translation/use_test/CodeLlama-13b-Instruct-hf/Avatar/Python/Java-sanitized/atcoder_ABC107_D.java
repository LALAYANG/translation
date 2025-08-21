import java.util.Scanner;

class BIT {
    private int size;
    private int[] tree;
    private int depth;

    public BIT(int N) {
        this.size = N;
        this.tree = new int[N + 1];
        this.depth = (int) Math.floor(Math.log(N) / Math.log(2)) + 1;
    }

    private int _bitsum(int i) {
        int ret = 0;
        while (i > 0) {
            ret += tree[i];
            i ^= i & -i;
        }
        return ret;
    }

    public int bitsum(int l, int r) {
        if (r == null) {
            return _bitsum(l);
        } else {
            return _bitsum(r) - _bitsum(l);
        }
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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] _a = new int[n];
        for (int i = 0; i < n; i++) {
            _a[i] = a[i];
        }
        Arrays.sort(_a);
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[_a[i]] = i;
        }
        for (int i = 0; i < n; i++) {
            a[i] = d[a[i]];
        }
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = (a[i] >= X) ? 2 : -1;
        }
        for (int i = 0; i < n; i++) {
            b[i + 1] += b[i];
        }
        int c = Arrays.stream(b).min().getAsInt();
        for (int i = 0; i < n; i++) {
            b[i] -= c;
        }
        BIT bit = new BIT(Math.max(b) + 2);
        int ans = 0;
        for (int x : b) {
            ans += bit.bitsum(x + 1);
            bit.bitadd(x, 1);
        }
        System.out.println(ans >= m);
    }
}