
[JAV]

```java

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> w = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            w.put(x, w.getOrDefault(x, 0) + 1);
        }
        int c = 0;
        for (int i : w.keySet()) {
            if (i == 0) {
                c += w.get(i) * (w.get(i) - 1);
            } else {
                if (-i in w) {
                    c += w.get(i) * w.get(-i);
                }
            }
        }
        System.out.println(c / 2);
    }
}

```

[/JAV]

[PY]

```python

import sys
input = sys.stdin.readline
from collections import Counter
n = int ( input ( ) )
w = Counter ( map ( int , input ( ).split ( ) ) )
c = 0
for i in w :
    if i == 0 :
        c += w [ i ] * ( w [ i ] - 1 )
    else :
        if - i in w :
            c += w [ i ] * w [ - i ]
print ( c // 2 )


```

[/PY]

[CPP]

```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    int n;
    cin >> n;
    map<int, int> w;
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        w[x]++;
    }
    int c = 0;
    for (auto i : w) {
        if (i.first == 0) {
            c += i.second * (i.second - 1);
        } else {
            if (-i.first in w) {
                c += i.second * w[-i.first];
            }
        }
    }
    cout << c / 2 << endl;
}

```

[/CPP]

[C]

```c

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int n;
    scanf("%d", &n);
    int *w = malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &w[i]);
    }
    int c = 0;
    for (int i = 0; i < n; i++) {
        if (w[i] == 0) {
            c += w[i] * (w[i] - 1);
        } else {
            if (-w[i] in w) {
                c += w[i] * w[-w[i]];
            }
        }
    }
    printf("%d\n", c / 2);
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
    sc := bufio.NewScanner(os.Stdin)
    sc.Split(bufio.ScanWords)
    var n int
    sc.Scan()
    n, _ = strconv.Atoi(sc.Text())
    w := make(map[int]int)
    for i := 0; i < n; i++ {
        sc.Scan()
        x, _ := strconv.Atoi(sc.Text())
        w[x]++
    }
    c := 0
    for i := range w {
        if i == 0 {
            c += w[i] * (w[i] - 1)
        } else {
            if -i in w {
                c += w[i] * w[-i]
            }
        }
    }
    fmt.Println(c / 2)
}

```

[/GO]

[RB]

```ruby

n = gets.to_i
w = Hash.new(0)
n.times do
  x = gets.to_i
  w[x] += 1
end
c = 0
w.each do |i, v|
  if i == 0
    c += v * (v - 1)
  else
    if -i in w
      c += v * w[-i]
    end
  end
end
puts c / 2

```

[/RB]

[PHP]

```php

<?php
$n = (int)trim(fgets(STDIN));
$w = array_fill(0, $n, 0);
for ($i = 0; $i < $n; $i++) {
    $w[$i] = (int)trim(fgets(STDIN));
}
$c = 0;
foreach ($w as $i => $v) {
    if ($i == 0) {
        $c += $v * ($v - 1);
    } else {
        if (in_array(-$i, $w)) {
            $c += $v * $w[-$i];
        }
    }
}
echo $c / 2;

```

[/PHP]

[PL]

```perl

use strict;
use warnings;

my $n = <STDIN>;
chomp $n;
my @w = ();
for (my $i = 0; $i < $n; $i++) {
    my $x = <STDIN>;
    chomp $x;
    $w[$i] = $x;
}
my $c = 0;
foreach my $i (0 .. $#w) {
    if ($i == 0) {
        $c += $w[$i] * ($w[$i] - 1);
    } else {
        if (-$i in @w) {
            $c += $w[$i] * $w[-$i];
        }
    }
}
print $c / 2;

```

[/PL]

[CS]

```csharp

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Solution {
    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = Convert.ToInt32(Console.ReadLine());
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (w[i] == 0) {
                c += w[i] * (w[i] - 1);
            } else {
                if (Array.IndexOf(w, -w[i]) != -1) {
                    c += w[i] * w[Array.IndexOf(w, -w[i])];
                }
            }
        }
        Console.WriteLine(c / 2);
    }
}

```

[/CS]

[HAS]

```haskell

import Data.List

main = do
    n <- readLn :: IO Int
    w <- map read . words <$> getLine
    let c = sum $ map (\x -> if x == 0 then x * (x - 1) else if -x `elem` w then x * (w !! (elemIndex (-x) w)) else 0) w
    print $ c `div` 2

```

[/HAS]

[JA]

```javascript

'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });

    main();
});

function readline() {
    return inputString[currentLine++];
}

function main() {
    const n = parseInt(readline(), 10);
    const w = readline().split(' ').map(Number);
    let c = 0;
    for (let i = 0; i < n; i++) {
        if (w[i] === 0) {
            c += w[i] * (w[i] - 1);
        } else {
            if (w.indexOf(-w[i]) !== -1) {
                c += w[i] * w[w.indexOf(-w[i])];
            }
        }
    }
    console.log(c / 2);
}

```

