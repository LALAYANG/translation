import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC002_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        Thread thread = new Thread(() -> {
            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                queue.put(a + b);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int sum = queue.take();
        if (sum > 0) {
            System.out.println("Positive");
        } else if (sum == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
    }
}