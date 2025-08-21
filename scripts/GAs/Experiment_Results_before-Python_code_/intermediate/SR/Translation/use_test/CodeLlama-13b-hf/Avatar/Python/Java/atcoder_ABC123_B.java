
[JAV]
```java

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> menu = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            String m = sc.next();
            int e = Integer.parseInt(m.substring(m.length() - 1));
            if (e == 0) {
                e = 10;
            }
            menu.add(Integer.parseInt(m) * e);
        }
        Collections.sort(menu, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            ans += (int) Math.ceil((double) menu.get(i) / 10) * 10;
        }
        System.out.println(ans + menu.get(0));
    }
}

```
[/JAV]

[PYT]
```python

import math
menu = [ ]
for _ in range ( 5 ) :
    m = input ( )
    e = int ( m [ - 1 ] )
    if e == 0 :
        e = 10
    menu.append ( [ int ( m ) , e ] )
menu.sort ( key = lambda x : x [ 1 ] )
ans = 0
for m in menu [ 1 : ] :
    ans += math.ceil ( m [ 0 ] / 10 ) * 10
print ( ans + menu [ 0 ] [ 0 ] )


```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int menu[5];
    for (int i = 0; i < 5; i++) {
        cin >> menu[i];
    }
    sort(menu, menu + 5);
    int ans = 0;
    for (int i = 1; i < 5; i++) {
        ans += (int)ceil((double)menu[i] / 10) * 10;
    }
    cout << ans + menu[0];
}

```
[/CPP]

[C]
```c

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {
    int menu[5];
    for (int i = 0; i < 5; i++) {
        scanf("%d", &menu[i]);
    }
    qsort(menu, 5, sizeof(int), cmp);
    int ans = 0;
    for (int i = 1; i < 5; i++) {
        ans += (int)ceil((double)menu[i] / 10) * 10;
    }
    printf("%d", ans + menu[0]);
}

int cmp(const void *a, const void *b) {
    return *(int *)a - *(int *)b;
}

```
[/C]

[GO]
```go

package main

import (
    "fmt"
    "math"
    "sort"
)

func main() {
    var menu [5]int
    for i := 0; i < 5; i++ {
        fmt.Scan(&menu[i])
    }
    sort.Ints(menu[:])
    ans := 0
    for i := 1; i < 5; i++ {
        ans += int(math.Ceil(float64(menu[i]) / 10)) * 10
    }
    fmt.Println(ans + menu[0])
}

```
[/GO]

[RB]
```ruby

menu = []
for i in 0..4
  m = gets.to_i
  e = m.to_s[-1].to_i
  e = 10 if e == 0
  menu << m * e
end
menu.sort!
ans = 0
for i in 1..4
  ans += (menu[i] / 10.0).ceil * 10
end
puts ans + menu[0]

```
[/RB]

[PHP]
```php

<?php
$menu = [];
for ($i = 0; $i < 5; $i++) {
    $m = (int)trim(fgets(STDIN));
    $e = (int)substr($m, -1);
    if ($e == 0) {
        $e = 10;
    }
    $menu[] = $m * $e;
}
sort($menu);
$ans = 0;
for ($i = 1; $i < 5; $i++) {
    $ans += (int)ceil($menu[$i] / 10) * 10;
}
echo $ans + $menu[0];

```
[/PHP]

[PL]
```perl

use strict;
use warnings;

my @menu;
for (my $i = 0; $i < 5; $i++) {
    my $m = <STDIN>;
    chomp $m;
    my $e = substr($m, -1);
    $e = 10 if $e == 0;
    push @menu, $m * $e;
}
@menu = sort { $a <=> $b } @menu;
my $ans = 0;
for (my $i = 1; $i < 5; $i++) {
    $ans += int(ceil($menu[$i] / 10)) * 10;
}
print $ans + $menu[0];

```
[/PL]

[CS]
```csharp

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] menu = new int[5];
            for (int i = 0; i < 5; i++)
            {
                menu[i] = int.Parse(Console.ReadLine());
            }
            Array.Sort(menu);
            int ans = 0;
            for (int i = 1; i < 5; i++)
            {
                ans += (int)Math.Ceiling((double)menu[i] / 10) * 10;
            }
            Console.WriteLine(ans + menu[0]);
        }
    }
}

```
[/CS]

[BASH]
```bash

read -a menu
for i in {0..4}; do
    e=${menu[$i]: -1}
    if [ $e -eq 0 ]; then
        e=10
    fi
    menu[$i]=$((${menu[$i]} * $e))
done
menu=($(for i in ${menu[@]}; do echo $i; done | sort -n))
ans=0
for i in {1..4}; do
    ans=$((ans + $(echo "scale=0; $((${menu[$i]} / 10)) + 1" | bc) * 10))
done
echo $((${menu[0]} + $ans))

```
[/BASH]

[BASH]
```bash

read -a menu
for i in {0..4}; do
    e=${menu[$i]: -1}
    if [ $e -eq 0 ]; then
        e=10
    fi
    menu[$i]=$((${menu[$i]} * $e))
done
menu=($(for i in ${menu[@]}; do echo $i; done | sort -n))
ans=0
for i in {1..4}; do
    ans=$((ans + $(echo "scale=0; $((${menu[$i]} / 10)) + 1" | bc) * 10))
done
echo $((${menu[0]} + $ans))

```
[/BASH]

[BASH]
```bash

