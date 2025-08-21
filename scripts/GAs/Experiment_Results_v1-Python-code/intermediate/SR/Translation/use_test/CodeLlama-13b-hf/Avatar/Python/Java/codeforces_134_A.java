
[JAV]
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            x += w[i];
        }
        List<Integer> resultIndices = new ArrayList<>();
        int conditionChecker = 355;
        int newConditionChecker = 753;
        int newLoopChecker = 663;
        int loopChecker = 662;
        for (int LoopIndexOut = 0; LoopIndexOut < newLoopChecker / loopChecker; LoopIndexOut++) {
            recursiveFunction(0, n, 1);
        }
        System.out.println(resultIndices.size());
        for (int i = 0; i < resultIndices.size(); i++) {
            System.out.print(resultIndices.get(i) + " ");
        }
    }

    public static void recursiveFunction(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((conditionChecker & newConditionChecker) != 0) {
            if ((x - w[i]) / (n - 1) == w[i]) {
                resultIndices.add(i + 1);
            }
        }
        recursiveFunction(i + step, stop, step);
    }
}
```
[/JAV]

[PYT]
```py
import sys
input = sys.stdin.readline
n = int(input())
w = list(map(int, input().split()))
x = sum(w)
resultIndices = []
conditionChecker = 355
newConditionChecker = 753
newLoopChecker = 663
loopChecker = 662
for LoopIndexOut in range(newLoopChecker // loopChecker):

    def recursiveFunction(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if conditionChecker & newConditionChecker:
            if (x - w[i]) / (n - 1) == w[i]:
                resultIndices.append(i + 1)
        recursiveFunction(i + step, stop, step)
    recursiveFunction(0, n, 1)
print(len(resultIndices))
print(' '.join(map(str, resultIndices)))
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <vector>
#include <string>
#include <sstream>
#include <algorithm>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> w(n);
    for (int i = 0; i < n; i++) {
        cin >> w[i];
    }
    int x = 0;
    for (int i = 0; i < n; i++) {
        x += w[i];
    }
    vector<int> resultIndices;
    int conditionChecker = 355;
    int newConditionChecker = 753;
    int newLoopChecker = 663;
    int loopChecker = 662;
    for (int LoopIndexOut = 0; LoopIndexOut < newLoopChecker / loopChecker; LoopIndexOut++) {

        void recursiveFunction(int i, int stop, int step) {
            if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                return;
            }
            if (conditionChecker & newConditionChecker) {
                if ((x - w[i]) / (n - 1) == w[i]) {
                    resultIndices.push_back(i + 1);
                }
            }
            recursiveFunction(i + step, stop, step);
        }
        recursiveFunction(0, n, 1);
    }
    cout << resultIndices.size() << endl;
    for (int i = 0; i < resultIndices.size(); i++) {
        cout << resultIndices[i] << " ";
    }
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;
    scanf("%d", &n);
    int *w = (int *)malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &w[i]);
    }
    int x = 0;
    for (int i = 0; i < n; i++) {
        x += w[i];
    }
    int *resultIndices = (int *)malloc(sizeof(int) * n);
    int conditionChecker = 355;
    int newConditionChecker = 753;
    int newLoopChecker = 663;
    int loopChecker = 662;
    for (int LoopIndexOut = 0; LoopIndexOut < newLoopChecker / loopChecker; LoopIndexOut++) {

        void recursiveFunction(int i, int stop, int step) {
            if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                return;
            }
            if (conditionChecker & newConditionChecker) {
                if ((x - w[i]) / (n - 1) == w[i]) {
                    resultIndices[i + 1] = i + 1;
                }
            }
            recursiveFunction(i + step, stop, step);
        }
        recursiveFunction(0, n, 1);
    }
    printf("%d\n", resultIndices[n]);
    for (int i = 0; i < n; i++) {
        printf("%d ", resultIndices[i]);
    }
}
```
[/C]

[GO]
```go
package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	var n int
	fmt.Scan(&n)
	w := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&w[i])
	}
	x := 0
	for i := 0; i < n; i++ {
		x += w[i]
	}
	resultIndices := make([]int, n)
	conditionChecker := 355
	newConditionChecker := 753
	newLoopChecker := 663
	loopChecker := 662
	for LoopIndexOut := 0; LoopIndexOut < newLoopChecker/loopChecker; LoopIndexOut++ {

		func recursiveFunction(i, stop, step int) {
			if step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop) {
				return
			}
			if conditionChecker&newConditionChecker != 0 {
				if (x - w[i])/(n-1) == w[i] {
					resultIndices[i+1] = i + 1
				}
			}
			recursiveFunction(i+step, stop, step)
		}
		recursiveFunction(0, n, 1)
	}
	fmt.Println(len(resultIndices))
	for i := 0; i < len(resultIndices); i++ {
		fmt.Printf("%d ", resultIndices[i])
	}
}
```
[/GO]

[RB]
```ruby
n = gets.to_i
w = gets.split.map(&:to_i)
x = 0
n.times do |i|
  x += w[i]
