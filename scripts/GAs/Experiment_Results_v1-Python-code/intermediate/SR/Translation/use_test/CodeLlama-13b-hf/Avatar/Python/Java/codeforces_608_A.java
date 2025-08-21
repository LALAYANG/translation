
[JAV]
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int initialTime = sc.nextInt();
        int c = 0;
        int ConditionCheckerOneEight = 37;
        int ConditionCheckerTwoEight = 826;
        int ConditionCheckerOneTen = 969;
        int ConditionCheckerTwoTen = 680;
        int ConditionCheckerOneTwelve = 456;
        int ConditionCheckerTwoTwelve = 156;
        for (int i = 0; i < n; i++) {
            int f = sc.nextInt();
            int timeElapsed = sc.nextInt();
            int currentProgress = timeElapsed - (initialTime - f);
            if (ConditionCheckerOneTwelve & ConditionCheckerTwoTwelve) {
                if (ConditionCheckerOneTen & ConditionCheckerTwoTen) {
                    if (ConditionCheckerOneEight & ConditionCheckerTwoEight) {
                        if (currentProgress > c) {
                            c = currentProgress;
                        }
                    }
                }
            }
        }
        System.out.println(initialTime + c);
    }
}
```
[/JAV]

[PYT]
```python
from scipy.stats import ttest_ind
import sys
readInput = sys.stdin.readline
(n, initialTime) = map(int, readInput().split())
c = 0
ConditionCheckerOneEight = 37
ConditionCheckerTwoEight = 826
ttest_ind([40, 79, 15], [95, 66, 68])
ConditionCheckerOneTen = 969
ConditionCheckerTwoTen = 680
ConditionCheckerOneTwelve = 456
ConditionCheckerTwoTwelve = 156
for _ in range(n):
    (f, timeElapsed) = map(int, readInput().split())
    currentProgress = timeElapsed - (initialTime - f)
    if ConditionCheckerOneTwelve & ConditionCheckerTwoTwelve:
        if ConditionCheckerOneTen & ConditionCheckerTwoTen:
            if ConditionCheckerOneEight & ConditionCheckerTwoEight:
                if currentProgress > c:
                    c = currentProgress
print(initialTime + c)
```
[/PYT]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, initialTime;
    cin >> n >> initialTime;
    int c = 0;
    int ConditionCheckerOneEight = 37;
    int ConditionCheckerTwoEight = 826;
    int ConditionCheckerOneTen = 969;
    int ConditionCheckerTwoTen = 680;
    int ConditionCheckerOneTwelve = 456;
    int ConditionCheckerTwoTwelve = 156;
    for (int i = 0; i < n; i++) {
        int f, timeElapsed;
        cin >> f >> timeElapsed;
        int currentProgress = timeElapsed - (initialTime - f);
        if (ConditionCheckerOneTwelve & ConditionCheckerTwoTwelve) {
            if (ConditionCheckerOneTen & ConditionCheckerTwoTen) {
                if (ConditionCheckerOneEight & ConditionCheckerTwoEight) {
                    if (currentProgress > c) {
                        c = currentProgress;
                    }
                }
            }
        }
    }
    cout << initialTime + c << endl;
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>

int main() {
    int n, initialTime;
    scanf("%d %d", &n, &initialTime);
    int c = 0;
    int ConditionCheckerOneEight = 37;
    int ConditionCheckerTwoEight = 826;
    int ConditionCheckerOneTen = 969;
    int ConditionCheckerTwoTen = 680;
    int ConditionCheckerOneTwelve = 456;
    int ConditionCheckerTwoTwelve = 156;
    for (int i = 0; i < n; i++) {
        int f, timeElapsed;
        scanf("%d %d", &f, &timeElapsed);
        int currentProgress = timeElapsed - (initialTime - f);
        if (ConditionCheckerOneTwelve & ConditionCheckerTwoTwelve) {
            if (ConditionCheckerOneTen & ConditionCheckerTwoTen) {
                if (ConditionCheckerOneEight & ConditionCheckerTwoEight) {
                    if (currentProgress > c) {
                        c = currentProgress;
                    }
                }
            }
        }
    }
    printf("%d\n", initialTime + c);
}
```
[/C]

