

```java
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

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

class ProcessTask implements Callable<Map<Integer, Integer>> {
    Queue<Task> remaining;
    int finishTime;

    public ProcessTask(Queue<Task> remaining, int finishTime) {
        this.remaining = remaining;
        this.finishTime = finishTime;
    }

    @Override
    public Map<Integer, Integer> call() throws Exception {
        Task taskToRun = remaining.poll();
        finishTime = Math.max(finishTime, taskToRun.time) + taskToRun.duration;
        result.put(taskToRun.index, finishTime);
        return result;
    }
}

public class Main {
    static int n;
    static int b;
    static Queue<Task> remaining = new LinkedList<>();
    static boolean running = false;
    static int finishTime = 0;
    static Map<Integer, Integer> result = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        b = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            int duration = scanner.nextInt();
            Task newTask = new Task(time, duration, i);
            result.put(i, 0);
            if (time > finishTime && remaining.isEmpty()) {
                running = true;
                finishTime = newTask.time + newTask.duration;
                result.put(i, finishTime);
            } else {
                if (time >= finishTime && !remaining.isEmpty()) {
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<Map<Integer, Integer>> future = executor.submit(new ProcessTask(remaining, finishTime));
                    try {
                        result = future.get();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    executor.shutdown();
                }
                if (remaining.size() < b) {
                    remaining.add(newTask);
                } else {
                    result.put(i, -1);
                }
            }
        }
        while (!remaining.isEmpty()) {
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Map<Integer, Integer>> future = executor.submit(new ProcessTask(remaining, finishTime));
            try {
                result = future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            executor.shutdown();
        }
        for (int key : result.keySet()) {
            System.out.print(result.get(key) + " ");
        }
    }
}
```

## 2.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 3.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 4.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 5.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 6.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 7.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 8.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 9.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 10.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 11.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 12.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 13.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 14.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 15.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 16.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 17.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 18.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 19.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 20.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 21.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 22.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the input list is [1, 2, 3, 1, 2, 4, 5, 6, 2, 3, 4], the output list should be [1, 2, 3, 4, 5, 6].

```
def remove_duplicates(nums):
    return list(set(nums))
```

## 23.

Write a function that takes a list of integers and returns a list of integers that contains the same numbers in the same order, but with all duplicates removed.

For example, if the
