Here is the Java version of the Python code:

```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(FuncMain0());
    }

    public static int FuncMain0() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sequence.add(scanner.nextInt());
        }
        scanner.close();
        return nPairsWithCommonFX(sequence);
    }

    public static int nPairsWithCommonFX(List<Integer> sequence) throws Exception {
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> uniqueFunctionValues = new ArrayList<>();
        int conditionFlag1 = 181;
        int conditionFlag2 = 797;
        int outerLoopLimit = 560;
        int outerLoopStep = 559;
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / outerLoopStep; loopIndexOut++) {
            for (int value : sequence) {
                Callable<Integer> task = () -> f(value);
                Future<Integer> future = executorService.submit(task);
                int resultF0 = future.get();
                int y = resultF0;
                if ((conditionFlag1 & conditionFlag2) != 0) {
                    if (!storage.containsKey(y)) {
                        List<Integer> list = new ArrayList<>();
                        list.add(value);
                        storage.put(y, list);
                        uniqueFunctionValues.add(y);
                    } else {
                        storage.get(y).add(value);
                    }
                }
            }
        }
        executorService.shutdown();
        int sum = 0;
        for (int y : uniqueFunctionValues) {
            int size = storage.get(y).size();
            sum += size * size - size;
        }
        return sum / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y += 1;
            }
            n /= 2;
        }
        return y;
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two lists of numbers. This function is not available in Java, so it has been removed from the Java code. Also, the Python code uses the `input()` function to read input from the user. In the Java code, this has been replaced with a `Scanner` object.

