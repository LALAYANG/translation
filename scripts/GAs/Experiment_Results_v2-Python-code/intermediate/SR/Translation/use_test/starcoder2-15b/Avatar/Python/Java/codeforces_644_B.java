

```java
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();
        Queue<Task> remaining = new LinkedList<>();
        boolean IsTaskRunning = false;
        int finish_time = 0;
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            int time = Integer.parseInt(line[0]);
            int duration = Integer.parseInt(line[1]);
            Task task = new Task(time, duration, i);
            result.put(i, 0);
            if (task.time > finish_time && remaining.isEmpty()) {
                IsTaskRunning = true;
                finish_time = task.time + task.duration;
                result.put(i, finish_time);
            } else {
                if (task.time >= finish_time && !remaining.isEmpty()) {
                    Task task_to_run = remaining.poll();
                    finish_time = Math.max(finish_time, task_to_run.time) + task_to_run.duration;
                    result.put(task_to_run.index, finish_time);
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result.put(i, -1);
                }
            }
        }
        while (!remaining.isEmpty()) {
            Task task_to_run = remaining.poll();
            finish_time = Math.max(finish_time, task_to_run.time) + task_to_run.duration;
            result.put(task_to_run.index, finish_time);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}

class Task {
    int time;
    int duration;
    int index;

    public Task(int time, int duration, int index) {
        this.time = time;
        this.duration = duration;
        this.index = index;
    }
}
```

## 2.

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
IsTaskRunning = False
finish_time = 0

def ExecuteTask(remaining: queue.Queue, finish_time: int):
    task_to_run = remaining.get()
    finish_time = max(finish_time, task_to_run.time) + task_to_run.duration
    result[task_to_run.index] = finish_time
    return (finish_time, result)
result = {}
IsConditionMet = 675
IsAnotherConditionMet = 840
OuterLoopBound = 536
InnerLoopBound = 535
for LoopIndexOut in range(OuterLoopBound // InnerLoopBound):
    for i in range(n):
        (time, duration) = list(map(int, input().split()))
        task = Task(time, duration, index=i)
        result.update({i: 0})
        if IsConditionMet & IsAnotherConditionMet:
            if task.time > finish_time and remaining.empty():
                IsTaskRunning = True
                finish_time = task.time + task.duration
                result[i] = finish_time
            else:
                if task.time >= finish_time and (not remaining.empty()):
                    queue_run_task0 = queue.Queue()

                    def run_task_thread(queue):
                        result = ExecuteTask(remaining=remaining, finish_time=finish_time)
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
    (finish_time, result) = ExecuteTask(remaining=remaining, finish_time=finish_time)
for key in result:
    print(result.get(key))
```

Java code:

```java
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();
        Queue<Task> remaining = new LinkedList<>();
        boolean IsTaskRunning = false;
        int finish_time = 0;
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            int time = Integer.parseInt(line[0]);
            int duration = Integer.parseInt(line[1]);
            Task task = new Task(time, duration, i);
            result.put(i, 0);
            if (task.time > finish_time && remaining.isEmpty()) {
                IsTaskRunning = true;
                finish_time = task.time + task.duration;
                result.put(i, finish_time);
            } else {
                if (task.time >= finish_time && !remaining.isEmpty()) {
                    Task task_to_run = remaining.poll();
                    finish_time = Math.max(finish_time, task_to_run.time) + task_to_run.duration;
                    result.put(task_to_run.index, finish_time);
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result.put(i, -1);
                }
            }
        }
        while (!remaining.isEmpty()) {
            Task task_to_run = remaining.poll();
            finish_time = Math.max(finish_time, task_to_run.time) + task_to_run.duration;
            result.put(task_to_run.index, finish_time);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}

class Task {
    int time;
    int duration;
    int index;

    public Task(int time, int duration, int index) {
        this.time = time;
        this.duration = duration;
        this.index = index;
    }
}
```

## 3.

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
IsTaskRunning = False
finish_time = 0

def ExecuteTask(remaining: queue.Queue, finish_time: int):
    task_to_run = remaining.get()
    finish_time = max(finish_time, task_to_run.time) + task_to_run.duration
    result[task_to_run.index] = finish_time
    return (finish_time, result)
result = {}
IsConditionMet = 675
IsAnotherConditionMet = 840
OuterLoopBound = 536
InnerLoopBound = 535
for LoopIndexOut in range(OuterLoopBound // InnerLoopBound):
    for i in range(n):
        (time, duration) = list(map(int, input().split()))
        task = Task(time, duration, index=i)
        result.update({i: 0})
        if IsConditionMet & IsAnotherConditionMet:
            if task.time > finish_time and remaining.empty():
                IsTaskRunning = True
                finish_time = task.time + task.duration
                result[i] = finish_time
            else:
                if task.time >= finish_time and (not remaining.empty()):
                    queue_run_task0 = queue.Queue()

                    def run_task_thread(queue):
                        result = ExecuteTask(remaining=remaining, finish_time=finish_time)
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
    (finish_time, result) = ExecuteTask(remaining=remaining, finish_time=finish_time)
for key in result:
    print(result.get(key))
```

Java code:

```java
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();
        Queue<Task> remaining = new LinkedList<>();
        boolean IsTaskRunning = false;
        int finish_time = 0;
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            int time = Integer.parseInt(line[0]);
            int duration = Integer.parseInt(line[1]);
            Task task = new Task(time, duration, i);
            result.put(i, 0);
            if (task.time > finish_time && remaining.isEmpty()) {
                IsTaskRunning = true;
                finish_time = task.time + task.duration;
                result.put(i, finish_time);
            } else {
                if (task.time >= finish_time && !remaining.isEmpty()) {
                    Task task_to_run = remaining.poll();
                    finish_time = Math.max(finish_time, task_to_run.time) + task_to_run.duration;
                    result.put(task_to_run.index, finish_time);
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result.put(i, -1);
                }
            }
        }
        while (!remaining.isEmpty()) {
            Task task_to_run = remaining.poll();
            finish_time = Math.max(finish_time, task_to_run.time) + task_to_run.duration;
            result.put(task_to_run.index, finish_time);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}

class Task {
    int time;
    int duration;
    int index;

    public Task(int time, int duration, int index) {
        this.time = time;
        this.duration = duration;
        this.index = index;
    }
}
```

## 4.

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
IsTaskRunning = False
finish_time = 0

def ExecuteTask(remaining: queue.Queue, finish_time: int):
    task_to_run = remaining.get()
    finish_time = max(finish_time, task_to_run.time) + task_to_run.duration
    result[task_to_run.index] = finish_time
    return (finish_time, result)
result = {}
IsConditionMet = 675
IsAnotherConditionMet = 840
OuterLoopBound = 536
InnerLoopBound = 535
for LoopIndexOut in range(OuterLoopBound // InnerLoopBound):
    for i in range(n):
        (time, duration) = list(map(int, input().split()))
        task = Task(time, duration, index=i)
        result.update({i: 0})
        if IsConditionMet & IsAnotherConditionMet:
            if task.time > finish_time and remaining.empty():
                IsTaskRunning = True
               
