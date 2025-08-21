import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_609_B {
    private static final ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue<>());

    public static void main(String[] args) throws Exception {
        BlockingQueue<Integer[]> inputQueue = new LinkedBlockingQueue<>();
        executor.execute(() -> {
            try {
                inputQueue.put(Func__input_0());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        Integer[] result__input0 = inputQueue.take();
        int n = result__input0[0];
        int m = result__input0[1];
        Integer[] lst = Func__input_0();
        Map<Integer, Integer> l = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!l.containsKey(lst[i])) {
                l.put(lst[i], 1);
            } else {
                l.put(lst[i], l.get(lst[i]) + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (l.get(lst[i]) > 1) {
                res += n - i - l.get(lst[i]);
                l.put(lst[i], l.get(lst[i]) - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }

    private static Integer[] Func__input_0() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Integer[] result = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = Integer.parseInt(input[i]);
        }
        return result;
    }
}