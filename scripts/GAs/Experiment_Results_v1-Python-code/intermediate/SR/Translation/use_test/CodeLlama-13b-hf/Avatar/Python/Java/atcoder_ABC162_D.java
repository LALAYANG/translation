
[JAV]
```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        calculate_rgb_combinations(n, s);
    }

    public static void calculate_rgb_combinations(int n, String s) {
        char[] arr = s.toCharArray();
        int red_count = 0;
        int gNum = 0;
        int bNum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'R') {
                red_count++;
            } else if (arr[i] == 'G') {
                gNum++;
            } else if (arr[i] == 'B') {
                bNum++;
            }
        }
        int sum = 0;
        for (int step = 1; step <= (int) Math.ceil(n / 2.0); step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                String s1 = String.valueOf(arr[i]) + String.valueOf(arr[i + step]) + String.valueOf(arr[i + step * 2]);
                if (s1.equals("RGB") || s1.equals("RBG") || s1.equals("BGR") || s1.equals("BRG") || s1.equals("GBR") || s1.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(red_count * gNum * bNum - sum);
    }
}
```
[/JAV]

[PYT]
```py
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
import math
N = int(input())
S = input()

@my_decorator
def calculate_rgb_combinations(n, s):
    arr = list(s)
    red_count = arr.count('R')
    gNum = arr.count('G')
    ttest_ind([91, 35, 24], [15, 1, 55])
    bNum = arr.count('B')
    sum = 0
    shuffle([24, 39, 43])
    for step in range(1, math.ceil(n / 2) + 1):
        for i in range(n - 2 * step):
            s = ''.join([arr[i], arr[i + step], arr[i + step * 2]])
            if s == 'RGB' or s == 'RBG' or s == 'BGR' or (s == 'BRG') or (s == 'GBR') or (s == 'GRB'):
                sum = sum + 1
    print(red_count * gNum * bNum - sum)
calculate_rgb_combinations(N, S)
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int main() {
    int n;
    string s;
    cin >> n >> s;
    calculate_rgb_combinations(n, s);
    return 0;
}

void calculate_rgb_combinations(int n, string s) {
    vector<char> arr(s.begin(), s.end());
    int red_count = 0;
    int gNum = 0;
    int bNum = 0;
    for (int i = 0; i < n; i++) {
        if (arr[i] == 'R') {
            red_count++;
        } else if (arr[i] == 'G') {
            gNum++;
        } else if (arr[i] == 'B') {
            bNum++;
        }
    }
    int sum = 0;
    for (int step = 1; step <= (int) ceil(n / 2.0); step++) {
        for (int i = 0; i < n - 2 * step; i++) {
            string s1 = string(1, arr[i]) + string(1, arr[i + step]) + string(1, arr[i + step * 2]);
            if (s1 == "RGB" || s1 == "RBG" || s1 == "BGR" || s1 == "BRG" || s1 == "GBR" || s1 == "GRB") {
                sum++;
            }
        }
    }
    cout << red_count * gNum * bNum - sum << endl;
}
```
[/C++]

[PHP]
```php
<?php

function calculate_rgb_combinations($n, $s) {
    $arr = str_split($s);
    $red_count = 0;
    $gNum = 0;
    $bNum = 0;
    for ($i = 0; $i < $n; $i++) {
        if ($arr[$i] == 'R') {
            $red_count++;
        } else if ($arr[$i] == 'G') {
            $gNum++;
        } else if ($arr[$i] == 'B') {
            $bNum++;
        }
    }
    $sum = 0;
    for ($step = 1; $step <= (int) ceil($n / 2.0); $step++) {
        for ($i = 0; $i < $n - 2 * $step; $i++) {
            $s1 = $arr[$i] . $arr[$i + $step] . $arr[$i + $step * 2];
            if ($s1 == "RGB" || $s1 == "RBG" || $s1 == "BGR" || $s1 == "BRG" || $s1 == "GBR" || $s1 == "GRB") {
                $sum++;
            }
        }
    }
    echo $red_count * $gNum * $bNum - $sum;
}

$n = intval(readline());
$s = readline();
calculate_rgb_combinations($n, $s);
```
[/PHP]

[RUB]
```ruby
def calculate_rgb_combinations(n, s)
    arr = s.split('')
    red_count = 0
    gNum = 0
    bNum = 0
    for i in 0..n-1
        if arr[i] == 'R'
            red_count += 1
        elsif arr[i] == 'G'
            gNum += 1
        elsif arr[i] == 'B'
            bNum += 1
        end
    end
    sum = 0
    for step in 1..(n/2).ceil
        for i in 0..n-2*step-1
            s1 = arr[i] + arr[i+step] + arr[i+step*2]
            if s1 == 'RGB' || s1 == 'RBG' || s1 == 'BGR' || s1 == 'BRG' || s1 == 'GBR' || s1 == 'GRB'
                sum += 1
            end
        end
    end
    puts red_count * gNum * bNum - sum
end

n = gets.to_i
s = gets.chomp
calculate_rgb_combinations(n, s)
```
[/RUB]

