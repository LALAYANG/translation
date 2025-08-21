
[JAV]
```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] M = new int[n];
        for (int i = 0; i < n; i++) {
            M[i] = sc.nextInt();
        }
        int m = 0;
        for (int j = 0; j < n; j++) {
            for (int p = 0; p < n; p++) {
                if (M[p] == 0) {
                    System.out.print(p + 1 + " ");
                    break;
                }
            }
            for (int l = p - k; l < p; l++) {
                M[l] -= 1;
            }
            M[p] -= 1;
        }
    }
}

```
[/JAV]

[PYT]
```python

n, k = map(int, input().split())
M = [int(i) for i in input().split()]
m = 0
for j in range(n):
    for p in range(n):
        if (0 == M[p]):
            print(p + 1, end=' ')
            break
    for l in range(p + 1 - k):
        M[l] -= 1
    M[p] -= 1

```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k;
    cin >> n >> k;
    vector<int> M(n);
    for (int i = 0; i < n; i++) {
        cin >> M[i];
    }
    int m = 0;
    for (int j = 0; j < n; j++) {
        for (int p = 0; p < n; p++) {
            if (M[p] == 0) {
                cout << p + 1 << " ";
                break;
            }
        }
        for (int l = p - k; l < p; l++) {
            M[l] -= 1;
        }
        M[p] -= 1;
    }
}

```
[/CPP]

[C]
```c

#include <stdio.h>

int main() {
    int n, k;
    scanf("%d %d", &n, &k);
    int M[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &M[i]);
    }
    int m = 0;
    for (int j = 0; j < n; j++) {
        for (int p = 0; p < n; p++) {
            if (M[p] == 0) {
                printf("%d ", p + 1);
                break;
            }
        }
        for (int l = p - k; l < p; l++) {
            M[l] -= 1;
        }
        M[p] -= 1;
    }
}

```
[/C]

[PHP]
```php

<?php
$n = (int)trim(fgets(STDIN));
$k = (int)trim(fgets(STDIN));
$M = array_map('intval', explode(' ', trim(fgets(STDIN))));
$m = 0;
for ($j = 0; $j < $n; $j++) {
    for ($p = 0; $p < $n; $p++) {
        if ($M[$p] == 0) {
            echo $p + 1 . ' ';
            break;
        }
    }
    for ($l = $p - $k; $l < $p; $l++) {
        $M[$l] -= 1;
    }
    $M[$p] -= 1;
}

```
[/PHP]

[RUBY]
```ruby

n, k = gets.split.map(&:to_i)
M = gets.split.map(&:to_i)
m = 0
for j in 0..n-1 do
    for p in 0..n-1 do
        if M[p] == 0
            puts p + 1
            break
        end
    end
    for l in p - k..p-1 do
        M[l] -= 1
    end
    M[p] -= 1
end

```
[/RUBY]

[GO]
```go

package main

import "fmt"

func main() {
    var n, k int
    fmt.Scan(&n, &k)
    M := make([]int, n)
    for i := 0; i < n; i++ {
        fmt.Scan(&M[i])
    }
    m := 0
    for j := 0; j < n; j++ {
        for p := 0; p < n; p++ {
            if M[p] == 0 {
                fmt.Printf("%d ", p+1)
                break
            }
        }
        for l := p - k; l < p; l++ {
            M[l] -= 1
        }
        M[p] -= 1
    }
}

```
[/GO]

[BASH]
```bash

read n k
read -a M
m=0
for ((j=0; j<n; j++)); do
    for ((p=0; p<n; p++)); do
        if [ ${M[p]} -eq 0 ]; then
            echo $((p+1))
            break
        fi
    done
    for ((l=p-k; l<p; l++)); do
        M[$l]=$((M[l]-1))
    done
    M[$p]=$((M[p]-1))
done

```
[/BASH]

[PERL]
```perl

use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my $k = <STDIN>;
chomp($k);
my @M = split(' ', <STDIN>);
my $m = 0;
for (my $j = 0; $j < $n; $j++) {
    for (my $p = 0; $p < $n; $p++) {
        if ($M[$p] == 0) {
            print $p + 1, ' ';
            last;
        }
    }
    for (my $l = $p - $k; $l < $p; $l++) {
        $M[$l] -= 1;
    }
    $M[$p] -= 1;
}

```
[/PERL]

[PASCAL]
```pascal

program problem;
var
  n, k, m: integer;
  M: array[1..1000] of integer;
begin
  readln(n, k);
  for var i := 1 to n do
    read(M[i]);
  m := 0;
  for var j := 1 to n do
  begin
    for var p := 1 to n do
      if M[p] = 0 then
      begin
        writeln(p);
        break;
      end;
    for var l := p - k to p - 1 do
      M[l] := M[l] - 1;
    M[p] := M[p] - 1;
  end;
end.

```
[/PASCAL]

[JULIA]
```julia

