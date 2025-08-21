import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_282_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_rounds = sc.nextInt();
        int total = 0;
        String[] operations = new String[num_rounds];
        ExecutorService executor = Executors.newFixedThreadPool(2);
        LinkedBlockingQueue<Integer> result_queue = new LinkedBlockingQueue<>();

        for (int x = 0; x < num_rounds; x++) {
            int A = sc.nextInt();
            int G = sc.nextInt();
            if (A + total <= 500) {
                executor.execute(() -> {
                    try {
                        result_queue.put(add_to_total(A, total));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            } else {
                total -= G;
                operations[x] = "G";
            }
            total = result_queue.poll();
            operations[x] = "A";
        }
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.join("", operations));
    }

    public static int add_to_total(int A, int total) throws InterruptedException {
        Thread.sleep(1000);
        return total + A;
    }
}