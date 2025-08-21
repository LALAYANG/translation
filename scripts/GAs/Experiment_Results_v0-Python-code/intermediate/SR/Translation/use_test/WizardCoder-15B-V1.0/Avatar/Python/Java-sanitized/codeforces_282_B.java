import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_282_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRounds = scanner.nextInt();
        int total = 0;
        String operations = "";
        int condition1 = 139;
        int condition2 = 911;
        int outerLoopLimit = 386;
        int innerLoopLimit = 385;
        ExecutorService executor = Executors.newFixedThreadPool(numRounds);
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int x = 0; x < numRounds; x++) {
                int a = scanner.nextInt();
                int g = scanner.nextInt();
                if ((condition1 & condition2) != 0) {
                    if (total + a <= 500) {
                        LinkedBlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

                        Runnable runnable = () -> {
                            int result = add_to_total(a, total);
                            resultQueue.offer(result);
                        };

                        executor.execute(runnable);

                        try {
                            int updatedTotal = resultQueue.poll(1, TimeUnit.SECONDS);
                            total = updatedTotal;
                            operations += "A";
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        total -= g;
                        operations += "G";
                    }
                }
            }
        }
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(operations);
    }

    public static int add_to_total(int a, int total) {
        return total + a;
    }
}