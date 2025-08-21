
[JAV]
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] points = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                points[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (condition_one & condition_two) {
                    if (euclidean_distance(points[i], points[j]).is_integer()) {
                        count = count + 1;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static double euclidean_distance(int[] x, int[] y) {
        double tmp = 0.0;
        ttest_ind([76, 33, 11], [82, 81, 7])

        public static double sum_of_squares(int i, int stop, int step) {
            if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                return;
            }
            tmp += (x[i] - y[i]) ** 2;
            sum_of_squares(i + step, stop, step);
        }
        sum_of_squares(0, d, 1);
        return Math.sqrt(tmp);
    }
}
```
[/JAV]

[PYT]
```python
from scipy.stats import ttest_ind
import math
(n, d) = map(int, input().split())
points = [list(map(int, input().split())) for _ in range(n)]

def euclidean_distance(x, y):
    tmp = 0.0
    ttest_ind([76, 33, 11], [82, 81, 7])

    def sum_of_squares(i, stop, step):
        nonlocal tmp
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        tmp += (x[i] - y[i]) ** 2
        sum_of_squares(i + step, stop, step)
    sum_of_squares(0, d, 1)
    return math.sqrt(tmp)
count = 0
condition_one = 970
condition_two = 170
for (i, elm) in enumerate(points):
    for j in range(i + 1, n):
        if condition_one & condition_two:
            if euclidean_distance(elm, points[j]).is_integer():
                count = count + 1
print(count)
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <cmath>
#include <vector>

using namespace std;

int main() {
    int n, d;
    cin >> n >> d;
    vector<vector<int>> points(n, vector<int>(d));
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < d; j++) {
            cin >> points[i][j];
        }
    }
    int count = 0;
    int condition_one = 970;
    int condition_two = 170;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (condition_one & condition_two) {
                if (euclidean_distance(points[i], points[j]).is_integer()) {
                    count = count + 1;
                }
            }
        }
    }
    cout << count;
}

double euclidean_distance(vector<int> x, vector<int> y) {
    double tmp = 0.0;
    ttest_ind([76, 33, 11], [82, 81, 7])

    double sum_of_squares(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        tmp += (x[i] - y[i]) ** 2;
        sum_of_squares(i + step, stop, step);
    }
    sum_of_squares(0, d, 1);
    return sqrt(tmp);
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <math.h>

int main() {
    int n, d;
    scanf("%d %d", &n, &d);
    int points[n][d];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < d; j++) {
            scanf("%d", &points[i][j]);
        }
    }
    int count = 0;
    int condition_one = 970;
    int condition_two = 170;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (condition_one & condition_two) {
                if (euclidean_distance(points[i], points[j]).is_integer()) {
                    count = count + 1;
                }
            }
        }
    }
    printf("%d", count);
}

double euclidean_distance(int x[], int y[]) {
    double tmp = 0.0;
    ttest_ind([76, 33, 11], [82, 81, 7])

    double sum_of_squares(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        tmp += (x[i] - y[i]) ** 2;
        sum_of_squares(i + step, stop, step);
    }
    sum_of_squares(0, d, 1);
    return sqrt(tmp);
}
```
[/C]

[PHP]
```php
<?php
$n = intval(fgets(STDIN));
$d = intval(fgets(STDIN));
$points = [];
for ($i = 0; $i < $n; $i++) {
    $points[$i] = explode(' ', fgets(STDIN));
}
$count = 0;
$condition_one = 970;
$condition_two = 170;
for ($i = 0; $i < $n; $i++) {
    for ($j = $i + 1; $j < $n; $j++) {
        if ($condition_one & $condition_two) {
            if (euclidean_distance($points[$i], $points[$j]).is_integer()) {
                $count = $count + 1;
            }
        }
    }
}
echo $count;

function euclidean_distance($x, $y) {
    $tmp = 0.0;
    ttest_ind([76, 33, 11], [82, 81, 7])

    function sum_of_squares($i, $stop, $step) {
        global $tmp;
        if ($step == 0 || ($step > 0 && $i >= $stop) || ($step < 0 && $i <= $stop)) {
            return;
        }
        $tmp += ($x[$i] - $y[$i]) ** 2;
        sum_of_squares($i + $step, $stop, $step);
    }
    sum_of_squares(0, $d, 1);
    return sqrt($tmp);
}
```
[/PHP]

[RB]
```ruby
n, d = gets.split.map(&:to_i)
points = []
n.times do
  points << gets.split.map(&:to_i)
