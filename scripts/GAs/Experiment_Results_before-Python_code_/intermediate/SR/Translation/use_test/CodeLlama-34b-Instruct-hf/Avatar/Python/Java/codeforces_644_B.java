```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        Task[] tasks = new Task[n];
        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            int duration = scanner.nextInt();
            tasks[i] = new Task(time, duration, i);
        }

        Queue<Task> remaining = new LinkedList<>();
        int finishTime = 0;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            Task task = tasks[i];
            if (task.time > finishTime && remaining.isEmpty()) {
                finishTime = task.time + task.duration;
                result[task.index] = finishTime;
            } else {
                if (task.time >= finishTime && !remaining.isEmpty()) {
                    finishTime = runTask(remaining, finishTime);
                    result[task.index] = finishTime;
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result[task.index] = -1;
                }
            }
        }

        while (!remaining.isEmpty()) {
            finishTime = runTask(remaining, finishTime);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int runTask(Queue<Task> remaining, int finishTime) {
        Task task = remaining.poll();
        finishTime = Math.max(finishTime, task.time) + task.duration;
        return finishTime;
    }

    static class Task {
        int time;
        int duration;
        int index;

        public Task(int time, int duration, int index) {
            this.time = time;
            this.duration = duration;
            this.index = index;
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses a `Queue` to store the tasks and a `Task` class to represent each task. The `runTask` method is used to run a task and update the finish time. The `main` method is used to read the input, create the tasks, and run the tasks. The `result` array is used to store the finish times of each task.
