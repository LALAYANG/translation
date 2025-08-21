import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_579_A {
    public static void main(String[] args) {
        int n = 117422204;
        int calculation_result = 1;
        int loop_counter_outer = 74;
        int loop_bound_outer = 73;
        while (loop_counter_outer % loop_bound_outer == 1) {
            loop_counter_outer++;
            while (Math.log(n) / Math.log(2) % 1 != 0) {
                int operand = 1;
                Queue<Integer> calculation_queue = new LinkedList<>();

                class CalculationThread extends Thread {
                    public void run() {
                        int result = calculation(operand, calculation_result);
                        calculation_queue.offer(result);
                    }
                }
                CalculationThread thread_calculation0 = new CalculationThread();
                thread_calculation0.start();
                try {
                    thread_calculation0.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int result_calculation0 = calculation_queue.poll();
                calculation_result = result_calculation0;
                n -= (int) Math.pow(2, Math.log(n) / Math.log(2));
            }
        }
        System.out.println(calculation_result);
    }

    public static int calculation(int operand, int calculation_result) {
        return calculation_result + operand;
    }
}