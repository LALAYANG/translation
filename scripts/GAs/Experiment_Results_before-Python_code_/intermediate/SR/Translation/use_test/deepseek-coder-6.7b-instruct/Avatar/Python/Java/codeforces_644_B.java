```java
import java.util.*;

class Task implements Comparable<Task> {
    int time;
    int duration;
    int index;

    public Task(int time, int duration, int index) {
        this.time = time;
        this.duration = duration;
        this.index = index;
    }

    @Override
    public int compareTo(Task other) {
        return this.time - other.time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();

        PriorityQueue<Task> remaining = new PriorityQueue<>();
        boolean running = false;
        int[] result = new int[n];
        int finishTime = 0;

        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            int duration = scanner.nextInt();
            Task task = new Task(time, duration, i);
            result[i] = 0;

            if (task.time > finishTime && remaining.isEmpty()) {
                running = true;
                finishTime = task.time + task.duration;
                result[i] = finishTime;
            } else {
                if (task.time >= finishTime && !remaining.isEmpty()) {
                    finishTime = runTask(remaining, finishTime);
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result[i] = -1;
                }
            }
        }

        while (!remaining.isEmpty()) {
            finishTime = runTask(remaining, finishTime);
        }

        for (int r : result) {
            System.out.print(r + " ");
        }
    }

    private static int runTask(PriorityQueue<Task> remaining, int finishTime) {
        Task taskToRun = remaining.poll();
        finishTime = Math.max(finishTime, taskToRun.time) + taskToRun.duration;
        return finishTime;
    }
}
```

This Java code does the same thing as the Python code. It reads the number of tasks and the maximum number of tasks that can be run simultaneously from the input, then reads the time and duration of each task. It uses a priority queue to keep track of the tasks that are not yet run, and an array to keep track of the finish time of each task. The tasks are run in order of their time, and if a task cannot be run because there are too many tasks already running, it is added to the priority queue. The finish time of each task is printed at the end.

