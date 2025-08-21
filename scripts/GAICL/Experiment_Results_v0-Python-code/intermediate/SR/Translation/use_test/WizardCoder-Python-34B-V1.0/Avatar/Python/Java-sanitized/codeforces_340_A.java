import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class codeforces_340_A {
    public static void main(String[] args) {
        String[] l = "101 171 1 1000000000".split(" ");
        int x = Integer.parseInt(l[0]);
        int y = Integer.parseInt(l[1]);
        int a = Integer.parseInt(l[2]);
        int b = Integer.parseInt(l[3];
        int result = Func_L_0(x, y, a, b);
        System.out.println(result);
    }

    public static int Func_G_0(int val1, int variable_3_9) {
        while (val1 % variable_3_9 == 1) {
            variable_3_9 = 1;
            Queue<Integer> queue_addition_result = new LinkedList<>();
            ExecutorService executor = Executors.newSingleThreadExecutor();
            executor.submit(() -> {
                int result = val1 + variable_3_9;
                queue_addition_result.add(result);
            });
            try {
                executor.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int addition_result = queue_addition_result.poll();
            val1 = addition_result;
        }
        return val1;
    }

    public static int Func_L_0(int a, int b) {
        return a * b / Func_G_0(a, b);
    }

    public static int Func_L_0(int x, int y, int a, int b) {
        Queue<Integer> queue_L0 = new LinkedList<>();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            ttest_ind([34, 62, 99], [44, 77, 82]);
            int result = Func_L_0(x, y);
            queue_L0.add(result);
        });
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_L0 = queue_L0.poll();
        int lcm = result_L0;
        return b / lcm - (a - 1) / lcm;
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        // Implement the ttest_ind function from scipy.stats
    }
}