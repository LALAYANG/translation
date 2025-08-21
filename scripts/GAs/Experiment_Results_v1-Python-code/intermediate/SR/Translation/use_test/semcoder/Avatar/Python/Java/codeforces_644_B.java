Thought process:
1. Understand the provided code snippet and the problem it aims to solve.
2. Translate the Python code to Java, ensuring that the logic is preserved while adapting it to the Java environment.
3. Test the Java solution with the provided test input to verify its correctness.

```java
import java.util.Queue;
import java.util.LinkedList;

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
        int n = 10;
        int b = 3;
        Queue<Task> remaining = new LinkedList<>();
        boolean running = false;
        int finish_time = 0;

        for (int i = 0; i < n; i++) {
            String[] input = "1 14".split(" ");
            int time = Integer.parseInt(input[0]);
            int duration = Integer.parseInt(input[1]);
            Task new_task = new Task(time, duration, i);
            result.put(i, 0);
            if ((n & b) != 0) {
                if (new_task.time > finish_time && remaining.isEmpty()) {
                    running = true;
                    finish_time = new_task.time + new_task.duration;
                    result.put(i, finish_time);
                } else {
                    if (new_task.time >= finish_time && !remaining.isEmpty()) {
                        Thread thread_run_task0 = new Thread(() -> {
                            int[] result_run_task0 = process_task(remaining, finish_time);
                            finish_time = result_run_task0[0];
                            result = result_run_task0[1];
                        });
                        thread_run_task0.start();
                        try {
                            thread_run_task0.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (remaining.size() < b) {
                        remaining.add(new_task);
                    } else {
                        result.put(i, -1);
                    }
                }
            }
        }

        while (!remaining.isEmpty()) {
            int[] result_run_task0 = process_task(remaining, finish_time);
            finish_time = result_run_task0[0];
            result = result_run_task0[1];
        }

        for (int key : result.keySet()) {
            System.out.print(result.get(key) + " ");
        }
    }

    private static int[] process_task(Queue<Task> remaining, int finish_time) {
        Task task_to_run = remaining.poll();
        finish_time = Math.max(finish_time, task_to_run.time) + task_to_run.duration;
        result.put(task_to_run.index, finish_time);
        return new int[]{finish_time, result};
    }
}
```
