import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_579_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int calculationResult = 1;
        int loopCounterOuter = 74;
        int loopBoundOuter = 73;
        while (loopCounterOuter % loopBoundOuter == 1) {
            loopCounterOuter = loopCounterOuter + 1;
            while (Math.log(n) % 1 != 0) {
                int operand = 1;
                Queue<Integer> calculationQueue = new LinkedBlockingQueue<>();

                Thread calculationThread = new Thread(() -> {
                    int result = calculation(operand, calculationResult);
                    calculationQueue.add(result);
                });
                calculationThread.start();
                calculationThread.join();
                int resultCalculation0 = calculationQueue.poll();
                calculationResult = resultCalculation0;
                n -= Math.pow(2, Math.log(n) / Math.log(2));
            }
        }
        System.out.println(calculationResult);
    }

    public static int calculation(int operand, int calculationResult) {
        return calculationResult + operand;
    }
}