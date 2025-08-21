

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        solve(N, M, Q, a, b, c, d);
    }

    static void solve(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        int res = 0;
        rec(new ArrayList<>(), N, M, Q, a, b, c, d, res);
        System.out.println(res);
    }

    static void rec(List<Integer> A, int N, int M, int Q, int[] a, int[] b, int[] c, int[] d, int res) {
        if (A.size() == N) {
            int ans = 0;
            for (int i = 0; i < Q; i++) {
                if (A.get(b[i] - 1) - A.get(a[i] - 1) == c[i]) {
                    ans += d[i];
                }
            }
            res = Math.max(res, ans);
            return;
        }
        int last_max = A.size() == 0 ? 1 : A.get(A.size() - 1);
        for (int i = last_max; i <= M; i++) {
            List<Integer> newA = new ArrayList<>(A);
            newA.add(i);
            rec(newA, N, M, Q, a, b, c, d, res);
        }
    }
}
```

## 2. 2019-09-25

### 2.1. 問題

[https://atcoder.jp/contests/abc142/tasks/abc142_d](https://atcoder.jp/contests/abc142/tasks/abc142_d)

### 2.2. 解答

```
import math
import sys

def solve(A: int, B: int):
    def gcd(a, b):
        if b == 0:
            return a
        return gcd(b, a % b)
    g = gcd(A, B)
    primes = []
    for i in range(2, int(math.sqrt(g)) + 1):
        if g % i == 0:
            primes.append(i)
            while g % i == 0:
                g //= i
    if g != 1:
        primes.append(g)
    print(len(set(primes)) + 1)
    return

def main():

    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    tokens = iterate_tokens()
    A = int(next(tokens))
    B = int(next(tokens))
    solve(A, B)
if __name__ == '__main__':
    main()
```

## 3. 2019-09-26

### 3.1. 問題

[https://atcoder.jp/contests/abc143/tasks/abc143_d](https://atcoder.jp/contests/abc143/tasks/abc143_d)

### 3.2. 解答

```
import sys

def solve(N: int, L: 'List[int]'):
    L.sort()
    res = 0
    for i in range(N - 2):
        for j in range(i + 1, N - 1):
            if L[i] + L[j] <= L[j]:
                break
            k = j + 1
            l = N - 1
            while k < l:
                m = (k + l) // 2
                if L[i] + L[j] > L[m]:
                    k = m + 1
                else:
                    l = m
            res += l - j
    print(res)
    return

