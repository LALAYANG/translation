
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
        int checker_one = 320;
        int checker_two = 70;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (checker_one & checker_two) {
                    if (Math.sqrt(squared_distance_sum(points[i], points[j], d, 1)) % 1 == 0) {
                        count = count + 1;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static double squared_distance_sum(int[] x, int[] y, int d, int step) {
        double tmp = 0.0;
        if (step == 0 || (step > 0 && x.length - 1 < step) || (step < 0 && x.length - 1 > step)) {
            return tmp;
        }
        tmp += (x[step] - y[step]) * (x[step] - y[step]);
        return tmp + squared_distance_sum(x, y, d, step + 1);
    }
}
```
[/JAV]

[PYT]
```py
from scipy.stats import ttest_ind
import math
(n, d) = map(int, input().split())
points = [list(map(int, input().split())) for _ in range(n)]

def dist(x, y):
    tmp = 0.0

    def squared_distance_sum(i, stop, step):
        nonlocal tmp
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        tmp += (x[i] - y[i]) ** 2
        squared_distance_sum(i + step, stop, step)
    ttest_ind([69, 66, 66], [71, 71, 45])
    squared_distance_sum(0, d, 1)
    return math.sqrt(tmp)
count = 0
checker_one = 320
checker_two = 70
for (i, point_one) in enumerate(points):
    for j in range(i + 1, n):
        if checker_one & checker_two:
            if dist(point_one, points[j]).is_integer():
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
    int checker_one = 320;
    int checker_two = 70;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (checker_one & checker_two) {
                if (sqrt(squared_distance_sum(points[i], points[j], d, 1)) % 1 == 0) {
                    count = count + 1;
                }
            }
        }
    }
    cout << count << endl;
}

double squared_distance_sum(vector<int> x, vector<int> y, int d, int step) {
    double tmp = 0.0;
    if (step == 0 || (step > 0 && x.size() - 1 < step) || (step < 0 && x.size() - 1 > step)) {
        return tmp;
    }
    tmp += (x[step] - y[step]) * (x[step] - y[step]);
    return tmp + squared_distance_sum(x, y, d, step + 1);
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
    int checker_one = 320;
    int checker_two = 70;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (checker_one & checker_two) {
                if (sqrt(squared_distance_sum(points[i], points[j], d, 1)) % 1 == 0) {
                    count = count + 1;
                }
            }
        }
    }
    printf("%d\n", count);
}

double squared_distance_sum(int x[], int y[], int d, int step) {
    double tmp = 0.0;
    if (step == 0 || (step > 0 && d - 1 < step) || (step < 0 && d - 1 > step)) {
        return tmp;
    }
    tmp += (x[step] - y[step]) * (x[step] - y[step]);
    return tmp + squared_distance_sum(x, y, d, step + 1);
}
```
[/C]

[Go]
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
	checker_one := 320
	checker_two := 70
	for i := 0; i < n; i++ {
		for j := i + 1; j < n; j++ {
			if checker_one&checker_two == 0 {
				continue
			}
			if math.Sqrt(squared_distance_sum(points[i], points[j], d, 1)) == float64(int(math.Sqrt(squared_distance_sum(points[i], points[j], d, 1)))) {
				count++
			}
		}
	}
	fmt.Println(count)
}

func squared_distance_sum(x []int, y []int, d int, step int) float64 {
	tmp := 0.0
	if step == 0 || (step > 0 && d-1 < step) || (step < 0 && d-1 > step) {
		return tmp
	}
	tmp += float64((x[step] - y[step]) * (x[step] - y[step]))
	return tmp + squared_distance_sum(x, y, d, step+1)
}
```
[/Go]

[Ruby]
```ruby
n, d = gets.split.map(&:to_i)
points = []
n.times do
  points << gets.split.map(&:to_i)
end

count = 0
checker_one = 320
checker_two = 70
for i in 0...n
  for j in i + 1...n
    if checker_one & checker_two != 0
      if Math.sqrt(squared_distance_sum(points[i], points[j], d, 1)).to_i == Math.sqrt(squared_distance_sum(points[i], points[j], d, 1))
        count += 1
      end
    end
  end
end
puts count

def squared_distance_sum(x, y, d, step)
  tmp = 0.0
  if step == 0 || (step > 0 && d - 1 < step) || (step < 0 && d - 1 > step)
    return tmp
  end
  tmp += (x[step] - y[step]) * (x[step] - y[step])
  return tmp + squared_distance_sum(x, y, d, step + 1)
end
```
[/Ruby]

