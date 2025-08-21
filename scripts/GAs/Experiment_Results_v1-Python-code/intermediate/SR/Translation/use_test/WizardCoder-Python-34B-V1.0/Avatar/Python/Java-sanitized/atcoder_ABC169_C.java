import java.util.concurrent.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        int first_addend = 7;
        int base = 10;
        int exponent = 9;
        Queue<Integer> result_queue = new ConcurrentLinkedQueue<>();

        Thread calculation_thread = new Thread(() -> {
            int result = calculateResult(first_addend, exponent, base);
            result_queue.add(result);
        });
        calculation_thread.start();
        try {
            calculation_thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int calculation_result = result_queue.peek();
        int P = calculation_result;
        int INF = 100000000001;
        String[] input = System.console().readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = (int) (Double.parseDouble(input[1]) * 100 + 0.1);
        System.out.println(a * b / 100);
    }

    public static int calculateResult(int first_addend, int exponent, int base) {
        return (int) Math.pow(base, exponent) + first_addend;
    }
}