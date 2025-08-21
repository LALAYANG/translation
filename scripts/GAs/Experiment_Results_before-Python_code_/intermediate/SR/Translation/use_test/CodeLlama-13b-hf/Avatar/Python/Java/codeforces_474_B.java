
[JAV]
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] L = new int[n];
        int r = 1;
        for (int i = 0; i < n; i++) {
            L[i] = r;
            r++;
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int j = sc.nextInt();
            System.out.println(L[j - 1]);
        }
    }
}

```
[/JAV]

[PYT]
```py

L = []
input()
r = 1
for k in input().split():
    L += [r] * int(k)
    r += 1
input()
for j in input().split():
    print(L[int(j) - 1])


```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> L(n);
    int r = 1;
    for (int i = 0; i < n; i++) {
        L[i] = r;
        r++;
    }
    int m;
    cin >> m;
    for (int i = 0; i < m; i++) {
        int j;
        cin >> j;
        cout << L[j - 1] << endl;
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
    int L[n];
    int r = 1;
    for (int i = 0; i < n; i++) {
        L[i] = r;
        r++;
    }
    int m;
    scanf("%d", &m);
    for (int i = 0; i < m; i++) {
        int j;
        scanf("%d", &j);
        printf("%d\n", L[j - 1]);
    }
}

```
[/C]

[MAT]
```matlab

n = input('');
L = zeros(n, 1);
r = 1;
for k = strsplit(input(''))
    L = [L; repmat(r, 1, str2num(k))];
    r = r + 1;
end
m = input('');
for j = strsplit(input(''))
    disp(L(str2num(j)));
end


```
[/MAT]

[RUB]
```ruby

n = gets.to_i
L = []
r = 1
gets.split.each do |k|
    L += [r] * k.to_i
    r += 1
end
m = gets.to_i
gets.split.each do |j|
    puts L[j.to_i - 1]
end


```
[/RUB]

[PHP]
```php

<?php
$n = (int)trim(fgets(STDIN));
$L = [];
$r = 1;
foreach (explode(' ', trim(fgets(STDIN))) as $k) {
    $L = array_merge($L, array_fill(0, $k, $r));
    $r++;
}
$m = (int)trim(fgets(STDIN));
foreach (explode(' ', trim(fgets(STDIN))) as $j) {
    echo $L[$j - 1] . PHP_EOL;
}


```
[/PHP]

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

func main() {
    var n int
    fmt.Scan(&n)
    L := make([]int, n)
    r := 1
    for i := 0; i < n; i++ {
        L[i] = r
        r++
    }
    var m int
    fmt.Scan(&m)
    for i := 0; i < m; i++ {
        var j int
        fmt.Scan(&j)
        fmt.Println(L[j-1])
    }
}

```
[/GO]

[PAS]
```pascal

var
  n, m, i, j, k, r: Integer;
  L: array of Integer;
begin
  ReadLn(n);
  SetLength(L, n);
  r := 1;
  for i := 0 to n - 1 do
  begin
    L[i] := r;
    r := r + 1;
  end;
  ReadLn(m);
  for i := 0 to m - 1 do
  begin
    ReadLn(j);
    WriteLn(L[j - 1]);
  end;
end.


```
[/PAS]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j-1]}
done


```
[/BASH]

[BASH]
```bash

read n
L=()
r=1
for k in $(read); do
    L+=( $(printf "%0.s$r " {1..$k}) )
    r=$((r+1))
done
read m
for j in $(read); do
    echo ${L[$j
