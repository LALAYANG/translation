
[JAV]
```java
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
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
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        int threshold_a = 14;
        int threshold_b = 850;
        int od = 0;
        int sum = 0;
        int ok = 0;
        for (int i = 0; i < n; i++) {
            if (threshold_a & threshold_b) {
                if (lst[i] % 2 == 1) {
                    od++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else if (ok || od > 1) {
                sum += lst[i];
                od--;
                ok = !ok;
            }
        }
        System.out.println(sum);
    }
}
```
[/JAV]

[PY]
```python
import threading
import queue

def calculate_sum(od, increment_value):
    return od + increment_value
n = int(input())
lst = list(map(int, input().split()))
lst.sort()
lst.reverse()
od = 0
threshold_a = 14
threshold_b = 850
for i in lst:
    if threshold_a & threshold_b:
        if i & 1:
            increment_value = 1
            queue_calculate_sum0 = queue.Queue()

            def calculate_sum_thread(queue):
                result = calculate_sum(od, increment_value)
                queue.put(result)
            thread_calculate_sum0 = threading.Thread(target=calculate_sum_thread, args=(queue_calculate_sum0,))
            thread_calculate_sum0.start()
            thread_calculate_sum0.join()
            result_calculate_sum0 = queue_calculate_sum0.get()
            od = result_calculate_sum0
sum = 0
ok = 0

def process_list(i, stop, step):
    global sum, od, ok
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    if lst[i] % 2 == 0:
        sum += lst[i]
    elif ok or od > 1:
        sum += lst[i]
        od = od - 1
        ok = not ok
    process_list(i + step, stop, step)
process_list(0, n, 1)
print(sum)
```
[/PY]

[CPP]
```cpp
#include <iostream>
#include <thread>
#include <mutex>
#include <queue>
#include <vector>
#include <algorithm>

using namespace std;

int calculate_sum(int od, int increment_value) {
    return od + increment_value;
}

int main() {
    int n;
    cin >> n;
    vector<int> lst(n);
    for (int i = 0; i < n; i++) {
        cin >> lst[i];
    }
    sort(lst.begin(), lst.end());
    reverse(lst.begin(), lst.end());
    int od = 0;
    int threshold_a = 14;
    int threshold_b = 850;
    for (int i : lst) {
        if (threshold_a & threshold_b) {
            if (i & 1) {
                int increment_value = 1;
                queue<int> queue_calculate_sum0;

                auto calculate_sum_thread = [&](queue<int>& queue) {
                    int result = calculate_sum(od, increment_value);
                    queue.push(result);
                };
                thread thread_calculate_sum0(calculate_sum_thread, ref(queue_calculate_sum0));
                thread_calculate_sum0.join();
                od = queue_calculate_sum0.front();
                queue_calculate_sum0.pop();
            }
        }
    }
    int sum = 0;
    int ok = 0;
    for (int i : lst) {
        if (i % 2 == 0) {
            sum += i;
        } else if (ok || od > 1) {
            sum += i;
            od--;
            ok = !ok;
        }
    }
    cout << sum << endl;
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

int calculate_sum(int od, int increment_value) {
    return od + increment_value;
}

int main() {
    int n;
    scanf("%d", &n);
    int* lst = malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &lst[i]);
    }
    int od = 0;
    int threshold_a = 14;
    int threshold_b = 850;
    for (int i = 0; i < n; i++) {
        if (threshold_a & threshold_b) {
            if (lst[i] & 1) {
                int increment_value = 1;
                sem_t sem_calculate_sum0;
                sem_init(&sem_calculate_sum0, 0, 0);

                pthread_t thread_calculate_sum0;
                pthread_create(&thread_calculate_sum0, NULL, (void*)calculate_sum, (void*)&sem_calculate_sum0);
                sem_wait(&sem_calculate_sum0);
                od = sem_calculate_sum0;
                sem_destroy(&sem_calculate_sum0);
            }
        }
    }
    int sum = 0;
    int ok = 0;
    for (int i = 0; i < n; i++) {
        if (lst[i] % 2 == 0) {
            sum += lst[i];
        } else if (ok || od > 1) {
            sum += lst[i];
            od--;
            ok = !ok;
        }
    }
    printf("%d\n", sum);
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

func calculate_sum(od, increment_value int) int {
	return od + increment_value
}

func main() {
	var n int
	fmt.Scan(&n)
	lst := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&lst[i])
	}
	od := 0
	threshold_a := 14
	threshold_b := 850
	for _, i := range lst {
		if threshold_a&threshold_b != 0 {
			if i&1 != 0 {
				increment_value := 1
				var queue_calculate_sum0 chan int
				var wg sync.WaitGroup
				wg.Add(1)
				go func() {
					defer wg.Done()
					result := calculate_sum(od, increment_value)
					queue_calculate_sum0 <- result
				}()
				wg.Wait()
				od = <-queue_calculate_sum0
			}
		}
	}
	sum := 0
	ok := 0
	for _, i := range lst {
		if i%2 == 0 {
			sum += i
		} else if ok || od > 1 {
			sum += i
			ok = !ok
			od--
		}
	}
	fmt.Println(sum)
}
```
[/GO]

