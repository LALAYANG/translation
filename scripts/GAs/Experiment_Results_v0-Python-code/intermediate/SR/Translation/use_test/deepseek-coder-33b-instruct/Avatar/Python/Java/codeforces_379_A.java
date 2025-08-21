Here is the Java translation of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int dividend = scanner.nextInt();
        int divisor = scanner.nextInt();
        int s = 0;
        int restoSciolte = 0;
        int b = 0;
        int candeleIntere = 0;
        while (dividend % divisor == 1) {
            int variable_3_10 = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                try {
                    resultQueue.put(addNumbers(variable_3_10, dividend));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            int calculatedResult = resultQueue.take();
            dividend = calculatedResult;
            while (candeleIntere > 0 || restoSciolte >= b) {
                candeleIntere += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s = s + candeleIntere;
                restoSciolte += candeleIntere % b;
                candeleIntere = candeleIntere / b;
            }
        }
        System.out.println(s);
    }

    public static int addNumbers(int variable_3_10, int dividend) {
        return dividend + variable_3_10;
    }
}
```

Please note that the Java code does not have the same functionality as the Python code. The Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two lists of numbers, but there is no equivalent function in Java. The Python code also uses the `input()` function to get user input, but in Java, this is replaced with a `Scanner` object. The Python code also uses the `queue` module to create a queue for thread communication, but in Java, this is replaced with a `BlockingQueue`. The Python code also uses the `threading` module to create and manage threads, but in Java, this is replaced with a `ThreadPoolExecutor`.

