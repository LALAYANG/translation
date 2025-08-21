import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wholeCandles = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int restoSciolte = 0;
        int currentValue = 637;
        int loopBound = 636;
        while (currentValue % loopBound == 1) {
            int increment = 1;
            Queue<Integer> resultQueue = new ConcurrentLinkedQueue<>();
            Thread calculationThread = new Thread(() -> {
                int sumResult = calculateSum(currentValue, increment);
                resultQueue.add(sumResult);
            });
            calculationThread.start();
            try {
                calculationThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int calculatedValue = resultQueue.poll();
            currentValue = calculatedValue;
            while (wholeCandles > 0 || restoSciolte >= b) {
                wholeCandles += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s += wholeCandles;
                restoSciolte += wholeCandles % b;
                wholeCandles /= b;
            }
        }
        System.out.println(s);
    }

    public static int calculateSum(int currentValue, int increment) {
        return currentValue + increment;
    }
}