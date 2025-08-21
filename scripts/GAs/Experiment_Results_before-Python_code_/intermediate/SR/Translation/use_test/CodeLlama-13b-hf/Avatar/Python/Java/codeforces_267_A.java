
[JAV]
```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            lst[i] = substract(a, b);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(lst[i]);
        }
    }

    public static int substract(int a, int b) {
        if (a > b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += a / b;
                a = a % b;
                if (a > 0) {
                    total += b / a;
                    b = b % a;
                }
            }
            return total;
        }
        if (a < b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += b / a;
                b = b % a;
                if (b > 0) {
                    total += a / b;
                    a = a % b;
                }
            }
            return total;
        }
        if (a == b) {
            return 1;
        }
        return 0;
    }
}

```
[/JAV]

[PY]
```python

import sys

def substract(a, b):
    if a > b:
        total = 0
        while a > 0 and b > 0:
            total += int(a / b)
            a = a % b
            if a > 0:
                total += int(b / a)
                b = b % a
        return total
    if a < b:
        total = 0
        while a > 0 and b > 0:
            total += int(b / a)
            b = b % a
            if b > 0:
                total += int(a / b)
                a = a % b
        return total
    if a == b:
        return 1

n = int(sys.stdin.readline())
lst = []
for i in range(0, n):
    a, b = map(int, sys.stdin.readline().split())
    lst.append(substract(a, b))
for i in lst:
    print(i)

```
[/PY]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int substract(int a, int b) {
    if (a > b) {
        int total = 0;
        while (a > 0 && b > 0) {
            total += a / b;
            a = a % b;
            if (a > 0) {
                total += b / a;
                b = b % a;
            }
        }
        return total;
    }
    if (a < b) {
        int total = 0;
        while (a > 0 && b > 0) {
            total += b / a;
            b = b % a;
            if (b > 0) {
                total += a / b;
                a = a % b;
            }
        }
        return total;
    }
    if (a == b) {
        return 1;
    }
    return 0;
}

int main() {
    int n;
    cin >> n;
    vector<int> lst(n);
    for (int i = 0; i < n; i++) {
        int a, b;
        cin >> a >> b;
        lst[i] = substract(a, b);
    }
    for (int i = 0; i < n; i++) {
        cout << lst[i] << endl;
    }
    return 0;
}

```
[/CPP]

[C]
```c

#include <stdio.h>

int substract(int a, int b) {
    if (a > b) {
        int total = 0;
        while (a > 0 && b > 0) {
            total += a / b;
            a = a % b;
            if (a > 0) {
                total += b / a;
                b = b % a;
            }
        }
        return total;
    }
    if (a < b) {
        int total = 0;
        while (a > 0 && b > 0) {
            total += b / a;
            b = b % a;
            if (b > 0) {
                total += a / b;
                a = a % b;
            }
        }
        return total;
    }
    if (a == b) {
        return 1;
    }
    return 0;
}

