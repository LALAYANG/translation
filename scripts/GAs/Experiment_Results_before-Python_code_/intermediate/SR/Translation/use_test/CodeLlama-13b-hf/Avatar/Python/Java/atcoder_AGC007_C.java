
[JAV]
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d = d + (d / N) + (5 * x) / (2 * N);
            x += 2 * x / N;
            N--;
        }
        System.out.println(ret);
    }
}

```
[/JAV]

[PYT]
```py

import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines
N , d , x = map ( int , read ( ).split ( ) )
def main ( N , d , x ) :
    ret = 0
    while N :
        ret += d + ( N - 0.5 ) * x
        d = d + ( d / N ) + ( 5 * x ) / ( 2 * N )
        x += 2 * x / N
        N -= 1
    return ret
print ( main ( N , d , x ) )


```
[/PYT]

[C++]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int N, d, x;
    cin >> N >> d >> x;
    double ret = 0;
    while (N > 0) {
        ret += d + (N - 0.5) * x;
        d = d + (d / N) + (5 * x) / (2 * N);
        x += 2 * x / N;
        N--;
    }
    cout << ret << endl;
}

```
[/C++]

[C]
```c

#include <stdio.h>

int main() {
    int N, d, x;
    scanf("%d %d %d", &N, &d, &x);
    double ret = 0;
    while (N > 0) {
        ret += d + (N - 0.5) * x;
        d = d + (d / N) + (5 * x) / (2 * N);
        x += 2 * x / N;
        N--;
    }
    printf("%.10lf\n", ret);
}

```
[/C]

[GO]
```go

package main

import (
    "fmt"
)

func main() {
    var N, d, x int
    fmt.Scan(&N, &d, &x)
    var ret float64
    for N > 0 {
        ret += float64(d) + (float64(N) - 0.5) * float64(x)
        d = d + (d / N) + (5 * x) / (2 * N)
        x += 2 * x / N
        N--
    }
    fmt.Println(ret)
}

```
[/GO]

[RB]
```rb

=begin
# Ruby
def main
  n, d, x = gets.chomp.split.map(&:to_i)
  ret = 0
  while n > 0
    ret += d + (n - 0.5) * x
    d = d + (d / n) + (5 * x) / (2 * n)
    x += 2 * x / n
    n -= 1
  end
  printf "%.10f\n", ret
end
main
=end

```
[/RB]

[PHP]
```php

<?php
$stdin = fopen('php://stdin', 'r');
$stdout = fopen('php://stdout', 'w');

$N = intval(fgets($stdin));
$d = intval(fgets($stdin));
$x = intval(fgets($stdin));
$ret = 0;
while ($N > 0) {
    $ret += $d + ($N - 0.5) * $x;
    $d = $d + ($d / $N) + (5 * $x) / (2 * $N);
    $x += 2 * $x / $N;
    $N--;
}
echo number_format($ret, 10, '.', '');

```
[/PHP]

[PL]
```pl

# Perl
use strict;
use warnings;

my $n = <STDIN>;
chomp $n;
my $d = <STDIN>;
chomp $d;
my $x = <STDIN>;
chomp $x;
my $ret = 0;
while ($n > 0) {
    $ret += $d + ($n - 0.5) * $x;
    $d = $d + ($d / $n) + (5 * $x) / (2 * $n);
    $x += 2 * $x / $n;
    $n--;
}
printf "%.10f\n", $ret;

```
[/PL]

[CS]
```cs

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());
            int d = int.Parse(Console.ReadLine());
            int x = int.Parse(Console.ReadLine());
            double ret = 0;
            while (N > 0)
            {
                ret += d + (N - 0.5) * x;
                d = d + (d / N) + (5 * x) / (2 * N);
                x += 2 * x / N;
                N--;
            }
            Console.WriteLine("{0:F10}", ret);
        }
    }
}

```
[/CS]

[HAS]
```hs

import Text.Printf

main :: IO ()
main = do
  [n, d, x] <- map read . words <$> getLine :: IO [Int]
  let ret = sum $ map (\i -> d + (fromIntegral i - 0.5) * fromIntegral x) [1..n]
  printf "%.10f\n" ret

```
[/HAS]

[JA]
```ja

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d = d + (d / N) + (5 * x) / (2 * N);
            x += 2 * x / N;
            N--;
        }
        System.out.println(String.format("%.10f", ret));
    }
}

```
[/JA]

[KT]
```kt

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()
    val d = sc.nextInt()
    val x = sc.nextInt()
    var ret = 0.0
    while (N > 0) {
        ret += d + (N - 0.5) * x
        d = d + (d / N) + (5 * x) / (2 * N)
        x += 2 * x / N
        N--
    }
    println(String.format("%.10f", ret))
}

```
[/KT]

[KP]
```kp

#include <stdio.h>

int main() {
    int N, d, x;
    scanf("%d %d %d", &N, &d, &x);
    double ret = 0;
    while (N > 0) {
        ret += d + (N - 0.5) * x;
        d = d + (d / N) + (5 * x) / (2 * N);
        x += 2 * x / N;
        N--;
    }
    printf("%.10lf\n", ret);
}

```
[/KP]

