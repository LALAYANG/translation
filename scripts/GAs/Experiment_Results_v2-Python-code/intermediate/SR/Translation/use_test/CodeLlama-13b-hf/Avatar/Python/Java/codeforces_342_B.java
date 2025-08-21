
[JAV]

```
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int f = sc.nextInt();
        int d = 1;
        char c = 'R';
        if (s < f) {
            d = -1;
            c = 'L';
        }
        String res = "";
        int i = 1;
        int j = s;
        int k = 1;
        while (j != f) {
            if (i > n && k < m) {
                int t = sc.nextInt();
                int l = sc.nextInt();
                int r = sc.nextInt();
                int increment = 1;
                LinkedBlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                Future<Integer> future = executorService.submit(() -> {
                    int result = calculateSum(k, increment);
                    resultQueue.add(result);
                    return result;
                });
                try {
                    future.get(1, TimeUnit.SECONDS);
                } catch (Exception e) {
                    System.out.println("Timeout");
                }
                executorService.shutdown();
                k = resultQueue.poll();
            }
            if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                res = res + "X";
            } else {
                res += c;
                j += d;
            }
            i++;
        }
        System.out.println(res);
    }

    public static int calculateSum(int k, int increment) {
        return k + increment;
    }
}
```
[/JAV]

[PY]

```
import threading
import queue

def calculate_sum(k, increment):
    return k + increment
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
R = lambda : map(int, input().split())
(n, m, s, f) = R()
ttest_ind([2, 37, 50], [70, 5, 65])
shuffle([74, 6, 7])
if s < f:
    d = 1
    c = 'R'
else:
    d = -1
    c = 'L'
res = ''
i = 1
j = s
(t, l, r) = R()
k = 1
while j != f:
    if i > t and k < m:
        (t, l, r) = R()
        increment = 1
        result_queue = queue.Queue()

        def calculation_thread(queue):
            result = calculate_sum(k, increment)
            queue.put(result)
        worker_thread = threading.Thread(target=calculation_thread, args=(result_queue,))
        worker_thread.start()
        worker_thread.join()
        calculated_value = result_queue.get()
        k = calculated_value
    if i == t and (l <= j <= r or l <= j + d <= r):
        res = res + 'X'
    else:
        res += c
        j += d
    i += 1
print(res)
```
[/PY]

[CPP]

```
#include <bits/stdc++.h>
using namespace std;

int calculate_sum(int k, int increment) {
    return k + increment;
}

int main() {
    int n, m, s, f;
    cin >> n >> m >> s >> f;
    int d = 1;
    char c = 'R';
    if (s < f) {
        d = -1;
        c = 'L';
    }
    string res = "";
    int i = 1;
    int j = s;
    int k = 1;
    while (j != f) {
        if (i > n && k < m) {
            int t, l, r;
            cin >> t >> l >> r;
            int increment = 1;
            queue<int> result_queue;

            thread worker_thread([&]() {
                int result = calculate_sum(k, increment);
                result_queue.push(result);
            });
            worker_thread.join();
            k = result_queue.front();
            result_queue.pop();
        }
        if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
            res = res + "X";
        } else {
            res += c;
            j += d;
        }
        i++;
    }
    cout << res << endl;
}
```
[/CPP]

[C]

```
#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>

int calculate_sum(int k, int increment) {
    return k + increment;
}

int main() {
    int n, m, s, f;
    scanf("%d %d %d %d", &n, &m, &s, &f);
    int d = 1;
    char c = 'R';
    if (s < f) {
        d = -1;
        c = 'L';
    }
    char res[100000];
    int i = 1;
    int j = s;
    int k = 1;
    while (j != f) {
        if (i > n && k < m) {
            int t, l, r;
            scanf("%d %d %d", &t, &l, &r);
            int increment = 1;
            sem_t sem;
            sem_init(&sem, 0, 0);
            pthread_t thread;
            pthread_create(&thread, NULL, (void *)calculate_sum, &k);
            pthread_join(thread, NULL);
            sem_wait(&sem);
            sem_destroy(&sem);
        }
        if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
            res[i - 1] = 'X';
        } else {
            res[i - 1] = c;
            j += d;
        }
        i++;
    }
    printf("%s\n", res);
}
```
[/C]

