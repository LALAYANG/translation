
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = sc.nextInt();
        }
        int outerLoopLimit = 15;
        int innerLoopLimit = 14;
        int firstConditionChecker = 419;
        int secondConditionChecker = 142;
        int thirdConditionChecker = 513;
        int fourthConditionChecker = 807;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
            for (int i = 0; i < lista.length; i++) {
                if (firstConditionChecker & secondConditionChecker != 0) {
                    if (i == 0) {
                        System.out.print(lista[i + 1] - lista[i] + " ");
                        continue;
                    } else if (i == lista.length - 1) {
                        System.out.print(lista[lista.length - 1] - lista[lista.length - 2] + " ");
                        continue;
                    } else if (lista[i] - lista[i - 1] > lista[i + 1] - lista[i]) {
                        System.out.print(lista[i + 1] - lista[i] + " ");
                    } else {
                        System.out.print(lista[i] - lista[i - 1] + " ");
                    }
                }
                if (thirdConditionChecker & fourthConditionChecker != 0) {
                    if (lista[lista.length - 1] - lista[i] > lista[i] - lista[0]) {
                        System.out.print(lista[lista.length - 1] - lista[i]);
                    } else {
                        System.out.print(lista[i] - lista[0]);
                    }
                }
            }
        }
    }
}
```
[/JAV]

[PY]
```python
inp = int(input())
lista = []
lista = [int(num_input) for num_input in input().split()]
outerLoopLimit = 15
innerLoopLimit = 14
firstConditionChecker = 419
secondConditionChecker = 142
thirdConditionChecker = 513
fourthConditionChecker = 807
for LoopIndexOut in range(outerLoopLimit // innerLoopLimit):
    for i in range(len(lista)):
        if firstConditionChecker & secondConditionChecker:
            if i == 0:
                print(f'{lista[i + 1] - lista[i]} {lista[len(lista) - 1] - lista[i]}')
                continue
            elif i == len(lista) - 1:
                print(f'{lista[len(lista) - 1] - lista[len(lista) - 2]} {lista[len(lista) - 1] - lista[0]}')
                continue
            elif lista[i] - lista[i - 1] > lista[i + 1] - lista[i]:
                print(lista[i + 1] - lista[i], end=' ')
            else:
                print(lista[i] - lista[i - 1], end=' ')
        if thirdConditionChecker & fourthConditionChecker:
            if lista[len(lista) - 1] - lista[i] > lista[i] - lista[0]:
                print(lista[len(lista) - 1] - lista[i])
            else:
                print(lista[i] - lista[0])
```
[/PY]

[C]
```c
#include <stdio.h>

int main() {
    int inp;
    scanf("%d", &inp);
    int lista[inp];
    for (int i = 0; i < inp; i++) {
        scanf("%d", &lista[i]);
    }
    int outerLoopLimit = 15;
    int innerLoopLimit = 14;
    int firstConditionChecker = 419;
    int secondConditionChecker = 142;
    int thirdConditionChecker = 513;
    int fourthConditionChecker = 807;
    for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
        for (int i = 0; i < inp; i++) {
            if (firstConditionChecker & secondConditionChecker != 0) {
                if (i == 0) {
                    printf("%d ", lista[i + 1] - lista[i]);
                    continue;
                } else if (i == inp - 1) {
                    printf("%d ", lista[inp - 1] - lista[inp - 2]);
                    continue;
                } else if (lista[i] - lista[i - 1] > lista[i + 1] - lista[i]) {
                    printf("%d ", lista[i + 1] - lista[i]);
                } else {
                    printf("%d ", lista[i] - lista[i - 1]);
                }
            }
            if (thirdConditionChecker & fourthConditionChecker != 0) {
                if (lista[inp - 1] - lista[i] > lista[i] - lista[0]) {
                    printf("%d ", lista[inp - 1] - lista[i]);
                } else {
                    printf("%d ", lista[i] - lista[0]);
                }
            }
        }
    }
}
```
[/C]

[CPP]
```cpp
#include <iostream>

using namespace std;

int main() {
    int inp;
    cin >> inp;
    int lista[inp];
    for (int i = 0; i < inp; i++) {
        cin >> lista[i];
    }
    int outerLoopLimit = 15;
    int innerLoopLimit = 14;
    int firstConditionChecker = 419;
    int secondConditionChecker = 142;
    int thirdConditionChecker = 513;
    int fourthConditionChecker = 807;
    for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
        for (int i = 0; i < inp; i++) {
            if (firstConditionChecker & secondConditionChecker != 0) {
                if (i == 0) {
                    cout << lista[i + 1] - lista[i] << " ";
                    continue;
                } else if (i == inp - 1) {
                    cout << lista[inp - 1] - lista[inp - 2] << " ";
                    continue;
                } else if (lista[i] - lista[i - 1] > lista[i + 1] - lista[i]) {
                    cout << lista[i + 1] - lista[i] << " ";
                } else {
                    cout << lista[i] - lista[i - 1] << " ";
                }
            }
            if (thirdConditionChecker & fourthConditionChecker != 0) {
                if (lista[inp - 1] - lista[i] > lista[i] - lista[0]) {
                    cout << lista[inp - 1] - lista[i];
                } else {
                    cout << lista[i] - lista[0];
                }
            }
        }
    }
}
```
[/CPP]

[CS]
```cs
using System;

