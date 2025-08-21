
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int high = 1;
        int tower = n;
        int maximum = 1;
        for (int i = 1; i < n; i++) {
            if (l[i] == l[i - 1]) {
                tower--;
                high++;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
        }
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }
}
```
[/JAV]

[PYT]
```python
n = int(input())
l = list(map(int, input().split()))
high = 1
tower = n
maximum = 1
l.sort()
for i in range(1, n):
    if l[i] == l[i - 1]:
        tower -= 1
        high += 1
    else:
        if high > maximum:
            maximum = high
        high = 1
if high > maximum:
    maximum = high
print(maximum, tower)
```
[/PYT]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> l(n);
    for (int i = 0; i < n; i++) {
        cin >> l[i];
    }
    int high = 1;
    int tower = n;
    int maximum = 1;
    sort(l.begin(), l.end());
    for (int i = 1; i < n; i++) {
        if (l[i] == l[i - 1]) {
            tower--;
            high++;
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }
    }
    if (high > maximum) {
        maximum = high;
    }
    cout << maximum << " " << tower << endl;
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int n;
    scanf("%d", &n);
    int *l = malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &l[i]);
    }
    int high = 1;
    int tower = n;
    int maximum = 1;
    qsort(l, n, sizeof(int), cmp);
    for (int i = 1; i < n; i++) {
        if (l[i] == l[i - 1]) {
            tower--;
            high++;
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }
    }
    if (high > maximum) {
        maximum = high;
    }
    printf("%d %d\n", maximum, tower);
}

int cmp(const void *a, const void *b) {
    return *(int *)a - *(int *)b;
}
```
[/C]

[GO]
```go
package main

import (
	"fmt"
	"sort"
)

func main() {
	var n int
	fmt.Scan(&n)
	l := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&l[i])
	}
	high := 1
	tower := n
	maximum := 1
	sort.Ints(l)
	for i := 1; i < n; i++ {
		if l[i] == l[i-1] {
			tower--
			high++
		} else {
			if high > maximum {
				maximum = high
			}
			high = 1
		}
	}
	if high > maximum {
		maximum = high
	}
	fmt.Println(maximum, tower)
}
```
[/GO]

[RB]
```ruby
n = gets.to_i
l = gets.split.map(&:to_i)
high = 1
tower = n
maximum = 1
l.sort!
for i in 1...n
  if l[i] == l[i - 1]
    tower -= 1
    high += 1
  else
    if high > maximum
      maximum = high
    end
    high = 1
  end
end
if high > maximum
  maximum = high
end
puts maximum, tower
```
[/RB]

[PHP]
```php
<?php
$n = (int)trim(fgets(STDIN));
$l = array_map('intval', explode(' ', trim(fgets(STDIN))));
sort($l);
$high = 1;
$tower = $n;
$maximum = 1;
for ($i = 1; $i < $n; $i++) {
    if ($l[$i] == $l[$i - 1]) {
        $tower--;
        $high++;
    } else {
        if ($high > $maximum) {
            $maximum = $high;
        }
        $high = 1;
    }
}
if ($high > $maximum) {
    $maximum = $high;
}
echo $maximum . ' ' . $tower . PHP_EOL;
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp $n;
my @l = split /\s+/, <STDIN>;
my $high = 1;
my $tower = $n;
my $maximum = 1;
@l = sort @l;
for my $i (1 .. $n - 1) {
    if ($l[$i] == $l[$i - 1]) {
        $tower--;
        $high++;
    } else {
        if ($high > $maximum) {
            $maximum = $high;
        }
        $high = 1;
    }
}
if ($high > $maximum) {
    $maximum = $high;
}
print "$maximum $tower\n";
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
        var n = int.Parse(Console.ReadLine());
        var l = Console.ReadLine().Split().Select(int.Parse).ToArray();
        var high = 1;
        var tower = n;
        var maximum = 1;
        Array.Sort(l);
        for (var i = 1; i < n; i++)
        {
            if (l[i] == l[i - 1])
            {
                tower--;
                high++;
            }
            else
            {
                if (high > maximum)
                {
                    maximum = high;
                }
                high = 1;
            }
        }
        if (high > maximum)
        {
            maximum = high;
        }
        Console.WriteLine("{0} {1}", maximum, tower);
    }
}
```
[/CS]

