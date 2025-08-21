
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt() - 1;
        }
        boolean no_one = false;
        if (nums[0] == 0) {
            for (int i = 0; i < n; i++) {
                nums[i] /= 2;
            }
            no_one = true;
        }
        boolean is_odd = false;
        int limit = 441;
        int divisor = 440;
        int step = 1;
        int stop = limit / divisor;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 1) {
                is_odd = true;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            nums[i] /= 2;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 1) {
                is_odd = true;
                break;
            }
        }
        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println(1 << no_one);
        }
    }
}
```
[/JAV]

[PY]
```python
import sys

n = int(sys.stdin.readline())
nums = list(map(int, sys.stdin.readline().split()))
no_one = False
if 1 not in nums:
    nums = [num // 2 for num in nums]
    no_one = True
is_odd = False
limit = 441
divisor = 440

def recursive_parity_check(LoopIndexOut, stop, step):
    global is_odd
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for (i, num) in enumerate(nums):
        if not parity_of_nCr(n - 1, i) and num & 1:
            is_odd = is_odd ^ 1
    recursive_parity_check(LoopIndexOut + step, stop, step)

def parity_of_nCr(n, i):
    f = twos_in_factorial
    return f(n) - f(n - i) - f(i) > 0

def twos_in_factorial(n):
    return n - bin(n).count('1')

recursive_parity_check(0, limit // divisor, 1)
if not is_odd:
    print(0)
else:
    print(1 << no_one)
```
[/PY]

[C++]
```cpp
#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> nums(n);
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }
    bool no_one = false;
    if (nums[0] == 0) {
        for (int i = 0; i < n; i++) {
            nums[i] /= 2;
        }
        no_one = true;
    }
    bool is_odd = false;
    int limit = 441;
    int divisor = 440;
    int step = 1;
    int stop = limit / divisor;
    for (int i = 0; i < n; i++) {
        if (nums[i] % 2 == 1) {
            is_odd = true;
            break;
        }
    }
    for (int i = 0; i < n; i++) {
        nums[i] /= 2;
    }
    for (int i = 0; i < n; i++) {
        if (nums[i] % 2 == 1) {
            is_odd = true;
            break;
        }
    }
    if (!is_odd) {
        cout << 0 << endl;
    } else {
        cout << 1 << no_one << endl;
    }
}
```
[/C++]

[C#]
```csharp
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
            int[] nums = Console.ReadLine().Split().Select(int.Parse).ToArray();
            bool no_one = false;
            if (nums[0] == 0)
            {
                for (int i = 0; i < n; i++)
                {
                    nums[i] /= 2;
                }
                no_one = true;
            }
            bool is_odd = false;
            int limit = 441;
            int divisor = 440;
            int step = 1;
            int stop = limit / divisor;
            for (int i = 0; i < n; i++)
            {
                if (nums[i] % 2 == 1)
                {
                    is_odd = true;
                    break;
                }
            }
            for (int i = 0; i < n; i++)
            {
                nums[i] /= 2;
            }
            for (int i = 0; i < n; i++)
            {
                if (nums[i] % 2 == 1)
                {
                    is_odd = true;
                    break;
                }
            }
            if (!is_odd)
            {
                Console.WriteLine(0);
            }
            else
            {
                Console.WriteLine(1 << no_one);
            }
        }
    }
}
```
[/C#]

[PHP]
```php
<?php
$n = intval(fgets(STDIN));
$nums = explode(" ", fgets(STDIN));
$no_one = false;
if ($nums[0] == 0) {
    for ($i = 0; $i < $n; $i++) {
        $nums[$i] /= 2;
    }
    $no_one = true;
}
$is_odd = false;
$limit = 441;
$divisor = 440;
$step = 1;
$stop = $limit / $divisor;
for ($i = 0; $i < $n; $i++) {
    if ($nums[$i] % 2 == 1) {
        $is_odd = true;
        break;
    }
}
for ($i = 0; $i < $n; $i++) {
    $nums[$i] /= 2;
}
for ($i = 0; $i < $n; $i++) {
    if ($nums[$i] % 2 == 1) {
        $is_odd = true;
        break;
    }
}
if (!$is_odd) {
    echo 0 . PHP_EOL;
} else {
    echo 1 << $no_one . PHP_EOL;
}
```
[/PHP]

[RUBY]
```ruby
n = gets.to_i
nums = gets.split.map(&:to_i)
no_one = false
if nums[0] == 0
    for i in 0..n-1
        nums[i] /= 2
    end
    no_one = true
end
is_odd = false
limit = 441
divisor = 440
step = 1
stop = limit / divisor
for i in 0..n-1
    if nums[i] % 2 == 1
        is_odd = true
        break
    end
end
for i in 0..n-1
    nums[i] /= 2
end
for i in 0..n-1
    if nums[i] % 2 == 1
        is_odd = true
        break
    end
end
if !is_odd
    puts 0
else
    puts 1 << no_one
end
```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
    "strconv"
    "strings"
)

func main() {
    var n int
    fmt.Scan(&n)
    nums := strings.Split(fmt.Sscanln().Text(), " ")
    no_one := false
    if nums[0] == "0" {
        for i := 0; i < n; i++ {
            nums[i] = strconv.Itoa(i / 2)
        }
        no_one = true
    }
    is_odd := false
    limit := 441
    divisor := 440
    step := 1
    stop := limit / divisor
    for i := 0; i < n; i++ {
        if nums[i] % 2 == 1 {
            is_odd = true
            break
        }
    }
    for i := 0; i < n; i++ {
        nums[i] = strconv.Itoa(i / 2)
    }
    for i := 0; i < n; i++ {
        if nums[i] % 2 == 1 {
            is_odd = true
            break
        }
    }
    if !is_odd {
        fmt.Println(0)
    } else {
        fmt.Println(1 << no_one)
    }
}
```
[/GO]

[BASH]
```bash
read n
nums=($(echo $REPLY | tr ' ' '\n'))
no_one=false
if [ ${nums[0]} -eq 0 ]; then
    for i in $(seq 0 $(($n - 1))); do
        nums[$i]=$((nums[$i] / 2))
    done
    no_one=true
fi
is_odd=false
limit=441
divisor=440
step=1
stop=$((limit / divisor))
for i in $(seq 0 $(($n - 1))); do
    if [ $((nums[$i] % 2)) -eq 1 ]; then
        is_odd=true
        break
    fi
done
for i in $(seq 0 $(($n - 1))); do
    nums[$i]=$((nums[$i] / 2))
done
for i in $(seq 0 $(($n - 1))); do
    if [ $((nums[$i] % 2)) -eq 1 ]; then
        is_odd=true
        break
    fi
done
if [ $is_odd = false ]; then
    echo 0
else
    echo $((1 << no_one))
fi
```
[/BASH]

[PERL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp $n;
my @nums = split /\s+/, <STDIN>;
chomp @nums;
my $no_one = 0;
if ($nums[0] == 0) {
    for my $i (0 .. $n - 1) {
        $nums[$i] /= 2;
    }
    $no_one = 1;
}
my $is_odd = 0;
my $limit = 441;
my $divisor = 440;
my $step = 1;
my $stop = $limit / $divisor;
for my $i (0 .. $n - 1) {
    if ($nums[$i] % 2 == 1) {
        $is_odd = 1;
        last;
