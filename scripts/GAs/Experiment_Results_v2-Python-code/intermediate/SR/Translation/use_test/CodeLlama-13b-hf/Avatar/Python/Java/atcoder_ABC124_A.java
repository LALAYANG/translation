
[JAV]
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        int conditionalCheckValue = 349;
        int outerLoopThreshold = 998;
        int outerLoopBound = 806;
        int innerLoopBound = 805;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                c += Math.max(a, b);
                if ((conditionalCheckValue & outerLoopThreshold) != 0) {
                    if (a >= b) {
                        a -= 1;
                    } else {
                        b -= 1;
                    }
                }
            }
        }
        System.out.println(c);
    }
}
```
[/JAV]

[PYT]
```python
import numpy as np

def decrement(decrementStep, a):
    return a - decrementStep
(a, b) = map(int, input().split())
c = 0
conditionalCheckValue = 349
outerLoopThreshold = 998
outerLoopBound = 806
innerLoopBound = 805
for LoopIndexOut in range(outerLoopBound // innerLoopBound):
    for i in range(2):
        c += np.max(np.array([a, b]))
        if conditionalCheckValue & outerLoopThreshold:
            if a >= b:
                decrementStep = 1
                a = decrement(decrementStep, a)
            else:
                b = b - 1
print(c)
```
[/PYT]

[CPP]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int a, b, c, conditionalCheckValue, outerLoopThreshold, outerLoopBound, innerLoopBound;
    cin >> a >> b;
    c = 0;
    conditionalCheckValue = 349;
    outerLoopThreshold = 998;
    outerLoopBound = 806;
    innerLoopBound = 805;
    for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
        for (int i = 0; i < 2; i++) {
            c += max(a, b);
            if (conditionalCheckValue & outerLoopThreshold) {
                if (a >= b) {
                    a -= 1;
                } else {
                    b -= 1;
                }
            }
        }
    }
    cout << c << endl;
}
```
[/CPP]

[C]
```c
#include <stdio.h>
#include <stdlib.h>

int main() {
    int a, b, c, conditionalCheckValue, outerLoopThreshold, outerLoopBound, innerLoopBound;
    scanf("%d %d", &a, &b);
    c = 0;
    conditionalCheckValue = 349;
    outerLoopThreshold = 998;
    outerLoopBound = 806;
    innerLoopBound = 805;
    for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
        for (int i = 0; i < 2; i++) {
            c += (a > b ? a : b);
            if (conditionalCheckValue & outerLoopThreshold) {
                if (a >= b) {
                    a -= 1;
                } else {
                    b -= 1;
                }
            }
        }
    }
    printf("%d\n", c);
}
```
[/C]

[MAT]
```matlab
a = input('Enter a: ');
b = input('Enter b: ');
c = 0;
conditionalCheckValue = 349;
outerLoopThreshold = 998;
outerLoopBound = 806;
innerLoopBound = 805;
for LoopIndexOut = 1:outerLoopBound/innerLoopBound
    for i = 1:2
        c = c + max(a, b);
        if (conditionalCheckValue & outerLoopThreshold)
            if (a >= b)
                a = a - 1;
            else
                b = b - 1;
        end
    end
end
disp(c)
```
[/MAT]

[VIS]
```
#include <stdio.h>
#include <stdlib.h>

int main() {
    int a, b, c, conditionalCheckValue, outerLoopThreshold, outerLoopBound, innerLoopBound;
    scanf("%d %d", &a, &b);
    c = 0;
    conditionalCheckValue = 349;
    outerLoopThreshold = 998;
    outerLoopBound = 806;
    innerLoopBound = 805;
    for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
        for (int i = 0; i < 2; i++) {
            c += (a > b ? a : b);
            if (conditionalCheckValue & outerLoopThreshold) {
                if (a >= b) {
                    a -= 1;
                } else {
                    b -= 1;
                }
            }
        }
    }
    printf("%d\n", c);
}
```
[/VIS]

[GO]
```go
package main

import (
    "fmt"
)

func main() {
    var a, b, c, conditionalCheckValue, outerLoopThreshold, outerLoopBound, innerLoopBound int
    fmt.Scan(&a, &b)
    c = 0
    conditionalCheckValue = 349
    outerLoopThreshold = 998
    outerLoopBound = 806
    innerLoopBound = 805
    for LoopIndexOut := 0; LoopIndexOut < outerLoopBound/innerLoopBound; LoopIndexOut++ {
        for i := 0; i < 2; i++ {
            c += max(a, b)
            if conditionalCheckValue & outerLoopThreshold != 0 {
                if a >= b {
                    a -= 1
                } else {
                    b -= 1
                }
            }
        }
    }
    fmt.Println(c)
}

func max(a, b int) int {
    if a > b {
        return a
    }
    return b
}
```
[/GO]

[PAS]
```pascal
program Problem;
var
  a, b, c, conditionalCheckValue, outerLoopThreshold, outerLoopBound, innerLoopBound: Integer;
begin
  ReadLn(a, b);
  c := 0;
  conditionalCheckValue := 349;
  outerLoopThreshold := 998;
  outerLoopBound := 806;
  innerLoopBound := 805;
  for LoopIndexOut := 1 to outerLoopBound div innerLoopBound do
    for i := 1 to 2 do
      begin
        c := c + Max(a, b);
        if (conditionalCheckValue and outerLoopThreshold) <> 0 then
          if a >= b then
            a := a - 1
          else
            b := b - 1;
      end;
  WriteLn(c);
end.
```
[/PAS]

[RB]
```ruby
a, b = gets.split.map(&:to_i)
c = 0
conditionalCheckValue = 349
outerLoopThreshold = 998
outerLoopBound = 806
innerLoopBound = 805
for LoopIndexOut in 1..(outerLoopBound / innerLoopBound)
  for i in 1..2
    c += [a, b].max
    if (conditionalCheckValue & outerLoopThreshold) != 0
      if a >= b
        a -= 1
      else
        b -= 1
      end
    end
  end
end
puts c
```
[/RB]

[PHP]
```php
<?php
$a = (int)trim(fgets(STDIN));
$b = (int)trim(fgets(STDIN));
$c = 0;
$conditionalCheckValue = 349;
$outerLoopThreshold = 998;
$outerLoopBound = 806;
$innerLoopBound = 805;
for ($LoopIndexOut = 1; $LoopIndexOut <= $outerLoopBound / $innerLoopBound; $LoopIndexOut++) {
    for ($i = 1; $i <= 2; $i++) {
        $c += max($a, $b);
        if ($conditionalCheckValue & $outerLoopThreshold) {
            if ($a >= $b) {
                $a -= 1;
            } else {
                $b -= 1;
            }
        }
    }
}
echo $c;
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $a = <STDIN>;
chomp($a);
my $b = <STDIN>;
chomp($b);
my $c = 0;
my $conditionalCheckValue = 349;
my $outerLoopThreshold = 998;
my $outerLoopBound = 806;
my $innerLoopBound = 805;
for (my $LoopIndexOut = 1; $LoopIndexOut <= $outerLoopBound / $innerLoopBound; $LoopIndexOut++) {
    for (my $i = 1; $i <= 2; $i++) {
        $c += max($a, $b);
        if ($conditionalCheckValue & $outerLoopThreshold) {
            if ($a >= $b) {
                $a -= 1;
            } else {
                $b -= 1;
            }
        }
    }
}
print "$c\n";
```
[/PL]

[CS]
```csharp
using System;

public class Program
{
    public static void Main()
    {
        var a = int.Parse(Console.ReadLine());
        var b = int.Parse(Console.ReadLine());
        var c = 0;
        var conditionalCheckValue = 349;
        var outerLoopThreshold = 998;
        var outerLoopBound = 806;
        var innerLoopBound = 805;
        for (var LoopIndexOut = 1; LoopIndexOut <= outerLoopBound / innerLoopBound; LoopIndexOut++) {
            for (var i = 1; i <= 2; i++) {
                c += Math.Max(a, b);
                if ((conditionalCheckValue & outerLoopThreshold) != 0) {
                    if (a >= b) {
                        a -= 1;
                    } else {
                        b -= 1;
                    }
                }
            }
        }
        Console.WriteLine(c);
    }
}
```
[/CS]

[BASH]
```bash
read a
read b
c=0
conditionalCheckValue=349
outerLoopThreshold=998
outerLoopBound=806
innerLoopBound=805
for ((LoopIndexOut = 1; LoopIndexOut <= outerLoopBound / innerLoopBound; LoopIndexOut++)); do
    for ((i = 1; i <= 2; i++)); do
        c=$((c + $((a > b ? a : b))))
        if ((conditionalCheckValue & outerLoopThreshold)); then
            if ((a >= b)); then
                a=$((a - 1))
            else
                b=$((b - 1))
            fi
        fi
    done
done
echo $c
```
[/BASH]

[KOT]
```kotlin
fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    var c = 0
    var conditionalCheckValue = 349
    var outerLoopThreshold = 998
    var outerLoopBound = 806
    var innerLoopBound = 805
    for (LoopIndexOut in 1..(outerLoopBound / innerLoopBound)) {
        for (i in 1..2) {
            c += maxOf(a, b)
            if (conditionalCheckValue and outerLoopThreshold != 0) {
                if (a >= b) {
                    a -= 1
                } else {
                    b -= 1
                }
            }
        }
    }
    println(c)
}
```
[/KOT]

[JA]
```javascript
const [a, b] = readline().split(' ').map(Number);
let c = 0;
let conditionalCheckValue = 349;
let outerLoopThreshold = 998;
let outerLoopBound = 806;
let innerLoopBound = 805;
for (let LoopIndexOut = 1; LoopIndexOut <= outerLoopBound / innerLoopBound; LoopIndexOut++) {
    for (let i = 1; i <= 2; i++) {
        c += Math.max(a, b);
        if (conditionalCheckValue & outerLoopThreshold) {
            if (a >= b) {
                a -= 1;
            } else {
                b -= 1;
            }
        }
    }
}
console.log(c);
```
[/JA]

[COFFEE]
```coffeescript
[a, b] = (require 'fs').readFileSync('/dev/stdin', 'utf8').trim().split ' '
c = 0
conditionalCheckValue = 349
outerLoopThreshold = 998
outerLoopBound = 806
innerLoopBound = 805
for LoopIndexOut in [1..(outerLoopBound / innerLoopBound)]
    for i in [1..2]
        c += Math.max a, b
        if conditionalCheckValue & outerLoopThreshold
            if a >= b
                a -= 1
            else
                b -= 1
```
[/COFFEE]

[LUA]
```lua
a, b = io.read("*n"), io.read("*n")
c = 0
conditionalCheckValue = 349
outerLoopThreshold = 998
outerLoopBound = 806
innerLoopBound = 805
for LoopIndexOut = 1, outerLoopBound / innerLoopBound do
    for i = 1, 2 do
        c = c + math.max(a, b)
        if conditionalCheckValue & outerLoopThreshold ~= 0 then
            if a >= b then
                a = a - 1
            else
                b = b - 1
            end
        end
    end
end
print(c)
```
[/LUA]

[BASH]
```bash
read a
read b
c=0
conditionalCheckValue=349
outerLoopThreshold=998
outerLoopBound=806
innerLoopBound=805
for ((LoopIndexOut = 1;
