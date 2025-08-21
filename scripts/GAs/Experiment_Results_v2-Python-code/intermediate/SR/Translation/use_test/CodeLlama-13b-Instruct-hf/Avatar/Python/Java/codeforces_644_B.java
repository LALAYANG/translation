
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
        boolean isTaskRunning = false;
        int finishTime = 0;

        for (int i = 0; i < n; i++) {
            int time = 1;
            int duration = 14;
            Task task = new Task(time, duration, i);
            remaining.add(task);
        }

        while (!remaining.isEmpty()) {
            Task taskToRun = remaining.poll();
            finishTime = Math.max(finishTime, taskToRun.getTime()) + taskToRun.getDuration();
            int result = finishTime;
            if (remaining.size() < b) {
                remaining.add(taskToRun);
            } else {
                result = -1;
            }
            System.out.println(result);
        }
    }
}
```
This code uses the `LinkedList` class from the `java.util` package to implement the queue data structure. It also uses the `Math.max()` method to calculate the maximum of two numbers.

Note that the code is not exactly the same as the Python code, as the Java code does not use the `threading` module or the `queue` module. However, the logic of the code is the same, and it should produce the same output as the Python code.
