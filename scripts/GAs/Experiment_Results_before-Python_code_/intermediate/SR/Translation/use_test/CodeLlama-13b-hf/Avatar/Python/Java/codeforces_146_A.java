
[JAV]
```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        int h1 = 0;
        int h2 = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
            if (number[i] != 4 && number[i] != 7) {
                System.out.println("NO");
                x += 1;
                break;
            }
            if (i < n / 2) {
                h1 += number[i];
            } else {
                h2 += number[i];
            }
        }
        if (x == 0) {
            if (h1 == h2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

```
[/JAV]

[PY]
```python

n = int(input())
number = list(map(int, list(input())))
h1 = 0
h2 = 0
x = 0
for i in range(n):
    if number[i] != 4 and number[i] != 7:
        print("NO")
        x += 1
        break
    if i < n // 2:
        h1 += number[i]
    else:
        h2 += number[i]
if not x:
    if h1 == h2:
        print("YES")
    else:
        print("NO")


```
[/PY]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    int number[n];
    int h1 = 0;
    int h2 = 0;
    int x = 0;
    for (int i = 0; i < n; i++) {
        cin >> number[i];
        if (number[i] != 4 && number[i] != 7) {
            cout << "NO" << endl;
            x += 1;
            break;
        }
        if (i < n / 2) {
            h1 += number[i];
        } else {
            h2 += number[i];
        }
    }
    if (x == 0) {
        if (h1 == h2) {
            cout << "YES" << endl;
        } else {
            cout << "NO" << endl;
        }
    }
}

```
[/CPP]

[C]
```c

#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    int number[n];
    int h1 = 0;
    int h2 = 0;
    int x = 0;
    for (int i = 0; i < n; i++) {
        scanf("%d", &number[i]);
        if (number[i] != 4 && number[i] != 7) {
            printf("NO\n");
            x += 1;
            break;
        }
        if (i < n / 2) {
            h1 += number[i];
        } else {
            h2 += number[i];
        }
    }
    if (x == 0) {
        if (h1 == h2) {
            printf("YES\n");
        } else {
            printf("NO\n");
        }
    }
}

```
[/C]

[PHP]
```php

<?php

$n = (int)trim(fgets(STDIN));
$number = array();
$h1 = 0;
$h2 = 0;
$x = 0;
for ($i = 0; $i < $n; $i++) {
    $number[$i] = (int)trim(fgets(STDIN));
    if ($number[$i] != 4 && $number[$i] != 7) {
        echo "NO" . PHP_EOL;
        $x += 1;
        break;
    }
    if ($i < $n / 2) {
        $h1 += $number[$i];
    } else {
        $h2 += $number[$i];
    }
}
if ($x == 0) {
    if ($h1 == $h2) {
        echo "YES" . PHP_EOL;
    } else {
        echo "NO" . PHP_EOL;
    }
}

```
[/PHP]

[RUBY]
```ruby

n = gets.to_i
number = Array.new(n)
h1 = 0
h2 = 0
x = 0
for i in 0..n-1
    number[i] = gets.to_i
    if number[i] != 4 && number[i] != 7
        puts "NO"
        x += 1
        break
    end
    if i < n / 2
        h1 += number[i]
    else
        h2 += number[i]
    end
end
if x == 0
    if h1 == h2
        puts "YES"
    else
        puts "NO"
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
    number := make([]int, n)
    h1 := 0
    h2 := 0
    x := 0
    for i := 0; i < n; i++ {
        fmt.Scan(&number[i])
        if number[i] != 4 && number[i] != 7 {
            fmt.Println("NO")
            x += 1
            break
        }
        if i < n / 2 {
            h1 += number[i]
        } else {
            h2 += number[i]
        }
    }
    if x == 0 {
        if h1 == h2 {
            fmt.Println("YES")
        } else {
            fmt.Println("NO")
        }
    }
}

```
[/GO]

[BASH]
```bash

read n
number=()
h1=0
h2=0
x=0
for ((i=0; i<n; i++))
do
    read -a number[$i]
    if [ ${number[$i]} != 4 ] && [ ${number[$i]} != 7 ]
    then
        echo "NO"
        x=$((x+1))
        break
    fi
    if [ $i -lt $n/2 ]
    then
        h1=$((h1+${number[$i]}))
    else
        h2=$((h2+${number[$i]}))
    fi
done
if [ $x -eq 0 ]
then
    if [ $h1 -eq $h2 ]
    then
        echo "YES"
    else
        echo "NO"
    fi
fi

```
[/BASH]

[PERL]
```perl

