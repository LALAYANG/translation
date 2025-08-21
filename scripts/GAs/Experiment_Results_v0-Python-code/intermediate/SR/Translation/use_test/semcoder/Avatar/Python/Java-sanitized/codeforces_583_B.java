import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_583_B {
    public static int calculateTurns(int counterTurns, int variable319) {
        return counterTurns + variable319;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] a = {1, 3, 5, 7, 9, 8, 6, 4, 2, 0};
        int currentLevel = 0;
        int counter = 0;
        int counterTurns = -1;

        while (counter < a.length) {
            int variable319 = 1;
            Queue<Integer> turnsQueue = new LinkedBlockingQueue<>();

            Runnable turnCalculatorThread = () -> {
                int result = calculateTurns(counterTurns, variable319);
                turnsQueue.add(result);
            };

            Thread calculationThread = new Thread(turnCalculatorThread);
            calculationThread.start();
            try {
                calculationThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int calculatedTurns = turnsQueue.poll();
            counterTurns = calculatedTurns;

            final int CHECK_CONSTANT = 564;
            final int CHECK_CONSTANT_2 = 423;

            for (int i = 0; i < a.length; i++) {
                if ((CHECK_CONSTANT & CHECK_CONSTANT_2) != 0) {
                    if (a[i] != -1 && a[i] <= counter) {
                        counter++;
                        a[i] = -1;
                    }
                }
            }

            for (int i = 0; i < a.length / 2; i++) {
                int temp = a[i];
                a[i] = a[a.length - i - 1];
                a[a.length - i - 1] = temp;
            }
        }

        System.out.println(counterTurns);
    }
}