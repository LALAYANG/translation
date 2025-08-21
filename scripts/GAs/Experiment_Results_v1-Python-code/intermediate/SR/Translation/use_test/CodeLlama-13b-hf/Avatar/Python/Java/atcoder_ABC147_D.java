
[JAV]
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] inputArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        int outerLoopBound = 255;
        int innerLoopBound = 254;

        void outerLoop(int outerLoopIndex, int stop, int step) {
            if (step == 0 || (step > 0 && outerLoopIndex >= stop) || (step < 0 && outerLoopIndex <= stop)) {
                return;
            }

            void innerLoop(int b, int stop, int step) {
                if (step == 0 || (step > 0 && b >= stop) || (step < 0 && b <= stop)) {
                    return;
                }
                int bs = IntStream.range(0, N).filter(i -> (inputArray[i] >> b & 1) == 1).count();
                result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
                innerLoop(b + step, stop, step);
            }
            innerLoop(0, 60, 1);
            outerLoop(outerLoopIndex + step, stop, step);
        }
        outerLoop(0, outerLoopBound / innerLoopBound, 1);
        System.out.println(result);
    }
}
```
[/JAV]

[PY]
```python
import numpy as np
N = int(input())
inputArray = np.fromiter(map(int, input().split()), np.int64)
result = 0
outerLoopBound = 255
innerLoopBound = 254

def outerLoop(outerLoopIndex, stop, step):
    global bs, result
    if step == 0 or (step > 0 and outerLoopIndex >= stop) or (step < 0 and outerLoopIndex <= stop):
        return

    def innerLoop(b, stop, step):
        global bs, result
        if step == 0 or (step > 0 and b >= stop) or (step < 0 and b <= stop):
            return
        bs = int((inputArray >> b & 1).sum())
        result = (result + bs * (N - bs) * (1 << b)) % 1000000007
        innerLoop(b + step, stop, step)
    innerLoop(0, 60, 1)
    outerLoop(outerLoopIndex + step, stop, step)
