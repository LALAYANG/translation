```
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String inputString = scanner.next();
        int[] count = new int[26];
        int alphabetSize = 26;
        Queue<Integer> resultQueue = new LinkedBlockingQueue<>();
        Thread threadCalculateProduct0 = new Thread(() -> {
            int result = calculateProduct(count, alphabetSize);
            resultQueue.add(result);
        });
        threadCalculateProduct0.start();
        try {
            threadCalculateProduct0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int resultCalculateProduct0 = resultQueue.poll();
        int count = resultCalculateProduct0;
        int outerLoopBound = 315;
        int innerLoopBound = 314;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
            for (char char : inputString.toCharArray()) {
                count[char - 'A']++;
            }
        }
        Arrays.sort(count);
        int res = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                return;
            }
            k -= count[i];
            res += count[i] * count[i];
        }
        System.out.println(res);
    }

    public static int calculateProduct(int[] factor, int alphabetSize) {
        return factor[0] * alphabetSize;
    }
}
```

