import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_598_A {
    public static void main(String[] args) throws InterruptedException {
        int iterations = Integer.parseInt(args[0]);
        for (int i = 0; i < iterations; i++) {
            int n = Integer.parseInt(args[i + 1]);
            System.out.println(solve(n));
        }
    }

    public static int solve(int n) throws InterruptedException {
        int variable_3_16 = 2;
        int newvariable_7_16_1 = 1;
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Thread thread = new Thread(() -> {
            int result = Func_newFunc0_16_0(n, variable_3_16, newvariable_7_16_1);
            try {
                queue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        thread.join();

        int result = queue.take();
        int news_1 = result;
        int t = 1;
        while (t <= n) {
            news_1 -= 2 * t;
            t = t * 2;
        }
        return news_1;
    }

    public static int Func_newFunc0_16_0(int n, int variable_3_16, int newvariable_7_16_1) {
        return (newvariable_7_16_1 + n) * n / variable_3_16;
    }
}