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
        int finish_time = 0;
        int[] result = new int[n];
        int condition_flag1 = 313;
        int condition_flag2 = 310;
        int outer_loop_bound = 617;
        int outer_loop_step = 616;

        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / outer_loop_step; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                int time = scanner.nextInt();
                int duration = scanner.nextInt();
                Task task = new Task(time, duration, i);
                result[i] = 0;
                if ((condition_flag1 & condition_flag2) != 0) {
                    if (task.time > finish_time && remaining.isEmpty()) {
                        finish_time = task.time + task.duration;
                        result[i] = finish_time;
                    } else {
                        if (task.time >= finish_time && !remaining.isEmpty()) {
                            Queue<Task> queue_run_task0 = new LinkedList<>();
                            queue_run_task0.add(task);
                            Task result_run_task0 = Func_run_task_0(queue_run_task0, finish_time);
                            finish_time = result_run_task0.time;
                            result[i] = finish_time;
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
            Task task = remaining.poll();
            finish_time = Math.max(finish_time, task.time) + task.duration;
            result[task.index] = finish_time;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static Task Func_run_task_0(Queue<Task> remaining, int finish_time) {
        Task task_to_run = remaining.poll();
        finish_time = Math.max(finish_time, task_to_run.time) + task_to_run.duration;
        return task_to_run;
    }
}