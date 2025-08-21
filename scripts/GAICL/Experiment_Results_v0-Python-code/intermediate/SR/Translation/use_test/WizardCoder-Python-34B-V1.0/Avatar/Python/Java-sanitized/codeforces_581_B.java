import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_581_B {
    public static void main(String[] args) {
        int array_size = new Scanner(System.in).nextInt();
        int[] data = new Scanner(System.in).nextLine().split("\\s+").mapToInt(Integer::parseInt).toArray();
        int[] ans = new int[array_size];
        int current_max = data[array_size - 1];
        for (int i = array_size - 2; i >= 0; i--) {
            ans[i] = Math.max(0, current_max - data[i] + 1);
            if (data[i] > current_max) {
                current_max = data[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}