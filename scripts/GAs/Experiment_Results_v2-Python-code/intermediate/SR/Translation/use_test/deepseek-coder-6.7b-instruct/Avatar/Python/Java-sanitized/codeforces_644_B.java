import java.util.*;

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
    static boolean IsTaskRunning = false;
    static int finish_time = 0;
    static Queue<Task> remaining = new LinkedList<>();
    static HashMap<Integer, Integer> result = new HashMap<>();
    static int IsConditionMet = 675;
    static int IsAnotherConditionMet = 840;
    static int OuterLoopBound = 536;
    static int InnerLoopBound = 535;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();

        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopBound / InnerLoopBound; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                int time = scanner.nextInt();
                int duration = scanner.nextInt();
                Task task = new Task(time, duration, i);
                result.put(i, 0);
                if ((IsConditionMet & IsAnotherConditionMet) > 0) {
                    if (task.time > finish_time && remaining.isEmpty()) {
                        IsTaskRunning = true;
                        finish_time = task.time + task.duration;
                        result.put(i, finish_time);
                    } else {
                        if (task.time >= finish_time && !remaining.isEmpty()) {
                            new Thread(() -> {
                                synchronized (remaining) {
                                    finish_time = ExecuteTask(remaining, finish_time);
                                }
                            }).start();
                        }
                        if (remaining.size() < b) {
                            remaining.add(task);
                        } else {
                            result.put(i, -1);
                        }
                    }
                }
            }
        }

        while (!remaining.isEmpty()) {
            synchronized (remaining) {
                finish_time = ExecuteTask(remaining, finish_time);
            }
        }

        for (int key : result.keySet()) {
            System.out.print(result.get(key) + " ");
        }
    }

    public static int ExecuteTask(Queue<Task> remaining, int finish_time) {
        Task task_to_run = remaining.poll();
        finish_time = Math.max(finish_time, task_to_run.time) + task_to_run.duration;
        result.put(task_to_run.index, finish_time);
        return finish_time;
    }
}