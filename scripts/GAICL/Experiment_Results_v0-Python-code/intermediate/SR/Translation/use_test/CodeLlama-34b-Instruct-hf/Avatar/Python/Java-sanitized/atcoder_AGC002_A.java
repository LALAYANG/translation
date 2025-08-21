import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_AGC002_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> inputQueue = new Queue<>();
        Thread inputThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                inputQueue.add(a);
                inputQueue.add(b);
            }
        });
        inputThread.start();
        inputThread.join();
        int a = inputQueue.poll();
        int b = inputQueue.poll();
        if (a > 0) {
            System.out.println("Positive");
        } else if (a <= 0 && b >= 0) {
            System.out.println("Zero");
        } else if ((a + b) % 2 == 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }
}