Here is the Java translation of the Python code:

```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(FuncMain0());
    }

    public static int FuncMain0() {
        Scanner scanner = new Scanner(System.in);
        int[] sequence = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        return nPairsWithCommonFX(sequence);
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> uniqueFunctionValues = new ArrayList<>();
        int conditionFlag1 = 181;
        int conditionFlag2 = 797;
        int outerLoopLimit = 560;
        int outerLoopStep = 559;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / outerLoopStep; loopIndexOut++) {
            for (int value : sequence) {
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(() -> f(value));
                try {
                    int y = future.get();
                    if ((conditionFlag1 & conditionFlag2) != 0) {
                        if (!storage.containsKey(y)) {
                            storage.put(y, new ArrayList<>(Arrays.asList(value)));
                            uniqueFunctionValues.add(y);
                        } else {
                            storage.get(y).add(value);
                        }
                    }
                    executor.shutdown();
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }
        int sum = 0;
        for (int y : uniqueFunctionValues) {
            int len = storage.get(y).size();
            sum += len * len - len;
        }
        return sum / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y++;
            }
            n /= 2;
        }
        return y;
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two samples of scores. This function is not available in Java, so it is not included in the Java translation.