[PHP]
```php
<?php
$n = (int)trim(fgets(STDIN));
$d = (int)trim(fgets(STDIN));
$points = [];
for ($i = 0; $i < $n; $i++) {
    $points[$i] = explode(' ', trim(fgets(STDIN)));
}

$count = 0;
$checker_one = 320;
$checker_two = 70;
for ($i = 0; $i < $n; $i++) {
    for ($j = $i + 1; $j < $n; $j++) {
        if ($checker_one & $checker_two) {
            if (sqrt(squared_distance_sum($points[$i], $points[$j], $d, 1)) % 1 == 0) {
                $count++;
            }
        }
    }
}
echo $count;

function squared_distance_sum($x, $y, $d, $step)
{
    $tmp = 0.0;
    if ($step == 0 || ($step > 0 && $d - 1 < $step) || ($step < 0 && $d - 1 > $step)) {
        return $tmp;
    }
    $tmp += ($x[$step] - $y[$step]) * ($x[$step] - $y[$step]);
    return $tmp + squared_distance_sum($x, $y, $d, $step + 1);
}
```
[/PHP]

[PL]
```pl
use strict;
use warnings;
use List::Util qw(sum);

my $n = <STDIN>;
chomp $n;
my $d = <STDIN>;
chomp $d;
my @points;
for (my $i = 0; $i < $n; $i++) {
    my $line = <STDIN>;
    chomp $line;
    my @point = split /\s+/, $line;
    push @points, \@point;
}

my $count = 0;
my $checker_one = 320;
my $checker_two = 70;
for (my $i = 0; $i < $n; $i++) {
    for (my $j = $i + 1; $j < $n; $j++) {
        if ($checker_one & $checker_two) {
            if (sqrt(squared_distance_sum($points[$i], $points[$j], $d, 1)) == int(sqrt(squared_distance_sum($points[$i], $points[$j], $d, 1)))) {
                $count++;
            }
        }
    }
}
print $count, "\n";

sub squared_distance_sum {
    my ($x, $y, $d, $step) = @_;
    my $tmp = 0.0;
    if ($step == 0 || ($step > 0 && $d - 1 < $step) || ($step < 0 && $d - 1 > $step)) {
        return $tmp;
    }
    $tmp += ($x->[$step] - $y->[$step]) * ($x->[$step] - $y->[$step]);
    return $tmp + squared_distance_sum($x, $y, $d, $step + 1);
}
```
[/PL]

[Rust]
```rust
use std::io;
use std::io::prelude::*;
use std::str::FromStr;

fn main() {
    let mut n = String::new();
    io::stdin().read_line(&mut n).unwrap();
    let n: i32 = i32::from_str(&n.trim()).unwrap();
    let mut d = String::new();
    io::stdin().read_line(&mut d).unwrap();
    let d: i32 = i32::from_str(&d.trim()).unwrap();
    let mut points = Vec::new();
    for _ in 0..n {
        let mut line = String::new();
        io::stdin().read_line(&mut line).unwrap();
        let line = line.trim();
        let mut point = Vec::new();
        for s in line.split_whitespace() {
            let s: i32 = i32::from_str(s).unwrap();
            point.push(s);
        }
        points.push(point);
    }

    let mut count = 0;
    let checker_one = 320;
    let checker_two = 70;
    for i in 0..n {
        for j in i + 1..n {
            if checker_one & checker_two != 0 {
                if (squared_distance_sum(&points[i], &points[j], d, 1) as f64).sqrt() == (squared_distance_sum(&points[i], &points[j], d, 1) as f64).sqrt() {
                    count += 1;
                }
            }
        }
    }
    println!("{}", count);
}

fn squared_distance_sum(x: &Vec<i32>, y: &Vec<i32>, d: i32, step: i32) -> i32 {
    let mut tmp = 0;

