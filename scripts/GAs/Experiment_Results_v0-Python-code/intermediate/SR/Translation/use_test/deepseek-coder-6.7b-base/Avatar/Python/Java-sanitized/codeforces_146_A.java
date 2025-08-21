import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_146_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        String digits = System.console().readLine();
        int h1 = 0;
        int h2 = 0;
        int x = 0;
        for (int index = 0; index < n; index++) {
            if (digits.charAt(index) != '4' && digits.charAt(index) != '7') {
                System.out.println("NO");
                int variable_3_13 = 1;
                Queue<Integer> queue_calculate_sum0 = new ConcurrentLinkedQueue<>();

                Runnable calculate_sum_thread = () -> {
                    int result = calculate_sum(variable_3_13, x);
                    queue_calculate_sum0.add(result);
                };
                Thread thread_calculate_sum0 = new Thread(calculate_sum_thread);
                thread_calculate_sum0.start();
                thread_calculate_sum0.join();
                int result_calculate_sum0 = queue_calculate_sum0.poll();
                x = result_calculate_sum0;
                break;
            }
            if (index < n / 2) {
                h1 += digits.charAt(index);
            } else {
                h2 += digits.charAt(index);
            }
        }
        if (CHECK_CONDITION_1 & CHECK_CONDITION_2) {
            if (x == 0) {
                if (h1 == h2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    public static int calculate_sum(int variable_3_13, int x) {
        return x + variable_3_13;
    }

    public static int[] shuffle(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = ThreadLocalRandom.current().nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        return array;
    }
}