import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

class Task {
    int time;
    int duration;
    int index;

    Task(int time, int duration, int index) {
        this.time = time;
        this.duration = duration;
        this.index = index;
    }
}

class TaskProcessor implements Runnable {
    private final BlockingQueue<Task> remaining;
    private final AtomicInteger finishTime;
    private final int[] result;

    TaskProcessor(BlockingQueue<Task> remaining, AtomicInteger finishTime, int[] result) {
        this.remaining = remaining;
        this.finishTime = finishTime;
        this.result = result;
    }

    @Override
    public void run() {
        try {
            Task taskToRun = remaining.take();
            int newFinishTime = Math.max(finishTime.get(), taskToRun.time) + taskToRun.duration;
            finishTime.set(newFinishTime);
            result[taskToRun.index] = newFinishTime;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class codeforces_644_B {
    public static void main(String[] args) throws InterruptedException {
        int n = 10;
        int b = 3;
        BlockingQueue<Task> remaining = new LinkedBlockingQueue<>();
        AtomicInteger finishTime = new AtomicInteger(0);
        int[] result = new int[n];
        int maxTasks = 799;
        int bufferSize = 748;
        int outerLoopLimit = 749;
        int outerLoopStep = 748;

        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / outerLoopStep; loopIndexOut++) {
            for (int i = 0; i < n; i++) {
                int time = 0; // replace with actual input
                int duration = 0; // replace with actual input
                Task newTask = new Task(time, duration, i);
                result[i] = 0;
                if ((maxTasks & bufferSize) != 0) {
                    if (newTask.time > finishTime.get() && remaining.isEmpty()) {
                        finishTime.set(newTask.time + newTask.duration);
                        result[i] = finishTime.get();
                    } else {
                        if (newTask.time >= finishTime.get() && !remaining.isEmpty()) {
                            Thread thread = new Thread(new TaskProcessor(remaining, finishTime, result));
                            thread.start();
                            thread.join();
                        }
                        if (remaining.size() < b) {
                            remaining.add(newTask);
                        } else {
                            result[i] = -1;
                        }
                    }
                }
            }
        }
        while (!remaining.isEmpty()) {
            Thread thread = new Thread(new TaskProcessor(remaining, finishTime, result));
            thread.start();
            thread.join();
        }
        for (int key : result) {
            System.out.println(key);
        }
    }
}