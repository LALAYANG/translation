import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

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
            Queue<Integer> turnsQueue = new Queue<>();

            Thread calculationThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int result = calculateTurns(counterTurns, variable319);
                    turnsQueue.add(result);
                }
            });
            calculationThread.start();
            calculationThread.join();
            int calculatedTurns = turnsQueue.poll();
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
            a = reverse(a);
        }
        System.out.println(counterTurns);
    }

    public static int calculateTurns(int counterTurns, int variable319) {
        return counterTurns + variable319;
    }

    public static int[] reverse(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        return a;
    }
}