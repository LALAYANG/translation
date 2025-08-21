import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int secondInput = scanner.nextInt();
        scanner.close();

        if (n < 1 || secondInput < 1) {
            System.out.println(n + " " + secondInput);
            return;
        }

        if (secondInput > n) {
            int min = secondInput;
            int max = 0;
            ExecutorService executor = Executors.newFixedThreadPool(1);
            LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

            Runnable task = () -> {
                int result = calculateSum(min, n, secondInput);
                queue.offer(result);
            };

            executor.execute(task);
            try {
                max = queue.poll(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            executor.shutdown();
            System.out.println(min + " " + max);
        } else {
            int min = n;
            int max = n + secondInput - 1;
            if (secondInput == 0) {
                max = n;
            }
            System.out.println(min + " " + max);
        }
    }

    private static int calculateSum(int min, int n, int secondInput) {
        return n + secondInput - min;
    }
}