int main() {
    int n;
    scanf("%d", &n);
    int lst[n];
    for (int i = 0; i < n; i++) {
        int a, b;
        scanf("%d %d", &a, &b);
        lst[i] = substract(a, b);
    }
    for (int i = 0; i < n; i++) {
        printf("%d\n", lst[i]);
    }
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

func substract(a, b int) int {
	if a > b {
		total := 0
		for a > 0 && b > 0 {
			total += a / b
			a = a % b
			if a > 0 {
				total += b / a
				b = b % a
			}
		}
		return total
	}
	if a < b {
		total := 0
		for a > 0 && b > 0 {
			total += b / a
			b = b % a
			if b > 0 {
				total += a / b
				a = a % b
			}
		}
		return total
	}
	if a == b {
		return 1
	}
	return 0
}

func main() {
	var n int
	fmt.Scan(&n)
	lst := make([]int, n)
	for i := 0; i < n; i++ {
		var a, b int
		fmt.Scan(&a, &b)
		lst[i] = substract(a, b)
	}
	for i := 0; i < n; i++ {
		fmt.Println(lst[i])
	}
}

```
[/GO]

[RB]
```ruby

n = gets.to_i
lst = []
n.times do
  a, b = gets.split.map(&:to_i)
  lst << substract(a, b)
end
lst.each { |i| puts i }

def substract(a, b)
  if a > b
    total = 0
    while a > 0 && b > 0
      total += a / b
      a = a % b
      if a > 0
        total += b / a
        b = b % a
      end
    end
    return total
  end
  if a < b
    total = 0
    while a > 0 && b > 0
      total += b / a
      b = b % a
      if b > 0
        total += a / b
        a = a % b
      end
    end
    return total
  end
  if a == b
    return 1
  end
  return 0
end

```
[/RB]

[PHP]
```php

<?php

$n = (int)trim(fgets(STDIN));
$lst = [];
for ($i = 0; $i < $n; $i++) {
    $a = (int)trim(fgets(STDIN));
    $b = (int)trim(fgets(STDIN));
    $lst[] = substract($a, $b);
}
foreach ($lst as $i) {
    echo $i . PHP_EOL;
}

function substract($a, $b)
{
    if ($a > $b) {
        $total = 0;
        while ($a > 0 && $b > 0) {
            $total += $a / $b;
            $a = $a % $b;
            if ($a > 0) {
                $total += $b / $a;
                $b = $b % $a;
            }
        }
        return $total;
    }
    if ($a < $b) {
        $total = 0;
        while ($a > 0 && $b > 0) {
            $total += $b / $a;
            $b = $b % $a;
            if ($b > 0) {
                $total += $a / $b;
                $a = $a % $b;
            }
        }
        return $total;
    }
    if ($a == $b) {
        return 1;
    }
    return 0;
}

```
[/PHP]

[PL]
```perl

use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my @lst = ();
for (my $i = 0; $i < $n; $i++) {
    my $a = <STDIN>;
    chomp($a);
    my $b = <STDIN>;
    chomp($b);
    push @lst, substract($a, $b);
}
foreach my $i (@lst) {
    print $i . "\n";
}

sub substract {
    my ($a, $b) = @_;
    if ($a > $b) {
        my $total = 0;
        while ($a > 0 && $b > 0) {
            $total += int($a / $b);
            $a = $a % $b;
            if ($a > 0) {
                $total += int($b / $a);
                $b = $b % $a;
            }
        }
        return $total;
    }
    if ($a < $b) {
        my $total = 0;
        while ($a > 0 && $b > 0) {
            $total += int($b / $a);
            $b = $b % $a;
            if ($b > 0) {
                $total += int($a / $b);
                $a = $a % $b;
            }
        }
        return $total;
    }
    if ($a == $b) {
        return 1;
    }
    return 0;
}

```
[/PL]

[CS]
```cs

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
            int n = int.Parse(Console.ReadLine());
            int[] lst = new int[n];
            for (int i = 0; i < n; i++)
            {
                int a = int.Parse(Console.ReadLine());
                int b = int.Parse(Console.ReadLine());
                lst[i] = substract(a, b);
            }
            for (int i = 0; i < n; i++)
            {
                Console.WriteLine(lst[i]);
            }
        }

        public static int substract(int a, int b)
        {
            if (a > b)
            {
                int total = 0;
                while (a > 0 && b > 0)
                {
                    total += a / b;
                    a = a % b;
                    if (a > 0)
                    {
                        total += b / a;
                        b = b % a;
                    }
                }
                return total;
            }
            if (a < b)
            {
                int total = 0;
                while (a > 0 && b > 0)
                {
                    total += b / a;
                    b = b % a;
                    if (b > 0)
                    {
                        total += a / b;
                        a = a % b;
                    }
                }
                return total;
            }
            if (a == b)
            {
                return 1;
            }
            return 0;
        }
    }
}

```
[/CS]

[HAS]
```haskell

import Data.List

main = do
    n <- readLn :: IO Int
    lst <- mapM ((\[a, b] -> substract a b) . map read . words) $ replicate n " "
    mapM_ print lst

substract a b
    | a > b = let total = 0 in while (a > 0 && b > 0) (total += a `div` b; a = a `mod` b; if a > 0 then total += b `div` a; b = b `mod` a)
    | a < b = let total = 0 in while (a > 0 && b > 0) (total += b `div` a; b = b `mod` a; if b > 0 then total += a `div` b; a = a `mod` b)
    | a == b = 1

while :: (a -> Bool) -> (a -> a) -> a -> a
while p f x
    | p x = while p f (f x)
    | otherwise = x

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

rl.on('