[GO]

```
package main

import (
	"fmt"
	"sync"
)

func calculate_sum(k, increment int, result_queue chan int) {
	result_queue <- k + increment
}

func main() {
	var n, m, s, f int
	fmt.Scan(&n, &m, &s, &f)
	d := 1
	c := 'R'
	if s < f {
		d = -1
		c = 'L'
	}
	res := ""
	i := 1
	j := s
	k := 1
	for j != f {
		if i > n && k < m {
			var t, l, r int
			fmt.Scan(&t, &l, &r)
			increment := 1
			result_queue := make(chan int)
			go calculate_sum(k, increment, result_queue)
			k = <-result_queue
		}
		if i == t && (l <= j && j <= r || l <= j+d && j+d <= r) {
			res += "X"
		} else {
			res += string(c)
			j += d
		}
		i++
	}
	fmt.Println(res)
}
```
[/GO]

[PHP]

```
<?php
function calculate_sum($k, $increment) {
    return $k + $increment;
}

$n = (int)readline();
$m = (int)readline();
$s = (int)readline();
$f = (int)readline();
$d = 1;
$c = 'R';
if ($s < $f) {
    $d = -1;
    $c = 'L';
}
$res = '';
$i = 1;
$j = $s;
$k = 1;
while ($j != $f) {
    if ($i > $n && $k < $m) {
        $t = (int)readline();
        $l = (int)readline();
        $r = (int)readline();
        $increment = 1;
        $result_queue = [];
        $worker_thread = new Thread(function () use (&$k, $increment, &$result_queue) {
            $result_queue[] = calculate_sum($k, $increment);
        });
        $worker_thread->start();
        $worker_thread->join();
        $calculated_value = $result_queue[0];
        $k = $calculated_value;
    }
    if ($i == $t && ($l <= $j && $j <= $r || $l <= $j + $d && $j + $d <= $r)) {
        $res .= 'X';
    } else {
        $res .= $c;
        $j += $d;
    }
    $i++;
}
echo $res;
```
[/PHP]

[RUBY]

```
def calculate_sum(k, increment)
    return k + increment
end

n, m, s, f = gets.split.map(&:to_i)
d = 1
c = 'R'
if s < f
    d = -1
    c = 'L'
end
res = ''
i = 1
j = s
k = 1
while j != f
    if i > n && k < m
        t, l, r = gets.split.map(&:to_i)
        increment = 1
        result_queue = Queue.new

        Thread.new do
            result = calculate_sum(k, increment)
            result_queue.push(result)
        end.join
        calculated_value = result_queue.pop
        k = calculated_value
    end
    if i == t && (l <= j && j <= r || l <= j + d && j + d <= r)
        res += 'X'
    else
        res += c
        j += d
    end
    i += 1
end
puts res
```
[/RUBY]

[JAVA]

```
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int f = sc.nextInt();
        int d = 1;
        char c = 'R';
        if (s < f) {
            d = -1;
            c = 'L';
        }
        String res = "";
        int i = 1;
        int j = s;
        int k = 1;
        while (j != f) {
            if (i > n && k < m) {
                int t = sc.nextInt();
                int l = sc.nextInt();
                int r = sc.nextInt();
                int increment = 1;
                LinkedBlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                Future<Integer> future = executorService.submit(() -> {
                    int result = calculateSum(k, increment);
                    resultQueue.add(result);
                    return result;
                });
                try {
                    future.get(1, TimeUnit.SECONDS);
                } catch (Exception e) {
                    System.out.println("Timeout");
                }
                executorService.shutdown();
