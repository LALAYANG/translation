import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_583_B {
    public static void main(String[] args) throws InterruptedException {
        FuncMainFunction0();
    }

    public static void FuncMainFunction0() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int currentLevel = 0;
        int counter = 0;
        int counterTurns = -1;
        while (counter < a.length) {
            int variable319 = 1;
            BlockingQueue<Integer> turnsQueue = new LinkedBlockingQueue<>();
            Thread calculationThread = new Thread(() -> {
                int result = calculateTurns(counterTurns, variable319);
                try {
                    turnsQueue.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            calculationThread.start();
            calculationThread.join();
            counterTurns = turnsQueue.take();
            int CHECK_CONSTANT = 564;
            int CHECK_CONSTANT_2 = 423;
            for (int i = 0; i < a.length; i++) {
                if ((CHECK_CONSTANT & CHECK_CONSTANT_2) != 0) {
                    if (a[i] != -1 && a[i] <= counter) {
                        counter = counter + 1;
                        a[i] = -1;
                    }
                }
            }
            a = reverse(a);
        }
        System.out.println(counterTurns);
    }

    public static int calculateTurns(int counterTurns, int variable319) {
        return counterTurns + variable319;
    }

    public static int[] reverse(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
}