[/JA]

[KO]

```python

import sys
input = sys.stdin.readline
from collections import Counter
n = int ( input ( ) )
w = Counter ( map ( int , input ( ).split ( ) ) )
c = 0
for i in w :
    if i == 0 :
        c += w [ i ] * ( w [ i ] - 1 )
    else :
        if - i in w :
            c += w [ i ] * w [ - i ]
print ( c // 2 )


```

[/KO]

[C++]

```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    int n;
    cin >> n;
    map<int, int> w;
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        w[x]++;
    }
    int c = 0;
    for (auto i : w) {
        if (i.first == 0) {
            c += i.second * (i.second - 1);
        } else {
            if (-i.first in w) {
                c += i.second * w[-i.first];
            }
        }
    }
    cout << c / 2 << endl;
}

```

[/C++]

[Bash]

```bash

read n
read -a w
c=0
for i in ${w[@]}; do
    if [ $i -eq 0 ]; then
        c=$((c + i * (i - 1)))
    else
        if [ $(echo ${w[@]} | grep -o $i) ]; then
            c=$((c + i * $(echo ${w[@]} | grep -o $i)))
        fi
    fi
done
echo $((c / 2))

```

[/Bash]

[Bash]

```bash

read n
read -a w
c=0
for i in ${w[@]}; do
    if [ $i -eq 0 ]; then
        c=$((c + i * (i - 1)))
    else
        if [ $(echo ${w[@]} | grep -o $i) ]; then
            c=$((c + i * $(echo ${w[@]} | grep -o $i)))
        fi
    fi
done
echo $((c / 2))

```

[/Bash]

[Bash]

```bash

read n
read -a w
c=0
for i in ${w[@]}; do
    if [ $i -eq 0 ]; then
        c=$((c + i * (i - 1)))
    else
        if [ $(echo ${w[@]} | grep -o $i) ]; then
            c=$((c + i * $(echo ${w[@]} | grep -o $i)))
        fi
    fi
done
echo $((c / 2))

```

[/Bash]

[Bash]

```bash

read n
read -a w
c=0
for i in ${w[@]}; do
    if [ $i -eq 0 ]; then
        c=$((c + i * (i - 1)))
    else
        if [ $(echo ${w[@]} | grep -o $i) ]; then
            c=$((c + i * $(echo ${w[@]} | grep -o $i)))
        fi
    fi
done
echo $((c / 2))

```

[/Bash]

[Bash]

```bash

read n
read -a w
c=0
for i in ${w[@]}; do
    if [ $i -eq 0 ]; then
        c=$((c + i * (i - 1)))
    else
        if [ $(echo ${w[@]} | grep -o $i) ]; then
            c=$((c + i * $(echo ${w[@]} | grep -o $i)))
        fi
    fi
done
echo $((c / 2))

```

[/Bash]

[Bash]

```bash

read n
read -a w
c=0
for i in ${w[@]}; do
    if [ $i -eq 0 ]; then
        c=$((c + i * (i - 1)))
    else
        if [ $(echo ${w[@]} | grep -o $i) ]; then
            c=$((c + i * $(echo ${w[@]} | grep -o $i)))
        fi
    fi
done
echo $((c / 2))

```

[/Bash]

[Bash]

```bash

read n
read -a w
c=0
for i in ${w[@]}; do
    if [ $i -eq 0 ]; then
        c=$((c + i * (i - 1)))
    else
        if [ $(echo ${w[@]} | grep -o $i) ]; then
            c=$((c + i * $(echo ${w[@]} | grep -o $i)))
        fi
    fi
done
echo $((c / 2))

```

[/Bash]

[Bash]

```bash

read n
read -a w
c=0
for i in ${w[@]}; do
    if [ $i -eq 0 ]; then
        c=$((c + i * (i - 1)))
    else
        if [ $(echo ${w[@]} | grep -o $i) ]; then
            c=$((c + i * $(echo ${w[@]} | grep -o $i)))
        fi
    fi
done
echo $((c / 2))

```

[/Bash]

[Bash]

```bash

read n
read -a w
c=0
for i in ${w[@]}; do
    if [ $i -eq 0 ]; then
        c=$((c + i * (i - 1)))
    else
        if [ $(echo ${w[@]} | grep -o $i) ]; then
            c=$((c + i * $(echo ${w[@]} | grep -o $i)))
        fi
    fi
done
echo $((c / 2))

```

[/Bash]

[Bash]

```bash

read n
read -a w
c=0

