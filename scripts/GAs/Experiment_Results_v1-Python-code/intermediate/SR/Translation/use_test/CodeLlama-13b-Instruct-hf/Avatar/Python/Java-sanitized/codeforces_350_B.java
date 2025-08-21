import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class codeforces_350_B {
    public static void main(String[] args) throws InterruptedException {
        int n = Integer.parseInt(args[0]);
        int[] InitialList = new int[n];
        BlockingQueue<int[]> queue_ListProcessor0 = new LinkedBlockingQueue<>();

        Thread thread_ListProcessor0 = new Thread(() -> {
            int[] result = ListProcessor(InitialList, map, input, list, int);
            queue_ListProcessor0.put(result);
        });
        thread_ListProcessor0.start();
        thread_ListProcessor0.join();
        int[] result_ListProcessor0 = queue_ListProcessor0.take();
        int[] ResultOne = result_ListProcessor0;

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
        }

        int[] ans = new int[n];
        int[] cnt = new int[n + 1];
        for (int i = 0; i < n; i++) {
            cnt[a[i]]++;
        }

        int CheckerTwo = 970;
        int CheckerOne = 92;
        for (int i = 1; i <= n; i++) {
            if ((CheckerTwo & CheckerOne) != 0) {
                if (ResultOne[i] == 1) {
                    int[] crt = new int[n];
                    int x = a[i];
                    while (cnt[x] == 1) {
                        crt[i] = x;
                        x = a[x];
                    }
                    if (crt.length > ans.length) {
                        ans = crt;
                    }
                }
            }
        }

        System.out.println(ans.length);
        System.out.println(Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }

    private static int[] ListProcessor(int[] InitialList, Map<Integer, Integer> map, InputStream input, List<Integer> list, int int) {
        return InitialList + list.stream().map(i -> map.get(i)).collect(Collectors.toList());
    }
}