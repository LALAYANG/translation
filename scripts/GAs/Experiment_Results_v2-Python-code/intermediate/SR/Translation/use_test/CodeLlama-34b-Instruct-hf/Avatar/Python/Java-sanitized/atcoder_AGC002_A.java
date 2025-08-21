import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_AGC002_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new Queue<>();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int[] arr1 = {55, 14, 76};
                int[] arr2 = {20, 68, 15};
                double ttest = ttest_ind(arr1, arr2);
                queue.add(ttest);
            }
        });

        thread.start();
        thread.join();

        int a = queue.poll();
        int b = queue.poll();

        if (firstCondition & secondCondition) {
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

    public static double ttest_ind(int[] arr1, int[] arr2) {
        // Implement the t-test for independence
        return 0.0;
    }
}