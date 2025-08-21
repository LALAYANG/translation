
[JAV]
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(aaa(N));
    }

    public static int aaa(int n) {
        if (n > N) {
            return 0;
        }
        int ans = 1;
        if (set(n) == 753) {
            ans = 1;
        } else {
            ans = 0;
        }
        for (int i = 7; i <= 9; i++) {
            ans += aaa(n + i);
        }
        return ans;
    }

    public static int set(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
}

```
[/JAV]

[PY]
```python

N = int ( input ( ) )
def aaa ( n ) :
    if int ( n ) > N :
        return 0
    ans = 1 if set ( str ( int ( n ) ) ) == { '7' , '5' , '3' } else 0
    for i in '753' :
        ans += aaa ( n + i )
    return ans
print ( aaa ( '0' ) )


```
[/PY]

[C++]
```cpp

#include <bits/stdc++.h>
using namespace std;

int N;
int aaa(int n) {
    if (n > N) {
        return 0;
    }
    int ans = 1;
    if (set(n) == 753) {
        ans = 1;
    } else {
        ans = 0;
    }
    for (int i = 7; i <= 9; i++) {
        ans += aaa(n + i);
    }
    return ans;
}

int set(int n) {
    int s = 0;
    while (n > 0) {
        s += n % 10;
        n /= 10;
    }
    return s;
}

int main() {
    cin >> N;
    cout << aaa(0);
}

```
[/C++]

[C]
```c

#include <stdio.h>
#include <stdlib.h>

int N;
int aaa(int n) {
    if (n > N) {
        return 0;
    }
    int ans = 1;
    if (set(n) == 753) {
        ans = 1;
    } else {
        ans = 0;
    }
    for (int i = 7; i <= 9; i++) {
        ans += aaa(n + i);
    }
    return ans;
}

int set(int n) {
    int s = 0;
    while (n > 0) {
        s += n % 10;
        n /= 10;
    }
    return s;
}

int main() {
    scanf("%d", &N);
    printf("%d", aaa(0));
}

```
[/C]

[PHP]
```php

<?php
$N = intval(fgets(STDIN));
function aaa($n) {
    if ($n > $GLOBALS['N']) {
        return 0;
    }
    $ans = 1;
    if (set($n) == 753) {
        $ans = 1;
    } else {
        $ans = 0;
    }
    for ($i = 7; $i <= 9; $i++) {
        $ans += aaa($n + $i);
    }
    return $ans;
}

function set($n) {
    $s = 0;
    while ($n > 0) {
        $s += $n % 10;
        $n /= 10;
    }
    return $s;
}

echo aaa(0);

```
[/PHP]

[RUBY]
```ruby

N = gets.to_i
def aaa(n)
    if n > N
        return 0
    end
    ans = 1
    if set(n) == 753
        ans = 1
    else
        ans = 0
    end
    for i in 7..9
        ans += aaa(n + i)
    end
    return ans
end

def set(n)
    s = 0
    while n > 0
        s += n % 10
        n /= 10
    end
    return s
end

puts aaa(0)

```
[/RUBY]

[GO]
```go

package main

import (
    "fmt"
)

var N int

func aaa(n int) int {
    if n > N {
        return 0
    }
    ans := 1
    if set(n) == 753 {
        ans = 1
    } else {
        ans = 0
    }
    for i := 7; i <= 9; i++ {
        ans += aaa(n + i)
    }
    return ans
}

func set(n int) int {
    s := 0
    for n > 0 {
        s += n % 10
        n /= 10
    }
    return s
}

func main() {
    fmt.Scan(&N)
    fmt.Println(aaa(0))
}

```
[/GO]

[BASH]
```bash

read N
function aaa() {
    if [ $1 -gt $N ]
    then
        return 0
    fi
    ans=1
    if [ $(set $1) -eq 753 ]
    then
        ans=1
    else
        ans=0
    fi
    for i in {7..9}
    do
        ans=$(($ans + $(aaa $(($1 + $i)))))
    done
    echo $ans
}

function set() {
    s=0
    while [ $1 -gt 0 ]
    do
        s=$(($s + $1 % 10))
        shift
    done
    echo $s
}

echo $(aaa 0)

```
[/BASH]

[PERL]
```perl

use strict;
use warnings;

my $N = <STDIN>;
sub aaa {
    my $n = shift;
    if ($n > $N) {
        return 0;
    }
    my $ans = 1;
    if (set($n) == 753) {
        $ans = 1;
    } else {
        $ans = 0;
    }
    for my $i (7..9) {
        $ans += aaa($n + $i);
    }
    return $ans;
}

sub set {
    my $n = shift;
    my $s = 0;
    while ($n > 0) {
        $s += $n % 10;
        $n /= 10;
    }
    return $s;
}

print aaa(0);

```
[/PERL]

[PASCAL]
```pascal

program Problem;
var
    N: Integer;

function aaa(n: Integer): Integer;
var
    i: Integer;
begin
    if n > N then
        aaa := 0
    else
    begin
        aaa := 1;
        if set(n) = 753 then
            aaa := 1
        else
            aaa := 0;
        for i := 7 to 9 do
            aaa := aaa + aaa(n + i);
    end;
