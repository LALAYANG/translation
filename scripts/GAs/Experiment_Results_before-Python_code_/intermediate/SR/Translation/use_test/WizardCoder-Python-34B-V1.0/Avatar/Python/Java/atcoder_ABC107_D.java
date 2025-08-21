```java
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
```

Test input:
100000
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100 1
Expected output:
32248
``` 
