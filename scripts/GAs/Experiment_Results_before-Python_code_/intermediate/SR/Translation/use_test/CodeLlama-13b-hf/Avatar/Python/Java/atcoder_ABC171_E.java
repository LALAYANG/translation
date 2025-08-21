
[JAV]

```java
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
        int total = IntStream.of(a).reduce(0, (x, y) -> x ^ y);
        System.out.println(IntStream.of(a).map(i -> i ^ total).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}

```

[/JAV]

[PY]

```python

import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
total = reduce(lambda x, y: x ^ y, a, 0)
print(" ".join(list(map(lambda ai: str(ai ^ total), a))))

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
    int total = 0;
    for (int i = 0; i < n; i++) {
        total ^= a[i];
    }
    for (int i = 0; i < n; i++) {
        printf("%d ", a[i] ^ total);
    }
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
    int total = 0;
    for (int i = 0; i < n; i++) {
        total ^= a[i];
    }
    for (int i = 0; i < n; i++) {
        cout << a[i] ^ total << " ";
    }
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
    "strconv"
    "strings"
)

func main() {
    sc := bufio.NewScanner(os.Stdin)
    sc.Split(bufio.ScanWords)
    n := nextInt(sc)
    a := make([]int, n)
    for i := 0; i < n; i++ {
        a[i] = nextInt(sc)
    }
    total := 0
    for i := 0; i < n; i++ {
        total ^= a[i]
    }
    for i := 0; i < n; i++ {
        fmt.Printf("%d ", a[i]^total)
    }
}

func nextInt(sc *bufio.Scanner) int {
    sc.Scan()
    n, err := strconv.Atoi(sc.Text())
    if err != nil {
        panic(err)
    }
    return n
}

```

[/GO]

[RB]

```ruby

n = gets.to_i
a = gets.split.map(&:to_i)
total = a.reduce(:^)
puts a.map { |ai| ai ^ total }.join(" ")

```

[/RB]

[PHP]

```php

<?php
$n = (int)trim(fgets(STDIN));
$a = explode(" ", trim(fgets(STDIN)));
$total = 0;
foreach ($a as $ai) {
    $total ^= $ai;
}
foreach ($a as $ai) {
    echo $ai ^ $total . " ";
}

```

[/PHP]

[PL]

```perl

use strict;
use warnings;

my $n = <STDIN>;
chomp $n;
my @a = split /\s+/, <STDIN>;
my $total = 0;
foreach my $ai (@a) {
    $total ^= $ai;
}
foreach my $ai (@a) {
    print $ai ^ $total, " ";
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
        int total = a.Aggregate((x, y) => x ^ y);
        Console.WriteLine(string.Join(" ", a.Select(ai => ai ^ total)));
    }
}

```

[/CS]

[HAS]

```haskell

import Data.List

main = do
    n <- readLn :: IO Int
    a <- map read . words <$> getLine
    let total = foldr xor 0 a
    mapM_ print $ map (xor total) a

```

[/HAS]

[JA]

```javascript

const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");
const n = Number(input[0]);
const a = input[1].split(" ").map(Number);
const total = a.reduce((a, b) => a ^ b);
console.log(a.map(ai => ai ^ total).join(" "));

```

[/JA]

[KO]

```kotlin

import java.util.*

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val total = a.reduce { a, b -> a xor b }
    println(a.joinToString(" ") { it xor total })
}

```

[/KO]

[BASH]

```bash

read n
read -a a
total=0
for ai in ${a[@]}; do
    total=$(($total ^ $ai))
done
for ai in ${a[@]}; do
    echo $(($ai ^ $total))
done

```

[/BASH]

[BASH]

```bash

read n
read -a a
total=0
for ai in ${a[@]}; do
    total=$(($total ^ $ai))
done
for ai in ${a[@]}; do
    echo $(($ai ^ $total))
done

```

[/BASH]

[BASH]

```bash

read n
read -a a
total=0
for ai in ${a[@]}; do
    total=$(($total ^ $ai))
done
for ai in ${a[@]}; do
    echo $(($ai ^ $total))
done

```

[/BASH]

[BASH]

```bash

read n
read -a a
total=0
for ai in ${a[@]}; do
    total=$(($total ^ $ai))
done
for ai in ${a[@]}; do
    echo $(($ai ^ $total))
done

```

[/BASH]

[BASH]

```bash

read n
read -a a
total=0
for ai in ${a[@]}; do
    total=$(($total ^ $ai))
done
for ai in ${a[@]}; do
    echo $(($ai ^ $total))
done

```

[/BASH]

[BASH]

```bash

read n
read -a a
total=0
for ai in ${a[@]}; do
    total=$(($total ^ $ai))
done
for ai in ${a[@]}; do
    echo $(($ai ^ $total))
done

```

[/BASH]

[BASH]

```bash

read n
read -a a
total=0
for ai in ${a[@]}; do
    total=$(($total ^ $ai))
done
for ai in ${a[@]}; do
    echo $(($ai ^ $total))
done

```

[/BASH]

[BASH]

```bash

read n
read -a a
total=0
for ai in ${a[@]}; do
    total=$(($total ^ $ai))
done
for ai in ${a[@]}; do
    echo $(($ai ^ $total))
done

```

[/BASH]

[BASH]

```bash

read n
read -a a
total=0
for ai in ${a[@]}; do
    total=$(($total ^ $ai))
done
for ai in ${a[@]}; do
    echo $(($ai ^ $total))
done

```

[/BASH]

[BASH]

```bash

read n
read -a a
total=0
for ai in ${a[@]}; do
    total=$(($total ^ $ai))
done
for ai in ${a[@]}; do
    echo $(($ai ^ $total))
done

```

[/BASH]

[BASH]

```bash

read n
read -a a
total=0
for ai in ${a[@]}; do
    total=$(($total ^ $ai))
done
for ai in ${a[@]}; do
    echo $(($ai ^ $total))
done

```

[/BASH]

[BASH]

```bash

read n
read -a a
total=0
for ai in ${a[@]}; do
    total=$(($total ^ $ai))
done
for ai in ${a[@]}; do
    echo $(($ai ^ $total))
done

```

[/BASH]

[BASH]

```bash

read n
read -a a
total=0
for ai in ${a[@]}; do
    total=$(($total ^ $ai))
done
for ai in ${a[@]}; do
    echo $(($ai ^ $total))
done

```

[/BASH]

[BASH]

```bash

read n
read -a a
total=0
for ai in ${a[@]}; do
    total=$(($total ^ $ai))
done
for ai in ${a[@]}; do
    echo $(($ai ^ $total))
done

```

[/BASH]

[BASH]

```bash

read n
read -a a
total=0
for ai in ${a[@]}; do
    total=$(($total ^ $ai))
done
for ai in ${a[@]}; do
    echo $(($ai ^ $total))
done

```

[/BASH]

[BASH]

```bash

read n
read -a a
total=0
for ai in ${a[@]}; do
    total=$(($total ^ $ai))
done
for ai in ${a[@]}; do
    echo $(($ai ^ $total))
done

```

[/BASH]

[BASH]

```bash

read n
read -a a
total=0
for ai in ${a[@]}; do
    total=$(($total ^ $ai))
done
for ai in ${a[@]}; do
    echo $(($ai ^ $total))
done

```

[
