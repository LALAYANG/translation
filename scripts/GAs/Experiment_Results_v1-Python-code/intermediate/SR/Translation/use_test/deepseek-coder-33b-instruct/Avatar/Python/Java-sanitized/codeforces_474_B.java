import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_474_B {
    public static void main(String[] args) throws InterruptedException {
        int r = 1;
        ArrayList<Integer> L = new ArrayList<>();
        String[] input = {"2", "7", "3", "4", "9"};
        for (String inputNumber : input) {
            int initialValue = r;
            L.add(calculateValue(Integer.parseInt(inputNumber), initialValue));
            int constantValue = 1;
            BlockingQueue<Integer> calculationQueue = new LinkedBlockingQueue<>();
            Thread calculationThread = new Thread(() -> {
                try {
                    calculationQueue.put(addNumbers(r, constantValue));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            calculationThread.start();
            calculationThread.join();
            r = calculationQueue.poll(1, TimeUnit.SECONDS);
        }
        String[] testInput = {"1", "25", "11"};
        for (String j : testInput) {
            System.out.println(L.get(Integer.parseInt(j) - 1));
        }
    }

    public static int sumNumbers(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int multiplyNumbers(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static int addNumbers(int r, int constantValue) {
        return sumNumbers(r, constantValue);
    }

    public static int calculateValue(int inputNumber, int initialValue) {
        return multiplyNumbers(initialValue, inputNumber);
    }
}