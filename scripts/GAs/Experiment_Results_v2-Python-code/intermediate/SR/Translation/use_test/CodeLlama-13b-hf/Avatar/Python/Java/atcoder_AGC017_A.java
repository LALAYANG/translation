
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = sc.nextInt();
        }
        int one = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (lis[i] % 2 == 1) {
                one++;
            } else {
                zero++;
            }
        }
        long pattern_a = 0;
        long even_combinations = 0;
        for (int i = 0; i <= zero; i++) {
            even_combinations += combi(zero, i);
        }
        int time = 0;
        while (time <= one) {
            if (time % 2 == P) {
                pattern_a += combi(one, time);
            }
            time++;
        }
        System.out.println((int) (pattern_a * even_combinations));
    }

    public static long combi(int N, int K) {
        long a = 1;
        for (int i = 0; i < K; i++) {
            a *= N - i;
        }
        for (int j = 1; j <= K; j++) {
            a /= j;
        }
        return a;
    }
}
```
[/JAV]

[PY]
```python
N, P = map(int, input().split())

def combi(N, K):
    a = 1

    def calculate_factorial_numerator(i, stop, step):
        nonlocal a
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        a *= N - i
        calculate_factorial_numerator(i + step, stop, step)
    calculate_factorial_numerator(0, K, 1)

    def calculate_factorial_denominator(j, stop, step):
        nonlocal a
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        a /= j + 1
        calculate_factorial_denominator(j + step, stop, step)
    calculate_factorial_denominator(0, K, 1)
    return a
ans = 0
lis = list(map(int, input().split()))
ls = []
for a in lis:
    ls.append(a % 2)
one = ls.count(1)
zero = ls.count(0)
pattern_a = 0
even_combinations = 0

def calculate_even_combinations(j, stop, step):
    global even_combinations
    if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
        return
    even_combinations += combi(zero, j)
    calculate_even_combinations(j + step, stop, step)
calculate_even_combinations(0, zero + 1, 1)
time = 0
while time <= one:
    if time % 2 == P:
        pattern_a += combi(one, time)
    time += 1
print(int(pattern_a * even_combinations))
```
[/PY]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int N, P;
    cin >> N >> P;
    int lis[N];
    for (int i = 0; i < N; i++) {
        cin >> lis[i];
    }
    int one = 0;
    int zero = 0;
    for (int i = 0; i < N; i++) {
        if (lis[i] % 2 == 1) {
            one++;
        } else {
            zero++;
        }
    }
    long pattern_a = 0;
    long even_combinations = 0;
    for (int i = 0; i <= zero; i++) {
        even_combinations += combi(zero, i);
    }
    int time = 0;
    while (time <= one) {
        if (time % 2 == P) {
            pattern_a += combi(one, time);
        }
        time++;
    }
    cout << (int) (pattern_a * even_combinations);
}

long combi(int N, int K) {
    long a = 1;
    for (int i = 0; i < K; i++) {
        a *= N - i;
    }
    for (int j = 1; j <= K; j++) {
        a /= j;
    }
    return a;
}
```
[/C++]

[C]
```c
#include <stdio.h>

int main() {
    int N, P;
    scanf("%d %d", &N, &P);
    int lis[N];
    for (int i = 0; i < N; i++) {
        scanf("%d", &lis[i]);
    }
    int one = 0;
    int zero = 0;
    for (int i = 0; i < N; i++) {
        if (lis[i] % 2 == 1) {
            one++;
        } else {
            zero++;
        }
    }
    long pattern_a = 0;
    long even_combinations = 0;
    for (int i = 0; i <= zero; i++) {
        even_combinations += combi(zero, i);
    }
    int time = 0;
    while (time <= one) {
        if (time % 2 == P) {
            pattern_a += combi(one, time);
        }
        time++;
    }
    printf("%d", (int) (pattern_a * even_combinations));
}

long combi(int N, int K) {
    long a = 1;
    for (int i = 0; i < K; i++) {
        a *= N - i;
    }
    for (int j = 1; j <= K; j++) {
        a /= j;
    }
    return a;
}
```
[/C]

[GO]
```go
package main

import (
	"fmt"
)

func main() {
	var N, P int
	fmt.Scan(&N, &P)
	lis := make([]int, N)
	for i := 0; i < N; i++ {
		fmt.Scan(&lis[i])
	}
	one := 0
	zero := 0
	for i := 0; i < N; i++ {
		if lis[i]%2 == 1 {
			one++
		} else {
			zero++
		}
	}
	pattern_a := 0
	even_combinations := 0
	for i := 0; i <= zero; i++ {
		even_combinations += combi(zero, i)
	}
	time := 0
	for time <= one {
		if time%2 == P {
			pattern_a += combi(one, time)
		}
		time++
	}
	fmt.Println(int(pattern_a * even_combinations))
}

func combi(N, K int) int {
	a := 1
	for i := 0; i < K; i++ {
		a *= N - i
	}
	for j := 1; j <= K; j++ {
		a /= j
	}
	return a
}
```
[/GO]

