import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_644_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();

        Queue<Task> remaining = new LinkedList<>();
        boolean running = false;
        int finishTime = 0;

        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            int duration = scanner.nextInt();
            Task task = new Task(time, duration, i);
            remaining.add(task);
        }

        while (!remaining.isEmpty()) {
            Task task = remaining.poll();
            if (task.time > finishTime && remaining.isEmpty()) {
                running = true;
                finishTime = task.time + task.duration;
                System.out.println(finishTime);
            } else {
                if (task.time >= finishTime && !remaining.isEmpty()) {
                    Queue<Task> queue = new LinkedList<>();
                    queue.add(task);
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            Task task = queue.poll();
                            finishTime = task.time + task.duration;
                            System.out.println(finishTime);
                        }
                    });
                    thread.start();
                    thread.join();
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}

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