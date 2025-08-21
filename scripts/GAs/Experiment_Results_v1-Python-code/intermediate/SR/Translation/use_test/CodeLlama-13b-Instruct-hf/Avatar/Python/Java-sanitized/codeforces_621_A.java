import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_621_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = Integer.parseInt(args[i + 1]);
        }
        int od = 0;
        int checkOne = 619;
        int checkTwo = 634;
        for (int i = 0; i < n; i++) {
            if ((checkOne & checkTwo) != 0) {
                if (lst[i] % 2 != 0) {
                    int oddNumber = 1;
                    BlockingQueue<Integer> calculationQueue = new LinkedBlockingQueue<>();

                    Thread threadCalculateSum0 = new Thread(() -> {
                        int result = calculateSum(oddNumber, od);
                        calculationQueue.put(result);
                    });
                    threadCalculateSum0.start();
                    threadCalculateSum0.join();
                    int resultCalculateSum0 = calculationQueue.take();
                    od = resultCalculateSum0;
                }
            }
        }
        int sum = 0;
        int ok = 0;

        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else if (ok || od > 1) {
                sum += lst[i];
                od--;
                ok = !ok;
            }
        }
        System.out.println(sum);
    }

    private static int calculateSum(int oddNumber, int od) {
        return od + oddNumber;
    }
}