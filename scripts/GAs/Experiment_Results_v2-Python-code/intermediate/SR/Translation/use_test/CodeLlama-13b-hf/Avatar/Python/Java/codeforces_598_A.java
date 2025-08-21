
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
    }

    public static int solve(int n) {
        int denominator = 2;
        int numerator_coefficient = 1;
        int result_calculate_intermediate_value0 = calculate_intermediate_value(numerator_coefficient, n, denominator);
        int final_result = result_calculate_intermediate_value0;
        int t = 1;
        while (t <= n) {
            final_result -= 2 * t;
            t = t * 2;
        }
        return final_result;
    }

    public static int calculate_intermediate_value(int numerator_coefficient, int n, int denominator) {
        return (numerator_coefficient + n) * n / denominator;
    }
}
```
[/JAV]

[PY]
```python
import threading
import queue

def calculate_intermediate_value(numerator_coefficient, n, denominator):
    return (numerator_coefficient + n) * n // denominator

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
t = int(input())

@my_decorator
def solve(n):
    denominator = 2
    numerator_coefficient = 1
    queue_calculate_intermediate_value0 = queue.Queue()

    def calculate_intermediate_value_thread(queue):
        result = calculate_intermediate_value(numerator_coefficient, n, denominator)
        queue.put(result)
    thread_calculate_intermediate_value0 = threading.Thread(target=calculate_intermediate_value_thread, args=(queue_calculate_intermediate_value0,))
    thread_calculate_intermediate_value0.start()
    thread_calculate_intermediate_value0.join()
    result_calculate_intermediate_value0 = queue_calculate_intermediate_value0.get()
    final_result = result_calculate_intermediate_value0
    t = 1
    while t <= n:
        final_result -= 2 * t
        t = t * 2
    return final_result
for _ in range(t):
    n = int(input())
    print(solve(n))
```
[/PY]

[C++]
```cpp
#include <iostream>
#include <thread>
#include <queue>

using namespace std;

int calculate_intermediate_value(int numerator_coefficient, int n, int denominator) {
    return (numerator_coefficient + n) * n / denominator;
}

int solve(int n) {
    int denominator = 2;
    int numerator_coefficient = 1;
    queue<int> queue_calculate_intermediate_value0;

    auto calculate_intermediate_value_thread = [&](queue<int>& queue) {
        int result = calculate_intermediate_value(numerator_coefficient, n, denominator);
        queue.push(result);
    };
    thread thread_calculate_intermediate_value0(calculate_intermediate_value_thread, ref(queue_calculate_intermediate_value0));
    thread_calculate_intermediate_value0.join();
    int result_calculate_intermediate_value0 = queue_calculate_intermediate_value0.front();
    queue_calculate_intermediate_value0.pop();
    int final_result = result_calculate_intermediate_value0;
    int t = 1;
    while (t <= n) {
        final_result -= 2 * t;
        t = t * 2;
    }
    return final_result;
}

