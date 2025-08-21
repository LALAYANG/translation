
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstInput = sc.nextInt();
        int b = sc.nextInt();
        int result = 1;
        int i = 0;
        boolean check = true;
        while (check) {
            int CheckerOneTen = 13;
            int CheckerTwoTen = 593;
            int CheckerOneEight = 988;
            int CheckerTwoEight = 976;
            int CheckerOneSix = 29;
            int CheckerTwoSix = 406;
            int IncrementVariable = 1;
            if (CheckerOneTen & CheckerTwoTen) {
                if (CheckerOneEight & CheckerTwoEight) {
                    if (CheckerOneSix & CheckerTwoSix) {
                        if (result >= b) {
                            check = false;
                        } else {
                            result = calculateResult(i, IncrementVariable, firstInput);
                            i = i + 1;
                        }
                    }
                }
            }
        }
        System.out.println(i);
    }

    public static int calculateResult(int i, int IncrementVariable, int firstInput) {
        return firstInput * (i + IncrementVariable) - i;
    }
}
```
[/JAV]

[PYT]
```python
firstInput, b = map(int, input().split())
result = 1
i = 0
check = True
while check:
    CheckerOneTen = 13
    CheckerTwoTen = 593
    CheckerOneEight = 988
    CheckerTwoEight = 976
    CheckerOneSix = 29
    CheckerTwoSix = 406
    IncrementVariable = 1
    if CheckerOneTen & CheckerTwoTen:
        if CheckerOneEight & CheckerTwoEight:
            if CheckerOneSix & CheckerTwoSix:
                if result >= b:
                    check = False
                else:
                    result = calculateResult(i, IncrementVariable, firstInput)
                    i = i + 1
print(i)
```
[/PYT]

[CPP]
```cpp
#include <iostream>
using namespace std;

int calculateResult(int i, int IncrementVariable, int firstInput) {
    return firstInput * (i + IncrementVariable) - i;
}

int main() {
    int firstInput, b;
    cin >> firstInput >> b;
    int result = 1;
    int i = 0;
    bool check = true;
    while (check) {
        int CheckerOneTen = 13;
        int CheckerTwoTen = 593;
        int CheckerOneEight = 988;
        int CheckerTwoEight = 976;
        int CheckerOneSix = 29;
        int CheckerTwoSix = 406;
        int IncrementVariable = 1;
        if (CheckerOneTen & CheckerTwoTen) {
            if (CheckerOneEight & CheckerTwoEight) {
                if (CheckerOneSix & CheckerTwoSix) {
                    if (result >= b) {
                        check = false;
                    } else {
                        result = calculateResult(i, IncrementVariable, firstInput);
                        i = i + 1;
                    }
                }
            }
        }
    }
    cout << i;
}
```
[/CPP]

[C]
```c
#include <stdio.h>

int calculateResult(int i, int IncrementVariable, int firstInput) {
    return firstInput * (i + IncrementVariable) - i;
}

int main() {
    int firstInput, b;
    scanf("%d %d", &firstInput, &b);
    int result = 1;
    int i = 0;
    int check = 1;
    while (check) {
        int CheckerOneTen = 13;
        int CheckerTwoTen = 593;
        int CheckerOneEight = 988;
        int CheckerTwoEight = 976;
        int CheckerOneSix = 29;
        int CheckerTwoSix = 406;
        int IncrementVariable = 1;
        if (CheckerOneTen & CheckerTwoTen) {
            if (CheckerOneEight & CheckerTwoEight) {
                if (CheckerOneSix & CheckerTwoSix) {
                    if (result >= b) {
                        check = 0;
                    } else {
                        result = calculateResult(i, IncrementVariable, firstInput);
                        i = i + 1;
                    }
                }
            }
        }
    }
    printf("%d", i);
}
```
[/C]

[PHP]
```php
<?php
$firstInput = (int)trim(fgets(STDIN));
$b = (int)trim(fgets(STDIN));
$result = 1;
$i = 0;
$check = true;
while ($check) {
    $CheckerOneTen = 13;
    $CheckerTwoTen = 593;
    $CheckerOneEight = 988;
    $CheckerTwoEight = 976;
    $CheckerOneSix = 29;
    $CheckerTwoSix = 406;
    $IncrementVariable = 1;
    if ($CheckerOneTen & $CheckerTwoTen) {
        if ($CheckerOneEight & $CheckerTwoEight) {
            if ($CheckerOneSix & $CheckerTwoSix) {
                if ($result >= $b) {
                    $check = false;
                } else {
                    $result = calculateResult($i, $IncrementVariable, $firstInput);
                    $i = $i + 1;
                }
            }
        }
    }
}
echo $i;

function calculateResult($i, $IncrementVariable, $firstInput) {
    return $firstInput * ($i + $IncrementVariable) - $i;
}
```
[/PHP]

[RUBY]
```ruby
firstInput, b = gets.split.map(&:to_i)
result = 1
i = 0
check = true
while check
    CheckerOneTen = 13
    CheckerTwoTen = 593
    CheckerOneEight = 988
    CheckerTwoEight = 976
    CheckerOneSix = 29
    CheckerTwoSix = 406
    IncrementVariable = 1
    if CheckerOneTen & CheckerTwoTen
        if CheckerOneEight & CheckerTwoEight
            if CheckerOneSix & CheckerTwoSix
                if result >= b
                    check = false
                else
                    result = calculateResult(i, IncrementVariable, firstInput)
                    i = i + 1
                end
            end
        end
    end
end
puts i

def calculateResult(i, IncrementVariable, firstInput)
    return firstInput * (i + IncrementVariable) - i
