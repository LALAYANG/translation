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
    static BlockingQueue<Task> remaining = new ArrayBlockingQueue<>(100);
    static boolean running = false;
    static int finish_time = 0;
    static ConcurrentHashMap<Integer, Integer> result = new ConcurrentHashMap<>();
    static int condition_flag1 = 313;
    static int condition_flag2 = 310;
    static int outer_loop_bound = 617;
    static int outer_loop_step = 616;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        b = scanner.nextInt();

        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / outer_loop_step; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                int time = scanner.nextInt();
                int duration = scanner.nextInt();
                Task task = new Task(time, duration, i);
                result.put(i, 0);
                if ((condition_flag1 & condition_flag2) != 0) {
                    if (task.time > finish_time && remaining.isEmpty()) {
                        running = true;
                        finish_time = task.time + task.duration;
                        result.put(i, finish_time);
                    } else {
                        if (task.time >= finish_time && !remaining.isEmpty()) {
                            ExecutorService executorService = Executors.newSingleThreadExecutor();
                            Future<Integer> future = executorService.submit(() -> func_run_task_0(remaining, finish_time));
                            finish_time = future.get();
                            result.put(i, finish_time);
                            executorService.shutdown();
                        }
                        if (remaining.size() < b) {
                            remaining.put(task);
                        } else {
                            result.put(i, -1);
                        }
                    }
                }
            }
        }

        while (!remaining.isEmpty()) {
            finish_time = func_run_task_0(remaining, finish_time);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    public static int func_run_task_0(BlockingQueue<Task> remaining, int finish_time) {
        Task task_to_run = remaining.poll();
        finish_time = Math.max(finish_time, task_to_run.time) + task_to_run.duration;
        result.put(task_to_run.index, finish_time);
        return finish_time;
    }
}
```

This Java code does the same thing as the Python code. It uses Java's `ConcurrentHashMap` for the `result` dictionary, `ArrayBlockingQueue` for the `remaining` queue, and `ExecutorService` for multithreading. The `Scanner` class is used for input reading. The `func_run_task_0` method is a replacement for the Python function `Func_run_task_0`. The `main` method is the entry point of the program.

