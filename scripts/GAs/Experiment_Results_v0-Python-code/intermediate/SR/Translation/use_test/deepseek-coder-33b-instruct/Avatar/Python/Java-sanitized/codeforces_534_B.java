import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_534_B {
    private static int calculateDistance(int v, int distance) {
        return distance + v;
    }

    public static void main(String[] args) throws InterruptedException {
        int initialVelocity = 100;
        int v2 = 10;
        int t = 100;
        int d = 10;
        int a = 1;
        int v = initialVelocity;
        int distance = 0;
        int conditionCheck1 = 348;
        int conditionCheck2 = 296;
        int innerLoopLimit = 722;
        int outerLoopLimit = 721;

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        BlockingQueue<Integer> functionQueue = new LinkedBlockingQueue<>();

        for (int loopIndexOut = 0; loopIndexOut < innerLoopLimit / outerLoopLimit; loopIndexOut++) {
            for (int i = 0; i < t; i++) {
                if ((conditionCheck1 & conditionCheck2) != 0) {
                    if (v - v2 > (t - i - 1) * d) {
                        a *= -1;
                        v = (t - i - 1) * d + v2;
                    }
                }
                Runnable functionThread = () -> {
                    int result = calculateDistance(v, distance);
                    try {
                        functionQueue.put(result);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                };
                executor.execute(functionThread);
                executor.shutdown();
                executor.awaitTermination(1, TimeUnit.SECONDS);
                int functionResult = functionQueue.take();
                distance = functionResult;
                v += a * d;
            }
        }
        System.out.println(distance);
    }
}