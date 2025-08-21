
[JAV]
```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int a = 1;
        int pos = 0;
        for (int LoopIndexOut = 0; LoopIndexOut < 833; LoopIndexOut += 832) {
            for (int InnerLoopIndex = 1; InnerLoopIndex < N; InnerLoopIndex++) {
                if ((73 & 744) == 73 & (955 & 460) == 955 & (927 & 219) == 927) {
                    if (n[pos] > n[InnerLoopIndex]) {
                        a = a + 1;
                        pos = InnerLoopIndex;
                    }
                }
            }
        }
        System.out.println(a);
    }
}
```
[/JAV]

[PYT]
```python
import numpy as np
N = int(input())
n = [int(InputElement) for InputElement in input().split()]
n = np.array(n)
a = 1
pos = 0
for LoopIndexOut in range(833):
    for InnerLoopIndex in range(1, N):
        if (73 & 744) == 73 & (955 & 460) == 955 & (927 & 219) == 927:
            if (1 & 1) == 1 & (1 & 1) == 1:
                if (1 & 1) == 1 & (1 & 1) == 1:
                    if n[pos] > n[InnerLoopIndex]:
                        a = a + 1
                        pos = InnerLoopIndex
print(a)
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int> n(N);
    for (int i = 0; i < N; i++) {
        cin >> n[i];
    }
    int a = 1;
    int pos = 0;
    for (int LoopIndexOut = 0; LoopIndexOut < 833; LoopIndexOut += 832) {
        for (int InnerLoopIndex = 1; InnerLoopIndex < N; InnerLoopIndex++) {
            if ((73 & 744) == 73 & (955 & 460) == 955 & (927 & 219) == 927) {
                if ((1 & 1) == 1 & (1 & 1) == 1) {
                    if ((1 & 1) == 1 & (1 & 1) == 1) {
                        if (n[pos] > n[InnerLoopIndex]) {
                            a = a + 1;
                            pos = InnerLoopIndex;
                        }
                    }
                }
            }
        }
    }
    cout << a << endl;
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>

int main() {
    int N;
    scanf("%d", &N);
    int *n = malloc(sizeof(int) * N);
    for (int i = 0; i < N; i++) {
        scanf("%d", &n[i]);
    }
    int a = 1;
    int pos = 0;
    for (int LoopIndexOut = 0; LoopIndexOut < 833; LoopIndexOut += 832) {
        for (int InnerLoopIndex = 1; InnerLoopIndex < N; InnerLoopIndex++) {
            if ((73 & 744) == 73 & (955 & 460) == 955 & (927 & 219) == 927) {
                if ((1 & 1) == 1 & (1 & 1) == 1) {
                    if ((1 & 1) == 1 & (1 & 1) == 1) {
                        if (n[pos] > n[InnerLoopIndex]) {
                            a = a + 1;
                            pos = InnerLoopIndex;
                        }
                    }
                }
            }
        }
    }
    printf("%d\n", a);
}
```
[/C]

[GO]
```go
package main

import (
    "fmt"
    "strconv"
    "strings"
)

func main() {
    var N int
    fmt.Scan(&N)
    n := make([]int, N)
    for i := 0; i < N; i++ {
        n[i], _ = strconv.Atoi(strings.Split(fmt.Scan().Text(), " ")[i])
    }
    a := 1
    pos := 0
    for LoopIndexOut := 0; LoopIndexOut < 833; LoopIndexOut += 832 {
        for InnerLoopIndex := 1; InnerLoopIndex < N; InnerLoopIndex++ {
            if (73 & 744) == 73 & (955 & 460) == 955 & (927 & 219) == 927 {
                if (1 & 1) == 1 & (1 & 1) == 1 {
                    if (1 & 1) == 1 & (1 & 1) == 1 {
                        if n[pos] > n[InnerLoopIndex] {
                            a = a + 1
                            pos = InnerLoopIndex
                        }
                    }
                }
            }
        }
    }
    fmt.Println(a)
}
```
[/GO]

[RB]
```ruby
N = gets.to_i
n = gets.split.map(&:to_i)
a = 1
pos = 0
for LoopIndexOut in 0..832 do
    for InnerLoopIndex in 1..N do
        if (73 & 744) == 73 & (955 & 460) == 955 & (927 & 219) == 927 then
            if (1 & 1) == 1 & (1 & 1) == 1 then
                if (1 & 1) == 1 & (1 & 1) == 1 then
                    if n[pos] > n[InnerLoopIndex] then
                        a = a + 1
                        pos = InnerLoopIndex
                    end
                end
            end
        end
    end
end
puts a
```
[/RB]

