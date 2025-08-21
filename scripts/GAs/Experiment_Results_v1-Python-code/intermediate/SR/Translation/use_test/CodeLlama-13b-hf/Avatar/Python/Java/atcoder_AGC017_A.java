
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        int one = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 1) {
                one++;
            } else {
                zero++;
            }
        }
        int pattern_a = 0;
        int pattern_b = 0;
        for (int j = 0; j <= zero; j++) {
            pattern_b += combi(zero, j);
        }
        int time = 0;
        while (time <= one) {
            if (time % 2 == P) {
                pattern_a += combi(one, time);
            }
            time++;
        }
        System.out.println(pattern_a * pattern_b);
    }

    public static int combi(int N, int K) {
        int a = 1;
        multiply_remaining(0, K, 1);
        divide_factorial(0, K, 1);
        return a;
    }

    public static void multiply_remaining(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a *= calculate_remaining(i, N);
        multiply_remaining(i + step, stop, step);
    }

    public static void divide_factorial(int j, int stop, int step) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        a /= j + 1;
        divide_factorial(j + step, stop, step);
    }

    public static int calculate_remaining(int i, int N) {
        return N - i;
    }
}
```
[/JAV]

[PY]
```python
import sys

def calculate_remaining(i, N):
    return N - i
(N, P) = map(int, input().split())

def combi(N, K):
    a = 1

    def multiply_remaining(i, stop, step):
        nonlocal a
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        a *= calculate_remaining(i, N)
        multiply_remaining(i + step, stop, step)
    multiply_remaining(0, K, 1)

    def divide_factorial(j, stop, step):
        nonlocal a
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        a /= j + 1
        divide_factorial(j + step, stop, step)
    divide_factorial(0, K, 1)
    return a
ans = 0
lis = list(map(int, input().split()))
ls = []
for a in lis:
    ls.append(a % 2)
one = ls.count(1)
zero = ls.count(0)
pattern_a = 0
pattern_b = 0
for j in range(zero + 1):
    pattern_b += combi(zero, j)
time = 0
while time <= one:
    if time % 2 == P:
        pattern_a += combi(one, time)
    time = time + 1
print(int(pattern_a * pattern_b))
```
[/PY]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int calculate_remaining(int i, int N) {
    return N - i;
}

int combi(int N, int K) {
    int a = 1;
    multiply_remaining(0, K, 1);
    divide_factorial(0, K, 1);
    return a;
}

void multiply_remaining(int i, int stop, int step) {
    if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
        return;
    }
    a *= calculate_remaining(i, N);
    multiply_remaining(i + step, stop, step);
}

void divide_factorial(int j, int stop, int step) {
    if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
        return;
    }
    a /= j + 1;
    divide_factorial(j + step, stop, step);
}

int main() {
    int N, P;
    cin >> N >> P;
    int arr[N];
    for (int i = 0; i < N; i++) {
        cin >> arr[i];
    }
    int ans = 0;
    int one = 0;
    int zero = 0;
    for (int i = 0; i < N; i++) {
        if (arr[i] == 1) {
            one++;
        } else {
            zero++;
        }
    }
    int pattern_a = 0;
    int pattern_b = 0;
    for (int j = 0; j <= zero; j++) {
        pattern_b += combi(zero, j);
    }
    int time = 0;
    while (time <= one) {
        if (time % 2 == P) {
            pattern_a += combi(one, time);
        }
        time++;
    }
    cout << pattern_a * pattern_b;
}
```
[/C++]

[C]
```c
#include <stdio.h>

int calculate_remaining(int i, int N) {
    return N - i;
}

int combi(int N, int K) {
    int a = 1;
    multiply_remaining(0, K, 1);
    divide_factorial(0, K, 1);
    return a;
}

void multiply_remaining(int i, int stop, int step) {
    if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
        return;
    }
    a *= calculate_remaining(i, N);
    multiply_remaining(i + step, stop, step);
}

void divide_factorial(int j, int stop, int step) {
    if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
        return;
    }
    a /= j + 1;
    divide_factorial(j + step, stop, step);
}

int main() {
    int N, P;
    scanf("%d %d", &N, &P);
    int arr[N];
    for (int i = 0; i < N; i++) {
        scanf("%d", &arr[i]);
    }
    int ans = 0;
    int one = 0;
    int zero = 0;
    for (int i = 0; i < N; i++) {
        if (arr[i] == 1) {
            one++;
        } else {
            zero++;
        }
    }
    int pattern_a = 0;
    int pattern_b = 0;
    for (int j = 0; j <= zero; j++) {
        pattern_b += combi(zero, j);
    }
    int time = 0;
    while (time <= one) {
        if (time % 2 == P) {
            pattern_a += combi(one, time);
        }
        time++;
    }
    printf("%d", pattern_a * pattern_b);
}
```
[/C]

