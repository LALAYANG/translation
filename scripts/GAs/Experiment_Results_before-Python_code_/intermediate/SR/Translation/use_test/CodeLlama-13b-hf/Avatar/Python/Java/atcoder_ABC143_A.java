
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = A - 2 * B;
        if (ans < 0) {
            ans = 0;
        }
        System.out.println(ans);
    }
}

```
[/JAV]

[PYT]
```py
A, B = map(int, input().split())
ans = A - 2 * B
if ans < 0:
    ans = 0
print(ans)

```
[/PYT]

[CPP]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int A, B;
    cin >> A >> B;
    int ans = A - 2 * B;
    if (ans < 0) {
        ans = 0;
    }
    cout << ans << endl;
}

```
[/CPP]

[C]
```c
#include <stdio.h>

int main() {
    int A, B;
    scanf("%d %d", &A, &B);
    int ans = A - 2 * B;
    if (ans < 0) {
        ans = 0;
    }
    printf("%d\n", ans);
}

```
[/C]

[MAT]
```matlab
A = input('');
B = input('');
ans = A - 2 * B;
if ans < 0
    ans = 0;
end
disp(ans)

```
[/MAT]

[RUB]
```ruby
A, B = gets.split.map(&:to_i)
ans = A - 2 * B
if ans < 0
    ans = 0
end
puts ans

```
[/RUB]

[PHP]
```php
<?php
$A = (int) trim(fgets(STDIN));
$B = (int) trim(fgets(STDIN));
$ans = $A - 2 * $B;
if ($ans < 0) {
    $ans = 0;
}
echo $ans;

```
[/PHP]

[GO]
```go
package main

import (
    "fmt"
)

func main() {
    var A, B int
    fmt.Scan(&A, &B)
    ans := A - 2*B
    if ans < 0 {
        ans = 0
    }
    fmt.Println(ans)
}

```
[/GO]

[PAS]
```pascal
program Problem;
var
    A, B, ans: integer;
begin
    read(A, B);
    ans := A - 2 * B;
    if ans < 0 then
        ans := 0;
    end;
    writeln(ans);
end.

```
[/PAS]

[BASH]
```bash
read A B
ans=$((A - 2 * B))
if [ $ans -lt 0 ]; then
    ans=0
fi
echo $ans

```
[/BASH]

[PL]
```perl
use strict;
use warnings;

my $A = <STDIN>;
chomp $A;
my $B = <STDIN>;
chomp $B;
my $ans = $A - 2 * $B;
if ($ans < 0) {
    $ans = 0;
}
print "$ans\n";

```
[/PL]

[LUA]
```lua
A, B = io.read("*n"), io.read("*n")
ans = A - 2 * B
if ans < 0 then
    ans = 0
end
print(ans)

```
[/LUA]

[JL]
```julia
A, B = parse.(Int, split(readline()))
ans = A - 2 * B
if ans < 0
    ans = 0
end
println(ans)

```
[/JL]

[D]
```d
import std.stdio;

void main()
{
    int A, B, ans;
    writefln("Enter A and B: ");
    readf("%d %d", A, B);
    ans = A - 2 * B;
    if (ans < 0)
        ans = 0;
    writeln(ans);
}

```
[/D]

[RB]
```ruby
A, B = gets.split.map(&:to_i)
ans = A - 2 * B
if ans < 0
    ans = 0
end
puts ans

```
[/RB]

[CS]
```csharp
using System;

class Solution
{
    static void Main(string[] args)
    {
        int A = int.Parse(Console.ReadLine());
        int B = int.Parse(Console.ReadLine());
        int ans = A - 2 * B;
        if (ans < 0)
        {
            ans = 0;
        }
        Console.WriteLine(ans);
    }
}

```
[/CS]

[VB]
```vb
Module Module1

    Sub Main()
        Dim A As Integer = CInt(Console.ReadLine())
        Dim B As Integer = CInt(Console.ReadLine())
        Dim ans As Integer = A - 2 * B
        If ans < 0 Then
            ans = 0
        End If
        Console.WriteLine(ans)
    End Sub

End Module

```
[/VB]

[KOT]
```kotlin
fun main(args: Array<String>) {
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()
    var ans = A - 2 * B
    if (ans < 0) {
        ans = 0
    }
    println(ans)
}

```
[/KOT]

[KSH]
```ksh
read A B
ans=$((A - 2 * B))
if [ $ans -lt 0 ]; then
    ans=0
fi
echo $ans

```
[/KSH]

[SC]
```scala
object Solution {
    def main(args: Array[String]) {
        val A = readLine().toInt
        val B = readLine().toInt
        var ans = A - 2 * B
        if (ans < 0) {
            ans = 0
        }
        println(ans)
    }
}

```
[/SC]

[F]
```fortran
program Problem
    implicit none
    integer :: A, B, ans
    read *, A, B
    ans = A - 2 * B
    if (ans < 0) then
        ans = 0
    end if
    write (*, *) ans
end program Problem

```
[/F]

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
 * Complete the 'solve' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER A
 *  2. INTEGER B
 */

