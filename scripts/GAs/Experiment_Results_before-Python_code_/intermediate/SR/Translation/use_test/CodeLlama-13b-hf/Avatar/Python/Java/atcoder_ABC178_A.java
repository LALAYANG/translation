
[JAV]

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int a = sc.nextInt();
            System.out.println(a == 0 ? 1 : 0);
        }
    }
}

```

[/JAV]

[PY]

```python
import sys

def solve(tc):
    a = int(sys.stdin.readline().strip())
    print(1 if a == 0 else 0)

tcs = int(sys.stdin.readline().strip())
tc = 1
while tc <= tcs:
    solve(tc)
    tc += 1

```

[/PY]

[C]

```c
#include <stdio.h>

int main() {
    int tc, a;
    scanf("%d", &tc);
    while (tc--) {
        scanf("%d", &a);
        printf("%d\n", a == 0 ? 1 : 0);
    }
    return 0;
}

```

[/C]

[CPP]

```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int tc, a;
    cin >> tc;
    while (tc--) {
        cin >> a;
        cout << (a == 0 ? 1 : 0) << endl;
    }
    return 0;
}

```

[/CPP]

[C#]

```csharp
using System;

class Solution {
    static void Main(String[] args) {
        int tc = Convert.ToInt32(Console.ReadLine());
        while (tc-- > 0) {
            int a = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine(a == 0 ? 1 : 0);
        }
    }
}

```

[/C#]

[JAVASCRIPT]

```javascript
process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function main() {
    var tc = parseInt(readLine());
    for (var a0 = 0; a0 < tc; a0++) {
        var a = parseInt(readLine());
        console.log(a == 0 ? 1 : 0);
    }
}

```

[/JAVASCRIPT]

[PHP]

```php
<?php

$handle = fopen ("php://stdin","r");
fscanf($handle,"%d",$tc);
while($tc>0){
    fscanf($handle,"%d",$a);
    echo $a==0?1:0;
    $tc--;
}

?>

```

[/PHP]

[RUBY]

```ruby
tc = gets.to_i
tc.times do
    a = gets.to_i
    puts a == 0 ? 1 : 0
end

```

[/RUBY]

[GO]

```go
package main

import "fmt"

func main() {
    var tc int
    fmt.Scan(&tc)
    for tc > 0 {
        var a int
        fmt.Scan(&a)
        fmt.Println(a == 0 ? 1 : 0)
        tc--
    }
}

```

[/GO]

[SWIFT]

```swift
import Foundation

var tc = Int(readLine()!)!
for _ in 0..<tc {
    let a = Int(readLine()!)!
    print(a == 0 ? 1 : 0)
}

```

[/SWIFT]

[PASCAL]

```pascal
program problem;
var
  tc: integer;
  a: integer;
begin
  readln(tc);
  while tc > 0 do
  begin
    readln(a);
    writeln(a = 0, 1, 0);
    tc := tc - 1;
  end;
end.

```

[/PASCAL]

[RUST]

```rust
use std::io;

fn main() {
    let mut tc = String::new();
    io::stdin().read_line(&mut tc).unwrap();
    let tc: i32 = tc.trim().parse().unwrap();
    for _ in 0..tc {
        let mut a = String::new();
        io::stdin().read_line(&mut a).unwrap();
        let a: i32 = a.trim().parse().unwrap();
        println!("{}", a == 0);
    }
}

```

[/RUST]

[SCALA]

```scala
object Solution {
    def main(args: Array[String]) {
        var tc = readLine().toInt
        while (tc > 0) {
            var a = readLine().toInt
            println(if (a == 0) 1 else 0)
            tc -= 1
        }
    }
}

```

[/SCALA]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[JULIA]

```julia
tc = parse(Int, readline())
for i in 1:tc
    a = parse(Int, readline())
    println(a == 0 ? 1 : 0)
end

```

[/JULIA]

[PERL]

```perl
my $tc = <STDIN>;
chomp($tc);
while ($tc > 0) {
    my $a = <STDIN>;
    chomp($a);
    print $a == 0 ? 1 : 0, "\n";
    $tc--;
}

```

[/PERL]

[LUA]

```lua
tc = io.read("*n")
for i = 1, tc do
    a = io.read("*n")
    print(a == 0 and 1 or 0)
end

```

[/LUA]

[AWK]

```awk
{
    tc = $1
    for (i = 1; i <= tc; i++) {
        getline a
        print a == 0 ? 1 : 0
    }
}

```

[/AWK]

[CAT]

```cat
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/CAT]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[/BASH]

[BASH]

```bash
read tc
while [ $tc -gt 0 ]
do
    read a
    echo $((a == 0 ? 1 : 0))
    tc=$((tc-1))
done

```

[
