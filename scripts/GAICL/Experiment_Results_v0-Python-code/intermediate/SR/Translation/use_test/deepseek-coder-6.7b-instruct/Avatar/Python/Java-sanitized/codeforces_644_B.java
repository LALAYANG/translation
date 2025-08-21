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
    static int n, b;
    static BlockingQueue<Task> remaining = new ArrayBlockingQueue<>(100);
    static boolean running = false;
    static int finish_time = 0;
    static ConcurrentHashMap<Integer, Integer> result = new ConcurrentHashMap<>();

    static void run_task_thread(BlockingQueue<Task> remaining, int finish_time) {
        try {
            Task task_to_run = remaining.take();
            finish_time = Math.max(finish_time, task_to_run.time) + task_to_run.duration;
            result.put(task_to_run.index, finish_time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        b = scanner.nextInt();

        ExecutorService executorService = Executors.newFixedThreadPool(n);

        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            int duration = scanner.nextInt();
            Task task = new Task(time, duration, i);
            result.put(i, 0);

            if (time > finish_time && remaining.isEmpty()) {
                running = true;
                finish_time = time + duration;
                result.put(i, finish_time);
            } else {
                if (time >= finish_time && (!remaining.isEmpty())) {
                    Future<?> future = executorService.submit(() -> run_task_thread(remaining, finish_time));
                    try {
                        future.get();
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result.put(i, -1);
                }
            }
        }

        while (!remaining.isEmpty()) {
            run_task_thread(remaining, finish_time);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result.get(i) + " ");
        }

        executorService.shutdown();
    }
}