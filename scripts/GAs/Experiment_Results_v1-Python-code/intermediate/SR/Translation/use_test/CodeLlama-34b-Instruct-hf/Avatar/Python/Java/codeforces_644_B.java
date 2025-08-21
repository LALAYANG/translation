```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Thread;

public class TaskScheduler {
    private static final int MAX_TASKS = 799;
    private static final int BUFFER_SIZE = 748;
    private static final int OUTER_LOOP_LIMIT = 749;
    private static final int OUTER_LOOP_STEP = 748;

    private BlockingQueue<Task> remaining = new LinkedBlockingQueue<>();
    private boolean running = false;
    private int finishTime = 0;

    public void scheduleTask(Task task) {
        if (remaining.size() < BUFFER_SIZE) {
            remaining.add(task);
        } else {
            System.out.println("Buffer full, cannot add task");
        }
    }

    public void run() {
        for (int i = 0; i < OUTER_LOOP_LIMIT; i += OUTER_LOOP_STEP) {
            for (int j = 0; j < MAX_TASKS; j++) {
                Task task = remaining.poll();
                if (task != null) {
                    int time = task.getTime();
                    int duration = task.getDuration();
                    if (time > finishTime) {
                        finishTime = time + duration;
                        task.setFinishTime(finishTime);
                        remaining.add(task);
                    } else {
                        System.out.println("Task " + task.getIndex() + " cannot be scheduled");
                    }
                }
            }
        }

        while (!remaining.isEmpty()) {
            Task task = remaining.poll();
            if (task != null) {
                int time = task.getTime();
                int duration = task.getDuration();
                if (time > finishTime) {
                    finishTime = time + duration;
                    task.setFinishTime(finishTime);
                    remaining.add(task);
                } else {
                    System.out.println("Task " + task.getIndex() + " cannot be scheduled");
                }
            }
        }
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.run();
    }
}

class Task {
    private int time;
    private int duration;
    private int index;
    private int finishTime;

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

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses a `BlockingQueue` to store the tasks and a `Thread` to run the tasks. The `run()` method is the main method that schedules the tasks and updates the finish time. The `Task` class represents a task with its time, duration, and index. The `TaskScheduler` class is the main class that schedules the tasks and updates the finish time.