[KO]
```ko

#include <stdio.h>

int main() {
    int N, d, x;
    scanf("%d %d %d", &N, &d, &x);
    double ret = 0;
    while (N > 0) {
        ret += d + (N - 0.5) * x;
        d = d + (d / N) + (5 * x) / (2 * N);
        x += 2 * x / N;
        N--;
    }
    printf("%.10lf\n", ret);
}

```
[/KO]

[BASH]
```bash

read -r N
read -r d
read -r x
ret=0
while [ $N -gt 0 ]; do
    ret=$(echo "$ret + $d + ($N - 0.5) * $x" | bc -l)
    d=$(echo "$d + ($d / $N) + (5 * $x) / (2 * $N)" | bc -l)
    x=$(echo "$x + 2 * $x / $N" | bc -l)
    N=$((N - 1))
done
printf "%.10f\n" $ret

```
[/BASH]

[BASH]
```bash

read -r N
read -r d
read -r x
ret=0
while [ $N -gt 0 ]; do
    ret=$(echo "$ret + $d + ($N - 0.5) * $x" | bc -l)
    d=$(echo "$d + ($d / $N) + (5 * $x) / (2 * $N)" | bc -l)
    x=$(echo "$x + 2 * $x / $N" | bc -l)
    N=$((N - 1))
done
printf "%.10f\n" $ret

```
[/BASH]

[BASH]
```bash

read -r N
read -r d
read -r x
ret=0
while [ $N -gt 0 ]; do
    ret=$(echo "$ret + $d + ($N - 0.5) * $x" | bc -l)
    d=$(echo "$d + ($d / $N) + (5 * $x) / (2 * $N)" | bc -l)
    x=$(echo "$x + 2 * $x / $N" | bc -l)
    N=$((N - 1))
done
printf "%.10f\n" $ret

```
[/BASH]

[BASH]
```bash

read -r N
read -r d
read -r x
ret=0
while [ $N -gt 0 ]; do
    ret=$(echo "$ret + $d + ($N - 0.5) * $x" | bc -l)
    d=$(echo "$d + ($d / $N) + (5 * $x) / (2 * $N)" | bc -l)
    x=$(echo "$x + 2 * $x / $N" | bc -l)
    N=$((N - 1))
done
printf "%.10f\n" $ret

```
[/BASH]

[BASH]
```bash

read -r N
read -r d
read -r x
ret=0
while [ $N -gt 0 ]; do
    ret=$(echo "$ret + $d + ($N - 0.5) * $x" | bc -l)
    d=$(echo "$d + ($d / $N) + (5 * $x) / (2 * $N)" | bc -l)
    x=$(echo "$x + 2 * $x / $N" | bc -l)
    N=$((N - 1))
done
printf "%.10f\n" $ret

```
[/BASH]

[BASH]
```bash

read -r N
read -r d
read -r x
ret=0
while [ $N -gt 0 ]; do
    ret=$(echo "$ret + $d + ($N - 0.5) * $x" | bc -l)
    d=$(echo "$d + ($d / $N) + (5 * $x) / (2 * $N)" | bc -l)
    x=$(echo "$x + 2 * $x / $N" | bc -l)
    N=$((N - 1))
done
printf "%.10f\n" $ret

```
[/BASH]

[BASH]
```bash

read -r N
read -r d
read -r x
ret=0
while [ $N -gt 0 ]; do
    ret=$(echo "$ret + $d + ($N - 0.5) * $x" | bc -l)
    d=$(echo "$d + ($d / $N) + (5 * $x) / (2 * $N)" | bc -l)
    x=$(echo "$x + 2 * $x / $N" | bc -l)
    N=$((N - 1))
done
printf "%.10f\n" $ret

```
[/BASH]

[BASH]
```bash

read -r N
read -r d
read -r x
ret=0
while [ $N -gt 0 ]; do
    ret=$(echo "$ret + $d + ($N - 0.5) * $x" | bc -l)
    d=$(echo "$d + ($d / $N) + (5 * $x) / (2 * $N)" | bc -l)
    x=$(echo "$x + 2 * $x / $N" | bc -l)
    N=$((N - 1))
done
printf "%.10f\n" $ret

```
[/BASH]

[BASH]
```bash

read -r N
read -r d
read -r x
ret=0
while [ $N -gt 0 ]; do
    ret=$(echo "$ret + $d + ($N - 0.5) * $x" | bc -l)
    d=$(echo "$d + ($d / $N) + (5 * $x) / (2 * $N)" | bc -l)
    x=$(echo "$x + 2 * $x / $N" | bc -l)
    N=$((N - 1))
done
printf "%.10f\n" $ret

```
[/BASH]

[BASH]
```bash

read -r N
read -r d
read -r x
ret=0
while [ $N -gt 0 ]; do
    ret=$(echo "$ret + $d + ($N - 0.5) * $x" | bc -l)
    d=$(echo "$d + ($d / $N) + (5 * $x) / (
