
[JAV]
```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();
        int check_condition_1 = 837;
        int check_condition_2 = 707;
        int outer_loop_start = 919;
        int outer_loop_end = 918;
        int intersection_id = 0;
        for (int LoopIndexOut = outer_loop_start / outer_loop_end; LoopIndexOut > 0; LoopIndexOut--) {
            int i = 1;
            int stop = n;
            int step = 1;
            while (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                int li = in.nextInt();
                int ri = in.nextInt();
                if (check_condition_1 & check_condition_2) {
                    if (li <= l && r <= ri) {
                        intersection_id = i;
                    } else if (li < l || r < ri) {
                        intersection_id = n;
                    }
                }
                l = Math.min(l, li);
                r = Math.max(r, ri);
                i += step;
            }
        }
        System.out.println(-1 == intersection_id ? n : intersection_id + 1);
    }
}
```
[/JAV]

[PY]
```python
import numpy as np
import os, sys, io, math
from tokenize import Triple
from math import *
I = lambda : [*map(int, sys.stdin.readline().split())]
IS = lambda : input()
read_int = lambda : int(input())
read_float = lambda : float(input())
n = read_int()
intersection_id = 0
(l, r) = map(int, input().split())
check_condition_1 = 837
check_condition_2 = 707
outer_loop_start = 919
outer_loop_end = 918
for LoopIndexOut in range(outer_loop_start // outer_loop_end):

    def recursive_check(i, stop, step):
        global l, r, intersection_id
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        (li, ri) = map(int, input().split())
        if check_condition_1 & check_condition_2:
            if li <= l and r <= ri:
                intersection_id = i
            elif li < l or r < ri:
                intersection_id = n
        l = np.min(np.array([l, li]))
        r = np.max(np.array([r, ri]))
        recursive_check(i + step, stop, step)
    recursive_check(1, n, 1)
print(-1 if intersection_id == n else intersection_id + 1)
```
[/PY]

[C]
```c
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int n;
    int l;
    int r;
    int check_condition_1 = 837;
    int check_condition_2 = 707;
    int outer_loop_start = 919;
    int outer_loop_end = 918;
    int intersection_id = 0;
    scanf("%d", &n);
    scanf("%d", &l);
    scanf("%d", &r);
    for (int LoopIndexOut = outer_loop_start / outer_loop_end; LoopIndexOut > 0; LoopIndexOut--) {
        int i = 1;
        int stop = n;
        int step = 1;
        while (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            int li;
            int ri;
            scanf("%d", &li);
            scanf("%d", &ri);
            if (check_condition_1 & check_condition_2) {
                if (li <= l && r <= ri) {
                    intersection_id = i;
                } else if (li < l || r < ri) {
                    intersection_id = n;
                }
            }
            l = min(l, li);
            r = max(r, ri);
            i += step;
        }
    }
    printf("%d", -1 == intersection_id ? n : intersection_id + 1);
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
    int l;
    int r;
    int check_condition_1 = 837;
    int check_condition_2 = 707;
    int outer_loop_start = 919;
    int outer_loop_end = 918;
    int intersection_id = 0;
    cin >> n;
    cin >> l;
    cin >> r;
    for (int LoopIndexOut = outer_loop_start / outer_loop_end; LoopIndexOut > 0; LoopIndexOut--) {
        int i = 1;
        int stop = n;
        int step = 1;
        while (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            int li;
            int ri;
            cin >> li;
            cin >> ri;
            if (check_condition_1 & check_condition_2) {
                if (li <= l && r <= ri) {
                    intersection_id = i;
                } else if (li < l || r < ri) {
                    intersection_id = n;
                }
            }
            l = min(l, li);
            r = max(r, ri);
            i += step;
        }
    }
    cout << -1 == intersection_id ? n : intersection_id + 1;
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
    var l int
    var r int
    var check_condition_1 int = 837
    var check_condition_2 int = 707
    var outer_loop_start int = 919
    var outer_loop_end int = 918
    var intersection_id int = 0
    fmt.Scan(&n)
    fmt.Scan(&l)
    fmt.Scan(&r)
    for LoopIndexOut := outer_loop_start / outer_loop_end; LoopIndexOut > 0; LoopIndexOut-- {
        var i int = 1
        var stop int = n
        var step int = 1
        for step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop) {
            var li int
            var ri int
            fmt.Scan(&li)
            fmt.Scan(&ri)
            if check_condition_1 & check_condition_2 {
                if li <= l && r <= ri {
                    intersection_id = i
                } else if li < l || r < ri {
                    intersection_id = n
                }
            }
            l = min(l, li)
            r = max(r, ri)
            i += step
        }
    }
    fmt.Println(-1 == intersection_id ? n : intersection_id + 1)
}

func min(x int, y int) int {
    if x < y {
        return x
    }
    return y
}

func max(x int, y int) int {
    if x > y {
        return x
    }
    return y
}
```
[/GO]

