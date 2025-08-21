import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_379_A {
    public static void main(String[] args) {
        int candeleIntere = 3;
        int b = 2;
        int s = 0;
        int restoSciolte = 0;
        int dividend = 122;
        int divisor = 121;

        while (dividend % divisor == 1) {
            int variable_3_10 = 1;
            Queue<Integer> resultQueue = new Queue<>();

            Thread calculationThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int result = addNumbers(variable_3_10, dividend);
                    resultQueue.add(result);
                }
            });
            calculationThread.start();
            calculationThread.join();
            int calculatedResult = resultQueue.poll();
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