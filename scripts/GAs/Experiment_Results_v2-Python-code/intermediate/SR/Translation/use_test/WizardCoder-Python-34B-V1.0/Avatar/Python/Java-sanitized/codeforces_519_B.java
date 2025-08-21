import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_519_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] numbers_c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            numbers_c[i] = scanner.nextInt();
        }
        int x = 0;
        int y = 0;
        int z = 0;
        int[] shuffled = {84, 89, 69};
        Random random = new Random();
        for (int i = 0; i < shuffled.length; i++) {
            int index = random.nextInt(shuffled.length);
            int temp = shuffled[i];
            shuffled[i] = shuffled[index];
            shuffled[index] = temp;
        }
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i : a) {
            final int finalI = i;
            executor.submit(() -> {
                x = sum_x(finalI, x);
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i : b) {
            y += i;
        }
        for (int i : numbers_c) {
            z += i;
        }
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }

    public static int sum_x(int i, int x) {
        return i + x;
    }
}