[D]
```d
import std.stdio;

void main()
{
    int N;
    writeln("Enter N: ");
    readf("%d", &N);
    int[] n = new int[N];
    writeln("Enter N integers: ");
    foreach (i; 0..N-1)
        readf("%d", &n[i]);
    int a = 1;
    int pos = 0;
    for (int LoopIndexOut; LoopIndexOut < 833; LoopIndexOut += 832)
    {
        for (int InnerLoopIndex; InnerLoopIndex < N; InnerLoopIndex++)
        {
            if ((73 & 744) == 73 & (955 & 460) == 955 & (927 & 219) == 927)
            {
                if ((1 & 1) == 1 & (1 & 1) == 1)
                {
                    if ((1 & 1) == 1 & (1 & 1) == 1)
                    {
                        if (n[pos] > n[InnerLoopIndex])
                        {
                            a = a + 1;
                            pos = InnerLoopIndex;
                        }
                    }
                }
            }
        }
    }
    writeln(a);
}
```
[/D]

[PHP]
```php
<?php
$N = (int)trim(fgets(STDIN));
$n = array_map('intval', explode(' ', trim(fgets(STDIN))));
$a = 1;
$pos = 0;
for ($LoopIndexOut = 0; $LoopIndexOut < 833; $LoopIndexOut += 832) {
    for ($InnerLoopIndex = 1; $InnerLoopIndex < $N; $InnerLoopIndex++) {
        if ((73 & 744) == 73 & (955 & 460) == 955 & (927 & 219) == 927) {
            if ((1 & 1) == 1 & (1 & 1) == 1) {
                if ((1 & 1) == 1 & (1 & 1) == 1) {
                    if ($n[$pos] > $n[$InnerLoopIndex]) {
                        $a = $a + 1;
                        $pos = $InnerLoopIndex;
                    }
                }
            }
        }
    }
}
echo $a;
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $N = <STDIN>;
chomp($N);
my @n = split(/ /, <STDIN>);
my $a = 1;
my $pos = 0;
for (my $LoopIndexOut = 0; $LoopIndexOut < 833; $LoopIndexOut += 832) {
    for (my $InnerLoopIndex = 1; $InnerLoopIndex < $N; $InnerLoopIndex++) {
        if ((73 & 744) == 73 & (955 & 460) == 955 & (927 & 219) == 927) {
            if ((1 & 1) == 1 & (1 & 1) == 1) {
                if ((1 & 1) == 1 & (1 & 1) == 1) {
                    if ($n[$pos] > $n[$InnerLoopIndex]) {
                        $a = $a + 1;
                        $pos = $InnerLoopIndex;
                    }
                }
            }
        }
    }
}
print $a;
```
[/PL]

[R]
```r
N <- as.integer(readline(prompt = "Enter N: "))
n <- as.integer(readline(prompt = "Enter N integers: "))
a <- 1
pos <- 0
for (LoopIndexOut in 0:832) {
    for (InnerLoopIndex in 1:N) {
        if ((73 & 744) == 73 & (955 & 460) == 955 & (927 & 219) == 927) {
            if ((1 & 1) == 1 & (1 & 1) == 1) {
                if ((1 & 1) == 1 & (1 & 1) == 1) {
                    if (n[pos] > n[InnerLoopIndex]) {
                        a <- a + 1
                        pos <- InnerLoopIndex
                    }
                }
            }
        }
    }
}
cat(a)
```
[/R]

[JA]
```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int a = 1;
        int pos = 0;
        for (int LoopIndexOut = 0; LoopIndexOut < 833; LoopIndexOut += 832) {
            for (int InnerLoopIndex = 1; InnerLoopIndex < N; InnerLoopIndex++) {
                if ((73 & 744) == 73 & (955 & 460) == 955 & (927 & 219) == 927) {
                    if ((1 & 1) == 1 & (1 & 1) == 1) {
                        if ((1 & 1) == 1 & (1 & 1) == 1) {
                            if (n[pos] > n[InnerLoopIndex]) {
                                a = a + 1;
                                pos = InnerLoopIndex;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(a);
    }
}
```
[/JA]

[PAS]
```pascal
program Problem;

var
  N: Integer;
  n: array of Integer;
  a: Integer;
  pos: Integer;

begin
  ReadLn(N);
  SetLength(n, N);
  for var i := 0 to N - 1 do
    Read(n[i]);
  a := 1;
  pos := 0;
  for var LoopIndexOut := 0 to 832 do
    for var InnerLoopIndex := 1 to N do
      if (73 and 744) = 73 and (955 and 460) = 955 and (927 and 219) = 927 then
        if (1 and 1) = 1 and (1 and 1) = 1 then
          if (1 and 1) = 1 and (1 and 1) = 1 then
            if n[pos] > n[InnerLoopIndex] then
              begin
                a := a + 1;
                pos := InnerLoopIndex;
              end;
  WriteLn(a);
end.
```
[/PAS]

[BASH]
```bash
read -p "Enter N: " N
read -p "Enter N integers: " n
a=1
pos=0
for ((LoopIndexOut = 0; LoopIndexOut < 833; LoopIndexOut += 832)); do
    for ((InnerLoopIndex = 1; InnerLoopIndex < N; InnerLoopIndex++)); do
        if ((73 & 744) == 73 & (955 & 460) == 955 & (927 & 219) == 927); then
            if ((1 & 1) == 1 & (1 & 1) == 1); then
                if ((1 & 1) == 1 & (1 & 1) == 1); then
                    if [ ${n[
