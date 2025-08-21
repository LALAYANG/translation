
[JAV]
```
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] cake = new String[n];
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        int initialCheck = 925;
        int cakeCheck = 287;
        for (int i = 0; i < n; i++) {
            cake[i] = sc.next();
            for (int j = 0; j < n; j++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (initialCheck & cakeCheck) {
                if (chocCount > 1) {
                    factorial_calc(chocCount, chocCount - 2, -1);
                    happiness += nfat / 2;
                }
            }
            nfat = 1;
            chocCount = 0;
        }
        int posCount = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int i = chocCount; i > chocCount - 2; i--) {
                    nfat *= i;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }
        System.out.println(happiness);
    }

    public static void factorial_calc(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        nfat = nfat * i;
        factorial_calc(i + step, stop, step);
    }
}
```
[/JAV]

[PY]
```
import sys

n = int(sys.stdin.readline())
cake = []
happiness = 0
chocCount = 0
nfat = 1
initialCheck = 925
cakeCheck = 287
for i in range(n):
    line = sys.stdin.readline()
    cake.append(line)
    for j in line:
        if j == 'C':
            chocCount = chocCount + 1
    if initialCheck & cakeCheck:
        if chocCount > 1:

            @my_decorator
            def factorial_calc(i, stop, step):
                global nfat
                if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
                    return
                nfat = nfat * i
                factorial_calc(i + step, stop, step)
            factorial_calc(chocCount, chocCount - 2, -1)
            happiness += nfat / 2
    nfat = 1
    chocCount = 0
posCount = 0
for j in range(n):
    for i in range(n):
        if cake[i][j] == 'C':
            chocCount += 1
    if chocCount > 1:
        for i in range(chocCount, chocCount - 2, -1):
            nfat *= i
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
print(int(happiness))
```
[/PY]

[C]
```
#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    char cake[n][n];
    int happiness = 0;
    int chocCount = 0;
    int nfat = 1;
    int initialCheck = 925;
    int cakeCheck = 287;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            scanf("%c", &cake[i][j]);
            if (cake[i][j] == 'C') {
                chocCount++;
            }
        }
        if (initialCheck & cakeCheck) {
            if (chocCount > 1) {
                factorial_calc(chocCount, chocCount - 2, -1);
                happiness += nfat / 2;
            }
        }
        nfat = 1;
        chocCount = 0;
    }
    int posCount = 0;
    for (int j = 0; j < n; j++) {
        for (int i = 0; i < n; i++) {
            if (cake[i][j] == 'C') {
                chocCount++;
            }
        }
        if (chocCount > 1) {
            for (int i = chocCount; i > chocCount - 2; i--) {
                nfat *= i;
            }
            happiness += nfat / 2;
        }
        nfat = 1;
        chocCount = 0;
    }
    printf("%d", happiness);
}

void factorial_calc(int i, int stop, int step) {
    if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
        return;
    }
    nfat = nfat * i;
    factorial_calc(i + step, stop, step);
}
```
[/C]

[CPP]
```
#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    char cake[n][n];
    int happiness = 0;
    int chocCount = 0;
    int nfat = 1;
    int initialCheck = 925;
    int cakeCheck = 287;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> cake[i][j];
            if (cake[i][j] == 'C') {
                chocCount++;
            }
        }
        if (initialCheck & cakeCheck) {
            if (chocCount > 1) {
                factorial_calc(chocCount, chocCount - 2, -1);
                happiness += nfat / 2;
            }
        }
        nfat = 1;
        chocCount = 0;
    }
    int posCount = 0;
    for (int j = 0; j < n; j++) {
        for (int i = 0; i < n; i++) {
            if (cake[i][j] == 'C') {
                chocCount++;
            }
        }
        if (chocCount > 1) {
            for (int i = chocCount; i > chocCount - 2; i--) {
                nfat *= i;
            }
            happiness += nfat / 2;
        }
        nfat = 1;
        chocCount = 0;
    }
    cout << happiness;
}

void factorial_calc(int i, int stop, int step) {
    if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
        return;
    }
    nfat = nfat * i;
    factorial_calc(i + step, stop, step);
}
```
[/CPP]

