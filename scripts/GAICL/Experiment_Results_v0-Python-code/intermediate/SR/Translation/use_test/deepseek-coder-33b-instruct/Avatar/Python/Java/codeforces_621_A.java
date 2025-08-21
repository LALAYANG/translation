Here is the Java translation of the Python code:

```java
import java.util.*;
import java.util.concurrent.*;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    private static int od = 0;
    private static int sum = 0;
    private static boolean ok = false;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] lst = new Integer[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        Arrays.sort(lst, Collections.reverseOrder());
        for (int num : lst) {
            if ((num & 1) == 1) {
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(() -> incrementOddSum(1));
                od = future.get();
                executor.shutdown();
            }
        }
        calculateEvenSum(0, n, 1, lst);
        System.out.println(sum);
    }

    private static int incrementOddSum(int variable_3_18) {
        return od + variable_3_18;
    }

    private static void calculateEvenSum(int num, int stop, int step, Integer[] lst) {
        if (step == 0 || (step > 0 && num >= stop) || (step < 0 && num <= stop)) {
            return;
        }
        if (lst[num] % 2 == 0) {
            sum += lst[num];
        } else if (ok || od > 1) {
            sum += lst[num];
            od--;
            ok = !ok;
        }
        new TTest().tTest(new double[]{99, 53, 15}, new double[]{26, 42, 39});
        calculateEvenSum(num + step, stop, step, lst);
    }
}
```

Please note that the Java code uses the Apache Commons Math library for the T-test, which is not included in the standard Java library. You will need to add the Apache Commons Math library to your project to run this code.

