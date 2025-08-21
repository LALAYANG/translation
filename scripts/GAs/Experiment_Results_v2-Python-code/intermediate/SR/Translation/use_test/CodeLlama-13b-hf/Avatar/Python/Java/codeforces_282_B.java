
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstline = sc.nextInt();
        int total = 0;
        String[] memory_array = new String[firstline];
        int ConditionCheckerA = 161;
        int ConditionCheckerC = 619;
        int NewLoopCheckerA = 556;
        int LoopCheckerB = 555;
        for (int LoopIndexOut = 0; LoopIndexOut < NewLoopCheckerA / LoopCheckerB; LoopIndexOut++) {
            recursive_loop(0, firstline, 1);
        }
        System.out.println(String.join("", memory_array));
    }

    public static void recursive_loop(int x, int stop, int step) {
        if (step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)) {
            return;
        }
        int A = sc.nextInt();
        int G = sc.nextInt();
        if (ConditionCheckerA & ConditionCheckerC) {
            if (total + A <= 500) {
                total = total + A;
                memory_array[x] = "A";
            } else {
                total = total - G;
                memory_array[x] = "G";
            }
        }
        recursive_loop(x + step, stop, step);
    }
}
```
[/JAV]

[PYT]
```python
firstline = int(input())
total = 0
memory_array = []
ConditionCheckerA = 161
ConditionCheckerC = 619
NewLoopCheckerA = 556
LoopCheckerB = 555
for LoopIndexOut in range(NewLoopCheckerA // LoopCheckerB):

    @my_decorator
    def recursive_loop(x, stop, step):
        global total
        if step == 0 or (step > 0 and x >= stop) or (step < 0 and x <= stop):
            return
        (A, G) = list(map(int, input().split()))
        if ConditionCheckerA & ConditionCheckerC:
            if total + A <= 500:
                total = total + A
                memory_array.append('A')
            else:
                total = total - G
                memory_array.append('G')
        recursive_loop(x + step, stop, step)
    recursive_loop(0, firstline, 1)
print(''.join(memory_array))
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main() {
    int firstline;
    cin >> firstline;
    int total = 0;
    vector<string> memory_array;
    int ConditionCheckerA = 161;
    int ConditionCheckerC = 619;
    int NewLoopCheckerA = 556;
    int LoopCheckerB = 555;
    for (int LoopIndexOut = 0; LoopIndexOut < NewLoopCheckerA / LoopCheckerB; LoopIndexOut++) {
        recursive_loop(0, firstline, 1);
    }
    for (int i = 0; i < memory_array.size(); i++) {
        cout << memory_array[i];
    }
}

void recursive_loop(int x, int stop, int step) {
    if (step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)) {
        return;
    }
    int A, G;
    cin >> A >> G;
    if (ConditionCheckerA & ConditionCheckerC) {
        if (total + A <= 500) {
            total = total + A;
            memory_array.push_back("A");
        } else {
            total = total - G;
            memory_array.push_back("G");
        }
    }
    recursive_loop(x + step, stop, step);
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int firstline;
    scanf("%d", &firstline);
    int total = 0;
    char memory_array[firstline];
    int ConditionCheckerA = 161;
    int ConditionCheckerC = 619;
    int NewLoopCheckerA = 556;
    int LoopCheckerB = 555;
    for (int LoopIndexOut = 0; LoopIndexOut < NewLoopCheckerA / LoopCheckerB; LoopIndexOut++) {
        recursive_loop(0, firstline, 1);
    }
    for (int i = 0; i < firstline; i++) {
        printf("%c", memory_array[i]);
    }
}

void recursive_loop(int x, int stop, int step) {
    if (step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)) {
        return;
    }
    int A, G;
    scanf("%d %d", &A, &G);
    if (ConditionCheckerA & ConditionCheckerC) {
        if (total + A <= 500) {
            total = total + A;
            memory_array[x] = 'A';
        } else {
            total = total - G;
            memory_array[x] = 'G';
        }
    }
    recursive_loop(x + step, stop, step);
}
```
[/C]

[PHP]
```php
<?php
$firstline = intval(fgets(STDIN));
$total = 0;
$memory_array = [];
$ConditionCheckerA = 161;
$ConditionCheckerC = 619;
$NewLoopCheckerA = 556;
$LoopCheckerB = 555;
for ($LoopIndexOut = 0; $LoopIndexOut < $NewLoopCheckerA / $LoopCheckerB; $LoopIndexOut++) {
    recursive_loop(0, $firstline, 1);
}
echo implode("", $memory_array);

function recursive_loop($x, $stop, $step)
{
    global $total;
    if ($step == 0 || ($step > 0 && $x >= $stop) || ($step < 0 && $x <= $stop)) {
        return;
    }
    list($A, $G) = explode(" ", fgets(STDIN));
    if ($ConditionCheckerA & $ConditionCheckerC) {
        if ($total + $A <= 500) {
            $total = $total + $A;
            $memory_array[$x] = "A";
        } else {
            $total = $total - $G;
            $memory_array[$x] = "G";
        }
    }
    recursive_loop($x + $step, $stop, $step);
}
```
[/PHP]

[RUBY]
```ruby
firstline = gets.to_i
total = 0
memory_array = []
ConditionCheckerA = 161
ConditionCheckerC = 619
NewLoopCheckerA = 556
LoopCheckerB = 555
for LoopIndexOut in 0..(NewLoopCheckerA / LoopCheckerB)
    recursive_loop(0, firstline, 1)