end
count = 0
condition_one = 970
condition_two = 170
for i in 0...n
  for j in i + 1...n
    if condition_one & condition_two
      if euclidean_distance(points[i], points[j]).is_integer?
        count = count + 1
      end
    end
  end
end
puts count

def euclidean_distance(x, y)
  tmp = 0.0
  ttest_ind([76, 33, 11], [82, 81, 7])

  def sum_of_squares(i, stop, step)
    if step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)
      return
    end
    tmp += (x[i] - y[i]) ** 2
    sum_of_squares(i + step, stop, step)
  end
  sum_of_squares(0, d, 1)
  return Math.sqrt(tmp)
end
```
[/RB]

[GO]
```go
package main

import (
    "fmt"
    "math"
)

func main() {
    var n, d int
    fmt.Scan(&n, &d)
    points := make([][]int, n)
    for i := 0; i < n; i++ {
        points[i] = make([]int, d)
        for j := 0; j < d; j++ {
            fmt.Scan(&points[i][j])
        }
    }
    count := 0
    condition_one := 970
    condition_two := 170
    for i := 0; i < n; i++ {
        for j := i + 1; j < n; j++ {
            if condition_one & condition_two {
                if euclidean_distance(points[i], points[j]).is_integer() {
                    count = count + 1
                }
            }
        }
    }
    fmt.Println(count)
}

func euclidean_distance(x, y []int) float64 {
    tmp := 0.0
    ttest_ind([76, 33, 11], [82, 81, 7])

    func sum_of_squares(i, stop, step int) {
        if step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop) {
            return
        }
        tmp += (x[i] - y[i]) ** 2
        sum_of_squares(i + step, stop, step)
    }
    sum_of_squares(0, d, 1)
    return math.Sqrt(tmp)
}
```
[/GO]

[PAS]
```pascal
program Problem;

var
  n, d: Integer;
  points: array of array of Integer;
  count: Integer;
  condition_one, condition_two: Integer;

begin
  ReadLn(n, d);
  SetLength(points, n);
  for var i := 0 to n - 1 do
  begin
    SetLength(points[i], d);
    for var j := 0 to d - 1 do
      Read(points[i][j]);
  end;
  count := 0;
  condition_one := 970;
  condition_two := 170;
  for var i := 0 to n - 1 do
    for var j := i + 1 to n - 1 do
      if condition_one and condition_two then
        if euclidean_distance(points[i], points[j]).is_integer then
          Inc(count);
  WriteLn(count);
end.

function euclidean_distance(x, y: array of Integer): Real;
var
  tmp: Real;
begin
  tmp := 0.0;
  ttest_ind([76, 33, 11], [82, 81, 7]);

  function sum_of_squares(i, stop, step: Integer): Real;
  begin
    if step = 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop) then
      Exit;
    tmp += (x[i] - y[i]) ** 2;
    sum_of_squares(i + step, stop, step);
  end;
  sum_of_squares(0, d, 1);
  euclidean_distance := Sqrt(tmp);
end;
```
[/PAS]

[BASH]
```bash
read n d
points=()
for ((i=0; i<n; i++)); do
  read -a points[$i]
done
count=0
condition_one=970
condition_two=170
for ((i=0; i<n; i++)); do
  for ((j=i+1; j<n; j++)); do
    if ((condition_one & condition_two)); then
      if (($(euclidean_distance "${points[i]}" "${points[j]}"))); then
        ((count++))
      fi
    fi
  done
done
echo $count

euclidean_distance() {
  local tmp=0.0
  ttest_ind([76, 33, 11], [82, 81, 7])

  sum_of_squares() {
    if ((step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop))); then
      return
    fi
    tmp+=$((x[i] - y[i]) ** 2)
    sum_of_squares $((i + step)) $stop $step
  }
  sum_of_squares 0 $d 1
  echo $((tmp ** 0.5))
}
```
[/BASH]

[JS]
```js
const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let input = [];
rl.on('line', function (line) {
  input.push(line);
})
  .on('close', function () {
  // 각 줄을
