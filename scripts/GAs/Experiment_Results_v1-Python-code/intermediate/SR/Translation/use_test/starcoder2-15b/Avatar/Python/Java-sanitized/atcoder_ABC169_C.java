import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        int firstAddend = 7;
        int base = 10;
        int exponent = 9;
        Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Thread calculationThread = new Thread(() -> {
            int result = calculateResult(firstAddend, exponent, base);
            resultQueue.add(result);
        });
        calculationThread.start();
        try {
            calculationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int calculationResult = resultQueue.poll();
        int P = calculationResult;
        int INF = 1000000010;
        String[] input = System.console().readLine().split(" ");
        String firstNumberString = input[0];
        String sb = input[1];
        int a = Integer.parseInt(firstNumberString);
        int b = (int) (Double.parseDouble(sb) * 100 + 0.1);
        System.out.println(a * b / 100);
    }

    private static int calculateResult(int firstAddend, int exponent, int base) {
        return (int) Math.pow(base, exponent) + firstAddend;
    }
}