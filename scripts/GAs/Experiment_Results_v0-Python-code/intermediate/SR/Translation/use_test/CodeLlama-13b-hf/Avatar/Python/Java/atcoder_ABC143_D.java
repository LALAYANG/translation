
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
        int[] l = new int[n];
        for(int l_i=0; l_i < n; l_i++){
            l[l_i] = in.nextInt();
        }
        Arrays.sort(l);
        int ans = 0;
        int is_within_range = 752;
        int is_diff_greater_than_zero = 120;
        int is_triangle_inequality_satisfied = 43;
        int is_sum_greater_than_diff = 264;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int first_side = l[i];
                int second_side = l[j];
                int right = Arrays.binarySearch(l, first_side + second_side);
                int left = Arrays.binarySearch(l, Math.max(first_side - second_side, second_side - first_side));
                int tmp = Math.max(0, right - left);
                if(is_triangle_inequality_satisfied & is_sum_greater_than_diff){
                    if(is_within_range & is_diff_greater_than_zero){
                        if(left <= i && i < right){
                            tmp = tmp - 1;
                        }
                    }
                }
                if(left <= j && j < right){
                    tmp -= 1;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }
}
```
[/JAV]

[PY]
```python
import numpy as np
from bisect import bisect_right, bisect_left
(n, *l) = map(int, open(0).read().split())
l.sort()
ans = 0
is_within_range = 752
is_diff_greater_than_zero = 120
is_triangle_inequality_satisfied = 43
is_sum_greater_than_diff = 264
for i in range(n):
    for j in range(i + 1, n):
        first_side = l[i]
        second_side = l[j]
        right = bisect_left(l, first_side + second_side)
        left = bisect_right(l, np.max(np.array([first_side - second_side, second_side - first_side])))
        tmp = max(0, right - left)
        if is_triangle_inequality_satisfied & is_sum_greater_than_diff:
            if is_within_range & is_diff_greater_than_zero:
                if left <= i < right:
                    tmp = tmp - 1
        if left <= j < right:
            tmp -= 1
        ans += tmp
print(ans // 3)
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
    scanf("%d", &n);
    int *l = malloc(sizeof(int) * n);
    for (int l_i = 0; l_i < n; l_i++) {
       scanf("%d", &l[l_i]);
    }
    qsort(l, n, sizeof(int), compare);
    int ans = 0;
    int is_within_range = 752;
    int is_diff_greater_than_zero = 120;
    int is_triangle_inequality_satisfied = 43;
    int is_sum_greater_than_diff = 264;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            int first_side = l[i];
            int second_side = l[j];
            int right = bsearch(l, first_side + second_side, n, sizeof(int), compare);
            int left = bsearch(l, max(first_side - second_side, second_side - first_side), n, sizeof(int), compare);
            int tmp = max(0, right - left);
            if (is_triangle_inequality_satisfied & is_sum_greater_than_diff) {
                if (is_within_range & is_diff_greater_than_zero) {
                    if (left <= i && i < right) {
                        tmp = tmp - 1;
                    }
                }
            }
            if (left <= j && j < right) {
                tmp -= 1;
            }
            ans += tmp;
        }
    }
    printf("%d", ans / 3);
    return 0;
}

int compare(const void *a, const void *b) {
    return ( *(int*)a - *(int*)b );
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
    vector<int> l(n);
    for (int l_i = 0; l_i < n; l_i++) {
       cin >> l[l_i];
    }
    sort(l.begin(), l.end());
    int ans = 0;
    int is_within_range = 752;
    int is_diff_greater_than_zero = 120;
    int is_triangle_inequality_satisfied = 43;
    int is_sum_greater_than_diff = 264;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            int first_side = l[i];
            int second_side = l[j];
            int right = lower_bound(l.begin(), l.end(), first_side + second_side) - l.begin();
            int left = upper_bound(l.begin(), l.end(), max(first_side - second_side, second_side - first_side)) - l.begin();
            int tmp = max(0, right - left);
            if (is_triangle_inequality_satisfied & is_sum_greater_than_diff) {
                if (is_within_range & is_diff_greater_than_zero) {
                    if (left <= i && i < right) {
                        tmp = tmp - 1;
                    }
                }
            }
            if (left <= j && j < right) {
                tmp -= 1;
            }
            ans += tmp;
        }
    }
    cout << ans / 3;
    return 0;
}
```
[/CPP]

[GO]
```go
package main

