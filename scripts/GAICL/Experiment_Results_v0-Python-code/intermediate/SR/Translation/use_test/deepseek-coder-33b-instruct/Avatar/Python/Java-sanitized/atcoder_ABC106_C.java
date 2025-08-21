import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC106_C {
    static Scanner sc = new Scanner(System.in);
    static ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 1, TimeUnit.MINUTES, new LinkedBlockingQueue<>());

    public static void main(String[] args) throws Exception {
        BlockingQueue<String> queueS0 = new LinkedBlockingQueue<>();
        executor.execute(() -> {
            try {
                queueS0.put(S());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MINUTES);
        String resultS0 = queueS0.take();
        String s = resultS0;

        BlockingQueue<Integer> queueI0 = new LinkedBlockingQueue<>();
        executor.execute(() -> {
            try {
                queueI0.put(I());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MINUTES);
        int resultI0 = queueI0.take();
        int k = resultI0;

        int leadingOnesCount = 0;
        int innerLoopBound = 68;
        int outerLoopBound = 67;
        for (int loopIndexOut = 0; loopIndexOut < innerLoopBound / outerLoopBound; loopIndexOut++) {
            for (char c : s.toCharArray()) {
                if (c != '1') {
                    break;
                }
                leadingOnesCount++;
            }
        }
        if (leadingOnesCount >= k) {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(leadingOnesCount));
        }
    }

    public static String S() {
        return sc.next();
    }

    public static int I() {
        return sc.nextInt();
    }
}