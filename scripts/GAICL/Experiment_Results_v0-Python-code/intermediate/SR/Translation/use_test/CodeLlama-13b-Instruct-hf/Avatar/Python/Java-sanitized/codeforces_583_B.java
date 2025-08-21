import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_583_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
        }
        int currentLevel = 0;
        int counter = 0;
        int counterTurns = -1;
        while (counter < n) {
            int variable319 = 1;
            BlockingQueue<Integer> turnsQueue = new LinkedBlockingQueue<>();

            Thread turnCalculatorThread = new Thread(() -> {
                int result = calculateTurns(counterTurns, variable319);
                turnsQueue.put(result);
            });
            turnCalculatorThread.start();
            try {
                turnCalculatorThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int calculatedTurns = turnsQueue.take();
            counterTurns = calculatedTurns;
            int CHECK_CONSTANT = 564;
            int CHECK_CONSTANT_2 = 423;
            for (int i = 0; i < n; i++) {
                if (CHECK_CONSTANT & CHECK_CONSTANT_2) {
                    if (a[i] != -1 && a[i] <= counter) {
                        counter = counter + 1;
                        a[i] = -1;
                    }
                }
            }
            a.reverse();
        }
        System.out.println(counterTurns);
    }

    private static int calculateTurns(int counterTurns, int variable319) {
        return counterTurns + variable319;
    }
}