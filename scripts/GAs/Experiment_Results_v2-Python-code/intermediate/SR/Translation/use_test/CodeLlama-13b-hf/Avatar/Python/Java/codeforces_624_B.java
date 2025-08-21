
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
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.max(0, Math.min(pre - 1, a[i]));
            pre = Math.max(0, Math.min(pre - 1, a[i]));
        }
        System.out.println(ans);
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
ans = 0
for i in range(n):
    ans += max(0, min(pre - 1, a[i]))
    pre = max(0, min(pre - 1, a[i]))
print(ans)
```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int cmp(const void *a, const void *b) {
    return *(int *)b - *(int *)a;
}

int main() {
    int n;
    scanf("%d", &n);
    int *a = malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++) {
        scanf("%d", a + i);
    }
    qsort(a, n, sizeof(int), cmp);
    int pre = INT_MAX;
    int ans = 0;
    for (int i = 0; i < n; i++) {
        ans += max(0, min(pre - 1, a[i]));
        pre = max(0, min(pre - 1, a[i]));
    }
    printf("%d\n", ans);
    return 0;
}
```
[/C]

[CPP]
```cpp
#include <bits/stdc++.h>
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
    int ans = 0;
    for (int i = 0; i < n; i++) {
        ans += max(0, min(pre - 1, a[i]));
        pre = max(0, min(pre - 1, a[i]));
    }
    cout << ans << endl;
    return 0;
}
```
[/CPP]

[GO]
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
    sc.Scan()
    n, _ := fmt.Sscanf(sc.Text(), "%d", &n)
    a := make([]int, n)
    for i := 0; i < n; i++ {
        sc.Scan()
        fmt.Sscanf(sc.Text(), "%d", &a[i])
    }
    sort.Sort(sort.Reverse(sort.IntSlice(a)))
    pre := int(^uint(0) >> 1)
    ans := 0
    for i := 0; i < n; i++ {
        ans += max(0, min(pre-1, a[i]))
        pre = max(0, min(pre-1, a[i]))
    }
    fmt.Println(ans)
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

[RB]
```ruby
n = gets.to_i
a = gets.split.map(&:to_i)
a.sort! { |a, b| b <=> a }
pre = 2**31 - 1
ans = 0
a.each do |ai|
  ans += [0, pre - 1].min * [1, ai].max
  pre = [0, pre - 1].min * [1, ai].max
end
puts ans
```
[/RB]

[PHP]
```php
<?php
$n = (int)trim(fgets(STDIN));
$a = array_map('intval', explode(' ', trim(fgets(STDIN))));
sort($a);
rsort($a);
$pre = 2147483647;
$ans = 0;
foreach ($a as $ai) {
    $ans += max(0, min($pre - 1, $ai));
    $pre = max(0, min($pre - 1, $ai));
}
echo $ans;
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp $n;
my @a = split /\s+/, <STDIN>;
my $pre = 2**31 - 1;
my $ans = 0;
foreach my $ai (@a) {
    $ans += max(0, min($pre - 1, $ai));
    $pre = max(0, min($pre - 1, $ai));
}
print $ans, "\n";

sub max {
    my ($a, $b) = @_;
    return $a > $b ? $a : $b;
}

sub min {
    my ($a, $b) = @_;
    return $a < $b ? $a : $b;
}
```
[/PL]

[CS]
```csharp
using System;
using System.Linq;

class Solution
{
    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine());
        int[] a = Console.ReadLine().Split().Select(int.Parse).ToArray();
        Array.Sort(a);
        Array.Reverse(a);
        int pre = int.MaxValue;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.Max(0, Math.Min(pre - 1, a[i]));
            pre = Math.Max(0, Math.Min(pre - 1, a[i]));
        }
        Console.WriteLine(ans);
    }
}
```
[/CS]

[HAS]
```haskell
import Data.List

main = do
    n <- readLn
    a <- map read . words <$> getLine
    let a' = reverse $ sort a
        pre = 2147483647
        ans = foldl (\acc x -> acc + max 0 (min (pre - 1) x)) 0 a'
    print ans
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
    .on('close', function () {
        let [n, ...a] = input;
        a = a.map(Number);
        a.sort((a, b) => b - a);
        let pre = 2147483647;
        let ans = 0;
        for (let i = 0; i < n; i++) {
            ans += Math.max(0, Math.min(pre - 1, a[i]));
            pre = Math.max(0, Math.min(pre - 1, a[i]));
        }
        console.log(ans);
        process.exit();
    });
```
[/JA]

