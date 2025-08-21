Thought process:
1. The code defines a Binary Indexed Tree (BIT) class to handle range queries efficiently.
2. It reads input values for `n` and `a`, then processes the values to create a dictionary `d` for mapping unique values to indices.
3. The `check` function calculates the number of pairs that satisfy a condition based on the given `X`.
4. The binary search is performed to find the minimum value `X` that satisfies the condition.
5. The final output is the maximum value in `_a` that satisfies the condition.

```java
// Implement the BIT class for efficient range queries
class BIT {
    int size;
    int[] tree;
    int depth;

    BIT(int N) {
        size = N;
        tree = new int[N + 1];
        depth = Integer.numberOfTrailingZeros(N) + 1;
    }

    int _bitsum(int i) {
        int ret = 0;
        while (i > 0) {
            ret += tree[i];
            i &= ~(i & -i);
        }
        return ret;
    }

    int bitsum(int l, int r) {
        return _bitsum(r) - _bitsum(l);
    }

    void bitadd(int i, int x) {
        i += 1;
        while (i <= size) {
            tree[i] += x;
            i += i & -i;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] _a = new int[n * 2];
        for (int i = 0; i < n; i++) {
            _a[i] = a[i];
            _a[i + n] = 0;
        }
        Arrays.sort(_a);

        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < _a.length; i++) {
            d.put(_a[i], i);
        }

        for (int i = 0; i < n; i++) {
            a[i] = d.get(a[i]);
        }

        int[] t = new int[]{_a.length, 0};
        while (t[0] - t[1] > 1) {
            int mid = (t[0] + t[1]) / 2;
            if (check(a, n, m, mid)) {
                t[1] = mid;
            } else {
                t[0] = mid;
            }
        }

        System.out.println(_a[t[1]]);
    }

    static boolean check(int[] a, int n, int m, int X) {
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = (a[i] >= X ? 2 : -1) + b[i];
        }

        int c = Arrays.stream(b).min().getAsInt();
        for (int i = 0; i <= n; i++) {
            b[i] -= c;
        }

        BIT bit = new BIT(Arrays.stream(b).max().getAsInt() + 2);
        long ans = 0;
        for (int x : b) {
            ans += bit.bitsum(x + 1);
            bit.bitadd(x, 1);
        }

        return ans >= m;
    }
}
```
