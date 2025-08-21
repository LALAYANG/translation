Here is the Java version of your Python code:

```java
import java.util.concurrent.*;
import java.util.Queue;
import java.util.LinkedList;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int n = 117422204;
        int x = 1;
        int outerLoopCounter = 250;
        int innerLoopChecker = 249;
        while (outerLoopCounter % innerLoopChecker == 1) {
            outerLoopCounter = outerLoopCounter + 1;
            while (Math.log(n) % 1 != 0) {
                int increment = 1;
                Queue<Integer> sumQueue = new LinkedList<>();
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                Future<Integer> future = executorService.submit(() -> calculateSum(x, increment));
                sumQueue.add(future.get());
                executorService.shutdown();
                int sumResult = sumQueue.poll();
                x = sumResult;
                n -= (int) Math.pow(2, Math.floor(Math.log(n) / Math.log(2)));
            }
        }
        double[] sample1 = {86, 53, 81};
        double[] sample2 = {64, 40, 75};
        TTest tTest = new TTest();
        double tStatistic = tTest.tTest(StatUtils.normalize(sample1), StatUtils.normalize(sample2));
        System.out.println(x);
    }

    public static int calculateSum(int x, int increment) {
        return x + increment;
    }
}
```

Please note that the Apache Commons Math library is used for the T-test and normalization. You can add it to your project by adding the following Maven dependency to your pom.xml:

```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-math3</artifactId>
    <version>3.6.1</version>
</dependency>
```

Also, please note that the Java version of your code is not exactly the same as the Python version. The Python version uses a queue to store the result of the calculation, while the Java version uses a Future object from the ExecutorService to achieve the same result. The T-test is also implemented differently in Java.

