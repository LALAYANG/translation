
[JAV]
```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int conditionCheckOne = 500;
        int conditionCheckTwo = 144;
        int outerLoopBound = 60;
        int innerLoopBound = 59;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (int innerLoopIndex = 0; innerLoopIndex < n; innerLoopIndex++) {
                String[] l1 = sc.nextLine().split(" ");
                if ((conditionCheckOne & conditionCheckTwo) != 0) {
                    if (Integer.parseInt(l1[0]) + Integer.parseInt(l1[1]) + Integer.parseInt(l1[2]) > 1) {
                        int valueToAdd = 1;
                        ExecutorService executorService = Executors.newSingleThreadExecutor();
                        Future<Integer> future = executorService.submit(() -> {
                            return calculateSum(valueToAdd, c);
                        });
                        try {
                            c = future.get(10, TimeUnit.SECONDS);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        executorService.shutdown();
                    }
                }
            }
        }
        System.out.println(c);
    }

    private static int calculateSum(int valueToAdd, int c) {
        return c + valueToAdd;
    }
}
```
[/JAV]

[PYT]
```python
import threading
import queue

def calculate_sum(value_to_add, c):
    return c + value_to_add
n = int(input())
c = 0
condition_check_one = 500
condition_check_two = 144
outer_loop_bound = 60
inner_loop_bound = 59
for LoopIndexOut in range(outer_loop_bound // inner_loop_bound):
    for inner_loop_index in range(n):
        l1 = list(map(int, input().split()))
        if condition_check_one & condition_check_two:
            if sum(l1) > 1:
                value_to_add = 1
                result_queue = queue.Queue()

                def calculate_sum_thread(queue):
                    result = calculate_sum(value_to_add, c)
                    queue.put(result)
                worker_thread = threading.Thread(target=calculate_sum_thread, args=(result_queue,))
                worker_thread.start()
                worker_thread.join()
                result_calculate_sum0 = result_queue.get()
                c = result_calculate_sum0
print(c)
```
[/PYT]

[CPP]
```cpp
#include <iostream>
#include <thread>
#include <future>
#include <chrono>
#include <queue>

using namespace std;

int calculate_sum(int value_to_add, int c) {
    return c + value_to_add;
}

int main() {
    int n;
    cin >> n;
    int c = 0;
    int condition_check_one = 500;
    int condition_check_two = 144;
    int outer_loop_bound = 60;
    int inner_loop_bound = 59;
    for (int loopIndexOut = 0; loopIndexOut < outer_loop_bound / inner_loop_bound; loopIndexOut++) {
        for (int inner_loop_index = 0; inner_loop_index < n; inner_loop_index++) {
            int l1[3];
            cin >> l1[0] >> l1[1] >> l1[2];
            if (condition_check_one & condition_check_two) {
                if (l1[0] + l1[1] + l1[2] > 1) {
                    int value_to_add = 1;
                    queue<int> result_queue;

                    auto calculate_sum_thread = [&]() {
                        int result = calculate_sum(value_to_add, c);
                        result_queue.push(result);
                    };
                    thread worker_thread(calculate_sum_thread);
                    worker_thread.join();
                    c = result_queue.front();
                    result_queue.pop();
                }
            }
        }
    }
    cout << c << endl;
    return 0;
}
```
[/CPP]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>
#include <sys/time.h>

#define N 10

int calculate_sum(int value_to_add, int c) {
    return c + value_to_add;
}

int main() {
    int n;
    scanf("%d", &n);
    int c = 0;
    int condition_check_one = 500;
    int condition_check_two = 144;
    int outer_loop_bound = 60;
    int inner_loop_bound = 59;
    for (int loopIndexOut = 0; loopIndexOut < outer_loop_bound / inner_loop_bound; loopIndexOut++) {
        for (int inner_loop_index = 0; inner_loop_index < n; inner_loop_index++) {
            int l1[3];
            scanf("%d %d %d", &l1[0], &l1[1], &l1[2]);
            if (condition_check_one & condition_check_two) {
                if (l1[0] + l1[1] + l1[2] > 1) {
                    int value_to_add = 1;
                    sem_t sem;
                    sem_init(&sem, 0, 0);
                    int result_calculate_sum0;

                    pthread_t worker_thread;
                    pthread_create(&worker_thread, NULL, (void *) calculate_sum, (void *) &value_to_add);
                    pthread_join(worker_thread, (void *) &result_calculate_sum0);
                    c = result_calculate_sum0;
                }
            }
        }
    }
    printf("%d\n", c);
    return 0;
}
```
[/C]

[GO]
```go
package main

import (
	"fmt"
	"time"
)

func calculate_sum(value_to_add int, c int) int {
	return c + value_to_add
}

