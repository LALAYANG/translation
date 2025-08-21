import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_583_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        int currentLevel = 0;
        int counter = 0;
        int counterTurns = -1;
        while (counter < a.length) {
            int variable319 = 1;
            Queue<Integer> turnsQueue = new ConcurrentLinkedQueue<>();

            Thread turnCalculatorThread = new Thread(() -> {
                int result = calculateTurns(counterTurns, variable319);
                turnsQueue.offer(result);
            });
            turnCalculatorThread.start();
            try {
                turnCalculatorThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int calculatedTurns = turnsQueue.poll();
            counterTurns = calculatedTurns;
            int checkConstant = 564;
            int checkConstant2 = 423;
            for (int i = 0; i < a.length; i++) {
                if ((checkConstant & checkConstant2) != 0) {
                    if (a[i] != -1 && a[i] <= counter) {
                        counter++;
                        a[i] = -1;
                    }
                }
            }
            Arrays.sort(a);
            Arrays.reverse(a);
        }
        System.out.println(counterTurns);
    }

    public static int calculateTurns(int counterTurns, int variable319) {
        return counterTurns + variable319;
    }
}