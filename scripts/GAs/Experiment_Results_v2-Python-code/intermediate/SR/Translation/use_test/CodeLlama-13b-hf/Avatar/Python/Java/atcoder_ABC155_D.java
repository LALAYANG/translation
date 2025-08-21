
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ll = -1000000000;
        int rr = 1000000000;
        while (ll + 1 < rr) {
            int x = (ll + rr) / 2;
            int tot = 0;
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
                    tot = tot + r;
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
N, K = map(int, input().split())
A = list(map(int, input().split()))
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
            tot = tot + r
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
    int ll = -1000000000;
    int rr = 1000000000;
    while (ll + 1 < rr) {
        int x = (ll + rr) / 2;
        int tot = 0;
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
                tot = tot + r;
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

[GO]
```go
package main

import (
	"fmt"
	"sort"
)

func main() {
	var N, K int
	fmt.Scan(&N, &K)
	A := make([]int, N)
	for i := 0; i < N; i++ {
		fmt.Scan(&A[i])
	}
	sort.Ints(A)
	ll := -1000000000
	rr := 1000000000
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
				tot = tot + r
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
[/GO]

[RB]
```r
N <- scan()
K <- scan()
A <- scan()
A <- sort(A)
ll <- -1000000000
rr <- 1000000000
while (ll + 1 < rr) {
  x <- (ll + rr) / 2
  tot <- 0
  for (i in 1:N) {
    if (A[i] < 0) {
      l <- -1
      r <- N
      while (l + 1 < r) {
        c <- (l + r) / 2
        if (A[i] * A[c] < x) {
          r <- c
        } else {
          l <- c
        }
      }
      tot <- tot + N - r
    } else {
      l <- -1
      r <- N
      while (l + 1 < r) {
        c <- (l + r) / 2
        if (A[i] * A[c] < x) {
          l <- c
        } else {
          r <- c
        }
      }
      tot <- tot + r
    }
    if (A[i] * A[i] < x) {
      tot <- tot - 1
    }
  }
  tot <- tot / 2
  if (tot < K) {
    ll <- x
  } else {
    rr <- x
  }
}
print(ll)
```
[/RB]

[PHP]
```php
<?php
$N = (int)trim(fgets(STDIN));
$K = (int)trim(fgets(STDIN));
$A = explode(' ', trim(fgets(STDIN)));
sort($A);
$ll = -1000000000;
$rr = 1000000000;
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
            $tot = $tot + $r;
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

[HAS]
```haskell
main = do
    [n, k] <- map read . words <$> getLine
    a <- map read . words <$> getLine
    let a' = sort a
        ll = -1000000000
        rr = 1000000000
    print $ loop ll rr
    where
        loop ll rr
            | ll + 1 < rr =
                let x = (ll + rr) `div` 2
                    tot = sum $ map (count x) a'
                in if tot < k then loop ll x else loop x rr
            | otherwise = ll
        count x a
            | a < 0 =
                let l = -1
                    r = length a'
                in loopL l r
            | otherwise =
                let l = -1
                    r = length a'
                in loopR l r
        loopL l r
            | l + 1 < r =
                let c = (l + r) `div` 2
                in if a' !! c * a < x then loopL c r else loopL l c
            | otherwise = length a' - r
        loopR l r
            | l + 1 < r =
                let c = (l + r) `div` 2
                in if a' !! c * a < x then loopR l c else loopR c r
            | otherwise = r
```
[/HAS]

[JA]
```javascript
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
let input = [];
rl.on('line', function (line) {
    input.push(line);
})
    .on('close', async function () {
        let [N, K] = input[0].split(' ').map(e => parseInt(e));
        let A = input[1].split(' ').map(e => parseInt(e));
        A.sort((a, b) => a - b);
        let ll = -1000000000;
        let rr = 1000000000;
        while (ll + 1 < rr) {
            let x = Math.floor((ll + rr) / 2);
            let tot = 0;
            for (let i = 0; i < N; i++) {
                if (A[i] < 0) {
                    let l = -1;
                    let r = N;
                    while (l + 1 < r) {
                        let c = Math.floor((l + r) / 2);
                        if (A[i] * A[c] < x) {
                            r = c;
                        } else {
                            l = c;
                        }
                    }
                    tot += N - r;
                } else {
                    let l = -1;
                    let r = N;
                    while (l + 1 < r) {
                        let c = Math.floor((l + r) / 2);
                        if (A[i] * A[c] < x) {
                            l = c;
                        } else {
                            r = c;
                        }
                    }
                    tot = tot + r;
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
        console.log(ll);
    });
```
[/JA]

[PB]
```python
N, K = map(int, input().split())
A = list(map(int, input().split()))
A.sort()
ll = -10 ** 18 - 1
rr = 10 **
