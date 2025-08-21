import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_340_A {
    private static int addition(int val1, int variable_3_9) {
        return val1 + variable_3_9;
    }

    private static int Func_G_0(int a, int b) {
        int val1 = 971;
        int val2 = 970;
        while (val1 % val2 == 1) {
            int variable_3_9 = 1;
            BlockingQueue<Integer> queue_addition_result = new LinkedBlockingQueue<>();

            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                int result = addition(val1, variable_3_9);
                try {
                    queue_addition_result.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            try {
                executor.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int addition_result = 0;
            try {
                addition_result = queue_addition_result.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            val1 = addition_result;
            while (a % b != 0) {
                int temp = a;
                a = b;
                b = temp % b;
            }
        }
        return b;
    }

    private static int Func_L_0(int a, int b) {
        return a * b / Func_G_0(a, b);
    }

    public static void main(String[] args) {
        int x = 101;
        int y = 171;
        int a = 1;
        int b = 1000000000;
        BlockingQueue<Integer> queue_L0 = new LinkedBlockingQueue<>();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        executor.submit(() -> {
            int result = Func_L_0(x, y);
            try {
                queue_L0.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_L0 = 0;
        try {
            result_L0 = queue_L0.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int lcm = result_L0;
        System.out.println(b / lcm - (a - 1) / lcm);
    }
}