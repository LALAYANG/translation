
[JAV]
```java

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 1) {
                t++;
            }
        }
        System.out.println(t / n);
    }
}

```
[/JAV]

[PYT]
```py

import math

n = int(input())
t = 0
for i in range(n):
    if (i + 1) % 2 == 1:
        t += 1
print(t / n)

```
[/PYT]

[C++]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    int t = 0;
    for (int i = 0; i < n; i++) {
        if ((i + 1) % 2 == 1) {
            t++;
        }
    }
    cout << t / n << endl;
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
    int t = 0;
    for (int i = 0; i < n; i++) {
        if ((i + 1) % 2 == 1) {
            t++;
        }
    }
    printf("%d\n", t / n);
}

```
[/C]

[PHP]
```php

<?php
$n = intval(fgets(STDIN));
$t = 0;
for ($i = 0; $i < $n; $i++) {
    if (($i + 1) % 2 == 1) {
        $t++;
    }
}
echo $t / $n;

```
[/PHP]

[RUBY]
```ruby

n = gets.to_i
t = 0
for i in 0..n-1 do
    if (i + 1) % 2 == 1
        t += 1
    end
end
puts t / n

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
    t := 0
    for i := 0; i < n; i++ {
        if (i + 1) % 2 == 1 {
            t++
        }
    }
    fmt.Println(float64(t) / float64(n))
}

```
[/GO]

[BASH]
```bash

read n
t=0
for ((i=0; i<$n; i++)); do
    if [ $((i+1)) -eq $((i+1)%2) ]; then
        t=$((t+1))
    fi
done
echo "scale=10;$t/$n" | bc

```
[/BASH]

[PERL]
```perl

use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my $t = 0;
for (my $i = 0; $i < $n; $i++) {
    if (($i + 1) % 2 == 1) {
        $t++;
    }
}
printf("%.10f\n", $t / $n);

```
[/PERL]

[PASCAL]
```pascal

program next_int;
var
  n, t, i: integer;
begin
  readln(n);
  t := 0;
  for i := 1 to n do
    if (i mod 2) = 1 then
      t := t + 1;
  writeln(t / n:10:10);
end.

```
[/PASCAL]

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
    let t = 0;
    for (let i = 0; i < n; i++) {
        if ((i + 1) % 2 === 1) {
            t++;
        }
    }
    console.log(t / n);
}

```
[/JAVASCRIPT]

[SWIFT]
```swift

import Foundation

let n = Int(readLine()!)!
var t = 0
for i in 0..<n {
    if (i + 1) % 2 == 1 {
        t += 1
    }
}
print(Double(t) / Double(n))

```
[/SWIFT]

[RUST]
```rust

use std::io;

fn main() {
    let mut n = String::new();
    io::stdin().read_line(&mut n).unwrap();
    let n: i32 = n.trim().parse().unwrap();
    let mut t = 0;
    for i in 0..n {
        if (i + 1) % 2 == 1 {
            t += 1;
        }
    }
    println!("{}", t as f64 / n as f64);
}

```
[/RUST]

[SCALA]
```scala

object Solution {
    def main(args: Array[String]) {
        val n = readLine().toInt
        var t = 0
        for (i <- 0 to n - 1) {
            if ((i + 1) % 2 == 1) {
                t += 1
            }
        }
        println(t / n)
    }
}

```
[/SCALA]

[BASH]
```bash

read n
t=0
for ((i=0; i<$n; i++)); do
    if [ $((i+1)) -eq $((i+1)%2) ]; then
        t=$((t+1))
    fi
done
echo "scale=10;$t/$n" | bc

```
[/BASH]

[JULIA]
```julia

n = parse(Int, readline())
t = 0
for i in 1:n
    if (i + 1) % 2 == 1
        t += 1
    end
end
println(t / n)

```
[/JULIA]

[COFFEESCRIPT]
```coffeescript

readline = require 'readline'
rl = readline.createInterface input: process.stdin, output: process.stdout
n = parseInt rl.question 'n: '
t = 0
for i in [0..n]
    if (i + 1) % 2 == 1
        t++
console.log t / n

```
[/COFFEESCRIPT]

