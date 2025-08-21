
[JAV]
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a < 2) {
                System.out.println(0);
            }
            if (a >= 2) {
                System.out.println(a - 2);
            }
        }
    }
}

```
[/JAV]

[PYT]
```py

n = int(input())
for i in range(n):
    a = int(input())
    if a < 2:
        print(0)
    if a >= 2:
        print(a - 2)


```
[/PYT]

[C++]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        int a;
        cin >> a;
        if (a < 2)
        {
            cout << 0 << endl;
        }
        if (a >= 2)
        {
            cout << a - 2 << endl;
        }
    }
    return 0;
}

```
[/C++]

[C]
```c

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        int a;
        scanf("%d", &a);
        if (a < 2)
        {
            printf("%d\n", 0);
        }
        if (a >= 2)
        {
            printf("%d\n", a - 2);
        }
    }
    return 0;
}

```
[/C]

[PHP]
```php

<?php
$n = (int)trim(fgets(STDIN));
for ($i = 0; $i < $n; $i++) {
    $a = (int)trim(fgets(STDIN));
    if ($a < 2) {
        echo 0 . PHP_EOL;
    }
    if ($a >= 2) {
        echo $a - 2 . PHP_EOL;
    }
}

```
[/PHP]

[RUBY]
```ruby

n = gets.to_i
n.times do
    a = gets.to_i
    if a < 2
        puts 0
    end
    if a >= 2
        puts a - 2
    end
end

```
[/RUBY]

[GO]
```go

package main

import (
    "fmt"
)

func main() {
    var n int
    fmt.Scan(&n)
    for i := 0; i < n; i++ {
        var a int
        fmt.Scan(&a)
        if a < 2 {
            fmt.Println(0)
        }
        if a >= 2 {
            fmt.Println(a - 2)
        }
    }
}

```
[/GO]

[BASH]
```bash

read n
for ((i=0; i<n; i++)); do
    read a
    if [ $a -lt 2 ]; then
        echo 0
    fi
    if [ $a -ge 2 ]; then
        echo $((a - 2))
    fi
done

```
[/BASH]

[PERL]
```perl

use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
for (my $i = 0; $i < $n; $i++) {
    my $a = <STDIN>;
    chomp($a);
    if ($a < 2) {
        print 0 . "\n";
    }
    if ($a >= 2) {
        print $a - 2 . "\n";
    }
}

```
[/PERL]

[PASCAL]
```pascal

program problem;
var
    n, a: integer;
begin
    readln(n);
    for var i := 1 to n do
    begin
        readln(a);
        if a < 2 then
            writeln(0)
        else
            writeln(a - 2);
    end;
end.

```
[/PASCAL]

[JULIA]
```julia

n = parse(Int, readline())
for i in 1:n
    a = parse(Int, readline())
    if a < 2
        println(0)
    end
    if a >= 2
        println(a - 2)
    end
end

```
[/JULIA]

[LUA]
```lua

n = io.read("*n")
for i = 1, n do
    a = io.read("*n")
    if a < 2 then
        print(0)
    end
    if a >= 2 then
        print(a - 2)
    end
end

```
[/LUA]

[AWK]
```awk

{
    n = $1
    for (i = 1; i <= n; i++) {
        a = $i
        if (a < 2) {
            print 0
        }
        if (a >= 2) {
            print a - 2
        }
    }
}

```
[/AWK]

[R]
```r

n <- as.integer(readline(prompt=""))
for (i in 1:n) {
    a <- as.integer(readline(prompt=""))
    if (a < 2) {
        cat(0, "\n")
    }
    if (a >= 2) {
        cat(a - 2, "\n")
    }
}

```
[/R]

[D]
```d

import std.stdio;

void main()
{
    auto n = readln().to!int;
    for (int i = 0; i < n; i++)
    {
        auto a = readln().to!int;
        if (a < 2)
        {
            writeln(0);
        }
        if (a >= 2)
        {
            writeln(a - 2);
        }
    }
}

```
[/D]

[KOTLIN]
```kotlin

fun main() {
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        val a = readLine()!!.toInt()
        if (a < 2) {
            println(0)
        }
        if (a >= 2) {
            println(a - 2)
        }
    }
}

```
[/KOTLIN]

[MATLAB]
```matlab

n = input('');
for i = 1:n
    a = input('');
    if a < 2
        disp(0)
    end
    if a >= 2
        disp(a - 2)
    end
end

```
[/MATLAB]

