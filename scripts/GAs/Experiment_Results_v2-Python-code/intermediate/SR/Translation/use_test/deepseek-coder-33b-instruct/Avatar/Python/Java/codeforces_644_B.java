Here is the Java version of your Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

class Task {
    int time;
    int duration;
    int index;

    Task(int time, int duration, int index) {
        this.time = time;
        this.duration = duration;
        this.index = index;
    }
}

class Main {
    static AtomicInteger finishTime = new AtomicInteger(0);
    static BlockingQueue<Task> remaining = new LinkedBlockingQueue<>();
    static int[] result;

    public static void main(String[] args) throws InterruptedException {
        int n = 10;
        int b = 3;
        result = new int[n];

        for (int i = 0; i < n; i++) {
            int time = 0; // replace with your input
            int duration = 0; // replace with your input
            Task task = new Task(time, duration, i);
            result[i] = 0;
            if (remaining.isEmpty()) {
                finishTime.set(Math.max(finishTime.get(), task.time) + task.duration);
                result[i] = finishTime.get();
            } else {
                if (task.time >= finishTime.get()) {
                    Thread thread = new Thread(() -> executeTask(remaining, finishTime.get()));
                    thread.start();
                    thread.join();
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result[i] = -1;
                }
            }
        }

        while (!remaining.isEmpty()) {
            executeTask(remaining, finishTime.get());
        }

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }

    static void executeTask(BlockingQueue<Task> remaining, int finishTime) {
        Task taskToRun = remaining.poll();
        finishTime = Math.max(finishTime, taskToRun.time) + taskToRun.duration;
        result[taskToRun.index] = finishTime;
    }
}
```

Please note that this Java code is a direct translation of your Python code and may not work as expected because the Python code is using Python's built-in threading and queue libraries, which are not available in Java. In Java, you would typically use Java's built-in concurrency utilities, such as `ExecutorService` and `BlockingQueue`, to achieve similar functionality.

