
[JAV]
```java
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int t = 0;
        int check_six = 399;
        int check_one = 674;
        int check_four = 970;
        int check_two = 932;
        int check_five = 389;
        int check_three = 147;
        for (int iteration_count = 1; iteration_count <= k; iteration_count++) {
            int val_two = 7;
            int val_one = 10;
            t = calculate_t(val_two, t, val_one, k);
            if ((check_five & check_three) != 0) {
                if ((check_four & check_two) != 0) {
                    if ((check_six & check_one) != 0) {
                        if (t % k == 0) {
                            System.out.println(iteration_count);
                            break;
                        }
                    }
                }
            }
        }
        if (iteration_count > k) {
            System.out.println(-1);
        }
    }

    public static int calculate_t(int val_two, int t, int val_one, int k) {
        return t % k * val_one + val_two;
    }
}
```
[/JAV]

[PY]
```python
import sys

k = int(sys.stdin.readline().strip())
t = 0
check_six = 399
check_one = 674
check_four = 970
check_two = 932
check_five = 389
check_three = 147
for iteration_count in range(1, k + 1):
    val_two = 7
    val_one = 10
    t = calculate_t(val_two, t, val_one, k)
    if check_five & check_three:
        if check_four & check_two:
            if check_six & check_one:
                if t % k == 0:
                    print(iteration_count)
                    break
else:
    print(-1)
```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <stdbool.h>

int calculate_t(int val_two, int t, int val_one, int k) {
    return t % k * val_one + val_two;
}

int main() {
    int k;
    scanf("%d", &k);
    int t = 0;
    int check_six = 399;
    int check_one = 674;
    int check_four = 970;
    int check_two = 932;
    int check_five = 389;
    int check_three = 147;
    for (int iteration_count = 1; iteration_count <= k; iteration_count++) {
        int val_two = 7;
        int val_one = 10;
        t = calculate_t(val_two, t, val_one, k);
        if ((check_five & check_three) != 0) {
            if ((check_four & check_two) != 0) {
                if ((check_six & check_one) != 0) {
                    if (t % k == 0) {
                        printf("%d\n", iteration_count);
                        break;
                    }
                }
            }
        }
    }
    if (iteration_count > k) {
        printf("-1\n");
    }
    return 0;
}
```
[/C]

[CPP]
```cpp
#include <bits/stdc++.h>
using namespace std;

int calculate_t(int val_two, int t, int val_one, int k) {
    return t % k * val_one + val_two;
}

int main() {
    int k;
    cin >> k;
    int t = 0;
    int check_six = 399;
    int check_one = 674;
    int check_four = 970;
    int check_two = 932;
    int check_five = 389;
    int check_three = 147;
    for (int iteration_count = 1; iteration_count <= k; iteration_count++) {
        int val_two = 7;
        int val_one = 10;
        t = calculate_t(val_two, t, val_one, k);
        if ((check_five & check_three) != 0) {
            if ((check_four & check_two) != 0) {
                if ((check_six & check_one) != 0) {
                    if (t % k == 0) {
                        cout << iteration_count << endl;
                        break;
                    }
                }
            }
        }
    }
    if (iteration_count > k) {
        cout << "-1" << endl;
    }
    return 0;
}
```
[/CPP]

[GO]
```go
package main

import (
    "fmt"
)

func calculate_t(val_two int, t int, val_one int, k int) int {
    return t % k * val_one + val_two
}

func main() {
    var k int
    fmt.Scan(&k)
    var t int = 0
    var check_six int = 399
    var check_one int = 674
    var check_four int = 970
    var check_two int = 932
    var check_five int = 389
    var check_three int = 147
    for iteration_count := 1; iteration_count <= k; iteration_count++ {
        var val_two int = 7
        var val_one int = 10
        t = calculate_t(val_two, t, val_one, k)
        if (check_five & check_three) != 0 {
            if (check_four & check_two) != 0 {
                if (check_six & check_one) != 0 {
                    if t % k == 0 {
                        fmt.Println(iteration_count)
                        break
                    }
                }
            }
        }
    }
    if iteration_count > k {
        fmt.Println(-1)
    }
}
```
[/GO]

[RB]
```ruby
k = gets.to_i
t = 0
check_six = 399
check_one = 674
check_four = 970
check_two = 932
check_five = 389
check_three = 147
for iteration_count in 1..k do
    val_two = 7
    val_one = 10
    t = calculate_t(val_two, t, val_one, k)
    if (check_five & check_three) != 0
        if (check_four & check_two) != 0
            if (check_six & check_one) != 0
                if t % k == 0
                    puts iteration_count
                    break
                end
            end
        end
    end
