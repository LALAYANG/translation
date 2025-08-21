import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_644_B {
    private int n;
    private int b;
    private Queue<Task> remaining;
    private boolean isTaskRunning;
    private int finishTime;
    private List<Integer> result;

    public TaskScheduler(int n, int b) {
        this.n = n;
        this.b = b;
        this.remaining = new ConcurrentLinkedQueue<>();
        this.isTaskRunning = false;
        this.finishTime = 0;
        this.result = new ArrayList<>();
    }

    public void scheduleTask(Task task) {
        if (task.getTime() > finishTime && remaining.isEmpty()) {
            isTaskRunning = true;
            finishTime = task.getTime() + task.getDuration();
            result.add(task.getIndex(), finishTime);
        } else if (task.getTime() >= finishTime && !remaining.isEmpty()) {
            Queue<Task> queue = new ConcurrentLinkedQueue<>();
            queue.add(task);
            executeTask(queue);
        } else if (remaining.size() < b) {
            remaining.add(task);
        } else {
            result.add(task.getIndex(), -1);
        }
    }

    public void executeTask(Queue<Task> queue) {
        Task task = queue.poll();
        finishTime = Math.max(finishTime, task.getTime()) + task.getDuration();
        result.add(task.getIndex(), finishTime);
    }

    public List<Integer> getResult() {
        return result;
    }
}

class Task {
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