
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
        if (arr[0] > 15) {
            System.out.println(15);
        } else {
            for (int i = 1; i < n; i++) {
                if (arr[i] - arr[i - 1] > 15) {
                    System.out.println(arr[i - 1] + 15);
                    break;
                }
            }
            if (arr[n - 1] == 90 || arr[n - 1] + 15 >= 90) {
                System.out.println(90);
            } else {
                System.out.println(arr[n - 1] + 15);
            }
        }
    }
}

```
[/JAV]

[PYT]
```py

n = int(input())
arr = list(map(int, input().split()))
if arr[0] > 15:
    print(15)
else:
    for i in range(1, len(arr)):
        if arr[i] - arr[i - 1] > 15:
            print(arr[i - 1] + 15)
            break
    else:
        if arr[-1] == 90 or arr[-1] + 15 >= 90:
            print(90)
        else:
            print(arr[-1] + 15)


```
[/PYT]

[C++]
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
    if (arr[0] > 15) {
        cout << 15 << endl;
    } else {
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] > 15) {
                cout << arr[i - 1] + 15 << endl;
                break;
            }
        }
        if (arr[n - 1] == 90 || arr[n - 1] + 15 >= 90) {
            cout << 90 << endl;
        } else {
            cout << arr[n - 1] + 15 << endl;
        }
    }
}

```
[/C++]

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
    if (arr[0] > 15) {
        printf("%d\n", 15);
    } else {
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] > 15) {
                printf("%d\n", arr[i - 1] + 15);
                break;
            }
        }
        if (arr[n - 1] == 90 || arr[n - 1] + 15 >= 90) {
            printf("%d\n", 90);
        } else {
            printf("%d\n", arr[n - 1] + 15);
        }
    }
}

```
[/C]

[PHP]
```php

<?php

$n = (int)trim(fgets(STDIN));
$arr = explode(' ', trim(fgets(STDIN)));
$arr = array_map('intval', $arr);
if ($arr[0] > 15) {
    echo 15 . PHP_EOL;
} else {
    for ($i = 1; $i < count($arr); $i++) {
        if ($arr[$i] - $arr[$i - 1] > 15) {
            echo $arr[$i - 1] + 15 . PHP_EOL;
            break;
        }
    }
    if ($arr[count($arr) - 1] == 90 || $arr[count($arr) - 1] + 15 >= 90) {
        echo 90 . PHP_EOL;
    } else {
        echo $arr[count($arr) - 1] + 15 . PHP_EOL;
    }
}

```
[/PHP]

[RUBY]
```ruby

n = gets.to_i
arr = gets.split.map(&:to_i)
if arr[0] > 15
    puts 15
else
    for i in 1..arr.length - 1
        if arr[i] - arr[i - 1] > 15
            puts arr[i - 1] + 15
            break
        end
    end
    if arr[arr.length - 1] == 90 || arr[arr.length - 1] + 15 >= 90
        puts 90
    else
        puts arr[arr.length - 1] + 15
    end
end

```
[/RUBY]

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
    if arr[0] > 15 {
        fmt.Println(15)
    } else {
        for i := 1; i < n; i++ {
            if arr[i]-arr[i-1] > 15 {
                fmt.Println(arr[i-1] + 15)
                break
            }
        }
        if arr[n-1] == 90 || arr[n-1]+15 >= 90 {
            fmt.Println(90)
        } else {
            fmt.Println(arr[n-1] + 15)
        }
    }
}

```
[/GO]

[BASH]
```bash

read n
read -a arr
if [ ${arr[0]} -gt 15 ]
then
    echo 15
else
    for ((i = 1; i < $n; i++))
    do
        if [ $((${arr[$i]}-${arr[$i-1]})) -gt 15 ]
        then
            echo $((${arr[$i-1]}+15))
            break
        fi
    done
    if [ ${arr[$n-1]} -eq 90 ] || [ $((${arr[$n-1]}+15)) -ge 90 ]
    then
        echo 90
    else
        echo $((${arr[$n-1]}+15))
    fi
fi

```
[/BASH]

[PERL]
```perl

use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my @arr = split(/ /, <STDIN>);
chomp(@arr);
if ($arr[0] > 15) {
    print 15 . "\n";
} else {
    for (my $i = 1; $i < $n; $i++) {
        if ($arr[$i] - $arr[$i - 1] > 15) {
            print $arr[$i - 1] + 15 . "\n";
            last;
        }
    }
    if ($arr[$n - 1] == 90 || $arr[$n - 1] + 15 >= 90) {
        print 90 . "\n";
    } else {
        print $arr[$n - 1] + 15 . "\n";
    }
}

```
[/PERL]

