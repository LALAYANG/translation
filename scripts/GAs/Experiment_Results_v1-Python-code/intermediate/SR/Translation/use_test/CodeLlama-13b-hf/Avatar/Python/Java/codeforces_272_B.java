
[JAV]
```java
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        System.out.println(nPairsWithCommonFX(sequence));
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        int[] FXs = new int[sequence.length];
        int[][] storage = new int[sequence.length][];
        int conditionalCheckOne = 725;
        int conditionalCheckThree = 549;
        int conditionalCheckTwo = 135;
        int conditionalCheckFour = 718;
        for (int i = 0; i < sequence.length; i++) {
            int value = sequence[i];
            int y = f(value);
            if (conditionalCheckTwo & conditionalCheckFour) {
                if (conditionalCheckOne & conditionalCheckThree) {
                    if (y < 0 || y >= storage.length) {
                        continue;
                    }
                    if (storage[y] == null) {
                        storage[y] = new int[]{value};
                        FXs[i] = y;
                    } else {
                        storage[y] = storage[y].concat(new int[]{value});
                    }
                }
            }
        }
        int result = 0;
        for (int i = 0; i < FXs.length; i++) {
            if (FXs[i] < 0 || FXs[i] >= storage.length) {
                continue;
            }
            result += storage[FXs[i]].length * (storage[FXs[i]].length - 1);
        }
        return result / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y = y + 1;
            }
            n = n / 2;
        }
        return y;
    }
}
```
[/JAV]

[PYT]
```python
import sys

def mainFunction():
    input()
    return nPairsWithCommonFX(map(int, input().split()))

def nPairsWithCommonFX(sequence):
    storage = {}
    FXs = []
    conditionalCheckOne = 725
    conditionalCheckThree = 549
    conditionalCheckTwo = 135
    conditionalCheckFour = 718
    for value in sequence:
        queue_f0 = queue.Queue()

        def f_thread(queue):
            result = f(value)
            queue.put(result)
        thread_f0 = threading.Thread(target=f_thread, args=(queue_f0,))
        thread_f0.start()
        thread_f0.join()
        result_f0 = queue_f0.get()
        y = result_f0
        if conditionalCheckTwo & conditionalCheckFour:
            if conditionalCheckOne & conditionalCheckThree:
                if y not in storage:
                    storage[y] = [value]
                    FXs.append(y)
                else:
                    storage[y].append(value)
    return (sum((len(storage[y]) * len(storage[y]) for y in FXs)) - sum((len(storage[y]) for y in FXs))) // 2

def f(n):
    y = 1
    while n != 1:
        if n % 2:
            y = y + 1
        n = n // 2
    return y
if __name__ == '__main__':
    print(mainFunction())
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <vector>
#include <algorithm>
#include <numeric>
#include <functional>
#include <iterator>
#include <cmath>
#include <map>
#include <unordered_map>
#include <set>
#include <unordered_set>
#include <queue>
#include <utility>
#include <sstream>
#include <string>
#include <list>
#include <limits>
#include <stack>
#include <cctype>
#include <cstdio>
#include <cstring>
#include <cstdlib>
#include <ctime>
#include <climits>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> sequence(n);
    for (int i = 0; i < n; i++) {
        cin >> sequence[i];
    }
    cout << nPairsWithCommonFX(sequence);
}

int nPairsWithCommonFX(vector<int> sequence) {
    vector<int> FXs(sequence.size());
    vector<vector<int>> storage(sequence.size());
    int conditionalCheckOne = 725;
    int conditionalCheckThree = 549;
    int conditionalCheckTwo = 135;
    int conditionalCheckFour = 718;
    for (int i = 0; i < sequence.size(); i++) {
        int value = sequence[i];
        int y = f(value);
        if (conditionalCheckTwo & conditionalCheckFour) {
            if (conditionalCheckOne & conditionalCheckThree) {
                if (y < 0 || y >= storage.size()) {
                    continue;
                }
                if (storage[y].empty()) {
                    storage[y].push_back(value);
                    FXs[i] = y;
                } else {
                    storage[y].push_back(value);
                }
            }
        }
    }
    int result = 0;
    for (int i = 0; i < FXs.size(); i++) {
        if (FXs[i] < 0 || FXs[i] >= storage.size()) {
            continue;
        }
        result += storage[FXs[i]].size() * (storage[FXs[i]].size() - 1);
    }
    return result / 2;
}

int f(int n) {
    int y = 1;
    while (n != 1) {
        if (n % 2 != 0) {
            y = y + 1;
        }
        n = n / 2;
    }
    return y;
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <stdbool.h>

int main() {
    int n;
    scanf("%d", &n);
    int* sequence = malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &sequence[i]);
    }
    printf("%d", nPairsWithCommonFX(sequence, n));
}

int nPairsWithCommonFX(int* sequence, int n) {
    int* FXs = malloc(sizeof(int) * n);
    int** storage = malloc(sizeof(int*) * n);
    int conditionalCheckOne = 725;
    int conditionalCheckThree = 549;
    int conditionalCheckTwo = 135;
    int conditionalCheckFour = 718;
    for (int i = 0; i < n; i++) {
        int value = sequence[i];
        int y = f(value);
        if (conditionalCheckTwo & conditionalCheckFour) {
            if (conditionalCheckOne & conditionalCheckThree) {
                if (y < 0 || y >= n) {
                    continue;
                }
                if (storage[y] == NULL) {
                    storage[y] = malloc(sizeof(int) * 1);
                    storage[y][0] = value;
                    FXs[i] = y;
                } else {
                    int* newStorage = realloc(storage[y], sizeof(int) * (storage[y][0] + 1));
                    newStorage[storage[y][0]] = value;
                    storage[y] = newStorage;
                }
            }
        }
    }
    int result = 0;
    for (int i = 0; i < n; i++) {
        if (FXs[i] < 0 || FXs[i] >= n) {
            continue;
        }
        result += storage[FXs[i]][0] * (storage[FXs[i]][0] - 1);
    }
    return result / 2;
}

int f(int n) {
    int y = 1;
    while (n != 1) {
        if (n % 2 != 0) {
            y = y + 1;
        }
        n = n / 2;
    }
    return y;
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
    "strconv"
    "strings"
)

func main() {
    var n int
    fmt.Scan(&n)
    sequence := make([]int, n)
    for i := 0; i < n; i++ {
        fmt.Scan(&sequence[i])
    }
    fmt.Println(nPairsWithCommonFX(sequence))
}

func nPairsWithCommonFX(sequence []int) int {
    FXs := make([]int, len(sequence))
    storage := make([][]int, len(sequence))
    conditionalCheckOne := 725
    conditionalCheckThree := 549
    conditionalCheckTwo := 135
    conditionalCheckFour := 718
    for i := 0; i < len(sequence); i++ {
        value := sequence[i]
        y := f(value)
        if conditionalCheckTwo&conditionalCheckFour != 0 {
            if conditionalCheckOne&conditionalCheckThree != 0 {
                if y < 0 || y >= len(storage) {
                    continue
                }
                if storage[y] == nil {
                    storage[y] = []int{value}
                    FXs[i] = y
                } else {
                    storage[y] = append(storage[y], value)
                }
            }
        }
    }
    result := 0
    for i := 0; i < len(FXs); i++ {
        if FXs[i] < 0 || FXs[i] >= len(storage) {
            continue
        }
        result += len(storage[FXs[i]]) * (len(storage[FXs[i]]) - 1)
    }
    return result / 2
}

func f(n int) int {
    y := 1
    for n != 1 {
        if n%2 != 0 {
            y = y + 1
        }
        n = n / 2
    }
    return y
}
```
[/GO]

