
[JAV]
```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] resultArray = new int[n];
        int mx = arr[n - 1];
        int conditionOne = 995;
        int conditionTwo = 398;
        int outerLoopCounter = 470;
        int innerLoopCounter = 469;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopCounter / innerLoopCounter; LoopIndexOut++) {
            for (int i = n - 2; i >= 0; i--) {
                resultArray[i] = Math.max(0, mx - arr[i] + 1);
                if ((conditionOne & conditionTwo) != 0) {
                    if (arr[i] > mx) {
                        mx = arr[i];
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
}
```
[/JAV]

[PYT]
```python
import threading
import queue

def calculateProduct(globalVar, n):
    return globalVar * n
n = int(input())
arr = list(map(int, input().strip().split()))[:n]
globalVar = [0]
resultQueue = queue.Queue()

def workerThreadFunction(queue):
    result = calculateProduct(globalVar, n)
    queue.put(result)
workerThread = threading.Thread(target=workerThreadFunction, args=(resultQueue,))
workerThread.start()
workerThread.join()
calculationResult = resultQueue.get()
resultArray = calculationResult
mx = arr[-1]
conditionOne = 995
conditionTwo = 398
outerLoopCounter = 470
innerLoopCounter = 469
for LoopIndexOut in range(outerLoopCounter // innerLoopCounter):
    for i in range(n - 2, -1, -1):
        resultArray[i] = max(0, mx - arr[i] + 1)
        if conditionOne & conditionTwo:
            if arr[i] > mx:
                mx = arr[i]
print(*resultArray)
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <thread>
#include <queue>

using namespace std;

int calculateProduct(int globalVar, int n) {
    return globalVar * n;
}

int main() {
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    int resultArray[n];
    int mx = arr[n - 1];
    int conditionOne = 995;
    int conditionTwo = 398;
    int outerLoopCounter = 470;
    int innerLoopCounter = 469;
    for (int LoopIndexOut = 0; LoopIndexOut < outerLoopCounter / innerLoopCounter; LoopIndexOut++) {
        for (int i = n - 2; i >= 0; i--) {
            resultArray[i] = max(0, mx - arr[i] + 1);
            if (conditionOne & conditionTwo) {
                if (arr[i] > mx) {
                    mx = arr[i];
                }
            }
        }
    }
    for (int i = 0; i < n; i++) {
        cout << resultArray[i] << " ";
    }
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>

int calculateProduct(int globalVar, int n) {
    return globalVar * n;
}

int main() {
    int n;
    scanf("%d", &n);
    int arr[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    int resultArray[n];
    int mx = arr[n - 1];
    int conditionOne = 995;
    int conditionTwo = 398;
    int outerLoopCounter = 470;
    int innerLoopCounter = 469;
    for (int LoopIndexOut = 0; LoopIndexOut < outerLoopCounter / innerLoopCounter; LoopIndexOut++) {
        for (int i = n - 2; i >= 0; i--) {
            resultArray[i] = max(0, mx - arr[i] + 1);
            if (conditionOne & conditionTwo) {
                if (arr[i] > mx) {
                    mx = arr[i];
                }
            }
        }
    }
    for (int i = 0; i < n; i++) {
        printf("%d ", resultArray[i]);
    }
}
```
[/C]

[GO]
```go
package main

import (
	"fmt"
)

func calculateProduct(globalVar, n int) int {
	return globalVar * n
}

func main() {
	var n int
	fmt.Scan(&n)
	arr := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&arr[i])
	}
	resultArray := make([]int, n)
	mx := arr[n-1]
	conditionOne := 995
	conditionTwo := 398
	outerLoopCounter := 470
	innerLoopCounter := 469
	for LoopIndexOut := 0; LoopIndexOut < outerLoopCounter/innerLoopCounter; LoopIndexOut++ {
		for i := n - 2; i >= 0; i-- {
			resultArray[i] = max(0, mx-arr[i]+1)
			if conditionOne&conditionTwo != 0 {
				if arr[i] > mx {
					mx = arr[i]
				}
			}
		}
	}
	for i := 0; i < n; i++ {
		fmt.Printf("%d ", resultArray[i])
	}
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
```
[/GO]

[PHP]
```php
<?php
function calculateProduct($globalVar, $n) {
    return $globalVar * $n;
}
$n = (int)trim(fgets(STDIN));
$arr = array_map('intval', explode(' ', trim(fgets(STDIN))));
$resultArray = array();
$mx = $arr[count($arr) - 1];
$conditionOne = 995;
$conditionTwo = 398;
$outerLoopCounter = 470;
$innerLoopCounter = 469;
for ($LoopIndexOut = 0; $LoopIndexOut < $outerLoopCounter / $innerLoopCounter; $LoopIndexOut++) {
    for ($i = count($arr) - 2; $i >= 0; $i--) {
        $resultArray[$i] = max(0, $mx - $arr[$i] + 1);
        if ($conditionOne & $conditionTwo) {
            if ($arr[$i] > $mx) {
                $mx = $arr[$i];
            }
        }
    }
}
foreach ($resultArray as $value) {
    echo $value . " ";
}
function max($a, $b) {
    if ($a > $b) {
        return $a;
    }
    return $b;
}
```
[/PHP]

