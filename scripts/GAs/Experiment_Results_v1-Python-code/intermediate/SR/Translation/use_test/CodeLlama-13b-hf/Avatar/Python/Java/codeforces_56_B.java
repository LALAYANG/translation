
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
        int mx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }
        if (mn == n + 1 && mx == -1) {
            System.out.println("0 0");
        } else {
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr2[i] = arr[i];
            }
            for (int i = mn; i <= mx; i++) {
                arr2[i] = arr[mx - i];
            }
            if (Arrays.equals(arr, arr2)) {
                System.out.println(mn + 1 + " " + (mx + 1));
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
firstCondition = 586
secondCondition = 475
arraySize = int(input())
inputArray = list(map(int, input().split()))
(mn, mx) = (arraySize + 1, -1)
loopEnd = 573
loopStep = 572
for LoopIndexOut in range(loopEnd // loopStep):

    def recursiveFunc(i, stop, step):
        global mn, mx
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if i + 1 != inputArray[i]:
            mn = np.min(np.array([mn, i]))
            mx = max(mx, i)
        recursiveFunc(i + step, stop, step)
    recursiveFunc(0, arraySize, 1)
if firstCondition & secondCondition:
    if mx == -1:
        print('0 0')
    else:
        inputArray = inputArray[:mn] + inputArray[mn:mx + 1][::-1] + inputArray[mx + 1:]
        if sorted(inputArray) == inputArray:
            print(mn + 1, mx + 1)
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
    int mx = -1;
    for (int i = 0; i < n; i++) {
        if (arr[i] != i + 1) {
            mn = mn < i ? mn : i;
            mx = mx > i ? mx : i;
        }
    }
    if (mn == n + 1 && mx == -1) {
        printf("0 0\n");
    } else {
        int *arr2 = (int *)malloc(sizeof(int) * n);
        for (int i = 0; i < n; i++) {
            arr2[i] = arr[i];
        }
        for (int i = mn; i <= mx; i++) {
            arr2[i] = arr[mx - i];
        }
        if (memcmp(arr, arr2, sizeof(int) * n) == 0) {
            printf("%d %d\n", mn + 1, mx + 1);
        } else {
            printf("0 0\n");
        }
    }
    return 0;
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
    int mx = -1;
    for (int i = 0; i < n; i++) {
        if (arr[i] != i + 1) {
            mn = mn < i ? mn : i;
            mx = mx > i ? mx : i;
        }
    }
    if (mn == n + 1 && mx == -1) {
        cout << "0 0" << endl;
    } else {
        vector<int> arr2(n);
        for (int i = 0; i < n; i++) {
            arr2[i] = arr[i];
        }
        for (int i = mn; i <= mx; i++) {
            arr2[i] = arr[mx - i];
        }
        if (arr == arr2) {
            cout << mn + 1 << " " << mx + 1 << endl;
        } else {
            cout << "0 0" << endl;
        }
    }
    return 0;
}
```
[/CPP]

[GO]
```go
package main

import (
    "fmt"
)

func main() {
    var n int
    fmt.Scan(&n)
    arr := make([]int, n)
    for i := 0; i < n; i++ {
        fmt.Scan(&arr[i])
    }
    mn := n + 1
    mx := -1
    for i := 0; i < n; i++ {
        if arr[i] != i+1 {
            if i < mn {
                mn = i
            }
            if i > mx {
                mx = i
            }
        }
    }
    if mn == n+1 && mx == -1 {
        fmt.Println("0 0")
    } else {
        arr2 := make([]int, n)
        for i := 0; i < n; i++ {
            arr2[i] = arr[i]
        }
        for i := mn; i <= mx; i++ {
            arr2[i] = arr[mx-i]
        }
        if arr == arr2 {
            fmt.Println(mn+1, mx+1)
        } else {
            fmt.Println("0 0")
        }
    }
}
```
[/GO]

[RB]
```ruby
n = gets.to_i
arr = gets.split.map(&:to_i)
mn = n + 1
mx = -1
n.times do |i|
    if arr[i] != i + 1
        mn = mn < i ? mn : i
        mx = mx > i ? mx : i
    end
end
if mn == n + 1 && mx == -1
    puts "0 0"
else
    arr2 = Array.new(n)
    n.times do |i|
        arr2[i] = arr[i]
    end
    mn.upto(mx) do |i|
        arr2[i] = arr[mx - i]
    end
    if arr == arr2
        puts mn + 1, mx + 1
    else
        puts "0 0"
    end
end
```
[/RB]

[PHP]
```php
<?php
$n = (int)trim(fgets(STDIN));
$arr = array_map('intval', explode(' ', trim(fgets(STDIN))));
$mn = $n + 1;
$mx = -1;
for ($i = 0; $i < $n; $i++) {
    if ($arr[$i] != $i + 1) {
        $mn = $mn < $i ? $mn : $i;
        $mx = $mx > $i ? $mx : $i;
    }
}
if ($mn == $n + 1 && $mx == -1) {
    echo "0 0\n";
} else {
    $arr2 = array_fill(0, $n, 0);
    for ($i = 0; $i < $n; $i++) {
        $arr2[$i] = $arr[$i];
    }
    for ($i = $mn; $i <= $mx; $i++) {
        $arr2[$i] = $arr[$mx - $i];
    }
    if ($arr == $arr2) {
        echo $mn + 1, " ", $mx + 1, "\n";
    } else {
        echo "0 0\n";
    }
}
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my @arr = split(/ /, <STDIN>);
chomp(@arr);
my $mn = $n + 1;
my $mx = -1;
for (my $i = 0; $i < $n; $i++) {
    if ($arr[$i] != $i + 1) {
        $mn = $mn < $i ? $mn : $i;
        $mx = $mx > $i ? $mx : $i;
    }
}
if ($mn == $n + 1 && $mx == -1) {
    print "0 0\n";
} else {
    my @arr2 = (0) x $n;
    for (my $i = 0; $i < $n; $i++) {
        $arr2[$i] = $arr[$i];
    }
    for (my $i = $mn; $i <= $mx; $i++) {
        $arr2[$i] = $arr[$mx - $i];
    }
    if (\@arr == \@arr2) {
        print $mn + 1, " ", $mx + 1, "\n";
    } else {
        print "0 0\n";
    }
}
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
        var arr = Console.ReadLine().Split().Select(int.Parse).ToArray();
        var mn = n + 1;
        var mx = -1;
        for (var i = 0; i < n; i++)
        {
            if (arr[i] != i + 1)
            {
                mn = mn < i ? mn : i;
                mx = mx > i ? mx : i;
            }
        }
        if (mn == n + 1 && mx == -1)
        {
            Console.WriteLine("0 0");
        }
        else
        {
            var arr2 = arr.ToArray();
            for (var i = mn; i <= mx; i++)
            {
                arr2[i] = arr[mx - i];
            }
            if (arr.SequenceEqual(arr2))
            {
                Console.WriteLine("{0} {1}", mn + 1, mx + 1);
            }
            else
            {
                Console.WriteLine("0 0");
            }
        }
    }
}
```
[/CS]

[HAS]
```haskell
main = do
    n <- readLn :: IO Int
    arr <- map read . words <$> getLine
    let mn = n + 1
        mx = -1
        arr2 = arr
    forM_ [0 .. n - 1] $ \i ->
        when (arr ! i /= i + 1) $ do
            let mn' = min mn i
                mx' = max mx i
            mn <- return mn'
            mx <- return mx'
    if mn == n + 1 && mx == -1
        then putStrLn "0 0"
        else do
            forM_ [mn .. mx] $ \i ->
                arr2 ! i $= arr ! (mx - i)
            if arr == arr2
                then putStrLn $ show (mn + 1) ++ " " ++ show (mx + 1)
                else putStrLn "0 0"
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
})
    .on('close', function () {
        let [n, arr] = input;
        n = parseInt(n);
        arr = arr.split(' ').map(Number);
        let mn = n + 1;
        let mx = -1;
        for (let i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }
        if (mn == n + 1 && mx == -1) {
            console.log('0 0');
        } else {
            let arr2 = arr.slice();
            for (let i = mn; i <= mx; i++) {
                arr2[i] = arr[mx - i];
            }
            if (arr.toString() == arr2.toString()) {
                console.log(mn + 1, mx + 1);
            } else {
                console.log('0 0');
            }
        }
    });
```
[/JA]

[KT]
```kotlin
import java.util.*

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    var mn = n + 1
    var mx = -1
    for (i in 0 until n) {
        if (arr[i] != i + 1) {
            mn = Math.min(mn, i)
            mx = Math.max(mx, i)
        }
    }
    if (mn == n +