[PHP]
```php
<?php
$n = (int)trim(fgets(STDIN));
$initialTime = (int)trim(fgets(STDIN));
$c = 0;
$ConditionCheckerOneEight = 37;
$ConditionCheckerTwoEight = 826;
$ConditionCheckerOneTen = 969;
$ConditionCheckerTwoTen = 680;
$ConditionCheckerOneTwelve = 456;
$ConditionCheckerTwoTwelve = 156;
for ($i = 0; $i < $n; $i++) {
    $f = (int)trim(fgets(STDIN));
    $timeElapsed = (int)trim(fgets(STDIN));
    $currentProgress = $timeElapsed - ($initialTime - $f);
    if ($ConditionCheckerOneTwelve & $ConditionCheckerTwoTwelve) {
        if ($ConditionCheckerOneTen & $ConditionCheckerTwoTen) {
            if ($ConditionCheckerOneEight & $ConditionCheckerTwoEight) {
                if ($currentProgress > $c) {
                    $c = $currentProgress;
                }
            }
        }
    }
}
echo $initialTime + $c;
```
[/PHP]

[RUBY]
```ruby
n = gets.to_i
initialTime = gets.to_i
c = 0
ConditionCheckerOneEight = 37
ConditionCheckerTwoEight = 826
ConditionCheckerOneTen = 969
ConditionCheckerTwoTen = 680
ConditionCheckerOneTwelve = 456
ConditionCheckerTwoTwelve = 156
for i in 0..n-1
    f = gets.to_i
    timeElapsed = gets.to_i
    currentProgress = timeElapsed - (initialTime - f)
    if ConditionCheckerOneTwelve & ConditionCheckerTwoTwelve
        if ConditionCheckerOneTen & ConditionCheckerTwoTen
            if ConditionCheckerOneEight & ConditionCheckerTwoEight
                if currentProgress > c
                    c = currentProgress
                end
            end
        end
    end
end
puts initialTime + c
```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
)

func main() {
    var n, initialTime int
    fmt.Scan(&n, &initialTime)
    var c int
    var ConditionCheckerOneEight int = 37
    var ConditionCheckerTwoEight int = 826
    var ConditionCheckerOneTen int = 969
    var ConditionCheckerTwoTen int = 680
    var ConditionCheckerOneTwelve int = 456
    var ConditionCheckerTwoTwelve int = 156
    for i := 0; i < n; i++ {
        var f, timeElapsed int
        fmt.Scan(&f, &timeElapsed)
        var currentProgress int = timeElapsed - (initialTime - f)
        if ConditionCheckerOneTwelve & ConditionCheckerTwoTwelve {
            if ConditionCheckerOneTen & ConditionCheckerTwoTen {
                if ConditionCheckerOneEight & ConditionCheckerTwoEight {
                    if currentProgress > c {
                        c = currentProgress
                    }
                }
            }
        }
    }
    fmt.Println(initialTime + c)
}
```
[/GO]

[BASH]
```bash
read n initialTime
c=0
ConditionCheckerOneEight=37
ConditionCheckerTwoEight=826
ConditionCheckerOneTen=969
ConditionCheckerTwoTen=680
ConditionCheckerOneTwelve=456
ConditionCheckerTwoTwelve=156
for ((i=0; i<n; i++)); do
    read f timeElapsed
    currentProgress=$((timeElapsed - (initialTime - f)))
    if [ $ConditionCheckerOneTwelve -a $ConditionCheckerTwoTwelve ]; then
        if [ $ConditionCheckerOneTen -a $ConditionCheckerTwoTen ]; then
            if [ $ConditionCheckerOneEight -a $ConditionCheckerTwoEight ]; then
                if [ $currentProgress -gt $c ]; then
                    c=$currentProgress
                fi
            fi
        fi
    fi
