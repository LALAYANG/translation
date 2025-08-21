import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class atcoder_ABC125_C {
    private static final int CHECK_GCD_CONDITION_1 = 279;
    private static final int CHECK_GCD_CONDITION_2 = 181;

    private static int gcd(int a, int b) {
        if ((CHECK_GCD_CONDITION_1 & CHECK_GCD_CONDITION_2) != 0 && b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static int[][] ruiseki_lr_0(int[] array) {
        int n = array.length;
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];

        for (int i = 0; i < n; i++) {
            left[i + 1] = gcd(left[i], array[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            right[i] = gcd(right[i + 1], array[i]);
        }

        return new int[][] {left, right};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num_a = new int[n];
        for (int i = 0; i < n; i++) {
            num_a[i] = scanner.nextInt();
        }

        Queue<int[][]> queue_ruiseki_lr0 = new LinkedList<>();
        Thread thread_ruiseki_lr0 = new Thread(() -> queue_ruiseki_lr0.add(ruiseki_lr_0(num_a)));
        thread_ruiseki_lr0.start();
        try {
            thread_ruiseki_lr0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int[][] result_ruiseki_lr0 = queue_ruiseki_lr0.poll();
        int[] left = result_ruiseki_lr0[0];
        int[] right = result_ruiseki_lr0[1];

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(left[i], right[i + 1]), ans);
        }

        System.out.println(ans);
    }
}