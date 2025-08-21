Thought process:
1. Define a Task class to represent tasks with time, duration, and index attributes.
2. Implement the run_task function to run a task and update the finish time and result dictionary.
3. Process input tasks, update finish time, and manage task queue based on conditions.
4. Run tasks until the remaining queue is empty, updating the result dictionary with finish times.
5. Print the final result dictionary values.

```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

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

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        Queue<Task> remaining = new LinkedList<>();
        boolean running = false;
        int finishTime = 0;

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int time = sc.nextInt();
            int duration = sc.nextInt();
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

        for (int res : result) {
            System.out.print(res + " ");
        }
    }

    private static int runTask(Queue<Task> remaining, int finishTime) {
        Task taskToRun = remaining.poll();
        finishTime = Math.max(finishTime, taskToRun.time) + taskToRun.duration;
        return finishTime;
    }
}
```
