```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] tasks = new int[n];
        int[] result = new int[n];
        PriorityQueue<Task> remaining = new PriorityQueue<>(Comparator.comparingInt(Task::getTime));
        boolean isTaskRunning = false;
        int finishTime = 0;

        for (int i = 0; i < n; i++) {
            int time = sc.nextInt();
            int duration = sc.nextInt();
            tasks[i] = duration;
            result[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            int time = sc.nextInt();
            int duration = sc.nextInt();
            Task task = new Task(time, duration, i);
            if (isTaskRunning && task.getTime() > finishTime && remaining.isEmpty()) {
                finishTime = task.getTime() + task.getDuration();
                result[i] = finishTime;
            } else {
                if (task.getTime() >= finishTime && !remaining.isEmpty()) {
                    Task runTask = remaining.poll();
                    while (runTask != null && runTask.getTime() < task.getTime()) {
                        runTask = remaining.poll();
                    }
                    if (runTask != null) {
                        result[runTask.getIndex()] = runTask.getTime() + runTask.getDuration();
                    }
                }
                if (remaining.size() < b) {
                    remaining.offer(task);
                } else {
                    result[i] = -1;
                }
            }
        }

        while (!remaining.isEmpty()) {
            Task runTask = remaining.poll();
            result[runTask.getIndex()] = runTask.getTime() + runTask.getDuration();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

class Task implements Comparable<Task> {
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

    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.time, o.time);
    }
}
```
