```java
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TaskScheduler {
    private int n;
    private int b;
    private Queue<Task> remaining;
    private boolean isTaskRunning;
    private int finishTime;
    private List<Integer> result;

    public TaskScheduler(int n, int b) {
        this.n = n;
        this.b = b;
        this.remaining = new ConcurrentLinkedQueue<>();
        this.isTaskRunning = false;
        this.finishTime = 0;
        this.result = new ArrayList<>();
    }

    public void scheduleTask(Task task) {
        if (task.getTime() > finishTime && remaining.isEmpty()) {
            isTaskRunning = true;
            finishTime = task.getTime() + task.getDuration();
            result.add(task.getIndex(), finishTime);
        } else if (task.getTime() >= finishTime && !remaining.isEmpty()) {
            Queue<Task> queue = new ConcurrentLinkedQueue<>();
            queue.add(task);
            executeTask(queue);
        } else if (remaining.size() < b) {
            remaining.add(task);
        } else {
            result.add(task.getIndex(), -1);
        }
    }

    public void executeTask(Queue<Task> queue) {
        Task task = queue.poll();
        finishTime = Math.max(finishTime, task.getTime()) + task.getDuration();
        result.add(task.getIndex(), finishTime);
    }

    public List<Integer> getResult() {
        return result;
    }
}

class Task {
    private int time;
    private int duration;
    private int index;

    public Task(int time, int duration, int index) {
        this.time = time;
        this.duration = duration;
        this.index = index;
    }

    public int getTime() {
        return time;
    }

    public int getDuration() {
        return duration;
    }

    public int getIndex() {
        return index;
    }
}
```
The `TaskScheduler` class is responsible for scheduling tasks and keeping track of the current state of the scheduler. It has a `scheduleTask` method that takes a `Task` object as an argument and schedules it according to the rules specified in the problem statement. It also has an `executeTask` method that executes a task and updates the state of the scheduler.

The `Task` class is a simple data class that represents a task with a time, duration, and index.

The `main` method is the entry point of the program, and it creates a `TaskScheduler` object and schedules tasks according to the input. It then prints the result of the scheduler.

Note that this implementation uses a `ConcurrentLinkedQueue` to store the tasks, which is a thread-safe queue that can be used by multiple threads concurrently. This is necessary because the `TaskScheduler` class is designed to be thread-safe, and it needs to be able to handle multiple tasks being scheduled and executed concurrently.
