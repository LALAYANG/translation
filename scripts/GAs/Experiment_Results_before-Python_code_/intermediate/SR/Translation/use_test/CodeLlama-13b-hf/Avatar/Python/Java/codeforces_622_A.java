
[JAV]
```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 1;
        int r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            int idxcnt = mid * (mid + 1) / 2;
            if (idxcnt < n) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        l -= 1;
        int idxcnt = l * (l + 1) / 2;
        System.out.println(n - idxcnt);
    }
}

```
[/JAV]

[PYT]
```py

n = int(input())
l = 1
r = n
while l < r:
    mid = l + (r - l) // 2
    idxcnt = mid * (mid + 1) // 2
    if idxcnt < n:
        l = mid + 1
    else:
        r = mid
l -= 1
idxcnt = l * (l + 1) // 2
print(n - idxcnt)


```
[/PYT]

[C++]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    int l = 1;
    int r = n;
    while (l < r) {
        int mid = l + (r - l) / 2;
        int idxcnt = mid * (mid + 1) / 2;
        if (idxcnt < n) {
            l = mid + 1;
        } else {
            r = mid;
        }
    }
    l -= 1;
    int idxcnt = l * (l + 1) / 2;
    cout << n - idxcnt << endl;
}

```
[/C++]

[C]
```c

#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;
    scanf("%d", &n);
    int l = 1;
    int r = n;
    while (l < r) {
        int mid = l + (r - l) / 2;
        int idxcnt = mid * (mid + 1) / 2;
        if (idxcnt < n) {
            l = mid + 1;
        } else {
            r = mid;
        }
    }
    l -= 1;
    int idxcnt = l * (l + 1) / 2;
    printf("%d\n", n - idxcnt);
}

```
[/C]

[PHP]
```php

<?php
$n = intval(fgets(STDIN));
$l = 1;
$r = $n;
while ($l < $r) {
    $mid = $l + ($r - $l) / 2;
    $idxcnt = $mid * ($mid + 1) / 2;
    if ($idxcnt < $n) {
        $l = $mid + 1;
    } else {
        $r = $mid;
    }
}
$l -= 1;
$idxcnt = $l * ($l + 1) / 2;
echo $n - $idxcnt;


```
[/PHP]

[RUBY]
```ruby

n = gets.to_i
l = 1
r = n
while l < r
    mid = l + (r - l) / 2
    idxcnt = mid * (mid + 1) / 2
    if idxcnt < n
        l = mid + 1
    else
        r = mid
    end
end
l -= 1
idxcnt = l * (l + 1) / 2
puts n - idxcnt


```
[/RUBY]

[GO]
```go

package main

import (
    "fmt"
)

func main() {
    var n int
    fmt.Scan(&n)
    l := 1
    r := n
    for l < r {
        mid := l + (r - l) / 2
        idxcnt := mid * (mid + 1) / 2
        if idxcnt < n {
            l = mid + 1
        } else {
            r = mid
        }
    }
    l -= 1
    idxcnt := l * (l + 1) / 2
    fmt.Println(n - idxcnt)
}

```
[/GO]

[BASH]
```bash

read n
l=1
r=$n
while [ $l -lt $r ]
do
    mid=$((l + (r - l) / 2))
    idxcnt=$((mid * (mid + 1) / 2))
    if [ $idxcnt -lt $n ]
    then
        l=$((mid + 1))
    else
        r=$mid
    fi
done
l=$((l - 1))
idxcnt=$((l * (l + 1) / 2))
echo $((n - idxcnt))


```
[/BASH]

[PERL]
```perl

use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my $l = 1;
my $r = $n;
while ($l < $r) {
    my $mid = $l + int(($r - $l) / 2);
    my $idxcnt = $mid * ($mid + 1) / 2;
    if ($idxcnt < $n) {
        $l = $mid + 1;
    } else {
        $r = $mid;
    }
}
$l -= 1;
my $idxcnt = $l * ($l + 1) / 2;
print $n - $idxcnt, "\n";


```
[/PERL]

[ELIXIR]
```elixir

n = String.to_integer(IO.gets(""))
l = 1
r = n
while l < r do
    mid = l + div(r - l, 2)
    idxcnt = mid * (mid + 1) / 2
    if idxcnt < n do
        l = mid + 1
    else
        r = mid
    end
end
l = l - 1
idxcnt = l * (l + 1) / 2
IO.puts(n - idxcnt)


```
[/ELIXIR]

[CLJ]
```clojure

(let [n (read-string (read-line))]
  (loop [l 1 r n]
    (let [mid (int (+ l (/ (- r l) 2)))]
      (if (< (quot (* mid (+ mid 1)) 2) n)
        (recur (inc mid) r)
        (recur l mid)))))


```
[/CLJ]

[LUA]
```lua

local n = io.read("*n")
local l = 1
local r = n
while l < r do
    local mid = l + math.floor((r - l) / 2)
    local idxcnt = mid * (mid + 1) / 2
    if idxcnt < n then
        l = mid + 1
    else
        r = mid
    end
end
l = l - 1
local idxcnt = l * (l + 1) / 2
print(n - idxcnt)


```
[/LUA]

[D]
```d

import std.stdio;