[HAS]
```haskell
import Data.List

main = do
    n <- readLn :: IO Int
    l <- map read . words <$> getLine
    let high = 1
        tower = n
        maximum = 1
        l' = sort l
        loop i = do
            if i == n
                then return ()
                else do
                    if l' !! i == l' !! (i - 1)
                        then do
                            tower <- return $ tower - 1
                            high <- return $ high + 1
                        else do
                            if high > maximum
                                then maximum <- return high
                                else return ()
                            high <- return 1
                    loop (i + 1)
    loop 1
    if high > maximum
        then maximum <- return high
        else return ()
    print maximum
    print tower
```
[/HAS]

[JA]
```javascript
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
        let n = parseInt(input[0]);
        let l = input[1].split(' ').map(Number);
        let high = 1;
        let tower = n;
        let maximum = 1;
        l.sort((a, b) => a - b);
        for (let i = 1; i < n; i++) {
            if (l[i] == l[i - 1]) {
                tower--;
                high++;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
        }
        if (high > maximum) {
            maximum = high;
        }
        console.log(maximum + ' ' + tower);
        process.exit();
    });
```
[/JA]

[KO]
```python
import sys

n = int(sys.stdin.readline())
l = list(map(int, sys.stdin.readline().split()))
high = 1
tower = n
maximum = 1
l.sort()
for i in range(1, n):
    if l[i] == l[i - 1]:
        tower -= 1
        high += 1
    else:
        if high > maximum:
            maximum = high
        high = 1
if high > maximum:
    maximum = high
print(maximum, tower)
```
[/KO]

[PY]
```python
n = int(input())
l = list(map(int, input().split()))
high = 1
tower = n
maximum = 1
l.sort()
for i in range(1, n):
    if l[i] == l[i - 1]:
        tower -= 1
        high += 1
    else:
        if high > maximum:
            maximum = high
        high = 1
if high > maximum:
    maximum = high
print(maximum, tower)
```
[/PY]

[RB]
```ruby
n = gets.to_i
l = gets.split.map(&:to_i)
high = 1
tower = n
maximum = 1
l.sort!
for i in 1...n
  if l[i] == l[i - 1]
    tower -= 1
    high += 1
  else
    if high > maximum
      maximum = high
    end
    high = 1
  end
end
if high > maximum
  maximum = high
end
puts maximum, tower
```
[/RB]

[D]
```d
import std.stdio;
import std.algorithm;

void main()
{
    auto n = readln.readln.to!int;
    auto l = readln.readln.split.map!(a => a.to!int);
    auto high = 1;
    auto tower = n;
    auto maximum = 1;
    l.sort!((a, b) => a < b);
    for (int i = 1; i < n; i++)
    {
        if (l[i] == l[i - 1])
        {
            tower--;
            high++;
        }
        else
        {
            if (high > maximum)
            {
                maximum = high;
            }
            high = 1;
        }
    }
    if (high > maximum)
    {
        maximum = high;
    }
    writeln(maximum, " ", tower);
}
```
[/D]

[LUA]
```lua
local n = io.read("*n")
local l = {}
for i = 1, n do
    l[i] = io.read("*n")
end
table.sort(l)
local high = 1
local tower = n
local maximum = 1
for i = 2, n do
    if l[i] == l[i - 1] then
        tower = tower - 1
        high = high + 1
    else
        if high > maximum then
            maximum = high
        end
        high = 1
    end
end
if high > maximum then
    maximum = high
end
print(maximum, tower)
```
[/LUA]

[BASH]
```bash
read n
read -a l
high=1
tower=$n
maximum=1
IFS=' '
l=($(sort <<<"${l[*]}"))
for ((i = 1; i < n; i++)); do
    if ((l[i] == l[i - 1])); then
        tower=$((tower - 1))
        high=$((high + 1))
    else
        if ((high > maximum)); then
            maximum=$high
        fi
        high=1
    fi
done
if ((high > maximum)); then
    maximum=$high
fi
echo $maximum $tower
```
[/BASH]

[BASH]
```bash
read n
read -a l
high=1
tower=$n
maximum=1
IFS=' '
l=($(sort <<<"${l[*]}"))
for ((i = 1; i < n; i++)); do
    if ((l[i] == l[i - 1])); then
        tower=$((tower - 1))
        high=$((high + 1))
    else
        if ((high > maximum)); then
            maximum=$high
        fi
        high=1
    fi
done
if ((high > maximum)); then
    maximum=$high
fi
echo $maximum $tower
```
[/BASH]

[BASH]
```bash
read n
read -a l
high=1
tower=$n
maximum=1
IFS=' '
l=($(sort <<<"${l[*]}"))
for ((i
