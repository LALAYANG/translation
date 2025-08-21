
[JAV]

```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += i * (N / i) * (N / i + 1) / 2;
        }
        System.out.println(ans);
    }
}

```

[/JAV]

[PY]

```python

import sys
N = int(sys.stdin.readline().rstrip())
ans = 0
for i in range(1, N + 1):
    ans += i * (N // i) * (N // i + 1) // 2
print(ans)

```

[/PY]

[C]

```c

#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);
    long long ans = 0;
    for (int i = 1; i <= N; i++) {
        ans += i * (N / i) * (N / i + 1) / 2;
    }
    printf("%lld\n", ans);
}

```

[/C]

[CPP]

```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    cin >> N;
    long long ans = 0;
    for (int i = 1; i <= N; i++) {
        ans += i * (N / i) * (N / i + 1) / 2;
    }
    cout << ans << endl;
}

```

[/CPP]

[C#]

```cs

using System;

class Solution {
    static void Main(String[] args) {
        int N = Convert.ToInt32(Console.ReadLine());
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += i * (N / i) * (N / i + 1) / 2;
        }
        Console.WriteLine(ans);
    }
}

```

[/C#]

[PHP]

```php

<?php
$N = intval(fgets(STDIN));
$ans = 0;
for ($i = 1; $i <= $N; $i++) {
    $ans += $i * ($N / $i) * ($N / $i + 1) / 2;
}
echo $ans;

```

[/PHP]

[RUBY]

```ruby

n = gets.to_i
ans = 0
for i in 1..n
    ans += i * (n / i) * (n / i + 1) / 2
end
puts ans

```

[/RUBY]

[GO]

```go

package main

import (
    "fmt"
)

func main() {
    var N int
    fmt.Scan(&N)
    ans := 0
    for i := 1; i <= N; i++ {
        ans += i * (N / i) * (N / i + 1) / 2
    }
    fmt.Println(ans)
}

```

[/GO]

[PAS]

```pascal

program Problem1001A;

{$APPTYPE CONSOLE}

var
  N: Integer;
  ans: Int64;

begin
  ReadLn(N);
  ans := 0;
  for var i := 1 to N do
    ans += i * (N div i) * (N div i + 1) div 2;
  WriteLn(ans);
end.

```

[/PAS]

[JAVASCRIPT]

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
 * Complete the 'solve' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts INTEGER n as parameter.
 */

function solve(n) {
    // Write your code here
    let ans = 0;
    for (let i = 1; i <= n; i++) {
        ans += i * (n / i) * (n / i + 1) / 2;
    }
    return ans;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const n = parseInt(readLine().trim(), 10);

    const result = solve(n);

    ws.write(result + '\n');

    ws.end();
}

```

[/JAVASCRIPT]

[SWIFT]

```swift

import Foundation

var n = Int(readLine()!)!
var ans = 0
for i in 1...n {
    ans += i * (n / i) * (n / i + 1) / 2
}
print(ans)

```

[/SWIFT]

[C#]

```cs

using System;

class Solution {
    static void Main(String[] args) {
        int N = Convert.ToInt32(Console.ReadLine());
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += i * (N / i) * (N / i + 1) / 2;
        }
        Console.WriteLine(ans);
    }
}

```

[/C#]

[HASKELL]

```haskell

import Text.Printf

main :: IO ()
main = do
    n <- readLn :: IO Int
    let ans = sum [i * (n `div` i) * (n `div` i + 1) `div` 2 | i <- [1..n]]
    printf "%d\n" ans

```

[/HASKELL]

[PERL]

```perl

use strict;
use warnings;

my $n = <STDIN>;
chomp $n;
my $ans = 0;
for (my $i = 1; $i <= $n; $i++) {
    $ans += $i * ($n / $i) * ($n / $i + 1) / 2;
}
print "$ans\n";

```

[/PERL]

[R]

```r

n <- as.integer(readline(prompt=""))
ans <- 0
for (i in 1:n) {
    ans <- ans + i * (n / i) * (n / i + 1) / 2
}
cat(ans, "\n")

```

[/R]

[JULIA]

```julia

n = parse(Int, readline())
ans = 0
for i in 1:n
    ans += i * (n ÷ i) * (n ÷ i + 1) ÷ 2
end
println(ans)

```

[/JULIA]

[D]

```d

import std.stdio;

void main()
{
    int n;
    long ans;
    writefln("Enter n: ");
    readf("%d", &n);
    ans = 0;
    for (int i = 1; i <= n; i++)
        ans += i * (n / i) * (n / i + 1) / 2;
    writeln(ans);
}

```

[/D]

[KOTLIN]

```kotlin

import java.util.*

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var ans = 0L
    for (i in 1..n) {
        ans += i * (n / i) * (n / i + 1) / 2
    }
    println(ans)
}

```

[/KOTLIN]

[BASH]

```bash

read -p "Enter n: " n
ans=0
for ((i=1; i<=n; i++)); do
    ans=$((ans + i * (n / i) * (n / i + 1) / 2))
done
echo $ans

```

[/BASH]

[POWERSHELL]

```powershell

