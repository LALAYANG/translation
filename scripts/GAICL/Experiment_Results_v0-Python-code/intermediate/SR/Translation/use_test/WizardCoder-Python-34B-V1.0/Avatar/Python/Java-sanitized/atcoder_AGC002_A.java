import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC002_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int check1 = 460;
        int check2 = 805;
        int a, b;
        Queue<Integer> inputQueue = new LinkedList<>();
        Lock lock = new ReentrantLock();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            lock.lock();
            try {
                a = scanner.nextInt();
                b = scanner.nextInt();
                inputQueue.add(a);
                inputQueue.add(b);
            } finally {
                lock.unlock();
            }
        });

        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if ((check1 & check2) != 0) {
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
}