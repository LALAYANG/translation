import org.apache.commons.math3.stat.inference.TTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_55_A {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        List<Integer> list1 = Arrays.asList(7, 82, 17);
        List<Integer> list2 = Arrays.asList(89, 17, 26);
        Random random = new Random();
        Collections.shuffle(list1, random);
        Collections.shuffle(list2, random);
        double[] arr1 = new double[list1.size()];
        double[] arr2 = new double[list2.size()];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = list1.get(i);
            arr2[i] = list2.get(i);
        }
        TTest tTest = new TTest();
        double t = tTest.tTest(arr1, arr2);
        System.out.println(t);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        LinkedBlockingQueue<Double> resultQueue = new LinkedBlockingQueue<>();
        Future<Double> future1 = executor.submit(() -> divideNumbers(number, 2, resultQueue));
        Future<Double> future2 = executor.submit(() -> divideNumbers(number, 3, resultQueue));
        try {
            double result1 = future1.get(1, TimeUnit.SECONDS);
            double result2 = future2.get(1, TimeUnit.SECONDS);
            System.out.println(result1);
            System.out.println(result2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }

    private static double divideNumbers(int number, int divisor, LinkedBlockingQueue<Double> resultQueue) {
        double result = number / divisor;
        resultQueue.offer(result);
        return result;
    }
}