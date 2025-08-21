
[JAV]

```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < n; k++) {
                    if (arr[k] != arr[j] && arr[k] != arr[i] && arr[k] == arr[i] + arr[j]) {
                        System.out.println(k + 1 + " " + j + 1 + " " + i + 1);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}

```

[/JAV]

[PY]

```python

import sys

n = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))
for i in range(n):
    for j in range(n):
        if i == j:
            continue
        for k in range(n):
            if arr[k] != arr[j] and arr[k] != arr[i] and arr[k] == arr[i] + arr[j]:
                print(k + 1, j + 1, i + 1)
                exit()
print(-1)


```

[/PY]

[C++]

```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> arr(n);
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == j) {
                continue;
            }
            for (int k = 0; k < n; k++) {
                if (arr[k] != arr[j] && arr[k] != arr[i] && arr[k] == arr[i] + arr[j]) {
                    cout << k + 1 << " " << j + 1 << " " << i + 1 << endl;
                    return 0;
                }
            }
        }
    }
    cout << -1 << endl;
    return 0;
}

```

[/C++]

[PHP]

```php

<?php

$n = intval(fgets(STDIN));
$arr = array_map('intval', explode(' ', fgets(STDIN)));
for ($i = 0; $i < $n; $i++) {
    for ($j = 0; $j < $n; $j++) {
        if ($i == $j) {
            continue;
        }
        for ($k = 0; $k < $n; $k++) {
            if ($arr[$k] != $arr[$j] && $arr[$k] != $arr[$i] && $arr[$k] == $arr[$i] + $arr[$j]) {
                echo $k + 1 . ' ' . $j + 1 . ' ' . $i + 1 . PHP_EOL;
                exit(0);
            }
        }
    }
}
echo -1 . PHP_EOL;

```

[/PHP]

[RUBY]

```ruby

n = gets.to_i
arr = gets.split.map(&:to_i)
(0..n - 1).each do |i|
    (0..n - 1).each do |j|
        next if i == j
        (0..n - 1).each do |k|
            next if arr[k] != arr[j] && arr[k] != arr[i] && arr[k] == arr[i] + arr[j]
            puts k + 1, j + 1, i + 1
            exit
        end
    end
end
puts -1

```

[/RUBY]

[GO]

```go

package main

import (
    "fmt"
    "strconv"
    "strings"
)

func main() {
    var n int
    fmt.Scan(&n)
    arr := make([]int, n)
    for i := 0; i < n; i++ {
        arr[i], _ = strconv.Atoi(strings.Split(fmt.Sscanln(), " ")[i])
    }
    for i := 0; i < n; i++ {
        for j := 0; j < n; j++ {
            if i == j {
                continue
            }
            for k := 0; k < n; k++ {
                if arr[k] != arr[j] && arr[k] != arr[i] && arr[k] == arr[i]+arr[j] {
                    fmt.Println(k + 1, j + 1, i + 1)
                    return
                }
            }
        }
    }
    fmt.Println(-1)
}

```

[/GO]

[BASH]

```bash

read n
read -a arr
for ((i = 0; i < n; i++)); do
    for ((j = 0; j < n; j++)); do
        if [[ $i -eq $j ]]; then
            continue
        fi
        for ((k = 0; k < n; k++)); do
            if [[ ${arr[$k]} != ${arr[$j]} && ${arr[$k]} != ${arr[$i]} && ${arr[$k]} -eq $((${arr[$i]} + ${arr[$j]})) ]]; then
                echo $(($k + 1)) $(($j + 1)) $(($i + 1))
                exit 0
            fi
        done
    done
done
echo -1

```

[/BASH]

[PERL]

```perl

use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my @arr = split(' ', <STDIN>);
chomp(@arr);
for (my $i = 0; $i < $n; $i++) {
    for (my $j = 0; $j < $n; $j++) {
        next if $i == $j;
        for (my $k = 0; $k < $n; $k++) {
            next if $arr[$k] != $arr[$j] && $arr[$k] != $arr[$i] && $arr[$k] == $arr[$i] + $arr[$j];
            print $k + 1, ' ', $j + 1, ' ', $i + 1, "\n";
            exit;
        }
    }
}
print -1, "\n";

```

[/PERL]

[ELIXIR]

