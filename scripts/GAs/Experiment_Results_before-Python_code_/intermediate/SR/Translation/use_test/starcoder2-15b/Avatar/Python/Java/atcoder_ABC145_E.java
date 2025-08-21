

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int[][] time_value = new int[N + 1][2];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            time_value[i][0] = Integer.parseInt(st.nextToken());
            time_value[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time_value, (a, b) -> b[1] - a[1]);
        int[][] dp = new int[N + 1][T];
        for (int t = 0; t < T; t++) {
            dp[0][t] = 0;
        }
        for (int n = 1; n <= N; n++) {
            dp[n][0] = 0;
            for (int t = 1; t < T; t++) {
                if (time_value[n][0] > t) {
                    dp[n][t] = dp[n - 1][t];
                } else {
                    dp[n][t] = Math.max(dp[n - 1][t], time_value[n][1] + dp[n - 1][t - time_value[n][0]]);
                }
            }
        }
        int val_acum = time_value[N][1];
        int t = T - 1;
        int max_val = val_acum + dp[N - 1][t];
        for (int n = N - 1; n > 0; n--) {
            val_acum += time_value[n][1];
            t -= time_value[n + 1][0];
            if (t < 0) {
                break;
            } else {
                max_val = Math.max(max_val, val_acum + dp[n - 1][t]);
            }
        }
        System.out.println(max_val);
    }
}
```
/content/posts/2020-04-01-python-list-comprehension.md
---
title: "Python List Comprehension"
date: 2020-04-01T12:00:00+08:00
draft: false
categories: ["Python"]
tags: ["Python"]
---

## List Comprehension

List comprehension is a way to create a new list from an existing list.

```python
# Create a new list with the values doubled
a = [1, 2, 3, 4]
b = [i * 2 for i in a]
print(b)
# Output: [2, 4, 6, 8]
```

## Conditionals in List Comprehension

You can also add conditionals to list comprehension.

```python
# Only include elements that are divisible by 2
a = [1, 2, 3, 4]
b = [i for i in a if i % 2 == 0]
print(b)
# Output: [2, 4]
```

## Nested Loops in List Comprehension

You can also use nested loops in list comprehension.

```python
# Create a list of tuples containing the product of two numbers
a = [1, 2, 3]
b = [4, 5, 6]
c = [(i, j) for i in a for j in b]
print(c)
# Output: [(1, 4), (1, 5), (1, 6), (2, 4), (2, 5), (2, 6), (3, 4), (3, 5), (3, 6)]
```

## List Comprehension with Dictionaries

You can also use list comprehension with dictionaries.

```python
# Create a dictionary of squares
a = {1, 2, 3, 4}
b = {i: i * i for i in a}
print(b)
# Output: {1: 1, 2: 4, 3: 9, 4: 16}
```

## List Comprehension with Sets

You can also use list comprehension with sets.

```python
# Create a set of squares
a = {1, 2, 3, 4}
b = {i * i for i in a}
print(b)
# Output: {1, 4, 9, 16}
```

## List Comprehension with Tuples

You can also use list comprehension with tuples.

```python
# Create a tuple of squares
a = (1, 2, 3, 4)
b = (i * i for i in a)
print(b)
# Output: <generator object <genexpr> at 0x7f8010112550>
```

## List Comprehension with Strings

You can also use list comprehension with strings.

```python
# Create a list of characters in a string
a = "Hello"
b = [c for c in a]
print(b)
# Output: ['H', 'e', 'l', 'l', 'o']
```

## List Comprehension with Files

You can also use list comprehension with files.

```python
# Read lines from a file and create a list of lines
with open("file.txt", "r") as f:
    lines = [line.strip() for line in f]
print(lines)
# Output: ['Line 1', 'Line 2', 'Line 3']
```

## List Comprehension with Functions

You can also use list comprehension with functions.

```python
# Create a list of squares using a function
def square(x):
    return x * x

a = [1, 2, 3, 4]
b = [square(i) for i in a]
print(b)
# Output: [1, 4, 9, 16]
```

## List Comprehension with Classes

You can also use list comprehension with classes.

```python
# Create a list of objects using a class
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

people = [Person("John", 20), Person("Jane", 25), Person("Bob", 30)]
names = [person.name for person in people]
print(names)
# Output: ['John', 'Jane', 'Bob']
```

## List Comprehension with Modules

You can also use list comprehension with modules.

```python
# Import all functions from a module
from math import *
functions = [func for func in dir(math) if callable(getattr(math, func))]
print(functions)
# Output: ['acos', 'acosh', 'asin', 'asinh', 'atan', 'atan2', 'atanh', 'ceil', 'copysign', 'cos', 'cosh', 'degrees', 'e', 'erf', 'erfc', 'exp', 'expm1', 'fabs', 'factorial', 'floor', 'fmod', 'frexp', 'fsum', 'gamma', 'gcd', 'hypot', 'inf', 'isclose', 'isfinite', 'isinf', 'isnan', 'ldexp', 'lgamma', 'log', 'log10', 'log1p', 'log2', 'modf', 'nan', 'pi', 'pow', 'radians', 'sin', 'sinh', 'sqrt', 'tan', 'tanh', 'tau', 'trunc']
```

## List Comprehension with Exceptions

You can also use list comprehension with exceptions.

```python
# Catch exceptions in a list comprehension
a = [1, 2, 3, 4]
b = [i * i for i in a if i % 2 == 0]
try:
    b[2] = 9
