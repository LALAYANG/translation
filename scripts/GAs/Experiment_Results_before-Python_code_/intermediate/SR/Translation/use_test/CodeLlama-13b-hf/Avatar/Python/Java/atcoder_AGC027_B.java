
[JAV]

```java

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int[] S = new int[N];
        S[0] = A[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + A[i];
        }
        long ans = Long.MAX_VALUE;
        for (int k = 1; k <= N / 2; k++) {
            long E = k * X + 2 * IntStream.range(N - 2 * k - 1, -1, -k).map(i -> S[i]).sum();
            ans = Math.min(ans, E);
        }
        System.out.println(ans + N * X + 5 * S[N - 1]);
    }
}

```

[/JAV]

[PY]

```python

from itertools import accumulate
N , X , * A = map ( int , open ( 0 ).read ( ).split ( ) )
S = list ( accumulate ( A ) )
ans = float ( "inf" )
for k , s in enumerate ( S , 1 ) :
    E = k * X + 2 * sum ( S [ j ] for j in range ( N - 2 * k - 1 , - 1 , - k ) )
    ans = min ( ans , E )
print ( ans + N * X + 5 * S [ - 1 ] )


```

[/PY]

[C++]

```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    int N, X;
    cin >> N >> X;
    vector<int> A(N);
    for (int i = 0; i < N; i++) {
        cin >> A[i];
    }
    vector<int> S(N);
    S[0] = A[0];
    for (int i = 1; i < N; i++) {
        S[i] = S[i - 1] + A[i];
    }
    long long ans = LLONG_MAX;
    for (int k = 1; k <= N / 2; k++) {
        long long E = k * X + 2 * accumulate(S.begin() + N - 2 * k - 1, S.begin() - k, 0LL);
        ans = min(ans, E);
    }
    cout << ans + N * X + 5 * S[N - 1] << '\n';
}

```

[/C++]

[C]

```c

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int N, X;
    scanf("%d %d", &N, &X);
    int *A = malloc(sizeof(int) * N);
    for (int i = 0; i < N; i++) {
        scanf("%d", A + i);
    }
    int *S = malloc(sizeof(int) * N);
    S[0] = A[0];
    for (int i = 1; i < N; i++) {
        S[i] = S[i - 1] + A[i];
    }
    long long ans = LLONG_MAX;
    for (int k = 1; k <= N / 2; k++) {
        long long E = k * X + 2 * accumulate(S + N - 2 * k - 1, S - k, 0LL);
        ans = min(ans, E);
    }
    printf("%lld\n", ans + N * X + 5 * S[N - 1]);
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
    "strconv"
    "strings"
)

func main() {
    sc := bufio.NewScanner(os.Stdin)
    sc.Split(bufio.ScanWords)
    N, _ := strconv.Atoi(sc.Text())
    X, _ := strconv.Atoi(sc.Text())
    A := make([]int, N)
    for i := 0; i < N; i++ {
        A[i], _ = strconv.Atoi(sc.Text())
    }
    S := make([]int, N)
    S[0] = A[0]
    for i := 1; i < N; i++ {
        S[i] = S[i - 1] + A[i]
    }
    ans := int(1e18)
    for k := 1; k <= N/2; k++ {
        E := k*int64(X) + 2*accumulate(S[N-2*k-1:N-k:k], S[N-k:N:k])
        ans = min(ans, int(E))
    }
    fmt.Println(ans + N*X + 5*S[N-1])
}

func min(a, b int) int {
    if a < b {
        return a
    }
    return b
}

func accumulate(A []int, B []int) int64 {
    var res int64
    for i := 0; i < len(A); i++ {
        res += int64(A[i])
    }
    for i := 0; i < len(B); i++ {
        res += int64(B[i])
    }
    return res
}

```

[/Go]

[Ruby]

```ruby

n, x = gets.split.map(&:to_i)
a = gets.split.map(&:to_i)
s = [a[0]]
a[1..-1].each_with_index { |e, i| s[i+1] = s[i] + e }
ans = 1_000_000_000_000_000_000
for k in 1..n/2
  e = k * x + 2 * (s[n-2*k-1..n-k].sum + s[n-k..n].sum)
  ans = [ans, e].min
end
puts ans + n * x + 5 * s[n-1]

```

[/Ruby]

[PHP]

```php

<?php
$stdin = fopen('php://stdin', 'r');
$stdout = fopen('php://stdout', 'w');

$N = intval(fgets($stdin));
$X = intval(fgets($stdin));
$A = array_map('intval', explode(' ', fgets($stdin)));
$S = array($A[0]);
for ($i = 1; $i < $N; $i++) {
    $S[$i] = $S[$i - 1] + $A[$i];
}
$ans = 1000000000000000000;
for ($k = 1; $k <= $N / 2; $k++) {
    $E = $k * $X + 2 * array_sum(array_slice($S, $N - 2 * $k - 1, $N - $k)) + array_sum(array_slice($S, $N - $k, $N));
    $ans = min($ans, $E);
}
echo $ans + $N * $X + 5 * $S[$N - 1] . PHP_EOL;

function min($a, $b) {
    return $a < $b ? $a : $b;
}

```

