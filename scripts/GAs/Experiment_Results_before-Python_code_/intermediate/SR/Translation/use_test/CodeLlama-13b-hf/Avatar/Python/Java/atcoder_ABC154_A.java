
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int A = sc.nextInt();
        int B = sc.nextInt();
        String U = sc.next();
        if (S.equals(U)) {
            A--;
        }
        if (T.equals(U)) {
            B--;
        }
        System.out.println(A + " " + B);
    }
}

```
[/JAV]

[PYT]
```python
import sys
S = sys.stdin.readline().strip()
T = sys.stdin.readline().strip()
A = int(sys.stdin.readline().strip())
B = int(sys.stdin.readline().strip())
U = sys.stdin.readline().strip()
if S == U:
    A -= 1
if T == U:
    B -= 1
print(A, B)

```
[/PYT]

[CPP]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    string S, T, U;
    int A, B;
    cin >> S >> T >> A >> B >> U;
    if (S == U) {
        A--;
    }
    if (T == U) {
        B--;
    }
    cout << A << " " << B << endl;
}

```
[/CPP]

[C]
```c
#include <stdio.h>
#include <string.h>

int main() {
    char S[100], T[100], U[100];
    int A, B;
    scanf("%s %s %d %d %s", S, T, &A, &B, U);
    if (strcmp(S, U) == 0) {
        A--;
    }
    if (strcmp(T, U) == 0) {
        B--;
    }
    printf("%d %d\n", A, B);
}

```
[/C]

[PHP]
```php
<?php
$S = trim(fgets(STDIN));
$T = trim(fgets(STDIN));
$A = trim(fgets(STDIN));
$B = trim(fgets(STDIN));
$U = trim(fgets(STDIN));
if ($S == $U) {
    $A--;
}
if ($T == $U) {
    $B--;
}
echo $A . " " . $B;

```
[/PHP]

[RUBY]
```ruby
S = gets.chomp
T = gets.chomp
A = gets.chomp.to_i
B = gets.chomp.to_i
U = gets.chomp
if S == U
    A -= 1
end
if T == U
    B -= 1
end
puts A + " " + B

```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
)

func main() {
    var S, T, U string
    var A, B int
    fmt.Scan(&S, &T, &A, &B, &U)
    if S == U {
        A--
    }
    if T == U {
        B--
    }
    fmt.Println(A, B)
}

```
[/GO]

[BASH]
```bash
read S
read T
read A
read B
read U
if [ "$S" == "$U" ]; then
    A=$((A-1))
fi
if [ "$T" == "$U" ]; then
    B=$((B-1))
fi
echo $A $B

```
[/BASH]

[PERL]
```perl
use strict;
use warnings;

my $S = <STDIN>;
chomp($S);
my $T = <STDIN>;
chomp($T);
my $A = <STDIN>;
chomp($A);
my $B = <STDIN>;
chomp($B);
my $U = <STDIN>;
chomp($U);
if ($S eq $U) {
    $A--;
}
if ($T eq $U) {
    $B--;
}
print "$A $B\n";

```
[/PERL]

[ELIXIR]
```elixir
S = IO.gets ""
T = IO.gets ""
A = IO.gets ""
B = IO.gets ""
U = IO.gets ""
if S == U do
    A = A - 1
end
if T == U do
    B = B - 1
end
IO.puts A
IO.puts B

```
[/ELIXIR]

[JULIA]
```julia
S = readline()
T = readline()
A = parse(Int, readline())
B = parse(Int, readline())
U = readline()
if S == U
    A -= 1
end
if T == U
    B -= 1
end
println(A, " ", B)

```
[/JULIA]

[LUA]
```lua
S = io.read()
T = io.read()
A = io.read()
B = io.read()
U = io.read()
if S == U then
    A = A - 1
end
if T == U then
    B = B - 1
end
print(A, " ", B)

```
[/LUA]

[D]
```d
import std.stdio;

void main()
{
    string S, T, U;
    int A, B;
    readf("%s %s %d %d %s", S, T, A, B, U);
    if (S == U) {
        A--;
    }
    if (T == U) {
        B--;
    }
    writeln(A, " ", B);
}

```
[/D]

[R]
```r
S <- readline()
T <- readline()
A <- as.integer(readline())
B <- as.integer(readline())
U <- readline()
if (S == U) {
    A <- A - 1
}
if (T == U) {
    B <- B - 1
}
cat(A, " ", B, "\n")

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
    const S = readline();
    const T = readline();
    const A = parseInt(readline(), 10);
    const B = parseInt(readline(), 10);
    const U = readline();
    if (S === U) {
        A--;
    }
    if (T === U) {
        B--;
    }
    console.log(A + ' ' + B);
}

```
[/JAVASCRIPT]

[SWIFT]
```swift
import Foundation

var S = readLine()!
var T = readLine()!
var A = Int(readLine()!)!
var B = Int(readLine()!)!
var U = readLine()!
if S == U {
    A -= 1
}
if T == U {
    B -= 1
}
print(A, B)

```
[/SWIFT]

[PASCAL]
```pascal
program Problem;
var
    S, T, U: string;
    A, B: integer;
begin
    readln(S, T, A, B, U);
    if S = U then
        A := A - 1;
    if T = U then
        B := B - 1;
    writeln(A, ' ', B);
