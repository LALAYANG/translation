import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

class BIT {
    int size;
    int[] tree;
    int depth;

    public BIT(int N) {
        size = N;
        tree = new int[N + 1];
        depth = (int) (Math.log(N) / Math.log(2)) + 1;
    }

    int _bitsum(int i) {
        int ret = 0;
        while (i > 0) {
            ret += tree[i];
            i -= (i & -i);
        }
        return ret;
    }

    int bitsum(int l, int r) {
        if (r == 0) {
            return _bitsum(l);
        } else {
            return _bitsum(r) - _bitsum(l);
        }
    }

    void bitadd(int i, int x) {
        i += 1;
        while (i <= size) {
            tree[i] += x;
            i += (i & -i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = (n * (n + 1)) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(a));
        int[] d = new int[set.size()];
        int i = 0;
        for (int x : set) {
            d[i++] = x;
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = d[Arrays.binarySearch(d, a[i])];
        }
        BIT bit = new BIT(set.size());
        int ans = 0;
        for (int x : b) {
            ans += bit.bitsum(x + 1);
            bit.bitadd(x + 1, 1);
        }
        if (ans >= m) {
            System.out.println(set.first());
        } else {
            System.out.println(set.last());
        }
    }
}