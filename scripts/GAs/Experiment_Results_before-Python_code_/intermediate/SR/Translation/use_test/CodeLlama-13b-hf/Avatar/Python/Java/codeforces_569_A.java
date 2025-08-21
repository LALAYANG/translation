
[JAV]
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s = sc.nextInt();
        int q = sc.nextInt();
        int ans = 0;
        while (s < t) {
            s *= q;
            ans++;
        }
        System.out.println(ans);
    }
}

```
[/JAV]

[PYT]
```py

t, s, q = map(int, input().split())
ans = 0
while s < t:
    s *= q
    ans += 1
print(ans)


```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int t, s, q;
    cin >> t >> s >> q;
    int ans = 0;
    while (s < t) {
        s *= q;
        ans++;
    }
    cout << ans << endl;
}

```
[/CPP]

[C]
```c

#include <stdio.h>

int main() {
    int t, s, q;
    scanf("%d %d %d", &t, &s, &q);
    int ans = 0;
    while (s < t) {
        s *= q;
        ans++;
    }
    printf("%d\n", ans);
}

```
[/C]

[MAT]
```matlab

t = input('');
s = input('');
q = input('');
ans = 0;
while s < t
    s = s * q;
    ans = ans + 1;
end
disp(ans)


```
[/MAT]

[RUB]
```ruby

t, s, q = gets.split.map(&:to_i)
ans = 0
while s < t
    s *= q
    ans += 1
end
puts ans


```
[/RUB]

[PHP]
```php

<?php
$t = (int)trim(fgets(STDIN));
$s = (int)trim(fgets(STDIN));
$q = (int)trim(fgets(STDIN));
$ans = 0;
while ($s < $t) {
    $s *= $q;
    $ans++;
}
echo $ans;


```
[/PHP]

[GO]
```go

package main

import (
    "fmt"
)

func main() {
    var t, s, q int
    fmt.Scan(&t, &s, &q)
    ans := 0
    for s < t {
        s *= q
        ans++
    }
    fmt.Println(ans)
}

```
[/GO]

[PAS]
```pascal

program Problem;
var
  t, s, q, ans: integer;
begin
  read(t, s, q);
  ans := 0;
  while s < t do
  begin
    s := s * q;
    ans := ans + 1;
  end;
  writeln(ans);
end.

```
[/PAS]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[PL]
```perl

my $t = <STDIN>;
my $s = <STDIN>;
my $q = <STDIN>;
my $ans = 0;
while ($s < $t) {
    $s *= $q;
    $ans++;
}
print $ans, "\n";


```
[/PL]

[JULIA]
```julia

t, s, q = parse.(Int, split(readline()))
ans = 0
while s < t
    s *= q
    ans += 1
end
println(ans)


```
[/JULIA]

[KOT]
```kotlin

fun main(args: Array<String>) {
    val (t, s, q) = readLine()!!.split(" ").map { it.toInt() }
    var ans = 0
    while (s < t) {
        s *= q
        ans++
    }
    println(ans)
}

```
[/KOT]

[HAS]
```haskell

main = do
    [t, s, q] <- map read . words <$> getLine
    let ans = length $ takeWhile (< t) $ iterate (* q) s
    print ans


```
[/HAS]

[LUA]
```lua

t, s, q = io.read("*n", "*n", "*n")
ans = 0
while s < t do
    s = s * q
    ans = ans + 1
end
print(ans)


```
[/LUA]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
done
echo $ans


```
[/BASH]

[BASH]
```bash

read t s q
ans=0
while [ $s -lt $t ]
do
  s=$((s*q))
  ans=$((ans+1))
