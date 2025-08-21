
[JAV]

```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        int x = 0;
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            x += w[i];
        }
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            if ((x - w[i]) / (n - 1) == w[i]) {
                d[i] = i + 1;
            }
        }
        System.out.println(d.length);
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
    }
}

```

[/JAV]

[PYT]

```python

import sys
input = sys.stdin.readline
n = int ( input ( ) )
w = list ( map ( int , input ( ).split ( ) ) )
x = sum ( w )
d = [ ]
for i in range ( n ) :
    if ( x - w [ i ] ) / ( n - 1 ) == w [ i ] :
        d.append ( i + 1 )
print ( len ( d ) )
print ( ' '.join ( map ( str , d ) ) )


```

[/PYT]

[CPP]

```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> w(n);
    int x = 0;
    for (int i = 0; i < n; i++) {
        cin >> w[i];
        x += w[i];
    }
    vector<int> d;
    for (int i = 0; i < n; i++) {
        if ((x - w[i]) / (n - 1) == w[i]) {
            d.push_back(i + 1);
        }
    }
    cout << d.size() << endl;
    for (int i = 0; i < d.size(); i++) {
        cout << d[i] << " ";
    }
}

```

[/CPP]

[C]

```c

#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    int w[n];
    int x = 0;
    for (int i = 0; i < n; i++) {
        scanf("%d", &w[i]);
        x += w[i];
    }
    int d[n];
    int d_size = 0;
    for (int i = 0; i < n; i++) {
        if ((x - w[i]) / (n - 1) == w[i]) {
            d[d_size++] = i + 1;
        }
    }
    printf("%d\n", d_size);
    for (int i = 0; i < d_size; i++) {
        printf("%d ", d[i]);
    }
}

```

[/C]

[PHP]

```php

<?php
$n = (int) fgets(STDIN);
$w = array_map('intval', explode(' ', fgets(STDIN)));
$x = array_sum($w);
$d = array();
for ($i = 0; $i < $n; $i++) {
    if (($x - $w[$i]) / ($n - 1) == $w[$i]) {
        $d[] = $i + 1;
    }
}
echo count($d) . PHP_EOL;
echo implode(' ', $d);

```

[/PHP]

[RUBY]

```ruby

n = gets.to_i
w = gets.split.map(&:to_i)
x = w.sum
d = []
n.times do |i|
    if (x - w[i]) / (n - 1) == w[i]
        d << i + 1
    end
end
puts d.size
puts d.join(' ')

```

[/RUBY]

[GO]

```go

package main

import (
    "fmt"
    "strconv"
)

func main() {
    var n int
    fmt.Scan(&n)
    w := make([]int, n)
    var x int
    for i := 0; i < n; i++ {
        fmt.Scan(&w[i])
        x += w[i]
    }
    d := make([]int, 0)
    for i := 0; i < n; i++ {
        if (x - w[i])/(n-1) == w[i] {
            d = append(d, i+1)
        }
    }
    fmt.Println(len(d))
    fmt.Println(strings.Join(strings.Fields(fmt.Sprint(d)), " "))
}

```

[/GO]

[BASH]

```bash

read n
read -a w
x=0
for i in "${w[@]}"; do
    x=$((x + i))
done
d=()
for i in $(seq 0 $((n - 1))); do
    if [ $((x - w[i])) -eq $((w[i] * n)) ]; then
        d+=($((i + 1)))
    fi
done
echo ${#d[@]}
echo ${d[@]}

```

[/BASH]

[PERL]

```perl

use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my @w = split(/ /, <STDIN>);
my $x = 0;
foreach my $i (@w) {
    $x += $i;
}
my @d = ();
for (my $i = 0; $i < $n; $i++) {
    if (($x - $w[$i]) / ($n - 1) == $w[$i]) {
        push(@d, $i + 1);
    }
}
print scalar(@d) . "\n";
print join(" ", @d) . "\n";

```

[/PERL]

[PASCAL]

```pascal

program problem;
var
  n: integer;
  w: array of integer;
  x: integer;
  d: array of integer;
  i: integer;
begin
  readln(n);
  setlength(w, n);
  for i := 0 to n - 1 do
  begin
    read(w[i]);
    x := x + w[i];
  end;
  setlength(d, n);
  for i := 0 to n - 1 do
  begin
    if (x - w[i]) div (n - 1) = w[i] then
      d[i] := i + 1;
  end;
  writeln(length(d));
  for i := 0 to length(d) - 1 do
    write(d[i], ' ');
end.

```

[/PASCAL]

[JULIA]

```julia

n = parse(Int, readline())
w = parse.(Int, split(readline()))
x = sum(w)
d = Int[]
for i in 1:n
    if (x - w[i]) / (n - 1) == w[i]
        push!(d, i)
    end
end
println(length(d))
println(join(d, " "))

```

