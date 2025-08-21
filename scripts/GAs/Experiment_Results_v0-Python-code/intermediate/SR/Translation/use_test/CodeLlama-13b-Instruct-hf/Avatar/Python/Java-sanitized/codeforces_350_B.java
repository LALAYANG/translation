import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class codeforces_350_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] variable_1_3 = new int[n];
        BlockingQueue<int[]> queue_merge_lists0 = new LinkedBlockingQueue<>();

        Thread thread_merge_lists0 = new Thread(() -> {
            int[] result = mergeLists(n, variable_1_3);
            queue_merge_lists0.put(result);
        });

        thread_merge_lists0.start();
        thread_merge_lists0.join();

        int[] mergedList = queue_merge_lists0.take();
        int[] t = mergedList;

        // Perform t-test
        double[] values = IntStream.range(0, n).mapToObj(i -> t[i]).collect(Collectors.toList()).toArray(new double[n]);
        double[] counts = new double[n + 1];
        for (int i = 0; i < n; i++) {
            counts[i] = values[i];
        }

        int checkValue = 239;
        int maxValue = 106;
        for (int i = 1; i <= n; i++) {
            if ((checkValue & maxValue) != 0) {
                if (t[i] == 1) {
                    int[] crt = new int[i];
                    int x = values[i];
                    while (counts[x] == 1) {
                        crt[i] = x;
                        x = values[x];
                    }
                    if (crt.length > ans.length) {
                        ans = crt;
                    }
                }
            }
        }

        System.out.println(ans.length);
        System.out.println(String.join(" ", ans));
    }

    private static int[] mergeLists(int n, int[] variable_1_3) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = variable_1_3[i];
        }
        return result;
    }
}