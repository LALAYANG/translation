import java.util.Queue;
import java.util.Map;
import java.util.HashMap;

public class codeforces_644_B {
    private int time;
    private int duration;
    private int index;

    public Task(int time, int duration, int index) {
        this.time = time;
        this.duration = duration;
        this.index = index;
    }

    public int getTime() {
        return time;
    }

    public int getDuration() {
        return duration;
    }

    public int getIndex() {
        return index;
    }
}

public class codeforces_644_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        Queue<Task> remaining = new LinkedList<>();
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = args[i + 2].split(" ");
            int time = Integer.parseInt(input[0]);
            int duration = Integer.parseInt(input[1]);
            Task task = new Task(time, duration, i);

            if (task.getTime() > finishTime && remaining.isEmpty()) {
                running = true;
                finishTime = task.getTime() + task.getDuration();
                result.put(i, finishTime);
            } else {
                if (task.getTime() >= finishTime && !remaining.isEmpty()) {
                    finishTime = runTask(remaining, finishTime);
                }

                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result.put(i, -1);
                }
            }
        }

        while (!remaining.isEmpty()) {
            finishTime = runTask(remaining, finishTime);
        }

        for (int key : result.keySet()) {
            System.out.println(result.get(key));
        }
    }

    private static int runTask(Queue<Task> remaining, int finishTime) {
        Task taskToRun = remaining.poll();
        finishTime = Math.max(finishTime, taskToRun.getTime()) + taskToRun.getDuration();
        result.put(taskToRun.getIndex(), finishTime);
        return finishTime;
    }
}