end.

```
[/PASCAL]

[OBJECTIVE-C]
```objectivec
#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        NSString *S = [[NSString alloc] initWithData:[NSData dataWithContentsOfFile:[[NSString alloc] initWithUTF8String:argv[1]]] encoding:NSUTF8StringEncoding];
        NSString *T = [[NSString alloc] initWithData:[NSData dataWithContentsOfFile:[[NSString alloc] initWithUTF8String:argv[2]]] encoding:NSUTF8StringEncoding];
        int A = [[NSString alloc] initWithData:[NSData dataWithContentsOfFile:[[NSString alloc] initWithUTF8String:argv[3]]] encoding:NSUTF8StringEncoding].intValue;
        int B = [[NSString alloc] initWithData:[NSData dataWithContentsOfFile:[[NSString alloc] initWithUTF8String:argv[4]]] encoding:NSUTF8StringEncoding].intValue;
        NSString *U = [[NSString alloc] initWithData:[NSData dataWithContentsOfFile:[[NSString alloc] initWithUTF8String:argv[5]]] encoding:NSUTF8StringEncoding];
        if ([S isEqualToString:U]) {
            A--;
        }
        if ([T isEqualToString:U]) {
            B--;
        }
        NSLog(@"%d %d", A, B);
    }
    return 0;
}

```
[/OBJECTIVE-C]

[KOTLIN]
```kotlin
import java.util.*

fun main(args: Array<String>) {
    val S = readLine()!!
    val T = readLine()!!
    var A = readLine()!!.toInt()
    var B = readLine()!!.toInt()
    val U = readLine()!!
    if (S == U) {
        A--
    }
    if (T == U) {
        B--
    }
    println("$A $B")
}

```
[/KOTLIN]

[CLOJURE]
```clojure
(let [S (read-line)
      T (read-line)
      A (Integer/parseInt (read-line))
      B (Integer/parseInt (read-line))
      U (read-line)]
  (if (= S U)
    (set! A (dec A)))
  (if (= T U)
    (set! B (dec B)))
  (println (str A " " B)))

```
[/CLOJURE]

[COFFEESCRIPT]
```coffeescript
S = readline()
T = readline()
A = parseInt readline()
B = parseInt readline()
U = readline()
if S is U
    A--
if T is U
    B--
console.log A + " " + B

```
[/COFFEESCRIPT]

[SCALA]
```scala
import scala.io.StdIn

object Solution {
    def main(args: Array[String]) {
        val S = StdIn.readLine()
        val T = StdIn.readLine()
        var A = StdIn.readLine().toInt
        var B = StdIn.readLine().toInt
        val U = StdIn.readLine()
        if (S == U) {
            A -= 1
        }
        if (T == U) {
            B -= 1
        }
        println(A + " " + B)
    }
}

```
[/SCALA]

[RACKET]
```racket
(define S (read-line))
(define T (read-line))
(define A (read-line))
(define B (read-line))
(define U (read-line))
(if (equal? S U)
    (set! A (- A 1)))
(if (equal? T U)
    (set! B (- B 1)))
(display (string-append (number->string A) " " (number->string B)))
(newline)

```
[/RACKET]

[F#]
```fsharp
open System

let S = Console.ReadLine()
let T = Console.ReadLine()
let A = Console.ReadLine() |> int
let B = Console.ReadLine() |> int
let U = Console.ReadLine()
if S = U then
    A <- A - 1
if T = U then
    B <- B - 1
printf "%d %d" A B

```
[/F#]

[VB]
```vb
Imports System

Module Module1
    Sub Main()
        Dim S As String = Console.ReadLine()
        Dim T As String = Console.ReadLine()
        Dim A As Integer = Console.ReadLine()
        Dim B As Integer = Console.ReadLine()
        Dim U As String = Console.ReadLine()
        If S = U Then
            A -= 1
        End If
        If T = U Then
            B -= 1
        End If
        Console.WriteLine(A & " " & B)
    End Sub
End Module

```
[/VB]

[CAML]
```ocaml
let S = read_line ()
let T = read_line ()
let A = read_line () |> int_of_string
let B = read_line () |> int_of_string
let U = read_line ()
if S = U then
    A := A - 1
if T = U then
    B := B - 1
print_endline (string_of_int !A ^ " " ^ string_of_int !B)

```
[/CAML]

[DART]
```dart
import 'dart:io';

void main() {
    var S = stdin.readLineSync();
    var T = stdin.readLineSync();
    var A = int.parse(stdin.readLineSync());
    var B = int.parse(stdin.readLineSync());
    var U = stdin.readLineSync();
    if (S == U) {
        A--;
    }
    if (T == U) {
        B--;
    }
    print('$A $B');
}

```
[/DART]

[KOTLIN]
```kotlin
import java.util.*

fun main(args: Array<String>) {
    val S = readLine()!!
    val T = readLine()!!
    var A = readLine()!!.toInt()
    var B = readLine()!!.toInt()
    val U = readLine()!!
    if (S == U) {
        A--
    }
    if (T == U) {
        B--
    }
    println("$A $B")
}

```
[/KOTLIN]

[GROOVY]
```groovy
def S = System.console().readLine()
def T = System.console().readLine()
def A = System.