$n = Read-Host "Enter n"
$ans = 0
for ($i = 1; $i -le $n; $i++) {
    $ans += $i * ($n / $i) * ($n / $i + 1) / 2
}
$ans

```

[/POWERSHELL]

[AWK]

```awk

BEGIN {
    print "Enter n: ";
    getline n;
    ans = 0;
    for (i = 1; i <= n; i++) {
        ans += i * (n / i) * (n / i + 1) / 2;
    }
    print ans;
}

```

[/AWK]

[MYSQL]

```sql

SELECT SUM(i * (n / i) * (n / i + 1) / 2) AS ans
FROM (
    SELECT @i := @i + 1 AS i
    FROM (
        SELECT 0 UNION ALL SELECT 1 UNION ALL SELECT 2 UNION ALL SELECT 3 UNION ALL SELECT 4 UNION ALL SELECT 5 UNION ALL SELECT 6 UNION ALL SELECT 7 UNION ALL SELECT 8 UNION ALL SELECT 9
    ) t1
    CROSS JOIN (
        SELECT 0 UNION ALL SELECT 1 UNION ALL SELECT 2 UNION ALL SELECT 3 UNION ALL SELECT 4 UNION ALL SELECT 5 UNION ALL SELECT 6 UNION ALL SELECT 7 UNION ALL SELECT 8 UNION ALL SELECT 9
    ) t2
    CROSS JOIN (
        SELECT @i := -1
    ) t3
    WHERE @i < n
) t

```

[/MYSQL]

[POSTGRESQL]

```sql

WITH RECURSIVE t AS (
    SELECT 1 AS i
    UNION ALL
    SELECT i + 1
    FROM t
    WHERE i < n
)
SELECT SUM(i * (n / i) * (n / i + 1) / 2) AS ans
FROM t

```

[/POSTGRESQL]

[ORACLE]

```sql

SELECT SUM(i * (n / i) * (n / i + 1) / 2) AS ans
FROM (
    SELECT LEVEL AS i
    FROM dual
    CONNECT BY LEVEL <= n
)

```

[/ORACLE]

[DB2]

```sql

WITH t AS (
    SELECT 1 AS i
    UNION ALL
    SELECT i + 1
    FROM t
    WHERE i < n
)
SELECT SUM(i * (n / i) * (n / i + 1) / 2) AS ans
FROM t

```

[/DB2]

[SQLITE]

```sql

WITH RECURSIVE t AS (
    SELECT 1 AS i
    UNION ALL
    SELECT i + 1
    FROM t
    WHERE i < n
)
SELECT SUM(i * (n / i) * (n / i + 1) / 2) AS ans
FROM t

```

[/SQLITE]

[MSSQL]

```sql

DECLARE @n int
DECLARE @ans bigint
SET @n = 0
SET @ans = 0
PRINT 'Enter n: '
SET @n = (SELECT TOP 1 @n = CONVERT(int, CONVERT(varchar, @n)) FROM sys.messages WHERE @n IS NULL)
WHILE @n > 0
BEGIN
    SET @ans = @ans + @n * (@n / @n) * (@n / @n + 1) / 2
    SET @n = @n - 1
END
PRINT @ans

```

[/MSSQL]

[PLPGSQL]

```sql

CREATE OR REPLACE FUNCTION solve(n integer)
RETURNS bigint AS $$
DECLARE
    ans bigint;
BEGIN
    ans := 0;
    FOR i IN 1..n LOOP
        ans := ans + i * (n / i) * (n / i + 1) / 2;
    END LOOP;
    RETURN ans;
END;
$$ LANGUAGE plpgsql;

```

[/PLPGSQL]

[OBJECTIVEC]

```objectivec

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int n;
        long ans;
        scanf("%d", &n);
        ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i * (n / i) * (n / i + 1) / 2;
        }
        printf("%ld\n", ans);
    }
    return 0;
}

```

[/OBJECTIVEC]

[COFFEESCRIPT]

```coffeescript

n = parseInt readline()
ans = 0
for i in [1..n]
    ans += i * (n / i) * (n / i + 1) / 2
console.log ans

```

[/COFFEESCRIPT]

[CLOJURE]

```clojure

(let [n (read-string (read-line))]
    (println (reduce + (for [i (range 1 (inc n))]
                         (* i (/ (* n (inc n)) i))))))

```

[/CLOJURE]

[BASH]

```bash

read -p "Enter n: " n
ans=0
for ((i=1; i<=n; i++)); do
    ans=$((ans + i * (n / i) * (n / i + 1) / 2))
done
echo $ans

```

[/BASH]

[POWERSHELL]

```powershell

$n = Read-Host "Enter n"
$ans = 0
for ($i = 1; $i -le $n; $i++) {
    $ans += $i * ($n / $i) * ($n / $i + 1) / 2
}
$ans

```

[/POWERSHELL]

[AWK]

```awk

BEGIN {
    print "Enter n: ";
    getline n;
    ans = 0;
    for (i = 1; i <= n; i++) {
        ans += i * (n / i) * (n / i + 1) / 2;
    }
    print ans;
}

```

[/AWK]

[MYSQL]

```