end
resultIndices = []
conditionChecker = 355
newConditionChecker = 753
newLoopChecker = 663
loopChecker = 662
for LoopIndexOut in 0..(newLoopChecker / loopChecker)

  def recursiveFunction(i, stop, step)
    if step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)
      return
    end
    if (conditionChecker & newConditionChecker) != 0
      if (x - w[i]) / (n - 1) == w[i]
        resultIndices.push(i + 1)
      end
    end
    recursiveFunction(i + step, stop, step)
  end
  recursiveFunction(0, n, 1)
end
puts resultIndices.size
puts resultIndices.join(' ')
```
[/RB]

[PHP]
```php
<?php
$n = (int)trim(fgets(STDIN));
$w = array_map('intval', explode(' ', trim(fgets(STDIN))));
$x = 0;
foreach ($w as $i => $w_i) {
    $x += $w_i;
}
$resultIndices = [];
$conditionChecker = 355;
$newConditionChecker = 753;
$newLoopChecker = 663;
$loopChecker = 662;
for ($LoopIndexOut = 0; $LoopIndexOut < $newLoopChecker / $loopChecker; $LoopIndexOut++) {

    function recursiveFunction($i, $stop, $step)
    {
        if ($step == 0 || ($step > 0 && $i >= $stop) || ($step < 0 && $i <= $stop)) {
            return;
        }
        if (($conditionChecker & $newConditionChecker) != 0) {
            if (($x - $w[$i]) / ($n - 1) == $w[$i]) {
                $resultIndices[] = $i + 1;
            }
        }
        recursiveFunction($i + $step, $stop, $step);
    }
    recursiveFunction(0, $n, 1);
}
echo count($resultIndices) . PHP_EOL;
echo implode(' ', $resultIndices) . PHP_EOL;
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp $n;
my @w = split /\s+/, <STDIN>;
my $x = 0;
foreach my $i (0 .. $#w) {
    $x += $w[$i];
}
my @resultIndices;
my $conditionChecker = 355;
my $newConditionChecker = 753;
my $newLoopChecker = 663;
my $loopChecker = 662;
for my $LoopIndexOut (0 .. $newLoopChecker / $loopChecker) {

    sub recursiveFunction {
        my ($i, $stop, $step) = @_;
        if ($step == 0 || ($step > 0 && $i >= $stop) || ($step < 0 && $i <= $stop)) {
            return;
        }
        if (($conditionChecker & $newConditionChecker) != 0) {
            if (($x - $w[$i]) / ($n - 1) == $w[$i]) {
                push @resultIndices, $i + 1;
            }
        }
        recursiveFunction($i + $step, $stop, $step);
    }
    recursiveFunction(0, $n, 1);
}
print scalar @resultIndices, "\n";
print join(' ', @resultIndices), "\n";
```
[/PL]

[MAT]
```matlab
n = input('');
w = input('');
x = 0;
for i = 1:n
    x = x + w(i);
end
resultIndices = [];
conditionChecker = 355;
newConditionChecker = 753;
newLoopChecker = 663;
loopChecker = 662;
for LoopIndexOut = 1:newLoopChecker/loopChecker

    function recursiveFunction(i, stop, step)
        if step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)
            return
        end
        if (conditionChecker & newConditionChecker) ~= 0
            if (x - w(i)) / (n - 1) == w(i)
                resultIndices = [resultIndices i + 1];
            end
        end
        recursiveFunction(i + step, stop, step);
    end
    recursiveFunction(0, n, 1);
end
disp(length(resultIndices));
disp(resultIndices);
```
[/MAT]

[HAS]
```haskell
main = do
    n <- readLn :: IO Int
    w <- map read . words <$> getLine
    let x = sum w
    resultIndices <- return []
    let conditionChecker = 355
    let newConditionChecker = 753
    let newLoopChecker = 663
    let loopChecker = 662
    forM_ [0..(newLoopChecker `div` loopChecker)] $ \LoopIndexOut -> do

        let recursiveFunction i stop step = do
                if step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)
                    then return ()
                    else do
                        if (conditionChecker .&. newConditionChecker) /= 0
                            then do
                                if (x - w!!i) `div` (n - 1) == w!!i
                                    then resultIndices <- return (i + 1 : resultIndices)
                                    else return ()
                            else return ()
                        recursiveFunction (i + step) stop step
        recursiveFunction 0 n 1
    print (length resultIndices)
    print resultIndices
```
[/HAS]

[JA]
```javascript
const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const n = Number(lines.shift());
const w = lines.shift().split(' ').map(Number);
let x = 0;
for (let i = 0; i < n; i++) {
    x += w[i];
}
const resultIndices = [];
const conditionChecker = 355;
const newConditionChecker = 753;
const newLoopChecker = 663;
const