end;

function set(n: Integer): Integer;
var
    s: Integer;
begin
    s := 0;
    while n > 0 do
    begin
        s := s + n mod 10;
        n := n div 10;
    end;
    set := s;
end;

begin
    Read(N);
    Write(aaa(0));
end.

```
[/PASCAL]

[JULIA]
```julia

N = parse(Int, readline())
function aaa(n)
    if n > N
        return 0
    end
    ans = 1
    if set(n) == 753
        ans = 1
    else
        ans = 0
    end
    for i in 7:9
        ans += aaa(n + i)
    end
    return ans
end

function set(n)
    s = 0
    while n > 0
        s += n % 10
        n /= 10
    end
    return s
end

println(aaa(0))

```
[/JULIA]

[LUA]
```lua

N = io.read("*n")
function aaa(n)
    if n > N then
        return 0
    end
    ans = 1
    if set(n) == 753 then
        ans = 1
    else
        ans = 0
    end
    for i = 7, 9 do
        ans = ans + aaa(n + i)
    end
    return ans
end

function set(n)
    s = 0
    while n > 0 do
        s = s + n % 10
        n = n // 10
    end
    return s
end

print(aaa(0))

```
[/LUA]

[R]
```r

N <- as.integer(readline(prompt=""))
aaa <- function(n) {
    if (n > N) {
        return(0)
    }
    ans <- 1
    if (set(n) == 753) {
        ans <- 1
    } else {
        ans <- 0
    }
    for (i in 7:9) {
        ans <- ans + aaa(n + i)
    }
    return(ans)
}

set <- function(n) {
    s <- 0
    while (n > 0) {
        s <- s + n %% 10
        n <- n / 10
    }
    return(s)
}

print(aaa(0))

```
[/R]

[D]
```d

import std.stdio;

void aaa(int n)
{
    if (n > N) {
        return 0;
    }
    int ans = 1;
    if (set(n) == 753) {
        ans = 1;
    } else {
        ans = 0;
    }
    for (int i = 7; i <= 9; i++) {
        ans += aaa(n + i);
    }
    return ans;
}

int set(int n) {
    int s = 0;
    while (n > 0) {
        s += n % 10;
        n /= 10;
    }
    return s;
}

void main() {
    auto N = readln().to!int;
    writeln(aaa(0));
}

```
[/D]

[KOTLIN]
```kotlin

fun aaa(n: Int): Int {
    if (n > N) {
        return 0
    }
    var ans = 1
    if (set(n) == 753) {
        ans = 1
    } else {
        ans = 0
    }
    for (i in 7..9) {
        ans += aaa(n + i)
    }
    return ans
}

fun set(n: Int): Int {
    var s = 0
    while (n > 0) {
        s += n % 10
        n /= 10
    }
    return s
}

fun main() {
    val N = readLine()!!.toInt()
    println(aaa(0))
}

```
[/KOTLIN]

[MATLAB]
```matlab

N = input('');
function aaa(n)
    if n > N
        return 0
    end
    ans = 1
    if set(n) == 753
        ans = 1
    else
        ans = 0
    end
    for i = 7:9
        ans = ans + aaa(n + i)
    end
    return ans
end

function set(n)
    s = 0
    while n > 0
        s = s + mod(n, 10)
        n = floor(n / 10)
    end
    return s
end

disp(aaa(0))

```
[/MATLAB]

[OCTAVE]
```octave

N = input('');
function aaa(n)
    if n > N
        return 0
    end
    ans = 1
    if set(n) == 753
        ans = 1
    else
        ans = 0
    end
    for i = 7:9
        ans = ans + aaa(n + i)
    end
    return ans
end

function set(n)
    s = 0
    while n > 0
        s = s + mod(n, 10)
        n = floor(n / 10)
    end
    return s
end

disp(aaa(0))

```
[/OCTAVE]

[SCALA]
```scala

object Main {
    def aaa(n: Int): Int = {
        if (n > N) {
            return 0
        }
        var ans = 1
        if (set(n) == 753) {
            ans = 1
        } else {
            ans = 0
        }
        for (i <- 7 to 9) {
            ans += aaa(n + i)
        }
        return ans
    }

    def set(n: Int): Int = {
        var s = 0
        while (n > 0) {
            s += n % 10
            n /= 10
        }
        return s
    }

    def main(args: Array[String]) {
        val N = readLine().toInt
        println(aaa(0))
    }
}

```
[/SCALA]

[SWIFT]
```swift

let N = Int(readLine()!)!
func aaa(_ n: Int) -> Int {
    if n > N {
        return 0
    }
    var ans = 1
    if set(n) == 753 {
        ans = 1
    } else {
        ans = 0
    }
    for i in 7...9 {
        ans += aaa(n + i)
    }
    return ans
}

func set(_ n: Int) -> Int {
    var s = 0
    while n > 0 {
        s += n % 10
        n /= 10
    }
    return s
}

print(aaa(0))

```
[/SWIFT]

[BASH]
```bash

read N

