
[JAV]
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int currentCell = 0;
        while (currentCell <= t) {
            currentCell += s[currentCell - 1];
            if (currentCell == t) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}

```
[/JAV]

[PYT]
```py

import sys
n , t = map ( int , input ( ).split ( ) )
s = list ( [ int ( x ) for x in input ( ).split ( ) ] )
current_cell = 0
while current_cell <= t :
    current_cell += s [ current_cell - 1 ]
    if current_cell == t :
        print ( "YES" )
        sys.exit ( )
    else :
        continue
print ( "NO" )


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
    int n, t;
    cin >> n >> t;
    vector<int> s(n);
    for (int i = 0; i < n; i++)
        cin >> s[i];
    int currentCell = 0;
    while (currentCell <= t)
    {
        currentCell += s[currentCell - 1];
        if (currentCell == t)
        {
            cout << "YES" << endl;
            return 0;
        }
    }
    cout << "NO" << endl;
    return 0;
}

```
[/C++]

[C]
```c

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n, t;
    scanf("%d %d", &n, &t);
    int *s = (int *)malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++)
        scanf("%d", &s[i]);
    int currentCell = 0;
    while (currentCell <= t)
    {
        currentCell += s[currentCell - 1];
        if (currentCell == t)
        {
            printf("YES\n");
            return 0;
        }
    }
    printf("NO\n");
    return 0;
}

```
[/C]

[PHP]
```php

<?php
$n = (int)trim(fgets(STDIN));
$t = (int)trim(fgets(STDIN));
$s = array_map('intval', explode(' ', trim(fgets(STDIN))));
$currentCell = 0;
while ($currentCell <= $t) {
    $currentCell += $s[$currentCell - 1];
    if ($currentCell == $t) {
        echo "YES\n";
        exit(0);
    }
}
echo "NO\n";

```
[/PHP]

[RUBY]
```ruby

n, t = gets.split.map(&:to_i)
s = gets.split.map(&:to_i)
current_cell = 0
while current_cell <= t
    current_cell += s[current_cell - 1]
    if current_cell == t
        puts "YES"
        exit
    end
end
puts "NO"

```
[/RUBY]

[GO]
```go

package main

import (
    "fmt"
)

func main() {
    var n, t int
    fmt.Scan(&n, &t)
    s := make([]int, n)
    for i := 0; i < n; i++ {
        fmt.Scan(&s[i])
    }
    currentCell := 0
    for currentCell <= t {
        currentCell += s[currentCell-1]
        if currentCell == t {
            fmt.Println("YES")
            return
        }
    }
    fmt.Println("NO")
}

```
[/GO]

[BASH]
```bash

read n t
read -a s
currentCell=0
while [ $currentCell -le $t ]
do
    currentCell=$((currentCell+${s[$currentCell-1]}))
    if [ $currentCell -eq $t ]
    then
        echo "YES"
        exit
    fi
done
echo "NO"

```
[/BASH]

[PERL]
```perl

use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my $t = <STDIN>;
chomp($t);
my @s = split(' ', <STDIN>);
my $currentCell = 0;
while ($currentCell <= $t) {
    $currentCell += $s[$currentCell - 1];
    if ($currentCell == $t) {
        print "YES\n";
        exit;
    }
}
print "NO\n";

```
[/PERL]

[ELIXIR]
```elixir

n = String.to_integer(IO.gets(""))
t = String.to_integer(IO.gets(""))
s = IO.gets("") |> String.trim() |> String.split() |> Enum.map(&String.to_integer/1)
current_cell = 0
while current_cell <= t do
    current_cell = current_cell + Enum.at(s, current_cell - 1)
    if current_cell == t do
        IO.puts("YES")
        System.halt(0)
    end
end
IO.puts("NO")

```
[/ELIXIR]

[JULIA]
```julia

n, t = parse.(Int, split(readline()))
s = parse.(Int, split(readline()))
current_cell = 0
while current_cell <= t
    current_cell += s[current_cell]
    if current_cell == t
        println("YES")
        exit()
    end
end
println("NO")

```
[/JULIA]

[LUA]
```lua

local n, t = io.read("*n"), io.read("*n")
local s = {}
for i = 1, n do
    s[i] = io.read("*n")
end
local currentCell = 0
while currentCell <= t do
    currentCell = currentCell + s[currentCell]
    if currentCell == t then
        print("YES")
        os.exit()
    end
end
print("NO")

```
[/LUA]

[D]
```d

import std.stdio;

void main()
{
    auto n = readln().to!int;
    auto t = readln().to!int;
    auto s = readln().split.map!int;
    auto currentCell = 0;
    while (currentCell <= t)
    {
        currentCell += s[currentCell - 1];
        if (currentCell == t)
        {
            writeln("YES");
            return;
        }
    }
    writeln("NO");
}

```
[/D]

[R]
```r

