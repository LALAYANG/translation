import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

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

class ProcessTask implements Callable<Map<Integer, Integer>> {
    Queue<Task> remaining;
    int finishTime;

    public ProcessTask(Queue<Task> remaining, int finishTime) {
        this.remaining = remaining;
        this.finishTime = finishTime;
    }

    @Override
    public Map<Integer, Integer> call() throws Exception {
        Task taskToRun = remaining.poll();
        finishTime = Math.max(finishTime, taskToRun.time) + taskToRun.duration;
        result.put(taskToRun.index, finishTime);
        return result;
    }
}

public class codeforces_644_B {
    static int n;
    static int b;
    static Queue<Task> remaining = new LinkedList<>();
    static boolean running = false;
    static int finishTime = 0;
    static Map<Integer, Integer> result = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        b = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            int duration = scanner.nextInt();
            Task newTask = new Task(time, duration, i);
            result.put(i, 0);
            if (time > finishTime && remaining.isEmpty()) {
                running = true;
                finishTime = newTask.time + newTask.duration;
                result.put(i, finishTime);
            } else {
                if (time >= finishTime && !remaining.isEmpty()) {
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<Map<Integer, Integer>> future = executor.submit(new ProcessTask(remaining, finishTime));
                    try {
                        result = future.get();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    executor.shutdown();
                }
                if (remaining.size() < b) {
                    remaining.add(newTask);
                } else {
                    result.put(i, -1);
                }
            }
        }
        while (!remaining.isEmpty()) {
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Map<Integer, Integer>> future = executor.submit(new ProcessTask(remaining, finishTime));
            try {
                result = future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            executor.shutdown();
        }
        for (int key : result.keySet()) {
            System.out.print(result.get(key) + " ");
        }
    }
}