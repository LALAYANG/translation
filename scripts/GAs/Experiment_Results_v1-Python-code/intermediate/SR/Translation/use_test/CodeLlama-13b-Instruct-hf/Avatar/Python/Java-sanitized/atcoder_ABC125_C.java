import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_ABC125_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Queue<Integer> queue = new LinkedList<>();
        Thread thread = new Thread(() -> {
            int[] left = new int[n + 1];
            int[] right = new int[n + 1];
            for (int i = 0; i < n; i++) {
                left[i + 1] = gcd(left[i], a[i]);
            }
            for (int i = n - 1; i >= 0; i--) {
                right[i] = gcd(right[i + 1], a[i]);
            }
            queue.add(left);
            queue.add(right);
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] left = queue.poll();
        int[] right = queue.poll();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(left[i], right[i + 1]), ans);
        }
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}