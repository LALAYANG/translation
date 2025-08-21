
[JAV]
```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 1;
        while (m >= i) {
            m -= i;
            i = (i % n) + 1;
        }
        System.out.println(m);
    }
}

```
[/JAV]

[PYT]
```py

n, m = map(int, input().split())
i = 1
while m >= i:
    m -= i
    i = (i % n) + 1
print(m)

```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    int i = 1;
    while (m >= i) {
        m -= i;
        i = (i % n) + 1;
    }
    cout << m << endl;
}

```
[/CPP]

[C]
```c

#include <stdio.h>

int main() {
    int n, m;
    scanf("%d %d", &n, &m);
    int i = 1;
    while (m >= i) {
        m -= i;
        i = (i % n) + 1;
    }
    printf("%d\n", m);
}

```
[/C]

[MAT]

```matlab

n = input('Enter n: ');
m = input('Enter m: ');
i = 1;
while m >= i
    m = m - i;
    i = (i % n) + 1;
end
disp(m)

```
[/MAT]

[RUB]
```ruby

n, m = gets.split.map(&:to_i)
i = 1
while m >= i
    m -= i
    i = (i % n) + 1
end
puts m

```
[/RUB]

[PHP]
```php

<?php
$n = (int)trim(fgets(STDIN));
$m = (int)trim(fgets(STDIN));
$i = 1;
while ($m >= $i) {
    $m -= $i;
    $i = ($i % $n) + 1;
}
echo $m;

```
[/PHP]

[GO]
```go

package main

import (
    "fmt"
)

func main() {
    var n, m int
    fmt.Scan(&n, &m)
    i := 1
    for m >= i {
        m -= i
        i = (i % n) + 1
    }
    fmt.Println(m)
}

```
[/GO]

[PAS]
```pascal

program Problem;
var
  n, m, i: integer;
begin
  readln(n, m);
  i := 1;
  while m >= i do
  begin
    m := m - i;
    i := (i mod n) + 1;
  end;
  writeln(m);
end.

```
[/PAS]

[BASH]
```bash

read -p "Enter n: " n
read -p "Enter m: " m
i=1
while [ $m -ge $i ]
do
  m=$((m-i))
  i=$(((i%n)+1))
done
echo $m

```
[/BASH]

[PL]
```perl

use strict;
use warnings;

my $n = <STDIN>;
chomp $n;
my $m = <STDIN>;
chomp $m;
my $i = 1;
while ($m >= $i) {
    $m -= $i;
    $i = ($i % $n) + 1;
}
print "$m\n";

```
[/PL]

[JULIA]
```julia

n, m = parse.(Int, split(readline()))
i = 1
while m >= i
    global m
    m -= i
    i = (i % n) + 1
end
println(m)

```
[/JULIA]

[KOTLIN]
```kotlin

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    var i = 1
    while (m >= i) {
        m -= i
        i = (i % n) + 1
    }
    println(m)
}

```
[/KOTLIN]

[R]
```r

n <- as.integer(readline(prompt="Enter n: "))
m <- as.integer(readline(prompt="Enter m: "))
i <- 1
while (m >= i) {
    m <- m - i
    i <- (i %% n) + 1
}
print(m)

```
[/R]

[COFFEE]
```coffeescript

[stdin, stdout] = [process.stdin, process.stdout]
stdin.resume()
stdin.setEncoding 'ascii'
stdin.on 'data', (data) ->
  [n, m] = data.toString().split ' '
  n = parseInt n
  m = parseInt m
  i = 1
  while m >= i
    m -= i
    i = (i % n) + 1
  console.log m

```
[/COFFEE]

[VB]
```vb

Module Module1

    Sub Main()
        Dim n As Integer = CInt(Console.ReadLine())
        Dim m As Integer = CInt(Console.ReadLine())
        Dim i As Integer = 1
        While m >= i
            m -= i
            i = (i Mod n) + 1
        End While
        Console.WriteLine(m)
    End Sub

End Module

```
[/VB]

[SCALA]
```scala

object Solution {
    def main(args: Array[String]) {
        val Array(n, m) = readLine().split(" ").map(_.toInt)
        var i = 1
        while (m >= i) {
            m -= i
            i = (i % n) + 1
        }
        println(m)
    }
}

```
[/SCALA]

[JS]
```js

'use strict';
process.stdin.resume();
process.stdin.setEncoding('ascii');
let input_stdin = "";
process.stdin.on('data', function (data) {
    input_stdin += data;
});
process.stdin.on('end', function () {
    let input = input_stdin.split('\n');
    let n = parseInt(input[0], 10);
    let m = parseInt(input[1], 10);
    let i = 1;
    while (m >= i) {
        m -= i;
        i = (i % n) + 1;
    }
    console.log(m);
});

```
[/JS]

[TS]
```ts

'use strict';
process.stdin.resume();
process.stdin.setEncoding('ascii');
let input_stdin = "";
process.stdin.on('data', function (data) {
    input_stdin += data;
});
process.stdin.on('end', function () {
    let input = input_stdin.split('\n');
    let n = parseInt(input[0], 10);
    let m = parseInt(input[1], 10);
    let i = 1;
    while (m >= i) {
        m -= i;
        i = (i % n) + 1;
    }
    console.log(m);
});

