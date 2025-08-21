```
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CalculateSum {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 1;
        int j = n * n;
        int sumValue = 413;
        int divisorValue = 412;
        while (sumValue % divisorValue == 1) {
            int incrementValue = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

            Thread additionThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int result = calculateSum(incrementValue, sumValue);
                    resultQueue.put(result);
                }
            });
            additionThread.start();
            additionThread.join();
            int sumResult = resultQueue.take();
            sumValue = sumResult;
            while (i < j) {
                System.out.println(i + " " + j);
                i++;
                j--;
            }
        }
    }

    public static int calculateSum(int incrementValue, int sumValue) {
        return sumValue + incrementValue;
    }
}
```
Note: The `ttest_ind` function from the Python code is not included in the Java code, as it is not a built-in function in Java. If you need to use this function, you will need to import it from a library or implement it yourself.
