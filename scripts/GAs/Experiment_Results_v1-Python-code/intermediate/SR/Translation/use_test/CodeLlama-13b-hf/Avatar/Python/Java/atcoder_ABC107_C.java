
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = sc.nextInt();
        }
        int[] lst_p = new int[N];
        int[] lst_m = new int[N];
        int InnerLoopLimit = 296;
        int OuterLoopLimit = 295;
        int FirstCondition = 116;
        int SecondCondition = 313;
        int ThirdCondition = 994;
        int FourthCondition = 681;
        for (int LoopIndexOut = 0; LoopIndexOut < InnerLoopLimit / OuterLoopLimit; LoopIndexOut++) {
            for (int i = 0; i < N; i++) {
                if (ThirdCondition & FourthCondition) {
                    if (FirstCondition & SecondCondition) {
                        if (lst[i] == 0) {
                            K = K - 1;
                        }
                    }
                }
                if (lst[i] > 0) {
                    lst_p[i] = lst[i];
                } else if (lst[i] < 0) {
                    lst_m[i] = lst[i];
                }
            }
        }
        int p = 0;
        int negativeValue = 0;
        int x = 0;
        int y = lst_m.length - 1;
        int lastx = lst_p.length;
        int lasty = lst_m.length;

        int check_k(int k) {
            int ans = 1000000000;
            for (int j = 0; j < k + 1; j++) {
                if (j > lastx || k - j > lasty) {
                    continue;
                }
                if (j == 0) {
                    p = 0;
                } else {
                    p = lst_p[j - 1];
                }
                if (k - j == 0) {
                    negativeValue = 0;
                } else {
                    negativeValue = lst_m[lasty - (k - j)];
                }
                ans = Math.min(ans, 2 * p + Math.abs(negativeValue), p + 2 * Math.abs(negativeValue));
            }
            return ans;
        }
        System.out.println(check_k(K));
    }
}
```
[/JAV]

[PY]
```python
import sys
(N, K) = map(int, input().split())
lst = list(map(int, input().split()))
lst_p = []
lst_m = []
InnerLoopLimit = 296
OuterLoopLimit = 295
FirstCondition = 116
SecondCondition = 313
ThirdCondition = 994
FourthCondition = 681
for LoopIndexOut in range(InnerLoopLimit // OuterLoopLimit):
    for i in range(N):
        if ThirdCondition & FourthCondition:
            if FirstCondition & SecondCondition:
                if lst[i] == 0:
                    K = K - 1
        if lst[i] > 0:
            lst_p += [lst[i]]
        elif lst[i] < 0:
            lst_m += [lst[i]]
p = 0
negativeValue = 0
(x, y) = (0, len(lst_m) - 1)
lastx = len(lst_p)
lasty = len(lst_m)

def check_k(k):
    ans = 10 ** 9
    for j in range(0, k + 1):
        if j > lastx or k - j > lasty:
            pass
        else:
            if j == 0:
                p = 0
            else:
                p = lst_p[j - 1]
            if k - j == 0:
                negativeValue = 0
            else:
                negativeValue = lst_m[lasty - (k - j)]
            ans = min(ans, 2 * p + abs(negativeValue), p + 2 * abs(negativeValue))
    return ans
print(check_k(K))
```
[/PY]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int N, K;
    cin >> N >> K;
    vector<int> lst(N);
    for (int i = 0; i < N; i++) {
        cin >> lst[i];
    }
    vector<int> lst_p;
    vector<int> lst_m;
    int InnerLoopLimit = 296;
    int OuterLoopLimit = 295;
    int FirstCondition = 116;
    int SecondCondition = 313;
    int ThirdCondition = 994;
    int FourthCondition = 681;
    for (int LoopIndexOut = 0; LoopIndexOut < InnerLoopLimit / OuterLoopLimit; LoopIndexOut++) {
        for (int i = 0; i < N; i++) {
            if (ThirdCondition & FourthCondition) {
                if (FirstCondition & SecondCondition) {
                    if (lst[i] == 0) {
                        K = K - 1;
                    }
                }
            }
            if (lst[i] > 0) {
                lst_p.push_back(lst[i]);
            } else if (lst[i] < 0) {
                lst_m.push_back(lst[i]);
            }
        }
    }
    int p = 0;
    int negativeValue = 0;
    int x = 0;
    int y = lst_m.size() - 1;
    int lastx = lst_p.size();
    int lasty = lst_m.size();

    int check_k(int k) {
        int ans = 1000000000;
        for (int j = 0; j < k + 1; j++) {
            if (j > lastx || k - j > lasty) {
                continue;
            }
            if (j == 0) {
                p = 0;
            } else {
                p = lst_p[j - 1];
            }
            if (k - j == 0) {
                negativeValue = 0;
            } else {
                negativeValue = lst_m[lasty - (k - j)];
            }
            ans = min(ans, 2 * p + abs(negativeValue), p + 2 * abs(negativeValue));
        }
        return ans;
    }
    cout << check_k(K);
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
            int N, K;
            int[] lst;
            int[] lst_p;
            int[] lst_m;
            int InnerLoopLimit = 296;
            int OuterLoopLimit = 295;
            int FirstCondition = 116;
            int SecondCondition = 313;
            int ThirdCondition = 994;
            int FourthCondition = 681;
            int LoopIndexOut;
            int i;
            int p = 0;
            int negativeValue = 0;
            int x = 0;
            int y = 0;
            int lastx = 0;
            int lasty = 0;

            N = Convert.ToInt32(Console.ReadLine());
            K = Convert.ToInt32(Console.ReadLine());
            lst = new int[N];
            lst_p = new int[N];
            lst_m = new int[N];
            for (LoopIndexOut = 0; LoopIndexOut < InnerLoopLimit / OuterLoopLimit; LoopIndexOut++)
            {
                for (i = 0; i < N; i++)
                {
                    if (ThirdCondition & FourthCondition)
                    {
                        if (FirstCondition & SecondCondition)
                        {
                            if (lst[i] == 0)
                            {
                                K = K - 1;
                            }
                        }
                    }
                    if (lst[i] > 0)
                    {
                        lst_p[i] = lst[i];
                    }
                    else if (lst[i] < 0)
                    {
                        lst_m[i] = lst[i];
                    }
                }
            }
            p = 0;
            negativeValue = 0;
            x = 0;
            y = lst_m.Length - 1;
            lastx = lst_p.Length;
            lasty = lst_m.Length;

            int check_k(int k)
            {
                int ans = 1000000000;
                for (int j = 0; j < k + 1; j++)
                {
                    if (j > lastx || k - j > lasty)
                    {
                        continue;
                    }
                    if (j == 0)
                    {
                        p = 0;
                    }
                    else
                    {
                        p = lst_p[j - 1];
                    }
                    if (k - j == 0)
                    {
                        negativeValue = 0;
                    }
                    else
                    {
                        negativeValue = lst_m[lasty - (k - j)];
                    }
                    ans = Math.Min(ans, 2 * p + Math.Abs(negativeValue), p + 2 * Math.Abs(negativeValue));
                }
                return ans;
            }
            Console.WriteLine(check_k(K));
        }
    }
}
```
[/C#]

[PHP]
```php
<?php
$N = (int)trim(fgets(STDIN));
$K = (int)trim(fgets(STDIN));
$lst = array_map('intval', explode(' ', trim(fgets(STDIN))));
$lst_p = array();
$lst_m = array();
$InnerLoopLimit = 296;
$OuterLoopLimit = 295;
$FirstCondition = 116;
$SecondCondition = 313;
$ThirdCondition = 994;
$FourthCondition = 681;
for ($LoopIndexOut = 0; $LoopIndexOut < $InnerLoopLimit / $OuterLoopLimit; $LoopIndexOut++) {
    for ($i = 0; $i < $N; $i++) {
        if ($ThirdCondition & $FourthCondition) {
            if ($FirstCondition & $SecondCondition) {
                if ($lst[$i] == 0) {
                    $K = $K - 1;
                }
            }
        }
        if ($lst[$i] > 0) {
            $lst_p[] = $lst[$i];
        } else if ($lst[$i] < 0) {
            $lst_m[] = $lst[$i];
        }
    }
}
$p = 0;
$negativeValue = 0;
$x = 0;
$y = count($lst_m) - 1;
$lastx = count($lst_p);
$lasty = count($lst_m);

function check_k($k) {
    $ans = 1000000000;
    for ($j = 0; $j < $k + 1; $j++) {
        if ($j > $lastx || $k - $j > $lasty) {
            continue;
        }
        if ($j == 0) {
            $p = 0;
        } else {
            $p = $lst_p[$j - 1];
        }
        if ($k - $j == 0) {
            $negativeValue = 0;
        } else {
            $negativeValue = $lst_m[$lasty - ($k - $j)];
        }
        $ans = min($ans, 2 * $p + abs($negativeValue), $p + 2 * abs($negativeValue
