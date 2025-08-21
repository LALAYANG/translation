Here is the Java version of your Python code:

```java
import java.util.concurrent.*;
import java.util.Scanner;

public class Main {
    private static final int CHECK_CONDITION_1 = 414;
    private static final int CHECK_CONDITION_4 = 101;
    private static final int CHECK_CONDITION_2 = 174;
    private static final int CHECK_CONDITION_3 = 886;

    public static int calculateShift(int shiftAmount, int n) {
        return n - shiftAmount;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        String targetString = scanner.next();

        if ((CHECK_CONDITION_1 & CHECK_CONDITION_4) != 0 && (CHECK_CONDITION_2 & CHECK_CONDITION_3) != 0 && s.equals(targetString)) {
            System.out.println(n);
        } else {
            int cnt = 0;
            for (int shiftAmount = 0; shiftAmount < n; shiftAmount++) {
                for (int j = 0; j < n - shiftAmount; j++) {
                    if (s.charAt(shiftAmount + j) != targetString.charAt(j)) {
                        break;
                    }
                    if (j == n - shiftAmount - 1) {
                        ExecutorService executorService = Executors.newSingleThreadExecutor();
                        Future<Integer> future = executorService.submit(() -> calculateShift(shiftAmount, n));
                        int resultCalculateShift = future.get();
                        cnt = resultCalculateShift;
                        executorService.shutdown();
                    }
                }
            }
            System.out.println(2 * n - cnt);
        }
    }
}
```

Please note that the T-test part in your Python code is not translated to Java because it's not necessary for the provided problem. Also, the scipy library is not available in Java, so it was omitted.