end
```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
)

func calculateResult(i int, IncrementVariable int, firstInput int) int {
    return firstInput * (i + IncrementVariable) - i
}

func main() {
    var firstInput, b int
    fmt.Scan(&firstInput, &b)
    var result int = 1
    var i int = 0
    var check bool = true
    for check {
        var CheckerOneTen int = 13
        var CheckerTwoTen int = 593
        var CheckerOneEight int = 988
        var CheckerTwoEight int = 976
        var CheckerOneSix int = 29
        var CheckerTwoSix int = 406
        var IncrementVariable int = 1
        if CheckerOneTen & CheckerTwoTen {
            if CheckerOneEight & CheckerTwoEight {
                if CheckerOneSix & CheckerTwoSix {
                    if result >= b {
                        check = false
                    } else {
                        result = calculateResult(i, IncrementVariable, firstInput)
                        i = i + 1
                    }
                }
            }
        }
    }
    fmt.Println(i)
}
```
[/GO]

[BASH]
```bash
read firstInput b
result=1
i=0
check=true
while [ $check = true ]
do
    CheckerOneTen=13
    CheckerTwoTen=593
    CheckerOneEight=988
    CheckerTwoEight=976
    CheckerOneSix=29
    CheckerTwoSix=406
    IncrementVariable=1
    if [ $CheckerOneTen -a $CheckerTwoTen ]
    then
        if [ $CheckerOneEight -a $CheckerTwoEight ]
        then
            if [ $CheckerOneSix -a $CheckerTwoSix ]
            then
                if [ $result -ge $b ]
                then
                    check=false
                else
                    result=$(calculateResult $i $IncrementVariable $firstInput)
                    i=$((i + 1))
                fi
            fi
        fi
    fi
done
echo $i

calculateResult() {
    echo $(($1 * ($2 + $3) - $1))
}
```
[/BASH]

[PERL]
```perl
use strict;
use warnings;

my $firstInput = <STDIN>;
chomp($firstInput);
my $b = <STDIN>;
chomp($b);
my $result = 1;
my $i = 0;
my $check = 1;
while ($check) {
    my $CheckerOneTen = 13;
    my $CheckerTwoTen = 593;
    my $CheckerOneEight = 988;
    my $CheckerTwoEight = 976;
    my $CheckerOneSix = 29;
    my $CheckerTwoSix = 406;
    my $IncrementVariable = 1;
    if ($CheckerOneTen & $CheckerTwoTen) {
        if ($CheckerOneEight & $CheckerTwoEight) {
            if ($CheckerOneSix & $CheckerTwoSix) {
                if ($result >= $b) {
                    $check = 0;
                } else {
                    $result = calculateResult($i, $IncrementVariable, $firstInput);
                    $i = $i + 1;
                }
            }
        }
    }
}
print $i;

sub calculateResult {
    my ($i, $IncrementVariable, $firstInput) = @_;
    return $firstInput * ($i + $IncrementVariable) - $i;
}
```
[/PERL]

[ELIXIR]
```elixir
firstInput = String.to_integer(IO.gets(""))
b = String.to_integer(IO.gets(""))
result = 1
i = 0
check = true
while check do
    CheckerOneTen = 13
    CheckerTwoTen = 593
    CheckerOneEight = 988
    CheckerTwoEight = 976
    CheckerOneSix = 29
    CheckerTwoSix = 406
    IncrementVariable = 1
    if CheckerOneTen &&& CheckerTwoTen do
        if CheckerOneEight &&& CheckerTwoEight do
            if CheckerOneSix &&& CheckerTwoSix do
                if result >= b do
                    check = false
                else
                    result = calculateResult(i, IncrementVariable, firstInput)
                    i = i + 1
                end
            end
        end
    end
end
IO.puts(i)

def calculateResult(i, IncrementVariable, firstInput) do
    firstInput * (i + IncrementVariable) - i
end
```
[/ELIXIR]

[JULIA]
```julia
firstInput = parse(Int, readline())
b = parse(Int, readline())
result = 1
i = 0
check = true
while check
    CheckerOneTen = 13
    CheckerTwoTen = 593
    CheckerOneEight = 988
    CheckerTwoEight = 976
    CheckerOneSix = 29
    CheckerTwoSix = 406
    IncrementVariable = 1
    if CheckerOneTen & CheckerTwoTen
        if CheckerOneEight & CheckerTwoEight
            if CheckerOneSix & CheckerTwoSix
                if result >= b
                    check = false
                else
                    result = calculateResult(i, IncrementVariable, firstInput)
                    i = i + 1
                end
            end
        end
    end
end
println(i)

function calculateResult(i, IncrementVariable, firstInput)
    return firstInput * (i + IncrementVariable) - i
end
```
[/JULIA]

[LUA]
```lua
firstInput = io.read("*n")
b = io.read("*n")
result = 1
i = 0
check = true
while check do
    CheckerOneTen = 13
    CheckerTwoTen = 593
    CheckerOneEight = 988
    CheckerTwoEight = 976
    CheckerOneSix = 29
    CheckerTwoSix = 406
    IncrementVariable = 1
    if CheckerOneTen & CheckerTwoTen then
        if CheckerOneEight & CheckerTwoEight then
            if CheckerOneSix & CheckerTwoSix then
                if result >= b then
                    check = false
                else
                    result = calculateResult(i, IncrementVariable, firstInput)
                    i = i + 1
                end
            end
        end
    end
end
print(i)

function calculateResult(i, IncrementVariable, firstInput)
    return firstInput * (i + IncrementVariable) - i
end
```
[/LUA]

[D]
```d
import std.stdio;

int calculateResult(int i, int IncrementVariable, int firstInput) {
    return firstInput * (i + IncrementVariable) - i;
}

void main() {
    int firstInput, b;
    auto result = 1;
    auto i = 0;
    auto check = true;
    while (check) {
        int CheckerOneT
