import java.util.*;

public class atcoder_ABC107_D {
    static class BIT {
        int size;
        int[] tree;
        int depth;

        public BIT(int N) {
            this.size = N;
            this.tree = new int[N + 1];
            this.depth = Integer.toBinaryString(N).length();
        }

        private int _bitsum(int i) {
            int ret = 0;
            while (i > 0) {
                ret += this.tree[i];
                i ^= i & -i;
            }
            return ret;
        }

        public int bitsum(int l, int r) {
            return this._bitsum(r) - this._bitsum(l);
        }

        public void bitadd(int i, int x) {
            i += 1;
            while (i <= this.size) {
                this.tree[i] += x;
                i += i & -i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = b[i] + a[i];
        }
        int l = 0, r = n;
        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (check(b, mid, m)) {
                r = mid;
            } else {
                l = mid;
            }
        }
        System.out.println(a[l]);
    }

    private static boolean check(int[] b, int mid, int m) {
        BIT bit = new BIT(b.length);
        int ans = 0;
        for (int x : b) {
            ans += bit.bitsum(x + 1, b.length);
            bit.bitadd(x, 1);
        }
        return ans >= m;
    }
}