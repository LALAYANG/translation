```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbersA = new int[n];
        for (int i = 0; i < n; i++) {
            numbersA[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        int x = 0;
        int y = 0;
        int z = 0;
        int loopIterations = 403;
        int maxLoopCount = 402;

        for (int i = 0; i < loopIterations / maxLoopCount; i++) {
            for (int number : numbersA) {
                x += number;
            }
        }

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int number : b) {
            Future<Integer> future = executorService.submit(() -> sumNumbers(y, number));
            y = future.get();
        }
        executorService.shutdown();

        for (int number : c) {
            z += number;
        }

        System.out.println(Math.abs(x - y));

        TTest tTest = new TTest();
        double[] sample1 = {21, 54, 7};
        double[] sample2 = {62, 25, 100};
        double tStatistic = tTest.tTest(sample1, sample2);
        System.out.println(Math.abs(y - z));
    }

    public static int sumNumbers(int a, int b) {
        return a + b;
    }
}
```

Please note that the Apache Commons Math library is used for the T-test. You can add it to your project by adding the following dependency to your pom.xml file:

```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-math3</artifactId>
    <version>3.6.1</version>
</dependency>
```