[RUBY]
```ruby
def calculateProduct(globalVar, n)
    return globalVar * n
end
n = gets.to_i
arr = gets.split.map(&:to_i)
resultArray = Array.new(n)
mx = arr[n - 1]
conditionOne = 995
conditionTwo = 398
outerLoopCounter = 470
innerLoopCounter = 469
for LoopIndexOut in 0..(outerLoopCounter / innerLoopCounter)
    for i in (n - 2).downto(0)
        resultArray[i] = [0, mx - arr[i] + 1].max
        if (conditionOne & conditionTwo) != 0
            if arr[i] > mx
                mx = arr[i]
            end
        end
    end
end
puts resultArray.join(' ')
```
[/RUBY]

[CPP17]
```cpp
#include <iostream>
#include <thread>
#include <queue>

using namespace std;

int calculateProduct(int globalVar, int n) {
    return globalVar * n;
}

int main() {
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    int resultArray[n];
    int mx = arr[n - 1];
    int conditionOne = 995;
    int conditionTwo = 398;
    int outerLoopCounter = 470;
    int innerLoopCounter = 469;
    for (int LoopIndexOut = 0; LoopIndexOut < outerLoopCounter / innerLoopCounter; LoopIndexOut++) {
        for (int i = n - 2; i >= 0; i--) {
            resultArray[i] = max(0, mx - arr[i] + 1);
            if (conditionOne & conditionTwo) {
                if (arr[i] > mx) {
                    mx = arr[i];
                }
            }
        }
    }
    for (int i = 0; i < n; i++) {
        cout << resultArray[i] << " ";
    }
}
```
[/CPP17]

[CS]
```cs
using System;
using System.Threading;

public class Program
{
    public static void Main()
    {
        int n = Convert.ToInt32(Console.ReadLine());
        int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp));
        int[] resultArray = new int[n];
        int mx = arr[n - 1];
        int conditionOne = 995;
        int conditionTwo = 398;
        int outerLoopCounter = 470;
        int innerLoopCounter = 469;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopCounter / innerLoopCounter; LoopIndexOut++)
        {
            for (int i = n - 2; i >= 0; i--)
            {
                resultArray[i] = Math.Max(0, mx - arr[i] + 1);
                if ((conditionOne & conditionTwo) != 0)
                {
                    if (arr[i] > mx)
                    {
                        mx = arr[i];
                    }
                }
            }
        }
        for (int i = 0; i < n; i++)
        {
            Console.Write(resultArray[i] + " ");
        }
    }
}
```
[/CS]

[BASH]
```bash
read n
read -a arr
resultArray=()
mx=${arr[${#arr[@]}-1]}
conditionOne=995
conditionTwo=398
outerLoopCounter=470
innerLoopCounter=469
for ((LoopIndexOut = 0; LoopIndexOut < outerLoopCounter / innerLoopCounter; LoopIndexOut++)); do
    for ((i = ${#arr[@]}-2; i >= 0; i--)); do
        resultArray[i]=$((${resultArray[i]:-0} + ${mx} - ${arr[i]} + 1))
        if ((conditionOne & conditionTwo)); then
            if ((arr[i] > mx)); then
                mx=${arr[i]}
            fi
        fi
    done
done
for i in ${!resultArray[@]}; do
    echo ${resultArray[i]}
done
```
[/BASH]

[JAVASCRIPT]
```javascript
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });

    main();
});

function readline() {
    return inputString[currentLine++];
}

function main() {
    const n = parseInt(readline(), 10);
    const arr = readline().split(' ').map(arrTemp => parseInt(arrTemp, 10));
    const resultArray = [];
    let mx = arr[n - 1];
    const conditionOne = 995;
    const conditionTwo = 398;
    const outerLoopCounter = 470;
    const innerLoopCounter = 469;
    for (let LoopIndexOut = 0; LoopIndexOut < outerLoopCounter / innerLoopCounter; LoopIndexOut++) {
        for (let i = n - 2; i >= 0; i--) {
            resultArray[i] = Math.max(0, mx - arr[i] + 1);
            if (conditionOne & conditionTwo) {
                if (arr[i] > mx) {
                    mx = arr[i];
                }
            }
        }
    }
    console.log(resultArray.join(' '));
}
```
[/JAVASCRIPT]

[SWIFT]
```swift
import Foundation

func calculateProduct(_ globalVar: Int, _ n: Int) -> Int {
    return globalVar * n
}

let n = Int(readLine()!)!
let arr = readLine()!.split(separator: " ").map{ Int(String($0))! }
var resultArray = [Int]()
var mx = arr[n - 1
