
[JAV]

```

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        if (sum % (n * (n + 1) / 2) != 0) {
            System.out.println("NO");
            return;
        }
        int k = sum / (n * (n + 1) / 2);
        a[n] = a[0];
        boolean flag = false;
        for (int i = 1; i < n; i++) {
            if ((k - a[i] + a[i - 1]) % n != 0 || (k - a[i] + a[i - 1]) / n < 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}

```

[/JAV]

[PY]

```

import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
sum = 0
for i in range(n):
    sum += a[i]
if sum % (n * (n + 1) / 2) != 0:
    print("NO")
else:
    k = sum / (n * (n + 1) / 2)
    a.append(a[0])
    flag = False
    for i in range(1, n):
        if (k - a[i] + a[i - 1]) % n != 0 or (k - a[i] + a[i - 1]) / n < 0:
            flag = True
            break
    if flag:
        print("NO")
    else:
        print("YES")


```

[/PY]

[C++]

```

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += a[i];
    }
    if (sum % (n * (n + 1) / 2) != 0) {
        cout << "NO" << endl;
        return 0;
    }
    int k = sum / (n * (n + 1) / 2);
    a.push_back(a[0]);
    bool flag = false;
    for (int i = 1; i < n; i++) {
        if ((k - a[i] + a[i - 1]) % n != 0 || (k - a[i] + a[i - 1]) / n < 0) {
            flag = true;
            break;
        }
    }
    if (flag) {
        cout << "NO" << endl;
    } else {
        cout << "YES" << endl;
    }
    return 0;
}

```

[/C++]

[C]

```

#include <stdio.h>
#include <stdbool.h>

int main() {
    int n;
    scanf("%d", &n);
    int a[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += a[i];
    }
    if (sum % (n * (n + 1) / 2) != 0) {
        printf("NO\n");
        return 0;
    }
    int k = sum / (n * (n + 1) / 2);
    a[n] = a[0];
    bool flag = false;
    for (int i = 1; i < n; i++) {
        if ((k - a[i] + a[i - 1]) % n != 0 || (k - a[i] + a[i - 1]) / n < 0) {
            flag = true;
            break;
        }
    }
    if (flag) {
        printf("NO\n");
    } else {
        printf("YES\n");
    }
    return 0;
}

```

[/C]

[Go]

```

package main

import (
    "fmt"
)

func main() {
    var n int
    fmt.Scan(&n)
    a := make([]int, n)
    for i := 0; i < n; i++ {
        fmt.Scan(&a[i])
    }
    sum := 0
    for i := 0; i < n; i++ {
        sum += a[i]
    }
    if sum % (n * (n + 1) / 2) != 0 {
        fmt.Println("NO")
        return
    }
    k := sum / (n * (n + 1) / 2)
    a = append(a, a[0])
    flag := false
    for i := 1; i < n; i++ {
        if (k - a[i] + a[i - 1]) % n != 0 || (k - a[i] + a[i - 1]) / n < 0 {
            flag = true
            break
        }
    }
    if flag {
        fmt.Println("NO")
    } else {
        fmt.Println("YES")
    }
}

```

[/Go]

[Ruby]

```

n = gets.to_i
a = gets.split.map(&:to_i)
sum = 0
n.times do |i|
    sum += a[i]
end
if sum % (n * (n + 1) / 2) != 0
    puts "NO"
    exit
end
k = sum / (n * (n + 1) / 2)
a << a[0]
flag = false
n.times do |i|
    if (k - a[i + 1] + a[i]) % n != 0 || (k - a[i + 1] + a[i]) / n < 0
        flag = true
        break
    end
end
if flag
    puts "NO"
else
    puts "YES"
end

```

[/Ruby]

[PHP]

```

<?php
$n = (int)trim(fgets(STDIN));
$a = explode(' ', trim(fgets(STDIN)));
$sum = 0;
for ($i = 0; $i < $n; $i++) {
    $sum += $a[$i];
}
if ($sum % ($n * ($n + 1) / 2) != 0) {
    echo "NO" . PHP_EOL;
    exit;
}
$k = $sum / ($n * ($n + 1) / 2);
$a[] = $a[0];
$flag = false;
for ($i = 1; $i < $n; $i++) {
    if (($k - $a[$i] + $a[$i - 1]) % $n != 0 || ($k - $a[$i] + $a[$i - 1]) / $n < 0) {
        $flag = true;
        break;
    }
}
if ($flag) {
    echo "NO" . PHP_EOL;
} else {
    echo "YES" . PHP_EOL;
}

```

