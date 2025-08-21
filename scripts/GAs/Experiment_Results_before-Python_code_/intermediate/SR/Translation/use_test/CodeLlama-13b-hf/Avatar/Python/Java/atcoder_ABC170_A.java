
[JAV]
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] a = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}

```
[/JAV]

[PYT]
```py

a = list(map(int, input().split()))
for e, i in enumerate(a):
    if i == 0:
        print(e + 1)
        break


```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;
    vector<int> a;
    for (int i = 0; i < s.length(); i++) {
        a.push_back(s[i] - '0');
    }
    for (int i = 0; i < a.size(); i++) {
        if (a[i] == 0) {
            cout << i + 1 << endl;
            break;
        }
    }
}

```
[/CPP]

[C]
```c

#include <stdio.h>
#include <string.h>

int main() {
    char s[1000];
    scanf("%s", s);
    int a[1000];
    int i;
    for (i = 0; i < strlen(s); i++) {
        a[i] = s[i] - '0';
    }
    for (i = 0; i < strlen(s); i++) {
        if (a[i] == 0) {
            printf("%d\n", i + 1);
            break;
        }
    }
}

```
[/C]

[PHP]
```php

<?php
$a = explode(" ", readline());
for ($i = 0; $i < count($a); $i++) {
    if ($a[$i] == 0) {
        echo $i + 1;
        break;
    }
}

```
[/PHP]

[RUBY]
```ruby

a = gets.split.map(&:to_i)
a.each_with_index do |e, i|
    if e == 0
        puts i + 1
        break
    end
end

```
[/RUBY]

[GO]
```go

package main

import (
    "fmt"
    "strings"
)

func main() {
    var s string
    fmt.Scan(&s)
    a := strings.Split(s, " ")
    for i, e := range a {
        if e == "0" {
            fmt.Println(i + 1)
            break
        }
    }
}

```
[/GO]

[BASH]
```bash

read -a a
for i in "${!a[@]}"; do
    if [[ ${a[$i]} -eq 0 ]]; then
        echo $((i + 1))
        break
    fi
done

```
[/BASH]

[PERL]
```perl

my $s = <STDIN>;
chomp $s;
my @a = split(/ /, $s);
for my $i (0 .. $#a) {
    if ($a[$i] == 0) {
        print $i + 1, "\n";
        last;
    }
}

```
[/PERL]

[PAS]
```pascal

var
  a: array of integer;
  i: integer;
  s: string;

begin
  readln(s);
  a := split(s, ' ');
  for i := 0 to length(a) - 1 do
    if a[i] = 0 then
      writeln(i + 1);
      break;
  end;
end.

```
[/PAS]

[JAVA]
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] a = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}

```
[/JAVA]

[CS]
```cs

using System;

class Solution
{
    static void Main(string[] args)
    {
        string[] a = Console.ReadLine().Split(' ');
        for (int i = 0; i < a.Length; i++)
        {
            if (a[i] == "0")
            {
                Console.WriteLine(i + 1);
                break;
            }
        }
    }
}

```
[/CS]

[PL]
```perl

my $s = <STDIN>;
chomp $s;
my @a = split(/ /, $s);
for my $i (0 .. $#a) {
    if ($a[$i] == 0) {
        print $i + 1, "\n";
        last;
    }
}

```
[/PL]

[HAS]
```haskell

import Data.List.Split

main = do
    s <- getLine
    let a = map read $ splitOn " " s
    print $ elemIndex 0 a

```
[/HAS]

[LUA]
```lua

