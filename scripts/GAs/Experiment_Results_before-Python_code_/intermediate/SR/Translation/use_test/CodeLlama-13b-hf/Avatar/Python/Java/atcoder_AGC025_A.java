
[JAV]
```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = {10, 100, 1000, 10000, 100000};
        int new_ = 0;
        for (int i = 0; i < n.length(); i++) {
            new_ += Integer.parseInt(n.charAt(i));
        }
        if (a.contains(n)) {
            System.out.println(10);
        } else {
            System.out.println(new_);
        }
    }
}

```
[/JAV]

[PYT]
```python

n = input()
a = [10, 100, 1000, 10000, 100000]
new = 0
for i in n:
    new += int(i)
if n in a:
    print(10)
else:
    print(new)


```
[/PYT]

[CPP]
```cpp

#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main() {
    string n;
    cin >> n;
    vector<int> a = {10, 100, 1000, 10000, 100000};
    int new_ = 0;
    for (int i = 0; i < n.length(); i++) {
        new_ += n[i] - '0';
    }
    if (a.contains(n)) {
        cout << 10;
    } else {
        cout << new_;
    }
}

```
[/CPP]

[C]
```c

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
    char n[100];
    scanf("%s", n);
    int a[] = {10, 100, 1000, 10000, 100000};
    int new_ = 0;
    for (int i = 0; i < strlen(n); i++) {
        new_ += n[i] - '0';
    }
    if (a.contains(n)) {
        printf("%d", 10);
    } else {
        printf("%d", new_);
    }
}

```
[/C]

[PHP]
```php

<?php
$n = readline();
$a = [10, 100, 1000, 10000, 100000];
$new = 0;
for ($i = 0; $i < strlen($n); $i++) {
    $new += $n[$i];
}
if (in_array($n, $a)) {
    echo 10;
} else {
    echo $new;
}


```
[/PHP]

[RUBY]
```ruby

n = gets.chomp
a = [10, 100, 1000, 10000, 100000]
new = 0
for i in 0..n.length - 1
    new += n[i].to_i
end
if a.include?(n)
    puts 10
else
    puts new
end


```
[/RUBY]

[GO]
```go

package main

import (
    "fmt"
    "strconv"
)

func main() {
    var n string
    fmt.Scan(&n)
    a := []int{10, 100, 1000, 10000, 100000}
    new := 0
    for i := 0; i < len(n); i++ {
        new += int(n[i] - '0')
    }
    if contains(a, n) {
        fmt.Println(10)
    } else {
        fmt.Println(new)
    }
}

func contains(s []int, e int) bool {
    for _, a := range s {
        if a == e {
            return true
        }
    }
    return false
}

```
[/GO]

[BASH]
```bash

read n
a=(10 100 1000 10000 100000)
new=0
for ((i=0; i<${#n}; i++)); do
    new=$((new + ${n:$i:1}))
done
if [[ " ${a[@]} " =~ " ${n} " ]]; then
    echo 10
else
    echo $new
fi


```
[/BASH]

[PERL]
```perl

use strict;
use warnings;

my $n = <STDIN>;
chomp $n;
my @a = (10, 100, 1000, 10000, 100000);
my $new = 0;
for (my $i = 0; $i < length($n); $i++) {
    $new += substr($n, $i, 1);
}
if (grep { $_ eq $n } @a) {
    print 10;
} else {
    print $new;
}


```
[/PERL]

[ELIXIR]
```elixir

n = IO.gets("")
a = [10, 100, 1000, 10000, 100000]
new = 0
for i <- 0..String.length(n) - 1 do
    new = new + String.at(n, i)
end
if Enum.member?(a, n) do
    IO.puts(10)
else
    IO.puts(new)
end


```
[/ELIXIR]

[SWIFT]
```swift

import Foundation

let n = readLine()!
let a = [10, 100, 1000, 10000, 100000]
var new = 0
for i in 0..<n.count {
    new += Int(String(n[i]))!
}
if a.contains(n) {
    print(10)
} else {
    print(new)
}


```
[/SWIFT]

[JULIA]
```julia

n = readline()
a = [10, 100, 1000, 10000, 100000]
new = 0
for i in 1:length(n)
    new += parse(Int, n[i])
end
if n in a
    print(10)
else
    print(new)
end


```
[/JULIA]

[COFFEE]
```coffee

n = readline()
a = [10, 100, 1000, 10000, 100000]
new = 0
for i in [0..n.length]
    new += parseInt(n[i])
if n in a
    console.log(10)
else
    console.log(new)


```
[/COFFEE]

