
[JAV]
```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = input.replace(",", " ");
        System.out.println(output);
    }
}

```
[/JAV]

[PYT]
```python

input_string = input()
output_string = input_string.replace(",", " ")
print(output_string)

```
[/PYT]

[CPP]
```cpp

#include <iostream>
#include <string>

int main() {
    std::string input;
    std::getline(std::cin, input);
    std::string output = input.replace(input.find(","), 1, " ");
    std::cout << output << std::endl;
}

```
[/CPP]

[C]
```c

#include <stdio.h>
#include <string.h>

int main() {
    char input[100];
    scanf("%s", input);
    char *output = strtok(input, ",");
    printf("%s", output);
}

```
[/C]

[MAT]
```matlab

input = input('');
output = strrep(input, ',', ' ');
disp(output);

```
[/MAT]

[RUB]
```ruby

input = gets.chomp
output = input.gsub(',', ' ')
puts output

```
[/RUB]

[GO]
```go

package main

import (
    "fmt"
    "strings"
)

func main() {
    var input string
    fmt.Scan(&input)
    output := strings.Replace(input, ",", " ", -1)
    fmt.Println(output)
}

```
[/GO]

[PAS]
```pascal

program Problem;

var
  input, output: string;

begin
  readln(input);
  output := StringReplace(input, ',', ' ', [rfReplaceAll]);
  writeln(output);
end.

```
[/PAS]

[PHP]
```php

<?php

$input = trim(fgets(STDIN));
$output = str_replace(",", " ", $input);
echo $output;

```
[/PHP]

[BASH]
```bash

read -r input
output=${input//,/ }
echo "$output"

```
[/BASH]

[PL]
```perl

use strict;
use warnings;

my $input = <STDIN>;
chomp $input;
my $output = $input;
$output =~ s/,/ /g;
print "$output\n";

```
[/PL]

[LUA]
```lua

io.write(string.gsub(io.read(), ",", " "))

```
[/LUA]

[JAVASCRIPT]
```javascript

process.stdin.resume();
process.stdin.setEncoding("ascii");
let input_stdin = "";
process.stdin.on("data", function (data) {
    input_stdin += data;
});
process.stdin.on("end", function () {
    let input = input_stdin.split("\n");
    let output = input[0].replace(/,/g, " ");
    console.log(output);
});

```
[/JAVASCRIPT]

[COFFEESCRIPT]
```coffeescript

input = (lines.shift()).split(',')
output = input.join(' ')
console.log output

```
[/COFFEESCRIPT]

[TYPESCRIPT]
```typescript

process.stdin.resume();
process.stdin.setEncoding("ascii");
let input_stdin = "";
process.stdin.on("data", function (data) {
    input_stdin += data;
});
process.stdin.on("end", function () {
    let input = input_stdin.split("\n");
    let output = input[0].replace(/,/g, " ");
    console.log(output);
});

```
[/TYPESCRIPT]

[D]
```d

import std.stdio;

void main()
{
    auto input = readln();
    auto output = input.replace(",", " ");
    writeln(output);
}

```
[/D]

[KOTLIN]
```kotlin

fun main(args: Array<String>) {
    val input = readLine()!!
    val output = input.replace(",", " ")
    println(output)
}

```
[/KOTLIN]

[BASH]
```bash

read -r input
output=${input//,/ }
echo "$output"

```
[/BASH]

[JULIA]
```julia

input = readline()
output = replace(input, ",", " ")
println(output)

```
[/JULIA]

[DART]
```dart

import 'dart:io';

void main() {
    String input = stdin.readLineSync();
    String output = input.replaceAll(",", " ");
    print(output);
}

```
[/DART]

[R]
```r

input <- readline()
output <- gsub(",", " ", input)
cat(output)

```
[/R]

[AWK]
```awk

{
    gsub(",", " ", $0);
    print $0;
}

```
[/AWK]

[ELIXIR]
```elixir

input = IO.gets ""
output = String.replace(input, ",", " ")
IO.puts output

```
[/ELIXIR]

[FORTRAN]
```fortran

program Problem
    implicit none
    character(100) :: input
    character(100) :: output
    read *, input
    output = replace(input, ",", " ")
    write (*, *) output
end program Problem

```
[/FORTRAN]

[LISP]
```lisp

(defun main ()
  (let ((input (read)))
    (format t "~a" (replace input "," " "))))

```
[/LISP]

[SCALA]
```scala

object Solution {

    def main(args: Array[String]) {
        val input = scala.io.StdIn.readLine()
        val output = input.replace(",", " ")
        println(output)
    }
}

```
[/SCALA]

[BASH]
```bash

read -r input
output=${input//,/ }
echo "$output"

```
[/BASH]

[JULIA]
```julia

input = readline()
output = replace(input, ",", " ")
println(output)

```
[/JULIA]

[DART]
```dart

import 'dart:io';

void main() {
    String input = stdin.readLineSync();
    String output = input.replaceAll(",", " ");
    print(output);
}

```
[/DART]

[R]
```r

input <- readline()
output <- gsub(",", " ", input)
cat(output)

```
[/R]

[AWK]
```awk

{
    gsub(",", " ", $0);
    print $0;
}

```
[/AWK]

[ELIXIR]
```elixir

input = IO.gets ""
output = String.replace(input, ",", " ")
IO.puts output

```
[/ELIXIR]

[FORTRAN]
```fortran

program Problem
    implicit none
    character(100) :: input
    character(100) :: output
    read *, input
    output = replace(input, ",", " ")
    write (*, *) output
end program Problem

```
[/FORTRAN]

