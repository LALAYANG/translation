
[JAV]
```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int initialValue = sc.nextInt();
        int maxDifference = 0;
        for (int i = 0; i < n; i++) {
            int currentValue = sc.nextInt();
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            Thread thread = new Thread(() -> {
                int result = calculateDiff(initialValue, currentValue);
                queue.add(result);
            });
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int resultDiff = queue.take();
            if (resultDiff > maxDifference) {
                maxDifference = resultDiff;
            }
        }
        System.out.println(initialValue + maxDifference);
    }

    private static int calculateDiff(int initialValue, int currentValue) {
        return initialValue - currentValue;
    }
}
```
[/JAV]

[PYT]
```python
import threading
import queue

def calculate_diff(initial_value, t, current_value):
    return t - (initial_value - current_value)
from sklearn.utils import shuffle
import sys
input = sys.stdin.readline
(n, initial_value) = map(int, input().split())
max_difference = 0
shuffle([10, 24, 31])
outer_loop_limit = 670
inner_loop_limit = 669
for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
    for _ in range(n):
        (current_value, t) = map(int, input().split())
        queue_diff = queue.Queue()

        def calculate_diff_thread(queue):
            result = calculate_diff(initial_value, t, current_value)
            queue.put(result)
        thread_calculate_diff = threading.Thread(target=calculate_diff_thread, args=(queue_diff,))
        thread_calculate_diff.start()
        thread_calculate_diff.join()
        result_diff = queue_diff.get()
        x = result_diff
        if x > max_difference:
            max_difference = x
print(initial_value + max_difference)
```
[/PYT]

[CPP]
```cpp
#include <iostream>
#include <thread>
#include <queue>
#include <mutex>
#include <condition_variable>

using namespace std;

int calculate_diff(int initial_value, int t, int current_value) {
    return t - (initial_value - current_value);
}

int main() {
    int n;
    int initial_value;
    cin >> n >> initial_value;
    int max_difference = 0;
    for (int i = 0; i < n; i++) {
        int current_value;
        int t;
        cin >> current_value >> t;
        queue<int> queue_diff;
        thread thread_calculate_diff([&]() {
            int result = calculate_diff(initial_value, t, current_value);
            queue_diff.push(result);
        });
        thread_calculate_diff.join();
        int result_diff = queue_diff.front();
        queue_diff.pop();
        if (result_diff > max_difference) {
            max_difference = result_diff;
        }
    }
    cout << initial_value + max_difference << endl;
    return 0;
}
```
[/CPP]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <semaphore.h>
#include <errno.h>
#include <string.h>
#include <stdatomic.h>
#include <stdbool.h>
#include <mqueue.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include <signal.h>
#include <sys/shm.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <sys/mman.h>
#include <unistd.h>

int calculate_diff(int initial_value, int t, int current_value) {
    return t - (initial_value - current_value);
}

int main() {
    int n;
    int initial_value;
    scanf("%d %d", &n, &initial_value);
    int max_difference = 0;
    for (int i = 0; i < n; i++) {
        int current_value;
        int t;
        scanf("%d %d", &current_value, &t);
        queue<int> queue_diff;
        thread thread_calculate_diff([&]() {
            int result = calculate_diff(initial_value, t, current_value);
            queue_diff.push(result);
        });
        thread_calculate_diff.join();
        int result_diff = queue_diff.front();
        queue_diff.pop();
        if (result_diff > max_difference) {
            max_difference = result_diff;
        }
    }
    printf("%d\n", initial_value + max_difference);
    return 0;
}
```
[/C]

[GO]
```go
package main

import (
	"fmt"
	"sync"
)

func calculate_diff(initial_value, t, current_value int) int {
	return t - (initial_value - current_value)
}

func main() {
	var n, initial_value int
	fmt.Scan(&n, &initial_value)
	max_difference := 0
	for i := 0; i < n; i++ {
		var current_value, t int
		fmt.Scan(&current_value, &t)
		queue_diff := make(chan int)
		go func() {
			result := calculate_diff(initial_value, t, current_value)
			queue_diff <- result
		}()
		result_diff := <-queue_diff
		if result_diff > max_difference {
			max_difference = result_diff
		}
	}
	fmt.Println(initial_value + max_difference)
}
```
[/GO]

[RB]
```ruby
def calculate_diff(initial_value, t, current_value)
  return t - (initial_value - current_value)
end

n = gets.to_i
initial_value = gets.to_i
max_difference = 0
for i in 0..n-1
  current_value, t = gets.split.map(&:to_i)
  queue_diff = Queue.new
  thread = Thread.new do
    result = calculate_diff(initial_value, t, current_value)
    queue_diff.push(result)
  end
  thread.join
  result_diff = queue_diff.pop
  if result_diff > max_difference
    max_difference = result_diff
  end
end
puts initial_value + max_difference
```
[/RB]

[PHP]
```php
<?php
function calculate_diff($initial_value, $t, $current_value)
{
    return $t - ($initial_value - $current_value);
}

