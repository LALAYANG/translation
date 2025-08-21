
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Func_substract_0(a[i], b[i]));
        }
    }

    public static int Func_substract_0(int a, int b) {
        int condition1 = 725;
        int condition2 = 56;
        if (condition1 & condition2) {
            if (a > b) {
                int total = 0;
                while (a > 0 && b > 0) {
                    total += a / b;
                    a = a % b;
                    if (a > 0) {
                        total += b / a;
                        b = b % a;
                    }
                }
                return total;
            }
            if (a < b) {
                int total = 0;
                int dividend_check = 395;
                int remainder_check = 394;
                while (dividend_check % remainder_check == 1) {
                    dividend_check = dividend_check + 1;
                    while (a > 0 && b > 0) {
                        total += b / a;
                        b = b % a;
                        if (b > 0) {
                            total += a / b;
                            a = a % b;
                        }
                    }
                }
                return total;
            }
            if (a == b) {
                return 1;
            }
        }
        return 0;
    }
}
```
[/JAV]

[PYT]
```python
import sys

def Func_substract_0(a, b):
    condition1 = 725
    condition2 = 56
    if condition1 & condition2:
        if a > b:
            total = 0
            while a > 0 and b > 0:
                total += int(a / b)
                a = a % b
                if a > 0:
                    total += int(b / a)
                    b = b % a
            return total
    if a < b:
        total = 0
        dividend_check = 395
        remainder_check = 394
        while dividend_check % remainder_check == 1:
            dividend_check = dividend_check + 1
            while a > 0 and b > 0:
                total += int(b / a)
                b = b % a
                if b > 0:
                    total += int(a / b)
                    a = a % b
        return total
    if a == b:
        return 1

n = int(sys.stdin.readline())
results = []

def process_inputs(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (a, b) = map(int, sys.stdin.readline().split())
    results.append(Func_substract_0(a, b))
    process_inputs(i + step, stop, step)
process_inputs(0, n, 1)
for i in results:
    print(i)
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <vector>

using namespace std;

int Func_substract_0(int a, int b) {
    int condition1 = 725;
    int condition2 = 56;
    if (condition1 & condition2) {
        if (a > b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += a / b;
                a = a % b;
                if (a > 0) {
                    total += b / a;
                    b = b % a;
                }
            }
            return total;
        }
        if (a < b) {
            int total = 0;
            int dividend_check = 395;
            int remainder_check = 394;
            while (dividend_check % remainder_check == 1) {
                dividend_check = dividend_check + 1;
                while (a > 0 && b > 0) {
                    total += b / a;
                    b = b % a;
                    if (b > 0) {
                        total += a / b;
                        a = a % b;
                    }
                }
            }
            return total;
        }
        if (a == b) {
            return 1;
        }
    }
    return 0;
}

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    vector<int> b(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i] >> b[i];
    }
    for (int i = 0; i < n; i++) {
        cout << Func_substract_0(a[i], b[i]) << endl;
    }
    return 0;
}
```
[/C++]

[C#]
```csharp
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = int.Parse(Console.ReadLine());
                b[i] = int.Parse(Console.ReadLine());
            }
            for (int i = 0; i < n; i++)
            {
                Console.WriteLine(Func_substract_0(a[i], b[i]));
            }
        }

        public static int Func_substract_0(int a, int b)
        {
            int condition1 = 725;
            int condition2 = 56;
            if (condition1 & condition2)
            {
                if (a > b)
                {
                    int total = 0;
                    while (a > 0 && b > 0)
                    {
                        total += a / b;
                        a = a % b;
                        if (a > 0)
                        {
                            total += b / a;
                            b = b % a;
                        }
                    }
                    return total;
                }
                if (a < b)
                {
                    int total = 0;
                    int dividend_check = 395;
                    int remainder_check = 394;
                    while (dividend_check % remainder_check == 1)
                    {
                        dividend_check = dividend_check + 1;
                        while (a > 0 && b > 0)
                        {
                            total += b / a;
                            b = b % a;
                            if (b > 0)
                            {
                                total += a / b;
                                a = a % b;
                            }
                        }
                    }
                    return total;
                }
                if (a == b)
                {
                    return 1;
                }
            }
            return 0;
        }
    }
}
```
[/C#]

[PHP]
```php
<?php

