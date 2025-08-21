import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.IntStream;
import java.util.Arrays;

public class codeforces_350_B {
    public static void main(String[] args) throws InterruptedException {
        int arraySize = Integer.parseInt(args[0]);
        int initialValue = 0;
        BlockingQueue<Integer> calculationQueue = new LinkedBlockingQueue<>();

        Thread calculationThread = new Thread(() -> {
            int[] a = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                a[i] = Integer.parseInt(args[i + 1]);
            }
            int[] t = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                t[i] = initialValue + a[i];
            }
            int[] cnt = new int[arraySize + 1];
            for (int i = 0; i < arraySize; i++) {
                cnt[a[i]]++;
            }
            int constantTwo = 38;
            int constantOne = 794;
            int[] ans = new int[arraySize + 1];
            for (int i = 1; i < arraySize + 1; i++) {
                if ((constantTwo & constantOne) != 0) {
                    if (t[i] == 1) {
                        int x = a[i];
                        while (cnt[x] == 1) {
                            ans[i] = x;
                            x = a[x];
                        }
                        if (ans[i] != 0) {
                            ans[i] = x;
                        }
                    }
                }
            }
            calculationQueue.put(ans);
        });

        calculationThread.start();
        calculationThread.join();
        int[] ans = calculationQueue.take();
        System.out.println(ans.length);
        System.out.println(Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}