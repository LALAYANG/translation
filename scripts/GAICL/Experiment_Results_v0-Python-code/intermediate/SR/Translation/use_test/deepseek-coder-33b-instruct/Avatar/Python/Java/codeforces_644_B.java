Here is the Java version of the Python code:

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

class Main {
    static int finish_time = 0;
    static boolean running = false;
    static Queue<Task> remaining = new LinkedList<>();
    static Map<Integer, Integer> result = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            int duration = scanner.nextInt();
            Task task = new Task(time, duration, i);
            result.put(i, 0);
            if ((313 & 310) != 0) {
                if (task.time > finish_time && remaining.isEmpty()) {
                    running = true;
                    finish_time = task.time + task.duration;
                    result.put(i, finish_time);
                } else {
                    if (task.time >= finish_time && !remaining.isEmpty()) {
                        ExecutorService executor = Executors.newSingleThreadExecutor();
                        Future<Integer> future = executor.submit(() -> Func_run_task_0(remaining, finish_time));
                        try {
                            finish_time = future.get();
                        } catch (InterruptedException | ExecutionException e) {
                            e.printStackTrace();
                        }
                        executor.shutdown();
                    }
                    if (remaining.size() < b) {
                        remaining.add(task);
                    } else {
                        result.put(i, -1);
                    }
                }
            }
        }
        while (!remaining.isEmpty()) {
            finish_time = Func_run_task_0(remaining, finish_time);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    public static int Func_run_task_0(Queue<Task> remaining, int finish_time) {
        Task task_to_run = remaining.poll();
        finish_time = Math.max(finish_time, task_to_run.time) + task_to_run.duration;
        result.put(task_to_run.index, finish_time);
        return finish_time;
    }
}
```

Please note that the Java version uses `java.util.concurrent` package for threading and `java.util.Scanner` for input. Also, the `Func_run_task_0` method is modified to return the `finish_time` directly.