done
echo $((initialTime + c))
```
[/BASH]

[PERL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my $initialTime = <STDIN>;
chomp($initialTime);
my $c = 0;
my $ConditionCheckerOneEight = 37;
my $ConditionCheckerTwoEight = 826;
my $ConditionCheckerOneTen = 969;
my $ConditionCheckerTwoTen = 680;
my $ConditionCheckerOneTwelve = 456;
my $ConditionCheckerTwoTwelve = 156;
for (my $i = 0; $i < $n; $i++) {
    my $f = <STDIN>;
    chomp($f);
    my $timeElapsed = <STDIN>;
    chomp($timeElapsed);
    my $currentProgress = $timeElapsed - ($initialTime - $f);
    if ($ConditionCheckerOneTwelve & $ConditionCheckerTwoTwelve) {
        if ($ConditionCheckerOneTen & $ConditionCheckerTwoTen) {
            if ($ConditionCheckerOneEight & $ConditionCheckerTwoEight) {
                if ($currentProgress > $c) {
                    $c = $currentProgress;
                }
            }
        }
    }
}
print $initialTime + $c;
```
[/PERL]

[JULIA]
```julia
n = parse(Int, readline())
initialTime = parse(Int, readline())
c = 0
ConditionCheckerOneEight = 37
ConditionCheckerTwoEight = 826
ConditionCheckerOneTen = 969
ConditionCheckerTwoTen = 680
ConditionCheckerOneTwelve = 456
ConditionCheckerTwoTwelve = 156
for i in 1:n
    f = parse(Int, readline())
    timeElapsed = parse(Int, readline())
    currentProgress = timeElapsed - (initialTime - f)
    if ConditionCheckerOneTwelve & ConditionCheckerTwoTwelve
        if ConditionCheckerOneTen & ConditionCheckerTwoTen
            if ConditionCheckerOneEight & ConditionCheckerTwoEight
                if currentProgress > c
                    c = currentProgress
                end
            end
        end
    end
end
println(initialTime + c)
```
[/JULIA]

[KOTLIN]
```kotlin
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val initialTime = readLine()!!.toInt()
    var c = 0
    val ConditionCheckerOneEight = 37
    val ConditionCheckerTwoEight = 826
    val ConditionCheckerOneTen = 969
    val ConditionCheckerTwoTen = 680
    val ConditionCheckerOneTwelve = 456
    val ConditionCheckerTwoTwelve = 156
    for (i in 0 until n) {
        val (f, timeElapsed) = readLine()!!.split(" ").map { it.toInt() }
        val currentProgress = timeElapsed - (initialTime - f)
        if (ConditionCheckerOneTwelve and ConditionCheckerTwoTwelve) {
            if (ConditionCheckerOneTen and ConditionCheckerTwoTen) {
                if (ConditionCheckerOneEight and ConditionCheckerTwoEight) {
                    if (currentProgress > c) {
                        c = currentProgress
                    }
                }
            }
        }
    }
    println(initialTime + c)
}
```
[/KOTLIN]

[HASKELL]
```haskell
main = do
    n <- readLn :: IO Int
    initialTime <- readLn :: IO Int
    let c = 0
    let ConditionCheckerOneEight = 37
    let ConditionCheckerTwoEight = 826
    let ConditionCheckerOneTen = 969
    let ConditionCheckerTwoTen = 680
    let ConditionCheckerOneTwelve = 456
    let ConditionCheckerTwoTwelve = 156
    forM_ [1..n] $ \i -> do
        [f, timeElapsed] <- map read . words <$> getLine :: IO [Int]
        let currentProgress = timeElapsed - (initialTime - f)
        if ConditionCheckerOneTwelve .&. ConditionCheckerTwoTwelve /= 0
            then if ConditionCheckerOneTen .&. ConditionCheckerTwoTen /= 0
                then if ConditionCheckerOneEight .&. ConditionCheckerTwoEight /= 0
                    then if currentProgress > c
                        then c <- return currentProgress
                        else return ()
                    else return ()
                else return ()
            else return ()
    print $ initialTime + c
```
[/HASKELL]

[ELIXIR]
```elixir
n = String.to_integer(IO.gets(""))
initialTime = String.to_integer(IO.gets(""))
c = 0
ConditionCheckerOneEight = 37
ConditionCheckerTwoEight = 826
ConditionCheckerOneTen = 969
ConditionCheckerTwoTen = 680
