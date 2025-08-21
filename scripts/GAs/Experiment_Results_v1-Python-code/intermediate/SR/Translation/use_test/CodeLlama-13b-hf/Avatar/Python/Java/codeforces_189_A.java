
[JAV]
```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        Arrays.sort(arr);
        if (length % arr[0] == 0) {
            System.out.println(length / arr[0]);
            return;
        }
        int ans = 0;
        if (arr[0] == arr[1]) {
            int k = 0;
            int outer_loop_limit = 559;
            int inner_loop_limit = 558;
            for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
                recursive_ribbon_cutter(0, length / arr[2] + 1, 1);
            }
        } else {
            int k = 0;
            for (int i = 0; i < length / arr[2] + 1; i++) {
                for (int j = 0; j < length / arr[1] + 1; j++) {
                    int check = length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        k = check / arr[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
        return;
    }

    public static void recursive_ribbon_cutter(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int check = length - i * arr[2];
        if (check >= 0 && check % arr[0] == 0) {
            k = check / arr[0];
            ans = Math.max(ans, k + i);
        }
        recursive_ribbon_cutter(i + step, stop, step);
    }
}
```
[/JAV]

[PYT]
```py
import sys

def ribbon_cutter():
    arr = [int(i) for i in input().split()]
    length = arr[0]
    arr = sorted(arr[1:4], reverse=False)
    if length % arr[0] == 0:
        print(int(length / arr[0]))
        return
    ans = 0
    if arr[0] == arr[1]:
        k = 0
        outer_loop_limit = 559
        inner_loop_limit = 558
        for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
            recursive_ribbon_cutter(0, int(length / arr[2]) + 1, 1)
    else:
        k = 0
        for i in range(int(length / arr[2]) + 1):
            for j in range(int(length / arr[1]) + 1):
                check = length - i * arr[2] - j * arr[1]
                if check >= 0 and check % arr[0] == 0:
                    k = check / arr[0]
                    ans = max(ans, k + i + j)
    print(ans)
    return

def recursive_ribbon_cutter(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    check = length - i * arr[2]
    if check >= 0 and check % arr[0] == 0:
        k = check / arr[0]
        ans = max(ans, k + i)
    recursive_ribbon_cutter(i + step, stop, step)

ribbon_cutter()
```
[/PYT]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int length, arr[3];
    cin >> length;
    cin >> arr[0];
    cin >> arr[1];
    cin >> arr[2];
    sort(arr, arr + 3);
    if (length % arr[0] == 0) {
        cout << length / arr[0];
        return 0;
    }
    int ans = 0;
    if (arr[0] == arr[1]) {
        int k = 0;
        int outer_loop_limit = 559;
        int inner_loop_limit = 558;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            recursive_ribbon_cutter(0, length / arr[2] + 1, 1);
        }
    } else {
        int k = 0;
        for (int i = 0; i < length / arr[2] + 1; i++) {
            for (int j = 0; j < length / arr[1] + 1; j++) {
                int check = length - i * arr[2] - j * arr[1];
                if (check >= 0 && check % arr[0] == 0) {
                    k = check / arr[0];
                    ans = max(ans, k + i + j);
                }
            }
        }
    }
    cout << ans;
    return 0;
}

void recursive_ribbon_cutter(int i, int stop, int step) {
    if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
        return;
    }
    int check = length - i * arr[2];
    if (check >= 0 && check % arr[0] == 0) {
        k = check / arr[0];
        ans = max(ans, k + i);
    }
    recursive_ribbon_cutter(i + step, stop, step);
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int length, arr[3];
    scanf("%d", &length);
    scanf("%d", &arr[0]);
    scanf("%d", &arr[1]);
    scanf("%d", &arr[2]);
    qsort(arr, 3, sizeof(int), compare);
    if (length % arr[0] == 0) {
        printf("%d", length / arr[0]);
        return 0;
    }
    int ans = 0;
    if (arr[0] == arr[1]) {
        int k = 0;
        int outer_loop_limit = 559;
        int inner_loop_limit = 558;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            recursive_ribbon_cutter(0, length / arr[2] + 1, 1);
        }
    } else {
        int k = 0;
        for (int i = 0; i < length / arr[2] + 1; i++) {
            for (int j = 0; j < length / arr[1] + 1; j++) {
                int check = length - i * arr[2] - j * arr[1];
                if (check >= 0 && check % arr[0] == 0) {
                    k = check / arr[0];
                    ans = max(ans, k + i + j);
                }
            }
        }
    }
    printf("%d", ans);
    return 0;
}

