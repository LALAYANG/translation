
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class Task {
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

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int b = 3;
        Queue<Task> remaining = new LinkedList<>();
        boolean running = false;
        int finishTime = 0;

        for (int i = 0; i < n; i++) {
            int time = ThreadLocalRandom.current().nextInt(1, 30);
            int duration = ThreadLocalRandom.current().nextInt(1, 10);
            Task newTask = new Task(time, duration, i);
            if (newTask.getTime() > finishTime && remaining.isEmpty()) {
                running = true;
                finishTime = newTask.getTime() + newTask.getDuration();
            } else {
                if (newTask.getTime() >= finishTime && !remaining.isEmpty()) {
                    Queue<Task> queueRunTask0 = new LinkedList<>();

                    Thread threadRunTask0 = new Thread(() -> {
                        Task taskToRun = remaining.poll();
                        finishTime = Math.max(finishTime, taskToRun.getTime()) + taskToRun.getDuration();
                        System.out.println(finishTime);
                    });

                    threadRunTask0.start();
                    threadRunTask0.join();
                }
                if (remaining.size() < b) {
                    remaining.add(newTask);
                } else {
                    System.out.println(-1);
                }
            }
        }

        while (!remaining.isEmpty()) {
            Task taskToRun = remaining.poll();
            finishTime = Math.max(finishTime, taskToRun.getTime()) + taskToRun.getDuration();
            System.out.println(finishTime);
        }
    }
}
```
This code uses the `ThreadLocalRandom` class to generate random numbers for the `time` and `duration` variables, and the `LinkedList` class to implement the `Queue` data structure. The `main` method creates a `Queue` of `Task` objects, and then iterates over the `n` tasks, adding each task to the queue if it is not full, or printing -1 if the queue is full. The `main` method also starts a new thread to run the task if the task's time is greater than or equal to the current finish time, and the queue is not empty. The thread updates the finish time and prints the new finish time. The `main` method then waits for the thread to finish, and then updates the finish time and prints the new finish time. Finally, the `main` method iterates over the remaining tasks in the queue, updating the finish time and printing the new finish time for each task.
