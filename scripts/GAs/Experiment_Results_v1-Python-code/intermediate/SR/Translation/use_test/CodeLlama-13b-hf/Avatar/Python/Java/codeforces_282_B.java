
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstline = sc.nextInt();
        int total = 0;
        String[] memory = new String[firstline];
        int FirstCondition = 477;
        int SecondCondition = 258;
        int OuterLoopStart = 801;
        int OuterLoopEnd = 800;
        for (int LoopIndexOut = OuterLoopStart / OuterLoopEnd; LoopIndexOut > 0; LoopIndexOut--) {
            int x = 0;
            int stop = firstline;
            int step = 1;

            void RecursiveFunction(int x, int stop, int step) {
                if (step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)) {
                    return;
                }
                int A = sc.nextInt();
                int G = sc.nextInt();
                if (FirstCondition & SecondCondition) {
                    if (total + A <= 500) {
                        total = total + A;
                        memory[x] = "A";
                    } else {
                        total = total - G;
                        memory[x] = "G";
                    }
                }
                RecursiveFunction(x + step, stop, step);
            }
            RecursiveFunction(x, stop, step);
        }
        for (int i = 0; i < firstline; i++) {
            System.out.print(memory[i]);
        }
    }
}
```
[/JAV]

[PYT]
```python
firstline = int(input())
total = 0
memory = []
FirstCondition = 477
SecondCondition = 258
OuterLoopStart = 801
OuterLoopEnd = 800
for LoopIndexOut in range(OuterLoopStart // OuterLoopEnd):

    def RecursiveFunction(x, stop, step):
        global total
        if step == 0 or (step > 0 and x >= stop) or (step < 0 and x <= stop):
            return
        (A, G) = list(map(int, input().split()))
        if FirstCondition & SecondCondition:
            if total + A <= 500:
                total = total + A
                memory.append('A')
            else:
                total = total - G
                memory.append('G')
        RecursiveFunction(x + step, stop, step)
    RecursiveFunction(0, firstline, 1)
print(''.join(memory))
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <string>
using namespace std;

int main() {
    int firstline;
    cin >> firstline;
    int total = 0;
    string memory[firstline];
    int FirstCondition = 477;
    int SecondCondition = 258;
    int OuterLoopStart = 801;
    int OuterLoopEnd = 800;
    for (int LoopIndexOut = OuterLoopStart / OuterLoopEnd; LoopIndexOut > 0; LoopIndexOut--) {
        int x = 0;
        int stop = firstline;
        int step = 1;

        void RecursiveFunction(int x, int stop, int step) {
            if (step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)) {
                return;
            }
            int A, G;
            cin >> A >> G;
            if (FirstCondition & SecondCondition) {
                if (total + A <= 500) {
                    total = total + A;
                    memory[x] = "A";
                } else {
                    total = total - G;
                    memory[x] = "G";
                }
            }
            RecursiveFunction(x + step, stop, step);
        }
        RecursiveFunction(x, stop, step);
    }
    for (int i = 0; i < firstline; i++) {
        cout << memory[i];
    }
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <string.h>

int main() {
    int firstline;
    scanf("%d", &firstline);
    int total = 0;
    char memory[firstline];
    int FirstCondition = 477;
    int SecondCondition = 258;
    int OuterLoopStart = 801;
    int OuterLoopEnd = 800;
    for (int LoopIndexOut = OuterLoopStart / OuterLoopEnd; LoopIndexOut > 0; LoopIndexOut--) {
        int x = 0;
        int stop = firstline;
        int step = 1;

        void RecursiveFunction(int x, int stop, int step) {
            if (step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)) {
                return;
            }
            int A, G;
            scanf("%d %d", &A, &G);
            if (FirstCondition & SecondCondition) {
                if (total + A <= 500) {
                    total = total + A;
                    memory[x] = 'A';
                } else {
                    total = total - G;
                    memory[x] = 'G';
                }
            }
            RecursiveFunction(x + step, stop, step);
        }
        RecursiveFunction(x, stop, step);
    }
    for (int i = 0; i < firstline; i++) {
        printf("%c", memory[i]);
    }
}
```
[/C]

[PHP]
```php
<?php
$firstline = intval(fgets(STDIN));
$total = 0;
$memory = [];
$FirstCondition = 477;
$SecondCondition = 258;
$OuterLoopStart = 801;
$OuterLoopEnd = 800;
for ($LoopIndexOut = $OuterLoopStart / $OuterLoopEnd; $LoopIndexOut > 0; $LoopIndexOut--) {

    function RecursiveFunction($x, $stop, $step) {
        global $total;
        if ($step == 0 || ($step > 0 && $x >= $stop) || ($step < 0 && $x <= $stop)) {
            return;
        }
        list($A, $G) = explode(' ', fgets(STDIN));
        if ($FirstCondition & $SecondCondition) {
            if ($total + $A <= 500) {
                $total = $total + $A;
                $memory[$x] = 'A';
            } else {
                $total = $total - $G;
                $memory[$x] = 'G';
            }
        }
        RecursiveFunction($x + $step, $stop, $step);
    }
    RecursiveFunction(0, $firstline, 1);
}
for ($i = 0; $i < $firstline; $i++) {
    echo $memory[$i];
}
```
[/PHP]

[RUBY]
```ruby
firstline = gets.to_i
total = 0
memory = []
FirstCondition = 477
SecondCondition = 258
OuterLoopStart = 801
OuterLoopEnd = 800
for LoopIndexOut in (OuterLoopStart / OuterLoopEnd).downto(1) do

    def RecursiveFunction(x, stop, step)
        global total
        if step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)
            return
        end
        (A, G) = gets.split.map(&:to_i)
        if FirstCondition & SecondCondition
            if total + A <= 500
                total = total + A
                memory[x] = 'A'
            else
                total = total - G
                memory[x] = 'G'
            end
        end
        RecursiveFunction(x + step, stop, step)
    end
    RecursiveFunction(0, firstline, 1)
