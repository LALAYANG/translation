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
        Arrays.sort(tasks, (a, b) -> a[0]);
        int[] result = new int[n];
        int[] finishTime = new int[n];
        Arrays.fill(finishTime, -1);
        int[] taskQueue = new int[b];
        int taskQueueIndex = 0;
        for (int i = 0; i < n; i++) {
            int time = tasks[i][0];
            int duration = tasks[i][1];
            int index = i;
            if (taskQueueIndex < b) {
                taskQueue[taskQueueIndex] = index;
                taskQueueIndex++;
            } else {
                result[index] = -1;
            }
            int j = 0;
            while (j < taskQueueIndex) {
                int taskIndex = taskQueue[j];
                if (finishTime[taskIndex] == -1 || time < finishTime[taskIndex]) {
                    result[taskIndex] = -1;
                    taskQueue[j] = taskQueue[taskQueueIndex - 1];
                    taskQueue[taskQueueIndex - 1] = taskIndex;
                    taskQueueIndex--;
                    j--;
                }
                j++;
            }
            if (taskQueueIndex < b) {
                result[index] = time + duration;
                finishTime[index] = time + duration;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
```