[RB]
```ruby
def mainFunction()
    input = gets.to_i
    sequence = gets.split.map(&:to_i)
    return nPairsWithCommonFX(sequence)
end

def nPairsWithCommonFX(sequence)
    storage = {}
    FXs = []
    conditionalCheckOne = 725
    conditionalCheckThree = 549
    conditionalCheckTwo = 135
    conditionalCheckFour = 718
    sequence.each do |value|
        y = f(value)
        if conditionalCheckTwo & conditionalCheckFour != 0
            if conditionalCheckOne & conditionalCheckThree != 0
                if y < 0 || y >= storage.length
                    next
                end
                if storage[y].nil?
                    storage[y] = [value]
                    FXs.push(y)
                else
                    storage[y].push(value)
                end
            end
        end
    end
    result = 0
    FXs.each do |y|
        if y < 0 || y >= storage.length
            next
        end
        result += storage[y].length * (storage[y].length - 1)
    end
    return result / 2
end

def f(n)
    y = 1
    while n != 1
        if n % 2 != 0
            y = y + 1
        end
        n = n / 2
    end
    return y
end

puts mainFunction()
```
[/RB]

[PHP]
```php
<?php
function mainFunction() {
    $input = (int)trim(fgets(STDIN));
    $sequence = explode(' ', trim(fgets(STDIN)));
    return nPairsWithCommonFX($sequence);
}

function nPairsWithCommonFX($sequence) {
    $storage = [];
    $FXs = [];
    $conditionalCheckOne = 725;
    $conditionalCheckThree = 549;
    $conditionalCheckTwo = 135;
    $conditionalCheckFour = 718;
    foreach ($sequence as $value) {
        $y = f($value);
        if ($conditionalCheckTwo & $conditionalCheckFour) {
            if ($conditionalCheckOne & $conditionalCheckThree) {
                if ($y < 0 || $y >= count($storage)) {
                    continue;
                }
                if (!isset($storage[$y])) {
                    $storage[$y] = [$value];
                    $FXs[] = $y;
                } else {
                    $storage[$y][] = $value;
                }
            }
        }
    }
    $result = 0;
    foreach ($FXs as $y) {
        if ($y < 0 || $y
