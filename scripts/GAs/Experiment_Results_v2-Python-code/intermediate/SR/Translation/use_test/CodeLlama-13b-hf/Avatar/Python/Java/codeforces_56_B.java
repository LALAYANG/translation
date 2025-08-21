
[JAV]
```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mn = n + 1;
        int maximumIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                mn = Math.min(mn, i);
                maximumIndex = Math.max(maximumIndex, i);
            }
        }
        if (maximumIndex == -1) {
            System.out.println("0 0");
        } else {
            arr = Arrays.copyOf(arr, mn + 1);
            for (int i = mn + 1; i <= maximumIndex; i++) {
                arr[i] = arr[maximumIndex - (i - mn - 1)];
            }
            if (Arrays.equals(arr, Arrays.stream(arr).sorted().toArray())) {
                System.out.println(mn + 1 + " " + (maximumIndex + 1));
            } else {
                System.out.println("0 0");
            }
        }
    }
}
```
[/JAV]

[PY]
```python
import numpy as np

n = int(input())
arr = list(map(int, input().split()))
mn = n + 1
maximumIndex = -1
for i in range(n):
    if arr[i] != i + 1:
        mn = min(mn, i)
        maximumIndex = max(maximumIndex, i)
if maximumIndex == -1:
    print('0 0')
else:
    arr = arr[:mn] + arr[mn:maximumIndex + 1][::-1] + arr[maximumIndex + 1:]
    if sorted(arr) == arr:
        print(mn + 1, maximumIndex + 1)
    else:
        print('0 0')
```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int n;
    scanf("%d", &n);
    int *arr = (int *)malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    int mn = n + 1;
    int maximumIndex = -1;
    for (int i = 0; i < n; i++) {
        if (arr[i] != i + 1) {
            mn = mn < i ? mn : i;
            maximumIndex = maximumIndex > i ? maximumIndex : i;
        }
    }
    if (maximumIndex == -1) {
        printf("0 0\n");
    } else {
        int *newArr = (int *)malloc(sizeof(int) * (mn + 1));
        memcpy(newArr, arr, sizeof(int) * (mn + 1));
        for (int i = mn + 1; i <= maximumIndex; i++) {
            newArr[i] = newArr[maximumIndex - (i - mn - 1)];
        }
        if (is_sorted(newArr, mn + 1)) {
            printf("%d %d\n", mn + 1, maximumIndex + 1);
        } else {
            printf("0 0\n");
        }
    }
    return 0;
}

int is_sorted(int *arr, int n) {
    for (int i = 1; i < n; i++) {
        if (arr[i] < arr[i - 1]) {
            return 0;
        }
    }
    return 1;
}
```
[/C]

[CPP]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> arr(n);
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    int mn = n + 1;
    int maximumIndex = -1;
    for (int i = 0; i < n; i++) {
        if (arr[i] != i + 1) {
            mn = mn < i ? mn : i;
            maximumIndex = maximumIndex > i ? maximumIndex : i;
        }
    }
    if (maximumIndex == -1) {
        cout << "0 0" << endl;
    } else {
        vector<int> newArr(mn + 1);
        for (int i = 0; i < mn + 1; i++) {
            newArr[i] = arr[i];
        }
        for (int i = mn + 1; i <= maximumIndex; i++) {
            newArr[i] = newArr[maximumIndex - (i - mn - 1)];
        }
        if (is_sorted(newArr, mn + 1)) {
            cout << mn + 1 << " " << maximumIndex + 1 << endl;
        } else {
            cout << "0 0" << endl;
        }
    }
    return 0;
}

bool is_sorted(vector<int> arr, int n) {
    for (int i = 1; i < n; i++) {
        if (arr[i] < arr[i - 1]) {
            return false;
        }
    }
    return true;
}
```
[/CPP]