[GO]
```go
package main

import (
	"fmt"
)

func calculate_remaining(i, N int) int {
	return N - i
}

func combi(N, K int) int {
	a := 1
	multiply_remaining(0, K, 1)
	divide_factorial(0, K, 1)
	return a
}

func multiply_remaining(i, stop, step int) {
	if step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop) {
		return
	}
	a *= calculate_remaining(i, N)
	multiply_remaining(i+step, stop, step)
}

func divide_factorial(j, stop, step int) {
	if step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop) {
		return
	}
	a /= j + 1
	divide_factorial(j+step, stop, step)
}

func main() {
	var N, P int
	fmt.Scan(&N, &P)
	var arr [N]int
	for i := 0; i < N; i++ {
		fmt.Scan(&arr[i])
	}
	var ans int
	var one, zero int
	for i := 0; i < N; i++ {
		if arr[i] == 1 {
			one++
		} else {
			zero++
		}
	}
	var pattern_a, pattern_b int
	for j := 0; j <= zero; j++ {
		pattern_b += combi(zero, j)
	}
	var time int
	for time <= one {
		if time%2 == P {
			pattern_a += combi(one, time)
		}
		time++
	}
	fmt.Println(pattern_a * pattern_b)
}
```
[/GO]

[PHP]
```php
<?php

function calculate_remaining($i, $N) {
    return $N - $i;
}

function combi($N, $K) {
    $a = 1;
    multiply_remaining(0, $K, 1);
    divide_factorial(0, $K, 1);
    return $a;
}

function multiply_remaining($i, $stop, $step) {
    if ($step == 0 || ($step > 0 && $i >= $stop) || ($step < 0 && $i <= $stop)) {
        return;
    }
    $a *= calculate_remaining($i, $N);
    multiply_remaining($i + $step, $stop, $step);
}

function divide_factorial($j, $stop, $step) {
    if ($step == 0 || ($step > 0 && $j >= $stop) || ($step < 0 && $j <= $stop)) {
        return;
    }
    $a /= $j + 1;
    divide_factorial($j + $step, $stop, $step);
}

$N = (int)trim(fgets(STDIN));
$P = (int)trim(fgets(STDIN));
$arr = array();
for ($i = 0; $i < $N; $i++) {
    $arr[$i] = (int)trim(fgets(STDIN));
}
$ans = 0;
$one = 0;
$zero = 0;
for ($i = 0; $i < $N; $i++) {
    if ($arr[$i] == 1) {
        $one++;
    } else {
        $zero++;
    }
}
$pattern_a = 0;
$pattern_b = 0;
for ($j = 0; $j <= $zero; $j++) {
    $pattern_b += combi($zero, $j);
}
$time = 0;
while ($time <= $one) {
    if ($time % 2 == $P) {
        $pattern_a += combi($one, $time);
    }
    $time++;
}
echo $pattern_a * $pattern_b;
```
[/PHP]

[RUBY]
```ruby
=begin
def calculate_remaining(i, N)
    return N - i
end

def combi(N, K)
    a = 1
    multiply_remaining(0, K, 1)
    divide_factorial(0, K, 1)
    return a
end

def multiply_remaining(i, stop, step)
    if step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)
        return
    end
    a *= calculate_remaining(i, N)
    multiply_remaining(i + step, stop, step)
end

def divide_factorial(j, stop, step)
    if step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)
        return
    end
    a /= j + 1
    divide_factorial(j + step, stop, step)
end
=end

N, P = gets.split.map(&:to_i)
arr = gets.split.map(&:to_i)
ans = 0
one = 0
zero = 0
for i in 0..(N - 1)
    if arr[i] == 1
        one += 1
    else
        zero += 1
    end
end
pattern_a = 0
pattern_b = 0
for j in 0..(zero)
    pattern_b += combi(zero, j)
end
time = 0
while time <= one
    if time % 2 == P
        pattern_a += combi(one, time)
    end
    time += 1
end
puts pattern_a * pattern_b
```
[/RUBY]

[SWIFT]
```swift
import Foundation

func calculate_remaining(_ i: Int, _ N: Int)
