```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[][] tasks = new int[n][2];
        for (int i = 0; i < n; i++) {
            tasks[i][0] = sc.nextInt();
            tasks[i][1] = sc.nextInt();
        }
        Arrays.sort(tasks, (a, b) -> a[0] - b[0]);
        int[] result = new int[n];
        int finishTime = 0;
        Queue<Task> remaining = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int time = tasks[i][0];
            int duration = tasks[i][1];
            Task task = new Task(time, duration, i);
            if (finishTime < time) {
                finishTime = time + duration;
                result[i] = finishTime;
            } else {
                if (remaining.size() < b) {
                    remaining.offer(task);
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
```
