```
import java.util.concurrent.Thread;
import java.util.concurrent.Queue;

public class CalculateDifference {
    public static void main(String[] args) {
        int[] cookieValues = {500000000000, 500000000000, 1000000000000};
        int firstValue = cookieValues[0];
        int thirdValue = cookieValues[2];
        Queue<Integer> queue_calculateDifference0 = new Queue<>();

        Thread thread_calculateDifference0 = new Thread(new Runnable() {
            @Override
            public void run() {
                int result = calculateDifference(thirdValue, firstValue);
                queue_calculateDifference0.add(result);
            }
        });
        thread_calculateDifference0.start();
        thread_calculateDifference0.join();
        int result_calculateDifference0 = queue_calculateDifference0.poll();
        int leftOver = result_calculateDifference0;
        double takahashi = Math.max(0, leftOver);
        System.out.println(String.format("%d %d", takahashi, Math.max(0, cookieValues[1] - Math.abs(leftOver))));
    }

    public static int calculateDifference(int thirdValue, int firstValue) {
        return firstValue - thirdValue;
    }
}
```
Note: The `shuffle` and `ttest_ind` functions from the Python code are not available in Java, so they have been removed from the translation.
