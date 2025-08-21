
[JAV]
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] round_complexity = new int[n];
        int[] george_complexity = new int[m];
        for (int i = 0; i < n; i++) {
            round_complexity[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            george_complexity[i] = sc.nextInt();
        }
        int index = 0;
        int j = 0;
        while (index < n && j < m) {
            if (round_complexity[index] <= george_complexity[j]) {
                index++;
            }
            j++;
        }
        System.out.println(n - index);
    }
}
```
[/JAV]

[PYT]
```python
n, m = map(int, input().split())
round_complexity = list(map(int, input().split()))
george_complexity = list(map(int, input().split()))
index = 0
j = 0
while index < n and j < m:
    if round_complexity[index] <= george_complexity[j]:
        index += 1
    j += 1
print(n - index)
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    vector<int> round_complexity(n);
    for (int i = 0; i < n; i++) {
        cin >> round_complexity[i];
    }
    vector<int> george_complexity(m);
    for (int i = 0; i < m; i++) {
        cin >> george_complexity[i];
    }
    int index = 0;
    int j = 0;
    while (index < n && j < m) {
        if (round_complexity[index] <= george_complexity[j]) {
            index++;
        }
        j++;
    }
    cout << n - index << endl;
    return 0;
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>

int main() {
    int n, m;
    scanf("%d %d", &n, &m);
    int *round_complexity = (int *)malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &round_complexity[i]);
    }
    int *george_complexity = (int *)malloc(sizeof(int) * m);
    for (int i = 0; i < m; i++) {
        scanf("%d", &george_complexity[i]);
    }
    int index = 0;
    int j = 0;
    while (index < n && j < m) {
        if (round_complexity[index] <= george_complexity[j]) {
            index++;
        }
        j++;
    }
    printf("%d\n", n - index);
    return 0;
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
    var n, m int
    fmt.Scan(&n, &m)
    round_complexity := make([]int, n)
    for i := 0; i < n; i++ {
        fmt.Scan(&round_complexity[i])
    }
    george_complexity := make([]int, m)
    for i := 0; i < m; i++ {
        fmt.Scan(&george_complexity[i])
    }
    index := 0
    j := 0
    for index < n && j < m {
        if round_complexity[index] <= george_complexity[j] {
            index++
        }
        j++
    }
    fmt.Println(n - index)
}
```
[/GO]

[RB]
```ruby
n, m = gets.split.map(&:to_i)
round_complexity = gets.split.map(&:to_i)
george_complexity = gets.split.map(&:to_i)
index = 0
j = 0
while index < n && j < m
  if round_complexity[index] <= george_complexity[j]
    index += 1
  end
  j += 1
end
puts n - index
```
[/RB]

[PHP]
```php
<?php
$n = (int)trim(fgets(STDIN));
$m = (int)trim(fgets(STDIN));
$round_complexity = array_map('intval', explode(' ', trim(fgets(STDIN))));
$george_complexity = array_map('intval', explode(' ', trim(fgets(STDIN))));
$index = 0;
$j = 0;
while ($index < $n && $j < $m) {
    if ($round_complexity[$index] <= $george_complexity[$j]) {
        $index++;
    }
    $j++;
}
echo $n - $index;
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my $m = <STDIN>;
chomp($m);
my @round_complexity = split(' ', <STDIN>);
my @george_complexity = split(' ', <STDIN>);
my $index = 0;
my $j = 0;
while ($index < $n && $j < $m) {
    if ($round_complexity[$index] <= $george_complexity[$j]) {
        $index++;
    }
    $j++;
}
print $n - $index;
```
[/PL]

[CS]
```csharp
using System;
using System.Linq;

public class Program
{
    public static void Main()
    {
        var n = int.Parse(Console.ReadLine());
        var m = int.Parse(Console.ReadLine());
        var round_complexity = Console.ReadLine().Split().Select(int.Parse).ToArray();
        var george_complexity = Console.ReadLine().Split().Select(int.Parse).ToArray();
        var index = 0;
        var j = 0;
        while (index < n && j < m)
        {
            if (round_complexity[index] <= george_complexity[j])
            {
                index++;
            }
            j++;
        }
        Console.WriteLine(n - index);
    }
}
```
[/CS]

[HAS]
```haskell
main = do
    [n, m] <- map read . words <$> getLine
    round_complexity <- map read . words <$> getLine
    george_complexity <- map read . words <$> getLine
    let index = 0
        j = 0
    print $ n - index
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
}).on('close', function () {
    let [n, m] = input[0].split(' ').map(Number);
    let round_complexity = input[1].split(' ').map(Number);
    let george_complexity = input[2].split(' ').map(Number);
    let index = 0;
    let j = 0;
    while (index < n && j < m) {
        if (round_complexity[index] <= george_complexity[j]) {
            index++;
        }
        j++;
    }
    console.log(n - index);
    process.exit();
});
```
[/JA]

[KT]
```kotlin
fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val round_complexity = readLine()!!.split(" ").map { it.toInt() }
    val george_complexity = readLine()!!.split(" ").map { it.toInt() }
    var index = 0
    var j = 0
    while (index < n && j < m) {
        if (round_complexity[index] <= george_complexity[j]) {
            index++
        }
        j++
    }
    println(n - index)
}
```
[/KT]

[LUA]
```lua
local n, m = io.read("*n", "*n")
local round_complexity = {}
for i = 1, n do
    round_complexity[i] = io.read("*n")