[LISP]
```lisp

(defun main ()
  (let ((input (read)))
    (format t "~a" (replace input "," " "))))

```
[/LISP]

[SCALA]
```scala

object Solution {

    def main(args: Array[String]) {
        val input = scala.io.StdIn.readLine()
        val output = input.replace(",", " ")
        println(output)
    }
}

```
[/SCALA]

[BASH]
```bash

read -r input
output=${input//,/ }
echo "$output"

```
[/BASH]

[JULIA]
```julia

input = readline()
output = replace(input, ",", " ")
println(output)

```
[/JULIA]

[DART]
```dart

import 'dart:io';

void main() {
    String input = stdin.readLineSync();
    String output = input.replaceAll(",", " ");
    print(output);
}

```
[/DART]

[R]
```r

input <- readline()
output <- gsub(",", " ", input)
cat(output)

```
[/R]

[AWK]
```awk

{
    gsub(",", " ", $0);
    print $0;
}

```
[/AWK]

[ELIXIR]
```elixir

input = IO.gets ""
output = String.replace(input, ",", " ")
IO.puts output

```
[/ELIXIR]

[FORTRAN]
```fortran

program Problem
    implicit none
    character(100) :: input
    character(100) :: output
    read *, input
    output = replace(input, ",", " ")
    write (*, *) output
end program Problem

```
[/FORTRAN]

[LISP]
```lisp

(defun main ()
  (let ((input (read)))
    (format t "~a" (replace input "," " "))))

```
[/LISP]

[SCALA]
```scala

object Solution {

    def main(args: Array[String]) {
        val input = scala.io.StdIn.readLine()
        val output = input.replace(",", " ")
        println(output)
    }
}

```
[/SCALA]

[BASH]
```bash

read -r input
output=${input//,/ }
echo "$output"

```
[/BASH]

[JULIA]
```julia

input = readline()
output = replace(input, ",", " ")
println(output)

```
[/JULIA]

[DART]
```dart

import 'dart:io';

void main() {
    String input = stdin.readLineSync();
    String output = input.replaceAll(",", " ");
    print(output);
}

```
[/DART]

[R]
```r

input <- readline()
output <- gsub(",", " ", input)
cat(output)

```
[/R]

[AWK]
```awk

{
    gsub(",", " ", $0);
    print $0;
}

```
[/AWK]

[ELIXIR]
```elixir

input = IO.gets ""
output = String.replace(input, ",", " ")
IO.puts output

```
[/ELIXIR]

[FORTRAN]
```fortran

program Problem
    implicit none
    character(100) :: input
    character(100) :: output
    read *, input
    output = replace(input, ",", " ")
    write (*, *) output
end program Problem

```
[/FORTRAN]

[LISP]
```lisp

(defun main ()
  (let ((input (read)))
    (format t "~a" (replace input "," " "))))

```
[/LISP]

[SCALA]
```scala

object Solution {

    def main(args: Array[String]) {
        val input = scala.io.StdIn.readLine()
        val output = input.replace(",", " ")
        println(output)
    }
}

```
[/SCALA]

[BASH]
```bash

read -r input
output=${input//,/ }
echo "$output"

```
[/BASH]

[JULIA]
```julia

input = readline()
output = replace(input, ",", " ")
println(output)

```
[/JULIA]

[DART]
```dart

import 'dart:io';

void main() {
    String input = stdin.readLineSync();
    String output = input.replaceAll(",", " ");
    print(output);
}

```
[/DART]

[R]
```r

input <- readline()
output <- gsub(",", " ", input)
cat(output)

```
[/R]

[AWK]
```awk

{
    gsub(",", " ", $0);
    print $0;
}

```
[/AWK]

[ELIXIR]
```elixir

input = IO.gets ""
output = String.replace(input, ",", " ")
IO.puts output

```
[/ELIXIR]

[FORTRAN]
```fortran

program Problem
    implicit none
    character(100) :: input
    character(100) :: output
    read *, input
    output = replace(input, ",", " ")
    write (*, *) output
end program Problem

```
[/FORTRAN]

[LISP]
```lisp

(defun main ()
  (let ((input (read)))
    (format t "~a" (replace input "," " "))))

```
[/LISP]

[SCALA]
```scala

object Solution {

    def main(args: Array[String]) {
        val input = scala.io.StdIn.readLine()
        val output = input.replace(",", " ")
        println(output)
    }
}

```
[/SCALA]

[BASH]
```bash

read -r input
output=${input//,/ }
echo "$output"

```
[/BASH]

[JULIA]
```julia

input = readline()
output = replace(input, ",", " ")
println(output)

```
[/JULIA]

[DART]
```dart

import 'dart:io';

void main() {
    String input = stdin.readLineSync();
    String output = input.replaceAll(",", " ");
    print(output);
}

```
[/DART]

[R]
```r

input <- readline()
output <- gsub(",", " ", input)
cat(output)

```
[/R]

[AWK]
```awk

{
    gsub(",", " ", $0);
    print $0;
}

```
[/AWK]

[ELIXIR]
```elixir

input = IO.gets ""
output = String.replace(input, ",", " ")
IO.puts output

```
[/ELIXIR]

[FORTRAN]
```fortran

program Problem
    implicit none
    character(100) :: input
    character(100) :: output
    read *, input
    output = replace(input, ",", " ")
    write (*, *) output
end program Problem

```
[/FORTRAN]