[RB]
```ruby
N, P = gets.split.map(&:to_i)
lis = gets.split.map(&:to_i)
one = 0
zero = 0
lis.each do |a|
  if a % 2 == 1
    one += 1
  else
    zero += 1
  end
end
pattern_a = 0
even_combinations = 0
(0..zero).each do |i|
  even_combinations += combi(zero, i)
end
time = 0
while time <= one
  if time % 2 == P
    pattern_a += combi(one, time)
  end
  time += 1
end
puts pattern_a * even_combinations
```
[/RB]

[PHP]
```php
<?php
$input = explode(" ", readline());
$N = $input[0];
$P = $input[1];
$lis = explode(" ", readline());
$one = 0;
$zero = 0;
foreach ($lis as $a) {
  if ($a % 2 == 1) {
    $one += 1;
  } else {
    $zero += 1;
  }
}
$pattern_a = 0;
$even_combinations = 0;
for ($i = 0; $i <= $zero; $i++) {
  $even_combinations += combi($zero, $i);
}
$time = 0;
while ($time <= $one) {
  if ($time % 2 == $P) {
    $pattern_a += combi($one, $time);
  }
  $time += 1;
}
echo $pattern_a * $even_combinations;
```
[/PHP]

[PL]
```perl
my $N = <STDIN>;
chomp($N);
my $P = <STDIN>;
chomp($P);
my @lis = split(' ', <STDIN>);
my $one = 0;
my $zero = 0;
foreach my $a (@lis) {
  if ($a % 2 == 1) {
    $one += 1;
  } else {
    $zero += 1;
  }
}
my $pattern_a = 0;
my $even_combinations = 0;
for (my $i = 0; $i <= $zero; $i++) {
  $even_combinations += combi($zero, $i);
}
my $time = 0;
while ($time <= $one) {
  if ($time % 2 == $P) {
    $pattern_a += combi($one, $time);
  }
  $time += 1;
}
print $pattern_a * $even_combinations;
```
[/PL]

[CS]
```csharp
using System;
using System.Linq;

public class Program
{
    public static void Main()
    {
        var input = Console.ReadLine().Split(' ');
        var N = int.Parse(input[0]);
        var P = int.Parse(input[1]);
        var lis = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
        var one = 0;
        var zero = 0;
        foreach (var a in lis)
        {
            if (a % 2 == 1)
            {
                one += 1;
            }
            else
            {
                zero += 1;
            }
        }
        var pattern_a = 0;
        var even_combinations = 0;
        for (var i = 0; i <= zero; i++)
        {
            even_combinations += Combi(zero, i);
        }
        var time = 0;
        while (time <= one)
        {
            if (time % 2 == P)
            {
                pattern_a += Combi(one, time);
            }
            time += 1;
        }
        Console.WriteLine(pattern_a * even_combinations);
    }

    public static long Combi(int N, int K)
    {
        long a = 1;
        for (int i = 0; i < K; i++)
        {
            a *= N - i;
        }
        for (int j = 1; j <= K; j++)
        {
            a /= j;
        }
        return a;
    }
}
```
[/CS]

[HAS]
```haskell
main = do
    [n, p] <- map read . words <$> getLine
    lis <- map read . words <$> getLine
    let one = length $ filter (\x -> x `mod` 2 == 1) lis
        zero = length $ filter (\x -> x `mod` 2 == 0) lis
        pattern_a = sum $ map (\x -> combi one x) [0..one]
        even_combinations = sum $ map (\x -> combi zero x) [0..zero]
    print $ pattern_a * even_combinations

combi :: Int -> Int -> Int
combi n k = product [n - k + 1..n] `div` product [1..k]
```
[/HAS]

[JA]
```javascript
const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const [N, P] = input.split(' ').map(Number);
const lis = input.split(' ').map(Number);
let one = 0;
let zero = 0;
lis.forEach(a => {
  if (a % 2 == 1) {
    one += 1;
  } else {
    zero += 1;
  }
});
let pattern_a = 0;
let even_combinations = 0;
for (let i = 0; i <= zero; i++) {
  even_combinations += combi(zero, i);
}
let time = 0