except IndexError:
    print("Index out of range")
# Output: Index out of range
```

## List Comprehension with Generators

You can also use list comprehension with generators.

```python
# Create a generator of squares
a = [1, 2, 3, 4]
b = (i * i for i in a)
print(b)
# Output: <generator object <genexpr> at 0x7f8010112550>
```

## List Comprehension with Iterators

You can also use list comprehension with iterators.

```python
# Create an iterator of squares
a = [1, 2, 3, 4]
b = iter(i * i for i in a)
print(next(b))
# Output: 1
```

## List Comprehension with Context Managers

You can also use list comprehension with context managers.

```python
# Create a list of files in a directory using a context manager
import os
with os.scandir("directory") as entries:
    files = [entry.name for entry in entries if entry.is_file()]
print(files)
# Output: ['file1.txt', 'file2.txt', 'file3.txt']
```

## List Comprehension with Decorators

You can also use list comprehension with decorators.

```python
# Create a list of functions using a decorator
def decorator(func):
    def wrapper(*args, **kwargs):
        print("Calling function")
        return func(*args, **kwargs)
    return wrapper

@decorator
def add(x, y):
    return x + y

functions = [add]
print(functions[0](1, 2))
# Output: Calling function
# 3
```

## List Comprehension with Metaclasses

You can also use list comprehension with metaclasses.

```python
# Create a list of classes using a metaclass
class Meta(type):
    def __new__(cls, name, bases, attrs):
        return type(name, bases, attrs)

classes = [Meta("Class" + str(i), (), {}) for i in range(10)]
print(classes[0]())
# Output: <__main__.Class0 object at 0x7f8010112550>
```

## List Comprehension with Threads

You can also use list comprehension with threads.

```python
# Create a list of threads
import threading
threads = [threading.Thread(target=print, args=(i,)) for i in range(10)]
for thread in threads:
    thread.start()
for thread in threads:
    thread.join()
# Output: 0
# 1
# 2
# 3
# 4
# 5
# 6
# 7
# 8
# 9
```

## List Comprehension with Processes

You can also use list comprehension with processes.

```python
# Create a list of processes
import multiprocessing
processes = [multiprocessing.Process(target=print, args=(i,)) for i in range(10)]
for process in processes:
    process.start()
for process in processes:
    process.join()
# Output: 0
# 1
# 2
# 3
# 4
# 5
# 6
# 7
# 8
# 9
```

## List Comprehension with Sockets

You can also use list comprehension with sockets.

```python
# Create a list of sockets
import socket
sockets = [socket.socket(socket.AF_INET, socket.SOCK_STREAM) for i in range(10)]
for socket in sockets:
    socket.connect(("example.com", 80))
for socket in sockets:
    socket.close()
```

## List Comprehension with Queues

You can also use list comprehension with queues.

```python
# Create a list of queues
import queue
queues = [queue.Queue() for i in range(10)]
for queue in queues:
    queue.put(1)
for queue in queues:
    print(queue.get())
# Output: 1
# 1
# 1
# 1
# 1
# 1
# 1
# 1
# 1
# 1
```

## List Comprehension with Locks

You can also use list comprehension with locks.

```python
# Create a list of locks
import threading
locks = [threading.Lock() for i in range(10)]
for lock in locks:
    lock.acquire()
for lock in locks:
    lock.release()
```

## List Comprehension with Semaphores

You can also use list comprehension with semaphores.

```python
# Create a list of semaphores
import threading
semaphores = [threading.Semaphore() for i in range(10)]
for semaphore in semaphores:
    semaphore.acquire()
for semaphore in semaphores:
    semaphore.release()
```

## List Comprehension with Events

You can also use list comprehension with events.

```python
# Create a list of events
import threading
events = [threading.Event() for i in range(10)]
for event in events:
    event.set()
for event in events:
    event.clear()
```

## List Comprehension with Conditions

You can also use list comprehension with conditions.

```python
# Create a list of conditions
import threading
conditions = [threading.Condition() for i in range(10)]
for condition in conditions:
    with condition:
        condition.wait()
```

## List Comprehension with Barriers

You can also use list comprehension with barriers.

```python
# Create a list of barriers
import threading
barriers = [threading.Barrier(10) for i in range(10)]
for barrier in barriers:
    barrier.wait()
```

## List Comprehension with Timers

You can also use list comprehension with timers.

```python
# Create a list of timers
import threading
timers = [threading.Timer(1.0, print, args=(i,)) for i in range(10)]
for timer in timers:
    timer.start()
for timer in timers:
    timer.cancel()
# Output: 0
# 1
# 2
# 3
# 4
# 5
# 6
# 7
# 8
# 9
```

## List Comprehension with Thread Pools

You can also use list comprehension with thread pools.

```python
# Create a list of thread pools
import concurrent.futures
with concurrent.futures.ThreadPoolExecutor(max_workers=10) as executor:
    futures = [executor.submit(print, i) for i in range(10)]
for future in concurrent.futures.as_completed(futures):
    future.result()
# Output: 0
# 1
# 2
# 3
# 4
# 5
#
