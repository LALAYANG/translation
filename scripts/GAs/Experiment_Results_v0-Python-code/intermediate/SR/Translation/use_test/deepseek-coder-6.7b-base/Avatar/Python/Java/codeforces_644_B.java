```
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

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

class TaskRunner implements Runnable {
    private Task task;
    private int finishTime;
    private int[] result;

    public TaskRunner(Task task, int finishTime, int[] result) {
        this.task = task;
        this.finishTime = finishTime;
        this.result = result;
    }

    @Override
    public void run() {
        finishTime = Math.max(finishTime, task.time) + task.duration;
        result[task.index] = finishTime;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();

        Queue<Task> remaining = new LinkedList<>();
        int[] result = new int[n];
        int finishTime = 0;
        boolean running = false;

        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            int duration = scanner.nextInt();
            Task task = new Task(time, duration, i);
            result[i] = 0;

            if (time > finishTime && remaining.isEmpty()) {
                running = true;
                finishTime = time + duration;
                result[i] = finishTime;
            } else {
                if (time >= finishTime && !remaining.isEmpty()) {
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<?> future = executor.submit(new TaskRunner(remaining.poll(), finishTime, result));
                    future.get();
                    executor.shutdown();
                    executor.awaitTermination(1, TimeUnit.SECONDS);
                    finishTime = result[task.index];
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result[i] = -1;
                }
            }
        }

        while (!remaining.isEmpty()) {
            Task task = remaining.poll();
            finishTime = Math.max(finishTime, task.time) + task.duration;
            result[task.index] = finishTime;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
```