[PASCAL]
```pascal

program sum;
var
  n: string;
  a: array[1..5] of integer;
  new: integer;
  i: integer;
begin
  readln(n);
  a[1] := 10;
  a[2] := 100;
  a[3] := 1000;
  a[4] := 10000;
  a[5] := 100000;
  new := 0;
  for i := 1 to length(n) do
    new := new + ord(n[i]) - ord('0');
  if n in a then
    writeln(10)
  else
    writeln(new);
end.


```
[/PASCAL]

[RUST]
```rust

use std::io;

fn main() {
    let mut n = String::new();
    io::stdin().read_line(&mut n).unwrap();
    let a = [10, 100, 1000, 10000, 100000];
    let mut new = 0;
    for i in 0..n.len() {
        new += n.chars().nth(i).unwrap().to_digit(10).unwrap();
    }
    if a.contains(&n.parse::<i32>().unwrap()) {
        println!("10");
    } else {
        println!("{}", new);
    }
}

```
[/RUST]

[SCALA]
```scala

object Main {
    def main(args: Array[String]) {
        val n = scala.io.StdIn.readLine()
        val a = Array(10, 100, 1000, 10000, 100000)
        var new = 0
        for (i <- 0 until n.length) {
            new += n(i).asDigit
        }
        if (a.contains(n.toInt)) {
            println(10)
        } else {
            println(new)
        }
    }
}

```
[/SCALA]

[BASH]
```bash

read n
a=(10 100 1000 10000 100000)
new=0
for ((i=0; i<${#n}; i++)); do
    new=$((new + ${n:$i:1}))
done
if [[ " ${a[@]} " =~ " ${n} " ]]; then
    echo 10
else
    echo $new
fi


```
[/BASH]

[JULIA]
```julia

n = readline()
a = [10, 100, 1000, 10000, 100000]
new = 0
for i in 1:length(n)
    new += parse(Int, n[i])
if n in a
    print(10)
else
    print(new)
end


```
[/JULIA]

[COFFEE]
```coffee

n = readline()
a = [10, 100, 1000, 10000, 100000]
new = 0
for i in [0..n.length]
    new += parseInt(n[i])
if n in a
    console.log(10)
else
    console.log(new)


```
[/COFFEE]

[PASCAL]
```pascal

program sum;
var
  n: string;
  a: array[1..5] of integer;
  new: integer;
  i: integer;
begin
  readln(n);
  a[1] := 10;
  a[2] := 100;
  a[3] := 1000;
  a[4] := 10000;
  a[5] := 100000;
  new := 0;
  for i := 1 to length(n) do
    new := new + ord(n[i]) - ord('0');
  if n in a then
    writeln(10)
  else
    writeln(new);
end.


```
[/PASCAL]

[RUST]
```rust

use std::io;

fn main() {
    let mut n = String::new();
    io::stdin().read_line(&mut n).unwrap();
    let a = [10, 100, 1000, 10000, 100000];
    let mut new = 0;
    for i in 0..n.len() {
        new += n.chars().nth(i).unwrap().to_digit(10).unwrap();
    }
    if a.contains(&n.parse::<i32>().unwrap()) {
        println!("10");
    } else {
        println!("{}", new);
    }
}

```
[/RUST]

[SCALA]
```scala

object Main {
    def main(args: Array[String]) {
        val n = scala.io.StdIn.readLine()
        val a = Array(10, 100, 1000, 10000, 100000)
        var new = 0
        for (i <- 0 until n.length) {
            new += n(i).asDigit
        }
        if (a.contains(n.toInt)) {
            println(10)
        } else {
            println(new)
        }
    }
}

```
[/SCALA]

[BASH]
```bash

read n
a=(10 100 1000 10000 100000)
new=0
for ((i=0; i<${#n}; i++)); do
    new=$((new + ${n:$i:1}))
done
if [[ " ${a[@]} " =~ " ${n} " ]]; then
    echo 10
else
    echo $new
fi


```
[/BASH]

[JULIA]
```julia

n = readline()
a = [10, 100, 1000, 10000, 100000]
new = 0
for i in 1:length(n)
    new += parse(Int, n[i])
if n in a
    print(10)
else
    print(new)
end


```
[/JULIA]

[COFFEE]
```coffee

n = readline()
a = [10, 100, 1000, 10000, 100000]
new = 0
for i in [0..n.length]
    new += parseInt(n[i])
if n in a
    console.log(10)
else
    console.log(new)


```
[/COFFEE]

[PASCAL]
```pascal

program sum;
var
  n: string;
  a: array[1..5] of integer;
  new: integer;
  i: integer;
begin
  readln(n);
  a[1] := 10;
  a[2] := 100;
  a[3] := 1000;
  a[4] := 10000;
  a[5] := 100000;
  new := 0;
  for i := 1 to length(n) do
    new := new + ord(n[i]) - ord('0');
  if n in a then
    writeln(10)
  else
    writeln(new);
end.


```
[/PASCAL]

[RUST]
```rust

use std::io;

fn main() {
    let mut n = String
