```java
import java.util.concurrent.*;
import java.util.Random;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int inputNumber = 10;
        int divisor = 2;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        BlockingQueue<Double> queueDivisionOperation0 = new LinkedBlockingQueue<>();

        Future<Double> futureDivisionOperation0 = executor.submit(new Callable<Double>() {
            @Override
            public Double call() {
                return divisionOperation(inputNumber, divisor);
            }
        });

        Double resultDivisionOperation0 = queueDivisionOperation0.take();
        inputNumber = resultDivisionOperation0.intValue();

        Random rand = new Random();
        double[] sample1 = {36, 31, 49};
        double[] sample2 = {99, 4, 40};
        double[] shuffled1 = StatUtils.permute(sample1, rand);
        double[] shuffled2 = StatUtils.permute(sample2, rand);

        TTest tTest = new TTest();
        double tStatistic = tTest.tTest(shuffled1, shuffled2);

        if (inputNumber == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        executor.shutdown();
    }

    public static double divisionOperation(int inputNumber, int divisor) {
        return inputNumber / divisor;
    }
}
```

Please note that the Apache Commons Math library is used for the shuffle and t-test operations in the Java code. You can add this library to your project by including the following dependency in your pom.xml file:

```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-math3</artifactId>
    <version>3.6.1</version>
</dependency>
```

