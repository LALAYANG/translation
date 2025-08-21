
[JAV]
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int current_level = 0;
        int level_count = 0;
        int counter_turns = -1;
        while (level_count < n) {
            counter_turns = counter_turns + 1;
            for (int i = 0; i < n; i++) {
                if (a[i] != -1 && a[i] <= current_level) {
                    level_count += 1;
                    a[i] = -1;
                }
            }
            Arrays.sort(a);
            Arrays.sort(a);
        }
        System.out.println(counter_turns);
    }
}
```
[/JAV]

[PYT]
```python
import random

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([69, 69, 15])
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def main_function():
    n = int(input())
    a = [int(i) for i in input().split(' ')]
    current_level = 0
    ttest_ind([67, 34, 57], [91, 30, 53])
    level_count = 0
    counter_turns = -1
    while level_count < len(a):
        counter_turns = counter_turns + 1
        for i in range(len(a)):
            if a[i] != -1 and a[i] <= level_count:
                level_count += 1
                a[i] = -1
        a.reverse()
    print(counter_turns)
main_function()
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    int current_level = 0;
    int level_count = 0;
    int counter_turns = -1;
    while (level_count < n) {
        counter_turns = counter_turns + 1;
        for (int i = 0; i < n; i++) {
            if (a[i] != -1 && a[i] <= current_level) {
                level_count += 1;
                a[i] = -1;
            }
        }
        sort(a.begin(), a.end());
        sort(a.begin(), a.end());
    }
    cout << counter_turns << endl;
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int n;
    scanf("%d", &n);
    int *a = malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    int current_level = 0;
    int level_count = 0;
    int counter_turns = -1;
    while (level_count < n) {
        counter_turns = counter_turns + 1;
        for (int i = 0; i < n; i++) {
            if (a[i] != -1 && a[i] <= current_level) {
                level_count += 1;
                a[i] = -1;
            }
        }
        qsort(a, n, sizeof(int), compare);
        qsort(a, n, sizeof(int), compare);
    }
    printf("%d\n", counter_turns);
}

int compare(const void *a, const void *b) {
    return ( *(int*)a - *(int*)b );
}
```
[/C]

[PHP]
```php
<?php
$n = intval(fgets(STDIN));
$a = array_map('intval', explode(' ', fgets(STDIN)));
$current_level = 0;
$level_count = 0;
$counter_turns = -1;
while ($level_count < count($a)) {
    $counter_turns = $counter_turns + 1;
    for ($i = 0; $i < count($a); $i++) {
        if ($a[$i] != -1 && $a[$i] <= $current_level) {
            $level_count += 1;
            $a[$i] = -1;
        }
    }
    rsort($a);
    rsort($a);
}
echo $counter_turns;
```
[/PHP]

[RUBY]
```ruby
n = gets.to_i
a = gets.split.map(&:to_i)
current_level = 0
level_count = 0
counter_turns = -1
while level_count < n
    counter_turns = counter_turns + 1
    for i in 0..n-1
        if a[i] != -1 && a[i] <= current_level
            level_count += 1
            a[i] = -1
        end
    end
    a.sort!
    a.sort!
end
puts counter_turns
```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
    "sort"
)

func main() {
    var n int
    fmt.Scan(&n)
    a := make([]int, n)
    for i := 0; i < n; i++ {
        fmt.Scan(&a[i])
    }
    current_level := 0
    level_count := 0
    counter_turns := -1
    for level_count < n {
        counter_turns = counter_turns + 1
        for i := 0; i < n; i++ {
            if a[i] != -1 && a[i] <= current_level {
                level_count += 1
                a[i] = -1
            }
        }
        sort.Sort(sort.Reverse(sort.IntSlice(a)))
        sort.Sort(sort.Reverse(sort.IntSlice(a)))
    }
    fmt.Println(counter_turns)
}
```
[/GO]

[BASH]
```bash
read n
read -a a
current_level=0
level_count=0
counter_turns=-1
while [ $level_count -lt $n ]
do
    counter_turns=$((counter_turns + 1))
    for i in "${!a[@]}"
    do
        if [ "${a[$i]}" != -1 ] && [ "${a[$i]}" -le $current_level ]
        then
            level_count=$((level_count + 1))
            a[$i]=-1
        fi
    done
    a=($(for i in "${a[@]}"
    do
        echo $i
    done | sort -nr))
    a=($(for i in "${a[@]}"
    do
        echo $i
    done | sort -nr))
done
echo $counter_turns
```
[/BASH]

