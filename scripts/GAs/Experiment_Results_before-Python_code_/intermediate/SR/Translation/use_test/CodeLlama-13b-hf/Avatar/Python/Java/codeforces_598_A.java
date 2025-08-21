
[JAV]
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
    }

    public static int solve(int n) {
        int s = (1 + n) * n / 2;
        int t = 1;
        while (t <= n) {
            s -= 2 * t;
            t *= 2;
        }
        return s;
    }
}

```
[/JAV]

[PY]
```python

t = int(input())
def solve(n):
    s = (1 + n) * n // 2
    t = 1
    while t <= n:
        s -= 2 * t
        t *= 2
    return s
for _ in range(t):
    n = int(input())
    print(solve(n))


```
[/PY]

[C++]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        cout << solve(n) << endl;
    }
}

int solve(int n) {
    int s = (1 + n) * n / 2;
    int t = 1;
    while (t <= n) {
        s -= 2 * t;
        t *= 2;
    }
    return s;
}

```
[/C++]

[C]
```c

#include <stdio.h>

int solve(int n) {
    int s = (1 + n) * n / 2;
    int t = 1;
    while (t <= n) {
        s -= 2 * t;
        t *= 2;
    }
    return s;
}

int main() {
    int t;
    scanf("%d", &t);
    while (t--) {
        int n;
        scanf("%d", &n);
        printf("%d\n", solve(n));
    }
}

```
[/C]

[PHP]
```php

<?php
$t = (int) fgets(STDIN);
while ($t--) {
    $n = (int) fgets(STDIN);
    echo solve($n) . PHP_EOL;
}

function solve($n) {
    $s = (1 + $n) * $n / 2;
    $t = 1;
    while ($t <= $n) {
        $s -= 2 * $t;
        $t *= 2;
    }
    return $s;
}

```
[/PHP]

[RUBY]
```ruby

t = gets.to_i
t.times do
  n = gets.to_i
  puts solve(n)
end

def solve(n)
  s = (1 + n) * n / 2
  t = 1
  while t <= n
    s -= 2 * t
    t *= 2
  end
  s
end

```
[/RUBY]

[GO]
```go

package main

import (
	"fmt"
)

func main() {
	var t int
	fmt.Scan(&t)
	for t > 0 {
		var n int
		fmt.Scan(&n)
		fmt.Println(solve(n))
		t--
	}
}

func solve(n int) int {
	s := (1 + n) * n / 2
	t := 1
	for t <= n {
		s -= 2 * t
		t *= 2
	}
	return s
}

```
[/GO]

[BASH]
```bash

read t
while [ $t -gt 0 ]
do
    read n
    echo $(solve $n)
    t=$(($t-1))
done

solve() {
    s=$((1 + $1) * $1 / 2)
    t=1
    while [ $t -le $1 ]
    do
        s=$((s - 2 * $t))
        t=$((t * 2))
    done
    echo $s
}

```
[/BASH]

[PERL]
```perl

use strict;
use warnings;

my $t = <STDIN>;
chomp($t);
while ($t > 0) {
    my $n = <STDIN>;
    chomp($n);
    print solve($n) . "\n";
    $t--;
}

sub solve {
    my ($n) = @_;
    my $s = (1 + $n) * $n / 2;
    my $t = 1;
    while ($t <= $n) {
        $s -= 2 * $t;
        $t *= 2;
    }
    return $s;
}

```
[/PERL]

[ELIXIR]
```elixir

t = IO.gets("") |> String.trim() |> String.to_integer()

for _ <- 1..t do
  n = IO.gets("") |> String.trim() |> String.to_integer()
  IO.puts solve(n)
end

def solve(n) do
  s = (1 + n) * n / 2
  t = 1
  while t <= n do
    s = s - 2 * t
    t = t * 2
  end
  s
end

```
[/ELIXIR]

[JULIA]
```julia

t = parse(Int, readline())
for _ in 1:t
    n = parse(Int, readline())
    println(solve(n))
end

function solve(n)
    s = (1 + n) * n / 2
    t = 1
    while t <= n
        s -= 2 * t
        t *= 2
    end
    s
end

```
[/JULIA]

[LUA]
```lua

t = io.read("*n")
for i = 1, t do
    n = io.read("*n")
    print(solve(n))
end

function solve(n)
    s = (1 + n) * n / 2
    t = 1
    while t <= n do
        s = s - 2 * t
        t = t * 2
    end
    return s
end

```
[/LUA]

[D]
```d

import std.stdio;

void main()
{
    int t;
    read(t);
    while (t--)
    {
        int n;
        read(n);
        writeln(solve(n));
    }
}

int solve(int n)
{
    int s = (1 + n) * n / 2;
    int t = 1;
    while (t <= n)
    {
        s -= 2 * t;
        t *= 2;
    }
    return s;
}

```
[/D]