end
puts memory_array.join("")

def recursive_loop(x, stop, step)
    if step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)
        return
    end
    A, G = gets.split.map(&:to_i)
    if ConditionCheckerA & ConditionCheckerC
        if total + A <= 500
            total = total + A
            memory_array[x] = "A"
        else
            total = total - G
            memory_array[x] = "G"
        end
    end
    recursive_loop(x + step, stop, step)
end
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
    var memory_array []string
    var ConditionCheckerA int = 161
    var ConditionCheckerC int = 619
    var NewLoopCheckerA int = 556
    var LoopCheckerB int = 555
    for LoopIndexOut := 0; LoopIndexOut < NewLoopCheckerA/LoopCheckerB; LoopIndexOut++ {
        recursive_loop(0, firstline, 1)
    }
    fmt.Println(strings.Join(memory_array, ""))
}

func recursive_loop(x int, stop int, step int) {
    if step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop) {
        return
    }
    var A int
    var G int
    fmt.Scan(&A)
    fmt.Scan(&G)
    if ConditionCheckerA & ConditionCheckerC {
        if total + A <= 500 {
            total = total + A
            memory_array[x] = "A"
        } else {
            total = total - G
            memory_array[x] = "G"
        }
    }
    recursive_loop(x + step, stop, step)
}
```
[/GO]

[BASH]
```bash
read firstline
total=0
memory_array=()
ConditionCheckerA=161
ConditionCheckerC=619
NewLoopCheckerA=556
LoopCheckerB=555
for ((LoopIndexOut=0; LoopIndexOut<NewLoopCheckerA/LoopCheckerB; LoopIndexOut++)); do
    recursive_loop 0 $firstline 1
done
echo "${memory_array[@]}"

recursive_loop() {
    if [ $2 -eq 0 ] || ([ $3 -gt 0 -a $1 -ge $2 ] || [ $3 -lt 0 -a $1 -le $2 ]); then
        return
    fi
    read A
    read G
    if [ $((ConditionCheckerA & ConditionCheckerC)) -ne 0 ]; then
        if [ $((total + A)) -le 500 ]; then
            total=$((total + A))
            memory_array[$1]="A"
        else
            total=$((total - G))
            memory_array[$1]="G"
        fi
    fi
    recursive_loop $((1 + $1)) $2 $3
}
```
[/BASH]

[PERL]
```perl
use strict;
use warnings;

my $firstline = <STDIN>;
chomp($firstline);
my $total = 0;
my @memory_array;
my $ConditionCheckerA = 161;
my $ConditionCheckerC = 619;
my $NewLoopCheckerA = 556;
my $LoopCheckerB = 555;
for (my $LoopIndexOut = 0; $LoopIndexOut < $NewLoopCheckerA / $LoopCheckerB; $LoopIndexOut++) {
    recursive_loop(0, $firstline, 1);
}
print join("", @memory_array);

sub recursive_loop {
    my ($x, $stop, $step) = @_;
    if ($step == 0 || ($step > 0 && $x >= $stop) || ($step < 0 && $x <= $stop)) {
        return;
    }
    my ($A, $G) = split(" ", <STDIN>);
    if ($ConditionCheckerA & $ConditionCheckerC) {
        if ($total + $A <= 500) {
            $total = $total + $A;
            $memory_array[$x] = "A";
        } else {
            $total = $total - $G;
            $memory_array[$x] = "G";
        }
    }
    recursive_loop($x + $step, $stop, $step);
}
```
[/PERL]

[ELIXIR]
```elixir
firstline = IO.gets("") |> String.trim() |> String.to_integer()
total = 0
memory_array = []
ConditionCheckerA = 161
ConditionCheckerC = 619
NewLoopCheckerA = 556
LoopCheckerB = 555
for LoopIndexOut <- 0..(NewLoopCheckerA / LoopCheckerB) do
    recursive_loop(0, firstline, 1)
end
IO.puts(Enum.join(memory_array, ""))

def recursive_loop(x, stop, step) do
    if step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop) do
        return
    end
    [A, G] = IO.gets("") |> String.trim() |> String.split() |> Enum.map(&String.to_integer/1)
    if ConditionCheckerA &&& ConditionCheckerC do
        if total + A <= 500 do
            total = total + A
            memory_array[x] = "A"
        else
            total = total - G
            memory_array[x] = "G"
        end
    end
    recursive_loop(x + step, stop, step)
end
```
[/ELIXIR]

[JULIA]
```julia
firstline = parse(Int, readline())
total = 0
memory_array = []
ConditionCheckerA = 161
ConditionCheckerC = 619
NewLoopCheckerA = 556
LoopCheckerB = 555
for LoopIndexOut in 0:(NewLoopCheckerA / LoopCheckerB)
    recursive_loop(0, firstline, 1)
end
print(join(memory_array, ""))

function recursive_loop(x, stop, step)
    if step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)
        return
    end
    A, G = parse.(Int, split(readline()))
    if ConditionCheckerA & ConditionCheckerC
        if total + A <= 500
            total = total + A
            memory_array[x] = "A"
        else
            total = total - G
            memory_array[x] = "G"
        end
    end
