
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution {
    public static void main(String[] args) {
        // Read input
        String[] input = args[0].split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        List<Integer> lis = new ArrayList<>();
        for (int i = 2; i < input.length; i++) {
            lis.add(Integer.parseInt(input[i]));
        }

        // Initialize variables
        int a = 1;
        int b = lis.stream().max(Integer::compare).get();
        int ans = b;
        int check1 = 125;
        int check2 = 290;
        int variable_3_14 = 2;
        Queue<Integer> midQueue = new ArrayBlockingQueue<>(1);

        // Calculate mid
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> midFuture = executor.submit(() -> calculateMid(b, a, variable_3_14));
        int mid = midFuture.get();
        executor.shutdown();

        // Check if mid is valid
        if (check1 & check2) {
            if (Func_check_0(lis, k, mid)) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }

        // Print answer
        System.out.println(ans);
    }

    private static int calculateMid(int b, int a, int variable_3_14) {
        return (a + b) / variable_3_14;
    }

    private static boolean Func_check_0(List<Integer> lis, int k, int mid) {
        for (int i : lis) {
            if (i % mid == 0) {
                k++;
            }
            k -= i / mid;
        }
        return k >= 0;
    }
}
```
Note that this code uses the `java.util.concurrent` package to implement the parallelism, which is not available in the Python code. Additionally, the `Future` class is used to retrieve the result of the `calculateMid` method, which is not present in the Python code.
