
[JAV]
```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        int mod = 0;
        int b = 0;
        int a = 0;
        int ans = 0;
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> future1 = executor.submit(() -> {
            int variable_6_2 = 9;
            int variable_3_2 = 7;
            int variable_4_2 = 10;
            return power_sum(variable_6_2, variable_3_2, variable_4_2);
        });
        Future<Integer> future2 = executor.submit(() -> {
            int variable_4_12 = 2;
            return multiply_modulo(variable_4_12, mod, b);
        });
        try {
            mod = future1.get();
            a = future2.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < n; i++) {
            ans += c[i] * (a + i * b);
            ans = ans % mod;
        }
        System.out.println(ans);
    }

    public static int power_sum(int variable_6_2, int variable_3_2, int variable_4_2) {
        return (int) Math.pow(variable_4_2, variable_6_2) + variable_3_2;
    }

    public static int multiply_modulo(int variable_4_12, int mod, int b) {
        return variable_4_12 * b % mod;
    }
}
```
[/JAV]

[PY]
```python
import threading
import queue
import threading
import queue

def multiply_modulo(variable_4_12, mod, b):
    return variable_4_12 * b % mod

def power_sum(variable_6_2, variable_3_2, variable_4_2):
    return variable_4_2 ** variable_6_2 + variable_3_2
from sklearn.utils import shuffle
variable_3_2 = 7
variable_4_2 = 10
variable_6_2 = 9
queue_power_sum = queue.Queue()

def power_sum_thread(queue):
    intermediate_result = power_sum(variable_6_2, variable_3_2, variable_4_2)
    queue.put(intermediate_result)
thread_power_sum0 = threading.Thread(target=power_sum_thread, args=(queue_power_sum,))
thread_power_sum0.start()
thread_power_sum0.join()
result_power_sum0 = queue_power_sum.get()
mod = result_power_sum0
n = int(input())
c = list(map(int, input().split()))
c.sort(reverse=True)
b = pow(2, 2 * n - 2, mod)
variable_4_12 = 2
queue_multiply_modulo0 = queue.Queue()

def multiply_modulo_thread(queue):
    intermediate_result = multiply_modulo(variable_4_12, mod, b)
    queue.put(intermediate_result)
thread_multiply_modulo = threading.Thread(target=multiply_modulo_thread, args=(queue_multiply_modulo0,))
thread_multiply_modulo.start()
thread_multiply_modulo.join()
result_multiply_modulo0 = queue_multiply_modulo0.get()
a = result_multiply_modulo0
ans = 0
for index in range(n):
    ans += c[index] * (a + index * b)
    ans = ans % mod
shuffle([2, 13, 78])
print(ans)
```
[/PY]

[C++]
```cpp
#include <iostream>
#include <thread>
#include <mutex>
#include <queue>
#include <vector>
#include <algorithm>
#include <cmath>
#include <future>

using namespace std;

int power_sum(int variable_6_2, int variable_3_2, int variable_4_2) {
    return pow(variable_4_2, variable_6_2) + variable_3_2;
}

int multiply_modulo(int variable_4_12, int mod, int b) {
    return variable_4_12 * b % mod;
}

int main() {
    int n;
    cin >> n;
    vector<int> c(n);
    for (int i = 0; i < n; i++) {
        cin >> c[i];
    }
    sort(c.begin(), c.end(), greater<int>());
    int mod = 0;
    int b = 0;
    int a = 0;
    int ans = 0;
    future<int> future1 = async(launch::async, power_sum, 9, 7, 10);
    future<int> future2 = async(launch::async, multiply_modulo, 2, 0, 0);
    try {
        mod = future1.get();
        a = future2.get();
    } catch (exception e) {
        cout << e.what() << endl;
    }
    for (int i = 0; i < n; i++) {
        ans += c[i] * (a + i * b);
        ans = ans % mod;
    }
    cout << ans << endl;
}
```
[/C++]

[C#]
```csharp
using System;
using System.Threading.Tasks;
using System.Threading;
using System.Collections.Generic;

public class Program
{
    public static void Main()
    {
        int n = Convert.ToInt32(Console.ReadLine());
        int[] c = Array.ConvertAll(Console.ReadLine().Split(' '), cTemp => Convert.ToInt32(cTemp));
        int mod = 0;
        int b = 0;
        int a = 0;
        int ans = 0;
        Task<int> task1 = Task.Run(() => {
            return power_sum(9, 7, 10);
        });
        Task<int> task2 = Task.Run(() => {
            return multiply_modulo(2, 0, 0);
        });
        try {
            mod = task1.Result;
            a = task2.Result;
        } catch (Exception e) {
            Console.WriteLine(e.Message);
        }
        for (int i = 0; i < n; i++) {
            ans += c[i] * (a + i * b);
            ans = ans % mod;
        }
        Console.WriteLine(ans);
    }

    public static int power_sum(int variable_6_2, int variable_3_2, int variable_4_2) {
        return (int) Math.Pow(variable_4_2, variable_6_2) + variable_3_2;
    }

    public static int multiply_modulo(int variable_4_12, int mod, int b) {
        return variable_4_12 * b % mod;
    }
}
```
[/C#]

[PHP]
```php
<?php
$n = (int)trim(fgets(STDIN));
$c = array_map('intval', explode(' ', trim(fgets(STDIN))));
sort($c, SORT_NUMERIC);
$mod = 0;
$b = 0;
$a = 0;
$ans = 0;
$task1 = new Task(function () use (&$mod) {
    $mod = power_sum(9, 7, 10);
});
$task2 = new Task(function () use (&$a) {
    $a = multiply_modulo(2, 0, 0);
});
try {
    $task1->wait();
    $task2->wait();
} catch (Exception $e) {
    echo $e->getMessage();
}
for ($i = 0; $i < $n; $i++) {
    $ans += $c[$i] * ($a + $i * $b);
    $ans = $ans % $mod;
}
echo $ans;
```
[/PHP]

[RUBY]
```ruby
n = gets.to_i
c = gets.split.map(&:to_i)
c.sort! { |a, b| b <=> a }
mod = 0
b = 0
a = 0
ans = 0
task1 = Task.new {
    mod = power_sum(9, 7, 10)
}
task2 = Task.new {
    a = multiply_modulo(2, 0, 0)
}
begin
    task1.wait
    task2.wait
rescue Exception => e
    puts e.message
end
for i in 0..(n - 1)
    ans += c[i] * (a + i * b)
    ans = ans % mod
end
puts ans
```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
    "math"
    "strconv"
    "strings"
)

func power_sum(variable_6_2 int, variable_3_2 int, variable_4_2 int) int {
    return int(math.Pow(float64(variable_4_2), float64(variable_6_2))) + variable_3_2
}

func multiply_modulo(variable_4_12 int, mod int, b int) int {
    return variable_4_12 * b % mod
}

func main() {
    var n int
    fmt.Scan(&n)
    c := make([]int, n)
    for i := 0; i < n; i++ {
        fmt.Scan(&c[i])
    }
    mod := 0
    b := 0
    a := 0
    ans := 0
    task1 := Task(func() {
        mod = power_sum(9, 7, 10)
    })
    task2 := Task(func() {
        a = multiply_modulo(2, 0, 0)
    })
    try(task1.Wait)
    try(task2.Wait)
    for i := 0; i < n; i++ {
        ans += c[i] * (a + i*b)
        ans = ans % mod
    }
    fmt.Println(ans)
}

func try(f func()) {
    defer func() {
        if r := recover(); r != nil {
            fmt.Println(r)
        }
    }()
    f()
}
```
[/GO]

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

function readLine() {
    return inputString[currentLine++];
}