[KT]
```kotlin
import java.util.*

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    a.sort()
    a.reverse()
    var pre = Int.MAX_VALUE
    var ans = 0
    for (ai in a) {
        ans += Math.max(0, Math.min(pre - 1, ai))
        pre = Math.max(0, Math.min(pre - 1, ai))
    }
    println(ans)
}
```
[/KT]

[LUA]
```lua
local n = io.read("*n")
local a = {}
for i = 1, n do
    a[i] = io.read("*n")
end
table.sort(a)
table.sort(a, function(a, b) return a > b end)
local pre = 2147483647
local ans = 0
for i = 1, n do
    ans = ans + math.max(0, math.min(pre - 1, a[i]))
    pre = math.max(0, math.min(pre - 1, a[i]))
end
print(ans)
```
[/LUA]

[MAT]
```matlab
n = input('');
a = input('');
a = str2num(a);
[a, idx] = sort(a, 'descend');
pre = 2147483647;
ans = 0;
for i = 1:n
    ans = ans + max(0, min(pre - 1, a(i)));
    pre = max(0, min(pre - 1, a(i)));
end
disp(ans)
```
[/MAT]

[PAS]
```pascal
program Problem;

{$APPTYPE CONSOLE}

var
  n: Integer;
  a: array of Integer;
  pre: Integer;
  ans: Integer;
  i: Integer;

begin
  ReadLn(n);
  SetLength(a, n);
  for i := 1 to n do
    Read(a[i]);
  pre := 2147483647;
  ans := 0;
  for i := 1 to n do
  begin
    ans := ans + Max(0, Min(pre - 1, a[i]));
    pre := Max(0, Min(pre - 1, a[i]));
  end;
  WriteLn(ans);
end.
```
[/PAS]

[PB]
```powershell
$n = Read-Host
$a = Read-Host
$a = $a.Split()
$a = $a | ForEach-Object { [int]$_ }
$a = $a | Sort-Object -Descending
$pre = 2147483647
$ans = 0
for ($i = 0; $i -lt $n; $i++) {
    $ans += [Math]::Max(0, [Math]::Min($pre - 1, $a[$i]))
    $pre = [Math]::Max(0, [Math]::Min($pre - 1, $a[$i]))
}
Write-Host $ans
```
[/PB]

[R]
```r
n <- as.integer(readline(prompt=""))
a <- as.integer(readline(prompt=""))
a <- sort(a, decreasing=TRUE)
pre <- 2147483647
ans <- 0
for (i in 1:n) {
    ans <- ans + max(0, min(pre - 1, a[i]))
    pre <- max(0, min(pre - 1, a[i]))
}
cat(ans, "\n")
```
[/R]

[RK]
```ruby
n = gets.to_i
a = gets.split.map(&:to_i)
a.sort! { |a, b| b <=> a }
pre = 2**31 - 1
ans = 0
a.each do |ai|
  ans += [0, pre - 1].min * [1, ai].max
  pre = [0, pre - 1].min * [1, ai].max
end
puts ans
```
[/RK]

[SC]
```scala
object Solution {
    def main(args: Array[String]) {
        val n = readLine.toInt
        val a = readLine.split(" ").map(_.toInt)
        val pre = 2147483647
        var ans = 0
        for (i <- 0 until n) {
            ans += math.max(0, math.min(pre - 1, a(i)))
            pre = math.max(0, math.min(pre - 1, a(i)))
        }
        println(ans)
    }
}
```
[/SC]

[VB]
```vb
Imports System
Imports System.Collections.Generic
Imports System.Linq

Module Program
    Sub Main(args As String())
        Dim n As Integer = Integer.Parse(Console.ReadLine())
        Dim a As Integer() = Console.ReadLine().Split(" ").Select(Function(x) Integer.Parse(x)).ToArray()
        Array.Sort(a)
        Array.Reverse(a)
        Dim pre As Integer = Integer.MaxValue
        Dim ans As Integer = 0
        For i As Integer = 0 To n - 1
            ans += Math.Max(0, Math.Min(pre - 1, a(i)))
            pre = Math.Max(0, Math.Min(pre - 1, a(i)))
        Next
        Console.WriteLine(ans)
    End Sub
End Module
```
[/VB]

[ZS]
```zenscript
import crafttweaker.api.util.MCParsedArgument;

val n = readLine() as int;
val a = read