end
puts memory.join
```
[/RUBY]

[GO]
```go
package main

import (
	"fmt"
	"strconv"
)

func main() {
	var firstline int
	fmt.Scan(&firstline)
	var total int
	var memory []string
	var FirstCondition int = 477
	var SecondCondition int = 258
	var OuterLoopStart int = 801
	var OuterLoopEnd int = 800
	for LoopIndexOut := OuterLoopStart / OuterLoopEnd; LoopIndexOut > 0; LoopIndexOut-- {

		func RecursiveFunction(x int, stop int, step int) {
			if step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop) {
				return
			}
			var A, G int
			fmt.Scan(&A, &G)
			if FirstCondition&SecondCondition != 0 {
				if total+A <= 500 {
					total = total + A
					memory[x] = "A"
				} else {
					total = total - G
					memory[x] = "G"
				}
			}
			RecursiveFunction(x+step, stop, step)
		}
		RecursiveFunction(0, firstline, 1)
	}
	for i := 0; i < firstline; i++ {
		fmt.Print(memory[i])
	}
}
```
[/GO]

[BASH]
```bash
read firstline
total=0
memory=()
FirstCondition=477
SecondCondition=258
OuterLoopStart=801
OuterLoopEnd=800
for ((LoopIndexOut = OuterLoopStart / OuterLoopEnd; LoopIndexOut > 0; LoopIndexOut--)); do

    RecursiveFunction() {
        if [[ $1 == 0 || (($2 -gt 0 && $1 -ge $2) || ($2 -lt 0 && $1 -le $2)) ]]; then
            return
        fi
        IFS=' ' read -r A G
        if ((FirstCondition & SecondCondition)); then
            if ((total + A <= 500)); then
                ((total += A))
                memory[$1]='A'
            else
                ((total -= G))
                memory[$1]='G'
            fi
        fi
        RecursiveFunction $(( $1 + $3 )) $2 $3
    }
    RecursiveFunction 0 $firstline 1
done
echo ${memory[@]}
```
[/BASH]

[PERL]
```perl
use strict;
use warnings;

my $firstline = <STDIN>;
chomp($firstline);
my $total = 0;
my @memory;
my $FirstCondition = 477;
my $SecondCondition = 258;
my $OuterLoopStart = 801;
my $OuterLoopEnd = 800;
for (my $LoopIndexOut = $OuterLoopStart / $OuterLoopEnd; $LoopIndexOut > 0; $LoopIndexOut--) {

    sub RecursiveFunction {
        my ($x, $stop, $step) = @_;
        if ($step == 0 || ($step > 0 && $x >= $stop) || ($step < 0 && $x <= $stop)) {
            return;
        }
        my ($A, $G) = split(' ', <STDIN>);
        if ($FirstCondition & $SecondCondition) {
            if ($total + $A <= 500) {
                $total = $total + $A;
                $memory[$x] = 'A';
            } else {
                $total = $total - $G;
                $memory[$x] = 'G';
            }
        }
        RecursiveFunction($x + $step, $stop, $step);
    }
    RecursiveFunction(0, $firstline, 1);
}
print join('', @memory);
```
[/PERL]

[ELIXIR]
```elixir
firstline = IO.gets("") |> String.trim() |> String.to_integer()
total = 0
memory = []
FirstCondition = 477
SecondCondition = 258
OuterLoopStart = 801
OuterLoopEnd = 800
for LoopIndexOut <- OuterLoopStart / OuterLoopEnd..1 do

  def RecursiveFunction(x, stop, step) do
    if step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop) do
      return
    end
    [A, G] = IO.gets("") |> String.trim() |> String.split() |> Enum.map(&String.to_integer/1)
    if FirstCondition &&& SecondCondition != 0 do
      if total + A <= 500 do
        total = total + A
        memory[x] = 'A'
      else
        total = total - G
        memory[x] = 'G'
      end
    end
    RecursiveFunction(x + step, stop, step)
  end
  RecursiveFunction(0, firstline, 1)
end
Enum.join(memory)
```
[/ELIXIR]

[JULIA]
```julia
firstline = parse(Int, readline(stdin))
total = 0
memory = []
FirstCondition = 477
SecondCondition = 258
OuterLoopStart = 801
OuterLoopEnd = 800
for LoopIndexOut in OuterLoopStart / OuterLoopEnd:-1:1

    function RecursiveFunction(x, stop, step)
        global total
        if step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)
            return
        end
        (A, G) = parse.(Int, split(readline(stdin)))
        if FirstCondition & SecondCondition
            if total + A <= 500
                total = total + A
                memory[x] = 'A'
            else
                total = total - G
                memory[x] = 'G'
            end
        end
        RecursiveFunction(x + step, stop, step)
    end
    RecursiveFunction(0, firstline, 1)
end
join(memory)
```
[/JULIA]

[LUA]
```lua
firstline = io.read("*n")
total = 0
memory = {}
FirstCondition = 477
SecondCondition = 258
OuterLoopStart = 801
OuterLoopEnd = 800
for LoopIndexOut = OuterLoopStart / OuterLoopEnd, 1, -1 do

    function RecursiveFunction(x, stop,
