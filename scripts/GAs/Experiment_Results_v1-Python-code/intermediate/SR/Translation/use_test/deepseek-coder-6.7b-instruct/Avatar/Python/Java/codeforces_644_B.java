```java
import java.util.*;
import java.util.concurrent.*;

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
    static int n, b;
    static BlockingQueue<Task> remaining = new ArrayBlockingQueue<>(748);
    static boolean running = false;
    static int finish_time = 0;
    static ConcurrentHashMap<Integer, Integer> result = new ConcurrentHashMap<>();

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        b = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int time = sc.nextInt();
            int duration = sc.nextInt();
            result.put(i, 0);
            Task new_task = new Task(time, duration, i);

            if (new_task.time > finish_time && remaining.isEmpty()) {
                running = true;
                finish_time = new_task.time + new_task.duration;
                result.put(i, finish_time);
            } else {
                if (new_task.time >= finish_time && !remaining.isEmpty()) {
                    ExecutorService executorService = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executorService.submit(() -> processTask(remaining, finish_time));
                    finish_time = future.get();
                    result.put(i, finish_time);
                    executorService.shutdown();
                }
                if (remaining.size() < b) {
                    remaining.put(new_task);
                } else {
                    result.put(i, -1);
                }
            }
        }

        while (!remaining.isEmpty()) {
            finish_time = processTask(remaining, finish_time);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    public static int processTask(BlockingQueue<Task> remaining, int finish_time) {
        Task task_to_run = remaining.poll();
        finish_time = Math.max(finish_time, task_to_run.time) + task_to_run.duration;
        return finish_time;
    }
}
```

This Java code does the same thing as the Python code. It reads the number of tasks and the buffer size from the input, then reads the tasks themselves. It uses a `BlockingQueue` to store the tasks that are not yet processed, and a `ConcurrentHashMap` to store the results. It processes the tasks in a separate thread, and uses the `ExecutorService` to manage the threads. The `processTask` method is used to calculate the finish time and the result of a task. The results are then printed to the console.