def main():

    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    tokens = iterate_tokens()
    N = int(next(tokens))
    L = [int()] * N

    def loop_read_L(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        L[i] = int(next(tokens))
        loop_read_L(i + step, stop, step)
    loop_read_L(0, N, 1)
    solve(N, L)
if __name__ == '__main__':
    main()
```

## 4. 2019-09-27

### 4.1. 問題

[https://atcoder.jp/contests/abc144/tasks/abc144_d](https://atcoder.jp/contests/abc144/tasks/abc144_d)

### 4.2. 解答

```
import math
import sys

def solve(a: int, b: int, x: int):
    if a * a * b / 2 >= x:
        print(math.degrees(math.atan(2 * x / (a * a * b))))
    else:
        print(math.degrees(math.atan((a * a * b - 2 * x) / (a * a * a))))
    return

def main():

    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    tokens = iterate_tokens()
    a = int(next(tokens))
    b = int(next(tokens))
    x = int(next(tokens))
    solve(a, b, x)
if __name__ == '__main__':
    main()
```

## 5. 2019-09-28

### 5.1. 問題

[https://atcoder.jp/contests/abc145/tasks/abc145_d](https://atcoder.jp/contests/abc145/tasks/abc145_d)

### 5.2. 解答

```
import sys

MOD = 1000000007

def solve(X: int, Y: int):
    if (X + Y) % 3 != 0:
        print(0)
        return
    n = (2 * Y - X) // 3
    m = (2 * X - Y) // 3
    if n < 0 or m < 0:
        print(0)
        return
    res = 1
    for i in range(1, n + 1):
        res = res * (m + i) % MOD
    for i in range(1, n + 1):
        res = res * pow(i, MOD - 2, MOD) % MOD
    print(res)
    return

def main():

    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    tokens = iterate_tokens()
    X = int(next(tokens))
    Y = int(next(tokens))
    solve(X, Y)
if __name__ == '__main__':
    main()
```

## 6. 2019-09-29

### 6.1. 問題

[https://atcoder.jp/contests/abc146/tasks/abc146_d](https://atcoder.jp/contests/abc146/tasks/abc146_d)

### 6.2. 解答

```
import sys

def solve(N: int, AB: 'List[List[int]]'):
    edges = [[] for _ in range(N)]
    for a, b in AB:
        edges[a - 1].append(b - 1)
        edges[b - 1].append(a - 1)
    res = [0] * (N - 1)
    colors = set()
    for i in range(N):
        colors.update(res[j] for j in range(len(edges[i])) if j != i)
    color = 1
    for i in range(N):
        for j in range(len(edges[i])):
            if edges[i][j] < i:
                continue
            res[j] = color
            color += 1
            if color in colors:
                color += 1
    print(color - 1)
    for i in range(N - 1):
        print(res[i])
    return

def main():

    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    tokens = iterate_tokens()
    N = int(next(tokens))
    AB = [[int()] * 2 for _ in range(N - 1)]

    def loop_read_AB(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        AB[i][0] = int(next(tokens))
        AB[i][1] = int(next(tokens))
        loop_read_AB(i + step, stop, step)
    loop_read_AB(0, N - 1, 1)
    solve(N, AB)
if __name__ == '__main__':
    main()
```

## 7. 2019-09-30

### 7.1. 問題

[https://atcoder.jp/contests/abc147/tasks/abc147_d](https://atcoder.jp/contests/abc147/tasks/abc147_d)

### 7.2. 解答

```
import sys

MOD = 1000000007

def solve(N: int, A: 'List[int]'):
    res = 0
    for i in range(60):
        cnt = 0
        for a in A:
            if a >> i & 1:
                cnt += 1
        res += cnt * (N - cnt) * pow(2, i, MOD)
        res %= MOD
    print(res)
    return

def main():

    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    tokens = iterate_tokens()
    N = int(next(tokens))
    A = [int()] * N

    def loop_read_A(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        A[i] = int(next(tokens))
        loop_read_A(i + step, stop, step)
    loop_read_A(0, N, 1)
    solve(N, A)
if __name__ == '__main__':
    main()
```

## 8. 2019-10-01

### 8.1. 問題

[https://atcoder.jp/contests/abc148/tasks/abc148_d](https://atcoder.jp/contests/abc148/tasks/abc148_d)

### 8.2. 解答

```
import sys

def solve(N: int, A: 'List[int]'):
    res = 0
    for i in range(N):
        if A[i] == i + 1:
            res += 1
        else:
            break
    if res == N:
        print(-1)
    else:
        print(N - res)
    return

def main():

    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    tokens = iterate_tokens()
    N = int(next(tokens))
    A = [int()] * N

    def loop_read_A(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        A[i] = int(next(tokens))
        loop_read_A(i + step, stop, step)
    loop_read_A(0, N, 1)
    solve(N, A)
if __name__ == '__main__':
    main()
```

## 9. 2019-10-02

### 9.1. 問題

[https://atcoder.jp/contests/abc149/tasks/abc149_d](https://atcoder.jp/contests/abc149/tasks/abc149_d)

### 9.2. 解答

```
import sys

def solve(N: int, K: int, R: int, S: int, P: int, T: str):
    res = 0
    for i in range(K):
        res += R if T[i] == 'r' else 0
        res += S if T[i] == 's' else 0
        res += P if T[i] == 'p' else 0
    for i in range(K, N):
        if T[i] == T[i - K]:
            continue
        res += R if T[i] == 'r' else 0
        res += S if T[i] == 's' else 0
       
