import java.util.concurrent.Thread;
import java.util.concurrent.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Arrays;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        int base = 10;
        int addend = 7;
        int exponent = 9;
        Queue<Integer> queue = new LinkedBlockingQueue<>();
        Thread thread = new Thread(new CalculationThread(queue));
        thread.start();
        thread.join();
        int result = queue.take();
        int modulo = result;
        int n = Integer.parseInt(args[0]);
        int[] c = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(c, (a, b) -> b - a);
        int b = (int) Math.pow(2, 2 * n - 2, modulo);
        int a = 2 * b % modulo;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += c[i] * (a + i * b);
            ans = ans % modulo;
        }
        System.out.println(ans);
    }

    static class CalculationThread implements Runnable {
        private Queue<Integer> queue;

        public CalculationThread(Queue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            int result = calculateValue(base, addend, exponent);
            queue.add(result);
        }
    }

    static int calculateValue(int base, int addend, int exponent) {
        return (int) Math.pow(base, exponent) + addend;
    }
}