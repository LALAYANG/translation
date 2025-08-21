```java
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class FloorDivision {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i <= 370; i++) {
            int p = i;
            int q = i;
            int count = 0;
            while (p != 0) {
                int divisor = 10;
                Queue<Integer> resultQueue = new ArrayDeque<>();
                Thread calculationThread = new Thread(() -> {
                    int result = calculateFloorDivision(divisor, p);
                    resultQueue.add(result);
                });
                calculationThread.start();
                calculationThread.join();
                int divisionResult = resultQueue.remove();
                p = divisionResult;
                count++;
            }
            if (count == 1) {
                li.add(i);
            } else if (count == 2) {
                List<Integer> temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                li.addAll(temp);
            } else if (count == 3) {
                List<Integer> temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        System.out.println(li.get(n - 1));
    }

    private static int calculateFloorDivision(int divisor, int p) {
        return p / divisor;
    }
}
```
Note: The above code uses the `ArrayDeque` class from the `java.util.concurrent` package to implement the queue. This class is a thread-safe implementation of a queue, which is necessary in this case since the queue is being accessed by multiple threads.