int main() {
    int t;
    cin >> t;
    for (int i = 0; i < t; i++) {
        int n;
        cin >> n;
        cout << solve(n) << endl;
    }
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <sys/sem.h>
#include <sys/msg.h>
#include <string.h>
#include <signal.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <sys/mman.h>
#include <errno.h>
#include <math.h>
#include <sys/time.h>
#include <time.h>
#include <sys/resource.h>

int calculate_intermediate_value(int numerator_coefficient, int n, int denominator) {
    return (numerator_coefficient + n) * n / denominator;
}

int solve(int n) {
    int denominator = 2;
    int numerator_coefficient = 1;
    int result_calculate_intermediate_value0 = calculate_intermediate_value(numerator_coefficient, n, denominator);
    int final_result = result_calculate_intermediate_value0;
    int t = 1;
    while (t <= n) {
        final_result -= 2 * t;
        t = t * 2;
    }
    return final_result;
}

int main() {
    int t;
    scanf("%d", &t);
    for (int i = 0; i < t; i++) {
        int n;
        scanf("%d", &n);
        printf("%d\n", solve(n));
    }
}
```
[/C]

[PHP]
```php
<?php

function calculate_intermediate_value($numerator_coefficient, $n, $denominator) {
    return ($numerator_coefficient + $n) * $n / $denominator;
}

function solve($n) {
    $denominator = 2;
    $numerator_coefficient = 1;
    $result_calculate_intermediate_value0 = calculate_intermediate_value($numerator_coefficient, $n, $denominator);
    $final_result = $result_calculate_intermediate_value0;
    $t = 1;
    while ($t <= $n) {
        $final_result -= 2 * $t;
        $t = $t * 2;
    }
    return $final_result;
}

$t = intval(fgets(STDIN));
for ($i = 0; $i < $t; $i++) {
    $n = intval(fgets(STDIN));
    echo solve($n) . PHP_EOL;
}
```
[/PHP]

[RUBY]
```ruby
def calculate_intermediate_value(numerator_coefficient, n, denominator)
    return (numerator_coefficient + n) * n / denominator
end

def solve(n)
    denominator = 2
    numerator_coefficient = 1
    result_calculate_intermediate_value0 = calculate_intermediate_value(numerator_coefficient, n, denominator)
    final_result = result_calculate_intermediate_value0
    t = 1
    while t <= n
        final_result -= 2 * t
        t = t * 2
    end
    return final_result
end

t = gets.to_i
for i in 0..(t - 1)
    n = gets.to_i
    puts solve(n)
end
```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
)

func calculate_intermediate_value(numerator_coefficient int, n int, denominator int) int {
    return (numerator_coefficient + n) * n / denominator
}

func solve(n int) int {
    denominator := 2
    numerator_coefficient := 1
    result_calculate_intermediate_value0 := calculate_intermediate_value(numerator_coefficient, n, denominator)
    final_result := result_calculate_intermediate_value0
    t := 1
    for t <= n {
        final_result -= 2 * t
        t = t * 2
    }
    return final_result
}

func main() {
    var t int
    fmt.Scan(&t)
    for i := 0; i < t; i++ {
        var n int
        fmt.Scan(&n)
        fmt.Println(solve(n))
    }
}
```
[/GO]

[BASH]
```bash
#!/bin/bash

function calculate_intermediate_value() {
    local numerator_coefficient=$1
    local n=$2
    local denominator=$3
    echo $(( (numerator_coefficient + n) * n / denominator ))
}

function solve() {
    local n=$1
    local denominator=2
    local numerator_coefficient=1
    local result_calculate_intermediate_value0=$(calculate_intermediate_value $numerator_coefficient $n $denominator)
    local final_result=$result_calculate_intermediate_value0
    local t=1
    while [ $t -le $n ]
    do
        final_result=$(( final_result - 2 * t ))
        t=$(( t * 2 ))
    done
    echo $final_result
}

read t
for (( i = 0; i < t; i++ ))
do
    read n
    solve $n
done
```
[/BASH]

[PERL]
```perl
sub calculate_intermediate_value {
    my ($numerator_coefficient, $n, $denominator) = @_;
    return ($numerator_coefficient + $n) * $n / $denominator;
}

sub solve {
    my ($n) = @_;
    my $denominator = 2;
    my $numerator_coefficient = 1;
    my $result_calculate_intermediate_value0 = calculate_intermediate_value($numerator_coefficient, $n, $denominator);
    my $final_result = $result_calculate_intermediate_value0;
    my $t = 1;
    while ($t <= $n) {
        $final_result -= 2 * $t;
        $t = $t * 2;
    }
    return $final_result;
}

my $t = <STDIN>;
chomp($t);
for (my $i = 0; $i < $t; $i++) {
    my $n = <STDIN>;
    chomp($n);
    print solve($n) . "\n";
}
```
[/PERL]

[ELIXIR]
```elixir
defmodule Main do
    def calculate_intermediate_value(numerator_coefficient, n, denominator) do
        (numerator_coefficient + n) * n / denominator
    end

    def solve(n) do
        denominator = 2
        numerator_coefficient = 1
        result_calculate_intermediate_value0 = calculate_intermediate_value(numerator_coefficient, n, denominator)
        final_result = result_calculate_intermediate_value0
        t = 1
        while t <= n do
            final_result = final_result - 2 * t
            t = t * 2
        end
        final_result
    end
end

t = IO.read(:stdio, :line) |> String.trim
for _ <- 1..String.to_integer(t) do
    n = IO.read(:stdio, :line) |> String.trim
    IO.puts Main.solve(String.to_integer(n))
end
```
[/ELIXIR]

[JULIA]
```julia
function calculate_intermediate_value(numerator_coefficient, n, denominator)
    return (numerator_coefficient + n) * n / denominator
end

function solve(n)
    denominator = 2
    numerator_coefficient = 1
    result_calculate_intermediate_value0 = calculate_intermediate_value(numerator_coefficient, n, denominator)
    final_result = result_calculate_intermediate_value0
    t = 1
    while t <= n
        final_result -= 2 * t
        t = t * 2
    end
    return final_result
end

t = parse(Int, readline())
for i in 1:t
    n = parse(Int, readline())
    println(solve(n))
end
```
[/JULIA]

[COFFEESCRIPT]
```coffeescript
calculate_intermediate_value = (numerator_coefficient, n, denominator) ->
    return (numerator_coefficient + n) * n / denominator

solve = (n) ->
    denominator = 2
    numerator_coefficient = 1
    result_calculate_intermediate_value0 = calculate_intermediate_value(numerator_coefficient, n, denominator)
    final_result = result_calculate_intermediate_value0
    t = 1
    while t <= n
        final_result -= 2 * t
        t = t * 2
    return final_result

t = parseInt(readline())
for i in [0..(t - 1)]
    n = parseInt(readline())
    console.log(solve(n))
```
[/COFFEESCRIPT]

[LUA]
```lua
function calculate_intermediate_value(numerator_coefficient, n, denominator)
    return (numerator_coefficient + n) * n / denominator
end

function solve(n)
    denominator = 2
    numerator_coefficient = 1
    result_calculate_intermediate_value0 = calculate_intermediate_value(numer
