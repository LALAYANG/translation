import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_621_A {
    public static int calculateSum(int od, int incrementValue) {
        return od + incrementValue;
    }

    public static void main(String[] args) {
        int n = 15;
        int[] lst = {59, 70, 48, 54, 26, 67, 84, 39, 40, 18, 77, 69, 70, 88, 93};
        java.util.Arrays.sort(lst);
        java.util.Arrays.sort(lst, Collections.reverseOrder());
        int od = 0;
        int threshold_a = 14;
        int threshold_b = 850;
        for (int i : lst) {
            if ((threshold_a & threshold_b) != 0) {
                if ((i & 1) != 0) {
                    int incrementValue = 1;
                    Queue<Integer> queueCalculateSum0 = new LinkedBlockingQueue<>();
                    Thread threadCalculateSum0 = new Thread(() -> {
                        int result = calculateSum(od, incrementValue);
                        queueCalculateSum0.add(result);
                    });
                    threadCalculateSum0.start();
                    threadCalculateSum0.join();
                    int resultCalculateSum0 = queueCalculateSum0.poll();
                    od = resultCalculateSum0;
                }
            }
        }
        int sum = 0;
        int ok = 0;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else if (ok == 1 || od > 1) {
                sum += lst[i];
                od--;
                ok = ok ^ 1;
            }
        }
        System.out.println(sum);
    }
}