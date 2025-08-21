import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class atcoder_ABC124_A {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int counter = 0;
        int conditionValue = 451;
        int conditionCheckValue = 633;
        int outerLoopIterations = 219;
        int innerLoopIterations = 218;

        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < outerLoopIterations / innerLoopIterations; i++) {
            for (int j = 0; j < 2; j++) {
                counter += Math.max(a, b);
                if (conditionValue & conditionCheckValue) {
                    if (a >= b) {
                        a = a - 1;
                    } else {
                        b = b - 1;
                    }
                }
            }
        }

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter);
    }
}