```elixir

n = IO.gets("") |> String.trim() |> String.to_integer()
arr = IO.gets("") |> String.trim() |> String.split() |> Enum.map(&String.to_integer/1)
for i <- 0..(n - 1) do
    for j <- 0..(n - 1) do
        if i == j do
            continue
        end
        for k <- 0..(n - 1) do
            if Enum.at(arr, k) != Enum.at(arr, j) && Enum.at(arr, k) != Enum.at(arr, i) && Enum.at(arr, k) == Enum.at(arr, i) + Enum.at(arr, j) do
                IO.puts("#{k + 1} #{j + 1} #{i + 1}")
                exit({:shutdown, 0})
            end
        end
    end
end
IO.puts(-1)

```

[/ELIXIR]

[JULIA]

```julia

n = parse(Int, readline())
arr = parse.(Int, split(readline()))
for i in 1:n
    for j in 1:n
        if i == j
            continue
        end
        for k in 1:n
            if arr[k] != arr[j] && arr[k] != arr[i] && arr[k] == arr[i] + arr[j]
                println(k, " ", j, " ", i)
                exit()
            end
        end
    end
end
println(-1)

```

[/JULIA]

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
    const n = parseInt(readline(), 10);
    const arr = readline().split(' ').map(x => parseInt(x, 10));
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            if (i === j) {
                continue;
            }
            for (let k = 0; k < n; k++) {
                if (arr[k] !== arr[j] && arr[k] !== arr[i] && arr[k] === arr[i] + arr[j]) {
                    console.log(k + 1, j + 1, i + 1);
                    process.exit(0);
                }
            }
        }
    }
    console.log(-1);
}

```

[/JAVASCRIPT]

[SWIFT]

```swift

import Foundation

var n = Int(readLine()!)!
var arr = readLine()!.split(separator: " ").map{Int(String($0))!}
for i in 0..<n {
    for j in 0..<n {
        if i == j {
            continue
        }
        for k in 0..<n {
            if arr[k] != arr[j] && arr[k] != arr[i] && arr[k] == arr[i] + arr[j] {
                print(k + 1, j + 1, i + 1)
                exit(0)
            }
        }
    }
}
print(-1)

```

[/SWIFT]

[PASCAL]

```pascal

program problem;
var n: integer;
    arr: array[1..1000] of integer;
    i, j, k: integer;
begin
    readln(n);
    for i := 1 to n do
        read(arr[i]);
    for i := 1 to n do
        for j := 1 to n do
            if i <> j then
                for k := 1 to n do
                    if arr[k] <> arr[j] and arr[k] <> arr[i] and arr[k] = arr[i] + arr[j] then
                        begin
                            writeln(k, ' ', j, ' ', i);
                            halt;
                        end;
    writeln(-1);
end.

```

[/PASCAL]

[RUST]

```rust

use std::io;

fn main() {
    let mut n = String::new();
    io::stdin().read_line(&mut n).unwrap();
    let n: i32 = n.trim().parse().unwrap();
    let mut arr: Vec<i32> = Vec::new();
    for _ in 0..n {
        let mut s = String::new();
        io::stdin().read_line(&mut s).unwrap();
        arr.push(s.trim().parse().unwrap());
    }
    for i in 0..n {
        for j in 0..n {
            if i == j {
                continue;
            }
            for k in 0..n {
                if arr[k] != arr[j] && arr[k] != arr[i] && arr[k] == arr[i] + arr[j] {
                    println!("{} {} {}", k + 1, j + 1, i + 1);
                    std::process::exit(0);
                }
            }
        }
    }
    println!("-1");
}

```

[/RUST]

[SCALA]

```scala

object Solution {
    def main(args: Array[String]) {
        val n = readLine.toInt
        val arr = readLine.split(" ").map(_.toInt)
        for (i <- 0 until n) {
            for (j <- 0 until n) {
                if (i == j) {
                    continue
                }
                for (k <- 0 until n) {
                    if (arr(k) != arr(j) && arr(k) != arr(i) && arr(k) == arr(i) + arr(j)) {
                        println(k + 1, j + 1, i + 1)
                        System.exit(0)
                    }
                }
            }
        }
        println(-1)
    }
}

```

[/SCALA]

[KOTLIN]

```kotlin

import java.util.*

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i == j) {
                continue
            }
            for (k in 0 until n) {
                if (arr[k] != arr[j] && arr[k] != arr[i] && arr[k] == arr[i] + arr[j]) {
                    println("${k + 1} ${j + 1} ${i + 1}")
                    return
                }
            }
        }
    }
    println(-1)
}

```

[/KOTLIN]

[C]

```c

#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;
    scanf("%d", &n);
    int *arr = malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i ==
