import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_644_B {
    public static void main(String[] args) {
        // Read input
        List<Integer> input = Arrays.asList(args).stream().map(Integer::parseInt).collect(Collectors.toList());
        int n = input.get(0);
        int b = input.get(1);

        // Create a queue to store the tasks
        Queue<Task> remaining = new ArrayDeque<>();

        // Create a thread to run the tasks in parallel
        Thread thread = new Thread(() -> {
            while (!remaining.isEmpty()) {
                Task task = remaining.poll();
                if (task.time > finishTime && remaining.isEmpty()) {
                    running = true;
                    finishTime = task.time + task.duration;
                    result.put(task.index, finishTime);
                } else {
                    if (task.time >= finishTime && !remaining.isEmpty()) {
                        Queue<Task> queueRunTask0 = new ArrayDeque<>();

                        // Run the task in a separate thread
                        Thread threadRunTask0 = new Thread(() -> {
                            result = Func_run_task_0(remaining, finishTime);
                            queueRunTask0.offer(result);
                        });
                        threadRunTask0.start();
                        threadRunTask0.join();
                        resultRunTask0 = queueRunTask0.poll();
                        (finishTime, result) = resultRunTask0;
                    }
                    if (remaining.size() < b) {
                        remaining.offer(task);
                    } else {
                        result.put(task.index, -1);
                    }
                }
            }
        });
        thread.start();

        // Create a map to store the results
        Map<Integer, Integer> result = new HashMap<>();

        // Loop through the tasks and schedule them
        for (int i = 0; i < n; i++) {
            Task task = new Task(input.get(i), input.get(i + 1), i);
            result.put(task.index, 0);
            if (conditionFlag1 & conditionFlag2) {
                if (task.time > finishTime && remaining.isEmpty()) {
                    running = true;
                    finishTime = task.time + task.duration;
                    result.put(task.index, finishTime);
                } else {
                    if (task.time >= finishTime && !remaining.isEmpty()) {
                        Queue<Task> queueRunTask0 = new ArrayDeque<>();

                        // Run the task in a separate thread
                        Thread threadRunTask0 = new Thread(() -> {
                            result = Func_run_task_0(remaining, finishTime);
                            queueRunTask0.offer(result);
                        });
                        threadRunTask0.start();
                        threadRunTask0.join();
                        resultRunTask0 = queueRunTask0.poll();
                        (finishTime, result) = resultRunTask0;
                    }
                    if (remaining.size() < b) {
                        remaining.offer(task);
                    } else {
                        result.put(task.index, -1);
                    }
                }
            }
        }

        // Wait for the thread to finish
        thread.join();

        // Print the results
        for (int taskId : result.keySet()) {
            System.out.println(result.get(taskId));
        }
    }

    // Function to run a task
    private static Map<Integer, Integer> Func_run_task_0(Queue<Task> remaining, int finishTime) {
        Task taskToRun = remaining.poll();
        finishTime = Math.max(finishTime, taskToRun.time) + taskToRun.duration;
        result.put(taskToRun.index, finishTime);
        return result;
    }

    // Class to represent a task
    private static class Task {
        private int time;
        private int duration;
        private int index;

        public Task(int time, int duration, int index) {
            this.time = time;
            this.duration = duration;
            this.index = index;
        }
    }
}