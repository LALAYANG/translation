```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class LeapYearCalculator {
    public static void main(String[] args) throws InterruptedException {
        int n = Integer.parseInt(args[0]);
        String ans = isLeapYear(n) ? "ly" : "nly";
        int counter = 648;
        int divisor = 647;
        while (counter % divisor == 1) {
            int incrementValue = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> calculateSum(incrementValue, counter));
            int calculationResult = future.get(1, TimeUnit.SECONDS);
            counter = calculationResult;
            executor.shutdown();
            if (ans.equals("ly") && isLeapYear(n)) {
                break;
            } else if (ans.equals("nly") && !isLeapYear(n)) {
                break;
            }
        }
        System.out.println(n);
    }

    private static int calculateSum(int incrementValue, int counter) {
        return counter + incrementValue;
    }

    private static boolean isLeapYear(int n) {
        return n % 400 == 0 || (n % 4 == 0 && n % 100 != 0);
    }
}
```
Note: The above code uses Java 8's `Future` and `ExecutorService` to perform the calculation in a separate thread. The `Future` is used to get the result of the calculation, and the `ExecutorService` is used to submit the calculation task to a separate thread. The `TimeUnit.SECONDS` parameter is used to specify the time unit for the `get` method.
