
[JAV]
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] x = new int[n];
        int m = 0;
        int q = 0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(x[i]);
        }
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                if (x[i] >= x[i + 1]) {
                    q = (int) Math.ceil((x[i] - x[i + 1]) / d);
                    m = m + q;
                    x[i + 1] = x[i + 1] + q * d;
                }
            }
        }
        System.out.println(m);
    }
}
```
[/JAV]

[PYT]
```python
n, d = map(int, input().split())
x = []
m = 0
q = 0
x = input().split()

def convert_to_int(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    x[i] = int(x[i])
    convert_to_int(i + step, stop, step)
convert_to_int(0, len(x), 1)
condition_1 = 401
condition_2 = 452
outer_loop_limit = 460
outer_loop_step = 459
for outer_loop_index in range(outer_loop_limit // outer_loop_step):

    def inner_loop(a, stop, step):
        global q, m
        if step == 0 or (step > 0 and a >= stop) or (step < 0 and a <= stop):
            return
        if condition_1 & condition_2:
            if x[a] >= x[a + 1]:
                q = int((x[a] - x[a + 1]) / d + 1)
                m = m + q
                x[a + 1] = x[a + 1] + q * d
        inner_loop(a + step, stop, step)
    inner_loop(0, len(x) - 1, 1)
print(m)
```
[/PYT]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, d;
    cin >> n >> d;
    vector<int> x(n);
    int m = 0;
    int q = 0;
    for (int i = 0; i < n; i++) {
        cin >> x[i];
    }
    for (int i = 0; i < n; i++) {
        x[i] = stoi(x[i]);
    }
    for (int i = 0; i < n; i++) {
        if (i < n - 1) {
            if (x[i] >= x[i + 1]) {
                q = ceil((x[i] - x[i + 1]) / d);
                m = m + q;
                x[i + 1] = x[i + 1] + q * d;
            }
        }
    }
    cout << m << endl;
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <math.h>

int main() {
    int n, d;
    scanf("%d %d", &n, &d);
    int x[n];
    int m = 0;
    int q = 0;
    for (int i = 0; i < n; i++) {
        scanf("%d", &x[i]);
    }
    for (int i = 0; i < n; i++) {
        x[i] = atoi(x[i]);
    }
    for (int i = 0; i < n; i++) {
        if (i < n - 1) {
            if (x[i] >= x[i + 1]) {
                q = ceil((x[i] - x[i + 1]) / d);
                m = m + q;
                x[i + 1] = x[i + 1] + q * d;
            }
        }
    }
    printf("%d\n", m);
}
```
[/C]

[PHP]
```php
<?php
$n = intval(fgets(STDIN));
$d = intval(fgets(STDIN));
$x = array();
$m = 0;
$q = 0;
for ($i = 0; $i < $n; $i++) {
    $x[$i] = intval(fgets(STDIN));
}
for ($i = 0; $i < $n; $i++) {
    if ($i < $n - 1) {
        if ($x[$i] >= $x[$i + 1]) {
            $q = ceil(($x[$i] - $x[$i + 1]) / $d);
            $m = $m + $q;
            $x[$i + 1] = $x[$i + 1] + $q * $d;
        }
    }
}
echo $m;
```
[/PHP]

[RUBY]
```ruby
n, d = gets.split.map(&:to_i)
x = []
m = 0
q = 0
n.times do
  x << gets.to_i
end
for i in 0..n - 1
  x[i] = x[i].to_i
end
for i in 0..n - 1
  if i < n - 1
    if x[i] >= x[i + 1]
      q = (x[i] - x[i + 1]) / d + 1
      m = m + q
      x[i + 1] = x[i + 1] + q * d
    end
  end
end
puts m
```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
    "math"
    "strconv"
)

func main() {
    var n, d int
    fmt.Scan(&n, &d)
    x := make([]int, n)
    m := 0
    q := 0
    for i := 0; i < n; i++ {
        fmt.Scan(&x[i])
    }
    for i := 0; i < n; i++ {
        x[i], _ = strconv.Atoi(x[i])
    }
    for i := 0; i < n; i++ {
        if i < n-1 {
            if x[i] >= x[i+1] {
                q = int(math.Ceil(float64(x[i]-x[i+1])/float64(d)))
                m = m + q
                x[i+1] = x[i+1] + q*d
            }
        }
    }
    fmt.Println(m)
}
```
[/GO]

[BASH]
```bash
read n d
x=()
m=0
q=0
for ((i=0; i<n; i++)); do
  read -a x[$i]
done
for ((i=0; i<n; i++)); do
  x[$i]=$((${x[$i]}))
done
for ((i=0; i<n; i++)); do
  if ((i < n-1)); then
    if ((x[i] >= x[i+1])); then
      q=$(((x[i] - x[i+1]) / d + 1))
      m=$((m + q))
      x[i+1]=$((x[i+1] + q * d))
    fi
  fi
done
echo $m
```
[/BASH]

[PERL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my $d = <STDIN>;
chomp($d);
my @x = ();
my $m = 0;
my $q = 0;
for (my $i = 0; $i < $n; $i++) {
    $x[$i] = <STDIN>;
    chomp($x[$i]);
}
for (my $i = 0; $i < $n; $i++) {
    $x[$i] = int($x[$i]);
}
for (my $i = 0; $i < $n; $i++) {
    if ($i < $n - 1) {
        if ($x[$i] >= $x[$i + 1]) {
            $q = int(($x[$i] - $x[$i + 1]) / $d + 1);
            $m = $m + $q;
            $x[$i + 1] = $x[$i + 1] + $q * $d;
        }
    }
}
print $m;
```
[/PERL]

[JULIA]
```julia
n, d = parse.(Int, split(readline()))
x = []
m = 0
q = 0
for i in 1:n
    push!(x, parse(Int, readline()))
end
for i in 1:n
    x[i] = parse(Int, x[i])
end
for i in 1:n
    if i < n
        if x[i] >= x[i + 1]
            q = ceil(Int, (x[i] - x[i + 1]) / d)
            m = m + q
            x[i + 1] = x[i + 1] + q * d
        end
    end
end
println(m)
```
[/JULIA]

[KOTLIN]
```kotlin
fun main() {
    val (n, d) = readLine()!!.split(" ").map { it.toInt() }
    val x = Array(n) { readLine()!!.toInt() }
    var m = 0
    var q = 0
    for (i in 0 until n) {
        x[i] = readLine()!!.toInt()
    }
    for (i in 0 until n) {
        if (i < n - 1) {
            if (x[i] >= x[i + 1]) {
                q = ceil((x[i] - x[i + 1]) / d).toInt()
                m = m + q
                x[i + 1] = x[i + 1] + q * d
            }
        }
    }
    println(m)
}
```
[/KOTLIN]

[HASKELL]
```haskell
main = do
    [n, d] <- map read . words <$> getLine :: IO [Int]
    x <- map read . words <$> getLine :: IO [Int]
    let m = 0
        q = 0
    forM_ [0..n - 1] $ \i -> do
        x[i] <- readLn :: IO Int
    forM_ [0..n - 1] $ \i -> do
        if i < n - 1
            then do
                if x[i] >= x[i + 1]
                    then do
                        q <- ceiling (fromIntegral (x[i] - x[i + 1]) / fromIntegral d) :: IO Int
                        m <- return (m + q)
                        x[i + 1] <- return (x[i + 1] + q * d)
            else return ()
    print m
```
[/HASKELL]

[ELIXIR]
```elixir
n = String.to_integer(IO.gets(""))
d = String.to_integer(IO.gets(""))
x = IO.gets("") |> String.split() |> Enum.map(&String.to_integer/1)
m = 0
q = 0
for i <- 0..n - 1 do
  x[i] = IO.gets("") |> String.to_integer()
end
for i <- 0..n - 1 do
  if i < n - 1 do
    if x[i] >= x[i + 1] do
      q = ceil((x[i] - x[i + 1]) / d)
      m = m + q
      x[i + 1] = x[i + 1] + q * d
    end
  end
end
IO.puts(m)
```
[/ELIXIR]

[OBJECTIVE-C]
```objectivec
#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int n, d;
        scanf("%d %d", &n, &d);
        int x[n];
        int m = 0;
        int q = 0;
        for (int i = 0; i < n; i++) {
            scanf("%d", &x[i]);
        }
        for (int i = 0; i < n; i++) {
            x[i] = [NSString stringWithFormat:@"%d", x[i]].intValue;
        }
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                if (x[i] >= x[i + 1]) {
                    q = ceil((x[i] - x[i + 1]) / d);
                    m = m + q;
                    x[i + 1] = x[i + 1] + q * d;
                }
            }
        }
        printf("%d\n", m);
    }
    return 0;
}
```
[/OBJECTIVE-C]

[SWIFT]
```swift
import Foundation

let n = Int(readLine()!)!
let d = Int(
