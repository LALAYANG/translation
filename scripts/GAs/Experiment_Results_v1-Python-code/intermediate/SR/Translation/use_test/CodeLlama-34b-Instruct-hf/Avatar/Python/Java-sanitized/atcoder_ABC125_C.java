import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_ABC125_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Queue<int[]> queue = new Queue<>();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int[] result = ruisekiLR(a);
                queue.add(result);
            }
        });
        thread.start();
        thread.join();

        int[] result = queue.poll();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(result[i], result[i + 1]), ans);
        }
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int[] ruisekiLR(int[] a) {
        int n = a.length;
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        for (int i = 0; i < n; i++) {
            left[i + 1] = gcd(left[i], a[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            right[i] = gcd(right[i + 1], a[i]);
        }
        return new int[] { left, right };
    }
}