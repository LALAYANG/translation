
[JAV]
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int a = stdin.nextInt();
        System.out.println(1);
    }
}
```
[/JAV]

[PYT]
```python
import sys

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def solve_test_case(tc):
    a = int(sys.stdin.readline().strip())
    print(1 if a == 0 else 0)
num_test_cases = 1
tc = 1
loop_counter_inner = 919
loop_bound_outer = 918
while loop_counter_inner % loop_bound_outer == 1:
    loop_counter_inner = loop_counter_inner + 1
    while tc <= num_test_cases:
        solve_test_case(tc)
        tc += 1
```
[/PYT]

[C++]
```cpp
#include <iostream>

using namespace std;

int main() {
    int a;
    cin >> a;
    cout << 1;
}
```
[/C++]

[C]
```c
#include <stdio.h>

int main() {
    int a;
    scanf("%d", &a);
    printf("%d", 1);
}
```
[/C]

[CPP]
```cpp
#include <iostream>

using namespace std;

int main() {
    int a;
    cin >> a;
    cout << 1;
}
```
[/CPP]

[C#]
```csharp
using System;

class MainClass {
  public static void Main (string[] args) {
    int a;
    a = Convert.ToInt32(Console.ReadLine());
    Console.WriteLine(1);
  }
}
```
[/C#]

[GO]
```go
package main

import (
    "fmt"
)

func main() {
    var a int
    fmt.Scan(&a)
    fmt.Println(1)
}
```
[/GO]

[JAVASCRIPT]
```javascript
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', function (line) {
    let a = parseInt(line);
    console.log(1);
});
```
[/JAVASCRIPT]

[PHP]
```php
<?php

$a = (int) fgets(STDIN);
echo 1;
```
[/PHP]

[RUBY]
```ruby
a = gets.to_i
puts 1
```
[/RUBY]

[PYTHON]
```python
a = int(input())
print(1)
```
[/PYTHON]

[R]
```r
a <- as.integer(readline(prompt=""))
print(1)
```
[/R]

[SCALA]
```scala
object Main extends App {
  val a = scala.io.StdIn.readInt()
  println(1)
}
```
[/SCALA]

[BASH]
```bash
read a
echo 1
```
[/BASH]

[JULIA]
```julia
a = parse(Int, readline())
println(1)
```
[/JULIA]

[KOTLIN]
```kotlin
import java.util.*

fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    println(1)
}
```
[/KOTLIN]

[ELIXIR]
```elixir
a = IO.gets("")
|> String.trim()
|> String.to_integer()
IO.puts(1)
```
[/ELIXIR]

[FORTRAN]
```fortran
program main
    implicit none
    integer :: a
    read *, a
    write (*, *) 1
end program main
```
[/FORTRAN]

[D]
```d
import std.stdio;

void main()
{
    int a;
    read(a);
    writeln(1);
}
```
[/D]

[PASCAL]
```pascal
program main;
var
    a: integer;
begin
    readln(a);
    writeln(1);
end.
```
[/PASCAL]

[OBJECTIVE-C]
```objectivec
#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int a;
        scanf("%d", &a);
        printf("%d", 1);
    }
    return 0;
}
```
[/OBJECTIVE-C]

[PERL]
```perl
use strict;
use warnings;

my $a = <STDIN>;
print 1;
```
[/PERL]

[VB]
```vb
Module Module1

    Sub Main()
        Dim a As Integer
        a = Console.ReadLine()
        Console.WriteLine(1)
    End Sub

End Module
```
[/VB]

[VBSCRIPT]
```vbscript
a = WScript.StdIn.ReadLine()
WScript.StdOut.WriteLine 1
```
[/VBSCRIPT]

[LUA]
```lua
io.write(1)
```
[/LUA]

[BASH]
```bash
read a
echo 1
```
[/BASH]

[AWK]
```awk
{
    print 1
}
```
[/AWK]

[J]
```j
read a
print 1
```
[/J]

[COFFEESCRIPT]
```coffeescript
a = parseInt readline()
console.log 1
```
[/COFFEESCRIPT]

[DART]
```dart
import 'dart:io';

void main() {
    int a = int.parse(stdin.readLineSync());
    print(1);
}
```
[/DART]

[ELIXIR]
```elixir
a = IO.gets("")
|> String.trim()
|> String.to_integer()
IO.puts(1)
```
[/ELIXIR]

[FORTRAN]
```fortran
program main
    implicit none
    integer :: a
    read *, a
    write (*, *) 1
end program main
```
[/FORTRAN]

[GROOVY]
```groovy
def a = Integer.parseInt(System.console().readLine())
println 1
```
[/GROOVY]

[HASKELL]
```haskell
main = do
    a <- readLn
    print 1
```
[/HASKELL]

[JULIA]
```julia
a = parse(Int, readline())
println(1)
```
[/JULIA]

[LUA]
```lua
io.write(1)
```
[/LUA]

[PERL]
```perl
use strict;
use warnings;

my $a = <STDIN>;
print 1;
```
[/PERL]

[PHP]
```php
<?php

