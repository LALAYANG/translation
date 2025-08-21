
[JAV]
```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time1 = sc.nextLine().split(":");
        int h1 = Integer.parseInt(time1[0]);
        int m1 = Integer.parseInt(time1[1]);
        m1 += h1 * 60;
        String[] time2 = sc.nextLine().split(":");
        int h2 = Integer.parseInt(time2[0]);
        int m2 = Integer.parseInt(time2[1]);
        m2 += h2 * 60;
        m2 = m1 - m2;
        m2 %= 1440;
        System.out.println(String.format("%02d:%02d", m2 / 60, m2 % 60));
    }
}

```
[/JAV]

[PYT]
```py

h1 , m1 = ( map ( int , input ( ).split ( ':' ) ) )
m1 += h1 * 60
h2 , m2 = ( map ( int , input ( ).split ( ':' ) ) )
m2 += h2 * 60
m2 = m1 - m2
m2 %= 1440
print ( "%02d:%02d" % ( m2 // 60 , m2 % 60 ) )


```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    string time1, time2;
    cin >> time1 >> time2;
    int h1 = stoi(time1.substr(0, 2));
    int m1 = stoi(time1.substr(3, 2));
    m1 += h1 * 60;
    int h2 = stoi(time2.substr(0, 2));
    int m2 = stoi(time2.substr(3, 2));
    m2 += h2 * 60;
    m2 = m1 - m2;
    m2 %= 1440;
    cout << setfill('0') << setw(2) << m2 / 60 << ":" << setfill('0') << setw(2) << m2 % 60 << endl;
}

```
[/CPP]

[C]
```c

#include <stdio.h>
#include <string.h>

int main() {
    char time1[10], time2[10];
    scanf("%s %s", time1, time2);
    int h1 = time1[0] - '0' * 10 + time1[1] - '0';
    int m1 = time1[3] - '0' * 10 + time1[4] - '0';
    m1 += h1 * 60;
    int h2 = time2[0] - '0' * 10 + time2[1] - '0';
    int m2 = time2[3] - '0' * 10 + time2[4] - '0';
    m2 += h2 * 60;
    m2 = m1 - m2;
    m2 %= 1440;
    printf("%02d:%02d", m2 / 60, m2 % 60);
}

```
[/C]

[PHP]
```php

<?php
$time1 = explode(':', readline());
$time2 = explode(':', readline());
$h1 = $time1[0] * 60 + $time1[1];
$h2 = $time2[0] * 60 + $time2[1];
$h = $h1 - $h2;
$h %= 1440;
echo sprintf('%02d:%02d', $h / 60, $h % 60);

```
[/PHP]

[RUBY]
```ruby

h1 , m1 = ( gets.split ( ':' ) )
m1 += h1 * 60
h2 , m2 = ( gets.split ( ':' ) )
m2 += h2 * 60
m2 = m1 - m2
m2 %= 1440
puts ( "%02d:%02d" % ( m2 / 60 , m2 % 60 ) )


```
[/RUBY]

[GO]
```go

package main

import (
    "fmt"
    "strings"
)

func main() {
    var time1, time2 string
    fmt.Scan(&time1, &time2)
    h1, m1 := strings.Split(time1, ":")
    h1 = h1 + "0"
    m1 = m1 + "0"
    h2, m2 := strings.Split(time2, ":")
    h2 = h2 + "0"
    m2 = m2 + "0"
    h1 = h1 + m1
    h2 = h2 + m2
    h1, _ = strconv.Atoi(h1)
    h2, _ = strconv.Atoi(h2)
    h := h1 - h2
    h %= 1440
    fmt.Printf("%02d:%02d", h/60, h%60)
}

```
[/GO]

[BASH]
```bash

