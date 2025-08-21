
[JAV]
```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int pre = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += Math.max(0, Math.min(pre - 1, a[i]));
            pre = Math.max(0, Math.min(pre - 1, a[i]));
        }
        System.out.println(result);
    }
}
```
[/JAV]

[PY]
```python
import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
a.sort(reverse=True)
pre = float('inf')
result = 0

for i in range(n):
    result += max(0, min(pre - 1, a[i]))
    pre = max(0, min(pre - 1, a[i]))

print(result)
```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int n;
    scanf("%d", &n);
    int *a = malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    qsort(a, n, sizeof(int), cmp);
    int pre = INT_MAX;
    int result = 0;
    for (int i = 0; i < n; i++) {
        result += max(0, min(pre - 1, a[i]));
        pre = max(0, min(pre - 1, a[i]));
    }
    printf("%d", result);
    return 0;
}

int cmp(const void *a, const void *b) {
    return *(int *)b - *(int *)a;
}
```
[/C]

[CPP]
```cpp
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    sort(a.begin(), a.end(), greater<int>());
    int pre = INT_MAX;
    int result = 0;
    for (int i = 0; i < n; i++) {
        result += max(0, min(pre - 1, a[i]));
        pre = max(0, min(pre - 1, a[i]));
    }
    cout << result;
    return 0;
}
```
[/CPP]

[C#]
```cs
using System;
using System.Linq;

class Solution {
    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        int[] a = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
        Array.Sort(a, (x, y) => y.CompareTo(x));
        int pre = int.MaxValue;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += Math.Max(0, Math.Min(pre - 1, a[i]));
            pre = Math.Max(0, Math.Min(pre - 1, a[i]));
        }
        Console.WriteLine(result);
    }
}
```
[/C#]

[PHP]
```php
<?php
$n = intval(fgets(STDIN));
$a = array_map('intval', explode(' ', fgets(STDIN)));
sort($a, SORT_NUMERIC | SORT_DESC);
$pre = PHP_INT_MAX;
$result = 0;
foreach ($a as $i) {
    $result += max(0, min($pre - 1, $i));
    $pre = max(0, min($pre - 1, $i));
}
echo $result;
```
[/PHP]

[RUBY]
```ruby
n = gets.to_i
a = gets.split.map(&:to_i)
a.sort! { |x, y| y <=> x }
pre = Float::INFINITY
result = 0
a.each do |i|
    result += [0, [pre - 1, i].min].max
    pre = [0, [pre - 1, i].min].max
end
puts result
```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
    "sort"
    "strconv"
    "strings"
)

func main() {
    var n int
    fmt.Scan(&n)
    a := make([]int, n)
    for i := 0; i < n; i++ {
        fmt.Scan(&a[i])
    }
    sort.Sort(sort.Reverse(sort.IntSlice(a)))
    pre := int(^uint(0) >> 1)
    result := 0
    for _, i := range a {
        result += max(0, min(pre-1, i))
        pre = max(0, min(pre-1, i))
    }
    fmt.Println(result)
}

func max(a, b int) int {
    if a > b {
        return a
    }
    return b
}

func min(a, b int) int {
    if a < b {
        return a
    }
    return b
}
```
[/GO]

[PAS]
```pascal
program Problem1001A;
{$APPTYPE CONSOLE}
var
  n: Integer;
  a: array of Integer;
  i, pre, result: Integer;

begin
  ReadLn(n);
  SetLength(a, n);
  for i := 0 to n - 1 do
    Read(a[i]);
  pre := MaxInt;
  result := 0;
  for i := 0 to n - 1 do
  begin
    result := result + Max(0, Min(pre - 1, a[i]));
    pre := Max(0, Min(pre - 1, a[i]));
  end;
  WriteLn(result);
end.
```
[/PAS]

[JAVASCRIPT]
```javascript
const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');
const n = parseInt(input[0]);
const a = input[1].split(' ').map(x => parseInt(x));
a.sort((a, b) => b - a);
let pre = Number.MAX_SAFE_INTEGER;
let result = 0;
for (let i = 0; i < n; i++) {
    result += Math.max(0, Math.min(pre - 1, a[i]));
    pre = Math.max(0, Math.min(pre - 1, a[i]));
}
console.log(result);
```
[/JAVASCRIPT]

[SWIFT]
```swift
import Foundation

let n = Int(readLine()!)!
let a = readLine()!.split(separator: " ").map{Int(String($0))!}
a.sort(by: >)
var pre = Int.max
var result = 0
for i in 0..<n {
    result += max(0, min(pre - 1, a[i]))
    pre = max(0, min(pre - 1, a[i]))
}
print(result)
```
[/SWIFT]

