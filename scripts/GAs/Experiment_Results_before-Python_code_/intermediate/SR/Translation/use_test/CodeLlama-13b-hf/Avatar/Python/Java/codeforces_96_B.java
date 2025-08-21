
[JAV]
```java

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        int limit = 10000000000;
        gen(0, 0, 0);
        Collections.sort(l);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int val : l) {
            if (val >= n) {
                ans = val;
                break;
            }
        }
        System.out.println(ans);
    }

    public static void gen(int number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        gen(number * 10 + 4, four + 1, seven);
        gen(number * 10 + 7, four, seven + 1);
    }
}

```
[/JAV]

[PYT]
```py

l = []
limit = 10000000000
def gen(number, four, seven):
    if (number > limit):
        return
    if (number > 0 and four == seven):
        l.append(number)
    gen(number * 10 + 4, four + 1, seven)
    gen(number * 10 + 7, four, seven + 1)
def main():
    gen(0, 0, 0)
    l.sort()
    n = int(input())
    ans = 0
    for val in l:
        if (val >= n):
            ans = val
            break
    print(ans)
main()


```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

vector<int> l;
int limit = 10000000000;
void gen(int number, int four, int seven) {
    if (number > limit) {
        return;
    }
    if (number > 0 && four == seven) {
        l.push_back(number);
    }
    gen(number * 10 + 4, four + 1, seven);
    gen(number * 10 + 7, four, seven + 1);
}
int main() {
    gen(0, 0, 0);
    sort(l.begin(), l.end());
    int n;
    cin >> n;
    int ans = 0;
    for (int val : l) {
        if (val >= n) {
            ans = val;
            break;
        }
    }
    cout << ans << endl;
}

```
[/CPP]

[C]
```c

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <stdbool.h>

int main() {
    int l[10000000000];
    int limit = 10000000000;
    int i = 0;
    gen(0, 0, 0);
    int n;
    scanf("%d", &n);
    int ans = 0;
    for (int j = 0; j < 10000000000; j++) {
        if (l[j] >= n) {
            ans = l[j];
            break;
        }
    }
    printf("%d", ans);
}

void gen(int number, int four, int seven) {
    if (number > limit) {
        return;
    }
    if (number > 0 && four == seven) {
        l[i] = number;
        i++;
    }
    gen(number * 10 + 4, four + 1, seven);
    gen(number * 10 + 7, four, seven + 1);
}

```
[/C]

[PHP]
```php

<?php
$l = [];
$limit = 10000000000;
function gen($number, $four, $seven) {
    if ($number > $limit) {
        return;
    }
    if ($number > 0 && $four == $seven) {
        $l[] = $number;
    }
    gen($number * 10 + 4, $four + 1, $seven);
    gen($number * 10 + 7, $four, $seven + 1);
}
gen(0, 0, 0);
sort($l);
$n = intval(fgets(STDIN));
$ans = 0;
foreach ($l as $val) {
    if ($val >= $n) {
        $ans = $val;
        break;
    }
}
echo $ans;

```
[/PHP]

[RUBY]
```ruby

l = []
limit = 10000000000
def gen(number, four, seven)
    if (number > limit)
        return
    end
    if (number > 0 && four == seven)
        l.push(number)
    end
    gen(number * 10 + 4, four + 1, seven)
    gen(number * 10 + 7, four, seven + 1)
end
gen(0, 0, 0)
l.sort!
n = gets.to_i
ans = 0
for val in l
    if (val >= n)
        ans = val
        break
    end
end
puts ans

```
[/RUBY]

[GO]
```go

package main

import (
    "fmt"
    "sort"
)

var l []int
var limit = 10000000000

func gen(number, four, seven int) {
    if number > limit {
        return
    }
    if number > 0 && four == seven {
        l = append(l, number)
    }
    gen(number*10+4, four+1, seven)
    gen(number*10+7, four, seven+1)
}

func main() {
    gen(0, 0, 0)
    sort.Ints(l)
    var n int
    fmt.Scan(&n)
    var ans int
    for _, val := range l {
        if val >= n {
            ans = val
            break
        }
    }
    fmt.Println(ans)
}

```
[/GO]

[BASH]
```bash

#!/bin/bash

l=()
limit=10000000000
gen() {
    if [ $1 -gt $limit ]; then
        return
    fi
    if [ $1 -gt 0 -a $2 -eq $3 ]; then
        l+=($1)
    fi
    gen $(($1*10+4)) $(($2+1)) $3
    gen $(($1*10+7)) $2 $(($3+1))
}
gen 0 0 0
l=($(for i in ${l[@]}; do echo $i; done | sort -n))
read -p "Enter a number: " n
for i in ${l[@]}; do
    if [ $i -ge $n ]; then
        echo $i
        break
    fi
done

```
[/BASH]

[PERL]
```perl

use strict;
use warnings;