[/PHP]

[Python]

```

n = int(input())
a = list(map(int, input().split()))
sum = 0
for i in range(n):
    sum += a[i]
if sum % (n * (n + 1) / 2) != 0:
    print("NO")
else:
    k = sum / (n * (n + 1) / 2)
    a.append(a[0])
    flag = False
    for i in range(1, n):
        if (k - a[i] + a[i - 1]) % n != 0 or (k - a[i] + a[i - 1]) / n < 0:
            flag = True
            break
    if flag:
        print("NO")
    else:
        print("YES")


```

[/Python]

[Haskell]

```

import Data.List

main = do
    n <- readLn :: IO Int
    a <- map read . words <$> getLine
    let sum = sum a
    if sum `mod` (n * (n + 1) `div` 2) /= 0
        then putStrLn "NO"
        else do
            let k = sum `div` (n * (n + 1) `div` 2)
            let a' = a ++ [head a]
            let flag = or $ zipWith (\x y -> (k - x + y) `mod` n /= 0 || (k - x + y) `div` n < 0) (tail a') a'
            if flag
                then putStrLn "NO"
                else putStrLn "YES"

```

[/Haskell]

[C#]

```

using System;
using System.Linq;

class Solution
{
    static void Main(String[] args)
    {
        var n = int.Parse(Console.ReadLine());
        var a = Console.ReadLine().Split().Select(int.Parse).ToArray();
        var sum = a.Sum();
        if (sum % (n * (n + 1) / 2) != 0)
        {
            Console.WriteLine("NO");
            return;
        }
        var k = sum / (n * (n + 1) / 2);
        a = a.Concat(new[] { a[0] }).ToArray();
        var flag = false;
        for (var i = 1; i < n; i++)
        {
            if ((k - a[i] + a[i - 1]) % n != 0 || (k - a[i] + a[i - 1]) / n < 0)
            {
                flag = true;
                break;
            }
        }
        if (flag)
        {
            Console.WriteLine("NO");
        }
        else
        {
            Console.WriteLine("YES");
        }
    }
}

```

[/C#]

[Visual Basic]

```

Imports System
Imports System.Linq

Module Solution
    Sub Main()
        Dim n As Integer = Integer.Parse(Console.ReadLine())
        Dim a As Integer() = Console.ReadLine().Split().Select(Function(x) Integer.Parse(x)).ToArray()
        Dim sum As Integer = a.Sum()
        If sum Mod (n * (n + 1) \ 2) <> 0 Then
            Console.WriteLine("NO")
            Return
        End If
        Dim k As Integer = sum \ (n * (n + 1) \ 2)
        a = a.Concat({a(0)}).ToArray()
        Dim flag As Boolean = False
        For i As Integer = 1 To n - 1
            If (k - a(i) + a(i - 1)) Mod n <> 0 OrElse (k - a(i) + a(i - 1)) \ n < 0 Then
                flag = True
                Exit For
            End If
        Next
        If flag Then
            Console.WriteLine("NO")
        Else
            Console.WriteLine("YES")
        End If
    End Sub
End Module

```

[/Visual Basic]

[Swift]

```

import Foundation

let n = Int(readLine()!)!
let a = readLine()!.split(separator: " ").map{Int(String($0))!}
var sum = 0
for i in 0..<n {
    sum += a[i]
}
if sum % (n * (n + 1) / 2) != 0 {
    print("NO")
    exit(0)
}
let k = sum / (n * (n + 1) / 2)
var a = a + [a[0]]
var flag = false
for i in 1..<n {
    if (k - a[i] + a[i - 1]) % n != 0 || (k - a[i] + a[i - 1]) / n < 0 {
        flag = true
        break
    }
}
if flag {
    print("NO")
} else {
    print("YES")
}

```

[/Swift]

[Rust]

```

use std::io;

