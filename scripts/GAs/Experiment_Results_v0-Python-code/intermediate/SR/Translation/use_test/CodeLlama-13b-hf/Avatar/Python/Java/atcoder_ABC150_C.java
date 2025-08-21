
[JAV]
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.abs(arr[i] - arr2[i]);
        }
        System.out.println(sum);
    }
}
```
[/JAV]

[PY]
```
n = int(input())
arr = list(map(int, input().split()))
arr2 = list(map(int, input().split()))
sum = 0
for i in range(n):
    sum += abs(arr[i] - arr2[i])
print(sum)
```
[/PY]

[C]
```
#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    int arr[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    int arr2[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr2[i]);
    }
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += abs(arr[i] - arr2[i]);
    }
    printf("%d", sum);
}
```
[/C]

[CPP]
```
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    int arr2[n];
    for (int i = 0; i < n; i++) {
        cin >> arr2[i];
    }
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += abs(arr[i] - arr2[i]);
    }
    cout << sum;
}
```
[/CPP]

[C#]
```
using System;

class Solution
{
    static void Main(String[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine());
        int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp));
        int[] arr2 = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp));
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += Math.Abs(arr[i] - arr2[i]);
        }
        Console.WriteLine(sum);
    }
}
```
[/C#]

[PHP]
```
<?php
$n = intval(readline());
$arr = array_map('intval', explode(' ', readline()));
$arr2 = array_map('intval', explode(' ', readline()));
$sum = 0;
for ($i = 0; $i < $n; $i++) {
    $sum += abs($arr[$i] - $arr2[$i]);
}
echo $sum;
```
[/PHP]

[RUBY]
```
n = gets.to_i
arr = gets.split.map(&:to_i)
arr2 = gets.split.map(&:to_i)
sum = 0
for i in 0..n-1
    sum += (arr[i] - arr2[i]).abs
end
puts sum
```
[/RUBY]

[GO]
```
package main

import (
    "fmt"
    "strconv"
)

func main() {
    var n int
    fmt.Scan(&n)
    arr := make([]int, n)
    for i := 0; i < n; i++ {
        fmt.Scan(&arr[i])
    }
    arr2 := make([]int, n)
    for i := 0; i < n; i++ {
        fmt.Scan(&arr2[i])
    }
    sum := 0
    for i := 0; i < n; i++ {
        sum += abs(arr[i] - arr2[i])
    }
    fmt.Println(sum)
}

func abs(x int) int {
    if x < 0 {
        return -x
    }
    return x
}
```
[/GO]

[BASH]
```
read n
read -a arr
read -a arr2
sum=0
for ((i=0; i<n; i++)); do
    sum=$((sum + $(abs $((arr[i] - arr2[i])))))
done
echo $sum
```
[/BASH]

[PERL]
```
use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my @arr = split(/ /, <STDIN>);
my @arr2 = split(/ /, <STDIN>);
my $sum = 0;
for (my $i = 0; $i < $n; $i++) {
    $sum += abs($arr[$i] - $arr2[$i]);
}
print $sum;
```
[/PERL]

[PASCAL]
```
program sum_of_absolute_differences;
var
    n: integer;
    arr: array[1..1000] of integer;
    arr2: array[1..1000] of integer;
    sum: integer;
    i: integer;
begin
    readln(n);
    for i := 1 to n do
        read(arr[i]);
    for i := 1 to n do
        read(arr2[i]);
    sum := 0;
    for i := 1 to n do
        sum := sum + abs(arr[i] - arr2[i]);
    writeln(sum);
end.
```
[/PASCAL]

[JULIA]
```
n = parse(Int, readline())
arr = parse.(Int, split(readline()))
arr2 = parse.(Int, split(readline()))
sum = 0
for i in 1:n
    sum += abs(arr[i] - arr2[i])
end
println(sum)
```
[/JULIA]

[R]
```
n <- as.integer(readline())
arr <- as.integer(readline())
arr2 <- as.integer(readline())
sum <- 0
for (i in 1:n) {
    sum <- sum + abs(arr[i] - arr2[i])
}
print(sum)
```
[/R]

[JS]
```
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });

    main();
});

function readline() {
    return inputString[currentLine++];
}

function main() {
    const n = parseInt(readline(), 10);
    const arr = readline().split(' ').map(arrTemp => parseInt(arrTemp, 10));
    const arr2 = readline().split(' ').map(arrTemp => parseInt(arrTemp, 10));
    let sum = 0;
    for (let i = 0; i < n; i++) {
        sum += Math.abs(arr[i] - arr2[i]);
    }
    console.log(sum);
}
```
[/JS]

[LUA]
```
local n = io.read("*n")
local arr = {}
for i = 1, n do
    arr[i] = io.read("*n")
end
local arr2 = {}
for i = 1, n do
    arr2[i] = io.read("*n")
end
local sum = 0
for i = 1, n do
    sum = sum + math.abs(arr[i] - arr2[i])
end
print(sum)
```
[/LUA]

[D]
```
import std.stdio;

void main()
{
    auto n = readln().to!int;
    auto arr = readln().split.map!int;
    auto arr2 = readln().split.map!int;
    auto sum = 0;
    for (auto i = 0; i < n; i++)
        sum += abs(arr[i] - arr2[i]);
    writeln(sum);
}
```
[/D]

[KOTLIN]
```
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    val arr2 = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    var sum = 0
    for (i in 0 until n) {
        sum += kotlin.math.abs(arr[i] - arr2[i])
    }
    println(sum)
}
```
[/KOTLIN]

[BASH]
```
read n
read -a arr
read -a arr2
sum=0
for ((i=0; i<n; i++)); do
    sum=$((sum + $(abs $((arr[i] - arr2[i])))))
done
echo $sum
```
[/BASH]

[AWK]
```
{
    n = $1
    for (i = 1; i <= n; i++) {
        arr[i] = $i
        arr2[i] = $(i + n)
    }
    sum = 0
    for (i = 1; i <= n; i++) {
        sum += abs(arr[i] - arr2[i])
    }
    print sum
}
```
[/AWK]

[OBJECTIVE-C]
```
#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int n;
        scanf("%d", &n);
        int arr[n];
        for (int i = 0; i < n; i++) {
            scanf("%d", &arr[i]);
        }
        int arr2[n];
        for (int i = 0; i < n; i++) {
            scanf("%d", &arr2[i]);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += abs(arr[i] - arr2[i]);
        }
        printf("%d", sum);
    }
    return 0;
}
```
[/OBJECTIVE-C]

[COFFEESCRIPT]
```
n = parseInt readline()
arr = (parseInt x for x in readline().split ' ')
arr2 = (parseInt x for x in readline().split ' ')
sum = 0
for i in [0..n-1]
    sum += Math.abs arr[i] - arr2[i]
console.log sum
```
[/COFFEESCRIPT]

[VB]
```
Imports System

Module Module1

    Sub Main()
        Dim n As Integer = Console.ReadLine()
        Dim arr As Integer() = Console.ReadLine().Split(" ").Select(Function(x) Integer.Parse(x)).ToArray()
        Dim arr2 As Integer() = Console.ReadLine().Split(" ").Select
