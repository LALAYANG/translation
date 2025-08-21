import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC151_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newFixedThreadPool(1);
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        executor.execute(() -> {
            String c = scanner.nextLine();
            String result = solve(c);
            queue.offer(result);
        });
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String result = queue.poll();
        System.out.println(result);
    }

    public static String solve(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int i = a.indexOf(c);
        return a.charAt(i + 1) + "";
    }
}