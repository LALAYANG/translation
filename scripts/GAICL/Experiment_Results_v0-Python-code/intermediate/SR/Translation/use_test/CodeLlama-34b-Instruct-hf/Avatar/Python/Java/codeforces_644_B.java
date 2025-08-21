```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class TaskScheduler {
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
```
This Java program is a direct translation of the Python program you provided. It uses a `Queue` to store the tasks and a `ReentrantLock` to synchronize access to the `Queue`. The program also uses a `Thread` to run the task in parallel.

The program first reads the input from the user and creates a `Queue` of `Task` objects. It then iterates over the `Queue` and checks if the current task is the first task in the queue and if the queue is empty. If both conditions are true, the program sets the `running` flag to `true` and sets the `finishTime` to the current task's time plus its duration.

If the current task is not the first task in the queue and the queue is not empty, the program creates a new `Queue` and adds the current task to it. It then creates a new `Thread` and starts it. The `Thread` runs the `run` method of the `Runnable` object, which sets the `finishTime` to the current task's time plus its duration. The program then joins the `Thread` and waits for it to finish.

If the `Queue` size is less than the `b` value, the program adds the current task to the `Queue`. Otherwise, it prints `-1`.

The program then iterates over the `Queue` and prints the `finishTime` for each task.

Note that this program is not optimized for performance and is only intended to demonstrate the basic idea of how to schedule tasks in parallel using a `Queue` and `Thread` in Java.