[PYTHON]
```python
n = int(input())
a = list(map(int, input().split()))
a.sort(reverse=True)
pre = float('inf')
result = 0
for i in range(n):
    result += max(0, min(pre - 1, a[i]))
    pre = max(0, min(pre - 1, a[i]))
print(result)
```
[/PYTHON]

[RUST]
```rust
use std::io;

fn main() {
    let mut n = String::new();
    io::stdin().read_line(&mut n).unwrap();
    let n: i32 = n.trim().parse().unwrap();
    let mut a = Vec::new();
    for _ in 0..n {
        let mut s = String::new();
        io::stdin().read_line(&mut s).unwrap();
        a.push(s.trim().parse().unwrap());
    }
    a.sort_by(|a, b| b.cmp(a));
    let mut pre = i32::max_value();
    let mut result = 0;
    for i in 0..n {
        result += std::cmp::max(0, std::cmp::min(pre - 1, a[i]));
        pre = std::cmp::max(0, std::cmp::min(pre - 1, a[i]));
    }
    println!("{}", result);
}
```
[/RUST]

[JULIA]
```julia
n = parse(Int, readline())
a = parse.(Int, split(readline()))
sort!(a, rev=true)
pre = typemax(Int)
result = 0
for i in 1:n
    result += max(0, min(pre - 1, a[i]))
    pre = max(0, min(pre - 1, a[i]))
end
println(result)
```
[/JULIA]

[CLOJURE]
```clojure
(let [n (read-string (read-line))
      a (sort (map read-string (clojure.string/split (read-line) #" ")) >)
      pre (apply max (repeat Integer/MAX_VALUE))
      result (reduce (fn [r x] (+ r (max 0 (min (- pre 1) x)))) 0 a)]
  (println result))
```
[/CLOJURE]

[BASH]
```bash
read n
read -a a
for ((i = 0; i < n; i++)); do
    read -a a[$i]
done
a=($(for i in "${a[@]}"; do echo $i; done | sort -nr))
pre=9223372036854775807
result=0
for i in "${a[@]}"; do
    result=$((result + $((i > pre - 1 ? 0 : i))))
    pre=$((i > pre - 1 ? 0 : i))
done
echo $result
```
[/BASH]

[BASH]
```bash
read n
read -a a
for ((i = 0; i < n; i++)); do
    read -a a[$i]
done
a=($(for i in "${a[@]}"; do echo $i; done | sort -nr))
pre=9223372036854775807
result=0
for i in "${a[@]}"; do
    result=$((result + $((i > pre - 1 ? 0 : i))))
    pre=$((i > pre - 1 ? 0 : i))
done
echo $result
```
[/BASH]

[BASH]
```bash
read n
read -a a
for ((i = 0; i < n; i++)); do
    read -a a[$i]
done
a=($(for i in "${a[@]}"; do echo $i; done | sort -nr))
pre=9223372036854775807
result=0
for i in "${a[@]}"; do
    result=$((result + $((i > pre - 1 ? 0 : i))))
    pre=$((i > pre - 1 ? 0 : i))
done
echo $result
```
[/BASH]

[BASH]
```bash
read n
read -a a
for ((i = 0; i < n; i++)); do
    read -a a[$i]
done
a=($(for i in "${a[@]}"; do echo $i; done | sort -nr))
pre=9223372036854775807
result=0
for i in "${a[@]}"; do
    result=$((result + $((i > pre - 1 ? 0 : i))))
    pre=$((i > pre - 1 ? 0 : i))
done
echo $result
```
[/BASH]

[BASH]
```bash
read n
read -a a
for ((i = 0; i < n; i++)); do
    read -a a[$i]
done
a=($(for i in "${a[@]}"; do echo $i; done | sort -nr))
pre=9223372036854775807
result=0
for i in "${a[@]}"; do
    result=$((result + $((i > pre - 1 ? 0 : i))))
    pre=$((i > pre - 1 ? 0 : i))
done
echo $result
```
[/BASH]

[BASH]
```bash
read n
read -a a
for ((i = 0; i < n; i++)); do
    read -a a[$i]
done
a=($(for i in "${a[@]}"; do echo $i; done | sort -nr))
pre=9223372036854775807
result=0
for i in "${a[@]}"; do
    result=$((result + $((i > pre - 1 ? 0 : i))))
    pre=$((i > pre - 1 ? 0 : i))