```
[/TS]

[CSHARP]
```cs

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {
    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        int m = Convert.ToInt32(Console.ReadLine());
        int i = 1;
        while (m >= i) {
            m -= i;
            i = (i % n) + 1;
        }
        Console.WriteLine(m);
    }
}

```
[/CSHARP]

[BASH]
```bash

read -p "Enter n: " n
read -p "Enter m: " m
i=1
while [ $m -ge $i ]
do
  m=$((m-i))
  i=$(((i%n)+1))
done
echo $m

```
[/BASH]

[PYTHON]
```python

n, m = map(int, input().split())
i = 1
while m >= i:
    m -= i
    i = (i % n) + 1
print(m)

```
[/PYTHON]

[RUBY]
```ruby

n, m = gets.split.map(&:to_i)
i = 1
while m >= i
    m -= i
    i = (i % n) + 1
end
puts m

```
[/RUBY]

[PERL]
```perl

use strict;
use warnings;

my $n = <STDIN>;
chomp $n;
my $m = <STDIN>;
chomp $m;
my $i = 1;
while ($m >= $i) {
    $m -= $i;
    $i = ($i % $n) + 1;
}
print "$m\n";

```
[/PERL]

[PHP]
```php

<?php
$n = (int)trim(fgets(STDIN));
$m = (int)trim(fgets(STDIN));
$i = 1;
while ($m >= $i) {
    $m -= $i;
    $i = ($i % $n) + 1;
}
echo $m;

```
[/PHP]

[GO]
```go

package main

import (
    "fmt"
)

func main() {
    var n, m int
    fmt.Scan(&n, &m)
    i := 1
    for m >= i {
        m -= i
        i = (i % n) + 1
    }
    fmt.Println(m)
}

```
[/GO]

[PASCAL]
```pascal

program Problem;
var
  n, m, i: integer;
begin
  readln(n, m);
  i := 1;
  while m >= i do
  begin
    m := m - i;
    i := (i mod n) + 1;
  end;
  writeln(m);
end.

```
[/PASCAL]

[JULIA]
```julia

n, m = parse.(Int, split(readline()))
i = 1
while m >= i
    global m
    m -= i
    i = (i % n) + 1
end
println(m)

```
[/JULIA]

[COFFEE]
```coffeescript

[stdin, stdout] = [process.stdin, process.stdout]
stdin.resume()
stdin.setEncoding 'ascii'
stdin.on 'data', (data) ->
  [n, m] = data.toString().split ' '
  n = parseInt n
  m = parseInt m
  i = 1
  while m >= i
    m -= i
    i = (i % n) + 1
  console.log m

```
[/COFFEE]

[VB]
```vb

Module Module1

    Sub Main()
        Dim n As Integer = CInt(Console.ReadLine())
        Dim m As Integer = CInt(Console.ReadLine())
        Dim i As Integer = 1
        While m >= i
            m -= i
            i = (i Mod n) + 1
        End While
        Console.WriteLine(m)
    End Sub

End Module

```
[/VB]

[SCALA]
```scala

object Solution {
    def main(args: Array[String]) {
        val Array(n, m) = readLine().split(" ").map(_.toInt)
        var i = 1
        while (m >= i) {
            m -= i
            i = (i % n) + 1
        }
        println(m)
    }
}

```
[/SCALA]

[JS]
```js

'use strict';
process.stdin.resume();
process.stdin.setEncoding('ascii');
let input_stdin = "";
process.stdin.on('data', function (data) {
    input_stdin += data;
});
process.stdin.on('end', function () {
    let input = input_stdin.split('\n');
    let n = parseInt(input[0], 10);
    let m = parseInt(input[1], 10);
    let i = 1;
    while (m >= i) {
        m -= i;
        i = (i % n) + 1;
    }
    console.log(m);
});

```
[/JS]

[TS]
```ts

'use strict';
process.stdin.resume();
process.stdin.setEncoding('ascii');
let input_stdin = "";
process.stdin.on('data', function (data) {
    input_stdin += data;
});
process.stdin.on('end', function () {
    let input = input_stdin.split('\n');
    let n = parseInt(input[0], 10);
    let m = parseInt(input[1], 10);
    let i = 1;
    while (m >= i) {
        m -= i;
        i = (i % n) + 1;
    }
    console.log(m);
});

```
[/TS]

[CSHARP]
```cs

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {
    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        int m = Convert.ToInt32(Console.ReadLine());
        int i = 1;
        while (m >= i) {
            m -= i;
            i = (i % n) + 1;
        }
        Console.WriteLine(m);
    }
}

```
[/CSHARP]

[BASH]
```bash

read -p "Enter n: " n
read -p "Enter m: " m
i=1
while [ $m -ge $i ]
do
  m=$((m-i))
  i=$(((i%n)+1))
done
echo $m

```
[/BASH]

[PYTHON]
```python

n, m = map(int, input().split())
i = 1
while m >= i:
    m -= i
    i = (i % n) + 1
print(m)

```
[/PYTHON]

[RUBY]
```ruby

n, m = gets.split.map(&:to_i)
i = 1
while m >= i
    m -= i
    i = (i % n) + 1
end
puts m
