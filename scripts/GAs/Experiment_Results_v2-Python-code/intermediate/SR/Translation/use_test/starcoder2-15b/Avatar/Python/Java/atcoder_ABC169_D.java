

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static int innerCheckOne = 559;
    static int outerCheckOne = 755;
    static int innerCheckTwo = 488;
    static int outerCheckTwo = 925;
    static int MOD = 1000000007;
    static int INF = 999999999;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        if (innerCheckOne & outerCheckOne) {
            if (innerCheckTwo & outerCheckTwo) {
                if (n == 1) {
                    System.out.println(0);
                    return;
                }
            }
        }
        List<Integer> fac = primeFactorize(n);
        Map<Integer, Integer> fac_ = new HashMap<>();
        for (int i = 0; i < fac.size(); i++) {
            int p = fac.get(i);
            if (fac_.containsKey(p)) {
                fac_.put(p, fac_.get(p) + 1);
            } else {
                fac_.put(p, 1);
            }
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : fac_.entrySet()) {
            int p = entry.getKey();
            int e = entry.getValue();
            int x = e;
            for (int i = 1; i < 99999999; i++) {
                if (x >= i) {
                    x -= i;
                    ans += 1;
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    public static List<Integer> primeFactorize(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        while (n % 2 == 0) {
            primeFactors.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                primeFactors.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            primeFactors.add(n);
        }
        return primeFactors;
    }
}
```

## 2.

The following code is written in Python.

```
import sys
sys.setrecursionlimit(10 ** 7)

def readInput():
    return sys.stdin.readline().strip()

def get_nums_l():
    return [int(s) for s in readInput().split(' ')]

def get_nums_n(n):
    return [int(readInput()) for _ in range(n)]

def get_all_int():
    return map(int, open(0).read().split())

def rangeI(it, l, r):
    for (i, e) in enumerate(it):
        if l <= i < r:
            yield e
        elif l >= r:
            break

def log(*args):
    print('DEBUG:', *args, file=sys.stderr)
INF = 999999999999999999999999
MOD = 10 ** 9 + 7
n = int(readInput())
a = get_nums_n(n)
b = get_nums_n(n)
c = get_nums_n(n)
d = get_nums_n(n)

def solve(a, b, c, d):
    ans = 0
    for i in range(n):
        for j in range(n):
            for k in range(n):
                for l in range(n):
                    if a[i] + b[j] + c[k] + d[l] == 0:
                        ans += 1
    return ans
print(solve(a, b, c, d))
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
1 2 3 4
-1 0 2 -3
-2 0 2 2
2 -2 2 2

Expected output:
2


```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static int MOD = 1000000007;
    static int INF = 999999999;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int[] b = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        int[] c = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(st.nextToken());
        }
        int[] d = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            d[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solve(a, b, c, d));
    }

    public static int solve(int[] a, int[] b, int[] c, int[] d) {
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < c.length; k++) {
                    for (int l = 0; l < d.length; l++) {
                        if (a[i] + b[j] + c[k] + d[l] == 0) {
                            ans += 1;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
```

## 3.

The following code is written in Python.

```
import sys
sys.setrecursionlimit(10 ** 7)

def readInput():
    return sys.stdin.readline().strip()

def get_nums_l():
    return [int(s) for s in readInput().split(' ')]

def get_nums_n(n):
    return [int(readInput()) for _ in range(n)]

def get_all_int():
    return map(int, open(0).read().split())

def rangeI(it, l, r):
    for (i, e) in enumerate(it):
        if l <= i < r:
            yield e
        elif l >= r:
            break

def log(*args):
    print('DEBUG:', *args, file=sys.stderr)
INF = 999999999999999999999999
MOD = 10 ** 9 + 7
n = int(readInput())
a = get_nums_n(n)

def solve(a):
    ans = 0
    for i in range(n):
        for j in range(i + 1, n):
            for k in range(j + 1, n):
                if a[i] == a[j] + a[k]:
                    ans += 1
    return ans
print(solve(a))
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 3 5 7 9

Expected output:
1


```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static int MOD = 1000000007;
    static int INF = 999999999;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solve(a));
    }

    public static int solve(int[] a) {
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] == a[j] + a[k]) {
                        ans += 1;
                    }
                }
            }
        }
        return ans;
    }
}
```

## 4.

The following code is written in Python.

```
import sys
sys.setrecursionlimit(10 ** 7)

def readInput():
    return sys.stdin.readline().strip()

def get_nums_l():
    return [int(s) for s in readInput().split(' ')]

def get_nums_n(n):
    return [int(readInput()) for _ in range(n)]

def get_all_int():
    return map(int, open(0).read().split())

def rangeI(it, l, r):
    for (i, e) in enumerate(it):
        if l <= i < r:
            yield e
        elif l >= r:
            break

def log(*args):
    print('DEBUG:', *args, file=sys.stderr)
INF = 999999999999999999999999
MOD = 10 ** 9 + 7
n = int(readInput())
a = get_nums_n(n)

def solve(a):
    ans = 0
    for i in range(n):
        for j in range(i + 1, n):
            for k in range(j + 1, n):
                for l in range(k + 1, n):
                    if a[i] + a[j] + a[k] == a[l]:
                        ans += 1
    return ans
print(solve(a))
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 3 5 7 9

Expected output:
1


```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static int MOD = 1000000007;
    static int INF = 999999999;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solve(a));
    }

    public static int solve(int[] a) {
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    for (int l = k + 1; l < a.length; l++) {
                        if (a[i] + a[j] + a[k] == a[l]) {
                            ans += 1;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
```
/2020-04-20/README.md
# 2020-04-20

## 1.

The following code is written in Python.

```
import sys
sys.setrecursionlimit(10 ** 7)

def readInput():
    return sys.stdin.readline().strip()

def get_nums_l():
    return [int(s) for s in readInput().split(' ')]

def get_nums_n(n):
    return [int(readInput()) for _ in range(n)]

def get_all_int():
    return map(int, open(0).read().split())

def rangeI(it, l, r):
    for (i, e) in enumerate(it):
        if l <= i < r:
            yield e
        elif l >= r:
            break

def log(*args):
    print('DEBUG:', *args, file=sys.stderr)
INF = 999999999999999999999999
MOD = 10 ** 9 + 7
n = int(readInput())
a = get_nums_n(n)

def solve(a):
    ans = 0
    for i in range(n):
        for j in range(i + 1, n):
            if a[i] == a[j]:
                ans += 1
    return ans
print(solve(a))
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
0


```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static int MOD = 1000000007;
    static int INF = 999999999;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String
