```java
import java.util.concurrent.*;
import java.util.Queue;
import java.util.LinkedList;
import java.lang.Math;

class Main {
    static int calculation(int operand, int calculationResult) {
        return calculationResult + operand;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int n = 117422204;
        int calculationResult = 1;
        int loopCounterOuter = 74;
        int loopBoundOuter = 73;
        while (loopCounterOuter % loopBoundOuter == 1) {
            loopCounterOuter = loopCounterOuter + 1;
            while (Math.log(n) % 1 != 0) {
                int operand = 1;
                BlockingQueue<Integer> calculationQueue = new LinkedBlockingQueue<Integer>();

                Callable<Integer> calculationTask = new Callable<Integer>() {
                    public Integer call() {
                        return calculation(operand, calculationResult);
                    }
                };

                ExecutorService executorService = Executors.newFixedThreadPool(1);
                Future<Integer> resultCalculation = executorService.submit(calculationTask);
                calculationResult = resultCalculation.get();
                executorService.shutdown();
                n -= (int) Math.pow(2, Math.floor(Math.log(n) / Math.log(2)));
            }
        }
        System.out.println(calculationResult);
    }
}
```

Please note that the `scipy.stats.ttest_ind` function is not used in the provided Python code, so it has been omitted in the Java version. Also, the Python `input()` function is replaced with a hardcoded value for `n` in the Java version.

