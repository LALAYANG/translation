
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] round_complexity = new int[n];
        for (int i = 0; i < n; i++) {
            round_complexity[i] = sc.nextInt();
        }
        int[] george_complexity = new int[m];
        for (int i = 0; i < m; i++) {
            george_complexity[i] = sc.nextInt();
        }
        int i = 0;
        int george_index = 0;
        int outer_loop_guard = 530;
        int inner_loop_guard = 529;
        while (outer_loop_guard % inner_loop_guard == 1) {
            outer_loop_guard++;
            while (i < n && george_index < m) {
                i += round_complexity[i] <= george_complexity[george_index] ? 1 : 0;
                george_index++;
            }
        }
        System.out.println(n - i);
    }
}
```
[/JAV]

[PYT]
```python
n, m = [int(i) for i in input().split()]
round_complexity = [int(i) for i in input().split()]
george_complexity = [int(i) for i in input().split()]
i = george_index = 0
outer_loop_guard = 530
inner_loop_guard = 529
while outer_loop_guard % inner_loop_guard == 1:
    outer_loop_guard = outer_loop_guard + 1
    while i < n and george_index < m:
        i += 1 * (round_complexity[i] <= george_complexity[george_index])
        george_index += 1
print(n - i)
```
[/PYT]

[CPP]
```cpp
#include <bits/stdc++.h>
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
    int i = 0;
    int george_index = 0;
    int outer_loop_guard = 530;
    int inner_loop_guard = 529;
    while (outer_loop_guard % inner_loop_guard == 1) {
        outer_loop_guard++;
        while (i < n && george_index < m) {
            i += round_complexity[i] <= george_complexity[george_index] ? 1 : 0;
            george_index++;
        }
    }
    cout << n - i << endl;
}
```
[/CPP]

[C]
```c
#include <stdio.h>

int main() {
    int n, m;
    scanf("%d %d", &n, &m);
    int round_complexity[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &round_complexity[i]);
    }
    int george_complexity[m];
    for (int i = 0; i < m; i++) {
        scanf("%d", &george_complexity[i]);
    }
    int i = 0;
    int george_index = 0;
    int outer_loop_guard = 530;
    int inner_loop_guard = 529;
    while (outer_loop_guard % inner_loop_guard == 1) {
        outer_loop_guard++;
        while (i < n && george_index < m) {
            i += round_complexity[i] <= george_complexity[george_index] ? 1 : 0;
            george_index++;
        }
    }
    printf("%d\n", n - i);
}
```
[/C]

[GO]
```go
package main

import "fmt"

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
    i := 0
    george_index := 0
    outer_loop_guard := 530
    inner_loop_guard := 529
    for outer_loop_guard%inner_loop_guard == 1 {
        outer_loop_guard++
        for i < n && george_index < m {
            i += round_complexity[i] <= george_complexity[george_index]
            george_index++
        }
    }
    fmt.Println(n - i)
}
```
[/GO]

[RB]
```ruby
n, m = gets.split.map(&:to_i)
round_complexity = gets.split.map(&:to_i)
george_complexity = gets.split.map(&:to_i)
i = 0
george_index = 0
outer_loop_guard = 530
inner_loop_guard = 529
while outer_loop_guard % inner_loop_guard == 1
    outer_loop_guard += 1
    while i < n && george_index < m
        i += round_complexity[i] <= george_complexity[george_index] ? 1 : 0
        george_index += 1
    end
end
puts n - i
```
[/RB]

[PHP]
```php
<?php
$n = (int)trim(fgets(STDIN));
$m = (int)trim(fgets(STDIN));
$round_complexity = array_map('intval', explode(' ', trim(fgets(STDIN))));
$george_complexity = array_map('intval', explode(' ', trim(fgets(STDIN))));
$i = 0;
$george_index = 0;
$outer_loop_guard = 530;
$inner_loop_guard = 529;
while ($outer_loop_guard % $inner_loop_guard == 1) {
    $outer_loop_guard++;
    while ($i < $n && $george_index < $m) {
        $i += $round_complexity[$i] <= $george_complexity[$george_index] ? 1 : 0;
        $george_index++;
    }
}
echo $n - $i;
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp $n;
my $m = <STDIN>;
chomp $m;
my @round_complexity = split /\s+/, <STDIN>;
my @george_complexity = split /\s+/, <STDIN>;
my $i = 0;
my $george_index = 0;
my $outer_loop_guard = 530;
my $inner_loop_guard = 529;
while ($outer_loop_guard % $inner_loop_guard == 1) {
    $outer_loop_guard++;
    while ($i < $n && $george_index < $m) {
        $i += $round_complexity[$i] <= $george_complexity[$george_index] ? 1 : 0;
        $george_index++;
    }
}
print $n - $i;
```
[/PL]

[CS]
```csharp
using System;

