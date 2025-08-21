
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int f = sc.nextInt();
            int t = sc.nextInt();
            int x = t - (s - f);
            if (x > c) {
                c = x;
            }
        }
        System.out.println(s + c);
    }
}

```
[/JAV]

[PYT]
```py
import sys
input = sys.stdin.readline
n , s = map ( int , input ( ).split ( ) )
c = 0
for _ in range ( n ) :
    f , t = map ( int , input ( ).split ( ) )
    x = t - ( s - f )
    if x > c :
        c = x
print ( s + c )


```
[/PYT]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n, s;
    cin >> n >> s;
    int c = 0;
    for (int i = 0; i < n; i++)
    {
        int f, t;
        cin >> f >> t;
        int x = t - (s - f);
        if (x > c)
            c = x;
    }
    cout << s + c;
    return 0;
}

```
[/C++]

[C]
```c
#include <stdio.h>

int main()
{
    int n, s;
    scanf("%d %d", &n, &s);
    int c = 0;
    for (int i = 0; i < n; i++)
    {
        int f, t;
        scanf("%d %d", &f, &t);
        int x = t - (s - f);
        if (x > c)
            c = x;
    }
    printf("%d", s + c);
    return 0;
}

```
[/C]

[PHP]
```php
<?php
$n = (int)trim(fgets(STDIN));
$s = (int)trim(fgets(STDIN));
$c = 0;
for ($i = 0; $i < $n; $i++) {
    $f = (int)trim(fgets(STDIN));
    $t = (int)trim(fgets(STDIN));
    $x = $t - ($s - $f);
    if ($x > $c) {
        $c = $x;
    }
}
echo $s + $c;

```
[/PHP]

[RUBY]
```ruby
n, s = gets.split.map(&:to_i)
c = 0
n.times do
    f, t = gets.split.map(&:to_i)
    x = t - (s - f)
    c = x if x > c
end
puts s + c

```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
)

func main() {
    var n, s int
    fmt.Scan(&n, &s)
    var c int
    for i := 0; i < n; i++ {
        var f, t int
        fmt.Scan(&f, &t)
        x := t - (s - f)
        if x > c {
            c = x
        }
    }
    fmt.Println(s + c)
}

```
[/GO]

[BASH]
```bash
read n s
c=0
for ((i=0;i<n;i++)); do
    read f t
    x=$(($t - ($s - $f)))
    if ((x > c)); then
        c=$x
    fi
done
echo $(($s + $c))

```
[/BASH]

[PERL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my $s = <STDIN>;
chomp($s);
my $c = 0;
for (my $i = 0; $i < $n; $i++) {
    my $f = <STDIN>;
    chomp($f);
    my $t = <STDIN>;
    chomp($t);
    my $x = $t - ($s - $f);
    if ($x > $c) {
        $c = $x;
    }
}
print $s + $c;

```
[/PERL]

[PASCAL]
```pascal
program Problem;
var
    n, s, c: integer;
    i: integer;
    f, t: integer;
    x: integer;
begin
    readln(n, s);
    c := 0;
    for i := 1 to n do
    begin
        readln(f, t);
        x := t - (s - f);
        if x > c then
            c := x;
    end;
    writeln(s + c);
end.

```
[/PASCAL]

[JULIA]
```julia
n, s = parse.(Int, split(readline()))
c = 0
for i in 1:n
    f, t = parse.(Int, split(readline()))
    x = t - (s - f)
    if x > c
        c = x
    end
end
println(s + c)

```
[/JULIA]

[RACKET]
```racket
(define n (read))
(define s (read))
(define c 0)
(for ([i (in-range 1 n)])
  (define f (read))
  (define t (read))
  (define x (- t (- s f)))
  (if (> x c)
      (set! c x)))
(display (+ s c))

```
[/RACKET]