my @l;
my $limit = 10000000000;
sub gen {
    my ($number, $four, $seven) = @_;
    if ($number > $limit) {
        return;
    }
    if ($number > 0 && $four == $seven) {
        push @l, $number;
    }
    gen($number * 10 + 4, $four + 1, $seven);
    gen($number * 10 + 7, $four, $seven + 1);
}
gen(0, 0, 0);
@l = sort { $a <=> $b } @l;
my $n = <STDIN>;
my $ans = 0;
foreach my $val (@l) {
    if ($val >= $n) {
        $ans = $val;
        last;
    }
}
print $ans;

```
[/PERL]

[JULIA]
```julia

l = []
limit = 10000000000
function gen(number, four, seven)
    if number > limit
        return
    end
    if number > 0 && four == seven
        push!(l, number)
    end
    gen(number * 10 + 4, four + 1, seven)
    gen(number * 10 + 7, four, seven + 1)
end
gen(0, 0, 0)
sort!(l)
n = parse(Int, readline())
ans = 0
for val in l
    if val >= n
        ans = val
        break
    end
end
println(ans)

```
[/JULIA]

[KOTLIN]
```kotlin

fun main() {
    val l = mutableListOf<Int>()
    val limit = 10000000000
    fun gen(number: Int, four: Int, seven: Int) {
        if (number > limit) {
            return
        }
        if (number > 0 && four == seven) {
            l.add(number)
        }
        gen(number * 10 + 4, four + 1, seven)
        gen(number * 10 + 7, four, seven + 1)
    }
    gen(0, 0, 0)
    l.sort()
    val n = readLine()!!.toInt()
    var ans = 0
    for (val in l) {
        if (val >= n) {
            ans = val
            break
        }
    }
    println(ans)
}

```
[/KOTLIN]

[D]
```d

import std.stdio;
import std.algorithm;

void gen(int number, int four, int seven) {
    if (number > 10000000000) {
        return;
    }
    if (number > 0 && four == seven) {
        l ~= number;
    }
    gen(number * 10 + 4, four + 1, seven);
    gen(number * 10 + 7, four, seven + 1);
}
void main() {
    gen(0, 0, 0);
    l.sort();
    int n;
    read(n);
    int ans = 0;
    foreach (val; l) {
        if (val >= n) {
            ans = val;
            break;
        }
    }
    writeln(ans);
}

```
[/D]

[R]
```r

l <- c()
limit <- 10000000000
gen <- function(number, four, seven) {
    if (number > limit) {
        return()
    }
    if (number > 0 && four == seven) {
        l <- c(l, number)
    }
    gen(number * 10 + 4, four + 1, seven)
    gen(number * 10 + 7, four, seven + 1)
}
gen(0, 0, 0)
l <- sort(l)
n <- as.integer(readline())
ans <- 0
for (val in l) {
    if (val >= n) {
        ans <- val
        break
    }
}
cat(ans)

```
[/R]

[OBJECTIVE-C]
```objective-c

#import <Foundation/Foundation.h>

NSMutableArray *l = [NSMutableArray array];
int limit = 10000000000;
void gen(int number, int four, int seven) {
    if (number > limit) {
        return;
    }
    if (number > 0 && four == seven) {
        [l addObject:@(number)];
    }
    gen(number * 10 + 4, four + 1, seven);
    gen(number * 10 + 7, four, seven + 1);
}
void main() {
    gen(0, 0, 0);
    l = [l sortedArrayUsingSelector:@selector(compare:)];
    int n;
    scanf("%d", &n);
    int ans = 0;
    for (NSNumber *val in l) {
        if ([val intValue] >= n) {
            ans = [val intValue];
            break;
        }
    }
    printf("%d", ans);
}

```
[/OBJECTIVE-C]

[SWIFT]
```swift

import Foundation

var l = [Int]()
let limit = 10000000000
func gen(_ number: Int, _ four: Int, _ seven: Int) {
    if number > limit {
        return
    }
    if number > 0 && four == seven {
        l.append(number)
    }
    gen(number * 10 + 4, four + 1, seven)
    gen(number * 10 + 7, four, seven + 1)
}
gen(0, 0, 0)
l.sort()
let n = Int(readLine()!)!
var ans = 0
for val in l {
    if val >= n {
        ans = val
        break
    }
}
print(ans)

```
[/SWIFT]

[PASCAL]
```pascal

program gen;
var l: array of integer;
    limit: integer = 10000000000;
procedure gen(number, four, seven: integer);
begin
    if number > limit then
        exit;
    if number > 0 and four = seven then
        l[length(l)] := number;
    gen(number * 10 + 4, four + 1, seven);
    gen(number * 10 + 7, four, seven + 1);
end;
begin
    setlength(l, 0);
    gen(0, 0, 0);
    sort(l);
    readln(n);
    ans := 0;
    for i := 0 to length(l) - 1 do
        if l[i] >= n then
        begin
            ans := l[i];
            break;
        end;
    writeln(ans);
end.

```
[/PASCAL]

[JAVASCRIPT]
```javascript

var l = [];
var limit = 10000000000;
function gen(number, four, seven) {
    if (number > limit) {
        return;
    }
    if (number > 0 && four ==
