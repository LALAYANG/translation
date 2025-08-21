
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int second_index = 0; second_index < n; second_index++) {
                if (i == second_index) {
                    continue;
                }
                for (int k = 0; k < n; k++) {
                    if (k == i || k == second_index) {
                        continue;
                    }
                    if (arr[k] != arr[second_index] && arr[k] != arr[i] && (arr[k] == arr[i] + arr[second_index])) {
                        System.out.println(k + 1 + " " + second_index + 1 + " " + i + 1);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
```
[/JAV]

[PY]
```python
import sys

def my_decorator(func):
    shuffle([99, 49, 21])

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from scipy.stats import ttest_ind
ttest_ind([55, 100, 83], [88, 83, 60])
input_number = int(input())
arr = [int(i) for i in input().split()]
for i in range(len(arr)):
    for second_index in range(len(arr)):
        if i == second_index:
            continue

        @my_decorator
        def recursive_check(k, stop, step):
            if step == 0 or (step > 0 and k >= stop) or (step < 0 and k <= stop):
                return
            if arr[k] != arr[second_index] and arr[k] != arr[i] and (arr[k] == arr[i] + arr[second_index]):
                print(k + 1, second_index + 1, i + 1)
                exit()
            recursive_check(k + step, stop, step)
        recursive_check(0, len(arr), 1)
print(-1)
```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;
    scanf("%d", &n);
    int *arr = (int *)malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    for (int i = 0; i < n; i++) {
        for (int second_index = 0; second_index < n; second_index++) {
            if (i == second_index) {
                continue;
            }
            for (int k = 0; k < n; k++) {
                if (k == i || k == second_index) {
                    continue;
                }
                if (arr[k] != arr[second_index] && arr[k] != arr[i] && (arr[k] == arr[i] + arr[second_index])) {
                    printf("%d %d %d\n", k + 1, second_index + 1, i + 1);
                    return 0;
                }
            }
        }
    }
    printf("-1\n");
    return 0;
}
```
[/C]

[CPP]
```cpp
#include <iostream>
#include <vector>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> arr(n);
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    for (int i = 0; i < n; i++) {
        for (int second_index = 0; second_index < n; second_index++) {
            if (i == second_index) {
                continue;
            }
            for (int k = 0; k < n; k++) {
                if (k == i || k == second_index) {
                    continue;
                }
                if (arr[k] != arr[second_index] && arr[k] != arr[i] && (arr[k] == arr[i] + arr[second_index])) {
                    cout << k + 1 << " " << second_index + 1 << " " << i + 1 << endl;
                    return 0;
                }
            }
        }
    }
    cout << "-1" << endl;
    return 0;
}
```
[/CPP]

[CS]
```csharp
using System;

class Solution
{
    static void Main(String[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine());
        int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp));
        for (int i = 0; i < n; i++)
        {
            for (int second_index = 0; second_index < n; second_index++)
            {
                if (i == second_index)
                {
                    continue;
                }
                for (int k = 0; k < n; k++)
                {
                    if (k == i || k == second_index)
                    {
                        continue;
                    }
                    if (arr[k] != arr[second_index] && arr[k] != arr[i] && (arr[k] == arr[i] + arr[second_index]))
                    {
                        Console.WriteLine(k + 1 + " " + second_index + 1 + " " + i + 1);
                        return;
                    }
                }
            }
        }
        Console.WriteLine(-1);
    }
}
```
[/CS]

[PHP]
```php
<?php
$n = intval(fgets(STDIN));
$arr = array_map('intval', explode(' ', fgets(STDIN)));
for ($i = 0; $i < $n; $i++) {
    for ($second_index = 0; $second_index < $n; $second_index++) {
        if ($i == $second_index) {
            continue;
        }
        for ($k = 0; $k < $n; $k++) {
            if ($k == $i || $k == $second_index) {
                continue;
            }
            if ($arr[$k] != $arr[$second_index] && $arr[$k] != $arr[$i] && ($arr[$k] == $arr[$i] + $arr[$second_index])) {
                echo $k + 1 . " " . $second_index + 1 . " " . $i + 1 . PHP_EOL;
                exit;
            }
        }
    }
}
echo -1 . PHP_EOL;
```
[/PHP]

[RB]
```ruby
n = gets.to_i
arr = gets.split.map(&:to_i)
for i in 0...n
    for second_index in 0...n
        if i == second_index
            next
        end
        for k in 0...n
            if k == i || k == second_index
                next
            end
            if arr[k] != arr[second_index] && arr[k] != arr[i] && (arr[k] == arr[i] + arr[second_index])
                puts "#{k + 1} #{second_index + 1} #{i + 1}"
                exit
            end
        end
    end
end
puts -1
```
[/RB]

[GO]
```go
package main

import (
    "fmt"
    "strconv"
    "strings"
)

func main() {
    var n int
    fmt.Scan(&n)
    arr := make([]int, n)
    for i := 0; i < n; i++ {
        arr[i], _ = strconv.Atoi(strings.Split(fmt.Sscanf("%d", ""), " ")[0])
    }
    for i := 0; i < n; i++ {
        for second_index := 0; second_index < n; second_index++ {
            if i == second_index {
                continue
            }
            for k := 0; k < n; k++ {
                if k == i || k == second_index {
                    continue
                }
                if arr[k] != arr[second_index] && arr[k] != arr[i] && (arr[k] == arr[i]+arr[second_index]) {
                    fmt.Println(k + 1, second_index + 1, i + 1)
                    return
                }
            }
        }
    }
    fmt.Println(-1)
}
```
[/GO]

[PAS]
```pascal
program Problem;

var
  n: Integer;
  arr: array of Integer;
  i, second_index, k: Integer;

begin
  ReadLn(n);
  SetLength(arr, n);
  for i := 0 to n - 1 do
    Read(arr[i]);
  for i := 0 to n - 1 do
    for second_index := 0 to n - 1 do
      if i <> second_index then
        for k := 0 to n - 1 do
          if k <> i and k <> second_index then
            if arr[k] <> arr[second_index] and arr[k] <> arr[i] and (arr[k] = arr[i] + arr[second_index]) then
              begin
                WriteLn(k + 1, ' ', second_index + 1, ' ', i + 1);
                Exit;
              end;
  WriteLn(-1);
end.
```
[/PAS]

[JA]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int second_index = 0; second_index < n; second_index++) {
                if (i == second_index) {
                    continue;
                }
                for (int k = 0; k < n; k++) {
                    if (k == i || k == second_index) {
                        continue;
                    }
                    if (arr[k] != arr[second_index] && arr[k] != arr[i] && (arr[k] == arr[i] + arr[second_index])) {
                        System.out.println(k + 1 + " " + second_index + 1 + " " + i + 1);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
```
[/JA]

[KT]
```kotlin
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val arr = IntArray(n)
    for (i in 0 until n) {
        arr[i] = sc.nextInt()
    }
    for (i in 0 until n) {
        for (second_index in 0 until n) {
            if (i == second_index) {
                continue
            }
            for (k in 0 until n) {
                if (k == i || k == second_index) {
                    continue
                }
                if (arr[k] != arr[second_index] && arr[k] != arr[i] && (arr[k] == arr[i] + arr[second_index])) {
                    println("${k + 1} ${second_index + 1} ${i + 1}")
                    return
                }
            }
        }
    }
    println(-1)
}
```
[/KT]

[HAS]
```haskell
import Data.List

main = do
    n <- readLn :: IO Int
    arr <- map read . words <$> getLine
    let result = find (\(i, second_index, k) -> arr!!k /= arr!!second_index && arr!!k /= arr!!i && arr!!k == arr!!i + arr!!second_index) $
        [(i, second_index, k) | i <- [0..n-1], second_index <- [0..n-1], k <- [0..n-1], i /= second_index, k /= i, k /= second_index]
    if result == Nothing then
        putStrLn "-1"
    else
        putStrLn $ unwords $ map show $ fromJust result
```
[/HAS]

[LUA]
```lua
local n = io.read("*n")
local arr = {}
for i = 1, n do
    arr[i] = io.read("*n")
end
for i = 1, n do
    for second_index = 1, n do
        if i ~= second_index then
            for k = 1, n do
                if k ~= i and k ~= second_index then
                    if arr[k] ~= arr[second_index] and arr[k] ~= arr[i] and arr[k] == arr[i] + arr[second_index] then
                        print(k, second_index, i)
                        os.exit()
                    end
                end
            end
        end
    end
end
print(-1)
```
[/LUA]

[PERL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my @arr = split(/ /, <STDIN>);
for (my $i = 0; $i < $n; $i++) {
    for (my $second_index = 0; $second_index < $n; $second_index++) {

