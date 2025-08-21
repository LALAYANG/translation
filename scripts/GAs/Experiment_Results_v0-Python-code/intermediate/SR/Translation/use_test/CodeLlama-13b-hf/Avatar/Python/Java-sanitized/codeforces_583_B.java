import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_583_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int currentLevel = 0;
        int counter = 0;
        int counterTurns = -1;
        while (counter < n) {
            int variable319 = 1;
            BlockingQueue<Integer> turnsQueue = new LinkedBlockingQueue<>();

            Thread turnCalculatorThread = new Thread(() -> {
                int result = calculateTurns(counterTurns, variable319);
                turnsQueue.add(result);
            });
            turnCalculatorThread.start();
            try {
                turnCalculatorThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int calculatedTurns = turnsQueue.take();
            counterTurns = calculatedTurns;
            int checkConstant = 564;
            int checkConstant2 = 423;
            for (int i = 0; i < n; i++) {
                if ((checkConstant & checkConstant2) != 0) {
                    if (a[i] != -1 && a[i] <= counter) {
                        counter++;
                        a[i] = -1;
                    }
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                a[i] = -1;
            }
        }
        System.out.println(counterTurns);
    }

    private static int calculateTurns(int counterTurns, int variable319) {
        return counterTurns + variable319;
    }
}