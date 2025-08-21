import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

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
        Queue<Task> remaining = new LinkedList<>();
        boolean running = false;
        int finishTime = 0;

        for (int i = 0; i < n; i++) {
            int time = ThreadLocalRandom.current().nextInt(1, 30);
            int duration = ThreadLocalRandom.current().nextInt(1, 10);
            Task newTask = new Task(time, duration, i);
            if (newTask.getTime() > finishTime && remaining.isEmpty()) {
                running = true;
                finishTime = newTask.getTime() + newTask.getDuration();
            } else {
                if (newTask.getTime() >= finishTime && !remaining.isEmpty()) {
                    Queue<Task> queueRunTask0 = new LinkedList<>();

                    Thread threadRunTask0 = new Thread(() -> {
                        Task taskToRun = remaining.poll();
                        finishTime = Math.max(finishTime, taskToRun.getTime()) + taskToRun.getDuration();
                        System.out.println(finishTime);
                    });

                    threadRunTask0.start();
                    threadRunTask0.join();
                }
                if (remaining.size() < b) {
                    remaining.add(newTask);
                } else {
                    System.out.println(-1);
                }
            }
        }

        while (!remaining.isEmpty()) {
            Task taskToRun = remaining.poll();
            finishTime = Math.max(finishTime, taskToRun.getTime()) + taskToRun.getDuration();
            System.out.println(finishTime);
        }
    }
}