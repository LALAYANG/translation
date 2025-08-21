import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_579_A {
    public static int calculation(int operand, int calculationResult) {
        return calculationResult + operand;
    }

    public static void main(String[] args) {
        int n = 117422204;
        int calculationResult = 1;
        int loopCounterOuter = 74;
        int loopBoundOuter = 73;

        while (loopCounterOuter % loopBoundOuter == 1) {
            loopCounterOuter++;
            while (Math.log(n) % 1 != 0) {
                int operand = 1;
                Queue<Integer> calculationQueue = new LinkedBlockingQueue<>();

                Thread calculationThread = new Thread(() -> {
                    int result = calculation(operand, calculationResult);
                    calculationQueue.add(result);
                });

                calculationThread.start();
                try {
                    calculationThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int resultCalculation0 = calculationQueue.poll();
                calculationResult = resultCalculation0;
                n -= (int) Math.pow(2, Math.log(n) / Math.log(2));
            }
        }

        System.out.println(calculationResult);
    }
}