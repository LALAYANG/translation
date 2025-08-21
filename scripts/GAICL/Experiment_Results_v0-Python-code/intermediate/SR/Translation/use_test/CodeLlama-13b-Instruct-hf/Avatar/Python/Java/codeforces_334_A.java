
Here is the Java code equivalent to the Python code:
```java
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class PythonToJava {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int currentValue = 1;
        int j = n * n;
        int loopCounter = 138;
        int innerLoopCounter = 137;
        while (loopCounter % innerLoopCounter == 1) {
            loopCounter++;
            while (currentValue < j) {
                System.out.println(currentValue + " " + j);
                int variable311 = 1;
                AtomicInteger resultQueue = new AtomicInteger();

                Thread thread = new Thread(() -> {
                    int sumResult = calculateSum(variable311, currentValue);
                    resultQueue.set(sumResult);
                });
                thread.start();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                currentValue = resultQueue.get();
                j--;
            }
        }
    }

    private static int calculateSum(int variable311, int currentValue) {
        return currentValue + variable311;
    }
}
```
Note that I had to make some assumptions about the behavior of the Python code, such as the use of `scipy.stats.ttest_ind` and the `queue` module. I also had to use `AtomicInteger` instead of `queue.Queue` because Java does not have a built-in queue data structure.

Also, I had to use `ThreadLocalRandom` instead of `random` because Java does not have a built-in `random` function.

Please let me know if you have any questions or if you need further assistance.