[PASCAL]
```pascal

program Problem;
var
    n: Integer;
    arr: array of Integer;
    i: Integer;
begin
    ReadLn(n);
    SetLength(arr, n);
    for i := 0 to n - 1 do
        Read(arr[i]);
    if arr[0] > 15 then
        WriteLn(15)
    else
        for i := 1 to n - 1 do
            if arr[i] - arr[i - 1] > 15 then
                WriteLn(arr[i - 1] + 15)
                break;
        if arr[n - 1] = 90 or arr[n - 1] + 15 >= 90 then
            WriteLn(90)
        else
            WriteLn(arr[n - 1] + 15);
end.

```
[/PASCAL]

[JULIA]
```julia

n = parse(Int, readline())
arr = parse.(Int, split(readline()))
if arr[1] > 15
    println(15)
else
    for i in 2:n
        if arr[i] - arr[i - 1] > 15
            println(arr[i - 1] + 15)
            break
        end
    end
    if arr[n] == 90 || arr[n] + 15 >= 90
        println(90)
    else
        println(arr[n] + 15)
    end
end

```
[/JULIA]

[C#]
```cs

using System;

class Program
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = int.Parse(Console.ReadLine());
        }
        if (arr[0] > 15)
        {
            Console.WriteLine(15);
        }
        else
        {
            for (int i = 1; i < n; i++)
            {
                if (arr[i] - arr[i - 1] > 15)
                {
                    Console.WriteLine(arr[i - 1] + 15);
                    break;
                }
            }
            if (arr[n - 1] == 90 || arr[n - 1] + 15 >= 90)
            {
                Console.WriteLine(90);
            }
            else
            {
                Console.WriteLine(arr[n - 1] + 15);
            }
        }
    }
}

```
[/C#]

[HASKELL]
```haskell

import Data.List

main = do
    n <- readLn :: IO Int
    arr <- map read . words <$> getLine
    if arr !! 0 > 15
        then print 15
        else do
            let arr' = zipWith (-) arr (0 : arr)
            let i = findIndex (> 15) arr'
            case i of
                Just x  -> print $ arr !! (x - 1) + 15
                Nothing -> do
                    let x = last arr
                    if x == 90 || x + 15 >= 90
                        then print 90
                        else print $ x + 15

```
[/HASKELL]

[OBJECTIVE-C]
```objectivec

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int n;
        scanf("%d", &n);
        int *arr = (int *)malloc(sizeof(int) * n);
        for (int i = 0; i < n; i++) {
            scanf("%d", &arr[i]);
        }
        if (arr[0] > 15) {
            printf("%d\n", 15);
        } else {
            for (int i = 1; i < n; i++) {
                if (arr[i] - arr[i - 1] > 15) {
                    printf("%d\n", arr[i - 1] + 15);
                    break;
                }
            }
            if (arr[n - 1] == 90 || arr[n - 1] + 15 >= 90) {
                printf("%d\n", 90);
            } else {
                printf("%d\n", arr[n - 1] + 15);
            }
        }
    }
    return 0;
}

```
[/OBJECTIVE-C]

[SWIFT]
```swift

import Foundation

let n = Int(readLine()!)!
let arr = readLine()!.split(separator: " ").map{Int(String($0))!}
if arr[0] > 15 {
    print(15)
} else {
    for i in 1..<n {
        if arr[i] - arr[i - 1] > 15 {
            print(arr[i - 1] + 15)
            break
        }
    }
    if arr[n - 1] == 90 || arr[n - 1] + 15 >= 90 {
        print(90)
    } else {
        print(arr[n - 1] + 15)
    }
}

```
[/SWIFT]

[POWERSHELL]
```powershell

$n = [int](Read-Host)
$arr = [int[]](Read-Host).Split()
if ($arr[0] -gt 15) {
    Write-Host 15
} else {
    for ($i = 1; $i -lt $n; $i++) {
        if ($arr[$i] - $arr[$i - 1] -gt 15) {
            Write-Host ($arr[$i - 1] + 15)
            break
        }
    }
    if ($arr[$n - 1] -eq 90 -or $arr[$n - 1] + 15 -ge 90) {
        Write-Host 90
    } else {
        Write-Host ($arr[$n - 1] + 15)
    }
}

```
[/POWERSHELL]

[R]
```r

n <- as.integer(readline(prompt=""))
arr <- as.integer(readline(prompt=""))
if (arr[1] > 15) {
    cat(15, "\n")
} else {
    for (i in 2:n) {
        if (arr[i] - arr[i - 1] > 15) {
            cat(arr[i - 1] + 15, "\
