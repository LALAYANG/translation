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
            Task newTask = new Task(time, duration, i);
            result[i] = 0;
            if (n & b) {
                if (newTask.time > finishTime && remaining.isEmpty()) {
                    running = true;
                    finishTime = newTask.time + newTask.duration;
                    result[i] = finishTime;
                } else {
                    if (newTask.time >= finishTime && !remaining.isEmpty()) {
                        Queue<int[]> queueRunTask0 = new LinkedList<>();
                        Thread threadRunTask0 = new Thread(() -> {
                            int[] resultRunTask0 = processTask(remaining, finishTime);
                            queueRunTask0.add(resultRunTask0);
                        });
                        threadRunTask0.start();
                        threadRunTask0.join();
                        int[] resultRunTask0 = queueRunTask0.poll();
                        finishTime = resultRunTask0[0];
                        result = resultRunTask0[1];
                    }
                    if (remaining.size() < b) {
                        remaining.add(newTask);
                    } else {
                        result[i] = -1;
                    }
                }
            }
        }
        while (!remaining.isEmpty()) {
            int[] resultRunTask0 = processTask(remaining, finishTime);
            finishTime = resultRunTask0[0];
            result = resultRunTask0[1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] processTask(Queue<Task> remaining, int finishTime) {
        Task taskToRun = remaining.poll();
        finishTime = Math.max(finishTime, taskToRun.time) + taskToRun.duration;
        int[] result = new int[2];
        result[0] = finishTime;
        result[1] = taskToRun.index;
        return result;
    }
}