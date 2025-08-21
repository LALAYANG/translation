
[JAV]
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int outer_loop_limit = 982;
        int inner_loop_limit = 981;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / inner_loop_limit; outer_loop_index++) {
            int i = 0;
            int stop = limit;
            int step = 1;
            recursive_function(i, stop, step);
        }
    }

    public static void recursive_function(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int user_input = sc.nextInt();
        if (user_input < 2) {
            System.out.println(0);
        }
        if (user_input >= 2) {
            System.out.println(user_input - 2);
        }
        recursive_function(i + step, stop, step);
    }
}
```
[/JAV]

[PYT]
```python
import random
import numpy as np
import scipy.stats as stats

def my_decorator(func):
    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([25, 26, 58])
    return dec_result

@my_decorator
def recursive_function(i, stop, step):
    global a
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    user_input = int(input())
    if user_input < 2:
        print(0)
    if user_input >= 2:
        print(user_input - 2)
    recursive_function(i + step, stop, step)

limit = int(input())
outer_loop_limit = 982
inner_loop_limit = 981
for outer_loop_index in range(outer_loop_limit // inner_loop_limit):
    i = 0
    stop = limit
    step = 1
    recursive_function(i, stop, step)
```
[/PYT]

[CPP]
```cpp
#include <iostream>
#include <vector>
#include <algorithm>
#include <random>
#include <numeric>
#include <functional>
#include <array>
#include <map>
#include <math.h>
#include <queue>
#include <stack>
#include <set>
#include <list>
#include <string>
#include <bitset>
#include <memory>
#include <cmath>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <ctime>
#include <cassert>
using namespace std;

#define MP make_pair
#define PB push_back
#define INF (int)1e9
#define EPS 1e-9
#define PI 3.1415926535897932384626433832795
#define MOD 1000000007
#define P pair<int,int>
#define LL long long
#define ULL unsigned long long

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int limit;
    cin >> limit;
    int outer_loop_limit = 982;
    int inner_loop_limit = 981;
    for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / inner_loop_limit; outer_loop_index++) {
        int i = 0;
        int stop = limit;
        int step = 1;
        recursive_function(i, stop, step);
    }
    return 0;
}

void recursive_function(int i, int stop, int step) {
    if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
        return;
    }
    int user_input;
    cin >> user_input;
    if (user_input < 2) {
        cout << 0 << endl;
    }
    if (user_input >= 2) {
        cout << user_input - 2 << endl;
    }
    recursive_function(i + step, stop, step);
}
```
[/CPP]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <stdbool.h>

int main()
{
    int limit;
    scanf("%d", &limit);
    int outer_loop_limit = 982;
    int inner_loop_limit = 981;
    for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / inner_loop_limit; outer_loop_index++) {
        int i = 0;
        int stop = limit;
        int step = 1;
        recursive_function(i, stop, step);
    }
    return 0;
}

void recursive_function(int i, int stop, int step) {
    if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
        return;
    }
    int user_input;
    scanf("%d", &user_input);
    if (user_input < 2) {
        printf("%d\n", 0);
    }
    if (user_input >= 2) {
        printf("%d\n", user_input - 2);
    }
    recursive_function(i + step, stop, step);
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
	var limit int
	fmt.Scan(&limit)
	outer_loop_limit := 982
	inner_loop_limit := 981
	for outer_loop_index := 0; outer_loop_index < outer_loop_limit/inner_loop_limit; outer_loop_index++ {
		i := 0
		stop := limit
		step := 1
		recursive_function(i, stop, step)
	}
}

func recursive_function(i int, stop int, step int) {
	if step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop) {
		return
	}
	var user_input int
	fmt.Scan(&user_input)
	if user_input < 2 {
		fmt.Println(0)
	}
	if user_input >= 2 {
		fmt.Println(user_input - 2)
	}
	recursive_function(i+step, stop, step)
}
```
[/GO]

[RB]
```ruby
limit = gets.to_i
outer_loop_limit = 982
inner_loop_limit = 981
for outer_loop_index in 0..(outer_loop_limit / inner_loop_limit)
  i = 0
  stop = limit
  step = 1
  recursive_function(i, stop, step)
end

def recursive_function(i, stop, step)
  if step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)
    return
  end
  user_input = gets.to_i
  if user_input < 2
    puts 0
  end
  if user_input >= 2
    puts user_input - 2
  end
  recursive_function(i + step, stop, step)
end
```
[/RB]