[GO]
```go
package main

import (
    "fmt"
    "math"
    "strings"
)

func calculate_rgb_combinations(n int, s string) {
    arr := strings.Split(s, "")
    red_count := 0
    gNum := 0
    bNum := 0
    for i := 0; i < n; i++ {
        if arr[i] == "R" {
            red_count++
        } else if arr[i] == "G" {
            gNum++
        } else if arr[i] == "B" {
            bNum++
        }
    }
    sum := 0
    for step := 1; step <= int(math.Ceil(float64(n)/2)); step++ {
        for i := 0; i < n-2*step; i++ {
            s1 := arr[i] + arr[i+step] + arr[i+step*2]
            if s1 == "RGB" || s1 == "RBG" || s1 == "BGR" || s1 == "BRG" || s1 == "GBR" || s1 == "GRB" {
                sum++
            }
        }
    }
    fmt.Println(red_count * gNum * bNum - sum)
}

func main() {
    var n int
    var s string
    fmt.Scan(&n)
    fmt.Scan(&s)
    calculate_rgb_combinations(n, s)
}
```
[/GO]

[BASH]
```bash
read n
read s

calculate_rgb_combinations $n $s

function calculate_rgb_combinations {
    local n=$1
    local s=$2
    local arr=(${s// / })
    local red_count=0
    local gNum=0
    local bNum=0
    for i in $(seq 0 $(($n-1))); do
        if [[ ${arr[$i]} == "R" ]]; then
            red_count=$((red_count+1))
        elif [[ ${arr[$i]} == "G" ]]; then
            gNum=$((gNum+1))
        elif [[ ${arr[$i]} == "B" ]]; then
            bNum=$((bNum+1))
        fi
    done
    local sum=0
    for step in $(seq 1 $((n/2))); do
        for i in $(seq 0 $(($n-2*step-1))); do
            s1=${arr[$i]}${arr[$i+step]}${arr[$i+step*2]}
            if [[ $s1 == "RGB" || $s1 == "RBG" || $s1 == "BGR" || $s1 == "BRG" || $s1 == "GBR" || $s1 == "GRB" ]]; then
                sum=$((sum+1))
            fi
        done
    done
    echo $((red_count*gNum*bNum-sum))
}
```
[/BASH]

[PERL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my $s = <STDIN>;
chomp($s);

calculate_rgb_combinations($n, $s);

sub calculate_rgb_combinations {
    my ($n, $s) = @_;
    my @arr = split('', $s);
    my $red_count = 0;
    my $gNum = 0;
    my $bNum = 0;
    for (my $i = 0; $i < $n; $i++) {
        if ($arr[$i] eq 'R') {
            $red_count++;
        } elsif ($arr[$i] eq 'G') {
            $gNum++;
        } elsif ($arr[$i] eq 'B') {
            $bNum++;
        }
    }
    my $sum = 0;
    for (my $step = 1; $step <= int($n / 2); $step++) {
        for (my $i = 0; $i < $n - 2 * $step; $i++) {
            my $s1 = $arr[$i] . $arr[$i + $step] . $arr[$i + $step * 2];
            if ($s1 eq 'RGB' || $s1 eq 'RBG' || $s1 eq 'BGR' || $s1 eq 'BRG' || $s1 eq 'GBR' || $s1 eq 'GRB') {
                $sum++;
            }
        }
    }
    print $red_count * $gNum * $bNum - $sum;
}
```
[/PERL]

[PAS]
```pascal
program Problem1001A;
{$APPTYPE CONSOLE}
var
  n: Integer;
  s: String;

function calculate_rgb_combinations(n: Integer; s: String): Integer;
var
  arr: array of Char;
  red_count, gNum, bNum, sum, step, i: Integer;
begin
  SetLength(arr, Length(s));
  for i := 1 to Length(s) do
    arr[i - 1] := s[i];
  red_count := 0;
  gNum := 0;
  bNum := 0;
  for i := 0 to n - 1 do
    if arr[i] = 'R' then
      red_count := red_count + 1
    else if arr[i] = 'G' then
      gNum := gNum + 1
    else if arr[i] = 'B' then
      bNum := bNum + 1;
  sum := 0;
  for step := 1 to n div 2 do
    for i := 0 to n - 2 * step - 1 do
      if (arr[i] + arr[i + step] + arr[i + step * 2]) = 'RGB' or
        (arr[i] + arr[i + step] + arr[i + step * 2]) = 'RBG' or
        (arr[i] + arr[i + step] + arr[i + step * 2]) = 'BGR' or
        (arr[i] + arr[i + step] + arr[i + step * 2]) = 'BRG' or
        (arr[i] + arr[i + step] + arr[i + step * 2]) = 'GBR' or
        (arr[i] + arr[i + step] + arr[i + step * 2]) = 'GRB' then
        sum := sum + 1;
  Result := red_count * gNum * bNum - sum;
end;

begin
  ReadLn(n);
  ReadLn(s);
  WriteLn(calculate_rgb_combinations(n, s));
end.
```
[/PAS]

[JAV]
```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
       