end
local george_complexity = {}
for i = 1, m do
    george_complexity[i] = io.read("*n")
end
local index = 0
local j = 0
while index < n and j < m do
    if round_complexity[index] <= george_complexity[j] then
        index = index + 1
    end
    j = j + 1
end
print(n - index)
```
[/LUA]

[MAT]
```matlab
n = str2num(input(''));
m = str2num(input(''));
round_complexity = str2num(input(''));
george_complexity = str2num(input(''));
index = 0;
j = 0;
while index < n && j < m
    if round_complexity(index) <= george_complexity(j)
        index = index + 1;
    end
    j = j + 1;
end
disp(n - index)
```
[/MAT]

[SC]
```scala
object Solution {
    def main(args: Array[String]) {
        val Array(n, m) = readLine().split(" ").map(_.toInt)
        val round_complexity = readLine().split(" ").map(_.toInt)
        val george_complexity = readLine().split(" ").map(_.toInt)
        var index = 0
        var j = 0
        while (index < n && j < m) {
            if (round_complexity(index) <= george_complexity(j)) {
                index += 1
            }
            j += 1
        }
        println(n - index)
    }
}
```
[/SC]

[VB]
```vb
Module Module1
    Sub Main()
        Dim n As Integer = Integer.Parse(Console.ReadLine())
        Dim m As Integer = Integer.Parse(Console.ReadLine())
        Dim round_complexity As Integer() = Console.ReadLine().Split(" ").Select(Function(x) Integer.Parse(x)).ToArray()
        Dim george_complexity As Integer() = Console.ReadLine().Split(" ").Select(Function(x) Integer.Parse(x)).ToArray()
        Dim index As Integer = 0
        Dim j As Integer = 0
        While index < n And j < m
            If round_complexity(index) <= george_complexity(j) Then
                index += 1
            End If
            j += 1
        End While
        Console.WriteLine(n - index)
    End Sub
End Module
```
[/VB]

[D]
```d
import std.stdio;

void main()
{
    auto n = readln().to!int;
    auto m = readln().to!int;
    auto round_complexity = readln().split.map!int;
    auto george_complexity = readln().split.map!int;
    auto index = 0;
    auto j = 0;
    while (index < n && j < m)
    {
        if (round_complexity[index] <= george_complexity[j])
        {
            index++;
        }
        j++;
    }
    writeln(n - index);
}
```
[/D]

[R]
```r
n <- as.integer(readline(prompt=""))
m <- as.integer(readline(prompt=""))
round_complexity <- as.integer(readline(prompt=""))
george_complexity <- as.integer(readline(prompt=""))
index <- 0
j <- 0
while (index < n && j < m) {
    if (round_complexity[index] <= george_complexity[j]) {
        index <- index + 1
    }
    j <- j + 1
}
cat(n - index, "\n")
```
[/R]

[DCK]
```dockerfile
FROM ubuntu:18.04
RUN apt-get update && apt-get install -y python3 python3-pip
RUN pip3 install --upgrade pip
RUN pip3 install scipy
```
[/DCK]

[DCK]
```dockerfile
FROM ubuntu:18.04
RUN apt-get update && apt-get install -y python3 python3-pip
RUN pip3 install --upgrade pip
RUN pip3 install scipy
```
[/DCK]

[DCK]
```dockerfile
FROM ubuntu:18.04
RUN apt-get update && apt-get install -y python3 python3-pip
RUN pip3 install --upgrade pip
RUN pip3 install scipy
```
[/DCK]

[DCK]
```dockerfile
FROM ubuntu:18.04
RUN apt-get update && apt-get install -y python3 python3-pip
RUN pip3 install --upgrade pip
RUN pip3 install scipy
```
[/DCK]

[DCK]
```dockerfile
FROM ubuntu:18.04
RUN apt-get update && apt-get install -y python3 python3-pip
RUN pip3 install --upgrade pip
RUN pip3 install scipy
```
[/DCK]

[DCK]
```dockerfile
FROM ubuntu:18.04
RUN apt-get update && apt-get install -y python3 python3-pip
RUN pip3 install --upgrade pip
RUN pip3 install scipy
```
[/DCK]

[DCK]
```dockerfile
FROM ubuntu:18.04
RUN apt-get update && apt-get install -y python3 python3-pip
R
