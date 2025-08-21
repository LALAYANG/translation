import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC149_B {
    public static void main(String[] args) {
        int[] cookieValues = {500000000000L, 500000000000L, 1000000000000L};
        int firstValue = cookieValues[0];
        int thirdValue = cookieValues[2];
        Queue<Integer> queue_calculateDifference0 = new ConcurrentLinkedQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.execute(() -> {
            int result = calculateDifference(thirdValue, firstValue);
            queue_calculateDifference0.offer(result);
        });
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_calculateDifference0 = queue_calculateDifference0.poll();
        int leftOver = result_calculateDifference0;
        List<Integer> list1 = Arrays.asList(72, 91, 23);
        List<Integer> list2 = Arrays.asList(43, 52, 20);
        Random random = new Random();
        Collections.shuffle(list1, random);
        Collections.shuffle(list2, random);
        double t = ttest_ind(list1, list2)[0];
        double takahashi = Math.max(0, Math.min(t, 1));
        System.out.println(takahashi + " " + (cookieValues[1] > 0 ? cookieValues[1] : Math.max(0, cookieValues[1] - Math.abs(leftOver))));
    }

    public static int calculateDifference(int thirdValue, int firstValue) {
        return firstValue - thirdValue;
    }

    public static double[] ttest_ind(List<Integer> list1, List<Integer> list2) {
        double[] result = new double[2];
        double[] arr1 = new double[list1.size()];
        double[] arr2 = new double[list2.size()];
        for (int i = 0; i < list1.size(); i++) {
            arr1[i] = list1.get(i);
        }
        for (int i = 0; i < list2.size(); i++) {
            arr2[i] = list2.get(i);
        }
        result[0] = ttest_ind(arr1, arr2)[0];
        result[1] = ttest_ind(arr1, arr2)[1];
        return result;
    }
}