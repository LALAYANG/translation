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

public class codeforces_644_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        Queue<Task> remaining = new LinkedList<>();
        boolean running = false;
        int finish_time = 0;
        int[] result = new int[n];
        int MaxTasks = 799;
        int BufferSize = 748;
        int OuterLoopLimit = 749;
        int OuterLoopStep = 748;

        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / OuterLoopStep; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                int time = scanner.nextInt();
                int duration = scanner.nextInt();
                Task new_task = new Task(time, duration, i);
                result[i] = 0;
                if ((MaxTasks & BufferSize) != 0) {
                    if (new_task.time > finish_time && remaining.isEmpty()) {
                        running = true;
                        finish_time = new_task.time + new_task.duration;
                        result[i] = finish_time;
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
                            result[i] = -1;
                        }
                    }
                }
            }
        }

        while (!remaining.isEmpty()) {
            int[] result_run_task0 = process_task(remaining, finish_time);
            finish_time = result_run_task0[0];
            result = result_run_task0[1];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] process_task(Queue<Task> remaining, int finish_time) {
        Task task_to_run = remaining.poll();
        finish_time = Math.max(finish_time, task_to_run.time) + task_to_run.duration;
        int[] result = new int[n];
        result[task_to_run.index] = finish_time;
        return new int[]{finish_time, result};
    }
}