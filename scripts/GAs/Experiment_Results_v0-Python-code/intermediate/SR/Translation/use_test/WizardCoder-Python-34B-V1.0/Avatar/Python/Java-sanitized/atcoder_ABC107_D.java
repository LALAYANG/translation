import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC107_D {
    private int size;
    private int[] tree;
    private int depth;

    public BIT(int N) {
        this.size = N;
        this.tree = new int[N + 1];
        this.depth = (int) Math.log(N) + 1;
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
        index += 1;
        while (index <= this.size) {
            this.tree[index] += x;
            index += index & -index;
        }
    }

    public static boolean check(int[] a, int X) {
        int[] b = new int[a.length + 1];
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            b[i + 1] = (a[i] >= X ? 2 : 1) - 1;
            c = Math.min(c, b[i + 1]);
        }
        b[0] = -c;
        Arrays.sort(b);
        int ans = 0;
        BIT bit = new BIT(b.length);
        for (int x : b) {
            ans += bit.bitsum(x + 1);
            bit.bitadd(x, 1);
        }
        return ans >= m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Map<Integer, Integer> d = new HashMap<>();
        int[] _a = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (!d.containsKey(a[i])) {
                d.put(a[i], d.size());
            }
            _a[i] = d.get(a[i]);
        }
        int[] a_sorted = Arrays.stream(_a).boxed().sorted().mapToInt(Integer::intValue).toArray();
        int[] t = {a_sorted.length, 0};
        while (t[0] - t[1] > 1) {
            int mid = (t[0] + t[1]) / 2;
            if (check(a_sorted, mid)) {
                t[0] = mid;
            } else {
                t[1] = mid;
            }
        }
        System.out.println(a_sorted[t[1]]);
    }
}