n, k = parse.(Int, split(readline()))
M = parse.(Int, split(readline()))
m = 0
for j in 1:n
    for p in 1:n
        if M[p] == 0
            print(p, " ")
            break
        end
    end
    for l in p - k:p - 1
        M[l] -= 1
    end
    M[p] -= 1
end

```
[/JULIA]

[LUA]
```lua

n, k = io.read("*n", "*n")
M = {}
for i = 1, n do
    M[i] = io.read("*n")
end
m = 0
for j = 1, n do
    for p = 1, n do
        if M[p] == 0 then
            print(p, " ")
            break
        end
    end
    for l = p - k, p - 1 do
        M[l] = M[l] - 1
    end
    M[p] = M[p] - 1
end

```
[/LUA]

[OBJECTIVE-C]
```objectivec

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int n, k;
        scanf("%d %d", &n, &k);
        int M[n];
        for (int i = 0; i < n; i++) {
            scanf("%d", &M[i]);
        }
        int m = 0;
        for (int j = 0; j < n; j++) {
            for (int p = 0; p < n; p++) {
                if (M[p] == 0) {
                    printf("%d ", p + 1);
                    break;
                }
            }
            for (int l = p - k; l < p; l++) {
                M[l] -= 1;
            }
            M[p] -= 1;
        }
    }
    return 0;
}

```
[/OBJECTIVE-C]

[COFFEESCRIPT]
```coffeescript

n = parseInt(readline())
k = parseInt(readline())
M = (parseInt(i) for i in readline().split(' '))
m = 0
for j in [0..n-1]
    for p in [0..n-1]
        if M[p] == 0
            console.log(p + 1)
            break
    for l in [p - k..p-1]
        M[l] -= 1
    M[p] -= 1

```
[/COFFEESCRIPT]

[CSHARP]
```csharp

using System;

class Solution
{
    static void Main(String[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine());
        int k = Convert.ToInt32(Console.ReadLine());
        int[] M = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
        int m = 0;
        for (int j = 0; j < n; j++)
        {
            for (int p = 0; p < n; p++)
            {
                if (M[p] == 0)
                {
                    Console.Write(p + 1 + " ");
                    break;
                }
            }
            for (int l = p - k; l < p; l++)
            {
                M[l] -= 1;
            }
            M[p] -= 1;
        }
    }
}

```
[/CSHARP]

[VB]
```vb

Module Module1

    Sub Main()
        Dim n As Integer = Integer.Parse(Console.ReadLine())
        Dim k As Integer = Integer.Parse(Console.ReadLine())
        Dim M As Integer() = Array.ConvertAll(Console.ReadLine().Split(" "), Function(x) Integer.Parse(x))
        Dim m As Integer = 0
        For j As Integer = 0 To n - 1
            For p As Integer = 0 To n - 1
                If M(p) = 0 Then
                    Console.Write(p + 1 & " ")
                    Exit For
                End If
            Next
            For l As Integer = p - k To p - 1
                M(l) -= 1
            Next
            M(p) -= 1
        Next
    End Sub

End Module

```
[/VB]

[D]
```d

import std.stdio;

void main()
{
    int n, k;
    int[] M;
    int m;
    writefln("Enter n and k:");
    readf("%d %d", n, k);
    writefln("Enter M:");
    M = readf("%*s", n).map!int;
    m = 0;
    for (int j = 0; j < n; j++)
    {
        for (int p = 0; p < n; p++)
        {
            if (M[p] == 0)
            {
                writeln(p + 1);
                break;
            }
        }
        for (int l = p - k; l < p; l++)
        {
            M[l] -= 1;
        }
        M[p] -= 1;
    }
}

```
[/D]

[R]
```r

n <- as.integer(readline(prompt="Enter n: "))
k <- as.integer(readline(prompt="Enter k: "))
M <- as.integer(readline(prompt="Enter M: "))
m <- 0
for (j in 1:n) {
    for (p in 1:n) {
        if (M[p] == 0) {
            cat(p, " ")
            break
        }
    }
    for (l in p - k:p - 1) {
        M[l] <- M[l] - 1
    }
    M[p] <- M[p] - 1
}

```
[/R]

[KOTLIN]
```kotlin

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    val M = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    var m = 0
    for (j in 0 until n) {
        for (p in 0 until n) {
            if (M[p] == 0) {
                print("${p + 1} ")
                break
            }
        }
        for (l in p - k until p) {
            M[l] -= 1
        }
        M[p] -= 1
    }
}

```
[/KOTLIN]

[SCALA]
```scala

object Solution {
    def main(args: Array[String]) {
        val n = readLine().toInt
        val k = readLine().toInt
        val M = readLine().split(" ").map(_.toInt)
        var m = 0
        for (j <- 0 until n) {
            for (p <- 0 until n) {
                if (M(p) == 0) {
                    print(p + 1 + " ")
                    break
                }
            }
            for (l <- p - k until p) {
                M(l) -= 1
            }
            M(p) -= 1
        }
    }
}

```
[/SCALA]

[SW
