
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hole = 1;
        int counter = 0;
        boolean check = true;
        while (check) {
            int bitmaskA = 63;
            int operandC = 643;
            int operandA = 598;
            int operandB = 943;
            int bitmaskC = 368;
            int operandD = 383;
            if ((bitmaskA & operandC) != 0) {
                if ((operandA & operandB) != 0) {
                    if ((bitmaskC & operandD) != 0) {
                        if (hole >= b) {
                            check = false;
                        } else {
                            hole = a * (counter + 1) - counter;
                            counter += 1;
                        }
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
```
[/JAV]

[PYT]
```py
a, b = map(int, input().split())
hole = 1
counter = 0
check = True
while check:
    bitmaskA = 63
    operandC = 643
    operandA = 598
    operandB = 943
    bitmaskC = 368
    operandD = 383
    if bitmaskA & operandC:
        if operandA & operandB:
            if bitmaskC & operandD:
                if hole >= b:
                    check = False
                else:
                    hole = a * (counter + 1) - counter
                    counter += 1
print(counter)
```
[/PYT]

[C++]
```cpp
#include <iostream>
using namespace std;

int main() {
    int a, b;
    cin >> a >> b;
    int hole = 1;
    int counter = 0;
    bool check = true;
    while (check) {
        int bitmaskA = 63;
        int operandC = 643;
        int operandA = 598;
        int operandB = 943;
        int bitmaskC = 368;
        int operandD = 383;
        if (bitmaskA & operandC) {
            if (operandA & operandB) {
                if (bitmaskC & operandD) {
                    if (hole >= b) {
                        check = false;
                    } else {
                        hole = a * (counter + 1) - counter;
                        counter += 1;
                    }
                }
            }
        }
    }
    cout << counter << endl;
}
```
[/C++]

[C]
```c
#include <stdio.h>

int main() {
    int a, b;
    scanf("%d %d", &a, &b);
    int hole = 1;
    int counter = 0;
    _Bool check = true;
    while (check) {
        int bitmaskA = 63;
        int operandC = 643;
        int operandA = 598;
        int operandB = 943;
        int bitmaskC = 368;
        int operandD = 383;
        if (bitmaskA & operandC) {
            if (operandA & operandB) {
                if (bitmaskC & operandD) {
                    if (hole >= b) {
                        check = false;
                    } else {
                        hole = a * (counter + 1) - counter;
                        counter += 1;
                    }
                }
            }
        }
    }
    printf("%d\n", counter);
}
```
[/C]

[PHP]
```php
<?php
$a = (int)trim(fgets(STDIN));
$b = (int)trim(fgets(STDIN));
$hole = 1;
$counter = 0;
$check = true;
while ($check) {
    $bitmaskA = 63;
    $operandC = 643;
    $operandA = 598;
    $operandB = 943;
    $bitmaskC = 368;
    $operandD = 383;
    if ($bitmaskA & $operandC) {
        if ($operandA & $operandB) {
            if ($bitmaskC & $operandD) {
                if ($hole >= $b) {
                    $check = false;
                } else {
                    $hole = $a * ($counter + 1) - $counter;
                    $counter += 1;
                }
            }
        }
    }
}
echo $counter;
```
[/PHP]

[RUBY]
```ruby
a, b = gets.split.map(&:to_i)
hole = 1
counter = 0
check = true
while check
    bitmaskA = 63
    operandC = 643
    operandA = 598
    operandB = 943
    bitmaskC = 368
    operandD = 383
    if (bitmaskA & operandC) != 0
        if (operandA & operandB) != 0
            if (bitmaskC & operandD) != 0
                if hole >= b
                    check = false
                else
                    hole = a * (counter + 1) - counter
                    counter += 1
                end
            end
        end
    end
end
puts counter
```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
)

func main() {
    var a, b int
    fmt.Scan(&a, &b)
    hole := 1
    counter := 0
    check := true
    for check {
        bitmaskA := 63
        operandC := 643
        operandA := 598
        operandB := 943
        bitmaskC := 368
        operandD := 383
        if bitmaskA&operandC != 0 {
            if operandA&operandB != 0 {
                if bitmaskC&operandD != 0 {
                    if hole >= b {
                        check = false
                    } else {
                        hole = a * (counter + 1) - counter
                        counter += 1
                    }
                }
            }
        }
    }
    fmt.Println(counter)
}
```
[/GO]

[BASH]
```bash
read a b
hole=1
counter=0
check=true
while $check
do
    bitmaskA=63
    operandC=643
    operandA=598
    operandB=943
    bitmaskC=368
    operandD=383
    if [ $(($bitmaskA & $operandC)) -ne 0 ]
    then
        if [ $(($operandA & $operandB)) -ne 0 ]
        then
            if [ $(($bitmaskC & $operandD)) -ne 0 ]
            then
                if [ $hole -ge $b ]
                then
                    check=false
                else
                    hole=$(($a * $(($counter + 1)) - $counter))
                    counter=$((counter + 1))
                fi
            fi
        fi
    fi
done
echo $counter
```
[/BASH]

[PERL]
```perl
use strict;
use warnings;

my $a = <STDIN>;
chomp($a);
my $b = <STDIN>;
chomp($b);
my $hole = 1;
my $counter = 0;
my $check = true;
while ($check) {
    my $bitmaskA = 63;
    my $operandC = 643;
    my $operandA = 598;
    my $operandB = 943;
    my $bitmaskC = 368;
    my $operandD = 383;
    if ($bitmaskA & $operandC) {
        if ($operandA & $operandB) {
            if ($bitmaskC & $operandD) {
                if ($hole >= $b) {
                    $check = false;
                } else {
                    $hole = $a * ($counter + 1) - $counter;
                    $counter += 1;
                }
            }
        }
    }
}
print $counter;
```
[/PERL]

[PASCAL]
```pascal
program Problem;
var
    a, b, hole, counter: integer;
    check: boolean;
begin
    read(a, b);
    hole := 1;
    counter := 0;
    check := true;
    while check do
    begin
        bitmaskA := 63;
        operandC := 643;
        operandA := 598;
        operandB := 943;
        bitmaskC := 368;
        operandD := 383;
        if (bitmaskA and operandC) <> 0 then
            if (operandA and operandB) <> 0 then
                if (bitmaskC and operandD) <> 0 then
                    if hole >= b then
                        check := false
                    else
                    begin
                        hole := a * (counter + 1) - counter;
                        counter += 1;
                    end;
    end;
    writeln(counter);
end.
```
[/PASCAL]

[JULIA]
```julia
a, b = parse.(Int, split(readline()))
hole = 1
counter = 0
check = true
while check
    bitmaskA = 63
    operandC = 643
    operandA = 598
    operandB = 943
    bitmaskC = 368
    operandD = 383
    if (bitmaskA & operandC) != 0
        if (operandA & operandB) != 0
            if (bitmaskC & operandD) != 0
                if hole >= b
                    check = false
                else
                    hole = a * (counter + 1) - counter
                    counter += 1
                end
            end
        end
    end
end
println(counter)
```
[/JULIA]

[LUA]
```lua
a, b = io.read("*n"), io.read("*n")
hole = 1
counter = 0
check = true
while check do
    bitmaskA = 63
    operandC = 643
    operandA = 598
    operandB = 943
    bitmaskC = 368
    operandD = 383
    if bit32.band(bitmaskA, operandC) ~= 0 then
        if bit32.band(operandA, operandB) ~= 0 then
            if bit32.band(bitmaskC, operandD) ~= 0 then
                if hole >= b then
                    check = false
                else
                    hole = a * (counter + 1) - counter
                    counter += 1
                end
            end
        end
    end
end
print(counter)
```
[/LUA]

[MATLAB]
```matlab
a = input('');
b = input('');
hole = 1;
counter = 0;
check = true;
while check
    bitmaskA = 63;
    operandC = 643;
    operandA = 598;
    operandB = 943;
    bitmaskC = 368;
    operandD = 383;
    if bitand(bitmaskA, operandC) ~= 0
        if bitand(operandA, operandB) ~= 0
            if bitand(bitmaskC, operandD) ~= 0
                if hole >= b
                    check = false;
                else
                    hole = a * (counter + 1) - counter;
                    counter += 1;
                end
            end
        end
    end
end
disp(counter)
```
[/MATLAB]

[OBJECTIVE-C]
```objectivec
#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int a, b;
        scanf("%d %d", &a, &b);
        int hole = 1;
        int counter = 0;
        bool check = true;
        while (check) {
            int bitmaskA = 63;
            int operandC = 643;
            int operandA = 598;
            int operandB = 943;
            int bitmaskC = 368;
            int operandD = 383;
            if (bitmaskA & operandC) {
                if (operandA & operandB) {
                    if (bitmaskC & operandD) {
                        if (hole >= b) {
                            check = false;
                        } else {
                            hole = a * (counter + 1) - counter;
                            counter += 1;
                        }
                    }
                }
            }
        }
        printf("%d\n", counter);
    }
    return 0;
}
```
[/OBJECTIVE-C]

[R]
```r
a <- scan()
b <- scan()
hole <- 1
counter <- 0
check <- TRUE
while (check) {
    bitmaskA <- 63
    operandC <- 643
    operandA <- 598
    operandB <- 943
    bitmaskC <- 368
    operandD <- 383
    if (bitmaskA & operandC) {
        if (operandA & operandB) {
            if (bitmaskC & operandD) {
                if (hole >= b) {
                    check <- FALSE
                } else {
                    hole <- a * (counter + 1) - counter
                    counter <- counter + 1
                }
            }
        }
    }
}
cat(counter)
```
[/R]

[SCALA]
```scala
object Main {
    def main(args: Array[String]) {
        val a = scala.io.StdIn.readInt()
        val b = scala.io.StdIn.readInt()
        var hole = 1
        var counter = 0
        var check = true
        while (check) {
            val bitmaskA = 63
            val operandC = 643
            val operandA = 598
            val operandB = 943
            val bitmaskC = 368
            val operandD = 