[/PHP]

[Python]

```python

import sys

N, X = map(int, sys.stdin.readline().split())
A = list(map(int, sys.stdin.readline().split()))
S = [A[0]]
for i in range(1, N):
    S.append(S[i - 1] + A[i])
ans = 10 ** 18
for k in range(1, N // 2 + 1):
    E = k * X + 2 * sum(S[N - 2 * k - 1 : N - k : k]) + sum(S[N - k : N : k])
    ans = min(ans, E)
print(ans + N * X + 5 * S[N - 1])

```

[/Python]

[Rust]

```rust

use std::io::{self, BufRead};

fn main() {
    let stdin = io::stdin();
    let stdin = stdin.lock();
    let token: Vec<_> = stdin.lines().next().unwrap().unwrap().split_whitespace().collect();
    let (n, x): (usize, i64) = (token[0].parse().unwrap(), token[1].parse().unwrap());
    let mut a: Vec<i64> = token[2..].iter().map(|s| s.parse().unwrap()).collect();
    let mut s = vec![a[0]];
    for i in 1..n {
        s.push(s[i - 1] + a[i]);
    }
    let mut ans = 10000000000000000000;
    for k in 1..=n / 2 {
        let e = k as i64 * x + 2 * s[n - 2 * k - 1..n - k].iter().sum::<i64>()
            + s[n - k..n].iter().sum::<i64>();
        ans = ans.min(e);
    }
    println!("{}", ans + n as i64 * x + 5 * s[n - 1]);
}

```

[/Rust]

[Swift]

```swift

import Foundation

let input = readLine()!.split(separator: " ").map { Int(String($0))! }
let (n, x) = (input[0], input[1])
let a = input[2..<n + 2]
var s = [a[0]]
for i in 1..<n {
    s.append(s[i - 1] + a[i])
}
var ans = 1000000000000000000
for k in 1...n / 2 {
    let e = Int64(k) * x + 2 * s[n - 2 * k - 1..<n - k].reduce(0, +) + s[n - k..<n].reduce(0, +)
    ans = min(ans, e)
}
print(ans + Int64(n) * x + 5 * s[n - 1])

```

[/Swift]

[C#]

```cs

using System;
using System.Linq;

class Solution
{
    static void Main(String[] args)
    {
        var input = Console.ReadLine().Split(' ');
        var (n, x) = (int.Parse(input[0]), int.Parse(input[1]));
        var a = input.Skip(2).Select(int.Parse).ToArray();
        var s = new int[n];
        s[0] = a[0];
        for (var i = 1; i < n; i++)
        {
            s[i] = s[i - 1] + a[i];
        }
        var ans = long.MaxValue;
        for (var k = 1; k <= n / 2; k++)
        {
            var e = k * x + 2 * s.Skip(n - 2 * k - 1).Take(n - k).Sum() + s.Skip(n - k).Take(n).Sum();
            ans = Math.Min(ans, e);
        }
        Console.WriteLine(ans + n * x + 5 * s[n - 1]);
    }
}

```

[/C#]

[JavaScript]

```js

const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split(" ");
const [N, X] = input.splice(0, 2).map(Number);
const A = input.map(Number);
const S = [A[0]];
for (let i = 1; i < N; i++) {
  S[i] = S[i - 1] + A[i];
}
let ans = 10 ** 18;
for (let k = 1; k <= N / 2; k++) {
  const E = k * X + 2 * S.slice(N - 2 * k - 1, N - k).reduce((a, b) => a + b, 0) + S.slice(N - k, N).reduce((a, b) => a + b, 0);
  ans = Math.min(ans, E);
}
console.log(ans + N * X + 5 * S[N - 1]);

```

[/JavaScript]

[Python 3]

```py3

import sys

N, X = map(int, sys.stdin.readline().split())
A = list(map(int, sys.stdin.readline().split()))
S = [A[0]]
for i in range(1, N):
    S.append(S[i - 1] + A[i])
ans = 10 ** 18
for k in range(1, N // 2 + 1):
    E = k * X + 2 * sum(S[N - 2 * k - 1 : N - k : k]) + sum(S[N - k : N : k])
    ans = min(ans, E)
print(ans + N * X + 5 * S[N - 1])

```

[/Python 3]

[Haskell]

```hs

import Data.List

main = do
  [n, x] <- map read . words <$> getLine
  a <- map read . words <$> getLine
  let s = scanl (+) (head a) (tail a)
      ans = 10 ^ 18
  print $ minimum (ans : [k * x + 2 * sum (take (n - 2 * k - 1) (drop (n - k) s)) + sum (take (n - k) (drop (n - 2 * k - 1) s)) | k <- [1 .. n `div` 2]]) + n * x + 5 * last s

```

[/Haskell]