[R]
```r

t <- as.integer(readline(prompt=""))
for (i in 1:t) {
    n <- as.integer(readline(prompt=""))
    cat(solve(n), "\n")
}

solve <- function(n) {
    s <- (1 + n) * n / 2
    t <- 1
    while (t <= n) {
        s <- s - 2 * t
        t <- t * 2
    }
    s
}

```
[/R]

[JAVASCRIPT]
```javascript

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
    const t = parseInt(readline(), 10);

    for (let i = 0; i < t; i++) {
        const n = parseInt(readline(), 10);
        console.log(solve(n));
    }
}

function solve(n) {
    let s = (1 + n) * n / 2;
    let t = 1;
    while (t <= n) {
        s -= 2 * t;
        t *= 2;
    }
    return s;
}

```
[/JAVASCRIPT]

[SWIFT]
```swift

import Foundation

var t = Int(readLine()!)!
for _ in 0..<t {
    let n = Int(readLine()!)!
    print(solve(n))
}

func solve(_ n: Int) -> Int {
    var s = (1 + n) * n / 2
    var t = 1
    while t <= n {
        s -= 2 * t
        t *= 2
    }
    return s
}

```
[/SWIFT]

[PASCAL]
```pascal

program problem;
var
    t: integer;
    n: integer;

begin
    read(t);
    while t > 0 do
    begin
        read(n);
        writeln(solve(n));
        t := t - 1;
    end;
end.

function solve(n: integer): integer;
var
    s: integer;
    t: integer;
begin
    s := (1 + n) * n div 2;
    t := 1;
    while t <= n do
    begin
        s := s - 2 * t;
        t := t * 2;
    end;
    solve := s;
end;

```
[/PASCAL]

[OBJECTIVEC]
```objectivec

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int t;
        scanf("%d", &t);
        while (t-- > 0) {
            int n;
            scanf("%d", &n);
            printf("%d\n", solve(n));
        }
    }
    return 0;
}

int solve(int n) {
    int s = (1 + n) * n / 2;
    int t = 1;
    while (t <= n) {
        s -= 2 * t;
        t *= 2;
    }
    return s;
}

```
[/OBJECTIVEC]

[RUST]
```rust

use std::io;

fn main() {
    let mut t = String::new();
    io::stdin().read_line(&mut t).unwrap();
    let t: i32 = t.trim().parse().unwrap();
    for _ in 0..t {
        let mut n = String::new();
        io::stdin().read_line(&mut n).unwrap();
        let n: i32 = n.trim().parse().unwrap();
        println!("{}", solve(n));
    }
}

fn solve(n: i32) -> i32 {
    let mut s = (1 + n) * n / 2;
    let mut t = 1;
    while t <= n {
        s -= 2 * t;
        t *= 2;
    }
    s
}

```
[/RUST]

[SCALA]
```scala

object Solution {
    def main(args: Array[String]) {
        val t = readLine.toInt
        for (_ <- 1 to t) {
            val n = readLine.toInt
            println(solve(n))
        }
    }

    def solve(n: Int): Int = {
        var s = (1 + n) * n / 2
        var t = 1
        while (t <= n) {
            s -= 2 * t
            t *= 2
        }
        s
    }
}

```
[/SCALA]

[BASH]
```bash

read t
while [ $t -gt 0 ]
do
    read n
    echo $(solve $n)
    t=$(($t-1))
done

solve() {
    s=$((1 + $1) * $1 / 2)
    t=1
    while [ $t -le $1 ]
    do
        s=$((s - 2 * $t))
        t=$((t * 2))
    done
    echo $s
}

```
[/BASH]

[JULIA]
```julia

t = parse(Int, readline())
for _ in 1:t
    n = parse(Int, readline())
    println(solve(n))
end

function solve(n)
    s = (1 + n) * n / 2
    t = 1
    while t <= n
        s -= 2 * t
        t *= 2
    end
    s
end

```
[/JULIA]

[COFFEESCRIPT]
```coffeescript

t = parseInt readline()
for i in [0..t]
    n = parseInt readline()
    console.log solve n

solve = (n) ->
    s = (1 + n) * n / 2
    t = 1
    while t <= n
        s -= 2 * t
        t *= 2
    s

```
[/COFFEESCRIPT]

[CLOJURE]
```clojure

(defn solve [n]
  (loop [s (int (/ (+ 1 n) 2))
         t 1]
    (if (<= t n)
      (recur (- s (* 2 t)) (* 2 t))
      s)))

(let [t (read-string (read-line))]
  (doseq [i (range t)]
    (println (solve (read-string (read-line))))))

```
[/CLOJURE]

[LUA]
```lua

t = io.read("*n")
for i = 1, t do
    n = io.read("*n")
    print(solve(n))
end

function solve(n)
    s = (1 + n) * n / 2
    t = 1
    while t <= n do
        s = s - 2 * t
        t = t * 2
    end
    return s
end

```
[/LUA]

[D]
```d

import std.stdio;

void main()
{
    int t;
    read(t);
    while (t--)
    {
        int n;
        read(n);
        writeln(solve(n));
    }
}

int solve(int n)
{