[SCALA]
```scala

object Main {
    def main(args: Array[String]) {
        val n = readLine().toInt
        for (i <- 1 to n) {
            val a = readLine().toInt
            if (a < 2) {
                println(0)
            }
            if (a >= 2) {
                println(a - 2)
            }
        }
    }
}

```
[/SCALA]

[VB]
```vb

Module Module1
    Sub Main()
        Dim n As Integer = CInt(Console.ReadLine())
        For i As Integer = 1 To n
            Dim a As Integer = CInt(Console.ReadLine())
            If a < 2 Then
                Console.WriteLine(0)
            End If
            If a >= 2 Then
                Console.WriteLine(a - 2)
            End If
        Next
    End Sub
End Module

```
[/VB]

[CAML]
```ocaml

let () =
    let n = read_int () in
    for i = 1 to n do
        let a = read_int () in
        if a < 2 then
            print_int 0;
            print_newline ()
        else
            print_int (a - 2);
            print_newline ()
    done

```
[/CAML]

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
    let sum = 0;
    let min = arr[0];
    let max = arr[0];
    for (let i = 0; i < arr.length; i++) {
        sum += arr[i];
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
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
    let sum = 0;
    let min = arr[0];
    let max = arr[0];
    for (let i = 0; i < arr.length; i++) {
        sum += arr[i];
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    console.log(sum - max + " " + sum - min);
}

function main() {
    const arr: number[] = readLine().replace(/\s+$/g, '').split(' ').map(arrTemp => parseInt(arrTemp, 10));

    miniMaxSum(arr);
}

```
[/TS]

[MYSQL]
```sql

SELECT
    SUM(a) - MAX(a) AS max,
    SUM(a) - MIN(a) AS min
FROM
    (SELECT
        a
    FROM
        (SELECT
            a
        FROM
            (SELECT
                a
            FROM
                (SELECT
                    a
                FROM
                    (SELECT
                        a
                    FROM
                        (SELECT
                            a
                        FROM
                            (SELECT
                                a
                            FROM
                                (SELECT
                                    a
                                FROM
                                    (SELECT
                                        a
                                    FROM
                                        (SELECT
                                            a
                                        FROM
                                            (SELECT
                                                a
                                            FROM
                                                (SELECT
                                                    a
                                                FROM
                                                    (SELECT
                                                        a
                                                    FROM
                                                        (SELECT
                                                            a
                                                        FROM
                                                            (SELECT
                                                                a
                                                            FROM
                                                                (SELECT
                                                                    a
                                                                FROM
                                                                    (SELECT
                                                                        a
                                                                    FROM
                                                                        (SELECT
                                                                            a
                                                                        FROM
                                                                            (SELECT
                                                                                a
                                                                            FROM
                                                                                (SELECT
                                                                                    a
                                                                                FROM
                                                                                    (SELECT
                                                                                        a
                                                                                    FROM
                                                                                        (SELECT
                                                                                            a
                                                                                        FROM
                                                                                            (SELECT
                                                                                                a
                                                                                            FROM
                                                                                                (SELECT
                                                                                                    a
                                                                                                FROM
                                                                                                    (SELECT
                                                                                                        a
                                                                                                    FROM
                                                                                                        (SELECT
                                                                                                            a
                                                                                                        FROM
                                                                                                            (SELECT
                                                                                                                a
                                                                                                            FROM
                                                                                                                (SELECT
                                                                                                                    a
                                                                                                                FROM
                                                                                                                    (SELECT
                                                                                                                        a
                                                                                                                    FROM
                                                                                                                        (SELECT
                                                                                                                            a
                                                                                                                        FROM
                                                                                                                            (SELECT
                                                                                                                                a
                                                                                                                            FROM
                                                                                                                                (SELECT
                                                                                                                                    a
                                                                                                                                FROM
                                                                                                                                    (SELECT
                                                                                                                                        a
                                                                                                                                    FROM
                                                                                                                                        (SELECT
                                                                                                                                            a
                                                                                                                                        FROM
                                                                                                                                            (SELECT
                                                                                                                                                a
                                                                                                                                            FROM
                                                                                                                                                (SELECT
                                                                                                                                                    a
                                                                                                                                                FROM
                                                                                                                                                    (SELECT
                                                                                                                                                        a
                                                                                                                                                    FROM
                                                                                                                                                        (SELECT
                                                                                                                                                            a
                                                                                                                                                        FROM
                                                                                                                                                            (SELECT
                                                                                                                                                                a
                                                                                                                                                            FROM
                                                                                                                                                                (SELECT
                                
