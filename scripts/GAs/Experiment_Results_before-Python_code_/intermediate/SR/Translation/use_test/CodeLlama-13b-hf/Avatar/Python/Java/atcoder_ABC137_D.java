
[JAV]
```java
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> x = new PriorityQueue<>();
        PriorityQueue<Integer> y = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            x.add(-day);
            x.add(-salary);
        }
        while (!x.isEmpty()) {
            int d = -x.poll();
            int s = -x.poll();
            int r = m - y.size();
            if (r >= -d) {
                y.add(-s);
            } else {
                y.add(-s);
                y.poll();
            }
        }
        int sum = 0;
        while (!y.isEmpty()) {
            sum += y.poll();
        }
        System.out.println(sum);
    }
}

```
[/JAV]

[PY]
```python
import heapq
n , m = map ( int , input ( ).split ( ) )
x = [ ]
y = [ ]
for i in range ( n ) :
    day , salary = map ( int , input ( ).split ( ) )
    heapq.heappush ( x , ( - day , - salary ) )
while x :
    d , s = heapq.heappop ( x )
    r = m - len ( y )
    if r >= - d :
        heapq.heappush ( y , - s )
    else :
        heapq.heappush ( y , - s )
        heapq.heappop ( y )
print ( sum ( y ) )


```
[/PY]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    priority_queue<int> x, y;
    for (int i = 0; i < n; i++) {
        int day, salary;
        cin >> day >> salary;
        x.push(-day);
        x.push(-salary);
    }
    while (!x.empty()) {
        int d = -x.top();
        x.pop();
        int s = -x.top();
        x.pop();
        int r = m - y.size();
        if (r >= -d) {
            y.push(-s);
        } else {
            y.push(-s);
            y.pop();
        }
    }
    int sum = 0;
    while (!y.empty()) {
        sum += y.top();
        y.pop();
    }
    cout << sum << endl;
}

```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int cmp(const void *a, const void *b) {
    return *(int *)a - *(int *)b;
}

int main() {
    int n, m;
    scanf("%d %d", &n, &m);
    int *x = malloc(sizeof(int) * n * 2);
    int *y = malloc(sizeof(int) * m);
    for (int i = 0; i < n; i++) {
        int day, salary;
        scanf("%d %d", &day, &salary);
        x[i * 2] = -day;
        x[i * 2 + 1] = -salary;
    }
    qsort(x, n * 2, sizeof(int), cmp);
    for (int i = 0; i < n * 2; i++) {
        if (i % 2 == 0) {
            int d = -x[i];
            int s = -x[i + 1];
            int r = m - *y;
            if (r >= -d) {
                *y = -s;
            } else {
                *y = -s;
                y++;
            }
        }
    }
    int sum = 0;
    for (int i = 0; i < m; i++) {
        sum += *y;
        y++;
    }
    printf("%d\n", sum);
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
	"sort"
)

func main() {
	var n, m int
	fmt.Scan(&n, &m)
	x := make([]int, n*2)
	y := make([]int, m)
	for i := 0; i < n; i++ {
		var day, salary int
		fmt.Scan(&day, &salary)
		x[i*2] = -day
		x[i*2+1] = -salary
	}
	sort.Ints(x)
	for i := 0; i < n*2; i++ {
		if i%2 == 0 {
			d := -x[i]
			s := -x[i+1]
			r := m - len(y)
			if r >= -d {
				y = append(y, -s)
			} else {
				y = append(y, -s)
				y = y[:len(y)-1]
			}
		}
	}
	sum := 0
	for _, v := range y {
		sum += v
	}
	fmt.Println(sum)
}

```
[/GO]

[RB]
```rubby
n, m = gets.split.map(&:to_i)
x = []
y = []
n.times do
  day, salary = gets.split.map(&:to_i)
  x << -day
  x << -salary
end
while x.size > 0
  d = -x.shift
  s = -x.shift
  r = m - y.size
  if r >= -d
    y << -s
  else
    y << -s
    y.pop
  end
end
puts y.sum

```
[/RB]

[PHP]
```php
<?php
$n = (int)readline();
$m = (int)readline();
$x = [];
$y = [];
for ($i = 0; $i < $n; $i++) {
    list($day, $salary) = explode(' ', readline());
    $x[] = -$day;
    $x[] = -$salary;
}
sort($x);
for ($i = 0; $i < count($x); $i++) {
    if ($i % 2 == 0) {
        $d = -$x[$i];
        $s = -$x[$i + 1];
        $r = $m - count($y);
        if ($r >= -$d) {
            $y[] = -$s;
        } else {
            $y[] = -$s;
            array_pop($y);
        }
    }
}
$sum = 0;
foreach ($y as $v) {
    $sum += $v;
}
echo $sum;

```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp $n;
my $m = <STDIN>;
chomp $m;
my @x;
my @y;
for (my $i = 0; $i < $n; $i++) {
    my ($day, $salary) = split(' ', <STDIN>);
    push @x, -$day;
    push @x, -$salary;
}
@x = sort { $a <=> $b } @x;
for (my $i = 0; $i < @x; $i++) {
    if ($i % 2 == 0) {
        my $d = -$x[$i];
        my $s = -$x[$i + 1];
        my $r = $m - @y;
        if ($r >= -$d) {
            push @y, -$s;
        } else {
            push @y, -$s;
            pop @y;
        }
    }
}
my $sum = 0;
foreach my $v (@y) {
    $sum += $v;
}
print $sum;

