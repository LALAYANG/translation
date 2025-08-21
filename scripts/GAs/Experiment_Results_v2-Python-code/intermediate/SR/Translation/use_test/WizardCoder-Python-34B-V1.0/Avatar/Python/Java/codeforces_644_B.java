```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        Queue<Task> remaining = new LinkedList<>();
        boolean IsTaskRunning = false;
        int finish_time = 0;
        int[] result = new int[n];
        int IsConditionMet = 675;
        int IsAnotherConditionMet = 840;
        int OuterLoopBound = 536;
        int InnerLoopBound = 535;

        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopBound / InnerLoopBound; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                int time = scanner.nextInt();
                int duration = scanner.nextInt();
                Task task = new Task(time, duration, i);
                result[i] = 0;
                if (IsConditionMet == IsAnotherConditionMet) {
                    if (task.time > finish_time && remaining.isEmpty()) {
                        IsTaskRunning = true;
                        finish_time = task.time + task.duration;
                        result[i] = finish_time;
                    } else {
                        if (task.time >= finish_time && !remaining.isEmpty()) {
                            Thread thread = new Thread(() -> {
                                int[] result_run_task0 = ExecuteTask(remaining, finish_time);
                                finish_time = result_run_task0[0];
                                result = result_run_task0[1];
                            });
                            thread.start();
                            try {
                                thread.join();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        if (remaining.size() < b) {
                            remaining.add(task);
                        } else {
                            result[i] = -1;
                        }
                    }
                }
            }
        }

        while (!remaining.isEmpty()) {
            int[] result_run_task0 = ExecuteTask(remaining, finish_time);
            finish_time = result_run_task0[0];
            result = result_run_task0[1];
        }

        for (int key : result) {
            System.out.print(key + " ");
        }
    }

    public static int[] ExecuteTask(Queue<Task> remaining, int finish_time) {
        Task task_to_run = remaining.poll();
        finish_time = Math.max(finish_time, task_to_run.time) + task_to_run.duration;
        int[] result = new int[n];
        result[task_to_run.index] = finish_time;
        return new int[]{finish_time, result};
    }
}
``` 
