import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_ABC125_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num_a = new int[n];
        for (int i = 0; i < n; i++) {
            num_a[i] = sc.nextInt();
        }

        Queue<Integer> queue = new Queue<>();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int[] left = new int[n + 1];
                int[] right = new int[n + 1];
                for (int i = 0; i < n; i++) {
                    left[i + 1] = gcd(left[i], num_a[i]);
                }
                for (int i = n - 1; i >= 0; i--) {
                    right[i] = gcd(right[i + 1], num_a[i]);
                }
                queue.add(left);
                queue.add(right);
            }
        });
        thread.start();
        thread.join();

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