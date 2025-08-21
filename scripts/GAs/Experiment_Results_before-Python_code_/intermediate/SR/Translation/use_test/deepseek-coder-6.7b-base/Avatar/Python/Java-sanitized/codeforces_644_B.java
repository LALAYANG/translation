import java.util.Queue;
import java.util.LinkedList;
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
        int finishTime = 0;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            int duration = scanner.nextInt();
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

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int runTask(Queue<Task> remaining, int finishTime) {
        Task taskToRun = remaining.poll();
        finishTime = Math.max(finishTime, taskToRun.time) + taskToRun.duration;
        return finishTime;
    }
}