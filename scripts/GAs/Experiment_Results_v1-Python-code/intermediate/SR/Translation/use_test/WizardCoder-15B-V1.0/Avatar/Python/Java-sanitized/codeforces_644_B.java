import java.util.*;

public class codeforces_644_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] tasks = new int[n];
        int[] result = new int[n];
        PriorityQueue<Task> remaining = new PriorityQueue<>(Comparator.comparingInt(Task::getTime));
        boolean running = false;
        int finishTime = 0;

        for (int i = 0; i < n; i++) {
            int time = sc.nextInt();
            int duration = sc.nextInt();
            tasks[i] = duration;
            result[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            int time = sc.nextInt();
            int duration = sc.nextInt();
            Task task = new Task(time, duration, i);
            if (running) {
                if (task.getTime() >= finishTime) {
                    running = false;
                    finishTime = task.getTime() + task.getDuration();
                    result[i] = finishTime;
                }
            } else {
                if (task.getTime() > finishTime && remaining.isEmpty()) {
                    running = true;
                    finishTime = task.getTime() + task.getDuration();
                    result[i] = finishTime;
                } else if (task.getTime() >= finishTime && !remaining.isEmpty()) {
                    Task runTask = remaining.poll();
                    while (runTask.getTime() < finishTime && !remaining.isEmpty()) {
                        runTask = remaining.poll();
                    }
                    if (runTask.getTime() < finishTime) {
                        running = true;
                        finishTime = runTask.getTime() + runTask.getDuration();
                        result[runTask.getIndex()] = finishTime;
                    }
                }
            }
            if (remaining.size() < b) {
                remaining.offer(task);
            } else {
                result[i] = -1;
            }
        }

        while (!remaining.isEmpty()) {
            Task task = remaining.poll();
            if (running) {
                if (task.getTime() >= finishTime) {
                    running = false;
                    finishTime = task.getTime() + task.getDuration();
                    result[task.getIndex()] = finishTime;
                }
            } else {
                running = true;
                finishTime = task.getTime() + task.getDuration();
                result[task.getIndex()] = finishTime;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

class Task implements Comparable<Task> {
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

    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.time, o.time);
    }
}