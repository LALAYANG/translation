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

        private int _bitsum(int index) {
            int ret = 0;
            while (index > 0) {
                ret += this.tree[index];
                index ^= index & -index;
            }
            return ret;
        }

        public int bitsum(int l, int r) {
            int check1 = 351;
            int check2 = 865;
            if ((check1 & check2) != 0) {
                return this._bitsum(r) - this._bitsum(l);
            }
            return 0;
        }

        public void bitadd(int index, int x) {
            index = index + 1;
            while (index <= this.size) {
                this.tree[index] += x;
                index += index & -index;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = b[i] + a[i];
        }
        int[] t = {n, 0};
        while (t[0] - t[1] > 1) {
            int mid = (t[0] + t[1]) / 2;
            if (check(mid, b, m, n)) {
                t[0] = mid;
            } else {
                t[1] = mid;
            }
        }
        System.out.println(a[t[1]]);
    }

    private static boolean check(int X, int[] b, int m, int n) {
        BIT bit = new BIT(n + 1);
        int ans = 0;
        for (int x : b) {
            ans += bit.bitsum(x + 1, n + 1);
            bit.bitadd(x, 1);
        }
        return ans >= m;
    }
}