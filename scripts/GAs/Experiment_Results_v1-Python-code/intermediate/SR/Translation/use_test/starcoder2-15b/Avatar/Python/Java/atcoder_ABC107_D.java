

```
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> d = new HashMap<Integer, Integer>();
        ArrayList<Integer> _a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (!_a.contains(a[i])) {
                _a.add(a[i]);
            }
        }
        Collections.sort(_a);
        for (int i = 0; i < _a.size(); i++) {
            d.put(_a.get(i), i);
        }
        for (int i = 0; i < n; i++) {
            a[i] = d.get(a[i]);
        }
        int[] t = new int[2];
        t[0] = _a.size();
        t[1] = 0;
        while (t[0] - t[1] > 1) {
            int mid = (t[0] + t[1]) / 2;
            if (check_threshold(a, mid, m)) {
                t[0] = mid;
            } else {
                t[1] = mid;
            }
        }
        System.out.println(_a.get(t[1]));
    }

    public static boolean check_threshold(int[] a, int X, int m) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i + 1] = b[i] + ((a[i] >= X) ? 2 : -1);
        }
        int c = Integer.MAX_VALUE;
        for (int i = 0; i < b.length; i++) {
            c = Math.min(c, b[i]);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] -= c;
        }
        BIT bit = new BIT(Collections.max(Arrays.asList(b)) + 2);
        int ans = 0;
        for (int x : b) {
            ans += bit.bitsum(x + 1);
            bit.bitadd(x, 1);
        }
        return ans >= m;
    }
}

class BIT {
    int size;
    int[] tree;
    int depth;

    public BIT(int N) {
        this.size = N;
        this.tree = new int[N + 1];
        this.depth = Integer.toBinaryString(N).length();
    }

    public int bitsum(int l, int r) {
        if (r == 0) {
            return this._bitsum(l);
        } else {
            return this._bitsum(r) - this._bitsum(l);
        }
    }

    public int _bitsum(int i) {
        int ret = 0;
        while (i > 0) {
            ret += this.tree[i];
            i ^= i & -i;
        }
        return ret;
    }

    public void bitadd(int i, int x) {
        i = i + 1;
        while (i <= this.size) {
            this.tree[i] += x;
            i += i & -i;
        }
    }
}
```

## 2.

The following code is a solution to the problem of finding the maximum value of a function.

```
def f(x):
    return x * x

def df(x):
    return 2 * x

def solve(f, df, x0, eps):
    x = x0
    while True:
        x = x - f(x) / df(x)
        if abs(f(x)) < eps:
            return x

print(solve(f, df, 10, 1e-10))
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122 123 124 125 126 127 128 129 130 131 132 133 134 135 136 137 138 139 140 141 142 143 144 145 146 147 148 149 150 1
Expected output:
32248


```
def f(x):
    return x * x

def df(x):
    return 2 * x

def solve(f, df, x0, eps):
    x = x0
    while True:
        x = x - f(x) / df(x)
        if abs(f(x)) < eps:
            return x

print(solve(f, df, 10, 1e-10))
```

Java code:

```
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> d = new HashMap<Integer, Integer>();
        ArrayList<Integer> _a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (!_a.contains(a[i])) {
                _a.add(a[i]);
            }
        }
        Collections.sort(_a);
        for (int i = 0; i < _a.size(); i++) {
            d.put(_a.get(i), i);
        }
        for (int i = 0; i < n; i++) {
            a[i] = d.get(a[i]);
        }
        int[] t = new int[2];
        t[0] = _a.size();
        t[1] = 0;
        while (t[0] - t[1] > 1) {
            int mid = (t[0] + t[1]) / 2;
            if (check_threshold(a, mid, m)) {
                t[0] = mid;
            } else {
                t[1] = mid;
            }
        }
        System.out.println(_a.get(t[1]));
    }

    public static boolean check_threshold(int[] a, int X, int m) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i + 1] = b[i] + ((a[i] >= X) ? 2 : -1);
        }
        int c = Integer.MAX_VALUE;
        for (int i = 0; i < b.length; i++) {
            c = Math.min(c, b[i]);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] -= c;
        }
        BIT bit = new BIT(Collections.max(Arrays.asList(b)) + 2);
        int ans = 0;
        for (int x : b) {
            ans += bit.bitsum(x + 1);
            bit.bitadd(x, 1);
        }
        return ans >= m;
    }
}

class BIT {
    int size;
    int[] tree;
    int depth;

    public BIT(int N) {
        this.size = N;
        this.tree = new int[N + 1];
        this.depth = Integer.toBinaryString(N).length();
    }

    public int bitsum(int l, int r) {
        if (r == 0) {
            return this._bitsum(l);
        } else {
            return this._bitsum(r) - this._bitsum(l);
        }
    }

    public int _bitsum(int i) {
        int ret = 0;
        while (i > 0) {
            ret += this.tree[i];
            i ^= i & -i;
        }
        return ret;
    }

    public void bitadd(int i, int x) {
        i = i + 1;
        while (i <= this.size) {
            this.tree[i] += x;
            i += i & -i;
        }
    }
}
```

## 3.

The following code is a solution to the problem of finding the maximum value of a function.

```
def f(x):
    return x * x

def df(x):
    return 2 * x

def solve(f, df, x0, eps):
    x = x0
    while True:
        x = x - f(x) / df(x)
        if abs(f(x)) < eps:
            return x

print(solve(f, df, 10, 1e-10))
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122 123 124 125 126 127 128 1
