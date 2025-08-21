import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class codeforces_644_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        Queue<Task> remaining = new LinkedList<>();
        boolean running = false;
        int finish_time = 0;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int time = sc.nextInt();
            int duration = sc.nextInt();
            Task task = new Task(time, duration, i);
            result[i] = 0;
            if (task.time > finish_time && remaining.isEmpty()) {
                running = true;
                finish_time = task.time + task.duration;
                result[i] = finish_time;
            } else {
                if (task.time >= finish_time && !remaining.isEmpty()) {
                    finish_time = runTask(remaining, finish_time, result);
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result[i] = -1;
                }
            }
        }
        while (!remaining.isEmpty()) {
            finish_time = runTask(remaining, finish_time, result);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int runTask(Queue<Task> remaining, int finish_time, int[] result) {
        Task task = remaining.poll();
        finish_time = Math.max(finish_time, task.time) + task.duration;
        result[task.index] = finish_time;
        return finish_time;
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