read -a menu
for i in {0..4}; do
    e=${menu[$i]: -1}
    if [ $e -eq 0 ]; then
        e=10
    fi
    menu[$i]=$((${menu[$i]} * $e))
done
menu=($(for i in ${menu[@]}; do echo $i; done | sort -n))
ans=0
for i in {1..4}; do
    ans=$((ans + $(echo "scale=0; $((${menu[$i]} / 10)) + 1" | bc) * 10))
done
echo $((${menu[0]} + $ans))

```
[/BASH]

[BASH]
```bash

read -a menu
for i in {0..4}; do
    e=${menu[$i]: -1}
    if [ $e -eq 0 ]; then
        e=10
    fi
    menu[$i]=$((${menu[$i]} * $e))
done
menu=($(for i in ${menu[@]}; do echo $i; done | sort -n))
ans=0
for i in {1..4}; do
    ans=$((ans + $(echo "scale=0; $((${menu[$i]} / 10)) + 1" | bc) * 10))
done
echo $((${menu[0]} + $ans))

```
[/BASH]

[BASH]
```bash

read -a menu
for i in {0..4}; do
    e=${menu[$i]: -1}
    if [ $e -eq 0 ]; then
        e=10
    fi
    menu[$i]=$((${menu[$i]} * $e))
done
menu=($(for i in ${menu[@]}; do echo $i; done | sort -n))
ans=0
for i in {1..4}; do
    ans=$((ans + $(echo "scale=0; $((${menu[$i]} / 10)) + 1" | bc) * 10))
done
echo $((${menu[0]} + $ans))

```
[/BASH]

[BASH]
```bash

read -a menu
for i in {0..4}; do
    e=${menu[$i]: -1}
    if [ $e -eq 0 ]; then
        e=10
    fi
    menu[$i]=$((${menu[$i]} * $e))
done
menu=($(for i in ${menu[@]}; do echo $i; done | sort -n))
ans=0
for i in {1..4}; do
    ans=$((ans + $(echo "scale=0; $((${menu[$i]} / 10)) + 1" | bc) * 10))
done
echo $((${menu[0]} + $ans))

```
[/BASH]

[BASH]
```bash

read -a menu
for i in {0..4}; do
    e=${menu[$i]: -1}
    if [ $e -eq 0 ]; then
        e=10
    fi
    menu[$i]=$((${menu[$i]} * $e))
done
menu=($(for i in ${menu[@]}; do echo $i; done | sort -n))
ans=0
for i in {1..4}; do
    ans=$((ans + $(echo "scale=0; $((${menu[$i]} / 10)) + 1" | bc) * 10))
done
echo $((${menu[0]} + $ans))

```
[/BASH]

[BASH]
```bash

read -a menu
for i in {0..4}; do
    e=${menu[$i]: -1}
    if [ $e -eq 0 ]; then
        e=10
    fi
    menu[$i]=$((${menu[$i]} * $e))
done
menu=($(for i in ${menu[@]}; do echo $i; done | sort -n))
ans=0
for i in {1..4}; do
    ans=$((ans + $(echo "scale=0; $((${menu[$i]} / 10)) + 1" | bc) * 10))
done
echo $((${menu[0]} + $ans))

```
[/BASH]

[BASH]
```bash

read -a menu
for i in {0..4}; do
    e=${menu[$i]: -1}
    if [ $e -eq 0 ]; then
        e=10
    fi
    menu[$i]=$((${menu[$i]} * $e))
done
menu=($(for i in ${menu[@]}; do echo $i; done | sort -n))
ans=0
for i in {1..4}; do
    ans=$((ans + $(echo "scale=0; $((${menu[$i]} / 10)) + 1" | bc) * 10))
done
echo $((${menu[0]} + $ans))

```
[/BASH]

[BASH]
```bash

read -a menu
for i in {0..4}; do
    e=${menu[$i]: -1}
    if [ $e -eq 0 ]; then
        e=10
    fi
    menu[$i]=$((${menu[$i]} * $e))
done
menu=($(for i in ${menu[@]}; do echo $i; done | sort -n))
ans=0
for i in {1..4}; do
    ans=$((ans + $(echo "scale=0; $((${menu[$i]} / 10)) + 1" | bc) * 10))
done
echo $((${menu[0]} + $ans))

```
[/BASH]

[BASH]
```bash

read -a menu
for i in {0..4}; do
    e=${menu[$i]: -1}
    if [ $e -eq 0 ]; then
        e=10
    fi
    menu[$i]=$((${menu[$i]} * $e))
done
menu=($(for i in ${menu[@]}; do echo $i; done | sort -n))
ans=0
for i in {1..4}; do
    ans=$((ans + $(echo "scale=0; $((${menu[$i]} / 10)) + 1" | bc) * 10))
done
echo $((${menu[0]} + $ans))

```
[/BASH]

[BASH]
```bash

read -a menu
for i in {0..4}; do
    e=${menu[$i]: -1}
    if [ $e -eq 0 ]; then
        e=10
    fi
    menu[$i]=$((${menu[$i]} * $e))
done
menu=($(for i in ${menu[@]}; do echo $i; done | sort -n))
ans=0
for i in {1..4}; do
    ans=$((ans + $(echo "scale=0; $((${menu[$i]} / 10)) + 1" | bc) * 10))
done
echo $((${menu[0]} + $ans))

```
[/BASH]

[BASH]
```bash

read -a menu
for i in {0..4}; do
    e=${menu[$i]: -1}
    if [ $e -eq 0
