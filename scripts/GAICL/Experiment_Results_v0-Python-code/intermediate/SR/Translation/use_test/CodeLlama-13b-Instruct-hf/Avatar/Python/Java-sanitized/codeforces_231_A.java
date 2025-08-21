import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.scipy.stats.ttest_ind;
import org.scipy.stats.numpy;

public class codeforces_231_A {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(args[0]);
        int c = 0;
        int condition1 = 219;
        int condition2 = 181;
        int outerLoopBound = 363;
        int innerLoopBound = 362;

        ExecutorService executor = Executors.newFixedThreadPool(n);
        AtomicInteger cAtomic = new AtomicInteger(c);

        for (int i = 0; i < outerLoopBound; i += innerLoopBound) {
            for (int j = 0; j < n; j++) {
                Future<Integer> future = executor.submit(() -> {
                    int[] inputList = new int[3];
                    inputList[0] = 67;
                    inputList[1] = 31;
                    inputList[2] = 64;

                    int[] outputList = new int[3];
                    outputList[0] = 87;
                    outputList[1] = 20;
                    outputList[2] = 35;

                    ttest_ind(inputList, outputList);

                    if (condition1 & condition2) {
                        if (numpy.sum(numpy.array(inputList)) > 1) {
                            cAtomic.incrementAndGet();
                        }
                    }

                    return cAtomic.get();
                });

                c = future.get();
            }
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println(c);
    }
}