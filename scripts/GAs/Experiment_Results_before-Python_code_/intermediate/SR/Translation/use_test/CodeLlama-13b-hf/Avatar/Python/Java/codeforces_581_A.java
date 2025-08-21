
[JAV]
```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.min(a, b) + " " + (Math.max(a, b) - Math.min(a, b)) / 2);
    }
}

```
[/JAV]

[PYT]
```py

a, b = map(int, input().split())
print(min(a, b), (max(a, b) - min(a, b)) // 2)

```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int a, b;
    cin >> a >> b;
    cout << min(a, b) << " " << (max(a, b) - min(a, b)) / 2 << endl;
}

```
[/CPP]

[C]
```c

#include <stdio.h>
#include <stdlib.h>

int main() {
    int a, b;
    scanf("%d %d", &a, &b);
    printf("%d %d", min(a, b), (max(a, b) - min(a, b)) / 2);
}

```
[/C]

[MAT]
```matlab

a = input('');
b = input('');
disp([min(a, b) (max(a, b) - min(a, b)) / 2])

```
[/MAT]

[RUB]
```ruby

a, b = gets.split.map(&:to_i)
puts [a, b].min, (a - b).abs / 2

```
[/RUB]

[PHP]
```php

<?php
$a = (int) trim(fgets(STDIN));
$b = (int) trim(fgets(STDIN));
echo min($a, $b) . ' ' . (max($a, $b) - min($a, $b)) / 2;

```
[/PHP]

[GO]
```go

package main

import (
	"fmt"
)

func main() {
	var a, b int
	fmt.Scan(&a, &b)
	fmt.Println(min(a, b), (max(a, b)-min(a, b))/2)
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

```
[/GO]

[PAS]
```pascal

program Problem;
var
  a, b: Integer;
begin
  ReadLn(a, b);
  WriteLn(Min(a, b), (Max(a, b) - Min(a, b)) div 2);
end.

```
[/PAS]

[BASH]
```bash

read a b
echo $((a < b ? a : b)) $((a > b ? a - b : b - a) / 2)

```
[/BASH]

[PL]
```perl

use strict;
use warnings;

my ($a, $b) = split /\s+/, <>;
print "$a $b" if $a < $b;
print "$b $a" if $a > $b;
print "$a ", ($a - $b) / 2, "\n";

```
[/PL]

[JULIA]
```julia

a, b = parse.(Int, split(readline()))
println(min(a, b), (max(a, b) - min(a, b)) ÷ 2)

```
[/JULIA]

[KOTLIN]
```kotlin

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    println("${minOf(a, b)} ${maxOf(a, b) - minOf(a, b)}")
}

```
[/KOTLIN]

[R]
```r

a <- scan("", integer())
b <- scan("", integer())
print(min(a, b), (max(a, b) - min(a, b)) / 2)

```
[/R]

[COFFEE]
```coffeescript

[a, b] = (require 'fs').readFileSync('/dev/stdin', 'utf8').split ' '
console.log a, b

```
[/COFFEE]

[VB]
```vb

Dim a, b
a = Console.ReadLine()
b = Console.ReadLine()
Console.WriteLine(Math.Min(a, b) & " " & (Math.Max(a, b) - Math.Min(a, b)) \ 2)

```
[/VB]

[JS]
```js

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

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

function miniMaxSum(arr) {
    // Write your code here
    let min = arr[0];
    let max = arr[0];
    let sum = 0;
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
        sum += arr[i];
    }
    console.log(sum - max + " " + sum - min);
}

function main() {
    const arr = readLine().replace(/\s+$/g, '').split(' ').map(arrTemp => parseInt(arrTemp, 10));

    miniMaxSum(arr);
}

```
[/JS]

[TS]
```ts

'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString: string = '';
let currentLine: number = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

function miniMaxSum(arr: number[]): void {
    // Write your code here
    let min = arr[0];
    let max = arr[0];
    let sum = 0;
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
        sum += arr[i];
    }
    console.log(sum - max + " " + sum - min);
}

function main() {
    const arr: number[] = readLine().replace(/\s+$/g, '').split(' ').map(arrTemp => parseInt(arrTemp, 10));

    miniMaxSum(arr);
}

```
[/TS]

[MYS]
```mysql

SELECT MIN(a), MAX(a) - MIN(a) / 2 FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT a FROM (SELECT
