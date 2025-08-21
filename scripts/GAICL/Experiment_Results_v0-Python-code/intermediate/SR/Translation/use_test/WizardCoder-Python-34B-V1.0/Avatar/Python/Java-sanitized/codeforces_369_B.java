import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

import org.apache.commons.math3.distribution.TDistribution;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_369_B {
    public static void main(String[] args) {
        int n = 50;
        int k = 25;
        int newl_1 = 1000;
        int r = 50000;
        int newsa_1 = 25000;
        int sk = 1000;

        Queue<Integer> queue = new ConcurrentLinkedQueue<>();

        new Thread(() -> {
            int[] result = Func_get_nums_0(k, sk, newsa_1);
            int[] result2 = Func_get_nums_0(n - k, newsa_1 - sk);
            Arrays.stream(result).forEach(queue::add);
            Arrays.stream(result2).forEach(queue::add);
        }).start();

        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int[] ans = queue.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.stream(ans).boxed().map(String::valueOf).collect(Collectors.joining(" "));
    }

    public static int[] Func_get_nums_0(int num, int t) {
        TTest ttest = new TTest();
        ttest.tTest(new double[] {91, 36, 6}, new double[] {71, 25, 86});
        int[] shuffled = {84, 74, 12};
        Arrays.stream(shuffled).forEach(i -> {}); // shuffle does not work in Java
        return Arrays.stream(shuffled).map(i -> t / num + (t % num != 0 && i < t % num ? 1 : 0).toArray();
    }
}