read -p "Enter time 1: " time1
read -p "Enter time 2: " time2
h1=${time1:0:2}
m1=${time1:3:2}
m1=$((10#$m1 + 60 * $h1))
h2=${time2:0:2}
m2=${time2:3:2}
m2=$((10#$m2 + 60 * $h2))
m2=$((m1 - m2))
m2=$((m2 % 1440))
printf "%02d:%02d\n" $((m2 / 60)) $((m2 % 60))


```
[/BASH]

[PERL]
```perl

use strict;
use warnings;

my $time1 = <STDIN>;
my $time2 = <STDIN>;
my ($h1, $m1) = split /:/, $time1;
$m1 += $h1 * 60;
my ($h2, $m2) = split /:/, $time2;
$m2 += $h2 * 60;
$m2 = $m1 - $m2;
$m2 %= 1440;
printf "%02d:%02d\n", $m2 / 60, $m2 % 60;


```
[/PERL]

[PASCAL]
```pascal

program TimeDifference;
var
  time1, time2: string;
  h1, m1, h2, m2, h, m: integer;
begin
  readln(time1);
  readln(time2);
  h1 := StrToInt(Copy(time1, 1, 2));
  m1 := StrToInt(Copy(time1, 4, 2));
  m1 := m1 + h1 * 60;
  h2 := StrToInt(Copy(time2, 1, 2));
  m2 := StrToInt(Copy(time2, 4, 2));
  m2 := m2 + h2 * 60;
  m2 := m1 - m2;
  m2 := m2 mod 1440;
  h := m2 div 60;
  m := m2 mod 60;
  writeln(Format('%02d:%02d', [h, m]));
end.

```
[/PASCAL]

[JULIA]
```julia

time1 = readline()
time2 = readline()
h1 = parse(Int, time1[1:2])
m1 = parse(Int, time1[4:5])
m1 += h1 * 60
h2 = parse(Int, time2[1:2])
m2 = parse(Int, time2[4:5])
m2 += h2 * 60
m2 = m1 - m2
m2 %= 1440
println(lpad(m2 ÷ 60, 2, "0"), ":", lpad(m2 % 60, 2, "0"))


```
[/JULIA]

[LUA]
```lua

time1 = io.read()
time2 = io.read()
h1 = tonumber(string.sub(time1, 1, 2))
m1 = tonumber(string.sub(time1, 4, 5))
m1 = m1 + h1 * 60
h2 = tonumber(string.sub(time2, 1, 2))
m2 = tonumber(string.sub(time2, 4, 5))
m2 = m2 + h2 * 60
m2 = m1 - m2
m2 = m2 % 1440
print(string.format("%02d:%02d", m2 / 60, m2 % 60))


```
[/LUA]

[R]
```r

time1 <- readline()
time2 <- readline()
h1 <- as.numeric(substr(time1, 1, 2))
m1 <- as.numeric(substr(time1, 4, 5))
m1 <- m1 + h1 * 60
h2 <- as.numeric(substr(time2, 1, 2))
m2 <- as.numeric(substr(time2, 4, 5))
m2 <- m2 + h2 * 60
m2 <- m1 - m2
m2 <- m2 %% 1440
cat(sprintf("%02d:%02d", m2 / 60, m2 %% 60))


```
[/R]

[MATLAB]
```matlab

time1 = input('Enter time 1: ');
time2 = input('Enter time 2: ');
h1 = str2double(time1(1:2));
m1 = str2double(time1(4:5));
m1 = m1 + h1 * 60;
h2 = str2double(time2(1:2));
m2 = str2double(time2(4:5));
m2 = m2 + h2 * 60;
m2 = m1 - m2;
m2 = mod(m2, 1440);
fprintf('%02d:%02d\n', m2 / 60, m2 % 60);


```
[/MATLAB]

[OBJECTIVE-C]
```objectivec

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        NSString *time1 = [NSString stringWithCString:getenv("PWD") encoding:NSUTF8StringEncoding];
        NSString *time2 = [NSString stringWithCString:getenv("PWD") encoding:NSUTF8StringEncoding];
        NSArray *time1Array = [time1 componentsSeparatedByString:@":"];
        NSArray *time2Array = [time2 componentsSeparatedByString:@":"];
        int h1 = [[time1Array objectAtIndex:0] intValue];
        int m1 = [[time1Array objectAtIndex:1] intValue];
        m1 += h1 * 60;
        int h2 = [[time2Array objectAtIndex:0] intValue];
        int m2 = [[time2Array objectAtIndex:1] intValue];
        m2 += h2 * 60;
        m2 = m1 - m2;
        m2 %= 1440;
        printf("%02d:%02d\n", m2 / 60, m2 % 60);
    }
    return 0;
}

```
[/OBJECTIVE-C]

[AWK]
```awk

{
    split($1, a, ":")
    split($2, b, ":")
    h1 = a[1] * 60 + a[2]
    h2 = b[1] * 60 + b[2]
    h = h1 - h2
    h %= 1440
    printf("%02d:%02d\n", h / 60, h % 60)
}

```
[/AWK]

[D]
```d

import std.stdio;

void main()
{
    auto time1 = readln();
    auto time2 = readln();
    auto h1 = to!int(time1[0..1]) * 60 + to!int(time1[3..4]);
    auto h2 = to!int(time2[0..1]) * 60 + to!int(time2[3..4]);
    auto h = h1 - h2;
    h %= 1440;
    writeln(h / 60, ":", h % 60);
}

```
[/D]

[KOTLIN]
```kotlin

fun main(args: Array<String>) {
    val time1 = readLine()!!
    val time2 = readLine()!!
    val h1 = time1.substring(0, 2).toInt() * 60 + time1.substring(3, 5).toInt()
    val h2 = time2.substring(0, 2).toInt() * 60 + time2.substring(3, 5).toInt()
    val h = h1 - h2
    h %= 1440
    println(String.format("%02d:%02d", h / 60, h % 60))
}

```
[/KOTLIN]

[SCALA]
```scala

object Solution {
    def main(args: Array[String]) {
        val time1 = readLine()
        val time2 = readLine()
        val h1 = time1.substring(0, 2).toInt * 60 + time1.substring(3, 5).toInt
        val h2 = time2.substring(0, 2).toInt * 60 + time2.substring(3, 5).toInt
        val h = h1 - h2
        h %= 1440
        println(String.format("%02d:%02d", h / 60, h % 60))
    }
}

```
[/SCALA]

[SWIFT]
```swift

import Foundation

let time1 = readLine()!
let time2 = readLine()!
let h1 = Int(time1.substring(to: time1.index(time1.startIndex, offsetBy: 2)))! * 60 + Int(time1.substring(from: time1.index(time1.startIndex, offsetBy: 3)))!
let h2 = Int(time2.substring(to: time2.index(time2.startIndex, offsetBy: 2)))! * 60 + Int(time2.substring(from: time2.index(time2.startIndex, offsetBy: 3)))!
let h = h1 - h2
h %= 1440
print(String(format: "%02d:%02d", h / 60, h % 60))



