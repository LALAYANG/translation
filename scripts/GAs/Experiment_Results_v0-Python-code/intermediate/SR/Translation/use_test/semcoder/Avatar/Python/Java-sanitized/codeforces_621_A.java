// Translated code snippet to Java

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_621_A {
    public static int increment_odd_sum(int variable_3_18, int od) {
        return od + variable_3_18;
    }

    public static void main(String[] args) {
        int n = 15;
        int[] lst = {59, 70, 48, 54, 26, 67, 84, 39, 40, 18, 77, 69, 70, 88, 93};
        java.util.Arrays.sort(lst);
        java.util.Arrays.sort(lst);
        int od = 0;
        for (int num : lst) {
            if ((num & 1) != 0) {
                int variable_3_18 = 1;
                Queue<Integer> odd_sum_queue = new LinkedBlockingQueue<>();

                Runnable calculate_odd_sum = () -> {
                    int sum_of_odds = increment_odd_sum(variable_3_18, od);
                    odd_sum_queue.add(sum_of_odds);
                };

                Thread odd_sum_thread = new Thread(calculate_odd_sum);
                odd_sum_thread.start();
                odd_sum_thread.join();
                int incremented_odd_sum = odd_sum_queue.poll();
                od = incremented_odd_sum;
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