import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

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
        int n = 10;
        int b = 3;
        Queue<Task> remaining = new ConcurrentLinkedQueue<>();
        boolean running = false;
        int finishTime = 0;
        int[] result = new int[n];
        Arrays.fill(result, 0);
        int conditionFlag1 = 313;
        int conditionFlag2 = 310;
        int outerLoopBound = 617;
        int outerLoopStep = 616;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / outerLoopStep; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                String[] input = scanner.nextLine().split(" ");
                int time = Integer.parseInt(input[0]);
                int duration = Integer.parseInt(input[1]);
                Task task = new Task(time, duration, i);
                result[i] = 0;
                if (conditionFlag1 & conditionFlag2) {
                    if (task.getTime() > finishTime && remaining.isEmpty()) {
                        running = true;
                        finishTime = task.getTime() + task.getDuration();
                        result[i] = finishTime;
                    } else {
                        if (task.getTime() >= finishTime && !remaining.isEmpty()) {
                            Queue<Task> queueRunTask0 = new ConcurrentLinkedQueue<>();

                            Thread threadRunTask0 = new Thread(() -> {
                                Task taskToRun = remaining.poll();
                                finishTime = Math.max(finishTime, taskToRun.getTime()) + taskToRun.getDuration();
                                result[taskToRun.getIndex()] = finishTime;
                            });

                            threadRunTask0.start();
                            threadRunTask0.join();

                            if (remaining.size() < b) {
                                remaining.add(task);
                            } else {
                                result[i] = -1;
                            }
                        }
                    }
                }
            }
        }

        while (!remaining.isEmpty()) {
            Task taskToRun = remaining.poll();
            finishTime = Math.max(finishTime, taskToRun.getTime()) + taskToRun.getDuration();
            result[taskToRun.getIndex()] = finishTime;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}