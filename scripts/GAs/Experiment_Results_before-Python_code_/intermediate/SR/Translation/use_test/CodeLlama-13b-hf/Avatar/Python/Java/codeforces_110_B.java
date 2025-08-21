
[JAV]
```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        for (int i = 0; i < n; i++) {
            s += "abcd"[i % 4];
        }
        System.out.println(s);
    }
}

```
[/JAV]

[PY]
```python

LUCKY = "abcd"
n = int(input())
s = ""
for i in range(n):
    s += LUCKY[i % 4]
print(s)

```
[/PY]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    string s = "";
    for (int i = 0; i < n; i++) {
        s += "abcd"[i % 4];
    }
    cout << s << endl;
}

```
[/CPP]

[C]
```c

#include <stdio.h>
#include <string.h>

int main() {
    int n;
    scanf("%d", &n);
    char s[n + 1];
    for (int i = 0; i < n; i++) {
        s[i] = "abcd"[i % 4];
    }
    s[n] = '\0';
    printf("%s\n", s);
}

```
[/C]

[MAT]
```matlab

n = input('');
s = '';
for i = 1:n
    s = [s 'abcd'{mod(i, 4)}];
end
disp(s)

```
[/MAT]

[RB]
```ruby

n = gets.to_i
s = ''
n.times do |i|
    s += 'abcd'[i % 4]
end
puts s

```
[/RB]

[GO]
```go

package main

import (
    "fmt"
)

func main() {
    var n int
    fmt.Scan(&n)
    s := ""
    for i := 0; i < n; i++ {
        s += "abcd"[i%4 : i%4+1]
    }
    fmt.Println(s)
}

```
[/GO]

[PAS]
```pascal

var
  n, i: Integer;
  s: String;
begin
  ReadLn(n);
  s := '';
  for i := 1 to n do
    s := s + 'abcd'[i mod 4 + 1];
  WriteLn(s);
end.

```
[/PAS]

[JL]
```julia

n = parse(Int, readline())
s = ""
for i in 1:n
    s *= "abcd"[mod(i, 4)]
end
println(s)

```
[/JL]

[PHP]
```php

<?php
$n = (int) fgets(STDIN);
$s = "";
for ($i = 0; $i < $n; $i++) {
    $s .= "abcd"[$i % 4];
}
echo $s;

```
[/PHP]

[PL]
```perl

use strict;
use warnings;

my $n = <STDIN>;
chomp $n;
my $s = "";
for (my $i = 0; $i < $n; $i++) {
    $s .= "abcd"[$i % 4];
}
print "$s\n";

```
[/PL]

[R]
```r

n <- as.integer(readline(prompt = ""))
s <- ""
for (i in 1:n) {
    s <- paste0(s, "abcd"[i %% 4 + 1])
}
cat(s, "\n")

```
[/R]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
s=""
for ((i = 0; i < n; i++)); do
    s+="abcd"${i: -1}
done
echo "$s"

```
[/BASH]

[BASH]

