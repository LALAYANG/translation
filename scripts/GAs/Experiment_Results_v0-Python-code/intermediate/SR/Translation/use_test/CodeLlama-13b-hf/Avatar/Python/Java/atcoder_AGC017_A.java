
[JAV]
```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int one = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 1) {
                one++;
            } else {
                zero++;
            }
        }
        long pattern_a = 0;
        long pattern_b = 0;
        for (int j = 0; j <= zero; j++) {
            pattern_b += combi(zero, j);
        }
        long time = 0;
        long counter1 = 432;
        long counter2 = 431;
        while (counter1 % counter2 == 1) {
            long variable_3_27 = 1;
            LinkedBlockingQueue<Long> queue_sum_values0 = new LinkedBlockingQueue<>();

            class sum_values_thread implements Runnable {
                LinkedBlockingQueue<Long> queue;

                public sum_values_thread(LinkedBlockingQueue<Long> queue) {
                    this.queue = queue;
                }

                public void run() {
                    long result = sum_values(counter1, variable_3_27);
                    try {
                        queue.put(result);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            Future<Long> future = threadPoolExecutor.submit(new sum_values_thread(queue_sum_values0));
            try {
                counter1 = queue_sum_values0.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (time <= one) {
                if (time % 2 == P) {
                    pattern_a += combi(one, time);
                }
                time++;
            }
            System.out.println(pattern_a * pattern_b);
        }
    }

    public static long combi(int N, int K) {
        long a = 1;
        for (int i = 0; i < K; i++) {
            a *= N - i;
        }
        for (int j = 0; j < K; j++) {
            a /= j + 1;
        }
        return a;
    }

    public static long sum_values(long counter1, long variable_3_27) {
        return counter1 + variable_3_27;
    }
}
```
[/JAV]

[PYT]
```python
import threading
import queue

def sum_values(counter1, variable_3_27):
    return counter1 + variable_3_27
from scipy.stats import ttest_ind
(N, P) = map(int, input().split())

def combi(N, K):
    a = 1
    for i in range(K):
        a *= N - i
    for j in range(K):
        a /= j + 1
    ttest_ind([17, 49, 16], [93, 70, 93])
    return a
result = 0
lis = list(map(int, input().split()))
ls = []
for a in lis:
    ls.append(a % 2)
one = ls.count(1)
zero = ls.count(0)
pattern_a = 0
pattern_b = 0
for j in range(zero + 1):
    pattern_b += combi(zero, j)
time = 0
counter1 = 432
counter2 = 431
while counter1 % counter2 == 1:
    variable_3_27 = 1
    queue_sum_values0 = queue.Queue()

    def sum_values_thread(queue):
        result = sum_values(counter1, variable_3_27)
        queue.put(result)
    thread_sum_values0 = threading.Thread(target=sum_values_thread, args=(queue_sum_values0,))
    thread_sum_values0.start()
    thread_sum_values0.join()
    result_sum_values0 = queue_sum_values0.get()
    counter1 = result_sum_values0
    while time <= one:
        if time % 2 == P:
            pattern_a += combi(one, time)
        time = time + 1
print(int(pattern_a * pattern_b))
```
[/PYT]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int N, P;
    cin >> N >> P;
    int arr[N];
    for (int i = 0; i < N; i++) {
        cin >> arr[i];
    }
    int one = 0;
    int zero = 0;
    for (int i = 0; i < N; i++) {
        if (arr[i] == 1) {
            one++;
        } else {
            zero++;
        }
    }
    long long pattern_a = 0;
    long long pattern_b = 0;
    for (int j = 0; j <= zero; j++) {
        pattern_b += combi(zero, j);
    }
    long long time = 0;
    long long counter1 = 432;
    long long counter2 = 431;
    while (counter1 % counter2 == 1) {
        long long variable_3_27 = 1;
        queue<long long> queue_sum_values0;

        class sum_values_thread : public thread {
            queue<long long> *queue;

        public:
            sum_values_thread(queue<long long> *queue) {
                this->queue = queue;
            }

            void run() {
                long long result = sum_values(counter1, variable_3_27);
                queue->push(result);
            }
        };
        sum_values_thread thread_sum_values0(&queue_sum_values0);
        thread_sum_values0.join();
        counter1 = queue_sum_values0.front();
        queue_sum_values0.pop();
        while (time <= one) {
            if (time % 2 == P) {
                pattern_a += combi(one, time);
            }
            time++;
        }
        cout << pattern_a * pattern_b << endl;
    }
}