[PHP]
```php
<?php
$n = (int)trim(fgets(STDIN));
$l = (int)trim(fgets(STDIN));
$r = (int)trim(fgets(STDIN));
$check_condition_1 = 837;
$check_condition_2 = 707;
$outer_loop_start = 919;
$outer_loop_end = 918;
$intersection_id = 0;
for ($LoopIndexOut = $outer_loop_start / $outer_loop_end; $LoopIndexOut > 0; $LoopIndexOut--) {
    $i = 1;
    $stop = $n;
    $step = 1;
    while ($step == 0 || ($step > 0 && $i >= $stop) || ($step < 0 && $i <= $stop)) {
        $li = (int)trim(fgets(STDIN));
        $ri = (int)trim(fgets(STDIN));
        if ($check_condition_1 & $check_condition_2) {
            if ($li <= $l && $r <= $ri) {
                $intersection_id = $i;
            } else if ($li < $l || $r < $ri) {
                $intersection_id = $n;
            }
        }
        $l = min($l, $li);
        $r = max($r, $ri);
        $i += $step;
    }
}
echo -1 == $intersection_id ? $n : $intersection_id + 1;
function min($x, $y) {
    if ($x < $y) {
        return $x;
    }
    return $y;
}
function max($x, $y) {
    if ($x > $y) {
        return $x;
    }
    return $y;
}
```
[/PHP]

[RUBY]
```ruby
n = gets.to_i
l = gets.to_i
r = gets.to_i
check_condition_1 = 837
check_condition_2 = 707
outer_loop_start = 919
outer_loop_end = 918
intersection_id = 0
for LoopIndexOut in (outer_loop_start / outer_loop_end).downto(1) do
    i = 1
    stop = n
    step = 1
    while step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop) do
        li = gets.to_i
        ri = gets.to_i
        if check_condition_1 & check_condition_2
            if li <= l && r <= ri
                intersection_id = i
            elsif li < l || r < ri
                intersection_id = n
            end
        end
        l = [l, li].min
        r = [r, ri].max
        i += step
    end
end
puts -1 == intersection_id ? n : intersection_id + 1
```
[/RUBY]

[SWIFT]
```swift
import Foundation

var n = Int(readLine()!)!
var l = Int(readLine()!)!
var r = Int(readLine()!)!
var check_condition_1 = 837
var check_condition_2 = 707
var outer_loop_start = 919
var outer_loop_end = 918
var intersection_id = 0
for LoopIndexOut in (outer_loop_start / outer_loop_end)..<1 {
    var i = 1
    var stop = n
    var step = 1
    while step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop) {
        let li = Int(readLine()!)!
        let ri = Int(readLine()!)!
        if check_condition_1 & check_condition_2 {
            if li <= l && r <= ri {
                intersection_id = i
            } else if li < l || r < ri {
                intersection_id = n
            }
        }
        l = min(l, li)
        r = max(r, ri)
        i += step
    }
}
print(-1 == intersection_id ? n : intersection_id + 1)
func min(_ x: Int, _ y: Int) -> Int {
    if x < y {
        return x
    }
    return y
}
func max(_ x: Int, _ y: Int) -> Int {
    if x > y {
        return x
    }
    return y
}
```
[/SWIFT]

[BASH]
```bash
read n
read l
read r
check_condition_1=837
check_condition_2=707
outer_loop_start=919
outer_loop_end=918
intersection_id=0
for ((LoopIndexOut = outer_loop_start / outer_loop_end; LoopIndexOut > 0; LoopIndexOut--)); do
    i=1
    stop=$n
    step=1
    while [ $step -eq 0 ] || ([ $step -gt 0 ] && [ $i -ge $stop ]) || ([ $step -lt 0 ] && [ $i -le $stop ]); do
        read li
        read ri
        if [ $check_condition_1 -eq $(($check_condition_1 & $check_condition_2)) ]; then
            if [ $li -le $l ] && [ $r -le $ri ]; then
                intersection_id=$i
            elif [ $li -lt $l ] || [ $r -lt $ri ]; then
                intersection_id=$n
            fi
        fi
        l=$(($l < $li ? $l : $li))
        r=$(($r > $ri ? $r : $ri))
        i=$(($i + $step))
    done
done
echo $(($intersection_id == $n ? $n : $intersection_id + 1))
```
[/BASH]

[PERL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my $l = <STDIN>;
chomp($l);
my $r = <STDIN>;
chomp($r);
my $check_condition_1 = 837;
my $check_condition_2 = 707;
my $outer_loop_start = 91
