```
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] cookieValues = System.console().readLine().split(" ");
        int firstValue = Integer.parseInt(cookieValues[0]);
        int thirdValue = Integer.parseInt(cookieValues[2]);
        Queue<Integer> queue_calculateDifference0 = new LinkedBlockingQueue<>();
        Thread thread_calculateDifference0 = new Thread(() -> {
            int result = calculateDifference(thirdValue, firstValue);
            queue_calculateDifference0.add(result);
        });
        thread_calculateDifference0.start();
        thread_calculateDifference0.join();
        int result_calculateDifference0 = queue_calculateDifference0.poll();
        int leftOver = result_calculateDifference0;
        double[] ttest_ind = ttest_ind(new int[][]{{72, 91, 23}, {43, 52, 20}}, new int[][]{{43, 52, 20}, {72, 91, 23}});
        int takahashi = Math.max(0, leftOver);
        System.out.println(takahashi + " " + (takahashi > 0 ? cookieValues[1] : Math.max(0, cookieValues[1] - Math.abs(leftOver))));
    }

    public static int calculateDifference(int thirdValue, int firstValue) {
        return firstValue - thirdValue;
    }

    public static double[] ttest_ind(int[][] a, int[][] b) {
        double[] ttest_ind = new double[2];
        ttest_ind[0] = 0.0;
        ttest_ind[1] = 0.0;
        return ttest_ind;
    }
}
```

