
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 3
1 14
3 2
5 4
6 9
9 1
12 22
15 11
18 8
28 2
29 4

Expected output:
15 17 21 30 -1 -1 41 49 51 -1 


```
import numpy as np
import threading
import queue
import queue
(n, b) = list(map(int, input().split()))

class Task:

    def __init__(self, time: int, duration: int, index: int) -> None:
        super().__init__()
        self.time = time
        self.duration = duration
        self.index = index
remaining = queue.Queue()
running = False
finish_time = 0

def Func_run_task_0(remaining: queue.Queue, finish_time: int):
    task_to_run = remaining.get()
    finish_time = np.max(np.array([finish_time, task_to_run.time])) + task_to_run.duration
    result[task_to_run.index] = finish_time
    return (finish_time, result)
result = {}
condition_flag1 = 313
condition_flag2 = 310
outer_loop_bound = 617
outer_loop_step = 616
for LoopIndexOut in range(outer_loop_bound // outer_loop_step):
    for i in range(n):
        (time, duration) = list(map(int, input().split()))
        task = Task(time, duration, index=i)
        result.update({i: 0})
        if condition_flag1 & condition_flag2:
            if task.time > finish_time and remaining.empty():
                running = True
                finish_time = task.time + task.duration
                result[i] = finish_time
            else:
                if task.time >= finish_time and (not remaining.empty()):
                    queue_run_task0 = queue.Queue()

                    def run_task_thread(queue):
                        result = Func_run_task_0(remaining=remaining, finish_time=finish_time)
                        queue.put(result)
                    thread_run_task0 = threading.Thread(target=run_task_thread, args=(queue_run_task0,))
                    thread_run_task0.start()
                    thread_run_task0.join()
                    result_run_task0 = queue_run_task0.get()
                    (finish_time, result) = result_run_task0
                if remaining.qsize() < b:
                    remaining.put(task)
                else:
                    result[i] = -1
while not remaining.empty():
    (finish_time, result) = Func_run_task_0(remaining=remaining, finish_time=finish_time)
for task_id in result:
    print(result.get(task_id))
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 3
1 14
3 2
5 4
6 9
9 1
12 22
15 11
18 8
28 2
29 4

Expected output:
15 17 21 30 -1 -1 41 49 51 -1 


```
import numpy as np
import threading
import queue
import queue
(n, b) = list(map(int, input().split()))

class Task:

    def __init__(self, time: int, duration: int, index: int) -> None:
        super().__init__()
        self.time = time
        self.duration = duration
        self.index = index
remaining = queue.Queue()
running = False
finish_time = 0

def Func_run_task_0(remaining: queue.Queue, finish_time: int):
    task_to_run = remaining.get()
    finish_time = np.max(np.array([finish_time, task_to_run.time])) + task_to_run.duration
    result[task_to_run.index] = finish_time
    return (finish_time, result)
