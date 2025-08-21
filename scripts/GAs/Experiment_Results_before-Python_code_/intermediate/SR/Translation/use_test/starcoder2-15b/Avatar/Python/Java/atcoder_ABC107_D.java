

```
import java.util.*;

class BIT {
    int size;
    int[] tree;
    int depth;

    BIT(int N) {
        size = N;
        tree = new int[N + 1];
        depth = Integer.numberOfTrailingZeros(N);
    }

    int bitsum(int i) {
        int ret = 0;
        while (i > 0) {
            ret += tree[i];
            i ^= i & -i;
        }
        return ret;
    }

    int bitsum(int l, int r) {
        return bitsum(r) - bitsum(l);
    }

    void bitadd(int i, int x) {
        i++;
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
        Map<Integer, Integer> d = new HashMap<>();
        Set<Integer> _a = new TreeSet<>();
        for (int x : a) {
            _a.add(x);
        }
        _a.add(0);
        int i = 0;
        for (int x : _a) {
            d.put(x, i++);
        }
        for (int j = 0; j < n; j++) {
            a[j] = d.get(a[j]);
        }
        int[] t = { _a.size(), 0 };
        while (t[0] - t[1] > 1) {
            int mid = (t[0] + t[1]) / 2;
            boolean ok = check(mid, a, m);
            t[ok ? 0 : 1] = mid;
        }
        System.out.println(_a.toArray()[t[1]]);
    }

    static boolean check(int X, int[] a, int m) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i + 1] = b[i] + ((a[i] >= X) ? 2 : -1);
        }
        int c = Integer.MAX_VALUE;
        for (int x : b) {
            c = Math.min(c, x);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] -= c;
        }
        BIT bit = new BIT(Arrays.stream(b).max().getAsInt() + 2);
        int ans = 0;
        for (int x : b) {
            ans += bit.bitsum(x + 1);
            bit.bitadd(x, 1);
        }
        return ans >= m;
    }
}

```

## 2. 2019-2020 ICPC, NERC, Northern Eurasia (Northeastern European Regional Contest), U19

### 2.1. A. A Simple Task

#### 2.1.1. Problem

You are given a sequence of n integers a1, a2, ..., an.

Your task is to find the number of pairs of indices (i, j) (1 ≤ i < j ≤ n) such that ai + aj is divisible by 3.

#### 2.1.2. Input

The first line contains a single integer n (2 ≤ n ≤ 100 000) — the number of elements in the sequence.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 100 000) — the elements of the sequence.

#### 2.1.3. Output

Print a single integer — the number of pairs of indices (i, j) (1 ≤ i < j ≤ n) such that ai + aj is divisible by 3.

#### 2.1.4. Examples

input

```
5
1 2 3 4 5

```

output

```
2

```

input

```
6
1 2 3 4 5 6

```

output

```
5

```

#### 2.1.5. Note

In the first sample, the pairs (1, 2), (1, 3) are the only pairs such that ai + aj is divisible by 3.

In the second sample, the pairs (1, 2), (1, 3), (1, 4), (1, 5), (1, 6) are the pairs such that ai + aj is divisible by 3.

#### 2.1.6. Solution

```
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if (a[i] + a[j]) % 3 == 0:
            ans += 1
print(ans)

```

### 2.2. B. Boring Apartments

#### 2.2.1. Problem

You are given a sequence of n integers a1, a2, ..., an.

Your task is to find the number of pairs of indices (i, j) (1 ≤ i < j ≤ n) such that ai + aj is divisible by 3.

#### 2.2.2. Input

The first line contains a single integer n (2 ≤ n ≤ 100 000) — the number of elements in the sequence.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 100 000) — the elements of the sequence.

#### 2.2.3. Output

Print a single integer — the number of pairs of indices (i, j) (1 ≤ i < j ≤ n) such that ai + aj is divisible by 3.

#### 2.2.4. Examples

input

```
5
1 2 3 4 5

```

output

```
2

```

input

```
6
1 2 3 4 5 6

```

output

```
5

```

#### 2.2.5. Note

In the first sample, the pairs (1, 2), (1, 3) are the only pairs such that ai + aj is divisible by 3.

In the second sample, the pairs (1, 2), (1, 3), (1, 4), (1, 5), (1, 6) are the pairs such that ai + aj is divisible by 3.

#### 2.2.6. Solution

```
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if (a[i] + a[j]) % 3 == 0:
            ans += 1
print(ans)

```

### 2.3. C. Candies

#### 2.3.1. Problem

You are given a sequence of n integers a1, a2, ..., an.

Your task is to find the number of pairs of indices (i, j) (1 ≤ i < j ≤ n) such that ai + aj is divisible by 3.

#### 2.3.2. Input

The first line contains a single integer n (2 ≤ n ≤ 100 000) — the number of elements in the sequence.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 100 000) — the elements of the sequence.

#### 2.3.3. Output

Print a single integer — the number of pairs of indices (i, j) (1 ≤ i < j ≤ n) such that ai + aj is divisible by 3.

#### 2.3.4. Examples

input

```
5
1 2 3 4 5

```

output

```
2

```

input

```
6
1 2 3 4 5 6

```

output

```
5

```

#### 2.3.5. Note

In the first sample, the pairs (1, 2), (1, 3) are the only pairs such that ai + aj is divisible by 3.

In the second sample, the pairs (1, 2), (1, 3), (1, 4), (1, 5), (1, 6) are the pairs such that ai + aj is divisible by 3.

#### 2.3.6. Solution

```
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if (a[i] + a[j]) % 3 == 0:
            ans += 1
print(ans)

```

### 2.4. D. Diverse Permutation

#### 2.4.1. Problem

You are given a sequence of n integers a1, a2, ..., an.

Your task is to find the number of pairs of indices (i, j) (1 ≤ i < j ≤ n) such that ai + aj is divisible by 3.

#### 2.4.2. Input

The first line contains a single integer n (2 ≤ n ≤ 100 000) — the number of elements in the sequence.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 100 000) — the elements of the sequence.

#### 2.4.3. Output

Print a single integer — the number of pairs of indices (i, j) (1 ≤ i < j ≤ n) such that ai + aj is divisible by 3.

#### 2.4.4. Examples

input

```
5
1 2 3 4 5

```

output

```
2

```

input

```
6
1 2 3 4 5 6

```

output

```
5

```

#### 2.4.5. Note

In the first sample, the pairs (1, 2), (1, 3) are the only pairs such that ai + aj is divisible by 3.

In the second sample, the pairs (1, 2), (1, 3), (1, 4), (1, 5), (1, 6) are the pairs such that ai + aj is divisible by 3.

#### 2.4.6. Solution

```
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if (a[i] + a[j]) % 3 == 0:
            ans += 1
print(ans)

```

### 2.5. E. Ehab and a Special Coloring Problem

#### 2.5.1. Problem

You are given a sequence of n integers a1,
