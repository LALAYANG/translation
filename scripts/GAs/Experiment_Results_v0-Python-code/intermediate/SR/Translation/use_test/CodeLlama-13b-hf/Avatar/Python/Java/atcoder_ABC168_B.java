
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max_length = sc.nextInt();
        String input_string = sc.next();
        if (max_length <= input_string.length()) {
            System.out.println(input_string.substring(0, max_length) + "...");
        } else {
            System.out.println(input_string);
        }
    }
}
```
[/JAV]

[PYT]
```python
import sys

max_length = int(sys.stdin.readline())
input_string = sys.stdin.readline()
if max_length <= len(input_string):
    print(input_string[:max_length] + "...")
else:
    print(input_string)
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <string>

using namespace std;

int main() {
    int max_length;
    string input_string;
    cin >> max_length;
    cin >> input_string;
    if (max_length <= input_string.length()) {
        cout << input_string.substr(0, max_length) + "..." << endl;
    } else {
        cout << input_string << endl;
    }
    return 0;
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <string.h>

int main() {
    int max_length;
    char input_string[1000];
    scanf("%d", &max_length);
    scanf("%s", input_string);
    if (max_length <= strlen(input_string)) {
        printf("%.*s...\n", max_length, input_string);
    } else {
        printf("%s\n", input_string);
    }
    return 0;
}
```
[/C]

[PHP]
```php
<?php
$max_length = intval(fgets(STDIN));
$input_string = fgets(STDIN);
if ($max_length <= strlen($input_string)) {
    echo substr($input_string, 0, $max_length) . "...\n";
} else {
    echo $input_string;
}
```
[/PHP]

[RUBY]
```ruby
max_length = gets.to_i
input_string = gets.chomp
if max_length <= input_string.length
    puts input_string[0, max_length] + '...'
else
    puts input_string
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
    var max_length int
    var input_string string
    fmt.Scan(&max_length)
    fmt.Scan(&input_string)
    if max_length <= len(input_string) {
        fmt.Println(input_string[0:max_length] + "...")
    } else {
        fmt.Println(input_string)
    }
}
```
[/GO]

[BASH]
```bash
read max_length
read input_string
if [ $max_length -le ${#input_string} ]; then
    echo ${input_string:0:$max_length}...
else
    echo $input_string
fi
```
[/BASH]

[PERL]
```perl
use strict;
use warnings;

my $max_length = <STDIN>;
chomp($max_length);
my $input_string = <STDIN>;
chomp($input_string);
if ($max_length <= length($input_string)) {
    print substr($input_string, 0, $max_length) . "...\n";
} else {
    print $input_string . "\n";
}
```
[/PERL]

[PAS]
```pascal
program Problem;
var
    max_length, length: integer;
    input_string: string;
begin
    readln(max_length);
    readln(input_string);
    length := length(input_string);
    if max_length <= length then
        writeln(copy(input_string, 1, max_length) + '...')
    else
        writeln(input_string);
end.
```
[/PAS]

[JAVASCRIPT]
```javascript
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('', (max_length) => {
    rl.question('', (input_string) => {
        if (max_length <= input_string.length) {
            console.log(input_string.substring(0, max_length) + '...');
        } else {
            console.log(input_string);
        }
        rl.close();
    });
});
```
[/JAVASCRIPT]

[PYTHON]
```python
max_length = int(input())
input_string = input()
if max_length <= len(input_string):
    print(input_string[:max_length] + "...")
else:
    print(input_string)
```
[/PYTHON]

[RUST]
```rust
use std::io;

fn main() {
    let mut max_length = String::new();
    io::stdin().read_line(&mut max_length).unwrap();
    let max_length: i32 = max_length.trim().parse().unwrap();
    let mut input_string = String::new();
    io::stdin().read_line(&mut input_string).unwrap();
    let input_string = input_string.trim();
    if max_length <= input_string.len() as i32 {
        println!("{}...", &input_string[0..max_length as usize]);
    } else {
        println!("{}", input_string);
    }
}
```
[/RUST]

[SWIFT]
```swift
import Foundation

let max_length = Int(readLine()!)!
let input_string = readLine()!
if max_length <= input_string.count {
    print(String(input_string.prefix(max_length)) + "...")
} else {
    print(input_string)
}
```
[/SWIFT]

[JULIA]
```julia
max_length = parse(Int, readline())
input_string = readline()
if max_length <= length(input_string)
    print(input_string[1:max_length] * "...")
else
    print(input_string)
end
```
[/JULIA]

[D]
```d
import std.stdio;

void main()
{
    auto max_length = readln().to!int;
    auto input_string = readln();
    if (max_length <= input_string.length)
        writeln(input_string[0 .. max_length] ~ "...");
    else
        writeln(input_string);
}
```
[/D]

[KOTLIN]
```kotlin
fun main() {
    val max_length = readLine()!!.toInt()
    val input_string = readLine()!!
    if (max_length <= input_string.length) {
        println(input_string.substring(0, max_length) + "...")
    } else {
        println(input_string)
    }
}
```
[/KOTLIN]

[MATLAB]
```matlab
max_length = input('');
input_string = input('');
if max_length <= length(input_string)
    disp(input_string(1:max_length) + '...');
else
    disp(input_string);
end
```
[/MATLAB]

[HASKELL]
```haskell
main = do
    max_length <- readLn
    input_string <- getLine
    if max_length <= length input_string
        then putStrLn $ take max_length input_string ++ "..."
        else putStrLn input_string
```
[/HASKELL]

[COFFEESCRIPT]
```coffeescript
max_length = parseInt readline()
input_string = readline()
if max_length <= input_string.length
    console.log input_string.substring(0, max_length) + '...'
else
    console.log input_string
```
[/COFFEESCRIPT]

[BASH]
```bash
read max_length
read input_string
if [ $max_length -le ${#input_string} ]; then
    echo ${input_string:0:$max_length}...
else
    echo $input_string
fi
```
[/BASH]

[SCALA]
```scala
object Solution {
    def main(args: Array[String]) {
        val max_length = readLine.toInt
        val input_string = readLine
        if (max_length <= input_string.length) {
            println(input_string.substring(0, max_length) + "...")
        } else {
            println(input_string)
        }
    }
}
```
[/SCALA]

[R]
```r
max_length <- as.integer(readline(prompt=""))
input_string <- readline(prompt="")
if (max_length <= nchar(input_string)) {
    cat(substr(input_string, 1, max_length), "...\n")
} else {
    cat(input_string, "\n")
}
```
[/R]

[JULIA]
```julia
max_length = parse(Int, readline())
input_string = readline()
if max_length <= length(input_string)
    print(input_string[1:max_length] * "...")
else
    print(input_string)
end
```
[/JULIA]

[D]
```d
import std.stdio;

void main()
{
    auto max_length = readln().to!int;
    auto input_string = readln();
    if (max_length <= input_string.length)
        writeln(input_string[0 .. max_length] ~ "...");
    else
        writeln(input_string);
}
```
[/D]

[KOTLIN]
```kotlin
fun main() {
    val max_length = readLine()!!.toInt()
    val input_string = readLine()!!
    if (max_length <= input_string.length) {
        println(input_string.substring(0, max_length) + "...")
    } else {
        println(input_string)
    }
}
```
[/KOTLIN]

[MATLAB]
```matlab
max_length = input('');
input_string = input('');
if max_length <= length(input_string)
    disp(input_string(1:max_length) + '...');
else
    disp(input_string);
end
```
[/MATLAB]

[HASKELL]
```haskell
main = do
    max_length <- readLn
    input_string <- getLine
    if max_length <= length input_string
        then putStrLn $ take max_length input_string ++ "..."
        else putStrLn input_string
```
[/HASKELL]

[COFFEESCRIPT]
```coffeescript
max_length = parseInt readline()
input_string = readline()
if max_length <= input_string.length
    console.log input_string.substring(0, max_length) + '...'
else
    console.log input_string
```
[/COFFEESCRIPT]

[BASH]
```bash
read max_length
read input_string
if [ $max_length -le ${#input_string} ]; then
    echo ${input_string:0:$max_length}...
else
    echo $input_string
fi
```
[/BASH]

[SCALA]
```scala
object Solution {
    def main(args: Array[String]) {
        val max_length = readLine.toInt
        val input_string = readLine
        if (max_length <= input_string.length) {
            println(input_string.substring(0, max_length) + "...")
        } else {
            println(input_string)
        }
    }
}
```
[/SCALA]

[R]
```r
max_length <- as.integer(readline(prompt=""))
input_string <- readline(prompt="")
if (max_length <= nchar(input_string)) {
    cat(substr(input_string, 1, max_length), "...\n")
} else {
    cat(input_string, "\n")
}
```
[/R]

[JULIA]
```julia
max_length = parse(Int, readline())
input_string = readline()
if max_length <= length(input_string)
    print(input_string[1:max_length] * "...")
else
    print(input_string)
end
```
[/JULIA]

[D]
```d
import std.stdio;

void main()
{
    auto max_length = readln().to!int;
    auto input_string = readln();
    if (max_length <= input_string.length)
        writeln(input_string[0 .. max_length] ~ "...");
    else
        writeln(input_string);
}
```
[/D]

[KOTLIN]
```kotlin
fun main() {
    val max_length = readLine()!!.toInt()
    val input_string = readLine()!!
    if (max_length <= input_string.length) {
        println(input_string.substring(0, max_length) + "...")
    } else {
        println(input_string)
    }
}
```
[/KOTLIN]

[MATLAB]
```matlab
max_length = input('');
input_string = input('');
if max_length <= length(input_string)
    disp(input_string(1:max_length) + '...');
else
    disp(input_string);
end
```
[/MATLAB]

[HASKELL]
```haskell
main = do
    max_length <- readLn
    input_string <- getLine
    if max_length <= length input_string
        then putStrLn $ take max_length input_string ++ "..."
        else putStrLn input_string
```
[/HASKELL]

[COFFEESCRIPT]
```coffeescript
max_length = parseInt readline()
input_string = readline()
if max_length <= input_string.length
    console.log input_string.substring(0, max_length) + '...'
else
    console
