
[JAV]

```java

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        long ll = -1000000000000000000L;
        long rr = 1000000000000000000L;
        while (ll + 1 < rr) {
            long x = (ll + rr) / 2;
            long tot = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] < 0) {
                    int l = -1;
                    int r = N;
                    while (l + 1 < r) {
                        int c = (l + r) / 2;
                        if (A[i] * A[c] < x) {
                            r = c;
                        } else {
                            l = c;
                        }
                    }
                    tot += N - r;
                } else {
                    int l = -1;
                    int r = N;
                    while (l + 1 < r) {
                        int c = (l + r) / 2;
                        if (A[i] * A[c] < x) {
                            l = c;
                        } else {
                            r = c;
                        }
                    }
                    tot += r;
                }
                if (A[i] * A[i] < x) {
                    tot -= 1;
                }
            }
            tot /= 2;
            if (tot < K) {
                ll = x;
            } else {
                rr = x;
            }
        }
        System.out.println(ll);
    }
}

```

[/JAV]

[PY]

```python

import sys

N, K = map(int, sys.stdin.readline().split())
A = list(map(int, sys.stdin.readline().split()))
A.sort()
ll = -10 ** 18 - 1
rr = 10 ** 18 + 1
while ll + 1 < rr:
    x = (ll + rr) // 2
    tot = 0
    for i in range(N):
        if A[i] < 0:
            l = -1
            r = N
            while l + 1 < r:
                c = (l + r) // 2
                if A[i] * A[c] < x:
                    r = c
                else:
                    l = c
            tot += N - r
        else:
            l = -1
            r = N
            while l + 1 < r:
                c = (l + r) // 2
                if A[i] * A[c] < x:
                    l = c
                else:
                    r = c
            tot += r
        if A[i] * A[i] < x:
            tot -= 1
    tot //= 2
    if tot < K:
        ll = x
    else:
        rr = x
print(ll)


```

[/PY]

[C++]

```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    int N, K;
    cin >> N >> K;
    vector<int> A(N);
    for (int i = 0; i < N; i++) {
        cin >> A[i];
    }
    sort(A.begin(), A.end());
    long long ll = -1000000000000000000LL;
    long long rr = 1000000000000000000LL;
    while (ll + 1 < rr) {
        long long x = (ll + rr) / 2;
        long long tot = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] < 0) {
                int l = -1;
                int r = N;
                while (l + 1 < r) {
                    int c = (l + r) / 2;
                    if (A[i] * A[c] < x) {
                        r = c;
                    } else {
                        l = c;
                    }
                }
                tot += N - r;
            } else {
                int l = -1;
                int r = N;
                while (l + 1 < r) {
                    int c = (l + r) / 2;
                    if (A[i] * A[c] < x) {
                        l = c;
                    } else {
                        r = c;
                    }
                }
                tot += r;
            }
            if (A[i] * A[i] < x) {
                tot -= 1;
            }
        }
        tot /= 2;
        if (tot < K) {
            ll = x;
        } else {
            rr = x;
        }
    }
    cout << ll << endl;
    return 0;
}

```

[/C++]

[C]

```c

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int cmp(const void *a, const void *b) {
    return *(int *)a - *(int *)b;
}

int main() {
    int N, K;
    scanf("%d %d", &N, &K);
    int *A = malloc(sizeof(int) * N);
    for (int i = 0; i < N; i++) {
        scanf("%d", &A[i]);
    }
    qsort(A, N, sizeof(int), cmp);
    long long ll = -1000000000000000000LL;
    long long rr = 1000000000000000000LL;
    while (ll + 1 < rr) {
        long long x = (ll + rr) / 2;
        long long tot = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] < 0) {
                int l = -1;
                int r = N;
                while (l + 1 < r) {
                    int c = (l + r) / 2;
                    if (A[i] * A[c] < x) {
                        r = c;
                    } else {
                        l = c;
                    }
                }
                tot += N - r;
            } else {
                int l = -1;
                int r = N;
                while (l + 1 < r) {
                    int c = (l + r) / 2;
                    if (A[i] * A[c] < x) {
                        l = c;
                    } else {
                        r = c;
                    }
                }
                tot += r;
            }
            if (A[i] * A[i] < x) {
                tot -= 1;
            }
        }
        tot /= 2;
        if (tot < K) {
            ll = x;
        } else {
            rr = x;
        }
    }
    printf("%lld\n", ll);
    return 0;
}

```

[/C]

[Go]

