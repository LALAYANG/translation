
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a = 1;
        int b = Integer.MAX_VALUE;
        int ans = b;
        while (a <= b) {
            int mid = (a + b) / 2;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % mid == 0) {
                    count++;
                }
                count -= arr[i] / mid;
            }
            if (count >= 0) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
```
[/JAV]

[PY]
```python
n, k = map(int, input().split())
arr = list(map(int, input().split()))
a = 1
b = max(arr)
ans = b
while a <= b:
    mid = (a + b) // 2
    count = 0
    for i in arr:
        if i % mid == 0:
            count += 1
        count -= i // mid
    if count >= 0:
        ans = mid
        b = mid - 1
    else:
        a = mid + 1
print(ans)
```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>

int checkCondition(int *arr, int n, int k, int mid) {
    int count = 0;
    for (int i = 0; i < n; i++) {
        if (arr[i] % mid == 0) {
            count++;
        }
        count -= arr[i] / mid;
    }
    return count >= 0;
}

int main() {
    int n, k;
    scanf("%d %d", &n, &k);
    int *arr = (int *) malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    int a = 1;
    int b = INT_MAX;
    int ans = b;
    while (a <= b) {
        int mid = (a + b) / 2;
        if (checkCondition(arr, n, k, mid)) {
            ans = mid;
            b = mid - 1;
        } else {
            a = mid + 1;
        }
    }
    printf("%d", ans);
    return 0;
}
```
[/C]

[CPP]
```cpp
#include <bits/stdc++.h>
using namespace std;

int checkCondition(int *arr, int n, int k, int mid) {
    int count = 0;
    for (int i = 0; i < n; i++) {
        if (arr[i] % mid == 0) {
            count++;
        }
        count -= arr[i] / mid;
    }
    return count >= 0;
}

int main() {
    int n, k;
    cin >> n >> k;
    int *arr = new int[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    int a = 1;
    int b = INT_MAX;
    int ans = b;
    while (a <= b) {
        int mid = (a + b) / 2;
        if (checkCondition(arr, n, k, mid)) {
            ans = mid;
            b = mid - 1;
        } else {
            a = mid + 1;
        }
    }
    cout << ans;
    return 0;
}
```
[/CPP]

