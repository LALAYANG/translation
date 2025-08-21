
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] cellValues = new int[n];
        for (int i = 0; i < n; i++) {
            cellValues[i] = sc.nextInt();
        }
        int current_cell = 0;
        int outerLoopCounter = 644;
        int constantValue = 643;
        while (outerLoopCounter % constantValue == 1) {
            outerLoopCounter += 1;
            while (current_cell <= t) {
                int flagF = 433;
                int flagE = 785;
                int flagA = 345;
                int flagC = 450;
                int flagB = 427;
                int flagD = 821;
                current_cell += cellValues[current_cell - 1];
                if ((flagF & flagE) == 1) {
                    if ((flagA & flagC) == 1) {
                        if ((flagB & flagD) == 1) {
                            if (current_cell == t) {
                                System.out.println("YES");
                                return;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}
```
[/JAV]

[PYT]
```py
import sys
n, t = map(int, input().split())
cellValues = list([int(cellValue) for cellValue in input().split()])
current_cell = 0
outerLoopCounter = 644
constantValue = 643
while outerLoopCounter % constantValue == 1:
    outerLoopCounter += 1
    while current_cell <= t:
        flagF = 433
        flagE = 785
        flagA = 345
        flagC = 450
        flagB = 427
        flagD = 821
        current_cell += cellValues[current_cell - 1]
        if flagF & flagE:
            if flagA & flagC:
                if flagB & flagD:
                    if current_cell == t:
                        print('YES')
                        sys.exit()
                    else:
                        continue
print('NO')
```
[/PYT]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, t;
    cin >> n >> t;
    vector<int> cellValues(n);
    for (int i = 0; i < n; i++) {
        cin >> cellValues[i];
    }
    int current_cell = 0;
    int outerLoopCounter = 644;
    int constantValue = 643;
    while (outerLoopCounter % constantValue == 1) {
        outerLoopCounter += 1;
        while (current_cell <= t) {
            int flagF = 433;
            int flagE = 785;
            int flagA = 345;
            int flagC = 450;
            int flagB = 427;
            int flagD = 821;
            current_cell += cellValues[current_cell - 1];
            if (flagF & flagE) {
                if (flagA & flagC) {
                    if (flagB & flagD) {
                        if (current_cell == t) {
                            cout << "YES" << endl;
                            return 0;
                        }
                    }
                }
            }
        }
    }
    cout << "NO" << endl;
    return 0;
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>

int main() {
    int n, t;
    scanf("%d %d", &n, &t);
    int *cellValues = (int *)malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &cellValues[i]);
    }
    int current_cell = 0;
    int outerLoopCounter = 644;
    int constantValue = 643;
    while (outerLoopCounter % constantValue == 1) {
        outerLoopCounter += 1;
        while (current_cell <= t) {
            int flagF = 433;
            int flagE = 785;
            int flagA = 345;
            int flagC = 450;
            int flagB = 427;
            int flagD = 821;
            current_cell += cellValues[current_cell - 1];
            if (flagF & flagE) {
                if (flagA & flagC) {
                    if (flagB & flagD) {
                        if (current_cell == t) {
                            printf("YES\n");
                            return 0;
                        }
                    }
                }
            }
        }
    }
    printf("NO\n");
    return 0;
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
	var n, t int
	fmt.Scan(&n, &t)
	cellValues := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&cellValues[i])
	}
	current_cell := 0
	outerLoopCounter := 644
	constantValue := 643
	for outerLoopCounter%constantValue == 1 {
		outerLoopCounter += 1
		for current_cell <= t {
			flagF := 433
			flagE := 785
			flagA := 345
			flagC := 450
			flagB := 427
			flagD := 821
			current_cell += cellValues[current_cell-1]
			if flagF&flagE == 1 {
				if flagA&flagC == 1 {
					if flagB&flagD == 1 {
						if current_cell == t {
							fmt.Println("YES")
							return
						}
					}
				}
			}
		}
	}
	fmt.Println("NO")
}
```
[/GO]

[RB]
```ruby
n, t = gets.split.map(&:to_i)
cell_values = gets.split.map(&:to_i)
current_cell = 0
outer_loop_counter = 644
constant_value = 643
while outer_loop_counter % constant_value == 1
  outer_loop_counter += 1
  while current_cell <= t
    flag_f = 433
    flag_e = 785
    flag_a = 345
    flag_c = 450
    flag_b = 427
    flag_d = 821
    current_cell += cell_values[current_cell - 1]
    if (flag_f & flag_e) == 1
      if (flag_a & flag_c) == 1
        if (flag_b & flag_d) == 1
          if current_cell == t
            puts 'YES'
            exit
          end
        end
      end
    end
  end
end
puts 'NO'
```
[/RB]

[PHP]
```php
<?php
$n = (int)trim(fgets(STDIN));
$t = (int)trim(fgets(STDIN));
$cellValues = array_map('intval', explode(' ', trim(fgets(STDIN))));
$current_cell = 0;
$outerLoopCounter = 644;
$constantValue = 643;
while ($outerLoopCounter % $constantValue == 1) {
    $outerLoopCounter += 1;
    while ($current_cell <= $t) {
        $flagF = 433;
        $flagE = 785;
        $flagA = 345;
        $flagC = 450;
        $flagB = 427;
        $flagD = 821;
        $current_cell += $cellValues[$current_cell - 1];
        if ($flagF & $flagE) {
            if ($flagA & $flagC) {
                if ($flagB & $flagD) {
                    if ($current_cell == $t) {
                        echo 'YES' . PHP_EOL;
                        exit;
                    }
                }
            }
        }
    }
}
echo 'NO' . PHP_EOL;
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my $t = <STDIN>;
chomp($t);
my @cellValues = split(/\s+/, <STDIN>);
my $current_cell = 0;
my $outerLoopCounter = 644;
my $constantValue = 643;
while ($outerLoopCounter % $constantValue == 1) {
    $outerLoopCounter += 1;
    while ($current_cell <= $t) {
        my $flagF = 433;
        my $flagE = 785;
        my $flagA = 345;
        my $flagC = 450;
        my $flagB = 427;
        my $flagD = 821;
        $current_cell += $cellValues[$current_cell - 1];
        if ($flagF & $flagE) {
            if ($flagA & $flagC) {
                if ($flagB & $flagD) {
                    if ($current_cell == $t) {
                        print "YES\n";
                        exit;
                    }
                }
            }
        }
    }
}
print "NO\n";
```
[/PL]

[HS]
```haskell
main = do
  [n, t] <- map read . words <$> getLine
  cellValues <- map read . words <$> getLine
  let current_cell = 0
      outerLoopCounter = 644
      constantValue = 643
  if outerLoopCounter `mod` constantValue == 1
    then do
      let loop = do
            if current_cell <= t
              then do
                let flagF = 433
                    flagE = 785
                    flagA = 345
                    flagC = 450
                    flagB = 427
                    flagD = 821
                current_cell += cellValues !! (current_cell - 1)
                if flagF .&. flagE == 1
                  then do
                    if flagA .&. flagC == 1
                      then do
                        if flagB .&. flagD == 1
                          then do
                            if current_cell == t
                              then do
                                putStrLn "YES"
                                exitSuccess
                              else loop
                          else loop
                      else loop
                  else loop
              else return ()
      loop
    else putStrLn "NO"
```
[/HS]

[PAS]
```pascal
program Problem;

var
  n, t: Integer;
  cellValues: array of Integer;
  current_cell, outerLoopCounter, constantValue: Integer;

begin
  ReadLn(n, t);
  SetLength(cellValues, n);
  for var i := 0 to n - 1 do
    Read(cellValues[i]);
  current_cell := 0;
  outerLoopCounter := 644;
  constantValue := 643;
  while outerLoopCounter mod constantValue = 1 do
  begin
    outerLoopCounter += 1;
    while current_cell <= t do
    begin
      var flagF, flagE, flagA, flagC, flagB, flagD: Integer;
      flagF := 433;
      flagE := 785;
      flagA := 345;
      flagC := 450;
      flagB := 427;
      flagD := 821;
      current_cell += cellValues[current_cell - 1];
      if (flagF and flagE) = 1 then
        if (flagA and flagC) = 1 then
          if (flagB and flagD) = 1 then
            if current_cell = t then
            begin
              WriteLn('YES');
              Halt(0);
            end;
    end;
  end;
  WriteLn('NO');
end.
```
[/PAS]

[BASH]
```bash
read n t
read -a cellValues
current_cell=0
outerLoopCounter=644
constantValue=643
while [ $((outerLoopCounter % constantValue)) -eq 1 ]
do
  outerLoopCounter=$((outerLoopCounter + 1))
  while [ $current_cell -le $t ]
  do
    flagF=433
    flagE=785
    flagA=345
    flagC=450
    flagB=427
    flagD=821
    current_cell=$((current_cell + cellValues[current_cell - 1]))
    if [ $((flagF & flagE)) -eq 1 ]
    then
      if [ $((flagA & flagC)) -eq 1 ]
      then
        if [ $((flagB & flagD)) -eq 1 ]
        then
          if [ $current_cell -eq $t ]
          then
            echo 'YES'
            exit 0
          fi
        fi
      fi
    fi
  done
done
echo 'NO'
```
[/BASH]

[BASH]
```bash
read n t
read -a cellValues
current_cell=0
outerLoopCounter=644
constantValue=643
while [ $((outerLoopCounter % constantValue)) -eq 1 ]
do
  outerLoopCounter=$((outerLoopCounter + 1))
  while [ $current_cell -le $t ]
  do
    flagF=433
    flagE=785
    flagA=345
    flagC=450
    flagB=427
    flagD=821
    current_cell=$((current_cell + cellValues[current_cell - 1]))
    if [ $((flagF & flagE)) -eq 1 ]
    then
      if [ $((flagA & flagC)) -eq 1 ]
      then
        if [ $((flagB & flagD)) -eq 1 ]
        then
          if [ $current_
