import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        Queue<Task> remaining = new LinkedList<>();
        boolean IsTaskRunning = false;
        int finish_time = 0;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            int duration = scanner.nextInt();
            Task task = new Task(time, duration, i);
            result[i] = 0;
            if (time > finish_time && remaining.isEmpty()) {
                IsTaskRunning = true;
                finish_time = time + duration;
                result[i] = finish_time;
            } else {
                if (time >= finish_time && !remaining.isEmpty()) {
                    while (!remaining.isEmpty()) {
                        finish_time = Math.max(finish_time, remaining.peek().time) + remaining.peek().duration;
                        result[remaining.poll().index] = finish_time;
                    }
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result[i] = -1;
                }
            }
        }
        while (!remaining.isEmpty()) {
            finish_time = Math.max(finish_time, remaining.peek().time) + remaining.peek().duration;
            result[remaining.poll().index] = finish_time;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}