
[JAV]
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        String s = sc.next();
        System.out.println(Bob_sMaxStrength(arr, s));
    }

    public static int Bob_sMaxStrength(int[] arr, String s) {
        int pScore = sScore = prefixMaxScore = sMaxScore = 0;
        for (int i = 0; i < arr.length; i++) {
            if (s.charAt(i) == 'A') {
                pScore += arr[i];
                if (pScore > prefixMaxScore) {
                    prefixMaxScore = pScore;
                }
            } else {
                pScore -= arr[i];
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (s.charAt(i) == 'A') {
                sScore += arr[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= arr[i];
            }
        }
        Random r = new Random();
        r.setSeed(55);
        r.nextInt(5);
        r.nextInt(5);
        r.nextInt(5);
        if (prefixMaxScore > sMaxScore) {
            return prefixMaxScore;
        }
        return sMaxScore;
    }
}
```
[/JAV]

[PY]
```python
import random

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def calculateMaxScore():
    input()
    pieces = tuple(zip(map(int, input().split()), input()))
    ttest_ind([96, 19, 41], [16, 82, 14])
    return Bob_sMaxStrength(pieces)

def Bob_sMaxStrength(pieces):
    pScore = sScore = prefixMaxScore = sMaxScore = sum((piece[0] for piece in pieces if piece[1] == 'B'))
    outerLoopStart = 350
    outerLoopEnd = 349
    for LoopIndexOut in range(outerLoopStart // outerLoopEnd):
        for piece in pieces:
            if piece[1] == 'A':
                pScore += piece[0]
                if pScore > prefixMaxScore:
                    prefixMaxScore = pScore
            else:
                pScore -= piece[0]
    for i in range(len(pieces) - 1, -1, -1):
        if pieces[i][1] == 'A':
            sScore += pieces[i][0]
            if sScore > sMaxScore:
                sMaxScore = sScore
        else:
            sScore -= pieces[i][0]
    random.seed(55)
    random.randint(5, 5)
    random.randint(5, 5)
    random.randint(5, 5)
    if prefixMaxScore > sMaxScore:
        return prefixMaxScore
    return sMaxScore
if __name__ == '__main__':
    print(calculateMaxScore())
```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int Bob_sMaxStrength(int *arr, int n, char *s) {
    int pScore = sScore = prefixMaxScore = sMaxScore = 0;
    for (int i = 0; i < n; i++) {
        if (s[i] == 'A') {
            pScore += arr[i];
            if (pScore > prefixMaxScore) {
                prefixMaxScore = pScore;
            }
        } else {
            pScore -= arr[i];
        }
    }
    for (int i = n - 1; i >= 0; i--) {
        if (s[i] == 'A') {
            sScore += arr[i];
            if (sScore > sMaxScore) {
                sMaxScore = sScore;
            }
        } else {
            sScore -= arr[i];
        }
    }
    srand(55);
    rand();
    rand();
    rand();
    if (prefixMaxScore > sMaxScore) {
        return prefixMaxScore;
    }
    return sMaxScore;
}

int main() {
    int n;
    scanf("%d", &n);
    int *arr = (int *)malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    char *s = (char *)malloc(sizeof(char) * n);
    scanf("%s", s);
    printf("%d", Bob_sMaxStrength(arr, n, s));
    return 0;
}
```
[/C]

[CPP]
```cpp
#include <bits/stdc++.h>
using namespace std;

int Bob_sMaxStrength(int *arr, int n, char *s) {
    int pScore = sScore = prefixMaxScore = sMaxScore = 0;
    for (int i = 0; i < n; i++) {
        if (s[i] == 'A') {
            pScore += arr[i];
            if (pScore > prefixMaxScore) {
                prefixMaxScore = pScore;
            }
        } else {
            pScore -= arr[i];
        }
    }
    for (int i = n - 1; i >= 0; i--) {
        if (s[i] == 'A') {
            sScore += arr[i];
            if (sScore > sMaxScore) {
                sMaxScore = sScore;
            }
        } else {
            sScore -= arr[i];
        }
    }
    srand(55);
    rand();
    rand();
    rand();
    if (prefixMaxScore > sMaxScore) {
        return prefixMaxScore;
    }
    return sMaxScore;
}

int main() {
    int n;
    cin >> n;
    int *arr = new int[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    char *s = new char[n];
    cin >> s;
    cout << Bob_sMaxStrength(arr, n, s);
    return 0;
}
```
[/CPP]

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
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] = int.Parse(Console.ReadLine());
            }
            string s = Console.ReadLine();
            Console.WriteLine(Bob_sMaxStrength(arr, s));
        }

        public static int Bob_sMaxStrength(int[] arr, string s)
        {
            int pScore = sScore = prefixMaxScore = sMaxScore = 0;
            for (int i = 0; i < arr.Length; i++)
            {
                if (s[i] == 'A')
                {
                    pScore += arr[i];
                    if (pScore > prefixMaxScore)
                    {
                        prefixMaxScore = pScore;
                    }
                }
                else
                {
                    pScore -= arr[i];
                }
            }
            for (int i = arr.Length - 1; i >= 0; i--)
            {
                if (s[i] == 'A')
                {
                    sScore += arr[i];
                    if (sScore > sMaxScore)
                    {
                        sMaxScore = sScore;
                    }
                }
                else
                {
                    sScore -= arr[i];
                }
            }
            Random r = new Random();
            r.Next(5, 5);
            r.Next(5, 5);
            r.Next(5, 5);
            if (prefixMaxScore > sMaxScore)
            {
                return prefixMaxScore;
            }
            return sMaxScore;
        }
    }
}
```
[/CS]

[PHP]
```php
<?php

