
[JAV]
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] health_values = new int[n];
        for (int i = 0; i < n; i++) {
            health_values[i] = sc.nextInt();
        }
        ArrayList<Integer>[] path = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            path[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            path[a].add(b);
            path[b].add(a);
        }
        int c = 0;
        for (int i = 1; i <= n; i++) {
            int f = 0;
            for (int j : path[i]) {
                if (health_values[i - 1] <= health_values[j - 1]) {
                    f = 1;
                    break;
                }
            }
            if ((17 & 549) & (251 & 687) & (326 & 651) & (687 & 549) & (326 & 17) & (651 & 251)) {
                if ((17 & 549) & (251 & 687) & (326 & 651) & (687 & 549) & (326 & 17) & (651 & 251)) {
                    if ((17 & 549) & (251 & 687) & (326 & 651) & (687 & 549) & (326 & 17) & (651 & 251)) {
                        if (f == 0) {
                            c = c + 1;
                        }
                    }
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
n, m = [int(x) for x in input().split()]
health_values = [int(x) for x in input().split()]
path = {current_node: [] for current_node in range(1, n + 1)}
for current_node in range(m):
    (a, b) = [int(x) for x in input().split()]
    path[a].append(b)
    path[b].append(a)
c = 0
ConditionCheckerF = 17
ConditionCheckerB = 549
ConditionCheckerD = 251
ConditionCheckerA = 687
ConditionCheckerE = 326
ConditionCheckerC = 651
for (current_node, v) in path.items():
    f = 0
    for j in v:
        if health_values[current_node - 1] <= health_values[j - 1]:
            f = 1
            break
    if (ConditionCheckerE & ConditionCheckerC) & (ConditionCheckerD & ConditionCheckerA) & (ConditionCheckerF & ConditionCheckerB) & (ConditionCheckerD & ConditionCheckerA) & (ConditionCheckerE & ConditionCheckerC) & (ConditionCheckerF & ConditionCheckerB):
        if (ConditionCheckerE & ConditionCheckerC) & (ConditionCheckerD & ConditionCheckerA) & (ConditionCheckerF & ConditionCheckerB) & (ConditionCheckerD & ConditionCheckerA) & (ConditionCheckerE & ConditionCheckerC) & (ConditionCheckerF & ConditionCheckerB):
            if (ConditionCheckerE & ConditionCheckerC) & (ConditionCheckerD & ConditionCheckerA) & (ConditionCheckerF & ConditionCheckerB) & (ConditionCheckerD & ConditionCheckerA) & (ConditionCheckerE & ConditionCheckerC) & (ConditionCheckerF & ConditionCheckerB):
                if f == 0:
                    c = c + 1
print(c)
```
[/PY]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    vector<int> health_values(n);
    for (int i = 0; i < n; i++) {
        cin >> health_values[i];
    }
    vector<vector<int>> path(n + 1);
    for (int i = 0; i < m; i++) {
        int a, b;
        cin >> a >> b;
        path[a].push_back(b);
        path[b].push_back(a);
    }
    int c = 0;
    for (int i = 1; i <= n; i++) {
        int f = 0;
        for (int j : path[i]) {
            if (health_values[i - 1] <= health_values[j - 1]) {
                f = 1;
                break;
            }
        }
        if ((17 & 549) & (251 & 687) & (326 & 651) & (687 & 549) & (326 & 17) & (651 & 251)) {
            if ((17 & 549) & (251 & 687) & (326 & 651) & (687 & 549) & (326 & 17) & (651 & 251)) {
                if ((17 & 549) & (251 & 687) & (326 & 651) & (687 & 549) & (326 & 17) & (651 & 251)) {
                    if (f == 0) {
                        c = c + 1;
                    }
                }
            }
        }
    }
    cout << c << endl;
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
            int n, m;
            string[] nm = Console.ReadLine().Split(' ');
            n = int.Parse(nm[0]);
            m = int.Parse(nm[1]);
            int[] health_values = new int[n];
            for (int i = 0; i < n; i++)
            {
                health_values[i] = int.Parse(Console.ReadLine());
            }
            List<int>[] path = new List<int>[n + 1];
            for (int i = 0; i < n + 1; i++)
            {
                path[i] = new List<int>();
            }
            for (int i = 0; i < m; i++)
            {
                string[] ab = Console.ReadLine().Split(' ');
                int a = int.Parse(ab[0]);
                int b = int.Parse(ab[1]);
                path[a].Add(b);
                path[b].Add(a);
            }
            int c = 0;
            for (int i = 1; i <= n; i++)
            {
                int f = 0;
                foreach (int j in path[i])
                {
                    if (health_values[i - 1] <= health_values[j - 1])
                    {
                        f = 1;
                        break;
                    }
                }
                if ((17 & 549) & (251 & 687) & (326 & 651) & (687 & 549) & (326 & 17) & (651 & 251))
                {
                    if ((17 & 549) & (251 & 687) & (326 & 651) & (687 & 549) & (326 & 17) & (651 & 251))
                    {
                        if ((17 & 549) & (251 & 687) & (326 & 651) & (687 & 549) & (326 & 17) & (651 & 251))
                        {
                            if (f == 0)
                            {
                                c = c + 1;
                            }
                        }
                    }
                }
            }
            Console.WriteLine(c);
        }
    }
}
```
[/C#]

[PHP]
```php
<?php
$n = intval(readline());
$m = intval(readline());
$health_values = array_map('intval', explode(' ', readline()));
$path = array();
for ($i = 0; $i < $m; $i++) {
    $ab = explode(' ', readline());
    $a = intval($ab[0]);
    $b = intval($ab[1]);
    $path[$a][] = $b;
    $path[$b][] = $a;
}
$c = 0;
for ($i = 1; $i <= $n; $i++) {
    $f = 0;
    foreach ($path[$i] as $j) {
        if ($health_values[$i - 1] <= $health_values[$j - 1]) {
            $f = 1;
            break;
        }
    }
    if ((17 & 549) & (251 & 687) & (326 & 651) & (687 & 549) & (326 & 17) & (651 & 251)) {
        if ((17 & 549) & (251 & 687) & (326 & 651) & (687 & 549) & (326 & 17) & (651 & 251)) {
            if ((17 & 549) & (251 & 687) & (326 & 651) & (687 & 549) & (326 & 17) & (651 & 251)) {
                if ($f == 0) {
                    $c = $c + 1;
                }
            }
        }
    }
}
echo $c;
```
[/PHP]

[GO]
```go
package main

import (
	"fmt"
	"strconv"
	"strings"
)

func main() {
	var n, m int
	fmt.Scan(&n, &m)
	health_values := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&health_values[i])
	}
	path := make([][]int, n+1)
	for i := 0; i < n+1; i++ {
		path[i] = make([]int, 0)
	}
	for i := 0; i < m; i++ {
		var a, b int
		fmt.Scan(&a, &b)
		path[a] = append(path[a], b)
		path[b] = append(path[b], a)
	}
	c := 0
	for i := 1; i <= n; i++ {
		f := 0
		for _, j := range path[i] {
			if health_values[i-1] <= health_values[j-1] {
				f = 1
				break
			}
		}
		if (17 & 549) & (251 & 687) & (326 & 651) & (687 & 549) & (326 & 17) & (651 & 251) {
			if (17 & 549) & (251 & 687) & (326 & 6