long long combi(int N, int K) {
    long long a = 1;
    for (int i = 0; i < K; i++) {
        a *= N - i;
    }
    for (int j = 0; j < K; j++) {
        a /= j + 1;
    }
    return a;
}

long long sum_values(long long counter1, long long variable_3_27) {
    return counter1 + variable_3_27;
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>

int N, P;
int arr[100000];
int one = 0;
int zero = 0;
long long pattern_a = 0;
long long pattern_b = 0;
long long time = 0;
long long counter1 = 432;
long long counter2 = 431;

void *sum_values(void *arg) {
    long long variable_3_27 = 1;
    long long result = sum_values(counter1, variable_3_27);
    return (void *) result;
}

long long combi(int N, int K) {
    long long a = 1;
    for (int i = 0; i < K; i++) {
        a *= N - i;
    }
    for (int j = 0; j < K; j++) {
        a /= j + 1;
    }
    return a;
}

long long sum_values(long long counter1, long long variable_3_27) {
    return counter1 + variable_3_27;
}

int main() {
    scanf("%d %d", &N, &P);
    for (int i = 0; i < N; i++) {
        scanf("%d", &arr[i]);
    }
    for (int i = 0; i < N; i++) {
        if (arr[i] == 1) {
            one++;
        } else {
            zero++;
        }
    }
    for (int j = 0; j <= zero; j++) {
        pattern_b += combi(zero, j);
    }
    while (counter1 % counter2 == 1) {
        long long variable_3_27 = 1;
        pthread_t thread_sum_values0;
        pthread_create(&thread_sum_values0, NULL, sum_values, NULL);
        pthread_join(thread_sum_values0, NULL);
        counter1 = (long long) thread_sum_values0;
        while (time <= one) {
            if (time % 2 == P) {
                pattern_a += combi(one, time);
            }
            time++;
        }
        printf("%lld\n", pattern_a * pattern_b);
    }
}
```
[/C]

[PHP]
```php
<?php
$N = intval(fgets(STDIN));
$P = intval(fgets(STDIN));
$arr = array_map('intval', explode(' ', fgets(STDIN)));
$one = 0;
$zero = 0;
$pattern_a = 0;
$pattern_b = 0;
for ($j = 0; $j <= $zero; $j++) {
    $pattern_b += combi($zero, $j);
}
$time = 0;
$counter1 = 432;
$counter2 = 431;
while ($counter1 % $counter2 == 1) {
    $variable_3_27 = 1;
    $queue_sum_values0 = new SplQueue();

    function sum_values_thread($queue) {
        $result = sum_values($counter1, $variable_3_27);
        $queue->enqueue($result);
    }
    $thread_sum_values0 = new Thread(function () use ($queue_sum_values0) {
        sum_values_thread($queue_sum_values0);
    });
    $thread_sum_values0->start();
    $thread_sum_values0->join();
    $result_sum_values0 = $queue_sum_values0->dequeue();
    $counter1 = $result_sum_values0;
    while ($time <= $one) {
        if ($time % 2 == $P) {
            $pattern_a += combi($one, $time);
        }
        $time++;
    }
    echo intval($pattern_a * $pattern_b) . PHP_EOL;
}
```
[/PHP]

[RUBY]
```ruby
N, P = gets.split.map(&:to_i)
arr = gets.split.map(&:to_i)
one = 0
zero = 0
pattern_a = 0
pattern_b = 0
for j in 0..zero
    pattern_b += combi(zero, j)
end
time = 0
counter1 = 432
counter2 = 431
while counter1 % counter2 == 1
    variable_3_27 = 1
    queue_sum_values0 = Queue.new

    def sum_values_thread(queue)
        result = sum_values(counter1, variable_3_27)
        queue.push(result)
    end
    thread_sum_values0 = Thread.new { sum_values_thread(queue_sum_values0) }
    thread_sum_values0.join
    result_sum_values0 = queue_sum_values0.pop
    counter1 = result_sum_values0
    while time <= one
        if time % 2 == P
            pattern_a += combi(one, time)
        end
        time += 1
    end
    puts pattern_a * pattern_b
end
```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
    "strconv"
    "strings"
)

func main() {
    var N, P int
    var arr []int
    var one, zero int
    var pattern_a, pattern_b int64
    var time, counter1, counter2 int64
    var variable_3_27 int64
    var queue_sum_values0 chan int64

    fmt.Scan(&N, &P)
    arr = make([]int, N)
    for i := 0; i < N; i++ {
        arr[i], _ = strconv.Atoi(strings.Split(fmt.Sscanf("%d", ""), " ")[0