void main()
{
    auto n = readln().to!int;
    auto l = 1;
    auto r = n;
    while (l < r)
    {
        auto mid = l + (r - l) / 2;
        auto idxcnt = mid * (mid + 1) / 2;
        if (idxcnt < n)
            l = mid + 1;
        else
            r = mid;
    }
    l -= 1;
    auto idxcnt = l * (l + 1) / 2;
    writeln(n - idxcnt);
}

```
[/D]

[JULIA]
```julia

n = parse(Int, readline())
l = 1
r = n
while l < r
    mid = l + div(r - l, 2)
    idxcnt = mid * (mid + 1) / 2
    if idxcnt < n
        l = mid + 1
    else
        r = mid
    end
end
l -= 1
idxcnt = l * (l + 1) / 2
println(n - idxcnt)


```
[/JULIA]

[R]
```r

n <- as.integer(readline(prompt = "Enter a number: "))
l <- 1
r <- n
while (l < r) {
    mid <- l + floor((r - l) / 2)
    idxcnt <- mid * (mid + 1) / 2
    if (idxcnt < n) {
        l <- mid + 1
    } else {
        r <- mid
    }
}
l <- l - 1
idxcnt <- l * (l + 1) / 2
cat(n - idxcnt, "\n")


```
[/R]

[JS]
```js

'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });

    main();
});

function readline() {
    return inputString[currentLine++];
}

function main() {
    const n = parseInt(readline(), 10);
    let l = 1;
    let r = n;
    while (l < r) {
        const mid = l + Math.floor((r - l) / 2);
        const idxcnt = mid * (mid + 1) / 2;
        if (idxcnt < n) {
            l = mid + 1;
        } else {
            r = mid;
        }
    }
    l -= 1;
    const idxcnt = l * (l + 1) / 2;
    console.log(n - idxcnt);
}


```
[/JS]

[PAS]
```pas

program Problem;

{$APPTYPE CONSOLE}

var
  n, l, r, mid, idxcnt: Integer;

begin
  Readln(n);
  l := 1;
  r := n;
  while l < r do
  begin
    mid := l + (r - l) div 2;
    idxcnt := mid * (mid + 1) div 2;
    if idxcnt < n then
      l := mid + 1
    else
      r := mid;
  end;
  l := l - 1;
  idxcnt := l * (l + 1) div 2;
  Writeln(n - idxcnt);
end.


```
[/PAS]

[BASH]
```bash

read n
l=1
r=$n
while [ $l -lt $r ]
do
    mid=$((l + (r - l) / 2))
    idxcnt=$((mid * (mid + 1) / 2))
    if [ $idxcnt -lt $n ]
    then
        l=$((mid + 1))
    else
        r=$mid
    fi
done
l=$((l - 1))
idxcnt=$((l * (l + 1) / 2))
echo $((n - idxcnt))


```
[/BASH]

[BASH]
```bash

read n
l=1
r=$n
while [ $l -lt $r ]
do
    mid=$((l + (r - l) / 2))
    idxcnt=$((mid * (mid + 1) / 2))
    if [ $idxcnt -lt $n ]
    then
        l=$((mid + 1))
    else
        r=$mid
    fi
done
l=$((l - 1))
idxcnt=$((l * (l + 1) / 2))
echo $((n - idxcnt))


```
[/BASH]

[BASH]
```bash

read n
l=1
r=$n
while [ $l -lt $r ]
do
    mid=$((l + (r - l) / 2))
    idxcnt=$((mid * (mid + 1) / 2))
    if [ $idxcnt -lt $n ]
    then
        l=$((mid + 1))
    else
        r=$mid
    fi
done
l=$((l - 1))
idxcnt=$((l * (l + 1) / 2))
echo $((n - idxcnt))


```
[/BASH]

[BASH]
```bash

read n
l=1
r=$n
while [ $l -lt $r ]
do
    mid=$((l + (r - l) / 2))
    idxcnt=$((mid * (mid + 1) / 2))
    if [ $idxcnt -lt $n ]
    then
        l=$((mid + 1))
    else
        r=$mid
    fi
done
l=$((l - 1))
idxcnt=$((l * (l + 1) / 2))
echo $((n - idxcnt))


```
[/BASH]

[BASH]
```bash

read n
l=1
r=$n
while [ $l -lt $r ]
do
    mid=$((l + (r - l) / 2))
    idxcnt=$((mid * (mid + 1) / 2))
    if [ $idxcnt -lt $n ]
    then
        l=$((mid + 1))
    else
        r=$mid
    fi
done
l=$((l - 1))
idxcnt=$((l * (l + 1) / 2))
echo $((n - idxcnt))


```
[/BASH]

[BASH]
```bash

read n
l=1
r=$n
while [ $l -lt $r ]
do
    mid=$((l + (r - l) / 2))
    idxcnt=$((mid * (mid + 1) / 2))
    if [ $idxcnt -lt $n ]
    then
        l=$((mid + 1))
    else
        r=$mid
    fi
done
l=$((l - 1))
idxcnt=$((l * (l + 1) / 2))
echo $((n - idxcnt))


```
[/BASH]

[BASH]
```bash

read n
l=1
r=$n
while [ $l -lt $r ]
do
    mid=$((l + (r - l) / 2))
    idxcnt=$((mid * (mid + 1) / 2))
    if [ $idxcnt -lt $n ]
    then
        l=$((mid + 1))
    else
        r=$mid
    fi
done
l=$((l - 1))
idxcnt=$((
