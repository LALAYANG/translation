
[JAV]

```java

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int index = s.indexOf("S");
            if (index != -1) {
                c.add(index - s.indexOf("G"));
            }
        }
        if (c.contains(-1)) {
            System.out.println(-1);
        } else {
            System.out.println(c.size());
        }
    }
}

```

[/JAV]

[PY]

```python

n, m = map(int, input().split())
c = set()
for i in range(n):
    s = input()
    index = s.find("S")
    if index != -1:
        c.add(index - s.find("G"))
if -1 in c:
    print(-1)
else:
    print(len(c))


```

[/PY]

[C]

```c

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int n, m;
    scanf("%d %d", &n, &m);
    int c[n];
    for (int i = 0; i < n; i++) {
        char s[m + 1];
        scanf("%s", s);
        int index = strchr(s, 'S') - s;
        if (index != -1) {
            c[i] = index - strchr(s, 'G') + 1;
        } else {
            c[i] = -1;
        }
    }
    int flag = 0;
    for (int i = 0; i < n; i++) {
        if (c[i] == -1) {
            flag = 1;
            break;
        }
    }
    if (flag) {
        printf("-1\n");
    } else {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] != -1) {
                count++;
            }
        }
        printf("%d\n", count);
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
    int n, m;
    cin >> n >> m;
    int c[n];
    for (int i = 0; i < n; i++) {
        string s;
        cin >> s;
        int index = s.find("S");
        if (index != -1) {
            c[i] = index - s.find("G") + 1;
        } else {
            c[i] = -1;
        }
    }
    int flag = 0;
    for (int i = 0; i < n; i++) {
        if (c[i] == -1) {
            flag = 1;
            break;
        }
    }
    if (flag) {
        cout << -1 << endl;
    } else {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] != -1) {
                count++;
            }
        }
        cout << count << endl;
    }
    return 0;
}

```

[/CPP]

[JAVASCRIPT]

```javascript

const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

let input = [];

rl.on('line', function (line) {
    input.push(line);
}).on('close', function () {
    let [n, m] = input[0].split(' ').map(Number);
    let c = [];
    for (let i = 1; i <= n; i++) {
        let s = input[i];
        let index = s.indexOf('S');
        if (index != -1) {
            c.push(index - s.indexOf('G') + 1);
        } else {
            c.push(-1);
        }
    }
    let flag = 0;
    for (let i = 0; i < n; i++) {
        if (c[i] == -1) {
            flag = 1;
            break;
        }
    }
    if (flag) {
        console.log(-1);
    } else {
        let count = 0;
        for (let i = 0; i < n; i++) {
            if (c[i] != -1) {
                count++;
            }
        }
        console.log(count);
    }
    process.exit();
});

```

[/JAVASCRIPT]

[PYTHON]

```python

import sys

input = sys.stdin.readline

n, m = map(int, input().split())
c = []
for i in range(n):
    s = input().strip()
    index = s.find('S')
    if index != -1:
        c.append(index - s.find('G') + 1)
    else:
        c.append(-1)
flag = 0
for i in range(n):
    if c[i] == -1:
        flag = 1
        break
if flag:
    print(-1)
else:
    count = 0
    for i in range(n):
        if c[i] != -1:
            count += 1
    print(count)

```

[/PYTHON]

[GO]

```go

package main

import (
    "bufio"
    "fmt"
    "os"
    "strconv"
    "strings"
)

var sc = bufio.NewScanner(os.Stdin)

func nextString() string {
    if !sc.Scan() {
        panic("failed scan string")
    }
    return sc.Text()
}

func nextInt() int {
    if !sc.Scan() {
        panic("failed scan int")
    }
    n, e := strconv.Atoi(sc.Text())
    if e != nil {
        panic(e)
    }
    return n
}

func main() {
    n, m := nextInt(), nextInt()
    c := make([]int, n)
    for i := 0; i < n; i++ {
        s := nextString()
        index := strings.Index(s, "S")
        if index != -1 {
            c[i] = index - strings.Index(s, "G") + 1
        } else {
            c[i] = -1
        }
    }
    flag := false
    for i := 0; i < n; i++ {
        if c[i] == -1 {
            flag = true
            break
        }
    }
    if flag {
        fmt.Println(-1)
    } else {
        count := 0
        for i := 0; i < n; i++ {
            if c[i] != -1 {
                count++
            }
        }
        fmt.Println(count)
    }
}

```

[/GO]

[RUBY]

```ruby

n, m = gets.split.map(&:to_i)
c = []
n.times do
    s = gets.chomp
    index = s.index('S')
    if index != -1
        c.push(index - s.index('G') + 1)
    else
        c.push(-1)
    end
end
flag = false
n.times do |i|
    if c[i] == -1
        flag = true
        break
    end
end
if flag
    puts -1
else
    count = 0
    n.times do |i|
        if c[i] != -1
            count += 1
        end
    end
    puts count
end

```