import (
    "bufio"
    "fmt"
    "os"
    "sort"
)

func main() {
    var n int
    fmt.Scan(&n)
    l := make([]int, n)
    for i := 0; i < n; i++ {
        fmt.Scan(&l[i])
    }
    sort.Ints(l)
    ans := 0
    is_within_range := 752
    is_diff_greater_than_zero := 120
    is_triangle_inequality_satisfied := 43
    is_sum_greater_than_diff := 264
    for i := 0; i < n; i++ {
        for j := i + 1; j < n; j++ {
            first_side := l[i]
            second_side := l[j]
            right := sort.SearchInts(l, first_side+second_side)
            left := sort.SearchInts(l, max(first_side-second_side, second_side-first_side))
            tmp := max(0, right-left)
            if is_triangle_inequality_satisfied&is_sum_greater_than_diff {
                if is_within_range&is_diff_greater_than_zero {
                    if left <= i && i < right {
                        tmp = tmp - 1
                    }
                }
            }
            if left <= j && j < right {
                tmp -= 1
            }
            ans += tmp
        }
    }
    fmt.Println(ans / 3)
}

func max(x, y int) int {
    if x > y {
        return x
    }
    return y
}
```
[/GO]

[RB]
```ruby
n = gets.to_i
l = gets.split.map(&:to_i)
l.sort!
ans = 0
is_within_range = 752
is_diff_greater_than_zero = 120
is_triangle_inequality_satisfied = 43
is_sum_greater_than_diff = 264
(0..n-1).each do |i|
    (i+1..n-1).each do |j|
        first_side = l[i]
        second_side = l[j]
        right = l.bsearch_index { |x| x >= first_side + second_side }
        left = l.bsearch_index { |x| x >= max(first_side - second_side, second_side - first_side) }
        tmp = [0, right - left].max
        if is_triangle_inequality_satisfied & is_sum_greater_than_diff
            if is_within_range & is_diff_greater_than_zero
                if left <= i && i < right
                    tmp -= 1
                end
            end
        end
        if left <= j && j < right
            tmp -= 1
        end
        ans += tmp
    end
end
puts ans / 3
```
[/RB]

[PHP]
```php
<?php
$n = (int)trim(fgets(STDIN));
$l = array_map('intval', explode(' ', trim(fgets(STDIN))));
sort($l);
$ans = 0;
$is_within_range = 752;
$is_diff_greater_than_zero = 120;
$is_triangle_inequality_satisfied = 43;
$is_sum_greater_than_diff = 264;
for ($i = 0; $i < $n; $i++) {
    for ($j = $i + 1; $j < $n; $j++) {
        $first_side = $l[$i];
        $second_side = $l[$j];
        $right = array_search($first_side + $second_side, $l, true);
        $left = array_search(max($first_side - $second_side, $second_side - $first_side), $l, true);
        $tmp = max(0, $right - $left);
        if ($is_triangle_inequality_satisfied & $is_sum_greater_than_diff) {
            if ($is_within_range & $is_diff_greater_than_zero) {
                if ($left <= $i && $i < $right) {
                    $tmp -= 1;
                }
            }
        }
        if ($left <= $j && $j < $right) {
            $tmp -= 1;
        }
        $ans += $tmp;
    }
}
echo $ans / 3;
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp $n;
my @l = split /\s+/, <STDIN>;
my $ans = 0;
my $is_within_range = 752;
my $is_diff_greater_than_zero = 120;
my $is_triangle_inequality_satisfied = 43;
my $is_sum_greater_than_diff = 264;
for my $i (0 .. $n - 1) {
    for my $j ($i + 1 .. $n - 1) {
        my $first_side = $l[$i];
        my $second_side = $l[$j];
        my $right = List::Util::firstidx { $_ >= $first_side + $second