[/JULIA]

[CSHARP]

```csharp

using System;
using System.Linq;

class Solution
{
    static void Main(String[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine());
        int[] w = Array.ConvertAll(Console.ReadLine().Split(' '), wTemp => Convert.ToInt32(wTemp));
        int x = w.Sum();
        int[] d = new int[n];
        int d_size = 0;
        for (int i = 0; i < n; i++)
        {
            if ((x - w[i]) / (n - 1) == w[i])
            {
                d[d_size++] = i + 1;
            }
        }
        Console.WriteLine(d_size);
        Console.WriteLine(string.Join(" ", d.Take(d_size)));
    }
}

```

[/CSHARP]

[HASKELL]

```haskell

import Data.List

main = do
    n <- readLn :: IO Int
    w <- map read . words <$> getLine
    let x = sum w
        d = [ i + 1 | i <- [0..n - 1], (x - w !! i) `div` (n - 1) == w !! i ]
    print (length d)
    print d

```

[/HASKELL]

[CLOJURE]

```clojure

(let [n (read-string (read-line))
      w (map read-string (clojure.string/split (read-line) #" "))
      x (reduce + w)
      d (filter #(= (quot (- x (nth w %)) (- n 1)) (nth w %)) (range n))]
  (println (count d))
  (println (clojure.string/join " " d)))

```

[/CLOJURE]

[BASH]

```bash

read n
read -a w
x=0
for i in "${w[@]}"; do
    x=$((x + i))
done
d=()
for i in $(seq 0 $((n - 1))); do
    if [ $((x - w[i])) -eq $((w[i] * n)) ]; then
        d+=($((i + 1)))
    fi
done
echo ${#d[@]}
echo ${d[@]}

```

[/BASH]

[JULIA]

```julia

n = parse(Int, readline())
w = parse.(Int, split(readline()))
x = sum(w)
d = Int[]
for i in 1:n
    if (x - w[i]) / (n - 1) == w[i]
        push!(d, i)
    end
end
println(length(d))
println(join(d, " "))

```

[/JULIA]

[COFFEESCRIPT]

```coffeescript

n = parseInt readline()
w = (parseInt s for s in readline().split ' ')
x = w.reduce (x, y) -> x + y
d = []
for i in [0..n - 1]
    if (x - w[i]) / (n - 1) == w[i]
        d.push i + 1
console.log d.length
console.log d.join ' '

```

[/COFFEESCRIPT]

[R]

```r

n <- as.integer(readline())
w <- as.integer(scan(, "", n))
x <- sum(w)
d <- c()
for (i in 1:n) {
    if ((x - w[i]) / (n - 1) == w[i]) {
        d <- c(d, i)
    }
}
cat(length(d), "\n")
cat(paste(d, collapse = " "), "\n")

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
    const w = readline().split(' ').map(wTemp => parseInt(wTemp, 10));
    const x = w.reduce((a, b) => a + b);
    const d = [];
    for (let i = 0; i < n; i++) {
        if ((x - w[i]) / (n - 1) === w[i]) {
            d.push(i + 1);
        }
    }
    console.log(d.length);
    console.log(d.join(' '));
}

```

[/JAVASCRIPT]

[SWIFT]

```swift

import Foundation

let n = Int(readLine()!)!
let w = readLine()!.split(separator: " ").map{ Int(String($0))! }
let x = w.reduce(0, +)
var d = [Int]()
for i in 0..<n {
    if (x - w[i]) / (n - 1) == w[i] {
        d.append(i + 1)
    }
}
print(d.count)
print(d.map{ String($0) }.joined(separator: " "))

```

[/SWIFT]

[POWERSHELL]

```powershell

$n = [int](Read-Host)
$w = [int[]](Read-Host).Split()
$x = 0
foreach ($i in $w) {
    $x += $i
}
$d = @()
for ($i = 0; $i -lt $n; $i++) {
    if (($x - $w[$i]) / ($n - 1) -eq $w[$i]) {
        $d += $i + 1
    }
}
$d.Count
$d -join ' '

```

[/POWERSHELL]

[PYTHON]

```python

n = int(input())
w = list(map(int, input().split()))
x = sum(w)
d = []
for i in range(n):
    if (x - w[i]) / (n - 1) == w[i]:
        d.append(i + 1)
print(len(d))
print(' '.join(map(str, d)))

```

[/PYTHON]

[RUBY]

```ruby

n = gets.to_i
w = gets.split.map(&:to_i)
x = w.sum
d = []
n.times do |i|
    if (x - w[i]) / (n - 1) == w[i]
        d << i + 1
    end
end
puts d.size
puts d.join(' ')

```

[/RUBY]

[JAVASCRIPT]

```javascript

'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data',
