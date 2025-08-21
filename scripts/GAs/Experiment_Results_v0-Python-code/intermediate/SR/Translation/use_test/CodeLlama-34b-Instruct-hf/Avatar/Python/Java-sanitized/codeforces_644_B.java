import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_644_B {
    private int n;
    private int b;
    private Queue<Task> remaining;
    private boolean running;
    private int finishTime;
    private int[] result;

    public TaskScheduler(int n, int b) {
        this.n = n;
        this.b = b;
        this.remaining = new LinkedList<>();
        this.running = false;
        this.finishTime = 0;
        this.result = new int[n];
    }

    public void scheduleTasks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            int duration = scanner.nextInt();
            Task task = new Task(time, duration, i);
            remaining.add(task);
            result[i] = 0;
        }

        while (!remaining.isEmpty()) {
            Task task = remaining.poll();
            if (task.time > finishTime && remaining.isEmpty()) {
                running = true;
                finishTime = task.time + task.duration;
                result[task.index] = finishTime;
            } else {
                if (task.time >= finishTime && !remaining.isEmpty()) {
                    runTask(task);
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result[task.index] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private void runTask(Task task) {
        finishTime = Math.max(finishTime, task.time) + task.duration;
        result[task.index] = finishTime;
    }

    public static void main(String[] args) {
        int n = 10;
        int b = 3;
        TaskScheduler scheduler = new TaskScheduler(n, b);
        scheduler.scheduleTasks();
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