outerLoop(0, outerLoopBound // innerLoopBound, 1)
print(result)
```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int main() {
    int N;
    scanf("%d", &N);
    int *inputArray = (int *)malloc(sizeof(int) * N);
    for (int i = 0; i < N; i++) {
        scanf("%d", &inputArray[i]);
    }
    int result = 0;
    int outerLoopBound = 255;
    int innerLoopBound = 254;

    void outerLoop(int outerLoopIndex, int stop, int step) {
        if (step == 0 || (step > 0 && outerLoopIndex >= stop) || (step < 0 && outerLoopIndex <= stop)) {
            return;
        }

        void innerLoop(int b, int stop, int step) {
            if (step == 0 || (step > 0 && b >= stop) || (step < 0 && b <= stop)) {
                return;
            }
            int bs = 0;
            for (int i = 0; i < N; i++) {
                bs += (inputArray[i] >> b & 1);
            }
            result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
            innerLoop(b + step, stop, step);
        }
        innerLoop(0, 60, 1);
        outerLoop(outerLoopIndex + step, stop, step);
    }
    outerLoop(0, outerLoopBound / innerLoopBound, 1);
    printf("%d", result);
    return 0;
}
```
[/C]

[CPP]
```cpp
#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <array>
#include <map>
#include <set>
#include <utility>
#include <iomanip>
#include <cmath>
#include <climits>
#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <unordered_map>
#include <unordered_set>
#include <bitset>
#include <stack>
#include <deque>
#include <queue>
#include <numeric>
#include <functional>
#include <sstream>
#include <complex>
#include <list>
#include <chrono>
#include <cctype>
#include <cmath>
#include <ctime>
#include <cstdio>
#include <cstdlib>
using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int> inputArray(N);
    for (int i = 0; i < N; i++) {
        cin >> inputArray[i];
    }
    int result = 0;
    int outerLoopBound = 255;
    int innerLoopBound = 254;

    void outerLoop(int outerLoopIndex, int stop, int step) {
        if (step == 0 || (step > 0 && outerLoopIndex >= stop) || (step < 0 && outerLoopIndex <= stop)) {
            return;
        }

        void innerLoop(int b, int stop, int step) {
            if (step == 0 || (step > 0 && b >= stop) || (step < 0 && b <= stop)) {
                return;
            }
            int bs = 0;
            for (int i = 0; i < N; i++) {
                bs += (inputArray[i] >> b & 1);
            }
            result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
            innerLoop(b + step, stop, step);
        }
        innerLoop(0, 60, 1);
        outerLoop(outerLoopIndex + step, stop, step);
    }
    outerLoop(0, outerLoopBound / innerLoopBound, 1);
    cout << result;
    return 0;
}
```
[/CPP]

[GO]
```go
package main

import (
	"fmt"
)

func main() {
	var N int
	fmt.Scan(&N)
	inputArray := make([]int, N)
	for i := 0; i < N; i++ {
		fmt.Scan(&inputArray[i])
	}
	result := 0
	outerLoopBound := 255
	innerLoopBound := 254

	var outerLoop func(outerLoopIndex, stop, step int)
	outerLoop = func(outerLoopIndex, stop, step int) {
		if step == 0 || (step > 0 && outerLoopIndex >= stop) || (step < 0 && outerLoopIndex <= stop) {
			return
		}

		var innerLoop func(b, stop, step int)
		innerLoop = func(b, stop, step int) {
			if step == 0 || (step > 0 && b >= stop) || (step < 0 && b <= stop) {
				return
			}
			bs := 0
			for i := 0; i < N; i++ {
				bs += (inputArray[i] >> b & 1)
			}
			result = (result + bs * (N - bs) * (1 << b)) % 1000000007
			innerLoop(b+step, stop, step)
		}
		innerLoop(0, 60, 1)
		outerLoop(outerLoopIndex+step, stop, step)
	}
	outerLoop(0, outerLoopBound/innerLoopBound, 1)
	fmt.Println(result)
}
```
[/GO]

[RB]
```ruby
N = gets.to_i
inputArray = gets.split.map(&:to_i)
result = 0
outerLoopBound = 255
innerLoopBound = 254

def outerLoop(outerLoopIndex, stop, step)
  return if step == 0 || (step > 0 && outerLoopIndex >= stop) || (step < 0 && outerLoopIndex <= stop)

  def innerLoop(b, stop, step)
    return if step == 0 || (step > 0 && b >= stop) || (step < 0 && b <= stop)

    bs = 0
    N.times do |i|
      bs += (inputArray[i] >> b & 1)
    end
    result = (result + bs * (N - bs) * (1 << b)) % 1000000007
    innerLoop(b + step, stop, step)
  end
  innerLoop(0, 60, 1)
  outerLoop(outerLoopIndex + step, stop, step)
end
outerLoop(0, outerLoopBound / innerLoopBound, 1)
puts result
```
[/RB]

[D]
```d
import std.stdio;
import std.conv;

void main()
{
    auto N = to!int(stdin.readln);
    auto inputArray = stdin.readln.split.map!(a => to!int(a));
    auto result = 0;
    auto outerLoopBound = 255;
    auto innerLoopBound = 254;

    void outerLoop(outerLoopIndex, stop, step)
    {
        if (step == 0 || (step > 0 && outerLoopIndex >= stop) || (step < 0 && outerLoopIndex <= stop))
            return;

        void innerLoop(b, stop, step)
        {
            if (step == 0 || (step > 0 && b >= stop) || (step < 0 && b <= stop))
                return;

            auto bs = 0;
            foreach (i, a; inputArray)
                bs += (a >> b & 1);
            result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
            innerLoop(b + step, stop, step);
        }
        innerLoop(0, 60, 1);
        outerLoop(outerLoopIndex + step, stop, step);
    }
    outerLoop(0, outerLoopBound / innerLoopBound, 1);
    writeln(result);
}
```
[/D]

[PHP]
```php
<?php
$N = (int)trim(fgets(STDIN));
$inputArray = array_map('intval', explode(' ', trim(fgets(STDIN))));
$result = 0;
$outerLoopBound = 255;
$innerLoopBound = 254;

function outerLoop($outerLoopIndex, $stop, $step)
{
    global $bs, $result;
    if ($step == 0 || ($step > 0 && $outerLoopIndex >= $stop) || ($step < 0 && $outerLoopIndex <= $stop)) {
        return;
    }

    function innerLoop($b, $stop, $step)
    {
        global $bs, $result;
        if ($step == 0 || ($step > 0 && $b >= $stop) || ($step < 0 && $b <= $stop)) {
            return;
        }
        $bs = 0;
        foreach ($GLOBALS['inputArray'] as $a) {
            $bs += ($a >> $b & 1);
        }
        $result = ($result + $bs * (count($GLOBALS['inputArray']) - $bs) * (1 << $b)) % 1000000007;
        innerLoop($b + $step, $stop, $step);
    }
    innerLoop(0, 60, 1);
    outerLoop($outerLoopIndex + $step, $stop, $step);
}
outerLoop(0, $outerLoopBound / $innerLoopBound, 1);
echo $result;
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $N = <STDIN>;
chomp($N);
my @inputArray = split(/\s+/, <STDIN>);
my $result = 0;
my $outerLoopBound = 255;
my $innerLoopBound = 254;

sub outerLoop {
    my ($outerLoopIndex, $stop, $step) = @_;
    return if $step == 0 || ($step > 0 && $outerLoopIndex >= $stop) || ($step < 0 && $outerLoopIndex <= $stop);

    sub innerLoop {
        my ($b, $stop, $step) = @_;
        return if $step == 0 || ($step > 0 && $b >= $stop) || ($step < 0 && $b <= $stop);

        my $bs = 0;
        foreach my $a (@inputArray) {
            $bs += ($a >> $b & 1);
        }
        $result = ($result + $bs * ($N - $bs) * (1 << $b)) % 1000000007;
        innerLoop($b + $step, $stop, $step);
    }
    innerLoop(0, 60, 1);
    outerLoop($outerLoopIndex + $step, $stop, $step);
}
outerLoop(0, $outerLoopBound / $innerLoopBound, 1);
print $result;
```
[/PL]

[CS]
```csharp
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());
            int[] inputArray = Console.ReadLine().Split(' ').