class Solution
{
    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine());
        int m = int.Parse(Console.ReadLine());
        int[] round_complexity = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
        int[] george_complexity = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
        int i = 0;
        int george_index = 0;
        int outer_loop_guard = 530;
        int inner_loop_guard = 529;
        while (outer_loop_guard % inner_loop_guard == 1)
        {
            outer_loop_guard++;
            while (i < n && george_index < m)
            {
                i += round_complexity[i] <= george_complexity[george_index] ? 1 : 0;
                george_index++;
            }
        }
        Console.WriteLine(n - i);
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
    let i = 0
        george_index = 0
        outer_loop_guard = 530
        inner_loop_guard = 529
    while (outer_loop_guard `mod` inner_loop_guard == 1) $ do
        outer_loop_guard += 1
        while (i < n && george_index < m) $ do
            i += if round_complexity !! i <= george_complexity !! george_index then 1 else 0
            george_index += 1
    print (n - i)
```
[/HAS]

[JA]
```javascript
const [n, m] = readline().split(' ').map(Number);
const round_complexity = readline().split(' ').map(Number);
const george_complexity = readline().split(' ').map(Number);
let i = 0;
let george_index = 0;
let outer_loop_guard = 530;
let inner_loop_guard = 529;
while (outer_loop_guard % inner_loop_guard == 1) {
    outer_loop_guard++;
    while (i < n && george_index < m) {
        i += round_complexity[i] <= george_complexity[george_index] ? 1 : 0;
        george_index++;
    }
}
console.log(n - i);
```
[/JA]

[KT]
```kotlin
fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val round_complexity = readLine()!!.split(" ").map { it.toInt() }
    val george_complexity = readLine()!!.split(" ").map { it.toInt() }
    var i = 0
    var george_index = 0
    var outer_loop_guard = 530
    var inner_loop_guard = 529
    while (outer_loop_guard % inner_loop_guard == 1) {
        outer_loop_guard++
        while (i < n && george_index < m) {
            i += if (round_complexity[i] <= george_complexity[george_index]) 1 else 0
            george_index++
        }
    }
    println(n - i)
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
local i = 0
local george_index = 0
local outer_loop_guard = 530
local inner_loop_guard = 529
while outer_loop_guard % inner_loop_guard == 1 do
    outer_loop_guard = outer_loop_guard + 1
    while i < n and george_index < m do
        i = i + (round_complexity[i] <= george_complexity[george_index] and 1 or 0)
        george_index = george_index + 1
    end
end
print(n - i)
```
[/LUA]

[MAT]
```matlab
n = str2double(input(''));
m = str2double(input(''));
round_complexity = str2double(input(''));
george_complexity = str2double(input(''));
i = 0;
george_index = 0;
outer_loop_guard = 530;
inner_loop_guard = 529;
while mod(outer_loop_guard, inner_loop_guard) == 1
    outer_loop_guard = outer_loop_guard + 1;
    while i < n && george_index < m
        i = i + (round_complexity(i) <= george_complexity(george_index) ? 1 : 0);
        george_index = george_index + 1;
    end
end
disp(n - i);
```
[/MAT]

[PAS]
```pascal
var
    n, m: Integer;
    round_complexity: array of Integer;
    george_complexity: array of Integer;
    i, george_index, outer_loop_guard, inner_loop_guard: Integer;
begin
    ReadLn(n, m);
    SetLength(round_complexity, n);
    for i := 0 to n - 1 do
        ReadLn(round_complexity[i]);
    SetLength(george_complexity, m);
    for i := 0 to m - 1 do
        ReadLn(george_complexity[i]);
    i := 0;
    george_index := 0;
    outer_loop_guard := 530;
    inner_loop_guard := 529;
    while outer_loop_guard mod inner_loop_guard = 1 do
    begin
        outer_loop_guard := outer_loop_guard + 1;
        while