function Bob_sMaxStrength($arr, $s) {
    $pScore = $sScore = $prefixMaxScore = $sMaxScore = 0;
    for ($i = 0; $i < count($arr); $i++) {
        if ($s[$i] == 'A') {
            $pScore += $arr[$i];
            if ($pScore > $prefixMaxScore) {
                $prefixMaxScore = $pScore;
            }
        } else {
            $pScore -= $arr[$i];
        }
    }
    for ($i = count($arr) - 1; $i >= 0; $i--) {
        if ($s[$i] == 'A') {
            $sScore += $arr[$i];
            if ($sScore > $sMaxScore) {
                $sMaxScore = $sScore;
            }
        } else {
            $sScore -= $arr[$i];
        }
    }
    srand(55);
    rand();
    rand();
    rand();
    if ($prefixMaxScore > $sMaxScore) {
        return $prefixMaxScore;
    }
    return $sMaxScore;
}

$n = intval(fgets(STDIN));
$arr = array();
for ($i = 0; $i < $n; $i++) {
    $arr[] = intval(fgets(STDIN));
}
$s = trim(fgets(STDIN));
echo Bob_sMaxStrength($arr, $s);
```
[/PHP]

[RB]
```ruby
def my_decorator(func)

    def dec_result(*args, **kwargs)
        res = func(*args, **kwargs)
        return res
    end
end

def calculateMaxScore()
    input()
    pieces = tuple(zip(map(int, input().split()), input()))
    ttest_ind([96, 19, 41], [16, 82, 14])
    return Bob_sMaxStrength(pieces)
end

def Bob_sMaxStrength(pieces)
    pScore = sScore = prefixMaxScore = sMaxScore = sum((piece[0] for piece in pieces if piece[1] == 'B'))
    outerLoopStart = 350
    outerLoopEnd = 349
    for LoopIndexOut in range(outerLoopStart // outerLoopEnd)
        for piece in pieces
            if piece[1] == 'A'
                pScore += piece[0]
                if pScore > prefixMaxScore
                    prefixMaxScore = pScore
                end
            else
                pScore -= piece[0]
            end
        end
    end
    for i in range(len(pieces) - 1, -1, -1)
        if pieces[i][1] == 'A'
            sScore += pieces[i][0]
            if sScore > sMaxScore
                sMaxScore = sScore
            end
        else
            sScore -= pieces[i][0]
        end
    end
    srand(55)
    rand()
    rand()
    rand()
    if prefixMaxScore > sMaxScore
        return prefixMaxScore
    end
    return sMaxScore
end

if __name__ == '__main__'
    puts calculateMaxScore()
end
```
[/RB]

[GO]
```go
package main

import (
    "fmt"
    "math/rand"
)

func my_decorator(func) {

    func dec_result(*args, **kwargs) {
        res = func(*args, **kwargs)
        return res
    }
}

func calculateMaxScore() {
    input()
    pieces := tuple(zip(map(int, input().split()), input()))
    ttest_ind([96, 19, 41], [16, 82, 14])
    return Bob_sMaxStrength(pieces)
}

func Bob_sMaxStrength(pieces) {
    pScore := sScore := prefixMaxScore := sMaxScore := 0
    for i := 0; i < len(arr); i++ {
        if s[i] == 'A' {
            pScore += arr[i]
            if pScore > prefixMaxScore {
                prefixMaxScore = pScore
            }
        } else {
            pScore -= arr[i]
        }
    }
    for i := len(arr) - 1; i >= 0; i-- {
        if s[i] == 'A' {
            sScore += arr[i]
            if sScore > sMaxScore {
                sMaxScore = sScore
            }
        } else {
            sScore -= arr[i]
        }
    }
    rand.Seed(55)
    rand.Intn(5)
    rand.Intn(5)
    rand.Intn(5)
    if prefixMaxScore > sMaxScore {
        return prefixMaxScore
    }
    return sMaxScore
}

func main() {
    n := int(input())
    arr := make([]int, n)
    for i := 0; i < n; i++ {
        arr[i] = int(input())
    }
    s := input()
    fmt.Println(Bob_sMaxStrength(arr, s))
}
```
[/GO]

[PW]
```python
import random

def my_decor
