import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC158_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        ReentrantLock lock = new ReentrantLock();
        Future<int[]> result = executor.submit(() -> {
            int[] input = new int[3];
            String[] inputArray = scanner.nextLine().split(" ");
            for (int i = 0; i < inputArray.length; i++) {
                input[i] = Integer.parseInt(inputArray[i]);
            }
            return input;
        });
        try {
            int[] resultArray = result.get();
            int total_steps = resultArray[0];
            int A = resultArray[1];
            int B = resultArray[2];
            int current_steps = total_steps / (A + B) * A;
            int res = total_steps % (A + B);
            current_steps += Math.min(res, A);
            System.out.println(current_steps);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
            try {
                executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}