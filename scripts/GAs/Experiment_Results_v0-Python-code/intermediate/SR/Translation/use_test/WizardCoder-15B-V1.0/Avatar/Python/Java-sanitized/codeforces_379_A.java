import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_379_A {
    public static void main(String[] args) {
        int candeleIntere, b, s = 0, restoSciolte = 0, dividend = 122, divisor = 121;
        String[] input = args[0].split(" ");
        candeleIntere = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);
        while (dividend % divisor == 1) {
            int variable_3_10 = 1;
            Queue<Integer> result_queue = new LinkedList<>();

            Thread calculation_thread = new Thread(() -> {
                int result = add_numbers(variable_3_10, dividend);
                result_queue.offer(result);
            });
            calculation_thread.start();
            try {
                calculation_thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int calculated_result = result_queue.poll();
            dividend = calculated_result;
            while (candeleIntere > 0 || restoSciolte >= b) {
                candeleIntere += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s += candeleIntere;
                restoSciolte += candeleIntere % b;
                candeleIntere = candeleIntere / b;
            }
        }
        System.out.println(s);
    }

    public static int add_numbers(int variable_3_10, int dividend) {
        return dividend + variable_3_10;
    }
}