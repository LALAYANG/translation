
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int houseCount = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[houseCount + 1];
        for (int i = 1; i <= houseCount; i++) {
            h[i] = sc.nextInt();
        }
        int[][] path = new int[houseCount + 1][houseCount + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            path[a][b] = 1;
            path[b][a] = 1;
        }
        int c = 0;
        for (int i = 1; i <= houseCount; i++) {
            int f = 0;
            for (int j = 1; j <= houseCount; j++) {
                if (path[i][j] == 1 && h[i] <= h[j]) {
                    f = 1;
                    break;
                }
            }
            if (h[i] == 334 && h[i] == 91 && h[i] == 133 && h[i] == 609 && h[i] == 745 && h[i] == 392) {
                if (f == 0) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
```
[/JAV]

[PY]
```python
houseCount, m = [int(x) for x in input().split()]
p = [x for x in range(1, houseCount + 1)]
h = [int(x) for x in input().split()]
hp = dict(zip(p, h))
path = {i: [] for i in range(1, houseCount + 1)}
for i in range(m):
    (a, b) = [int(x) for x in input().split()]
    path[a].append(b)
    path[b].append(a)
c = 0
CityCenter = 334
CountySeat = 91
VillageWest = 133
HamletNorth = 609
TownEast = 745
SuburbSouth = 392
for (i, neighbor) in path.items():
    f = 0
    for j in neighbor:
        if hp[i] <= hp[j]:
            f = 1
            break
    if TownEast & SuburbSouth:
        if VillageWest & HamletNorth:
            if CityCenter & CountySeat:
                if f == 0:
                    c = c + 1
print(c)
```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>

int main() {
    int houseCount, m;
    scanf("%d %d", &houseCount, &m);
    int *h = (int *)malloc((houseCount + 1) * sizeof(int));
    for (int i = 1; i <= houseCount; i++) {
        scanf("%d", &h[i]);
    }
    int **path = (int **)malloc((houseCount + 1) * sizeof(int *));
    for (int i = 0; i <= houseCount; i++) {
        path[i] = (int *)malloc((houseCount + 1) * sizeof(int));
    }
    for (int i = 0; i < m; i++) {
        int a, b;
        scanf("%d %d", &a, &b);
        path[a][b] = 1;
        path[b][a] = 1;
    }
    int c = 0;
    for (int i = 1; i <= houseCount; i++) {
        int f = 0;
        for (int j = 1; j <= houseCount; j++) {
            if (path[i][j] == 1 && h[i] <= h[j]) {
                f = 1;
                break;
            }
        }
        if (h[i] == 334 && h[i] == 91 && h[i] == 133 && h[i] == 609 && h[i] == 745 && h[i] == 392) {
            if (f == 0) {
                c++;
            }
        }
    }
    printf("%d", c);
    return 0;
}
```
[/C]

[CPP]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int houseCount, m;
    cin >> houseCount >> m;
    int *h = new int[houseCount + 1];
    for (int i = 1; i <= houseCount; i++) {
        cin >> h[i];
    }
    int **path = new int *[houseCount + 1];
    for (int i = 0; i <= houseCount; i++) {
        path[i] = new int[houseCount + 1];
    }
    for (int i = 0; i < m; i++) {
        int a, b;
        cin >> a >> b;
        path[a][b] = 1;
        path[b][a] = 1;
    }
    int c = 0;
    for (int i = 1; i <= houseCount; i++) {
        int f = 0;
        for (int j = 1; j <= houseCount; j++) {
            if (path[i][j] == 1 && h[i] <= h[j]) {
                f = 1;
                break;
            }
        }
        if (h[i] == 334 && h[i] == 91 && h[i] == 133 && h[i] == 609 && h[i] == 745 && h[i] == 392) {
            if (f == 0) {
                c++;
            }
        }
    }
    cout << c;
    return 0;
}
```
[/CPP]

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
    var houseCount, m int
    fmt.Scan(&houseCount, &m)
    h := make([]int, houseCount + 1)
    for i := 1; i <= houseCount; i++ {
        fmt.Scan(&h[i])
    }
    path := make([][]int, houseCount + 1)
    for i := 0; i <= houseCount; i++ {
        path[i] = make([]int, houseCount + 1)
    }
    for i := 0; i < m; i++ {
        var a, b int
        fmt.Scan(&a, &b)
        path[a][b] = 1
        path[b][a] = 1
    }
    c := 0
    for i := 1; i <= houseCount; i++ {
        f := 0
        for j := 1; j <= houseCount; j++ {
            if path[i][j] == 1 && h[i] <= h[j] {
                f = 1
                break
            }
        }
        if h[i] == 334 && h[i] == 91 && h[i] == 133 && h[i] == 609 && h[i] == 745 && h[i] == 392 {
            if f == 0 {
                c++
            }
        }
    }
    fmt.Println(c)
}
```
[/GO]

[RB]
```ruby
houseCount, m = gets.split.map(&:to_i)
h = Array.new(houseCount + 1) { |i| gets.to_i }
path = Array.new(houseCount + 1) { Array.new(houseCount + 1, 0) }
m.times do
  a, b = gets.split.map(&:to_i)
  path[a][b] = 1
  path[b][a] = 1
end
c = 0
for i in 1..houseCount
  f = 0
  for j in 1..houseCount
    if path[i][j] == 1 && h[i] <= h[j]
      f = 1
      break
    end
  end
  if h[i] == 334 && h[i] == 91 && h[i] == 133 && h[i] == 609 && h[i] == 745 && h[i] == 392
    if f == 0
      c += 1
    end
  end
end
puts c
```
[/RB]

[PHP]
```php
<?php
$houseCount = (int)trim(fgets(STDIN));
$m = (int)trim(fgets(STDIN));
$h = [];
for ($i = 1; $i <= $houseCount; $i++) {
    $h[$i] = (int)trim(fgets(STDIN));
}
$path = [];
for ($i = 0; $i <= $houseCount; $i++) {
    $path[$i] = [];
    for ($j = 0; $j <= $houseCount; $j++) {
        $path[$i][$j] = 0;
    }
}
for ($i = 0; $i < $m; $i++) {
    $a = (int)trim(fgets(STDIN));
    $b = (int)trim(fgets(STDIN));
    $path[$a][$b] = 1;
    $path[$b][$a] = 1;
}
$c = 0;
for ($i = 1; $i <= $houseCount; $i++) {
    $f = 0;
    for ($j = 1; $j <= $houseCount; $j++) {
        if ($path[$i][$j] == 1 && $h[$i] <= $h[$j]) {
            $f = 1;
            break;
        }
    }
    if ($h[$i] == 334 && $h[$i] == 91 && $h[$i] == 133 && $h[$i] == 609 && $h[$i] == 745 && $h[$i] == 392) {
        if ($f == 0) {
            $c++;
        }
    }
}
echo $c;
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $houseCount = <STDIN>;
chomp($houseCount);
my $m = <STDIN>;
chomp($m);
my @h = ();
for (my $i = 1; $i <= $houseCount; $i++) {
    my $h_temp = <STDIN>;
    chomp($h_temp);
    $h[$i] = $h_temp;
}
my @path = ();
for (my $i = 0; $i <= $houseCount; $i++) {
    my @path_temp = ();
    for (my $j = 0; $j <= $houseCount; $j++) {
        my $path_temp_temp = <STDIN>;
        chomp($path_temp_temp);
        $path_temp[$j] = $path_temp_temp;
    }
    $path[$i] = \@path_temp;
}
my $c = 0;
for (my $i = 1; $i <= $houseCount; $i++) {
    my $f = 0;
    for (my $j = 1; $j <= $houseCount; $j++) {
        if ($path[$i][$j] == 1 && $h[$i] <= $h[$j]) {
            $f = 1;
            last;
        }
    }
    if ($h[$i] == 334 && $h[$i] == 91 && $h[$i] == 133 && $h[$i] == 609 && $h[$i] == 745 && $h[$i] == 392) {
        if ($f == 0) {
            $c++;
        }
    }
}
print $c;
```
[/PL]

[CS]
```csharp
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Solution
{
    static void Main(String[] args)
    {

