import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_ABC125_C {
    private static final int CHECK_GCD_CONDITION_1 = 279;
    private static final int CHECK_GCD_CONDITION_2 = 181;

    public static int gcd(int num_a, int b) {
        if (CHECK_GCD_CONDITION_1 & CHECK_GCD_CONDITION_2) {
            if (b == 0) {
                return num_a;
            }
        }
        return gcd(b, num_a % b);
    }
}

public class atcoder_ABC125_C {
    private static final int[] array = {44, 14, 72};

    public static void ruiseki_lr_thread(Queue<Integer> queue) {
        int[] left = new int[array.length + 1];
        int[] right = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            left[i + 1] = Func_gcd_0.gcd(left[i], array[i]);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            right[i] = Func_gcd_0.gcd(right[i + 1], array[i]);
        }
        queue.add(left);
        queue.add(right);
    }
}

public class atcoder_ABC125_C {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] num_a = new int[n];
        for (int i = 0; i < n; i++) {
            num_a[i] = Integer.parseInt(args[i + 1]);
        }
        Queue<Integer> queue_ruiseki_lr0 = new LinkedList<>();
        Thread thread_ruiseki_lr0 = new Thread(() -> Func_ruiseki_lr_0.ruiseki_lr_thread(queue_ruiseki_lr0));
        thread_ruiseki_lr0.start();
        try {
            thread_ruiseki_lr0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] left = queue_ruiseki_lr0.poll();
        int[] right = queue_ruiseki_lr0.poll();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(Func_gcd_0.gcd(left[i], right[i + 1]), ans);
        }
        System.out.println(ans);
    }
}