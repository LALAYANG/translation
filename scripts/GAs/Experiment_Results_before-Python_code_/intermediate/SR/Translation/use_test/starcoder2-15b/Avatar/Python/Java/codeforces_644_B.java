

```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

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

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        Queue<Task> remaining = new LinkedList<>();
        boolean running = false;
        int finish_time = 0;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int time = sc.nextInt();
            int duration = sc.nextInt();
            Task task = new Task(time, duration, i);
            result[i] = 0;
            if (task.time > finish_time && remaining.isEmpty()) {
                running = true;
                finish_time = task.time + task.duration;
                result[i] = finish_time;
            } else {
                if (task.time >= finish_time && !remaining.isEmpty()) {
                    finish_time = run_task(remaining, finish_time);
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result[i] = -1;
                }
            }
        }
        while (!remaining.isEmpty()) {
            finish_time = run_task(remaining, finish_time);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int run_task(Queue<Task> remaining, int finish_time) {
        Task task_to_run = remaining.remove();
        finish_time = Math.max(finish_time, task_to_run.time) + task_to_run.duration;
        result[task_to_run.index] = finish_time;
        return finish_time;
    }
}

```

## 2.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 3.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 4.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 5.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 6.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 7.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 8.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 9.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 10.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 11.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 12.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 13.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 14.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 15.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 16.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 17.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 18.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 19.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 20.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 21.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 22.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 23.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 24.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 25.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 26.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 27.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 28.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 29.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 30.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 31.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 32.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 33.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 34.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 35.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 36.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 37.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 38.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 39.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 40.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 41.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 42.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 43.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 44.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 45.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 46.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 47.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 48.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 49.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 50.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 51.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 52.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 53.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 54.

Write a function that takes a list of integers and returns a list of integers that contains the same elements as the input list, but in reverse order.

```
def reverse(lst):
    return lst[::-1]

```

## 55.

Write a function that takes a list of integers
