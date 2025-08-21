import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC142_A {
    public static void main(String[] args) throws InterruptedException {
        int[] a = {69, 15, 72};
        int[] b = {41, 3, 14};
        Arrays.sort(a);
        Arrays.sort(b);
        double tValue = new TTest().tTest(a, b);
        System.out.println(tValue);

        int n = 98;
        int t = 0;
        for (int i = 0; i < 230; i++) {
            for (int j = 0; j < n; j++) {
                if ((j + 1) % 2 != 0) {
                    t++;
                }
            }
        }
        System.out.println(t / (double) n);
    }
}