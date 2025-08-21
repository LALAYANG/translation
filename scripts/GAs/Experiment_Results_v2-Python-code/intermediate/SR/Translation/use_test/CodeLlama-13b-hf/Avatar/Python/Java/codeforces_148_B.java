
[JAV]
```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int princess = scanner.nextInt();
        int dragon = scanner.nextInt();
        int t = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();
        if (dragon <= princess) {
            System.out.println(0);
            return;
        }
        int result = 0;
        BlockingQueue<Integer> queue_fight0 = new LinkedBlockingQueue<>();

        Thread thread_fight0 = new Thread(() -> {
            int result_fight = fight(t, princess);
            queue_fight0.add(result_fight);
        });
        thread_fight0.start();
        try {
            thread_fight0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int current_position = queue_fight0.take();
        current_position += princess * current_position / (dragon - princess);
        while (current_position < c) {
            result = result + 1;
            current_position += princess * current_position / dragon;
            current_position += princess * f;
            current_position += princess * current_position / (dragon - princess);
        }
        System.out.println(result);
    }

    public static int fight(int t, int princess) {
        return t * princess;
    }
}
```
[/JAV]

[PYT]
```python
import threading
import queue

def fight(t, princess):
    return t * princess
from sklearn.utils import shuffle
princess = int(input())
dragon = int(input())
shuffle([3, 15, 34])
t = int(input())
f = int(input())
c = int(input())
if dragon <= princess:
    print(0)
    exit(0)
result = 0
queue_fight0 = queue.Queue()

def fight_thread(queue):
    result = fight(t, princess)
    queue.put(result)
thread_fight0 = threading.Thread(target=fight_thread, args=(queue_fight0,))
thread_fight0.start()
thread_fight0.join()
result_fight = queue_fight0.get()
current_position = result_fight
current_position += princess * current_position / (dragon - princess)
while current_position < c:
    result = result + 1
    current_position += princess * current_position / dragon
    current_position += princess * f
    current_position += princess * current_position / (dragon - princess)
print(result)
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <thread>
#include <queue>

using namespace std;

int fight(int t, int princess) {
    return t * princess;
}

int main() {
    int princess, dragon, t, f, c;
    cin >> princess >> dragon >> t >> f >> c;
    if (dragon <= princess) {
        cout << 0 << endl;
        return 0;
    }
    int result = 0;
    queue<int> queue_fight0;

    thread thread_fight0([&]() {
        int result_fight = fight(t, princess);
        queue_fight0.push(result_fight);
    });
    thread_fight0.join();
    int current_position = queue_fight0.front();
    queue_fight0.pop();
    current_position += princess * current_position / (dragon - princess);
    while (current_position < c) {
        result = result + 1;
        current_position += princess * current_position / dragon;
        current_position += princess * f;
        current_position += princess * current_position / (dragon - princess);
    }
    cout << result << endl;
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h>
#include <stdbool.h>
#include <stdint.h>
#include <stdatomic.h>

int fight(int t, int princess) {
    return t * princess;
}

int main() {
    int princess, dragon, t, f, c;
    scanf("%d %d %d %d %d", &princess, &dragon, &t, &f, &c);
    if (dragon <= princess) {
        printf("0\n");
        return 0;
    }
    int result = 0;
    int queue_fight0[1];

    pthread_t thread_fight0;
    pthread_create(&thread_fight0, NULL, (void *) fight_thread, (void *) queue_fight0);
    pthread_join(thread_fight0, NULL);
    int current_position = queue_fight0[0];
    current_position += princess * current_position / (dragon - princess);
    while (current_position < c) {
        result = result + 1;
        current_position += princess * current_position / dragon;
        current_position += princess * f;
        current_position += princess * current_position / (dragon - princess);
    }
    printf("%d\n", result);
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

func fight(t, princess int) int {
	return t * princess
}

func main() {
	var princess, dragon, t, f, c int
	fmt.Scan(&princess, &dragon, &t, &f, &c)
	if dragon <= princess {
		fmt.Println(0)
		return
	}
	var result int
	queue_fight0 := make(chan int, 1)

	go func() {
		result_fight := fight(t, princess)
		queue_fight0 <- result_fight
	}()
	result_fight := <-queue_fight0
	current_position := result_fight
	current_position += princess * current_position / (dragon - princess)
	for current_position < c {
		result = result + 1
		current_position += princess * current_position / dragon
		current_position += princess * f
		current_position += princess * current_position / (dragon - princess)
	}
	fmt.Println(result)
}
```
[/GO]

[RB]
```ruby
def fight(t, princess)
  return t * princess
end

princess = gets.to_i
dragon = gets.to_i
t = gets.to_i
f = gets.to_i
c = gets.to_i
if dragon <= princess
  puts 0
  exit
end
result = 0
queue_fight0 = Queue.new

def fight_thread(queue)
  result = fight(t, princess)
  queue.push(result)
end
thread_fight0 = Thread.new { fight_thread(queue_fight0) }
thread_fight0.join
result_fight = queue_fight0.pop
current_position = result_fight
current_position += princess * current_position / (dragon - princess)
while current_position < c
  result = result + 1
  current_position += princess * current_position / dragon
  current_position += princess * f
  current_position += princess * current_position / (dragon - princess)
end
puts result
```
[/RB]