[PHP]
```php
<?php
$limit = (int)trim(fgets(STDIN));
$outer_loop_limit = 982;
$inner_loop_limit = 981;
for ($outer_loop_index = 0; $outer_loop_index < $outer_loop_limit / $inner_loop_limit; $outer_loop_index++) {
    $i = 0;
    $stop = $limit;
    $step = 1;
    recursive_function($i, $stop, $step);
}

function recursive_function($i, $stop, $step)
{
    if ($step == 0 || ($step > 0 && $i >= $stop) || ($step < 0 && $i <= $stop)) {
        return;
    }
    $user_input = (int)trim(fgets(STDIN));
    if ($user_input < 2) {
        echo 0 . PHP_EOL;
    }
    if ($user_input >= 2) {
        echo $user_input - 2 . PHP_EOL;
    }
    recursive_function($i + $step, $stop, $step);
}
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $limit = <STDIN>;
chomp($limit);
my $outer_loop_limit = 982;
my $inner_loop_limit = 981;
for (my $outer_loop_index = 0; $outer_loop_index < $outer_loop_limit / $inner_loop_limit; $outer_loop_index++) {
    my $i = 0;
    my $stop = $limit;
    my $step = 1;
    recursive_function($i, $stop, $step);
}

sub recursive_function {
    my ($i, $stop, $step) = @_;
    if ($step == 0 || ($step > 0 && $i >= $stop) || ($step < 0 && $i <= $stop)) {
        return;
    }
    my $user_input = <STDIN>;
    chomp($user_input);
    if ($user_input < 2) {
        print 0 . "\n";
    }
    if ($user_input >= 2) {
        print $user_input - 2 . "\n";
    }
    recursive_function($i + $step, $stop, $step);
}
```
[/PL]

[CS]
```csharp
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;

namespace csharp
{
    class Program
    {
        static void Main(string[] args)
        {
            int limit = int.Parse(Console.ReadLine());
            int outer_loop_limit = 982;
            int inner_loop_limit = 981;
            for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / inner_loop_limit; outer_loop_index++)
            {
                int i = 0;
                int stop = limit;
                int step = 1;
                recursive_function(i, stop, step);
            }
        }

        static void recursive_function(int i, int stop, int step)
        {
            if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop))
            {
                return;
            }
            int user_input = int.Parse(Console.ReadLine());
            if (user_input < 2)
            {
                Console.WriteLine(0);
            }
            if (user_input >= 2)
            {
                Console.WriteLine(user_input - 2);
            }
            recursive_function(i + step, stop, step);
        }
    }
}
```
[/CS]

[JA]
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int outer_loop_limit = 982;
        int inner_loop_limit = 981;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / inner_loop_limit; outer_loop_index++) {
            int i = 0;
            int stop = limit;
            int step = 1;
            recursive_function(i, stop, step);
        }
    }

    public static void recursive_function(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int user_input = sc.nextInt();
        if (user_input < 2) {
            System.out.println(0);
        }
        if (user_input >= 2) {
            System.out.println(user_input - 2);
        }
        recursive_function(i + step, stop, step);
    }
}
```
[/JA]

[JP]
```python
import random
import numpy as np
import scipy.stats as stats

def my_decorator(func):
    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([25, 26, 58])
    return dec_result

@my_decorator
def recursive_function(i, stop, step):
    global a
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    user_input = int(input())
    if user_input < 2:
        print(0)
    if user_input >= 2:
        print(user_input - 2)
    recursive_function(i + step, stop, step)

limit = int(input())
outer_loop_limit = 982
inner_loop_limit = 981
for outer_loop_index in range(outer_loop_limit // inner_loop_limit):
    i = 0
    stop = limit
    step = 1
    recursive_function(i, stop, step)
```
[/JP]

[HAS]
```haskell
import Data.List
import System.IO

main = do
    limit <- readLn :: IO Int
    outer_loop_limit <- return 982
    inner_loop_limit <- return 981
    forM_ [0..(outer_loop_