```go

package main

import (
    "bufio"
    "fmt"
    "os"
    "sort"
)

func main() {
    sc := bufio.NewScanner(os.Stdin)
    sc.Split(bufio.ScanWords)
    var N, K int
    sc.Scan()
    N, _ = fmt.Sscan(sc.Text(), &N)
    sc.Scan()
    K, _ = fmt.Sscan(sc.Text(), &K)
    A := make([]int, N)
    for i := 0; i < N; i++ {
        sc.Scan()
        A[i], _ = fmt.Sscan(sc.Text(), &A[i])
    }
    sort.Ints(A)
    ll := -1000000000000000000
    rr := 1000000000000000000
    for ll+1 < rr {
        x := (ll + rr) / 2
        tot := 0
        for i := 0; i < N; i++ {
            if A[i] < 0 {
                l := -1
                r := N
                for l+1 < r {
                    c := (l + r) / 2
                    if A[i]*A[c] < x {
                        r = c
                    } else {
                        l = c
                    }
                }
                tot += N - r
            } else {
                l := -1
                r := N
                for l+1 < r {
                    c := (l + r) / 2
                    if A[i]*A[c] < x {
                        l = c
                    } else {
                        r = c
                    }
                }
                tot += r
            }
            if A[i]*A[i] < x {
                tot -= 1
            }
        }
        tot /= 2
        if tot < K {
            ll = x
        } else {
            rr = x
        }
    }
    fmt.Println(ll)
}

```

[/Go]

[Ruby]

```ruby

n, k = gets.split.map(&:to_i)
a = gets.split.map(&:to_i)
a.sort!
ll = -10 ** 18 - 1
rr = 10 ** 18 + 1
while ll + 1 < rr
    x = (ll + rr) / 2
    tot = 0
    a.each do |ai|
        if ai < 0
            l = -1
            r = a.size
            while l + 1 < r
                c = (l + r) / 2
                if ai * a[c] < x
                    r = c
                else
                    l = c
                end
            end
            tot += a.size - r
        else
            l = -1
            r = a.size
            while l + 1 < r
                c = (l + r) / 2
                if ai * a[c] < x
                    l = c
                else
                    r = c
                end
            end
            tot += r
        end
        if ai * ai < x
            tot -= 1
        end
    end
    tot /= 2
    if tot < k
        ll = x
    else
        rr = x
    end
end
puts ll


```

[/Ruby]

[PHP]

```php

<?php
$stdin = fopen('php://stdin', 'r');
$stdout = fopen('php://stdout', 'w');

$N = intval(fgets($stdin));
$K = intval(fgets($stdin));
$A = array_map('intval', explode(' ', fgets($stdin)));
sort($A);
$ll = -1000000000000000000;
$rr = 1000000000000000000;
while ($ll + 1 < $rr) {
    $x = ($ll + $rr) / 2;
    $tot = 0;
    for ($i = 0; $i < $N; $i++) {
        if ($A[$i] < 0) {
            $l = -1;
            $r = $N;
            while ($l + 1 < $r) {
                $c = ($l + $r) / 2;
                if ($A[$i] * $A[$c] < $x) {
                    $r = $c;
                } else {
                    $l = $c;
                }
            }
            $tot += $N - $r;
        } else {
            $l = -1;
            $r = $N;
            while ($l + 1 < $r) {
                $c = ($l + $r) / 2;
                if ($A[$i] * $A[$c] < $x) {
                    $l = $c;
                } else {
                    $r = $c;
                }
            }
            $tot += $r;
        }
        if ($A[$i] * $A[$i] < $x) {
            $tot -= 1;
        }
    }
    $tot /= 2;
    if ($tot < $K) {
        $ll = $x;
    } else {
        $rr = $x;
    }
}
echo $ll;

```

[/PHP]

[Python]

```python

import sys

N, K = map(int, sys.stdin.readline().split())
A = list(map(int, sys.stdin.readline().split()))
A.sort()
ll = -10 ** 18 - 1
rr = 10 ** 18 + 1
while ll + 1 < rr:
    x = (ll + rr) // 2
    tot = 0
    for i in range(N):
        if A[i] < 0:
            l = -1
            r = N
            while l + 1 < r:
                c = (l + r) // 2
                if A[i] * A[c] < x:
                    r = c
                else:
                    l = c
            tot += N - r
        else:
            l = -1
            r = N
            while l + 1 < r:
                c = (l + r) // 2
                if A[i] * A[c] < x:
                    l = c
                else:
                    r = c
            tot
