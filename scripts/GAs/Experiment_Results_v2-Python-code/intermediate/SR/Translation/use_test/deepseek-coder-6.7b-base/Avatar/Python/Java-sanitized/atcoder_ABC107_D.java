import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class atcoder_ABC107_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
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
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = (a[i] >= n / 2) ? 1 : -1;
        }
        for (int i = 0; i < n; i++) {
            b[i + 1] += b[i];
        }
        int c = Arrays.stream(b).min().getAsInt();
        for (int i = 0; i <= n; i++) {
            b[i] -= c;
        }
        BIT bit = new BIT(Arrays.stream(b).max().getAsInt() + 2);
        int ans = 0;
        for (int x : b) {
            ans += bit.bitsum(x + 1);
            bit.bitadd(x, 1);
        }
        if (ans >= m) {
            System.out.println(_a[n / 2]);
        } else {
            System.out.println(_a[n / 2 + 1]);
        }
    }
}

class BIT {
    int size;
    int[] tree;
    int depth;

    public BIT(int N) {
        size = N;
        tree = new int[N + 1];
        depth = (int) (Math.log(N) / Math.log(2)) + 1;
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
        return _bitsum(r) - _bitsum(l);
    }

    public void bitadd(int i, int x) {
        i = i + 1;
        while (i <= size) {
            tree[i] += x;
            i += i & -i;
        }
    }
}