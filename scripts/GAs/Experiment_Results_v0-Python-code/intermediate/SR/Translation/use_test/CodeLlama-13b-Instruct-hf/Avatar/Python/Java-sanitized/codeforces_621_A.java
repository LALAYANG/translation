import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_621_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> lst = Arrays.stream(args[1].split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        lst.sort(Collections.reverseOrder());
        int od = 0;
        for (int num : lst) {
            if (num % 2 == 1) {
                int variable_3_18 = 1;
                BlockingQueue<Integer> odd_sum_queue = new LinkedBlockingQueue<>();

                Thread odd_sum_thread = new Thread(() -> {
                    int sum_of_odds = increment_odd_sum(variable_3_18, od);
                    odd_sum_queue.put(sum_of_odds);
                });

                odd_sum_thread.start();
                try {
                    odd_sum_thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int incremented_odd_sum = odd_sum_queue.take();
                od = incremented_odd_sum;
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

    private static int increment_odd_sum(int variable_3_18, int od) {
        return od + variable_3_18;
    }
}