[C#]
```cs

using System;

class Solution
{
    static void Main(String[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine());
        int t = 0;
        for (int i = 0; i < n; i++)
        {
            if ((i + 1) % 2 == 1)
            {
                t++;
            }
        }
        Console.WriteLine(t / n);
    }
}

```
[/C#]

[VB]
```vb

Imports System

Module Solution
    Sub Main()
        Dim n As Integer = Convert.ToInt32(Console.ReadLine())
        Dim t As Integer = 0
        For i As Integer = 0 To n - 1
            If (i + 1) Mod 2 = 1 Then
                t += 1
            End If
        Next
        Console.WriteLine(t / n)
    End Sub
End Module

```
[/VB]

[D]
```d

import std.stdio;

void main()
{
    int n;
    writeln("n = ");
    readf("%d", &n);
    int t = 0;
    for (int i = 0; i < n; i++)
    {
        if ((i + 1) % 2 == 1)
        {
            t++;
        }
    }
    writeln(t / n);
}

```
[/D]

[R]
```r

n <- as.integer(readline(prompt="n = "))
t <- 0
for (i in 1:n) {
    if ((i + 1) %% 2 == 1) {
        t <- t + 1
    }
}
cat(t / n, "\n")

```
[/R]

[KOTLIN]
```kotlin

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var t = 0
    for (i in 0 until n) {
        if ((i + 1) % 2 == 1) {
            t++
        }
    }
    println(t / n)
}

```
[/KOTLIN]

[ELIXIR]
```elixir

n = String.to_integer(IO.gets(""))
t = 0
for i <- 0..n-1 do
    if (i + 1) rem 2 == 1 do
        t = t + 1
    end
end
IO.puts(t / n)

```
[/ELIXIR]

[FORTRAN]
```fortran

      program next_int
      implicit none
      integer :: n, t, i
      read *, n
      t = 0
      do i = 1, n
        if (mod(i, 2) .eq. 1) then
          t = t + 1
        end if
      end do
      write (*, '(f10.10)') real(t) / real(n)
      end program next_int

```
[/FORTRAN]

[LUA]
```lua

io.write("n = ")
n = io.read("*n")
t = 0
for i = 1, n do
    if (i + 1) % 2 == 1 then
        t = t + 1
    end
end
print(t / n)

```
[/LUA]

[MATLAB]
```matlab

n = input('n = ');
t = 0;
for i = 1:n
    if (i + 1) % 2 == 1
        t = t + 1;
    end
end
disp(t / n)

```
[/MATLAB]

[OCTAVE]
```octave

n = input('n = ');
t = 0;
for i = 1:n
    if (i + 1) % 2 == 1
        t = t + 1;
    end
end
disp(t / n)

```
[/OCTAVE]

[POWERSHELL]
```powershell

$n = Read-Host "n = "
$t = 0
for ($i = 0; $i -lt $n; $i++) {
    if (($i + 1) % 2 -eq 1) {
        $t++
    }
}
Write-Output $t / $n

```
[/POWERSHELL]

[AWK]
```awk

BEGIN {
    print "n = "
    getline n
    t = 0
    for (i = 0; i < n; i++) {
        if ((i + 1) % 2 == 1) {
            t++
        }
    }
    printf("%.10f\n", t / n)
}

```
[/AWK]

[DART]
```dart

import 'dart:io';

void main() {
    int n = int.parse(stdin.readLineSync());
    int t = 0;
    for (int i = 0; i < n; i++) {
        if ((i + 1) % 2 == 1) {
            t++;
        }
    }
    print(t / n);
}

```
[/DART]

[KONAN]
```konan

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var t = 0
    for (i in 0 until n) {
        if ((i + 1) % 2 == 1) {
            t++
        }
    }
    println(t / n)
}

```
[/KONAN]

[RACKET]
```racket

(define n (read))
(define t 0)
(for ([i (in-range 0 n)])
  (if (eq? (modulo (+ i 1) 2) 1)
      (set! t (+ t 1))))
(display (quotient t n))
(newline)

```
[/RACKET]

[F#]
```fsharp

let n = System.Int32.Parse(System.Console.ReadLine())
let mutable t = 0
for i in 0 .. n - 1 do
    if (i + 1) % 2 = 1 then
        t <- t + 1
printfn "%.10f" (float t / float n)

```
[/F#]

[LISP]
```lisp

(defun main ()
  (let ((n (read)))
    (let ((t 0))
      (loop for i from 0 to (1- n) do
        (if (= (mod (+ i 1) 2) 1)
          (incf t)))
      (format t "~10,10f~%" (/ t n)))))

```
[/LISP]

[TYPESCRIPT]
```typescript

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
    let t = 0;
    for (let i = 0; i < n; i++) {
        if