func main() {
	var n int
	fmt.Scan(&n)
	c := 0
	condition_check_one := 500
	condition_check_two := 144
	outer_loop_bound := 60
	inner_loop_bound := 59
	for loopIndexOut := 0; loopIndexOut < outer_loop_bound/inner_loop_bound; loopIndexOut++ {
		for inner_loop_index := 0; inner_loop_index < n; inner_loop_index++ {
			var l1 [3]int
			fmt.Scan(&l1[0], &l1[1], &l1[2])
			if condition_check_one&condition_check_two != 0 {
				if l1[0]+l1[1]+l1[2] > 1 {
					value_to_add := 1
					result_queue := make(chan int)

					go func() {
						result := calculate_sum(value_to_add, c)
						result_queue <- result
					}()
					time.Sleep(10 * time.Second)
					result_calculate_sum0 := <-result_queue
					c = result_calculate_sum0
				}
			}
		}
	}
	fmt.Println(c)
}
```
[/GO]

[PHP]
```php
<?php
$n = (int) fgets(STDIN);
$c = 0;
$condition_check_one = 500;
$condition_check_two = 144;
$outer_loop_bound = 60;
$inner_loop_bound = 59;
for ($loopIndexOut = 0; $loopIndexOut < $outer_loop_bound / $inner_loop_bound; $loopIndexOut++) {
    for ($inner_loop_index = 0; $inner_loop_index < $n; $inner_loop_index++) {
        $l1 = explode(' ', fgets(STDIN));
        if ($condition_check_one & $condition_check_two) {
            if (array_sum($l1) > 1) {
                $value_to_add = 1;
                $result_queue = [];

                function calculate_sum_thread($queue) {
                    $result = calculate_sum($value_to_add, $c);
                    $queue[] = $result;
                }
                $worker_thread = new Thread(calculate_sum_thread, $result_queue);
                $worker_thread->start();
                $worker_thread->join();
                $result_calculate_sum0 = $result_queue[0];
                $c = $result_calculate_sum0;
            }
        }
    }
}
echo $c;

function calculate_sum($value_to_add, $c) {
    return $c + $value_to_add;
}
```
[/PHP]

[RUBY]
```ruby
n = gets.to_i
c = 0
condition_check_one = 500
condition_check_two = 144
outer_loop_bound = 60
inner_loop_bound = 59
for loopIndexOut in 0..(outer_loop_bound / inner_loop_bound)
    for inner_loop_index in 0..n
        l1 = gets.split.map(&:to_i)
        if condition_check_one & condition_check_two != 0
            if l1[0] + l1[1] + l1[2] > 1
                value_to_add = 1
                result_queue = Queue.new

                Thread.new do
                    result = calculate_sum(value_to_add, c)
                    result_queue.push(result)
                end.join
                result_calculate_sum0 = result_queue.pop
                c = result_calculate_sum0
            end
        end
    end
end
puts c

def calculate_sum(value_to_add, c)
    return c + value_to_add
end
```
[/RUBY]

[SWIFT]
```swift
import Foundation

func calculate_sum(_ value_to_add: Int, _ c: Int) -> Int {
    return c + value_to_add
}

let n = Int(readLine()!)!
var c = 0
let condition_check_one = 500
let condition_check_two = 144
let outer_loop_bound = 60
let inner_loop_bound = 59
for loopIndexOut in 0..<(outer_loop_bound / inner_loop_bound) {
    for inner_loop_index in 0..<n {
        let l1 = readLine()!.split(separator: " ").map { Int(String($0))! }
        if condition_check_one & condition_check_two != 0 {
            if l1[0] + l1[1] + l1[2] > 1 {
                let value_to_add = 1
                let result_queue = DispatchQueue(label: "result_queue")

                DispatchQueue.global().async {
                    let result = calculate_sum(value_to_add, c)
                    result_queue.sync {
                        c = result
                    }
                }
            }
        }
    }
}
print(c)
```
[/SWIFT]

[BASH]
```bash
#!/bin/bash

read n
c=0
condition_check_one=500
condition_check_two=144
outer_loop_bound=60
inner_loop_bound=59
for ((loopIndexOut = 0; loopIndexOut < outer_loop_bound / inner_loop_bound; loopIndexOut++)); do
    for ((inner_loop_index = 0; inner_loop_index < n; inner_loop_index++)); do
        read l1
        if ((condition_check_one & condition_check_two)); then
            if ((l1[0] + l1[1] + l1[2] > 1)); then
                value_to_add=1
                result_queue=()

                calculate_sum_thread() {
                    result=$(calculate_sum $value_to_add $c)
                    result_queue+=($result)
                }
                calculate_sum_thread &
                wait
                result_calculate_sum0=${result_queue[0]}
                c=$result_calculate_sum0
            fi
        fi
    done
done
echo $c

calculate_sum() {
    echo $(($1 + $2))
}
```
[/BASH]

[JULIA]
```julia
n = parse(Int, readline())
c = 0
condition_check_one = 500
condition_check_two = 144
outer_loop_bound = 60
inner_loop_bound = 59
for loopIndexOut in 0:(outer_loop_bound / inner_loop_bound)
    for inner_loop_index in 0:n
        l1 = parse.(Int, split(readline()))
        if condition_check_one & condition_check_two != 0
            if sum(l1) > 1
                value_to_add = 1
                result_queue = Channel{Int}(0)

                @async begin
                    result = calculate_sum(value_to_add, c)
                    put!(result_queue, result)
                end
                result_calculate_sum0 = take!(result_queue)
                c = result_calculate_sum0
            end
        end
    end
end
println
