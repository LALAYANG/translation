import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        int h = 10000;
        int a = 1;
        int sho = (int) (h / a);
        int am = (int) (h % a);
        if (CONDITION_1 & CONDITION_2) {
            if (am != 0) {
                int variable_3_12 = 1;
                ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        int result = func0(variable_3_12, sho);
                        sho = result;
                    }
                });
                executor.shutdown();
                try {
                    executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                pass
            }
        }
        System.out.println(sho);
    }

    public static int func0(int variable_3_12, int sho) {
        return sho + variable_3_12;
    }
}