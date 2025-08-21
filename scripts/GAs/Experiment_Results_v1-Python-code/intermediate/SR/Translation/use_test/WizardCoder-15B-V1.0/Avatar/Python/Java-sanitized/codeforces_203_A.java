import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_203_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] xxs = scanner.nextLine().split(" ");
        int initial_value = Integer.parseInt(xxs[0]);
        int t = Integer.parseInt(xxs[1]);
        int a = Integer.parseInt(xxs[2]);
        int b = Integer.parseInt(xxs[3]);
        int da = Integer.parseInt(xxs[4]);
        int db = Integer.parseInt(xxs[5]);

        ExecutorService executor = Executors.newFixedThreadPool(1);
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        Runnable runnable = () -> {
            String result = check_combination(initial_value, t, a, b, da, db);
            queue.offer(result);
        };
        executor.execute(runnable);
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String result = queue.poll();
        System.out.println(result);
    }

    private static String check_combination(int initial_value, int t, int a, int b, int da, int db) {
        if (initial_value == 0) {
            return "YES";
        }
        int a_time = Math.min(a / da, t - 1);
        int b_time = Math.min(b / db, t - 1);
        for (int i = 0; i <= a_time; i++) {
            for (int j = 0; j <= b_time; j++) {
                if (a - da * i == initial_value || b - db * j == initial_value) {
                    return "YES";
                }
                if (a - da * i + (b - db * j) == initial_value) {
                    return "YES";
                }
            }
        }
        return "NO";
    }
}