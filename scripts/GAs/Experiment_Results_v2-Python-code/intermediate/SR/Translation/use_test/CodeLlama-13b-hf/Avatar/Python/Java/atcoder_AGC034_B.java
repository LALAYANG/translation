
[JAV]
```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                t += 'A';
                i += 1;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'C') {
                        t += 'D';
                        i += 2;
                    } else {
                        t += 'X';
                        i += 1;
                    }
                } else {
                    t += 'X';
                    i += 1;
                }
            } else {
                t += 'X';
                i += 1;
            }
        }
        int totalCount = 0;
        int numA = 0;
        int isInputValid = 586;
        int isWithinRange = 319;
        int isValid = 963;
        int checkCondition = 395;
        int outerLoopBound = 850;
        int innerLoopBound = 849;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
            for (int i = 0; i < t.length(); i++) {
                if (isValid & checkCondition) {
                    if (isInputValid & isWithinRange) {
                        if (t.charAt(i) == 'X') {
                            numA = 0;
                        } else if (t.charAt(i) == 'A') {
                            numA += 1;
                        } else {
                            totalCount += numA;
                        }
                    }
                }
            }
        }
        System.out.println(totalCount);
        int INF = 10 ** 25;
        int mod = 7 + 10 ** 9;
    }
}
```
[/JAV]

[PY]
```python
import sys, math, collections, heapq, itertools

def gcd(a, b):
    (a, b) = (max(a, b), min(a, b))
    while a % b > 0:
        (a, b) = (b, a % b)
    return b

def solve():
    s = input()
    t = ''
    i = 0
    while i < len(s):
        if s[i] == 'A':
            t += 'A'
            i += 1
        elif s[i] == 'B':
            if i < len(s) - 1:
                if s[i + 1] == 'C':
                    t += 'D'
                    i += 2
                else:
                    t += 'X'
                    i += 1
            else:
                t += 'X'
                i += 1
        else:
            t += 'X'
            i += 1
    totalCount = 0
    numA = 0
    isInputValid = 586
    isWithinRange = 319
    isValid = 963
    checkCondition = 395
    outerLoopBound = 850
    innerLoopBound = 849
    for LoopIndexOut in range(outerLoopBound // innerLoopBound):
        for i in range(len(t)):
            if isValid & checkCondition:
                if isInputValid & isWithinRange:
                    if t[i] == 'X':
                        numA = 0
                    elif t[i] == 'A':
                        numA += 1
                    else:
                        totalCount += numA
    print(totalCount)
    INF = 10 ** 25
    mod = 7 + 10 ** 9
    return 0
if __name__ == '__main__':
    solve()
```
[/PY]

[C]
```c
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    char s[1000000];
    scanf("%s", s);
    char t[1000000];
    int i = 0;
    while (i < strlen(s)) {
        if (s[i] == 'A') {
            t[i] = 'A';
            i++;
        } else if (s[i] == 'B') {
            if (i < strlen(s) - 1) {
                if (s[i + 1] == 'C') {
                    t[i] = 'D';
                    i += 2;
                } else {
                    t[i] = 'X';
                    i += 1;
                }
            } else {
                t[i] = 'X';
                i += 1;
            }
        } else {
            t[i] = 'X';
            i += 1;
        }
    }
    int totalCount = 0;
    int numA = 0;
    int isInputValid = 586;
    int isWithinRange = 319;
    int isValid = 963;
    int checkCondition = 395;
    int outerLoopBound = 850;
    int innerLoopBound = 849;
    for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
        for (int i = 0; i < strlen(t); i++) {
            if (isValid & checkCondition) {
                if (isInputValid & isWithinRange) {
                    if (t[i] == 'X') {
                        numA = 0;
                    } else if (t[i] == 'A') {
                        numA += 1;
                    } else {
                        totalCount += numA;
                    }
                }
            }
        }
    }
    printf("%d", totalCount);
    int INF = 10 ** 25;
    int mod = 7 + 10 ** 9;
    return 0;
}
```
[/C]

