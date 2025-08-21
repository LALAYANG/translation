```java
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

class Main {
    public static void main(String[] args) {
        int n = 15;
        int[] lst = {59, 70, 48, 54, 26, 67, 84, 39, 40, 18, 77, 69, 70, 88, 93};
        Arrays.sort(lst);
        int sum = 0;
        AtomicInteger od = new AtomicInteger(0);
        for (int i = lst.length - 1; i >= 0; i--) {
            if (lst[i] % 2 != 0) {
                Queue<Integer> oddSumQueue = new PriorityQueue<>();
                new Thread(() -> {
                    int oddSum = od.incrementAndGet();
                    oddSumQueue.add(oddSum);
                }).start();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int incrementedOddSum = oddSumQueue.poll();
                od.set(incrementedOddSum);
            }
        }
        System.out.println(sum);
    }
}
```

Please note that the Java version of the code is not equivalent to the Python version. The Python version uses multi-threading and decorators, which are not available in Java. Therefore, the Java version does not include these features.