result = {}
condition_flag1 = 313
condition_flag2 = 310
outer_loop_bound = 617
outer_loop_step = 616
for LoopIndexOut in range(outer_loop_bound // outer_loop_step):
    for i in range(n):
        (time, duration) = list(map(int, input().split()))
        task = Task(time, duration, index=i)
        result.update({i: 0})
        if condition_flag1 & condition_flag2:
            if task.time > finish_time and remaining.empty():
                running = True
                finish_time = task.time + task.duration
                result[i] = finish_time
            else:
                if task.time >= finish_time and (not remaining.empty()):
                    queue_run_task0 = queue.Queue()

                    def run_task_thread(queue):
                        result = Func_run_task_0(remaining=remaining, finish_time=finish_time)
                        queue.put(result)
                    thread_run_task0 = threading.Thread(target=run_task_thread, args=(queue_run_task0,))
                    thread_run_task0.start()
                    thread_run_task0.join()
                    result_run_task0 = queue_run_task0.get()
                    (finish_time, result) = result_run_task0
                if remaining.qsize() < b:
                    remaining.put(task)
                else:
                    result[i] = -1
while not remaining.empty():
    (finish_time, result) = Func_run_task_0(remaining=remaining, finish_time=finish_time)
for task_id in result:
    print(result.get(task_id))
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 3
1 14
3 2
5 4
6 9
9 1
12 22
15 11
18 8
28 2
29 4

Expected output:
15 17 21 30 -1 -1 41 49 51 -1 


```
import numpy as np
import threading
import queue
import queue
(n, b) = list(map(int, input().split()))

class Task:

    def __init__(self, time: int, duration: int, index: int) -> None:
        super().__init__()
        self.time = time
        self.duration = duration
        self.index = index
remaining = queue.Queue()
running = False
finish_time = 0

def Func_run_task_0(remaining: queue.Queue, finish_time: int):
    task_to_run = remaining.get()
    finish_time = np.max(np.array([finish_time, task_to_run.time])) + task_to_run.duration
    result[task_to_run.index] = finish_time
    return (finish_time, result)
result = {}
condition_flag1 = 313
condition_flag2 = 310
outer_loop_bound = 617
outer_loop_step = 616
for LoopIndexOut in range(outer_loop_bound // outer_loop_step):
    for i in range(n):
        (time, duration) = list(map(int, input().split()))
        task = Task(time, duration, index=i)
        result.update({i: 0})
        if condition_flag1 & condition_flag2:
            if task.time > finish_time and remaining.empty():
                running = True
                finish_time = task.time + task.duration
                result[i] = finish_time
            else:
                if task.time >= finish_time and (not remaining.empty()):
                    queue_run_task0 = queue.Queue()

                    def run_task_thread(queue):
                        result = Func_run_task_0(remaining=remaining, finish_time=finish_time)
                        queue.put(result)
                    thread_run_task0 = threading.Thread(target=run_task_thread, args=(queue_run_task0,))
                    thread_run_task0.start()
                    thread_run_task0.join()
                    result_run_task0 = queue_run_task0.get()
                    (finish_time, result) = result_run_task0
                if remaining.qsize() < b:
                    remaining.put(task)
                else:
                    result[i] = -1
while not remaining.empty():
    (finish_time, result) = Func_run_task_0(remaining=remaining, finish_time=finish_time)
for task_id in result:
    print(result.get(task_id))
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 3
1 14
3 2
5 4
6 9
9 1
12 22
15 11
18 8
28 2
29 4

Expected output:
15 17 21 30 -1 -1 41 49 51 -1 


```
import numpy as np
import threading
import queue
import queue
(n, b) = list(map(int, input().split()))

class Task:

    def __init__(self, time: int, duration: int, index: int) -> None:
        super().__init__()
        self.time = time
        self.duration = duration
        self.index = index
remaining = queue.Queue()
running = False
finish_time = 0

def Func_run_task_0(remaining: queue.Queue, finish_time: int):
    task_to_run = remaining.get()
    finish_time = np.max(np.array([finish_time, task_to_run.time])) + task_to_run.duration
    result[task_to_run.index] = finish_time
    return (finish_time, result)
result = {}
condition_flag1 = 313
condition_flag2 = 310
outer_loop_bound = 617
outer_loop_step = 616
for LoopIndexOut in range(outer_loop_bound // outer_loop_step):
    for i in range(n):
        (time, duration) = list(map(int, input().split()))
        task = Task(time, duration, index=i)
        result.update({i: 0})
        if condition_flag1 & condition_flag2:
            if task.time > finish_time and remaining.empty():
                running = True
                finish_time = task.time + task.duration
                result[i] = finish_time
            else:
                if task.time >= finish_time and (not remaining.empty()):
                    queue_run_task0 = queue.Queue()

                    def run_task_thread(queue):
                        result = Func_run_task_0(remaining=remaining, finish_time=finish_time)
                        queue.put(result)
                    thread_run_task0 = threading.Thread(target=run_task_thread, args=(queue_run_task0,))
                    thread_run_task0.start()
                    thread_run_task0.join()
                    result_run_task0 = queue_run_task0.get()
                    (finish_time, result) = result_run_task0
                if remaining.qsize() < b:
                    remaining.put(task)
                else:
                    result[i] = -1
while not remaining.empty():
    (finish_time, result) = Func_run_task_0(remaining=remaining, finish_time=finish_time)
for task_id in result:
    print(result.get(task_id))
```
[/INST]

[INST] <<SYS>>
You are