function solve(A, B) {
    // Write your code here
    let ans = A - 2 * B;
    if (ans < 0) {
        ans = 0;
    }
    return ans;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const A = parseInt(readLine().trim(), 10);

    const B = parseInt(readLine().trim(), 10);

    const result = solve(A, B);

    ws.write(result + '\n');

    ws.end();
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
 * Complete the 'solve' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER A
 *  2. INTEGER B
 */

function solve(A: number, B: number): number {
    // Write your code here
    let ans = A - 2 * B;
    if (ans < 0) {
        ans = 0;
    }
    return ans;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const A = parseInt(readLine().trim(), 10);

    const B = parseInt(readLine().trim(), 10);

    const result = solve(A, B);

    ws.write(result + '\n');

    ws.end();
}

```
[/TS]

[MY]
```mysql
SELECT A - 2 * B AS ans
FROM (
    SELECT A, B
    FROM (
        SELECT CAST(SUBSTRING_INDEX(SUBSTRING_INDEX(@p, ' ', 1), ' ', -1) AS UNSIGNED) AS A,
               CAST(SUBSTRING_INDEX(SUBSTRING_INDEX(@p, ' ', 2), ' ', -1) AS UNSIGNED) AS B
        FROM (SELECT @p := '79 6') AS tmp
    ) AS t
) AS tt
HAVING ans >= 0;

```
[/MY]

[PG]
```pgsql
WITH t AS (
    SELECT CAST(SPLIT_PART($1, ' ', 1) AS INTEGER) AS A,
           CAST(SPLIT_PART($1, ' ', 2) AS INTEGER) AS B
)
SELECT A - 2 * B AS ans
FROM t
WHERE ans >= 0;

```
[/PG]

[SQL]
```sql
DECLARE @p VARCHAR(100) = '79 6'

SELECT A - 2 * B AS ans
FROM (
    SELECT CAST(PARSENAME(@p, 1) AS INT) AS A,
           CAST(PARSENAME(@p, 2) AS INT) AS B
) AS t
WHERE ans >= 0;

```
[/SQL]

[R]
```r
A <- as.integer(readline(prompt=""))
B <- as.integer(readline(prompt=""))
ans <- A - 2 * B
if (ans < 0) {
    ans <- 0
}
cat(ans, "\n")

```
[/R]

[VBSCRIPT]
```vbs
Dim A, B, ans
A = CInt(InputBox(""))
B = CInt(InputBox(""))
ans = A - 2 * B
If ans < 0 Then
    ans = 0
End If
WScript.StdOut.WriteLine ans

```
[/VBSCRIPT]

[POWERSHELL]
```powershell
$A = [int](Read-Host)
$B = [int](Read-Host)
$ans = $A - 2 * $B
if ($ans -lt 0) {
    $ans = 0
}
Write-Output $ans

```
[/POWERSHELL]

[AWK]
```awk
{
    A = $1
    B = $2
    ans = A - 2 * B
    if (ans < 0) {
        ans = 0
    }
    print ans
}

```
[/AWK]

[BASH]
```bash
read A B
ans=$((A - 2 * B))
if [ $ans -lt 0 ]; then
    ans=0
fi
echo $ans

```
[/BASH]

[LISP]
```lisp
(defun solve (A B)
  (let ((ans (- A (* 2 B))))
    (if (< ans 0)
        0
        ans)))

```
[/LISP]

[DART]
```dart
import 'dart:io';

void main() {
    var A = int.parse(stdin.readLineSync());
    var B = int.parse(stdin.readLineSync());
    var ans = A - 2 * B;
    if (ans < 0) {
        ans = 0;
    }
    print(ans);
}

```
[/DART]

[ELIXIR]
```elixir
defmodule Solution do
  def solve(A, B) do
    ans = A - 2 * B
    if ans < 0 do
      ans = 0
    end
    IO.puts ans
  end
end

```
[/ELIXIR]

[FORTRAN]
```fortran
program Problem
    implicit none
    integer :: A, B, ans
    read *, A, B
    ans = A - 2 * B
    if (ans < 0) then
        ans = 0
    end if
    write (*, *) ans
end program Problem

```
[/FORTRAN]

[HASKELL]
```haskell
main = do
    [A, B] <- map read . words <$> getLine
    let ans = A - 2 * B
    if ans < 0 then
        print 0
    else
        print ans

```
[/HASKELL]

[COFFEESCRIPT]
```coffeescript
[A, B] = (require 'fs').readFileSync('/dev/stdin', 'utf8').trim().split ' '
ans = A - 2 * B
if ans < 0
    ans = 0
console.log ans

```
[/COFFEESCRIPT]

[JULIA]
```julia
A, B = parse.(Int, split(readline()))
ans = A - 2 * B
if ans < 0
    ans = 0
end
println(ans)

```
[/JULIA]

[DYNAMIC]
```dynamic
using System;

class Solution
{
    static void Main(string[] args)
    {
        int A = int.Parse(Console.ReadLine());
        int B = int.Parse(Console.ReadLine());
        int ans = A - 2 * B;
        if (ans < 0)
        {
            ans = 0;
        }
        Console.WriteLine(ans);
    }
}

```
[/DYNAMIC]

[PERL]
```perl
use strict;
use warnings;

my $A = <STDIN>;
chomp $A;
my $B = <STDIN>;
chomp $B;
my $ans = $A - 2 * $B;
if ($ans < 0) {
    $ans = 0;
}
print "$ans\n";

```
[/PERL]
