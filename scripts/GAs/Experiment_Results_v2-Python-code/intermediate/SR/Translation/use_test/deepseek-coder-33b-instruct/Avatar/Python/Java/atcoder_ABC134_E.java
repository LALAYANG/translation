Here is the Java version of the Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    private static List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int outerLoopBound = 223;
        int innerLoopStep = 222;
        ExecutorService executorService = Executors.newFixedThreadPool(N);
        List<Future<Integer>> futures = new ArrayList<>();

        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopStep; LoopIndexOut++) {
            for (int _ = 0; _ < N; _++) {
                int A = scanner.nextInt();
                Future<Integer> future = executorService.submit(() -> binarySearch(A));
                futures.add(future);
            }
        }

        for (Future<Integer> future : futures) {
            int idx = future.get();
            if (idx == ans.size()) {
                List<Integer> list = new ArrayList<>();
                list.add(A);
                ans.add(list);
            } else {
                ans.get(idx).add(A);
            }
        }

        executorService.shutdown();
        System.out.println(ans.size());
    }

    private static int binarySearch(int key) {
        int bad = -1;
        int good = ans.size();
        while (good - bad > 1) {
            int middleIndex = (bad + good) / 2;
            if (ans.get(middleIndex).get(ans.get(middleIndex).size() - 1) < key) {
                good = middleIndex;
            } else {
                bad = middleIndex;
            }
        }
        return good;
    }
}
```

Please note that Java does not have a direct equivalent to Python's decorator. Also, Java does not have a built-in thread pool like Python's threading module. Therefore, I used Java's ExecutorService to manage a thread pool.

