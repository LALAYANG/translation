import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_608_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int initialValue = sc.nextInt();
        int maxDifference = 0;
        for (int i = 0; i < n; i++) {
            int currentValue = sc.nextInt();
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            Thread thread = new Thread(() -> {
                int result = calculateDiff(initialValue, currentValue);
                queue.add(result);
            });
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int resultDiff = queue.take();
            if (resultDiff > maxDifference) {
                maxDifference = resultDiff;
            }
        }
        System.out.println(initialValue + maxDifference);
    }

    private static int calculateDiff(int initialValue, int currentValue) {
        return initialValue - currentValue;
    }
}