use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my @number = ();
my $h1 = 0;
my $h2 = 0;
my $x = 0;
for (my $i = 0; $i < $n; $i++) {
    $number[$i] = <STDIN>;
    chomp($number[$i]);
    if ($number[$i] != 4 && $number[$i] != 7) {
        print "NO\n";
        $x += 1;
        last;
    }
    if ($i < $n / 2) {
        $h1 += $number[$i];
    } else {
        $h2 += $number[$i];
    }
}
if ($x == 0) {
    if ($h1 == $h2) {
        print "YES\n";
    } else {
        print "NO\n";
    }
}

```
[/PERL]

[ELIXIR]
```elixir

n = IO.gets("") |> String.trim |> String.to_integer
number = IO.gets("") |> String.trim |> String.split |> Enum.map(&String.to_integer/1)
h1 = 0
h2 = 0
x = 0
for i <- 0..n-1 do
    if Enum.at(number, i) != 4 && Enum.at(number, i) != 7 do
        IO.puts("NO")
        x = x + 1
        break
    end
    if i < n / 2 do
        h1 = h1 + Enum.at(number, i)
    else
        h2 = h2 + Enum.at(number, i)
    end
end
if x == 0 do
    if h1 == h2 do
        IO.puts("YES")
    else
        IO.puts("NO")
    end
end

```
[/ELIXIR]

[JULIA]
```julia

n = parse(Int, readline())
number = parse.(Int, split(readline()))
h1 = 0
h2 = 0
x = 0
for i in 1:n
    if number[i] != 4 && number[i] != 7
        println("NO")
        x += 1
        break
    end
    if i < n / 2
        h1 += number[i]
    else
        h2 += number[i]
    end
end
if x == 0
    if h1 == h2
        println("YES")
    else
        println("NO")
    end
end

```
[/JULIA]

[LUA]
```lua

n = io.read("*n")
number = {}
h1 = 0
h2 = 0
x = 0
for i = 1, n do
    number[i] = io.read("*n")
    if number[i] ~= 4 and number[i] ~= 7 then
        print("NO")
        x = x + 1
        break
    end
    if i < n / 2 then
        h1 = h1 + number[i]
    else
        h2 = h2 + number[i]
    end
end
if x == 0 then
    if h1 == h2 then
        print("YES")
    else
        print("NO")
    end
end

```
[/LUA]

[D]
```d

import std.stdio;

void main()
{
    int n;
    writeln("Enter n: ");
    read(n);
    int[] number;
    int h1 = 0;
    int h2 = 0;
    int x = 0;
    for (int i = 0; i < n; i++)
    {
        writeln("Enter number: ");
        read(number[i]);
        if (number[i] != 4 && number[i] != 7)
        {
            writeln("NO");
            x += 1;
            break;
        }
        if (i < n / 2)
        {
            h1 += number[i];
        }
        else
        {
            h2 += number[i];
        }
    }
    if (x == 0)
    {
        if (h1 == h2)
        {
            writeln("YES");
        }
        else
        {
            writeln("NO");
        }
    }
}

```
[/D]

[R]
```r

n <- as.integer(readline(prompt = "Enter n: "))
number <- as.integer(readline(prompt = "Enter number: "))
h1 <- 0
h2 <- 0
x <- 0
for (i in 1:n) {
    if (number[i] != 4 && number[i] != 7) {
        print("NO")
        x <- x + 1
        break
    }
    if (i < n / 2) {
        h1 <- h1 + number[i]
    } else {
        h2 <- h2 + number[i]
    }
}
if (x == 0) {
    if (h1 == h2) {
        print("YES")
    } else {
        print("NO")
    }
}

```
[/R]

[JAVASCRIPT]
```javascript

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
    const number = readline().split(' ').map(Number);
    let h1 = 0;
    let h2 = 0;
    let x = 0;
    for (let i = 0; i < n; i++) {
        if (number[i] !== 4 && number[i] !== 7) {
            console.log('NO');
            x += 1;
            break;
        }
        if (i < n / 2) {
            h1 += number[i];
        } else {
            h2 += number[i];
        }
    }
    if (x === 0) {
        if (h1 === h2) {
            console.log('YES');
        } else {
            console.log('NO');
        }
    }
}

```
[/JAVASCRIPT]

[SWIFT]
```swift

import Foundation

var n = Int(readLine()!)!
var number = readLine()!.split(separator: " ").map{Int(String($0))!}
var h1 = 0
var h2 = 0
var x = 0
for i in 0..<n {
    if number[i] != 4 && number[i] != 7 {
        print("NO")
        x += 1
        break
    }
    if i < n / 2 {
        h1 += number[i]
    } else {
        h2 += number[i]
    }
}
if x == 0 {
    if h1 == h2 {
        print("YES")
    } else {
        print("NO")
    }
}

```
[/SWIFT]

[PASCAL]
```pascal

program hw;
var n, i, h1, h2, x: integer;
var number: array[1..100] of integer;
begin
    readln(n);
    for i := 1 to n do
    begin
        readln(number[i]);
        if (number[i] <> 4) and (number[i