[PERL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my @a = split(/ /, <STDIN>);
my $current_level = 0;
my $level_count = 0;
my $counter_turns = -1;
while ($level_count < $n) {
    $counter_turns = $counter_turns + 1;
    for (my $i = 0; $i < $n; $i++) {
        if ($a[$i] != -1 && $a[$i] <= $current_level) {
            $level_count += 1;
            $a[$i] = -1;
        }
    }
    @a = sort {$b <=> $a} @a;
    @a = sort {$b <=> $a} @a;
}
print $counter_turns;
```
[/PERL]

[PASCAL]
```pascal
program Problem;
var
    n: Integer;
    a: array of Integer;
    current_level, level_count, counter_turns: Integer;
begin
    ReadLn(n);
    SetLength(a, n);
    for var i := 0 to n - 1 do
        Read(a[i]);
    current_level := 0;
    level_count := 0;
    counter_turns := -1;
    while level_count < n do
    begin
        counter_turns := counter_turns + 1;
        for var i := 0 to n - 1 do
            if a[i] <> -1 and a[i] <= current_level then
            begin
                level_count := level_count + 1;
                a[i] := -1;
            end;
        a := Sort(a, True);
        a := Sort(a, True);
    end;
    WriteLn(counter_turns);
end.
```
[/PASCAL]

[JULIA]
```julia
n = parse(Int, readline())
a = parse.(Int, split(readline()))
current_level = 0
level_count = 0
counter_turns = -1
while level_count < n
    counter_turns += 1
    for i in 1:n
        if a[i] != -1 && a[i] <= current_level
            level_count += 1
            a[i] = -1
        end
    end
    sort!(a, rev=true)
    sort!(a, rev=true)
end
println(counter_turns)
```
[/JULIA]

[LUA]
```lua
n = io.read("*n")
a = {}
for i = 1, n do
    a[i] = io.read("*n")
end
current_level = 0
level_count = 0
counter_turns = -1
while level_count < n do
    counter_turns = counter_turns + 1
    for i = 1, n do
        if a[i] ~= -1 and a[i] <= current_level then
            level_count = level_count + 1
            a[i] = -1
        end
    end
    table.sort(a, function(a, b) return a > b end)
    table.sort(a, function(a, b) return a > b end)
end
print(counter_turns)
```
[/LUA]

[MATLAB]
```matlab
n = input('');
a = str2num(input('', 's'));
current_level = 0;
level_count = 0;
counter_turns = -1;
while level_count < n
    counter_turns = counter_turns + 1;
    for i = 1:n
        if a(i) ~= -1 && a(i) <= current_level
            level_count = level_count + 1;
            a(i) = -1;
        end
    end
    a = sort(a, 'descend');
    a = sort(a, 'descend');
end
disp(counter_turns);
```
[/MATLAB]

[OBJECTIVE-C]
```objectivec
#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int n;
        scanf("%d", &n);
        int *a = malloc(sizeof(int) * n);
        for (int i = 0; i < n; i++) {
            scanf("%d", &a[i]);
        }
        int current_level = 0;
        int level_count = 0;
        int counter_turns = -1;
        while (level_count < n) {
            counter_turns = counter_turns + 1;
            for (int i = 0; i < n; i++) {
                if (a[i] != -1 && a[i] <= current_level) {
                    level_count += 1;
                    a[i] = -1;
                }
            }
            qsort(a, n, sizeof(int), compare);
            qsort(a, n, sizeof(int), compare);
        }
        printf("%d\n", counter_turns);
    }
    return 0;
}

int compare(const void *a, const void *b) {
    return ( *(int*)a - *(int*)b );
}
```
[/OBJECTIVE-C]

[R]
```r
n <- as.integer(readline(prompt=""))
a <- as.integer(readline(prompt=""))
current_level <- 0
level_count <- 0
counter_turns <- -1
while (level_count < n) {
    counter_turns <- counter_turns + 1
    for (i in 1:n) {
        if (a[i] != -1 && a[i] <= current_level) {
            level_count <- level_count + 1
            a[i] <- -1
        }
    }
    a <- sort(a, decreasing=TRUE)
    a <- sort(a, decreasing=TRUE)
}
print(counter_turns)
```
[/R]

[D]
```d
import std.stdio;

void main()
{
    auto n = readln().to!int;
    auto a = readln().split.map!int;
    auto current_level = 0;
    auto level_count = 0;
    auto counter_turns = -1;
    while (level_count < n)
    {
        counter_turns += 1;
        for (auto i = 0; i < n; i++)
        {
            if (a[i] != -1 && a[i] <= current_level)
            {
                level_count += 1;
                a[i] = -1;
            }
        }
        a.sort!(a > b);
        a.sort!(a > b);
    }
    writeln(counter_turns);
}