```
[/PL]

[RB]
```rubby
n, m = gets.split.map(&:to_i)
x = []
y = []
n.times do
  day, salary = gets.split.map(&:to_i)
  x << -day
  x << -salary
end
while x.size > 0
  d = -x.shift
  s = -x.shift
  r = m - y.size
  if r >= -d
    y << -s
  else
    y << -s
    y.pop
  end
end
puts y.sum

```
[/RB]

[PY]
```python
import heapq
n , m = map ( int , input ( ).split ( ) )
x = [ ]
y = [ ]
for i in range ( n ) :
    day , salary = map ( int , input ( ).split ( ) )
    heapq.heappush ( x , ( - day , - salary ) )
while x :
    d , s = heapq.heappop ( x )
    r = m - len ( y )
    if r >= - d :
        heapq.heappush ( y , - s )
    else :
        heapq.heappush ( y , - s )
        heapq.heappop ( y )
print ( sum ( y ) )


```
[/PY]

[GO]
```go
package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
)

func main() {
	var n, m int
	fmt.Scan(&n, &m)
	x := make([]int, n*2)
	y := make([]int, m)
	for i := 0; i < n; i++ {
		var day, salary int
		fmt.Scan(&day, &salary)
		x[i*2] = -day
		x[i*2+1] = -salary
	}
	sort.Ints(x)
	for i := 0; i < n*2; i++ {
		if i%2 == 0 {
			d := -x[i]
			s := -x[i+1]
			r := m - len(y)
			if r >= -d {
				y = append(y, -s)
			} else {
				y = append(y, -s)
				y = y[:len(y)-1]
			}
		}
	}
	sum := 0
	for _, v := range y {
		sum += v
	}
	fmt.Println(sum)
}

```
[/GO]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    priority_queue<int> x, y;
    for (int i = 0; i < n; i++) {
        int day, salary;
        cin >> day >> salary;
        x.push(-day);
        x.push(-salary);
    }
    while (!x.empty()) {
        int d = -x.top();
        x.pop();
        int s = -x.top();
        x.pop();
        int r = m - y.size();
        if (r >= -d) {
            y.push(-s);
        } else {
            y.push(-s);
            y.pop();
        }
    }
    int sum = 0;
    while (!y.empty()) {
        sum += y.top();
        y.pop();
    }
    cout << sum << endl;
}

```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int cmp(const void *a, const void *b) {
    return *(int *)a - *(int *)b;
}

int main() {
    int n, m;
    scanf("%d %d", &n, &m);
    int *x = malloc(sizeof(int) * n * 2);
    int *y = malloc(sizeof(int) * m);
    for (int i = 0; i < n; i++) {
        int day, salary;
        scanf("%d %d", &day, &salary);
        x[i * 2] = -day;
        x[i * 2 + 1] = -salary;
    }
    qsort(x, n * 2, sizeof(int), cmp);
    for (int i = 0; i < n * 2; i++) {
        if (i % 2 == 0) {
            int d = -x[i];
            int s = -x[i + 1];
            int r = m - *y;
            if (r >= -d) {
                *y = -s;
            } else {
                *y = -s;
                y++;
            }
        }
    }
    int sum = 0;
    for (int i = 0; i < m; i++) {
        sum += *y;
        y++;
    }
    printf("%d\n", sum);
}

```
[/C]

[PHP]
```php
<?php
$n = (int)readline();
$m = (int)readline();
$x = [];
$y = [];
for ($i = 0; $i < $n; $i++) {
    list($day, $salary) = explode(' ', readline());
    $x[] = -$day;
    $x[] = -$salary;
}
sort($x);
for ($i = 0; $i < count($x); $i++) {
    if ($i % 2 == 0) {
        $d = -$x[$i];
        $s = -$x[$i + 1];
        $r = $m - count($y);
        if ($r >= -$d) {
            $y[] = -$s;
        } else {
            $y[] = -$s;
            array_pop($y);
        }
    }
}
$sum = 0;
foreach ($y as $v) {
    $sum += $v;
}
echo $sum;

```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp $n;
my $
