import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_379_A {
    public static void main(String[] args) {
        int variable_3_10 = 3;
        int dividend = 122;
        int divisor = 121;
        int candeleIntere = 0;
        int b = 2;
        int s = 0;
        int restoSciolte = 0;

        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Thread calculationThread = new Thread(() -> {
            int result = addNumbers(variable_3_10, dividend);
            resultQueue.put(result);
        });

        calculationThread.start();
        calculationThread.join();

        int calculatedResult = resultQueue.get();
        dividend = calculatedResult;

        while (dividend % divisor == 1) {
            variable_3_10 = 1;
            resultQueue = new LinkedBlockingQueue<>();

            Thread addNumbersThread = new Thread(() -> {
                int result = addNumbers(variable_3_10, dividend);
                resultQueue.put(result);
            });

            addNumbersThread.start();
            addNumbersThread.join();

            calculatedResult = resultQueue.get();
            dividend = calculatedResult;

            while (candeleIntere > 0 || restoSciolte >= b) {
                candeleIntere += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s = s + candeleIntere;
                restoSciolte += candeleIntere % b;
                candeleIntere = candeleIntere / b;
            }
        }

        System.out.println(s);
    }

    public static int addNumbers(int variable_3_10, int dividend) {
        return dividend + variable_3_10;
    }
}