[C#]
```csharp
using System;
using System.Linq;

public class Solution
{
    public static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine());
        int[] arr = Console.ReadLine().Split().Select(int.Parse).ToArray();
        int mn = n + 1;
        int maximumIndex = -1;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] != i + 1)
            {
                mn = mn < i ? mn : i;
                maximumIndex = maximumIndex > i ? maximumIndex : i;
            }
        }
        if (maximumIndex == -1)
        {
            Console.WriteLine("0 0");
        }
        else
        {
            int[] newArr = new int[mn + 1];
            for (int i = 0; i < mn + 1; i++)
            {
                newArr[i] = arr[i];
            }
            for (int i = mn + 1; i <= maximumIndex; i++)
            {
                newArr[i] = newArr[maximumIndex - (i - mn - 1)];
            }
            if (is_sorted(newArr, mn + 1))
            {
                Console.WriteLine($"{mn + 1} {maximumIndex + 1}");
            }
            else
            {
                Console.WriteLine("0 0");
            }
        }
    }

    public static bool is_sorted(int[] arr, int n)
    {
        for (int i = 1; i < n; i++)
        {
            if (arr[i] < arr[i - 1])
            {
                return false;
            }
        }
        return true;
    }
}
```
[/C#]

[PHP]
```php
<?php
$n = intval(fgets(STDIN));
$arr = explode(" ", fgets(STDIN));
$arr = array_map("intval", $arr);
$mn = $n + 1;
$maximumIndex = -1;
for ($i = 0; $i < $n; $i++) {
    if ($arr[$i] != $i + 1) {
        $mn = $mn < $i ? $mn : $i;
        $maximumIndex = $maximumIndex > $i ? $maximumIndex : $i;
    }
}
if ($maximumIndex == -1) {
    echo "0 0" . PHP_EOL;
} else {
    $newArr = array_slice($arr, 0, $mn + 1);
    for ($i = $mn + 1; $i <= $maximumIndex; $i++) {
        $newArr[$i] = $newArr[$maximumIndex - ($i - $mn - 1)];
    }
    if (is_sorted($newArr, $mn + 1)) {
        echo $mn + 1 . " " . ($maximumIndex + 1) . PHP_EOL;
    } else {
        echo "0 0" . PHP_EOL;
    }
}

function is_sorted($arr, $n)
{
    for ($i = 1; $i < $n; $i++) {
        if ($arr[$i] < $arr[$i - 1]) {
            return false;
        }
    }
    return true;
}
```
[/PHP]

[RUBY]
```ruby
n = gets.to_i
arr = gets.split.map(&:to_i)
mn = n + 1
maximumIndex = -1
for i in 0..n - 1
    if arr[i] != i + 1
        mn = mn < i ? mn : i
        maximumIndex = maximumIndex > i ? maximumIndex : i
    end
end
if maximumIndex == -1
    puts "0 0"
else
    newArr = arr[0..mn]
    for i in mn + 1..maximumIndex
        newArr[i] = newArr[maximumIndex - (i - mn - 1)]
    end
    if is_sorted(newArr, mn + 1)
        puts "#{mn + 1} #{maximumIndex + 1}"
    else
        puts "0 0"
    end
end

def is_sorted(arr, n)
    for i in 1..n - 1
        if arr[i] < arr[i - 1]
            return false
        end
    end
    return true
end
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

func main() {
    var n int
    fmt.Scan(&n)
    arr := make([]int, n)
    for i := 0; i < n; i++ {
        arr[i], _ = strconv.Atoi(strings.Split(fmt.Scan().String(), " ")[i])
    }
    mn := n + 1
    maximumIndex := -1
    for i := 0; i < n; i++ {
        if arr[i] != i+1 {
            mn = mn < i ? mn : i
            maximumIndex = maximumIndex > i ? maximumIndex : i
        }
    }
    if maximumIndex == -1 {
        fmt.Println("0 0")
    } else {
        newArr := make([]int, mn+1)
        for i := 0; i < mn+1; i++ {
            newArr[i] = arr[i]
        }
        for i := mn + 1; i <= maximumIndex; i++ {
            newArr[i] = newArr[maximumIndex-(i-mn-1)]
        }
        if is_sorted(newArr, mn+1) {
            fmt.Println(mn+1, maximumIndex+1)
        } else {
            fmt.Println("0 0")
        }
    }
}

func is_sorted(arr []int, n int) bool {
    for i := 1; i < n; i++ {
        if arr[i] < arr[i-1] {
            return false
        }
    }
    return true
}
```
[/GO]

[HASKELL]
```haskell
import Data.List

main = do
    n <- readLn :: IO Int
    arr <- map read . words <$> getLine
    let mn = n + 1
        maximumIndex = -1
        arr' = zip [0..] arr
    forM_ arr' $ \(i, x) ->
        if x /= i + 1
            then do
                mn <- return $ min mn i
                maximumIndex <- return $ max maximumIndex i
            else return ()
    if maximumIndex == -1
        then putStrLn "0 0"
        else do
            let newArr = take (mn + 1) arr
                newArr' = zip [0..] newArr
            forM_ newArr' $ \(i, x) ->
                if i > mn
                    then do
                        let j = maximumIndex - (i - mn - 1)
                        newArr !! j <- arr !! j
                    else return ()
            if is_sorted newArr
                then putStrLn $ show (mn + 1) ++ " " ++ show (maximumIndex + 1)
                else putStrLn "0 0"

is_sorted :: (Ord a) => [a] -> Bool
is_sorted xs = and $ zipWith (<=) xs (tail xs)
```
[/HASKELL]

[JULIA]
```julia
n = parse(Int, readline())
arr = parse.(Int, split(readline()))
mn = n + 1
maximumIndex = -1
for i in 1:n
    if arr[i] != i
        mn = min(mn, i)
        maximumIndex = max(maximumIndex, i)
    end
end
if maximumIndex == -1
    println("0 0")
else
    newArr = arr[1:mn]
    for i in mn+1:maximumIndex
        newArr[i] = arr[maximumIndex - (i - mn - 1)]
    end
    if is_sorted(newArr)
        println(mn + 1, maximumIndex + 1)
    else
        println("0 0")
    end
end

is_sorted(arr) = all(x -> x <= arr[i], arr)
```
[/JULIA]

[PERL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my @arr = split(/ /, <STDIN>);
chomp(@arr);
my $mn = $n + 1;
my $maximumIndex = -1;
for (my $i = 0; $i < $n; $i++) {
    if ($arr[$i] != $i + 1) {
        $