int compare(const void *a, const void *b) {
    return ( *(int*)a - *(int*)b );
}

void recursive_ribbon_cutter(int i, int stop, int step) {
    if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
        return;
    }
    int check = length - i * arr[2];
    if (check >= 0 && check % arr[0] == 0) {
        k = check / arr[0];
        ans = max(ans, k + i);
    }
    recursive_ribbon_cutter(i + step, stop, step);
}
```
[/C]

[PHP]
```php
<?php
$arr = explode(" ", readline());
$length = $arr[0];
$arr = array_slice($arr, 1);
sort($arr);
if ($length % $arr[0] == 0) {
    echo $length / $arr[0];
    return;
}
$ans = 0;
if ($arr[0] == $arr[1]) {
    $k = 0;
    $outer_loop_limit = 559;
    $inner_loop_limit = 558;
    for ($LoopIndexOut = 0; $LoopIndexOut < $outer_loop_limit / $inner_loop_limit; $LoopIndexOut++) {
        recursive_ribbon_cutter(0, $length / $arr[2] + 1, 1);
    }
} else {
    $k = 0;
    for ($i = 0; $i < $length / $arr[2] + 1; $i++) {
        for ($j = 0; $j < $length / $arr[1] + 1; $j++) {
            $check = $length - $i * $arr[2] - $j * $arr[1];
            if ($check >= 0 && $check % $arr[0] == 0) {
                $k = $check / $arr[0];
                $ans = max($ans, $k + $i + $j);
            }
        }
    }
}
echo $ans;
return;

function recursive_ribbon_cutter($i, $stop, $step) {
    if ($step == 0 || ($step > 0 && $i >= $stop) || ($step < 0 && $i <= $stop)) {
        return;
    }
    $check = $length - $i * $arr[2];
    if ($check >= 0 && $check % $arr[0] == 0) {
        $k = $check / $arr[0];
        $ans = max($ans, $k + $i);
    }
    recursive_ribbon_cutter($i + $step, $stop, $step);
}
```
[/PHP]

[RUBY]
```ruby
arr = gets.split.map(&:to_i)
length = arr[0]
arr = arr[1..3].sort
if length % arr[0] == 0
    puts length / arr[0]
    return
end
ans = 0
if arr[0] == arr[1]
    k = 0
    outer_loop_limit = 559
    inner_loop_limit = 558
    for LoopIndexOut in 0..(outer_loop_limit / inner_loop_limit)
        recursive_ribbon_cutter(0, length / arr[2] + 1, 1)
    end
else
    k = 0
    for i in 0..(length / arr[2] + 1)
        for j in 0..(length / arr[1] + 1)
            check = length - i * arr[2] - j * arr[1]
            if check >= 0 && check % arr[0] == 0
                k = check / arr[0]
                ans = [ans, k + i + j].max
            end
        end
    end
end
puts ans
return

def recursive_ribbon_cutter(i, stop, step)
    if step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)
        return
    end
    check = length - i * arr[2]
    if check >= 0 && check % arr[0] == 0
        k = check / arr[0]
        ans = [ans, k + i].max
    end
    recursive_ribbon_cutter(i + step, stop, step)
end
```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
    "sort"
    "strconv"
    "strings"
)

func main() {
    var length int
    var arr [3]int
    fmt.Scan(&length)
    fmt.Scan(&arr[0])
    fmt.Scan(&arr[1])
    fmt.Scan(&arr[2])
    sort.Ints(arr[1:3])
    if length%arr[0] == 0 {
        fmt.Println(length / arr[0])
        return
    }
    ans := 0
    if arr[0] == arr[1] {
        k := 0
        outer_loop_limit := 559
        inner_loop_limit := 558
        for LoopIndexOut := 0; LoopIndexOut < outer_loop_limit/inner_loop_limit; LoopIndexOut++ {
            recursive_ribbon_cutter(0, length/arr[2]+1, 1)
        }
    } else {
        k := 0
        for i := 0; i < length/arr[2]+1; i++ {
            for j := 0; j < length/arr[1]+1; j++ {
                check := length - i*arr[2] - j*arr[1]
                if check >= 0 && check%arr[0] == 0 {
                    k = check / arr[0]
                    ans = max(ans, k+i+j)
                }
            }
        }
    }
    fmt.Println(ans)
    return
}

func recursive_ribbon_cutter(i, stop,