[RB]
```ruby
def calculate_sum(od, increment_value)
  od + increment_value
end

n = gets.to_i
lst = gets.split.map(&:to_i)
lst.sort!
lst.reverse!
od = 0
threshold_a = 14
threshold_b = 850
lst.each do |i|
  if threshold_a & threshold_b != 0
    if i & 1 != 0
      increment_value = 1
      queue_calculate_sum0 = Queue.new

      Thread.new do
        result = calculate_sum(od, increment_value)
        queue_calculate_sum0.push(result)
      end.join
      od = queue_calculate_sum0.pop
    end
  end
end
sum = 0
ok = 0
lst.each do |i|
  if i % 2 == 0
    sum += i
  elsif ok || od > 1
    sum += i
    ok = !ok
    od -= 1
  end
end
puts sum
```
[/RB]

[D]
```d
import std.stdio;
import core.thread;
import core.sync;

int calculate_sum(int od, int increment_value) {
    return od + increment_value;
}

void main() {
    int n;
    read(n);
    int[] lst;
    read(lst);
    lst.sort!(a > b);
    int od = 0;
    int threshold_a = 14;
    int threshold_b = 850;
    foreach (i; lst) {
        if (threshold_a & threshold_b != 0) {
            if (i & 1 != 0) {
                int increment_value = 1;
                Semaphore sem_calculate_sum0;
                sem_calculate_sum0 = new Semaphore(0);

                thread thread_calculate_sum0 = thread calculate_sum(sem_calculate_sum0);
                sem_calculate_sum0.wait();
                od = sem_calculate_sum0;
                sem_calculate_sum0.dispose();
            }
        }
    }
    int sum = 0;
    int ok = 0;
    foreach (i; lst) {
        if (i % 2 == 0) {
            sum += i;
        } else if (ok || od > 1) {
            sum += i;
            ok = !ok;
            od--;
        }
    }
    writefln("%d", sum);
}
```
[/D]

[PHP]
```php
<?php
function calculate_sum($od, $increment_value) {
    return $od + $increment_value;
}

$n = (int)trim(fgets(STDIN));
$lst = array_map('intval', explode(' ', trim(fgets(STDIN))));
sort($lst);
rsort($lst);
$od = 0;
$threshold_a = 14;
$threshold_b = 850;
foreach ($lst as $i) {
    if ($threshold_a & $threshold_b != 0) {
        if ($i & 1 != 0) {
            $increment_value = 1;
            $queue_calculate_sum0 = new SplQueue();

            $thread_calculate_sum0 = new class extends Thread {
                public function run() {
                    $result = calculate_sum($od, $increment_value);
                    $queue_calculate_sum0->enqueue($result);
                }
            };
            $thread_calculate_sum0->start();
            $thread_calculate_sum0->join();
            $od = $queue_calculate_sum0->dequeue();
        }
    }
}
$sum = 0;
$ok = 0;
foreach ($lst as $i) {
    if ($i % 2 == 0) {
        $sum += $i;
    } else if ($ok || $od > 1) {
        $sum += $i;
        $ok = !$ok;
        $od--;
    }
}
echo $sum . PHP_EOL;
```
[/PHP]

[CS]
```csharp
using System;
using System.Threading;

class Program
{
    static int calculate_sum(int od, int increment_value)
    {
        return od + increment_value;
    }

    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine());
        int[] lst = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
        Array.Sort(lst);
        Array.Reverse(lst);
        int od = 0;
        int threshold_a = 14;
        int threshold_b = 850;
        foreach (int i in lst)
        {
            if ((threshold_a & threshold_b) != 0)
            {
                if ((i & 1) != 0)
                {
                    int increment_value = 1;
                    Semaphore sem_calculate_sum0 = new Semaphore(0, 1);

                    Thread thread_calculate_sum0 = new Thread(() =>
                    {
                        int result = calculate_sum(od, increment_value);
                        sem_calculate_sum0.Release();
                    });
                    thread_calculate_sum0.Start();
                    sem_