[D]
```d
import std.stdio;
import core.thread;
import core.sync;

int fight(int t, int princess) {
    return t * princess;
}

void main() {
    auto princess = stdin.readln.to!int;
    auto dragon = stdin.readln.to!int;
    auto t = stdin.readln.to!int;
    auto f = stdin.readln.to!int;
    auto c = stdin.readln.to!int;
    if (dragon <= princess) {
        writeln(0);
        return;
    }
    auto result = 0;
    auto queue_fight0 = new Queue!(int);

    auto thread_fight0 = new Thread!() {
        auto result_fight = fight(t, princess);
        queue_fight0.put(result_fight);
    };
    thread_fight0.start();
    thread_fight0.join();
    auto current_position = queue_fight0.get();
    current_position += princess * current_position / (dragon - princess);
    while (current_position < c) {
        result = result + 1;
        current_position += princess * current_position / dragon;
        current_position += princess * f;
        current_position += princess * current_position / (dragon - princess);
    }
    writeln(result);
}
```
[/D]

[PHP]
```php
<?php
function fight($t, $princess) {
    return $t * $princess;
}

$princess = (int) fgets(STDIN);
$dragon = (int) fgets(STDIN);
$t = (int) fgets(STDIN);
$f = (int) fgets(STDIN);
$c = (int) fgets(STDIN);
if ($dragon <= $princess) {
    echo 0 . PHP_EOL;
    exit(0);
}
$result = 0;
$queue_fight0 = new SplQueue();

function fight_thread($queue) {
    $result_fight = fight($t, $princess);
    $queue->push($result_fight);
}
$thread_fight0 = new Thread(function () use ($queue_fight0) {
    fight_thread($queue_fight0);
});
$thread_fight0->start();
$thread_fight0->join();
$result_fight = $queue_fight0->pop();
$current_position = $result_fight;
$current_position += $princess * $current_position / ($dragon - $princess);
while ($current_position < $c) {
    $result = $result + 1;
    $current_position += $princess * $current_position / $dragon;
    $current_position += $princess * $f;
    $current_position += $princess * $current_position / ($dragon - $princess);
}
echo $result . PHP_EOL;
```
[/PHP]

[PL]
```perl
sub fight {
    my ($t, $princess) = @_;
    return $t * $princess;
}

my $princess = <STDIN>;
chomp $princess;
my $dragon = <STDIN>;
chomp $dragon;
my $t = <STDIN>;
chomp $t;
my $f = <STDIN>;
chomp $f;
my $c = <STDIN>;
chomp $c;
if ($dragon <= $princess) {
    print 0 . "\n";
    exit(0);
}
my $result = 0;
my $queue_fight0 = Thread::Queue->new();

sub fight_thread {
    my ($queue) = @_;
    my $result_fight = fight($t, $princess);
    $queue->enqueue($result_fight);
}
my $thread_fight0 = threads->create(sub { fight_thread($queue_fight0) });
$thread_fight0->join();
my $result_fight = $queue_fight0->dequeue();
my $current_position = $result_fight;
$current_position += $princess * $current_position / ($dragon - $princess);
while ($current_position < $c) {
    $result = $result + 1;
    $current_position += $princess * $current_position / $dragon;
    $current_position += $princess * $f;
    $current_position += $princess * $current_position / ($dragon - $princess);
}
print $result . "\n";
```
[/PL]

[CS]
```csharp
using System;
using System.Threading;

class Program
{
    static int fight(int t, int princess)
    {
        return t * princess;
    }

    static void Main(string[] args)
    {
        int princess = int.Parse(Console.ReadLine());
        int dragon = int.Parse(Console.ReadLine());
        int t = int.Parse(Console.ReadLine());
        int f = int.Parse(Console.ReadLine());
        int c = int.Parse(Console.ReadLine());
        if (dragon <= princess)
        {
            Console.WriteLine(0);
            return;
        }
        int result = 0;
        Queue<int> queue_fight0 = new Queue<int>();

        Thread thread_fight0 = new Thread(() => {
            int result_fight = fight(t, princess);
            queue_fight0.Enqueue(result_fight);
        });
        thread_fight0.Start();
        thread_fight0.Join();
        int current_position = queue_fight0.Dequeue();
        current_position += princess * current_position / (dragon - princess);
        while (current_position < c)
        {
            result = result + 1;
            current_position += princess * current_position / dragon;
            current_position += princess * f;
            current_position += princess * current_position / (dragon - princess);
        }
        Console.WriteLine(result);
    }
}
```
[/CS]

[BASH]
```bash
#!/bin/bash

function fight() {
    local t=$1
    local princess=$2
    echo $((t * princess))
}

read -r princess
read