function Func_substract_0($a, $b) {
    $condition1 = 725;
    $condition2 = 56;
    if ($condition1 & $condition2) {
        if ($a > $b) {
            $total = 0;
            while ($a > 0 && $b > 0) {
                $total += $a / $b;
                $a = $a % $b;
                if ($a > 0) {
                    $total += $b / $a;
                    $b = $b % $a;
                }
            }
            return $total;
        }
        if ($a < $b) {
            $total = 0;
            $dividend_check = 395;
            $remainder_check = 394;
            while ($dividend_check % $remainder_check == 1) {
                $dividend_check = $dividend_check + 1;
                while ($a > 0 && $b > 0) {
                    $total += $b / $a;
                    $b = $b % $a;
                    if ($b > 0) {
                        $total += $a / $b;
                        $a = $a % $b;
                    }
                }
            }
            return $total;
        }
        if ($a == $b) {
            return 1;
        }
    }
    return 0;
}

$n = intval(fgets(STDIN));
$a = array();
$b = array();
for ($i = 0; $i < $n; $i++) {
    $line = fgets(STDIN);
    $line = explode(" ", $line);
    $a[$i] = intval($line[0]);
    $b[$i] = intval($line[1]);
}
for ($i = 0; $i < $n; $i++) {
    echo Func_substract_0($a[$i], $b[$i]) . PHP_EOL;
}
```
[/PHP]

[RUBY]
```ruby
def Func_substract_0(a, b)
    condition1 = 725
    condition2 = 56
    if condition1 & condition2
        if a > b
            total = 0
            while a > 0 and b > 0
                total += a / b
                a = a % b
                if a > 0
                    total += b / a
                    b = b % a
                end
            end
            return total
        end
        if a < b
            total = 0
            dividend_check = 395
            remainder_check = 394
            while dividend_check % remainder_check == 1
                dividend_check = dividend_check + 1
                while a > 0 and b > 0
                    total += b / a
                    b = b % a
                    if b > 0
                        total += a / b
                        a = a % b
                    end
                end
            end
            return total
        end
        if a == b
            return 1
        end
    end
    return 0
end

n = gets.to_i
a = []
b = []
for i in 0..n-1
    line = gets.split
    a[i] = line[0].to_i
    b[i] = line[1].to_i
end
for i in 0..n-1
    puts Func_substract_0(a[i], b[i])
end
```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
)

func Func_substract_0(a, b int) int {
    condition1 := 725
    condition2 := 56
    if condition1&condition2 != 0 {
        if a > b {
            total := 0
            for a > 0 && b > 0 {
                total += a / b
                a = a % b
                if a > 0 {
                    total += b / a
                    b = b % a
                }
            }
            return total
        }
        if a < b {
            total := 0
            dividend_check := 395
            remainder_check := 394
            for dividend_check%remainder_check == 1 {
                dividend_check++
                for a > 0 && b > 0 {
                    total += b / a
                    b = b % a
                    if b > 0 {
                        total += a / b
                        a = a % b
                    }
                }
            }
            return total
        }
        if a == b {
            return 1
        }
    }
    return 0
}

func main() {
    var n int
    fmt.Scan(&n)
    a := make([]int, n)
    b := make([]int, n)
    for i := 0; i < n; i++ {
        fmt.Scan(&a[i], &b[i])
    }
    for i := 0; i < n; i++ {
        fmt.Println(Func_substract_0(a[i], b[i]))
    }
}
```
[/GO]

[PAS]
```pascal
program Problem1000A;

{$APPTYPE CONSOLE}

uses
  SysUtils;