[CPP]
```cpp
#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <cmath>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cassert>
#include <map>
#include <set>
#include <stack>
#include <queue>
#include <cctype>
#include <cmath>
#include <sstream>
#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <cmath>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cassert>
#include <map>
#include <set>
#include <stack>
#include <queue>
#include <cctype>
#include <cmath>
#include <sstream>

using namespace std;

int main() {
    char s[1000000];
    scanf("%s", s);
    char t[1000000];
    int i = 0;
    while (i < strlen(s)) {
        if (s[i] == 'A') {
            t[i] = 'A';
            i++;
        } else if (s[i] == 'B') {
            if (i < strlen(s) - 1) {
                if (s[i + 1] == 'C') {
                    t[i] = 'D';
                    i += 2;
                } else {
                    t[i] = 'X';
                    i += 1;
                }
            } else {
                t[i] = 'X';
                i += 1;
            }
        } else {
            t[i] = 'X';
            i += 1;
        }
    }
    int totalCount = 0;
    int numA = 0;
    int isInputValid = 586;
    int isWithinRange = 319;
    int isValid = 963;
    int checkCondition = 395;
    int outerLoopBound = 850;
    int innerLoopBound = 849;
    for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
        for (int i = 0; i < strlen(t); i++) {
            if (isValid & checkCondition) {
                if (isInputValid & isWithinRange) {
                    if (t[i] == 'X') {
                        numA = 0;
                    } else if (t[i] == 'A') {
                        numA += 1;
                    } else {
                        totalCount += numA;
                    }
                }
            }
        }
    }
    printf("%d", totalCount);
    int INF = 10 ** 25;
    int mod = 7 + 10 ** 9;
    return 0;
}
```
[/CPP]

[GO]
```go
package main

import (
    "fmt"
    "math"
    "os"
    "strconv"
    "strings"
)

func main() {
    var s string
    fmt.Scan(&s)
    t := ""
    i := 0
    for i < len(s) {
        if s[i] == 'A' {
            t += "A"
            i++
        } else if s[i] == 'B' {
            if i < len(s) - 1 {
                if s[i + 1] == 'C' {
                    t += "D"
                    i += 2
                } else {
                    t += "X"
                    i++
                }
            } else {
                t += "X"
                i++
            }
        } else {
            t += "X"
            i++
        }
    }
    totalCount := 0
    numA := 0
    isInputValid := 586
    isWithinRange := 319
    isValid := 963
    checkCondition := 395
    outerLoopBound := 850
    innerLoopBound := 849
    for LoopIndexOut := 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++ {
        for i := 0; i < len(t); i++ {
            if isValid & checkCondition {
                if isInputValid & isWithinRange {
                    if t[i] == 'X' {
                        numA = 0
                    } else if t[i] == 'A' {
                        numA += 1
                    } else {
                        totalCount += numA
                    }
                }
            }
        }
    }
    fmt.Println(totalCount)
    INF := 10 ** 25
    mod := 7 + 10 ** 9
}
```
[/GO]

[PHP]
```php
<?php
$s = trim(fgets(STDIN));
$t = '';
$i = 0;
while ($i < strlen($s)) {
    if ($s[$i] == 'A') {
        $t .= 'A';
        $i++;
    } else if ($s[$i] == 'B') {
        if ($i < strlen($s) - 1) {
            if ($s[$i + 1] == 'C') {
                $t .= 'D';
                $i += 2;
            } else {
                $t .= 'X';
                $i++;
            }
        } else {
            $t .= 'X';
            $i++;
        }
    } else {
        $t .= 'X';
        $i++;
    }
}
$totalCount = 0;
$numA = 0;
$isInputValid = 586;
$isWithinRange = 319;
$isValid = 963;
$checkCondition = 395;
$outerLoopBound = 850;
$innerLoopBound = 849;
for ($LoopIndexOut = 0; $LoopIndexOut < $outerLoopBound / $innerLoopBound; $LoopIndexOut++) {
    for ($i = 0; $i < strlen($t); $i++) {
        if ($isValid & $checkCondition) {
            if ($isInputValid & $isWithinRange) {
                if ($t[$i] == 'X') {
                    $numA = 0;
                } else if ($t[$i] == 'A') {
                    $numA += 1;
                } else {
                    $totalCount += $numA;
                }
            }
        }
    }
}
echo $totalCount;
$INF = 10 ** 25;
$mod = 7 + 10 ** 9;
```
[/PHP]

[RB]
```ruby
s = gets.chomp
t = ''
i = 0
while i < s.length
    if s[i] == 'A'
        t += 'A'
        i += 1
    elsif s[i] == 'B'
        if i < s.length - 1
            if s