n <- as.integer(readline(prompt = ""));
t <- as.integer(readline(prompt = ""));
s <- as.integer(readline(prompt = ""));
currentCell <- 0;
while (currentCell <= t) {
    currentCell <- currentCell + s[currentCell];
    if (currentCell == t) {
        cat("YES\n");
        q();
    }
}
cat("NO\n");

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
    const n = parseInt(readline(), 10);
    const t = parseInt(readline(), 10);
    const s = readline().split(' ').map(x => parseInt(x, 10));
    let currentCell = 0;
    while (currentCell <= t) {
        currentCell += s[currentCell - 1];
        if (currentCell === t) {
            console.log('YES');
            return;
        }
    }
    console.log('NO');
}

```
[/JAVASCRIPT]

[SWIFT]
```swift

import Foundation

let n = Int(readLine()!)!
let t = Int(readLine()!)!
let s = readLine()!.split(separator: " ").map{ Int(String($0))! }
var currentCell = 0
while currentCell <= t {
    currentCell += s[currentCell - 1]
    if currentCell == t {
        print("YES")
        exit(0)
    }
}
print("NO")

```
[/SWIFT]

[PASCAL]
```pascal

program Problem;
var
  n, t: integer;
  s: array[1..1000] of integer;
  currentCell: integer;
begin
  readln(n, t);
  for var i := 1 to n do
    read(s[i]);
  currentCell := 0;
  while currentCell <= t do
  begin
    currentCell := currentCell + s[currentCell];
    if currentCell = t then
    begin
      writeln('YES');
      halt;
    end;
  end;
  writeln('NO');
end.

```
[/PASCAL]

[OBJECTIVEC]
```objectivec

#import <Foundation/Foundation.h>

#define MAX(a, b) (((a) > (b)) ? (a) : (b))
#define MIN(a, b) (((a) < (b)) ? (a) : (b))
#define swap(a, b) { __typeof__ (a) temp##a = (a); (a) = (b); (b) = temp##a; }
#define clr(a, b) memset((a), (b), sizeof(a))
#define rep(i, a, b) for(__typeof(b) i = (a) - ((a) > (b)); i != (b) - ((a) > (b)); i += 1 - 2 * ((a) > (b)))
#define repd(i, a, b) for(__typeof(b) i = (b) - ((a) > (b)); i != (a) - ((a) > (b)); i -= 1 - 2 * ((a) > (b)))
#define repit(it, a) for (__typeof((a).begin()) it = (a).begin(); it != (a).end(); it++)
#define reps(it, a, b) for (__typeof((b).begin()) it = (a).begin(); it != (b).end(); it++)
#define rrep(i, n) rep(i, 1, (n))
#define rreps(it, a) reps(it, (a).rbegin(), (a).rend())
#define all(a) (a).begin(), (a).end()
#define sz(a) int((a).size())
#define pb push_back
#define mp make_pair
#define fi first
#define se second
#define MOD (ll)1000000007
#define sqr(a) ((a) * (a))
#define sqrt(a) sqrtl(a)
typedef long long ll;
typedef pair<int, int> pii;
typedef vector<int> vi;

int main(int argc, const char * argv[]) {
    int n, t;
    scanf("%d %d", &n, &t);
    int s[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &s[i]);
    }
    int currentCell = 0;
    while (currentCell <= t) {
        currentCell += s[currentCell - 1];
        if (currentCell == t) {
            printf("YES\n");
            return 0;
        }
    }
    printf("NO\n");
    return 0;
}

```
[/OBJECTIVEC]

[KOTLIN]
```kotlin

import java.util.*

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val t = readLine()!!.toInt()
    val s = readLine()!!.split(" ").map { it.toInt() }
    var currentCell = 0
    while (currentCell <= t) {
        currentCell += s[currentCell - 1]
        if (currentCell == t) {
            println("YES")
            return
        }
    }
    println("NO")
}

```
[/KOTLIN]

[CSHARP]
```csharp

using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Text;

namespace csharp
{
    internal static class Program
    {
        private static void Main()
        {
            var n = int.Parse(Console.ReadLine());
            var t = int.Parse(Console.ReadLine());
            var s = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            var currentCell = 0;
            while (currentCell <= t)
            {
                currentCell += s[currentCell - 1];
                if (currentCell == t)
                {
                    Console.WriteLine("YES");
                    return;
                }
            }
            Console.WriteLine("NO");
        }
    }
}

```
[/CSHARP]

[VB]
```vb

Imports System
Imports System.Collections.Generic
Imports System.Diagnostics
Imports System.IO
Imports System.Linq
Imports System.Text

Module Program
    Sub Main(args As String())
        Dim n = Integer.Parse(Console.ReadLine())
        Dim t = Integer.Parse(Console.ReadLine())
        Dim s = Console.ReadLine().Split(" ").Select(Function(x) Integer.Parse(x)).ToArray()
        Dim currentCell = 0
        While currentCell <= t
            currentCell += s(currentCell - 1)
            If currentCell = t Then
                Console.WriteLine("YES")
                Return
            End If
        End While
        Console.WriteLine("NO")
    End Sub
End Module

```
[/VB]

[HASKELL]
```haskell

import Control.Monad
import Data.List
import Data.Maybe
import qualified Data.ByteString.Char8 as BS