[PHP]
```
<?php

$n = intval(fgets(STDIN));
$cake = [];
$happiness = 0;
$chocCount = 0;
$nfat = 1;
$initialCheck = 925;
$cakeCheck = 287;
for ($i = 0; $i < $n; $i++) {
    $line = fgets(STDIN);
    $cake[] = $line;
    for ($j = 0; $j < $n; $j++) {
        if ($line[$j] == 'C') {
            $chocCount++;
        }
    }
    if ($initialCheck & $cakeCheck) {
        if ($chocCount > 1) {
            factorial_calc($chocCount, $chocCount - 2, -1);
            $happiness += $nfat / 2;
        }
    }
    $nfat = 1;
    $chocCount = 0;
}
$posCount = 0;
for ($j = 0; $j < $n; $j++) {
    for ($i = 0; $i < $n; $i++) {
        if ($cake[$i][$j] == 'C') {
            $chocCount++;
        }
    }
    if ($chocCount > 1) {
        for ($i = $chocCount; $i > $chocCount - 2; $i--) {
            $nfat *= $i;
        }
        $happiness += $nfat / 2;
    }
    $nfat = 1;
    $chocCount = 0;
}
echo $happiness;

function factorial_calc($i, $stop, $step) {
    global $nfat;
    if ($step == 0 || ($step > 0 && $i >= $stop) || ($step < 0 && $i <= $stop)) {
        return;
    }
    $nfat = $nfat * $i;
    factorial_calc($i + $step, $stop, $step);
}
```
[/PHP]

[RUBY]
```
n = gets.to_i
cake = []
happiness = 0
chocCount = 0
nfat = 1
initialCheck = 925
cakeCheck = 287
for i in 0..n-1
    line = gets.chomp
    cake.push(line)
    for j in 0..n-1
        if line[j] == 'C'
            chocCount = chocCount + 1
        end
    end
    if initialCheck & cakeCheck
        if chocCount > 1
            factorial_calc(chocCount, chocCount - 2, -1)
            happiness += nfat / 2
        end
    end
    nfat = 1
    chocCount = 0
end
posCount = 0
for j in 0..n-1
    for i in 0..n-1
        if cake[i][j] == 'C'
            chocCount += 1
        end
    end
    if chocCount > 1
        for i in chocCount..chocCount - 2
            nfat *= i
        end
        happiness += nfat / 2
    end
    nfat = 1
    chocCount = 0
end
puts happiness

def factorial_calc(i, stop, step)
    if step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)
        return
    end
    nfat = nfat * i
    factorial_calc(i + step, stop, step)
end
```
[/RUBY]

[GO]
```
package main

import (
    "fmt"
)

func main() {
    var n int
    fmt.Scan(&n)
    cake := make([]string, n)
    happiness := 0
    chocCount := 0
    nfat := 1
    initialCheck := 925
    cakeCheck := 287
    for i := 0; i < n; i++ {
        fmt.Scan(&cake[i])
        for j := 0; j < n; j++ {
            if cake[i][j] == 'C' {
                chocCount++
            }
        }
        if initialCheck & cakeCheck {
            if chocCount > 1 {
                factorial_calc(chocCount, chocCount - 2, -1)
                happiness += nfat / 2
            }
        }
        nfat = 1
        chocCount = 0
    }
    posCount := 0
    for j := 0; j < n; j++ {
        for i := 0; i < n; i++ {
            if cake[i][j] == 'C' {
                chocCount++
            }
        }
        if chocCount > 1 {
            for i := chocCount; i > chocCount - 2; i-- {
                nfat *= i
            }
            happiness += nfat / 2
        }
        nfat = 1
        chocCount = 0
    }
    fmt.Println(happiness)
}

func factorial_calc(i, stop, step int) {
    if step == 0 || (step > 0 && i >= stop) || (step <