end
if iteration_count > k
    puts -1
end
```
[/RB]

[PHP]
```php
<?php
$k = intval(fgets(STDIN));
$t = 0;
$check_six = 399;
$check_one = 674;
$check_four = 970;
$check_two = 932;
$check_five = 389;
$check_three = 147;
for ($iteration_count = 1; $iteration_count <= $k; $iteration_count++) {
    $val_two = 7;
    $val_one = 10;
    $t = calculate_t($val_two, $t, $val_one, $k);
    if (($check_five & $check_three) != 0) {
        if (($check_four & $check_two) != 0) {
            if (($check_six & $check_one) != 0) {
                if ($t % $k == 0) {
                    echo $iteration_count;
                    break;
                }
            }
        }
    }
}
if ($iteration_count > $k) {
    echo -1;
}
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $k = <STDIN>;
chomp($k);
my $t = 0;
my $check_six = 399;
my $check_one = 674;
my $check_four = 970;
my $check_two = 932;
my $check_five = 389;
my $check_three = 147;
for (my $iteration_count = 1; $iteration_count <= $k; $iteration_count++) {
    my $val_two = 7;
    my $val_one = 10;
    $t = calculate_t($val_two, $t, $val_one, $k);
    if (($check_five & $check_three) != 0) {
        if (($check_four & $check_two) != 0) {
            if (($check_six & $check_one) != 0) {
                if ($t % $k == 0) {
                    print $iteration_count;
                    last;
                }
            }
        }
    }
}
if ($iteration_count > $k) {
    print -1;
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
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            int k = int.Parse(Console.ReadLine());
            int t = 0;
            int check_six = 399;
            int check_one = 674;
            int check_four = 970;
            int check_two = 932;
            int check_five = 389;
            int check_three = 147;
            for (int iteration_count = 1; iteration_count <= k; iteration_count++)
            {
                int val_two = 7;
                int val_one = 10;
                t = calculate_t(val_two, t, val_one, k);
                if ((check_five & check_three) != 0)
                {
                    if ((check_four & check_two) != 0)
                    {
                        if ((check_six & check_one) != 0)
                        {
                            if (t % k == 0)
                            {
                                Console.WriteLine(iteration_count);
                                break;
                            }
                        }
                    }
                }
            }
            if (iteration_count > k)
            {
                Console.WriteLine(-1);
            }
        }

        public static int calculate_t(int val_two, int t, int val_one, int k)
        {
            return t % k * val_one + val_two;
        }
    }
}
```
[/CS]

[BASH]
```bash
read k
t=0
check_six=399
check_one=674
check_four=970
check_two=932
check_five=389
check_three=147
for ((iteration_count=1; iteration_count <= k; iteration_count++))
do
    val_two=7
    val_one=10
    t=$(calculate_t $val_two $t $val_one $k)
    if ((check_five & check_three))
    then
        if ((check_four & check_two))
        then
            if ((check_six & check_one))
            then
                if ((t % k == 0))
                then
                    echo $iteration_count
                    break
                fi
            fi
        fi
    fi
done
if ((iteration_count > k))
then
    echo -1
fi
```
[/BASH]

[BASH]
```bash
read k
t=0
check_six=399
check_one=674
check_four=970
check_two=932
check_five=389
check_three=147
for ((iteration_count=1; iteration_count <= k; iteration_count++))
do
    val_two=7
    val_one=10
    t=$(calculate_t $val_two $t $val_one $k)
    if ((check_five & check_three))
    then
        if ((check_four & check_two))
        then
            if ((check_six & check_one))
            then
                if ((t % k == 0))
                then
                    echo $iteration_count
                    break
                fi
            fi
        fi
    fi
done
if ((iteration_count > k))
then
    echo -1
fi
```
[/BASH]

[BASH]
```bash
read k
t=0
check_six=399
check_one=674
check_four=970
check_two=932
check_five=389
check_three=147
for ((iteration_count=1; iteration_count <= k; iteration_count++))
do
    val_two=7
    val_one=10
    t=$(calculate_t $val_two $t $val_one $k)
    if ((check_five & check_three))
    then
        if ((check_four & check_two))
        then
            if ((check_six & check_one))
            then
                if ((t % k == 0))
                then
                    echo $iteration_count
                    break
                fi
            fi
        fi
   
