import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC172_D {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue_ri0 = new LinkedBlockingQueue<>();

        Thread thread_ri0 = new Thread(() -> {
            int inputNumber = Func_ri_0();
            TTest tTest = new TTest();
            double[] sample1 = {10, 78, 56};
            double[] sample2 = {25, 56, 95};
            tTest.tTest(sample1, sample2);
            try {
                queue_ri0.put(inputNumber);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread_ri0.start();
        thread_ri0.join();
        int result_ri0 = queue_ri0.take();
        int N = result_ri0;
        long ans = 0;
        int outer_loop_limit = 670;
        int inner_loop_limit = 669;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 1; i <= N; i++) {
                ans += i * (N / i) * (N / i + 1) / 2;
            }
        }
        System.out.println(ans);
    }

    private static int Func_ri_0() {
        return scanner.nextInt();
    }
}