[F#]
```fsharp
let n, s = stdin.ReadLine().Split() |> Array.map int
let mutable c = 0
for i in 1..n do
    let f, t = stdin.ReadLine().Split() |> Array.map int
    let x = t - (s - f)
    if x > c then c <- x
printf "%d" (s + c)

```
[/F#]

[LUA]
```lua
n, s = io.read(), io.read()
c = 0
for i = 1, n do
    f, t = io.read(), io.read()
    x = t - (s - f)
    if x > c then
        c = x
    end
end
print(s + c)

```
[/LUA]

[D]
```d
import std.stdio;

void main()
{
    int n, s, c;
    scanf("%d %d", &n, &s);
    c = 0;
    for (int i = 0; i < n; i++)
    {
        int f, t;
        scanf("%d %d", &f, &t);
        int x = t - (s - f);
        if (x > c)
            c = x;
    }
    writeln(s + c);
}

```
[/D]

[KOTLIN]
```kotlin
fun main() {
    val (n, s) = readLine()!!.split(" ").map { it.toInt() }
    var c = 0
    for (i in 1..n) {
        val (f, t) = readLine()!!.split(" ").map { it.toInt() }
        val x = t - (s - f)
        if (x > c) c = x
    }
    println(s + c)
}

```
[/KOTLIN]

[BASH]
```bash
read n s
c=0
for ((i=0;i<n;i++)); do
    read f t
    x=$(($t - ($s - $f)))
    if ((x > c)); then
        c=$x
    fi
done
echo $(($s + $c))

```
[/BASH]

[JULIA]
```julia
n, s = parse.(Int, split(readline()))
c = 0
for i in 1:n
    f, t = parse.(Int, split(readline()))
    x = t - (s - f)
    if x > c
        c = x
    end
end
println(s + c)

```
[/JULIA]

[COFFEESCRIPT]
```coffeescript
[INPUT]
n = parseInt readline()
s = parseInt readline()
c = 0
for i in [0..n-1]
    [INPUT]
    f = parseInt readline()
    t = parseInt readline()
    x = t - (s - f)
    if x > c
        c = x
    [/INPUT]
[/INPUT]
console.log s + c

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
        int s = Convert.ToInt32(Console.ReadLine());
        int c = 0;
        for (int i = 0; i < n; i++)
        {
            int f = Convert.ToInt32(Console.ReadLine());
            int t = Convert.ToInt32(Console.ReadLine());
            int x = t - (s - f);
            if (x > c)
                c = x;
        }
        Console.WriteLine(s + c);
    }
}

```
[/C#]

[VB]
```vb
Imports System

Module Solution
    Sub Main()
        Dim n As Integer = Integer.Parse(Console.ReadLine())
        Dim s As Integer = Integer.Parse(Console.ReadLine())
        Dim c As Integer = 0
        For i As Integer = 0 To n - 1
            Dim f As Integer = Integer.Parse(Console.ReadLine())
            Dim t As Integer = Integer.Parse(Console.ReadLine())
            Dim x As Integer = t - (s - f)
            If x > c Then
                c = x
            End If
        Next
        Console.WriteLine(s + c)
    End Sub
End Module

```
[/VB]

[SCALA]
```scala
object Solution {
    def main(args: Array[String]) {
        val Array(n, s) = readLine().split(" ").map(_.toInt)
        var c = 0
        for (i <- 1 to n) {
            val Array(f, t) = readLine().split(" ").map(_.toInt)
            val x = t - (s - f)
            if (x > c) c = x
        }
        println(s + c)
    }
}

```
[/SCALA]

[SWIFT]
```swift
let n = Int(readLine()!)!
let s = Int(readLine()!)!
var c = 0
for _ in 1...n {
    let f = Int(readLine()!)!
    let t = Int(readLine()!)!
    let x = t - (s - f)
    if x > c {
        c = x
    }
}
print(s + c)

```
[/SWIFT]

[POWERSHELL]
```powershell
$n = [int](Read-Host)
$s = [int](Read-Host)
$c = 0
for ($i = 0; $i -lt $n; $i++) {
    $f = [int](Read-Host)
    $t = [int](Read-Host)
    $x = $t - ($s - $f)
    if ($x -gt $c) {
        $c = $x
    }
}
Write-Host $s + $c

```
[/POWERSHELL]

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
    const s = parseInt(readline(), 10);
    let c = 0;
    for (let i = 0; i < n; i++) {
        const [f, t] = readline().split(' ').map(x => parseInt(x, 10));
        const x = t - (s - f);
        if (x > c) {
            c = x;
        }
    }
    console.log(s + c);
}

```
[/JAVASCRIPT]

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
    const s = parseInt(readline(), 10);
    let c = 0;
    for (let i = 0; i < n; i++) {
        const [f, t] = readline().split(' ').map(x => parseInt(x, 10));
        const x = t - (s - f);
        if (x > c) {
            c = x;
        }
    }
    console.log(s + c);
}

```
[/TYPESCRIPT]

[REACT]
```jsx
'use strict';

const fs = require('fs');

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
    const s = parseInt(readline(), 10);
    let c