a = {}
for i in io.read():gmatch("%S+") do
    a[#a + 1] = i
end
for i = 1, #a do
    if a[i] == "0" then
        print(i)
        break
    end
end

```
[/LUA]

[BASH]
```bash

read -a a
for i in "${!a[@]}"; do
    if [[ ${a[$i]} -eq 0 ]]; then
        echo $((i + 1))
        break
    fi
done

```
[/BASH]

[JAVASCRIPT]
```javascript

var a = readline().split(' ');
for (var i = 0; i < a.length; i++) {
    if (a[i] == 0) {
        console.log(i + 1);
        break;
    }
}

```
[/JAVASCRIPT]

[COFFEE]
```coffeescript

a = readline().split ' '
for i in [0...a.length]
    if a[i] == 0
        console.log i + 1
        break

```
[/COFFEE]

[BASH]
```bash

read -a a
for i in "${!a[@]}"; do
    if [[ ${a[$i]} -eq 0 ]]; then
        echo $((i + 1))
        break
    fi
done

```
[/BASH]

[JAVASCRIPT]
```javascript

var a = readline().split(' ');
for (var i = 0; i < a.length; i++) {
    if (a[i] == 0) {
        console.log(i + 1);
        break;
    }
}

```
[/JAVASCRIPT]

[COFFEE]
```coffeescript

a = readline().split ' '
for i in [0...a.length]
    if a[i] == 0
        console.log i + 1
        break

```
[/COFFEE]

[BASH]
```bash

read -a a
for i in "${!a[@]}"; do
    if [[ ${a[$i]} -eq 0 ]]; then
        echo $((i + 1))
        break
    fi
done

```
[/BASH]

[JAVASCRIPT]
```javascript

var a = readline().split(' ');
for (var i = 0; i < a.length; i++) {
    if (a[i] == 0) {
        console.log(i + 1);
        break;
    }
}

```
[/JAVASCRIPT]

[COFFEE]
```coffeescript

a = readline().split ' '
for i in [0...a.length]
    if a[i] == 0
        console.log i + 1
        break

```
[/COFFEE]

[BASH]
```bash

read -a a
for i in "${!a[@]}"; do
    if [[ ${a[$i]} -eq 0 ]]; then
        echo $((i + 1))
        break
    fi
done

```
[/BASH]

[JAVASCRIPT]
```javascript

var a = readline().split(' ');
for (var i = 0; i < a.length; i++) {
    if (a[i] == 0) {
        console.log(i + 1);
        break;
    }
}

```
[/JAVASCRIPT]

[COFFEE]
```coffeescript

a = readline().split ' '
for i in [0...a.length]
    if a[i] == 0
        console.log i + 1
        break

```
[/COFFEE]

[BASH]
```bash

read -a a
for i in "${!a[@]}"; do
    if [[ ${a[$i]} -eq 0 ]]; then
        echo $((i + 1))
        break
    fi
done

```
[/BASH]

[JAVASCRIPT]
```javascript

var a = readline().split(' ');
for (var i = 0; i < a.length; i++) {
    if (a[i] == 0) {
        console.log(i + 1);
        break;
    }
}

```
[/JAVASCRIPT]

[COFFEE]
```coffeescript

a = readline().split ' '
for i in [0...a.length]
    if a[i] == 0
        console.log i + 1
        break

```
[/COFFEE]

[BASH]
```bash

read -a a
for i in "${!a[@]}"; do
    if [[ ${a[$i]} -eq 0 ]]; then
        echo $((i + 1))
        break
    fi
done

```
[/BASH]

[JAVASCRIPT]
```javascript

var a = readline().split(' ');
for (var i = 0; i < a.length; i++) {
    if (a[i] == 0) {
        console.log(i + 1);
        break;
    }
}

```
[/JAVASCRIPT]

[COFFEE]
```coffeescript

a = readline().split ' '
for i in [0...a.length]
    if a[i] == 0
        console.log i + 1
        break

```
[/COFFEE]

[BASH]
```bash

read -a a
for i in "${!a[@]}"; do
    if [[ ${a[$i]} -eq 0 ]]; then
        echo $((i + 1))
        break
    fi
done

```
[/BASH]

[JAVASCRIPT]
```javascript

var a = readline().split(' ');
for (var i = 0; i < a.length; i++) {
    if (a[i] == 0) {
        console.log(i + 1);
        break;
    }
}

```
[/JAVASCRIPT]

[COFFEE]
```coffeescript

a = readline().split ' '
for i in [0...a.length]
    if a[i] == 0
        console.log i + 1
        break

```
[/COFFEE]

[BASH]
```bash

read -a a
for i in "${!a[@]}"; do
    if [[ ${a[$i]} -eq 0 ]]; then
        echo $((i + 1))
        break
    fi
done

```
[/BASH]

[JAVASCRIPT]
```javascript

var a = readline().split(' ');
for (var i = 0; i < a.length; i++) {
    if (a[i] == 0) {
        console.log(i + 1);
        break;
    }
}

```
[/JAVASCRIPT]

[COFFEE]
```coffeescript

a = readline().split ' '
for i in [0...a.length]
    if a[i] == 0
        console.log i + 1
        break

```
[/COFFEE]

[BASH]
```bash

read -a a
for i in "${!a[@]}"; do
    if [[ ${a[$i]} -eq 0 ]]; then
        echo $((i + 1))
        break
    fi
done

```
[/BASH]

[JAVASCRIPT]
```javascript

var a = readline().split(' ');
for (var i = 0; i < a.length; i++) {
    if (a[i] == 0) {
        console.log(i + 1);
        break;
    }
}

```
[/JAVASCRIPT]

[COFFEE]
```coffeescript

a = readline().split ' '
for i in [0...a.length]
    if a[i] == 0
        console.log i + 1
        break

```
[/COFFEE]

[BASH]
```bash

read -a a
for i in "${!a[@]}"; do
    if [[ ${a[$i]} -eq 0 ]]; then
        echo $((i + 1))
        break
    fi
done

```
[/BASH]

[JAVASCRIPT]
```javascript

var a = readline().split(' ');
for (var i = 0; i < a.length; i++) {
    if (a[i] == 0) {
        console.log(i + 1);
        break;
    }
}

```
[/JAVASCRIPT]

[COFFEE]
```coffeescript

a = readline().split ' '
for i in [0...a.length]
    if a[i] == 0
        console.log i + 1
        break

```
[/COFFEE]

[BASH]
```bash

read -a a
for i in "${!a[@]}"; do
    if [[ ${a[$i]} -eq 0 ]]; then
        echo $((i + 1))
        break
    fi
done

```
[/BASH]

[JAVASCRIPT]
```javascript

var a = readline().split(' ');
for (var i = 0; i < a.length; i++) {
    if (a[i