$a = (int) fgets(STDIN);
echo 1;
```
[/PHP]

[PYTHON]
```python
a = int(input())
print(1)
```
[/PYTHON]

[R]
```r
a <- as.integer(readline(prompt=""))
print(1)
```
[/R]

[RUBY]
```ruby
a = gets.to_i
puts 1
```
[/RUBY]

[RUST]
```rust
use std::io;

fn main() {
    let mut a = String::new();
    io::stdin().read_line(&mut a).expect("Failed to read line");
    println!("1");
}
```
[/RUST]

[SCALA]
```scala
object Main extends App {
  val a = scala.io.StdIn.readInt()
  println(1)
}
```
[/SCALA]

[SWIFT]
```swift
import Foundation

let a = Int(readLine()!)!
print(1)
```
[/SWIFT]

[TYPESCRIPT]
```typescript
let a = parseInt(readline());
console.log(1);
```
[/TYPESCRIPT]

[VISUAL-BASIC]
```vb
Module Module1

    Sub Main()
        Dim a As Integer
        a = Console.ReadLine()
        Console.WriteLine(1)
    End Sub

End Module
```
[/VISUAL-BASIC]

[POWERSHELL]
```powershell
$a = [int](Read-Host)
Write-Output 1
```
[/POWERSHELL]

[BASH]
```bash
read a
echo 1
```
[/BASH]

[AWK]
```awk
{
    print 1
}
```
[/AWK]

[J]
```j
read a
print 1
```
[/J]

[COFFEESCRIPT]
```coffeescript
a = parseInt readline()
console.log 1
```
[/COFFEESCRIPT]

[DART]
```dart
import 'dart:io';

void main() {
    int a = int.parse(stdin.readLineSync());
    print(1);
}
```
[/DART]

[ELIXIR]
```elixir
a = IO.gets("")
|> String.trim()
|> String.to_integer()
IO.puts(1)
```
[/ELIXIR]

[FORTRAN]
```fortran
program main
    implicit none
    integer :: a
    read *, a
    write (*, *) 1
end program main
```
[/FORTRAN]

[GROOVY]
```groovy
def a = Integer.parseInt(System.console().readLine())
println 1
```
[/GROOVY]

[HASKELL]
```haskell
main = do
    a <- readLn
    print 1
```
[/HASKELL]

[JULIA]
```julia
a = parse(Int, readline())
println(1)
```
[/JULIA]

[LUA]
```lua
io.write(1)
```
[/LUA]

[PERL]
```perl
use strict;
use warnings;

my $a = <STDIN>;
print 1;
```
[/PERL]

[PHP]
```php
<?php

$a = (int) fgets(STDIN);
echo 1;
```
[/PHP]

[PYTHON]
```python
a = int(input())
print(1)
```
[/PYTHON]

[R]
```r
a <- as.integer(readline(prompt=""))
print(1)
```
[/R]

[RUBY]
```ruby
a = gets.to_i
puts 1
```
[/RUBY]

[RUST]
```rust
use std::io;

fn main() {
    let mut a = String::new();
    io::stdin().read_line(&mut a).expect("Failed to read line");
    println!("1");
}
```
[/RUST]

[SCALA]
```scala
object Main extends App {
  val a = scala.io.StdIn.readInt()
  println(1)
}
```
[/SCALA]

[SWIFT]
```swift
import Foundation

let a = Int(readLine()!)!
print(1)
```
[/SWIFT]

[TYPESCRIPT]
```typescript
let a = parseInt(readline());
console.log(1);
```
[/TYPESCRIPT]

[VISUAL-BASIC]
```vb
Module Module1

    Sub Main()
        Dim a As Integer
        a = Console.ReadLine()
        Console.WriteLine(1)
    End Sub

End Module
```
[/VISUAL-BASIC]

[POWERSHELL]
```powershell
$a = [int](Read-Host)
Write-Output 1
```
[/POWERSHELL]

[BASH]
```bash
read a
echo 1
```
[/BASH]

[AWK]
```awk
{
    print 1
}
```
[/AWK]

[J]
```j
read a
print 1
```
[/J]

[COFFEESCRIPT]
```coffeescript
a = parseInt readline()
console.log 1
```
[/COFFEESCRIPT]

[DART]
```dart
import 'dart:io';

void main() {
    int a = int.parse(stdin.readLineSync());
    print(1);
}
```
[/DART]

[ELIXIR]
```elixir
a = IO.gets("")
|> String.trim()
|> String.to_integer()
IO.puts(1)
```
[/ELIXIR]

[FORTRAN]
```fortran
program main
    implicit none
    integer :: a
    read *, a
    write (*, *) 1
end program main
```
[/FORTRAN]

[GROOVY]
```groovy
def a = Integer.parseInt(System.console().readLine())
println 1
```
[/GROOVY]

[HASKELL]
```haskell
main = do
    a <- readLn
    print 1
```
[/HASKELL]

[JULIA]
```julia
a = parse(Int, readline())
println(1)
```
[/JULIA]

[LUA]
```lua
io.write(1)
```
[/LUA]

[PERL]
```perl
use strict;
use warnings;

my $a = <STDIN>;
print 1;
```
[/PERL]

[PHP]
```php
<?php

$a = (int) fgets(STDIN);
echo 1;
```
[/PHP]

[PYTHON]
```python
a = int(input())
print(1)
```
[/
