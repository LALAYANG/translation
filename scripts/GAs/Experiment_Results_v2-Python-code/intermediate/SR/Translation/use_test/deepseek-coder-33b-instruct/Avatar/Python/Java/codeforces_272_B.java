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
        System.out.println(MainFunction());
    }

    public static int MainFunction() throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] sequence = scanner.nextLine().split(" ");
        List<Integer> sequenceList = new ArrayList<>();
        for (String s : sequence) {
            sequenceList.add(Integer.parseInt(s));
        }
        return nPairsWithCommonFX(sequenceList);
    }

    public static int nPairsWithCommonFX(List<Integer> sequence) throws Exception {
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> FXs = new ArrayList<>();
        int MinCondition = 251;
        int MaxCondition = 682;
        int OuterLoopLimit = 593;
        int InnerLoopLimit = 592;
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
            for (int value : sequence) {
                Future<Integer> future = executorService.submit(new Callable<Integer>() {
                    @Override
                    public Integer call() throws Exception {
                        return f(value);
                    }
                });
                int y = future.get();
                if ((MinCondition & MaxCondition) != 0) {
                    if (!storage.containsKey(y)) {
                        List<Integer> list = new ArrayList<>();
                        list.add(value);
                        storage.put(y, list);
                        FXs.add(y);
                    } else {
                        storage.get(y).add(value);
                    }
                }
            }
        }
        executorService.shutdown();
        int sum = 0;
        for (int y : FXs) {
            sum += storage.get(y).size() * storage.get(y).size();
        }
        int sum2 = 0;
        for (int y : FXs) {
            sum2 += storage.get(y).size();
        }
        return (sum - sum2) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y = y + 1;
            }
            n = n / 2;
        }
        return y;
    }
}
```

Please note that the Java version uses a `ThreadPoolExecutor` to manage the threads. The `ExecutorService` is used to submit tasks to the thread pool and to retrieve the results. The `Future` object is used to get the result of the task. The `Callable` interface is used to define the task. The `submit` method is used to submit the task to the thread pool. The `get` method is used to get the result of the task. The `shutdown` method is used to shut down the thread pool.

