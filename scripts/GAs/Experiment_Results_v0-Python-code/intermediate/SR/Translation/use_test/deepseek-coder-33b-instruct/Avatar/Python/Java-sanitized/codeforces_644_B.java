import java.util.*;
import java.util.concurrent.*;

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
    static int finish_time = 0;
    static boolean running = false;
    static ConcurrentLinkedQueue<Task> remaining = new ConcurrentLinkedQueue<>();
    static ConcurrentHashMap<Integer, Integer> result = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            int duration = scanner.nextInt();
            Task task = new Task(time, duration, i);
            result.put(i, 0);
            if ((time > finish_time && remaining.isEmpty()) || (time >= finish_time && !remaining.isEmpty())) {
                if (remaining.isEmpty()) {
                    running = true;
                    finish_time = task.time + task.duration;
                    result.put(task.index, finish_time);
                } else {
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executor.submit(() -> runTask(task));
                    try {
                        finish_time = future.get();
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                    executor.shutdown();
                }
            } else {
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result.put(task.index, -1);
                }
            }
        }

        while (!remaining.isEmpty()) {
            Task task = remaining.poll();
            finish_time = Math.max(finish_time, task.time) + task.duration;
            result.put(task.index, finish_time);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    public static int runTask(Task task) {
        finish_time = Math.max(finish_time, task.time) + task.duration;
        return finish_time;
    }
}