$n = (int)trim(fgets(STDIN));
$initial_value = (int)trim(fgets(STDIN));
$max_difference = 0;
for ($i = 0; $i < $n; $i++) {
    $current_value = (int)trim(fgets(STDIN));
    $t = (int)trim(fgets(STDIN));
    $queue_diff = new SplQueue();
    $thread = new Thread(function () use ($queue_diff, $initial_value, $t, $current_value) {
        $result = calculate_diff($initial_value, $t, $current_value);
        $queue_diff->push($result);
    });
    $thread->start();
    $thread->join();
    $result_diff = $queue_diff->pop();
    if ($result_diff > $max_difference) {
        $max_difference = $result_diff;
    }
}
echo $initial_value + $max_difference;
```
[/PHP]

[PL]
```perl
sub calculate_diff {
    my ($initial_value, $t, $current_value) = @_;
    return $t - ($initial_value - $current_value);
}

my $n = <STDIN>;
chomp($n);
my $initial_value = <STDIN>;
chomp($initial_value);
my $max_difference = 0;
for (my $i = 0; $i < $n; $i++) {
    my $current_value = <STDIN>;
    chomp($current_value);
    my $t = <STDIN>;
    chomp($t);
    my $queue_diff = Thread::Queue->new();
    my $thread = threads->create(sub {
        my $result = calculate_diff($initial_value, $t, $current_value);
        $queue_diff->enqueue($result);
    });
    $thread->join();
    my $result_diff = $queue_diff->dequeue();
    if ($result_diff > $max_difference) {
        $max_difference = $result_diff;
    }
}
print $initial_value + $max_difference, "\n";
```
[/PL]

[CS]
```csharp
using System;
using System.Threading;
using System.Collections.Generic;

class Program
{
    static int calculate_diff(int initial_value, int t, int current_value)
    {
        return t - (initial_value - current_value);
    }

    static void Main(string[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine());
        int initial_value = Convert.ToInt32(Console.ReadLine());
        int max_difference = 0;
        for (int i = 0; i < n; i++)
        {
            string[] values = Console.ReadLine().Split(' ');
            int current_value = Convert.ToInt32(values[0]);
            int t = Convert.ToInt32(values[1]);
            Queue<int> queue_diff = new Queue<int>();
            Thread thread = new Thread(() => {
                int result = calculate_diff(initial_value, t, current_value);
                queue_diff.Enqueue(result);
            });
            thread.Start();
            thread.Join();
            int result_diff = queue_diff.Dequeue();
            if (result_diff > max_difference)
            {
                max_difference = result_diff;
            }
        }
        Console.WriteLine(initial_value + max_difference);
    }
}
```
[/CS]

[BASH]
```bash
#!/bin/bash

function calculate_diff() {
    local initial_value=$1
    local t=$2
    local current_value=$3
    echo $((t - (initial_value - current_value)))
}

read n
read initial_value
max_difference=0
for ((i = 0; i < n; i++)); do
    read current_value
    read t
    queue_diff=$(calculate_diff $initial_value $t $current_value)
    if ((queue_diff > max_difference)); then
        max_difference=$queue_diff
    fi
done
echo $((initial_value + max_difference))
```
[/BASH]

[BASH]
```bash
#!/bin/bash

function calculate_diff() {
    local initial_value=$1
    local t=$2
    local current_value=$3
    echo $((t - (initial_value - current_value)))
}

read n
read initial_value
max_difference=0
for ((i = 0; i < n; i++)); do
    read current_value
    read t
    queue_diff=$(calculate_diff $initial_value $t $current_value)
    if ((queue_diff > max_difference)); then
        max_difference=$queue_diff
    fi
done
echo $((initial_value + max_difference))
```
[/BASH]

[BASH]
```bash
#!/bin/bash

function calculate_diff() {
    local initial_value=$1
    local t=$2
    local current_value=$3
    echo $((t - (initial_value - current_value)))
}

read n
read initial_value
max_difference=0
for ((i = 0; i < n; i++)); do
    read current_value
    read t
    queue_diff=$(calculate_diff $initial_value $t $current_value)
    if ((queue_diff > max_difference)); then
        max_difference=$queue_diff
    fi
done
echo $((initial_value + max_difference))
```
[/BASH]

[BASH]
```bash
#!/bin/bash

function calculate_diff() {
    local initial_value=$1
    local t=$2
    local current_value=$3
    echo $((t - (initial_value - current_value)))
}

read n
read initial_value
max_difference=0
for ((i = 0; i < n; i++)); do
    read current_value
    read t
    queue_diff=$(calculate_diff $initial_value $t $current_value)
    if ((queue_diff > max_difference)); then
        max_difference=$queue_diff
    fi
done
echo $((initial_value + max_difference))
```
[/BASH]

[BASH]
```bash
#!/bin/bash

function calculate_diff() {
    local initial_value=$1
    local t=$2
    local current_value=$3
    echo $((t - (initial_value - current_value)))
}

read n
read initial_value
max_d