[/RUBY]

[SWIFT]

```swift

import Foundation

let nm = readLine()!.split{$0==" "}.map{Int(String($0))!}
let n = nm[0], m = nm[1]
var c = [Int]()
for _ in 0..<n {
    let s = readLine()!
    let index = s.firstIndex(of: "S")
    if let index = index {
        c.append(index - s.firstIndex(of: "G")! + 1)
    } else {
        c.append(-1)
    }
}
var flag = false
for i in 0..<n {
    if c[i] == -1 {
        flag = true
        break
    }
}
if flag {
    print(-1)
} else {
    var count = 0
    for i in 0..<n {
        if c[i] != -1 {
            count += 1
        }
    }
    print(count)
}

```

[/SWIFT]

[CSHARP]

```cs

using System;
using System.Linq;

class Solution
{
    static void Main(String[] args)
    {
        var nm = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
        var n = nm[0], m = nm[1];
        var c = new int[n];
        for (int i = 0; i < n; i++)
        {
            var s = Console.ReadLine();
            var index = s.IndexOf('S');
            if (index != -1)
            {
                c[i] = index - s.IndexOf('G') + 1;
            }
            else
            {
                c[i] = -1;
            }
        }
        var flag = false;
        for (int i = 0; i < n; i++)
        {
            if (c[i] == -1)
            {
                flag = true;
                break;
            }
        }
        if (flag)
        {
            Console.WriteLine(-1);
        }
        else
        {
            var count = 0;
            for (int i = 0; i < n; i++)
            {
                if (c[i] != -1)
                {
                    count++;
                }
            }
            Console.WriteLine(count);
        }
    }
}

```

[/CSHARP]

[HASKELL]

```haskell

import Data.List

main = do
    [n, m] <- map read . words <$> getLine
    c <- map (\s -> if 'S' `elem` s then (fromJust . elemIndex 'S') s - (fromJust . elemIndex 'G') s + 1 else -1) <$> replicateM n getLine
    let flag = -1 `elem` c
    if flag
        then putStrLn "-1"
        else putStrLn . show $ length $ filter (/= -1) c

```

[/HASKELL]

[PERL]

```perl

use strict;
use warnings;

my ($n, $m) = split /\s+/, <STDIN>;
my @c;
for (1 .. $n) {
    my $s = <STDIN>;
    my $index = index $s, 'S';
    if ($index != -1) {
        push @c, $index - index $s, 'G' + 1;
    } else {
        push @c, -1;
    }
}
my $flag = -1 ~~ @c;
if ($flag) {
    print -1;
} else {
    my $count = 0;
    for (@c) {
        $count++ if $_ != -1;
    }
    print $count;
}

```

[/PERL]

[PHP]

```php

<?php
$n = intval(fgets(STDIN));
$m = intval(fgets(STDIN));
$c = [];
for ($i = 0; $i < $n; $i++) {
    $s = trim(fgets(STDIN));
    $index = strpos($s, 'S');
    if ($index !== false) {
        $c[] = $index - strpos($s, 'G') + 1;
    } else {
        $c[] = -1;
    }
}
$flag = in_array(-1, $c);
if ($flag) {
    echo -1;
} else {
    $count = 0;
    foreach ($c as $value) {
        if ($value != -1) {
            $count++;
        }
    }
    echo $count;
}

```

[/PHP]

[PASCAL]

```pascal

program problem;

var
  n, m, i, j, count: integer;
  c: array[1..1000] of integer;
  s: string;

begin
  readln(n, m);
  for i := 1 to n do
  begin
    readln(s);
    j := pos('S', s);
    if j = 0 then
      c[i] := -1
    else
      c[i] := j - pos('G', s) + 1;
  end;
  count := 0;
  for i := 1 to n do
    if c[i] <> -1 then
      count := count + 1;
  if count = 0 then
    writeln(-1)
  else
    writeln(count);
end.

```

[/PASCAL]

[R]

```r

n <- scan(n = 1, what = integer())
m <- scan(n = 1, what = integer())
c <- vector(mode = "integer", length = n)
for (i in 1:n) {
    s <- scan(n = 1, what = character())
    index <- regexpr("S", s)
    if (index != -1) {
        c[i] <- index - regexpr("G", s) + 1
    } else {
        c[i] <- -1
    }
}
flag <- -1 %in% c
if (flag) {
    print(-1)
} else {
    count <- 0
    for (i in 1:n) {
        if (c[i] != -1) {
            count <- count + 1
        }
    }
    print(count)
}

```

[/R]

[JULIA]

```julia

n, m = parse.(Int, split(readline()))
c = []
for i in 1:n
    s = readline()
    index = findfirst("S", s)
    if index != nothing
        push!(c, index - findfirst("G", s) + 1)
    else
        push!(c, -1)
    end
end
flag = -1 in c
if flag
    println(-1)
else
    count = 0
    for i in 1:n
        if c[i] != -1
            count += 1
        end
   
