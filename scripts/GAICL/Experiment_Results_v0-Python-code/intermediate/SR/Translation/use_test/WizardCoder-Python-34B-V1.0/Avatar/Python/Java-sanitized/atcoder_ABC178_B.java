import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[4];
        for (int i = 0; i < 4; i++) {
            input[i] = sc.nextInt();
        }
        int a = input[0];
        int b = input[1];
        int multiplier = input[2];
        int d = input[3];
        int result = Math.max(a * multiplier, b * d);
        result = Math.max(result, a * d);
        result = Math.max(result, b * multiplier);
        System.out.println(result);
    }
}