class Solution {
    static void Main(String[] args) {
        int inp = Convert.ToInt32(Console.ReadLine());
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = Convert.ToInt32(Console.ReadLine());
        }
        int outerLoopLimit = 15;
        int innerLoopLimit = 14;
        int firstConditionChecker = 419;
        int secondConditionChecker = 142;
        int thirdConditionChecker = 513;
        int fourthConditionChecker = 807;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
            for (int i = 0; i < lista.Length; i++) {
                if (firstConditionChecker & secondConditionChecker != 0) {
                    if (i == 0) {
                        Console.Write(lista[i + 1] - lista[i] + " ");
                        continue;
                    } else if (i == lista.Length - 1) {
                        Console.Write(lista[lista.Length - 1] - lista[lista.Length - 2] + " ");
                        continue;
                    } else if (lista[i] - lista[i - 1] > lista[i + 1] - lista[i]) {
                        Console.Write(lista[i + 1] - lista[i] + " ");
                    } else {
                        Console.Write(lista[i] - lista[i - 1] + " ");
                    }
                }
                if (thirdConditionChecker & fourthConditionChecker != 0) {
                    if (lista[lista.Length - 1] - lista[i] > lista[i] - lista[0]) {
                        Console.Write(lista[lista.Length - 1] - lista[i]);
                    } else {
                        Console.Write(lista[i] - lista[0]);
                    }
                }
            }
        }
    }
}
```
[/CS]

[PHP]
```php
<?php
$inp = intval(fgets(STDIN));
$lista = [];
for ($i = 0; $i < $inp; $i++) {
    $lista[] = intval(fgets(STDIN));
}
$outerLoopLimit = 15;
$innerLoopLimit = 14;
$firstConditionChecker = 419;
$secondConditionChecker = 142;
$thirdConditionChecker = 513;
$fourthConditionChecker = 807;
for ($LoopIndexOut = 0; $LoopIndexOut < $outerLoopLimit / $innerLoopLimit; $LoopIndexOut++) {
    for ($i = 0; $i < count($lista); $i++) {
        if ($firstConditionChecker & $secondConditionChecker != 0) {
            if ($i == 0) {
                echo $lista[$i + 1] - $lista[$i] . " ";
                continue;
            } else if ($i == count($lista) - 1) {
                echo $lista[count($lista) - 1] - $lista[count($lista) - 2] . " ";
                continue;
            } else if ($lista[$i] - $lista[$i - 1] > $lista[$i + 1] - $lista[$i]) {
                echo $lista[$i + 1] - $lista[$i] . " ";
            } else {
                echo $lista[$i] - $lista[$i - 1] . " ";
            }
        }
        if ($thirdConditionChecker & $fourthConditionChecker != 0) {
            if ($lista[count($lista) - 1] - $lista[$i] > $lista[$i] - $lista[0]) {
                echo $lista[count($lista) - 1] - $lista[$i];
            } else {
                echo $lista[$i] - $lista[0];
            }
        }
    }
}
```
[/PHP]

[RUBY]
```ruby
inp = gets.to_i
lista = []
inp.times do
    lista << gets.to_i
end
outerLoopLimit = 15
innerLoopLimit = 14
firstConditionChecker = 419
secondConditionChecker = 142
thirdConditionChecker = 513
fourthConditionChecker = 807
for LoopIndexOut in 0..(outerLoopLimit / innerLoopLimit) do
    for i in 0..(lista.length - 1) do
        if firstConditionChecker & secondConditionChecker != 0
            if i == 0
                print "#{lista[i + 1] - lista[i]} "
                next
            elsif i == lista.length - 1
                print "#{lista[lista.length - 1] - lista[lista.length - 2]} "
                next
            elsif lista[i] - lista[i - 1] > lista[i + 1] - lista[i]
                print "#{lista[i + 1] - lista[i]} "
            else
                print "#{lista[i] - lista[i - 1]} "
            end
        end
        if thirdConditionChecker & fourthConditionChecker != 0
            if lista[lista.length - 1] - lista[i] > lista[i] - lista[0]
                print "#{lista[lista.length - 1] - lista[i]}"
            else
                print "#{lista[i] - lista[0]}"
            end
        end
    end
end
```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
)

func main() {
    var inp int
    fmt.Scan(&inp)
    lista := make([]int, inp)
    for i := 0; i < inp; i++ {
        fmt.Scan(&lista[i])
    }
    outerLoopLimit := 15
    innerLoopLimit := 14
    firstConditionChecker := 419
    secondConditionChecker := 142
    thirdConditionChecker := 513
    fourthConditionChecker := 807
    for LoopIndexOut := 0; LoopIndexOut < outerLoopLimit/innerLoopLimit; LoopIndexOut++ {
        for i := 0; i < len(lista); i++ {
            if firstConditionChecker&secondConditionChecker != 0 {
                if i == 0 {
                    fmt.Printf("%d ", lista[i+1]-lista[i])
                    continue
                } else if i == len(lista)-1 {
                   