[C#]
```csharp
using System;

class Solution
{
    static void Main(String[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine());
        int k = Convert.ToInt32(Console.ReadLine());
        int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp));
        int a = 1;
        int b = Int32.MaxValue;
        int ans = b;
        while (a <= b)
        {
            int mid = (a + b) / 2;
            int count = 0;
            for (int i = 0; i < n; i++)
            {
                if (arr[i] % mid == 0)
                {
                    count++;
                }
                count -= arr[i] / mid;
            }
            if (count >= 0)
            {
                ans = mid;
                b = mid - 1;
            }
            else
            {
                a = mid + 1;
            }
        }
        Console.WriteLine(ans);
    }
}
```
[/C#]

[PHP]
```php
<?php
$n = intval(fgets(STDIN));
$k = intval(fgets(STDIN));
$arr = array_map('intval', explode(' ', fgets(STDIN)));
$a = 1;
$b = PHP_INT_MAX;
$ans = $b;
while ($a <= $b) {
    $mid = ($a + $b) / 2;
    $count = 0;
    for ($i = 0; $i < $n; $i++) {
        if ($arr[$i] % $mid == 0) {
            $count++;
        }
        $count -= $arr[$i] / $mid;
    }
    if ($count >= 0) {
        $ans = $mid;
        $b = $mid - 1;
    } else {
        $a = $mid + 1;
    }
}
echo $ans;
```
[/PHP]

[RUBY]
```ruby
n, k = gets.split.map(&:to_i)
arr = gets.split.map(&:to_i)
a = 1
b = arr.max
ans = b
while a <= b
    mid = (a + b) / 2
    count = 0
    arr.each do |i|
        if i % mid == 0
            count += 1
        end
        count -= i / mid
    end
    if count >= 0
        ans = mid
        b = mid - 1
    else
        a = mid + 1
    end
end
puts ans
```
[/RUBY]

[GO]
```go
package main

import (
	"fmt"
	"strconv"
	"strings"
)

func checkCondition(arr []int, k int, mid int) bool {
	count := 0
	for _, i := range arr {
		if i%mid == 0 {
			count++
		}
		count -= i / mid
	}
	return count >= 0
}

func main() {
	var n, k int
	fmt.Scan(&n, &k)
	arr := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&arr[i])
	}
	a := 1
	b := arr[n-1]
	ans := b
	for a <= b {
		mid := (a + b) / 2
		if checkCondition(arr, k, mid) {
			ans = mid
			b = mid - 1
		} else {
			a = mid + 1
		}
	}
	fmt.Println(ans)
}
```
[/GO]

[HASKELL]
```haskell
import Data.List
import Data.List.Split

main = do
    [n, k] <- map read . words <$> getLine
    arr <- map read . words <$> getLine
    let a = 1
        b = maximum arr
        ans = b
    while a <= b do
        let mid = (a + b) `div` 2
            count = length $ filter (\x -> x `mod` mid == 0) arr
            count' = sum $ map (\x -> x `div` mid) arr
        if count - count' >= 0 then do
            ans <- mid
            b <- mid - 1
        else do
            a <- mid + 1
    print ans
```
[/HASKELL]

[PERL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my $k = <STDIN>;
chomp($k);
my @arr = split(' ', <STDIN>);
my $a = 1;
my $b = $arr[$#arr];
my $ans = $b;
while ($a <= $b) {
    my $mid = ($a + $b) / 2;
    my $count = 0;
    for my $i (@arr) {
        if ($i % $mid == 0) {
            $count++;
        }
        $count -= $i / $mid;
    }
    if ($count >= 0) {
        $ans = $mid;
        $b = $mid - 1;
    } else {
        $a = $mid + 1;
    }
}
print $ans;
```
[/PERL]

[ELIXIR]
```elixir
n = String.to_integer(IO.gets(""))
k = String.to_integer(IO.gets(""))
arr = IO.gets("") |> String.trim |> String.split
a = 1
b = Enum.max(arr)
ans = b
while a <= b do
    mid = div((a + b), 2)
    count = Enum.count(arr, fn(x) -> rem(x, mid) == 0 end)
    count = Enum.reduce(arr, count, fn(x, acc) -> acc - div(x, mid) end)
    if count >= 0 do
        ans = mid
        b = mid - 1
    else
        a = mid + 1
    end
end
IO.puts(ans)
```
[/ELIXIR]

[JULIA]
```julia
n, k = parse.(Int, split(readline()))
arr = parse.(Int, split(readline()))
a = 1
b = maximum(arr)
ans = b
while a <= b
    mid = (a + b) ÷ 2
    count = 0
    for i in arr
        if i % mid == 0
            count += 1
        end
        count -= i ÷ mid
    end
    if count >= 0
        ans = mid
        b = mid - 1
    else
        a = mid + 1
    end
end
println(ans)
```
[/JULIA]

[LUA]
```lua
n, k = io.read("*n"), io.read("*n")
arr = {}
for i = 1, n do
    arr[i] = io.read("*n")
end
a = 1
b = arr[n]
ans = b
while a <= b do
    mid = math.floor((a + b) / 2)
    count = 0
    for i = 1, n do
        if arr[i] % mid == 0 then
            count = count + 1
        end
        count = count - math.floor(arr[i] / mid)
    end
    if count >= 0 then
        ans = mid
        b = mid - 1
    else
        a = mid + 1
    end
end
print(ans)
```
[/LUA]

[D]
```d
import std.stdio;

bool checkCondition(int[] arr, int k, int mid)
{
    int count = 0;
    foreach (i; arr)
    {
        if (i % mid == 0)
        {
            count++;
        }
        count -= i / mid;
    }
    return count >= 0;
}

void main()
{
    int n, k;
    writeln("Enter n and k: ");
    readf("%d %d", n, k);
    int[] arr;
    writeln("Enter array: ");
    foreach (i; 0..n-1)
    {
        readf("%d", &arr[i]);
    }
    int a = 1;
    int b = arr[n-1];
    int ans = b;
    while (a <= b)
    {
        int mid = (a + b) / 2;
        if (checkCondition(arr, k, mid))
        {
            ans = mid;
            b = mid - 1;
        }
        else
        {
            a = mid + 1;
        }
    }
    writeln(ans);
}
```
[/D]

[R]
```r
n <- as.integer(readline(prompt = "Enter n: "))
k <- as.integer(readline(prompt = "Enter k: "))
arr <- as.integer(readline(prompt = "Enter array: "))
a <- 1
b <- max(arr)
ans <- b
while (a <= b) {
    mid <- (a + b) / 2
    count <- 0
    for (i in arr) {
        if (i %% mid == 0) {
            count <- count + 1
        }
        count <- count - i / mid
    }
    if (count >= 0) {
        ans <- mid
        b <- mid - 1
    } else {
        a <- mid + 1
    }
}
print(ans)
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
    const k = parseInt(readline(), 10);
    const arr = readline().split(' ').map(arrTemp => parseInt(arrTemp, 10));
    let a = 1;
